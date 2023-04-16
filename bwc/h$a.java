package bwc.h$a;
import com.yxcorp.gifshow.widget.m;
import bwc.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.mixed.model.b;
import com.yxcorp.gifshow.localwork.model.LongVideoLocalProject;
import java.util.Objects;
import a17.g;
import lnc.a1;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import java.util.List;
import java.util.Collections;
import a17.c$a;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import android.app.Activity;
import bwc.f;
import a17.b$b;
import a17.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;

public class h$a extends m	// class@0004aa
{
    public final h c;

    public void h$a(h p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       boolean b = true;
       if (this.c.r.u0() - (double)((float)LongVideoLocalProject.e(b) / 1000.00f) > 0) {
          h$a tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(null, tc, h.class, "6")) {
             c$a uoa = new c$a(tc.t.j);
             uoa.j0(Collections.singletonList(new g(a1.p(R.string.arg_RES_7f103c3a), SheetItemStatus.Primary)));
             uoa.h0(a1.p(R.string.cancel));
             Object[] objArray = new Object[b];
             objArray[0] = String.valueOf(LongVideoLocalProject.f());
             uoa.m0(R.string.arg_RES_7f1045fe, objArray);
             uoa.i0(new f(tc));
             f.a(uoa).Y(PopupInterface.a);
          }
       }else {
          this.c.P8();
       }
       return;
    }
}
