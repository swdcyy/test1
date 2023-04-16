package com.google.android.material.navigation.NavigationView$a;
import androidx.appcompat.view.menu.e$a;
import com.google.android.material.navigation.NavigationView;
import java.lang.Object;
import androidx.appcompat.view.menu.e;
import android.view.MenuItem;
import com.google.android.material.navigation.NavigationView$b;

public class NavigationView$a implements e$a	// class@0016a7
{
    public final NavigationView b;

    public void NavigationView$a(NavigationView p0){
       this.b = p0;
       super();
    }
    public void a(e p0){
    }
    public boolean b(e p0,MenuItem p1){
       NavigationView g = this.b.g;
       boolean b = (g != null && g.a(p1))? true: false;
       return b;
    }
}
