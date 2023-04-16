package fw9.a;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import android.os.Bundle;
import fw9.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import k3c.w1;
import s1c.r0;

public final class a extends b	// class@002360
{
    public final b d;

    public void a(PagerSlidingTabStrip$d p0,Class p1,Bundle p2,b p3){
       a.p(p0, "tab");
       a.p(p1, "fragmentClass");
       super(p0, p1, p2);
       this.d = p3;
    }
    public void d(int p0,Fragment p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       a td = this.d;
       if (td != null) {
          if (!p1 instanceof w1) {
             p1 = null;
          }
          if (p1 != null) {
             p1.Fc(td.a());
          }
       }
       return;
    }
}
