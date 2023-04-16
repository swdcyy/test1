package androidx.appcompat.app.AppCompatDelegateImpl$f;
import q0.a;
import androidx.appcompat.app.AppCompatDelegateImpl;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.ActionBar;
import android.content.Context;
import android.util.AttributeSet;
import w0.x;

public class AppCompatDelegateImpl$f implements a	// class@000576
{
    public final AppCompatDelegateImpl a;

    public void AppCompatDelegateImpl$f(AppCompatDelegateImpl p0){
       this.a = p0;
       super();
    }
    public void a(Drawable p0,int p1){
       ActionBar uActionBar = this.a.p();
       if (uActionBar != null) {
          uActionBar.a0(p0);
          uActionBar.Z(p1);
       }
       return;
    }
    public void b(int p0){
       ActionBar uActionBar = this.a.p();
       if (uActionBar != null) {
          uActionBar.Z(p0);
       }
       return;
    }
    public Drawable c(){
       int[] ointArray = new int[]{0x7f04042b};
       x ox = x.u(this.d(), null, ointArray);
       ox.w();
       return ox.g(0);
    }
    public Context d(){
       return this.a.j0();
    }
    public boolean e(){
       ActionBar uActionBar = this.a.p();
       boolean b = (uActionBar != null && (uActionBar.o() & 0x04))? true: false;
       return b;
    }
}
