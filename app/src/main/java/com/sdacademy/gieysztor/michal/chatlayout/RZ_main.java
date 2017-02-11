//package com.sdacademy.gieysztor.michal.chatlayout;
//
//
//import android.animation.StateListAnimator;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.Color;
//import android.graphics.drawable.Drawable;
//import android.media.MediaPlayer;
//import android.os.Build;
//import android.support.annotation.RequiresApi;
//import android.support.v4.content.ContextCompat;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.support.v7.content.res.AppCompatResources;
//import android.text.Editable;
//import android.text.TextWatcher;
//import android.view.Gravity;
//import android.view.LayoutInflater;
//import android.view.MotionEvent;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//
//import static android.content.Context.LAYOUT_INFLATER_SERVICE;
//
///**
// * Created by RENT on 2017-02-11.
// */
//
//public class RZ_main {
//
//
//    private LinearLayout linearLayout;
//    private TextView msgTextView;
//    private Drawable myMsgBackground;
//    private int textPadding;
//    private LayoutInflater inflater;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_chat);
//
//        linearLayout = (LinearLayout) findViewById(R.id.conversationLinearLayout);
//        msgTextView = (TextView) findViewById(R.id.msgText);
//        myMsgBackground = ContextCompat.getDrawable(this, R.drawable.my_whale_msg);
//        textPadding = getResources().getDimensionPixelSize(R.dimen.medium_padding);
//        inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
//
///*
//
//        Drawable drawable = AppCompatResources.getDrawable(this, R.drawable.ic_drawable);
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
//        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.dubstep);
//        int dimensionPixelValue = getResources().getDimensionPixelSize(R.dimen.medium_padding);
//        int color = ContextCompat.getColor(this, R.color.colorAccent);
//        String[] stringArray = getResources().getStringArray(R.array.strings);
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.image);
//        Bitmap localBitmap = BitmapFactory.decodeFile("/sdcard/test2.png");
//
//
//        float floatFromZeroToOne = 0.5f;
//        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(dimensionPixelValue, dimensionPixelValue);
//
//        View view = new View(this);
//        view.setVisibility(View.GONE);                      //ustawienie widoczności
//        view.setBackgroundColor(Color.RED);                 //kolor tła NIE R.COLOR.IDCOL!
//        view.setBackground(drawable);                       //drawable na tło
//        view.setBackgroundResource(R.drawable.ic_drawable); //drawable na tło
//        view.startAnimation(animation);                     //natychmiostowe uruchomienie animacji
//        view.setMinimumHeight(dimensionPixelValue);         //minimalna wysokość - zalecane dp
//        view.setMinimumWidth(dimensionPixelValue);          //minimalna szerokość - zalecane dp
//        view.setAlpha(floatFromZeroToOne);                  //ustawienie przeźroczystości
//        view.invalidate();                                  //wymuszenie odświeżenia View
//
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        }); //słuchacz na kliknięcie
//        view.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                return false;
//            }
//        });     //słuchacz na przytrzymanie
//        view.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                return false;
//            }
//        }); //nasłuchiwanie na akcje ruchów
//
//
//        View childView = view.findViewById(R.id.viewObjectId);//szukanie View po id wewnątrz obiektu
//        View childTag = view.findViewWithTag("tag");         //szukanie elementu wewnątrz po tagu
//        View focusedView = view.findFocus();                 //znajdź obiekt na którym jest akcja
//
//
//        ViewGroup viewGroup = new ViewGroup(this) {
//            @Override
//            protected void onLayout(boolean changed, int l, int t, int r, int b) {
//
//            }
//        };
//        int index = 1;
//        int marksCount = 2;
//        int maxMarksCount = 3;
//        int linesCount = 3;
//
//        try {
//            int childCount = viewGroup.getChildCount();             //pobieranie ilości dzieci
//            viewGroup.getChildAt(0);                                //pobieranie dziecka pod indeksem
//            viewGroup.addView(childView);                           //dodawanie dziecka
//            viewGroup.addView(childView, index);                    //dodawanie dziecka pod indeksem
//            viewGroup.addView(childView, layoutParams);             //dodawanie dziecka z parametrami układu
//
//
//            TextView textView = new TextView(this);
//            String text = textView.getText().toString();           //pobieranie tekstu
//            textView.setText("tekst");                              //ustawianie tekstu
//            textView.append("tekst na końcu");                      //dodawanie tekstu na koniec teksu
//            textView.setEms(marksCount);                            //szerokość widoku po liczbie znaków
//            textView.setError("Wypełnij pole!");                    //wyświetl treść błędu
//            textView.setHint(R.string.hintText);                    //wyświetl tekst z poradą
//            textView.setAllCaps(true);                              //wyświetl tekst jako CAPS LOCK
//            textView.setEnabled(true);                              //tekst jest interaktywny lub nie
//            textView.setLines(linesCount);                          //ilość linii jako integer
//            textView.addTextChangedListener(new TextWatcher() {
//                @Override
//                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//                }
//
//                @Override
//                public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//                }
//
//                @Override
//                public void afterTextChanged(Editable s) {
//
//                }
//            });//nasłuchiwanie zmian tekstu
//        } catch (Exception e) {
//        }
//
//        ImageView imageView = new ImageView(this);
//        imageView.setAdjustViewBounds(true);                //dopasowanie się do rozmiaru View
//        imageView.setImageAlpha(120);                       //ustawianie przeźroczystości obrazka
//        imageView.setImageDrawable(drawable);               //ustawianie drawable
//        imageView.setImageBitmap(bitmap);                   //ustawianie bitmapy
//        imageView.setImageResource(R.drawable.image);       //ustawianie drawable na podstawie id zasobu
//        imageView.setScaleType(ImageView.ScaleType.FIT_XY); //różny style skalowania obrazu
//*/
//
//
//    }
//
//    public void sendMsg(View view) {
///*
//        //rozwiazanie zaawansowane
//        TextView textView = new TextView(this);
//        textView.setBackgroundResource(R.drawable.my_whale_msg);
//        textView.setTextColor(ContextCompat.getColor(this, android.R.color.white));
//        String msg = msgTextView.getText().toString();
//        textView.setText(msg);
//        msgTextView.setText(null);
//
//        LinearLayout.LayoutParams layoutParams =
//                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
//                LinearLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.gravity = Gravity.RIGHT;
//        layoutParams.setMargins(textPadding, textPadding, textPadding, textPadding);
//        textView.setLayoutParams(layoutParams);
//        */
//
//
//        //prostsze rozwiazanie
//        View view1 = inflater.inflate(R.layout.text_msg, linearLayout, false);
//        if (view1 instanceof TextView) {
//            String msg = msgTextView.getText().toString();
//            msgTextView.setText(null);
//            ((TextView) view1).setText(msg);
//        }
//
//        linearLayout.addView(view1);
//        //linearLayout.addView(textView);
//    }
//
//}
