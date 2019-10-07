package com.example.hwassignment1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.LayoutDirection;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.TextView;


public class HMWK_1_InJava extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        HorizontalScrollView hsv = new HorizontalScrollView(this);

        GridLayout root = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );


        root.setLayoutParams(rParams);
        root.setOrientation(GridLayout.VERTICAL);
        root.setBackgroundColor(Color.WHITE);
        root.setRowCount(11);
        root.setColumnCount(5);


//        TextView tv;
//        GridLayout.Spec row_spec;
//        GridLayout.Spec col_spec;
//        GridLayout.LayoutParams cParams;


//        tv = new TextView(this);
//        tv.setText(String.valueOf(1));
//        tv.setTextSize(16);
//        tv.setBackgroundColor(Color.GRAY);
//
//        row_spec = GridLayout.spec(0  ,0f);
//        col_spec = GridLayout.spec(0, 0f);
//
////        row_spec = GridLayout.spec(i);
////        col_spec = GridLayout.spec(0);
//
//        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
//        cParams.setMargins(10,10,10,10);
//        tv.setLayoutParams(cParams);
//        root.addView(tv);

//        for (int i = 0; i < 11; i++){
//            tv = new TextView(this);
//            tv.setText(String.valueOf(i+1));
//            tv.setTextSize(16);
//            tv.setBackgroundColor(Color.GRAY);
//
//            row_spec = GridLayout.spec(i, 0f);
//            col_spec = GridLayout.spec(0, 0f);
//
//
////            row_spec = GridLayout.spec(i);
////            col_spec = GridLayout.spec(0);
//
//            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
////            cParams.setMargins(10,10,10,10);
//            tv.setLayoutParams(cParams);
//            root.addView(tv);
//
//        }

        root = GridRowNumbering(root);

        root = BlueRegion(root);

        root = RuleRegion(root);

        root = YellowRegion(root);

        root = OrangeRegion(root);

        root = Row1and3Region(root);


        hsv.addView(root);

//        setContentView(root);


        //This executes this Java file's implementation of the UI
        setContentView(hsv);

        //This executes the XML file's implementation of the UI
//        setContentView(R.layout.hmwk_1_in_xml);

    }

    protected GridLayout GridRowNumbering(GridLayout root){

        TextView tv;
        GridLayout.Spec row_spec;
        GridLayout.Spec col_spec;
        GridLayout.LayoutParams cParams;

        for (int i = 0; i < 11; i++){
            tv = new TextView(this);
            tv.setText(String.valueOf(i+1));
            tv.setTextSize(16);
            tv.setBackgroundColor(Color.GRAY);

            row_spec = GridLayout.spec(i, 0f);
            col_spec = GridLayout.spec(0, 1);

            tv.setPadding(25,0,25,0);
//            row_spec = GridLayout.spec(i);
//            col_spec = GridLayout.spec(0);
            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(3,3,3,3);
            cParams.width = 110;
            tv.setLayoutParams(cParams);
            root.addView(tv);

        }

        return root;
    }

    protected GridLayout BlueRegion(GridLayout root){

        TextView tv;
        GridLayout.Spec row_spec;
        GridLayout.Spec col_spec;
        GridLayout.LayoutParams cParams;


        for (int i = 3; i <= 5; i++){
            for (int j = 1; j <= 4; j++) {
                tv = new TextView(this);
//            tv.setText(String.valueOf(i+1));
//                if (i == 3 && j == 1) tv.setText("Rule");
//                else if (i == 3 && j == 2) tv.setText("C1");
//                else if (i == 4 && j == 2) tv.setText("min <= hour && hour <= max");
//                else if (i == 5 && j == 2) tv.setText("int min");
//                else if (i == 5 && j == 3) tv.setText("int max");
//                else if (i == 3 && j == 4) tv.setText("A1");
//                else if (i == 4 && j == 4) tv.setText("System.out.println(greeting+\", World!");
//                else if (i == 5 && j == 4) tv.setText("String greeting");
//                else tv.setText(" ");

                tv.setTextSize(16);
                tv.setBackgroundColor(Color.CYAN);

//                row_spec = GridLayout.spec(i, 0f);
//                col_spec = GridLayout.spec(j, 0, 0f);
//                col_spec = GridLayout.spec(j,  0f);
                tv.setPadding(10,0,10,0);

                if ((i == 3 && j == 2) || (i == 4 && j == 2)){
                    row_spec = GridLayout.spec(i);
                    col_spec = GridLayout.spec(j, 2, 2f);
                }else {
                    row_spec = GridLayout.spec(i);
                    col_spec = GridLayout.spec(j, 1);
                }
//                if (i == 3 && j == 1) {
//                    tv.setText("Rule");
//
//                    row_spec = GridLayout.spec(i, 3, 1f);
//                    col_spec = GridLayout.spec(j, 1);
//                    cParams.width = 300;
//
//                }else if (i == 3 && j == 2) {
//                    tv.setText("C1");
//
//                }
//                else if (i == 4 && j == 2) {
//                    tv.setText("min <= hour && hour <= max");
//                }
//                else if (i == 5 && j == 2) {
//                    tv.setText("int min");
//                }
//                else if (i == 5 && j == 3){
//                    tv.setText("int max");
//                }
//                else if (i == 3 && j == 4){
//                    tv.setText("A1");
//                }
//                else if (i == 4 && j == 4) {
//                    tv.setText("System.out.println(greeting+\", World!");
//                }
//                else if (i == 5 && j == 4){
//                    tv.setText("String greeting");
//                }
//                else {
//                    tv.setText(" ");
//                }
//                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
//                cParams.setMargins(1, 0, 1, 0);

                boolean setVerticalGravity = true;

                if (i == 3 && j == 1) {
                    tv.setText("Rule");
                    tv.setTypeface(null, Typeface.BOLD);
                    row_spec = GridLayout.spec(i, 3, 1f);
                    col_spec = GridLayout.spec(j, 1);
//                    cParams.width = 200;

                    cParams = new GridLayout.LayoutParams(row_spec, col_spec);
//                    cParams.setMargins(1, 0, 1, 0);
                    cParams.width = 250;

                }else if (i == 3 && j == 2) {
                    tv.setText("C1");
                    cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                    tv.setTypeface(null, Typeface.BOLD);
                }
                else if (i == 4 && j == 2) {
                    tv.setText("min <= hour && hour <= max");
                    cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                }
                else if (i == 5 && j == 2) {
                    tv.setText("int min");
                    row_spec = GridLayout.spec(i, 1, 0f);
                    col_spec = GridLayout.spec(j, 1, 0f);
                    cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                    cParams.width = 300;
                }
                else if (i == 5 && j == 3){
                    tv.setText("int max");
                    row_spec = GridLayout.spec(i, 1, 0f);
                    col_spec = GridLayout.spec(j, 1, 0f);
                    cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                    cParams.width =300;
                }
                else if (i == 3 && j == 4){
                    tv.setText("A1");
                    tv.setTypeface(null, Typeface.BOLD);
                    cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                    cParams.width= 800;
                }
                else if (i == 4 && j == 4) {
                    tv.setText("System.out.println(greeting+\", World!)");
                    cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                    cParams.width =800;
                }
                else if (i == 5 && j == 4){
                    tv.setText("String greeting");
//                    tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
                    cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                    cParams.width =800;
                }
                else {
                    tv.setText(" ");
                    cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                }
//                if(tv.getText() != " ")cParams.width = 200;
//                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                cParams.setMargins(1, 0, 1, 0);
                tv.setLayoutParams(cParams);

                if (tv.getText() != "Rule") {
                    tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
                }else {
                    tv.setGravity(Gravity.CENTER_HORIZONTAL);
                    tv.setTypeface(null, Typeface.BOLD);
                }
//                else if (tv.getText()){
//                    cParams.width =300;
//                }


                if(tv.getText() != " ") {
//                    cParams.width = 200;
                    root.addView(tv);
                }
            }

        }


        return root;
    }

    protected GridLayout RuleRegion(GridLayout root){

        TextView tv;
        GridLayout.Spec row_spec;
        GridLayout.Spec col_spec;
        GridLayout.LayoutParams cParams;


        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextSize(16);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.WHITE);

        row_spec = GridLayout.spec(6, 0f);
        col_spec = GridLayout.spec(1, 1,0f);

        tv.setPadding(5,0,5,0);

        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(3,3,3,3);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        int ruleNumber = 1;

        for (int i = 7; i < 11; i++){
            tv = new TextView(this);
            tv.setText("R"+(ruleNumber++)+"0");
            tv.setTextSize(16);
            tv.setBackgroundColor(Color.WHITE);

            row_spec = GridLayout.spec(i, 0f);
            col_spec = GridLayout.spec(1, 1,0f);

            tv.setPadding(5,0,5,0);

            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(3,3,3,3);
            tv.setLayoutParams(cParams);
            root.addView(tv);

        }


        return root;
    }

    protected GridLayout YellowRegion(GridLayout root){

        TextView tv;
        GridLayout.Spec row_spec;
        GridLayout.Spec col_spec;
        GridLayout.LayoutParams cParams;


        tv = new TextView(this);
        tv.setText("From");
        tv.setTextSize(16);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.YELLOW);

        row_spec = GridLayout.spec(6, 0f);
        col_spec = GridLayout.spec(2, 1,0f);

//        tv.setPadding(25,0,25,0);

        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
//        cParams.setMargins(3,3,3,3);
        cParams.width = 300;
        tv.setLayoutParams(cParams);
//        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        root.addView(tv);


        tv = new TextView(this);
        tv.setText("To");
        tv.setTextSize(16);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.YELLOW);

        row_spec = GridLayout.spec(6, 0f);
        col_spec = GridLayout.spec(3, 1,0f);

//        tv.setPadding(25,0,25,0);

        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
//        cParams.setMargins(3,3,3,3);
        cParams.width = 300;
        tv.setLayoutParams(cParams);
//        tv.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        root.addView(tv);

        int arrayIndex= 0;
        String[] arrayIntegers = {"0","11","12","17","18", "21","22","23"};

        for (int i = 7; i < 11; i++){
            for (int j = 2; j <= 3; j++) {
                tv = new TextView(this);
                tv.setText(arrayIntegers[arrayIndex++]);
                tv.setTextSize(16);
                tv.setBackgroundColor(Color.YELLOW);

                row_spec = GridLayout.spec(i, 0f);
                col_spec = GridLayout.spec(j, 1, 0f);

//                tv.setPadding(25, 0, 25, 0);

                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
//                cParams.setMargins(3, 3, 3, 3);
                cParams.width = 300;
                tv.setLayoutParams(cParams);
                tv.setGravity(Gravity.RIGHT);
                root.addView(tv);
            }
        }

        return root;
    }


    protected GridLayout OrangeRegion(GridLayout root){

        TextView tv;
        GridLayout.Spec row_spec;
        GridLayout.Spec col_spec;
        GridLayout.LayoutParams cParams;


        int arrayIndex= 0;
        String[] arrayIntegers = {"Greeting","Good Morning", "Good Afternoon",
        "Good Evening", "Good Night"
        };

        for (int i = 6; i < 11; i++) {
            tv = new TextView(this);
            tv.setText(arrayIntegers[arrayIndex++]);
            tv.setTextSize(16);
            if (tv.getText() == "Greeting") tv.setTypeface(null, Typeface.BOLD);
            tv.setBackgroundColor(Color.parseColor("#FFA500"));

            row_spec = GridLayout.spec(i, 0f);
            col_spec = GridLayout.spec(4,0f);

//            tv.setPadding(25, 0, 25, 0);

            cParams = new GridLayout.LayoutParams(row_spec, col_spec);
            cParams.setMargins(3, 3, 3, 3);
            cParams.width = 800;
            tv.setLayoutParams(cParams);
            root.addView(tv);

        }

        return root;
    }

    protected GridLayout Row1and3Region(GridLayout root){
        TextView tv;
        GridLayout.Spec row_spec;
        GridLayout.Spec col_spec;
        GridLayout.LayoutParams cParams;

        tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setTextSize(16);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.WHITE);

        row_spec = GridLayout.spec(0, 1,0f);
        col_spec = GridLayout.spec(1, 4);

        tv.setPadding(565, 0, 565, 0);


        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(3, 3, 3, 3);
//        cParams.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(cParams);
        root.addView(tv);


        tv = new TextView(this);
        tv.setText("properties");
        tv.setTextSize(16);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setBackgroundColor(Color.WHITE);

        row_spec = GridLayout.spec(1, 2,1f);
        col_spec = GridLayout.spec(1, 1, 0f);

//        tv.setPadding(25, 0, 25, 0);

        cParams = new GridLayout.LayoutParams(row_spec, col_spec);
        cParams.setMargins(3, 3, 3, 3);
        cParams.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL);
        tv.setLayoutParams(cParams);
        root.addView(tv);


//
        int arrayIndex= 0;
        String[] arrayIntegers = {"name", "Day Hour Classification", "category",
                "Day and Time"
        };

        for (int i = 1; i <= 2; i++) {
            for (int j = 2; j <= 4; j+=2) {
                tv = new TextView(this);
                tv.setText(arrayIntegers[arrayIndex++]);
                tv.setTextSize(16);
                tv.setBackgroundColor(Color.WHITE);

                row_spec = GridLayout.spec(i, 0f);
                col_spec = GridLayout.spec(j, 1, 0f);

//                tv.setPadding(25, 0, 25, 0);

                cParams = new GridLayout.LayoutParams(row_spec, col_spec);
                cParams.setMargins(3, 3, 3, 3);

                if (j ==2) {
                    cParams.setGravity(Gravity.CENTER_HORIZONTAL);
                    tv.setPadding(50, 0, 50, 0);
                }else{
                    tv.setPadding(25, 0, 25, 0);
                }
                tv.setLayoutParams(cParams);
                root.addView(tv);
            }
        }

        return root;
    }
}
