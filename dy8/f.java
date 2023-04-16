package dy8.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import g59.p;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import android.content.Context;
import r0.a;
import android.graphics.drawable.Drawable$ConstantState;
import androidx.core.graphics.drawable.a;
import dy8.f$a;
import java.lang.ref.WeakReference;
import dy8.d;
import java.lang.Runnable;
import t45.c;

public class f	// class@002100
{

    public void f(){
       super();
    }
    public static int a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!TextUtils.x(p1)) {
          return p.c(p0, a1.a(0x7f0604ba), p1);
       }
       return p.b(p0, a1.a(0x7f0604ba));
    }
    public static Drawable b(int p0,int p1){
       Drawable$ConstantState obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uof, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Drawable uDrawable = a.d(a1.c(), p0);
       obj = uDrawable.getConstantState();
       Drawable uDrawable1 = (obj == null)? uDrawable: obj.newDrawable();
       uDrawable1 = a.r(uDrawable1).mutate();
       uDrawable1.setBounds(0, 0, uDrawable.getIntrinsicWidth(), uDrawable.getIntrinsicHeight());
       a.n(uDrawable1, p1);
       return uDrawable1;
    }
    public static void c(int p0,String p1,f$a p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, f.class, "5")) {
          return;
       }
       c.a(new d(p0, p1, new WeakReference(p2)));
       return;
    }
}
