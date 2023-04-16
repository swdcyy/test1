package eod.c;
import pn9.c;
import java.lang.Object;
import android.view.ViewGroup;
import pn9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.view.View;
import i2b.a;
import android.view.ViewGroup$LayoutParams;
import god.c;
import fod.e;

public final class c implements c	// class@000db4
{
    public final boolean a;

    public void c(boolean p0){
       super();
       this.a = p0;
    }
    public a a(ViewGroup p0,int p1){
       Object obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       View view = a.d(p0.getContext(), R.layout.arg_RES_7f0d15e8, p0, false);
       a.o(view, "view");
       uoc = c.p;
       obj.width = uoc.f();
       obj.height = uoc.e();
       return new e(view, this.a);
    }
}
