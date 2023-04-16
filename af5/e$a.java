package af5.e$a;
import d6a.a;
import af5.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.k2;
import java.lang.CharSequence;
import android.text.TextUtils;
import af5.d;
import java.lang.Runnable;
import ekd.k1;

public class e$a extends a	// class@000093
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void F1(){
       this.b.w = false;
    }
    public void i2(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e$a.class, "1")) {
          return;
       }
       e$a tb = this.b;
       if (tb.w == null) {
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.apply(objArray, tb, uoe, "6");
          boolean b = false;
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             e y = tb.y;
             b1 = (y == null || y.C())? true: false;
          }
          if (b1) {
             tb = this.b;
             Objects.requireNonNull(tb);
             Object obj1 = PatchProxy.apply(objArray, tb, uoe, "5");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(!tb.t instanceof BaseFragment){
                k2 ok2 = b.a(0x4b316083).f();
                if (ok2 != null && (tb.t.getPage() == ok2.c || TextUtils.equals(tb.t.o(), ok2.d))) {
                   b = true;
                }
             }
             if (b) {
                this.b.P8();
             }else {
                k1.r(new d(this), 500);
             }
          }
       }
       return;
    }
}
