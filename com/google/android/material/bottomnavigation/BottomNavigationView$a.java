package com.google.android.material.bottomnavigation.BottomNavigationView$a;
import androidx.appcompat.view.menu.e$a;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.Object;
import androidx.appcompat.view.menu.e;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView$b;
import com.google.android.material.bottomnavigation.BottomNavigationView$c;

public class BottomNavigationView$a implements e$a	// class@00164d
{
    public final BottomNavigationView b;

    public void BottomNavigationView$a(BottomNavigationView p0){
       this.b = p0;
       super();
    }
    public void a(e p0){
    }
    public boolean b(e p0,MenuItem p1){
       boolean b = true;
       if (this.b.g != null && p1.getItemId() == this.b.getSelectedItemId()) {
          this.b.g.a(p1);
          return b;
       }else {
          BottomNavigationView f = this.b.f;
          if (f == null || f.a(p1)) {
             b = false;
          }
          return b;
       }
    }
}
