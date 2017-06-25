package com.example.kamonwan.comment.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.kamonwan.comment.R;
import com.example.kamonwan.comment.adapter.RecyclerViewAdapter;
import com.example.kamonwan.comment.model.Comment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    Button button;
    EditText editText;
    List<Comment> commentList;

    List<String> listName = new ArrayList<>();
    List<String> listDate = new ArrayList<>();
    List<String> listComment = new ArrayList<>();
    List<Integer> listImage = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        commentList.add(new Comment("Espresso", "20/02/17", "เอสเพรสโซ่",R.drawable.user));
        commentList.add(new Comment("Latte", "20/02/17", "ลาเต้", R.drawable.user));
        commentList.add(new Comment("Cappuccino", "20/02/17", "คาปูชิโน่", R.drawable.user));




        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this,commentList);
        recyclerView.setAdapter(recyclerViewAdapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textMessage = editText.getText().toString();
                commentList.add(new Comment("Walee", "13/06/17", textMessage, R.drawable.user));
                recyclerViewAdapter.updateComment(commentList);

            }
        });
    }

    private void init(){
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        button = (Button) findViewById(R.id.btnSubmit);
        editText = (EditText) findViewById(R.id.editText);

        commentList = new ArrayList<>();
    }
}
