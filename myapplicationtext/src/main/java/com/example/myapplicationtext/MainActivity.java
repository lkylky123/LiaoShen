package com.example.myapplicationtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);



        try {
            InputStream inputStream = getAssets().open("ff");
            byte[] bytes = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = inputStream.read(bytes))!= -1){
                sb.append(new String(bytes,0,len));

            }
            String str = sb.toString();
            JSONObject jsonObject = new JSONObject(str);
            Bean b = new Bean();

            JSONObject json = jsonObject.getJSONObject("result");
            Bean.Result r = b.new Result();
            JSONArray arr = json.getJSONArray("data");
            List<String> lis = new ArrayList<>();
            for (int i = 0; i < arr.length(); i++) {
                Bean.Root br = b.new Root();


                JSONObject js = arr.getJSONObject(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
