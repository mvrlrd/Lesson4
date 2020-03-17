package ru.mvrlrd.lesson4.task2;

import android.util.Log;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class RetrofitPresenter {
    private RetrofitApi retrofitApi;
    private String url;


    public RetrofitPresenter(){
         retrofitApi = new RetrofitApi();

     }

     public void getString(){
         Observable<User> observable = retrofitApi.requestServer();

         Disposable disposable = observable.observeOn(AndroidSchedulers.mainThread()).subscribe(string -> {
             Log.d("Pres ", "onNext " + string.getAvatar_url());
            url = string.getAvatar_url();
         }, throwable -> {
             Log.e("Pres ","onError");
         });
     }

    public String getUrl() {
        return url;
    }
}
