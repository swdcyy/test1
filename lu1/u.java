package lu1.u;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multipk.render.layout.LiveMultiPkViewStyle;
import lu1.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lu1.t;
import java.lang.Enum;
import lnc.a1;
import com.yxcorp.widget.KwaiRadiusStyles;
import nsd.u;
import kotlin.NoWhenBranchMatchedException;
import sp5.b;
import android.graphics.Rect;

public final class u	// class@003051
{
    public static final u a;

    static {
       u.a = new u();
    }
    public void u(){
       super();
    }
    public final r a(LiveMultiPkViewStyle p0){
       r obj = PatchProxy.applyOneRefs(p0, this, u.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = t.a[p0.ordinal()];
       if (i != 1) {
          if (i == 2) {
             r or = new r(a1.e(20.00f), 11.00f, KwaiRadiusStyles.R4, a1.e(6.00f), 0, 0, 0, 0, 240, null);
          }else {
             throw new NoWhenBranchMatchedException();
          }
       }else {
          obj = new r(a1.e(16.00f), 9.00f, KwaiRadiusStyles.R2, a1.e(4.00f), 0, 0, 0, 0, 240, null);
       }
       return i;
    }
    public final float b(b p0,Rect p1){
       float f = (p1.top <= 5 && (p1.left > 5 && p1.right < (p0.a - 5)))? 0.30f: 0x3f800000;
       return f;
    }
    public final boolean c(b p0,Rect p1){
       boolean b = (((float)p1.left / (float)p0.a) - 0x3efae148 >= 0)? true: false;
       return b;
    }
}
