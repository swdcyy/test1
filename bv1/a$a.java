package bv1.a$a;
import bv1.a;
import java.lang.Object;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;
import bv1.b;
import va1.n0;
import android.view.View$MeasureSpec;
import lnc.a1;

public class a$a implements a	// class@000418
{

    public void a$a(){
       super();
    }
    public int a(View p0,int p1){
       b obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = b.class;
       int i = 0;
       if (PatchProxy.isSupport(obj)) {
          Object obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, obj, "2");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else if(p0 == null || p0.getVisibility() == 8){
             b.a(p0);
             int i1 = n0.f();
             p1 = (p1 == 1)? Integer.MIN_VALUE: 0;
             p0.measure(View$MeasureSpec.makeMeasureSpec(i1, p1), View$MeasureSpec.makeMeasureSpec(a1.d(R.dimen.arg_RES_7f0708a3), i));
             i = p0.getMeasuredWidth();
          }
       }else {
          goto label_0038 ;
       }
       return i;
    }
    public int getScreenWidth(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n0.f();
    }
}
