package a2.r0;
import android.view.animation.Interpolator;
import java.lang.Object;
import android.os.Build$VERSION;
import a2.r0$d;
import a2.r0$c;
import android.view.WindowInsetsAnimation;
import android.view.View;
import a2.r0$b;
import a2.r0$e;

public final class r0	// class@0000a3
{
    public r0$e a;

    public void r0(int p0,Interpolator p1,long p2){
       super();
       this.a = (Build$VERSION.SDK_INT >= 30)? new r0$d(p0, p1, p2): new r0$c(p0, p1, p2);
       return;
    }
    public void r0(WindowInsetsAnimation p0){
       super(0, null, 0);
       if (Build$VERSION.SDK_INT >= 30) {
          this.a = new r0$d(p0);
       }
       return;
    }
    public static void d(View p0,r0$b p1){
       if (Build$VERSION.SDK_INT >= 30) {
          r0$d.h(p0, p1);
       }else {
          r0$c.o(p0, p1);
       }
       return;
    }
    public static r0 f(WindowInsetsAnimation p0){
       return new r0(p0);
    }
    public long a(){
       return this.a.a();
    }
    public float b(){
       return this.a.b();
    }
    public float c(){
       return this.a.c();
    }
    public void e(float p0){
       this.a.d(p0);
    }
}
