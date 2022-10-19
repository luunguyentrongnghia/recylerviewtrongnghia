package category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtrongnghia.R;

import java.util.List;

import phone.PhoneAdapter;

public class CategpryAdapter extends RecyclerView.Adapter<CategpryAdapter.CategoryViewHolder>{
    private Context mContext;
    private List<Category>mListCategory;

    public CategpryAdapter(Context mContext) {
        this.mContext = mContext;

    }
    public void setData(List<Category>list){
        this.mListCategory=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,parent,false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Category category = mListCategory.get(position);
        if(category == null){
            return;
        }
        holder.tvNmaecategory.setText(category.getNamecategory());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false);
        holder.rcvPhone.setLayoutManager(linearLayoutManager);
        PhoneAdapter phoneAdapter = new PhoneAdapter();
        phoneAdapter.setData(category.getPhone());
        holder.rcvPhone.setAdapter(phoneAdapter);
    }

    @Override
    public int getItemCount() {
        if(mListCategory!=null){
            return mListCategory.size();
        }
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNmaecategory;
        private RecyclerView rcvPhone;
        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNmaecategory = itemView.findViewById(R.id.tv_name_category);
            rcvPhone = itemView.findViewById(R.id.rcv_phone);
        }
    }
}
