package phone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerviewtrongnghia.R;

import java.util.List;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.PhoneViewHolder> {
    private List<Phone>mPhones;
    public void setData(List<Phone> list){
          this.mPhones=list;
          notifyDataSetChanged();
    }
    @NonNull
    @Override
    public PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_phone,parent,false);
        return new PhoneViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneViewHolder holder, int position) {
        Phone phone = mPhones.get(position);
        if (phone==null){
            return;
        }
        holder.imgPhone.setImageResource(phone.getResourceid());
        holder.tvTitle.setText(phone.getTitle());
    }

    @Override
    public int getItemCount() {
        if (mPhones != null){
            return mPhones.size();
        }
        return 0;
    }

    public class PhoneViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgPhone;
        private TextView   tvTitle;
        public PhoneViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhone = itemView.findViewById((R.id.img_phone));
            tvTitle = itemView.findViewById((R.id.tv_title));
        }
    }
}
