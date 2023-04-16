package ced.p1$a;
import com.google.android.material.appbar.ReboundBehavior$b;
import ced.p1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.widget.RelativeLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;
import java.lang.Float;
import io.reactivex.subjects.PublishSubject;

public class p1$a implements ReboundBehavior$b	// class@000572
{
    public final p1 a;

    public void p1$a(p1 p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       p1$a uoa = p1$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       p0 = - p0;
       p1 = this.a.t.getMeasuredHeight();
       int i = (this.a.q.getMeasuredHeight() - (p1 * 3)) + this.a.t.getLayoutParams().height;
       float f = 0;
       if (p0 > i && p1) {
          this.a.R8(Math.min((((float)(p0 - i) * 0x3f800000) / (float)p1), 0x3f800000));
       }else {
          this.a.R8(f);
       }
       if (p1) {
          float f1 = (float)p1;
          float f2 = 0x3f800000 - Math.min((((float)p0 * 0x3f800000) / f1), 0x3f800000);
          int h = p1.H;
          if (p0 > (p1 - h)) {
             f = Math.min((((float)((p0 - p1) + h) * 0x3f800000) / f1), 0x3f800000);
          }
          this.a.E.onNext(Float.valueOf(f));
          this.a.P8(f2, f);
       }else {
          this.a.E.onNext(Float.valueOf(f));
          this.a.P8(f, 0x3f800000);
       }
       return;
    }
}
