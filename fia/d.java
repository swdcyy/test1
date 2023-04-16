package fia.d;
import android.view.View$OnClickListener;
import fia.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import e17.i;
import mkc.b;
import mkc.c;
import qvb.i;

public final class d implements View$OnClickListener	// class@0028f5
{
    public final c b;

    public void d(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (!p0.C(uoc.a())) {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
          return;
       }else {
          b[] uobArray = new b[]{b.g};
          c.d(this.b.r, uobArray);
          uoc = this.b.u;
          if (uoc != null) {
             uoc.a();
          }
          return;
       }
    }
}
