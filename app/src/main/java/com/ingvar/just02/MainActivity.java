package com.ingvar.just02;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

        import com.ingvar.just02.Activity.AddNotificationActivity;
        import com.ingvar.just02.Activity.DonateACtivity;
        import com.ingvar.just02.Activity.SettingActivity;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(android.R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.list));

        listView.setOnItemClickListener(this);
        listView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent;
        switch (i) {
            case 0 :
                intent = new Intent(MainActivity.this, AddNotificationActivity.class);
                startActivity(intent);
                break;

            case 1 :
                intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
                break;

            case 2 :
                intent = new Intent(MainActivity.this, DonateACtivity.class);
                startActivity(intent);
                break;

        }
    }







/*
    public void onClickAdd(View view) {
        Button btnAddNotification = (Button) findViewById(R.id.add_notification_btn);
        Intent intent = new Intent(MainActivity.this, AddNotificationActivity.class);
        startActivity(intent);
    }

    public void onClickSetting(View view) {
        Button btnSetting = (Button) findViewById(R.id.setting_btn);
        Intent intent = new Intent(MainActivity.this, SettingActivity.class);
        startActivity(intent);
    }

    public void onClickDonate(View view) {
        Button btnDonate = (Button) findViewById(R.id.donate_btn);
        Intent intent = new Intent(MainActivity.this, DonateACtivity.class);
        startActivity(intent);
    }
    */
}