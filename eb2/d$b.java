package eb2.d$b;
import androidx.viewpager.widget.ViewPager$l;
import eb2.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.System;
import pm8.a;

public class d$b extends ViewPager$l	// class@0026d9
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(d$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, d$b.class, "1")) {
          return;
       }
       if (p1 - 0x3c23d70a > 0) {
          d$b tb = this.b;
          if (tb.s == null) {
             tb.s = true;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(null, tb, d.class, "8")) {
                a.H1(System.currentTimeMillis());
             }
          }
       }
       return;
    }
}
