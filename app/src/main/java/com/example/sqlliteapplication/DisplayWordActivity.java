package com.example.sqlliteapplication;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import helper.MyHelper;
import model.Word;

public class DisplayWordActivity extends AppCompatActivity {

    private ListView lstWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_word);
        lstWord = findViewById(R.id.lstWords);
        loadWord();
    }

    private void loadWord() {
        final MyHelper myHelper = new MyHelper(this);
        final SQLiteDatabase sqLiteDatabase = myHelper.getWritableDatabase();

        List<Word> wordList = new ArrayList<>();
        wordList = myHelper.g
    }
}
