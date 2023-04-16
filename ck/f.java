package ck.f;
import androidx.appcompat.view.menu.e;
import android.content.Context;
import java.lang.CharSequence;
import android.view.SubMenu;
import android.view.MenuItem;
import androidx.appcompat.view.menu.h;
import ck.h;
import androidx.appcompat.view.menu.m;

public class f extends e	// class@000d1b
{

    public void f(Context p0){
       super(p0);
    }
    public SubMenu addSubMenu(int p0,int p1,int p2,CharSequence p3){
       h oh = this.a(p0, p1, p2, p3);
       h oh1 = new h(this.w(), this, oh);
       oh.y(oh1);
       return oh1;
    }
}
