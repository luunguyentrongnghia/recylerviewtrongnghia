package com.example.recyclerviewtrongnghia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import category.Category;
import category.CategpryAdapter;
import phone.Phone;

public class MainActivity extends AppCompatActivity {
private RecyclerView rcvCategory;
private CategpryAdapter categpryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvCategory = findViewById(R.id.rcv_category);
        categpryAdapter=new CategpryAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categpryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categpryAdapter);
    }
    private List<Category>getListCategory(){
        List<Category>listCategory = new ArrayList<>();
        List<Phone>listphone = new ArrayList<>();
        listphone.add(new Phone(R.drawable.img_introip2,"phone"));
        listphone.add(new Phone(R.drawable.img_introip3,"phone"));
        listphone.add(new Phone(R.drawable.img_introip4,"phone"));
        listphone.add(new Phone(R.drawable.img_introip_1,"phone"));

        listphone.add(new Phone(R.drawable.img_intross1,"phone"));
        listphone.add(new Phone(R.drawable.img_intross2,"phone"));
        listphone.add(new Phone(R.drawable.img_intross3,"phone"));
        listphone.add(new Phone(R.drawable.img_introxm1,"phone"));

        listCategory.add(new Category("category1",listphone));
        listCategory.add(new Category("category2",listphone));
        listCategory.add(new Category("category3",listphone));
        return listCategory;
    }
}