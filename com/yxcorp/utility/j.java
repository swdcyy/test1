package com.yxcorp.utility.j;
import android.view.View$OnSystemUiVisibilityChangeListener;
import android.view.Window;
import java.lang.Object;
import android.view.View;
import java.lang.Integer;
import java.lang.Runnable;
import com.yxcorp.utility.j$a;

public class j implements View$OnSystemUiVisibilityChangeListener	// class@0009ce
{
    public Window b;
    public int c;
    public int d;
    public Runnable e;
    public static int f;

    static {
       j.f = 5894;
    }
    public void j(Window p0){
       super();
       this.c = -1;
       this.b = p0;
       this.c = p0.getDecorView().getSystemUiVisibility();
    }
    public void j(Window p0,boolean p1){
       super();
       this.c = -1;
       this.b = p0;
       if (!p1) {
          this.c = p0.getDecorView().getSystemUiVisibility();
          return;
       }else {
          p0 = p0.getDecorView().getTag(R.id.system_ui_visibility_tag);
          if (p0 instanceof Integer) {
             this.c = p0.intValue();
          }else {
             this.c = this.b.getDecorView().getSystemUiVisibility();
             this.b.getDecorView().setTag(R.id.system_ui_visibility_tag, Integer.valueOf(this.c));
          }
          return;
       }
    }
    public static boolean c(Window p0){
       boolean b = (p0.getDecorView().getSystemUiVisibility() == j.f)? true: false;
       return b;
    }
    public void a(){
       this.b.addFlags(1024);
       this.b.addFlags(512);
       this.b.getDecorView().setSystemUiVisibility(j.f);
       this.d = this.b.getDecorView().getSystemUiVisibility();
       this.b.getDecorView().setOnSystemUiVisibilityChangeListener(this);
    }
    public void b(){
       this.d();
       this.b.getDecorView().setSystemUiVisibility(this.c);
       this.b.getDecorView().setOnSystemUiVisibilityChangeListener(null);
       this.b.clearFlags(512);
       this.b.clearFlags(1024);
       this.d = 0;
    }
    public final void d(){
       if (this.e != null) {
          this.b.getDecorView().removeCallbacks(this.e);
          this.e = null;
       }
       return;
    }
    public void onSystemUiVisibilityChange(int p0){
       if (p0 != this.d) {
          this.b.getDecorView().setOnSystemUiVisibilityChangeListener(null);
          j$a uoa = new j$a(this);
          this.e = uoa;
          this.b.getDecorView().postDelayed(uoa, 10);
       }else {
          this.d();
       }
       return;
    }
}
