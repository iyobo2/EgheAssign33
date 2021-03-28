package eghe.iyobosa.n01107171;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class EgheActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.content, new EgheFragment()).commit();
    }
    // Listener Nav Bar
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.page_1:
                            getSupportFragmentManager().beginTransaction().replace(R.id.content, new EgheFragment()).commit();
                            break;
                        case R.id.page_2:
                            getSupportFragmentManager().beginTransaction().replace(R.id.content, new IyobosaFragment()).commit();
                            break;
                        case R.id.page_3:
                            getSupportFragmentManager().beginTransaction().replace(R.id.content, new N01107171Fragment()).commit();
                            break;
                    }
                    return false;
                }


            };
}