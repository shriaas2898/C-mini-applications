package com.example.shriaas.imageslideshow;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button next,bw;
    ImageView iv;
    int image_no=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ColorMatrix matrix = new ColorMatrix();
        matrix.setSaturation(0);
        final ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
        matrix.setSaturation(1);
        final ColorMatrixColorFilter filter1 = new ColorMatrixColorFilter(matrix);
        next = findViewById(R.id.next);
    iv = findViewById(R.id.imageView);
    next.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (image_no){
                case 1:
                {
                    image_no++;
                    iv.setImageResource(R.drawable.img2);
                }break;
                case 2:
                {
                    image_no++;
                    iv.setImageResource(R.drawable.img3);
                }break;
                case 3:
                {
                    image_no++;
                    iv.setImageResource(R.drawable.img4);
                }break;
                case 4:
                {
                    image_no++;
                    iv.setImageResource(R.drawable.img5);
                }break;
                case 5:
                {
                    image_no=1;
                    iv.setImageResource(R.drawable.img1);
                }break;
            }
            iv.setColorFilter(filter1);
        }
    });
    bw = findViewById(R.id.bw);

    bw.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            iv.setColorFilter(filter);
        }
    });
    }
}
