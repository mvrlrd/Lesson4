package ru.mvrlrd.lesson4.task1;

import androidx.appcompat.app.AppCompatActivity;
import ru.mvrlrd.lesson4.R;
import android.os.Bundle;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


//Создать GsonActivity.
// В активити распарсить json-строчку в класс {"time_of_year": "summer", "year": 2019}
// с помощью Gson.
// Вывести в лог поля получившегося класса.

public class MainActivity extends AppCompatActivity {
    MyCalendar myCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        String json = "{\n"+
                "\"time_of_year\": \"summer\",\n"+
                "\"year\": 2019\n" +
                "}";
        Gson gson = new GsonBuilder().create();
        myCalendar = gson.fromJson(json,MyCalendar.class);
        Log.d("TASK 1: ", myCalendar.season);

    }

    }
