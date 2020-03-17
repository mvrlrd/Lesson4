package ru.mvrlrd.lesson4.task1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyCalendar {

   @Expose
   @SerializedName("time_of_year")
   public String season;
   @Expose
   public String year;
}
