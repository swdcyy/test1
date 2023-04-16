package fna.f0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ena.j;
import ena.j$a;
import zf6.k;
import com.yxcorp.gifshow.growth.cleaner.ui.GrowthCleanerCircle;

public final class f0 extends PresenterV2	// class@00297a
{
    public j p;

    public void f0(){
       super();
    }
    public void doBindView(View p0){
       j k;
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       this.p = j.y.a(p0);
       boolean b = k.d();
       f0 tp = this.p;
       if (tp != null) {
          j f = tp.f;
          if (f != null) {
             k = tp.k;
             if (k != null) {
                j u = tp.u;
                if (u != null) {
                   j l = tp.l;
                   if (l != null) {
                      f.setNightMode(b);
                      int i = (b)? 0x7f080cf7: 0x7f080cf6;
                      k.setBackgroundResource(i);
                      i = (b)? 0x7f080cec: 0x7f080ceb;
                      u.setBackgroundResource(i);
                      float f1 = (b)? 0x3f4ccccd: 0x3f800000;
                      l.setAlpha(f1);
                   }
                }
             }
          }
       }
       return;
    }
}
