package com.inthuon.containers_6206021611087;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {
    RelativeLayout relativeLayout;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        textView = (TextView) findViewById(R.id.textView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch ( item.getItemId()) {
            case R.id.ListView:
                Intent lunchList = new Intent(MainActivity.this, Listview.class);
                startActivity(lunchList);
                return true;

            case R.id.CustonListView:
                Intent lunchCustonListView = new Intent(MainActivity.this, com.inthuon.containers_6206021611087.CustonListView.class);
                startActivity(lunchCustonListView);
                return true;


            case R.id.GridView:
                Intent lunchGridView = new Intent(MainActivity.this, com.inthuon.containers_6206021611087.Gridview.class);
                startActivity(lunchGridView);
                return true;


            case R.id.WebView:
                Intent lunchWebView = new Intent(MainActivity.this,webview.class);
                startActivity(lunchWebView);
                return true;


            case R.id.SearchView:
                Intent lunchSearchView = new Intent(MainActivity.this, com.inthuon.containers_6206021611087.Search.class);
                startActivity(lunchSearchView);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}