package ru.mvrlrd.lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


//Создать GsonActivity.
// В активити распарсить json-строчку в класс {"time_of_year": "summer", "year": 2019}
// с помощью Gson.
// Вывести в лог поля получившегося класса.

//Создать RetrofitActivity.
// В активити получить строчку с https://api.github.com/users/JakeWharton
// и отобразить аватарку по avatar_url.
// Использовать библиотеку retrofit.
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new GsonBuilder().create();

    }

    public void onClick(){
        Log.d()
    }
}
