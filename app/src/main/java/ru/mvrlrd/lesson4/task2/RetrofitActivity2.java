package ru.mvrlrd.lesson4.task2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ru.mvrlrd.lesson4.R;

//Создать RetorfitActivity.
// В активити получить строчку с https://api.github.com/users/JakeWharton
// и отобразить аватарку по avatar_url.
// Использовать библиотеку retorift.
public class RetrofitActivity2 extends AppCompatActivity {
@BindView(R.id.imageView)
    protected ImageView imageView;
    private RetrofitPresenter retrofitPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        retrofitPresenter = new RetrofitPresenter();
        retrofitPresenter.getString();
    }

        @OnClick(R.id.button)
        public void onClickButton(){
                 Picasso
                    .get()
                    .load(retrofitPresenter.getUrl())
                    .into(imageView);
    }

}
