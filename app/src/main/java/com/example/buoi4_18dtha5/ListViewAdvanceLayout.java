package com.example.buoi4_18dtha5;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.buoi4_18dtha5.Adapter.StudentAdapter;
import com.example.lib.Modle.StudentModle;

public class ListViewAdvanceLayout extends AppCompatActivity {
    ListView listviewAdvance;
    StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_advance_layout);
        listviewAdvance = findViewById(R.id.listviewAdvance);
        studentAdapter = new StudentAdapter(ListViewAdvanceLayout.this, R.layout.studentitem);
        studentAdapter.add(new StudentModle("Nguyễn Văn A", "1811067890", "123456789", R.drawable.nq));
        studentAdapter.add(new StudentModle("Nguyễn Văn B", "1811067891", "123456789", R.drawable.nq3));
        studentAdapter.add(new StudentModle("Nguyễn Văn C", "1811067892", "123456789", R.drawable.nq3));
        listviewAdvance.setAdapter(studentAdapter);
    }
}