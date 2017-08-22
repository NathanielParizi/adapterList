package com.example.go.adapterlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static TextView v;
    public static char c = 'a';


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v = (TextView) findViewById(R.id.textView);




       String p = "This is a test to see how to gather a count of every specific letter in a " +
                "list of a paragraph. It is useful if you are parsing string literals from websites using" +
                "web scrapers. This is a project to see how I can get a count of a specific character, I" +
                "will use the letter (a) for example in this test and hopefully it will work.";



  countOccurrences(p, c);

    }

    public static int countOccurrences(String p, char c)
    {
        int count = 0;
        for (int i=0; i < p.length(); i++)
        {
            if (p.charAt(i) == c)
            {
                count++;
            }
        }

        System.out.println(count);
        System.out.println(count);
        System.out.println(count);  System.out.println(count);
        System.out.println(count);
        System.out.println(count);



        return count;



    }
}
