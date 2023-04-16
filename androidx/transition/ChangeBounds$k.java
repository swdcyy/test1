package androidx.transition.ChangeBounds$k;
import android.view.View;
import java.lang.Object;
import android.graphics.PointF;
import java.lang.Math;
import e3.w;

public class ChangeBounds$k	// class@0009ad
{
    public int a;
    public int b;
    public int c;
    public int d;
    public View e;
    public int f;
    public int g;

    public void ChangeBounds$k(View p0){
       super();
       this.e = p0;
    }
    public void a(PointF p0){
       this.c = Math.round(p0.x);
       this.d = Math.round(p0.y);
       int i = this.g + 1;
       this.g = i;
       if (this.f == i) {
          this.b();
       }
       return;
    }
    public final void b(){
       w.h(this.e, this.a, this.b, this.c, this.d);
       this.f = 0;
       this.g = 0;
    }
    public void c(PointF p0){
       this.a = Math.round(p0.x);
       this.b = Math.round(p0.y);
       int i = this.f + 1;
       this.f = i;
       if (i == this.g) {
          this.b();
       }
       return;
    }
}
