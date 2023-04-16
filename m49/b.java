package m49.b;
import java.lang.Object;
import java.lang.String;
import m49.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import mxb.j;
import mxb.j0;
import mxb.i0;
import m49.b$a;
import erd.g;
import m49.b$b;
import m49.b$c;
import m49.b$d;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.app.Activity;
import androidx.core.app.a;
import com.tbruyelle.rxpermissions2.g;
import com.kwai.framework.ui.popupmanager.dialog.a;
import m49.b$e;

public final class b	// class@002df2
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final String a(boolean p0){
       String str = (p0)? "close": "open";
       return str;
    }
    public final void b(a p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "9")) {
          return;
       }
       AdDataWrapper uAdDataWrapp = p0.c();
       if (uAdDataWrapp != null) {
          j adLogWrapper = uAdDataWrapp.getAdLogWrapper();
          if (adLogWrapper != null) {
             i0.a().p(141, adLogWrapper).d(b$a.b).q("button", b.a.a(p1)).a();
          }
       }
       return;
    }
    public final void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       AdDataWrapper uAdDataWrapp = p0.c();
       if (uAdDataWrapp != null) {
          j adLogWrapper = uAdDataWrapp.getAdLogWrapper();
          if (adLogWrapper != null) {
             i0.a().p(140, adLogWrapper).d(b$b.b).a();
          }
       }
       return;
    }
    public final void d(a p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "7")) {
          return;
       }
       AdDataWrapper uAdDataWrapp = p0.c();
       if (uAdDataWrapp != null) {
          j adLogWrapper = uAdDataWrapp.getAdLogWrapper();
          if (adLogWrapper != null) {
             i0.a().p(141, adLogWrapper).d(b$c.b).q("button", b.a.a(p1)).a();
          }
       }
       return;
    }
    public final void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       AdDataWrapper uAdDataWrapp = p0.c();
       if (uAdDataWrapp != null) {
          j adLogWrapper = uAdDataWrapp.getAdLogWrapper();
          if (adLogWrapper != null) {
             i0.a().p(140, adLogWrapper).d(b$d.b).a();
          }
       }
       return;
    }
    public final t f(a p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "helper");
       t ot = a.j(new g(p0.b()), p0.b(), "android.permission.WRITE_EXTERNAL_STORAGE", false).doOnNext(new b$e(p0, p1, a.i(p0.b(), "android.permission.WRITE_EXTERNAL_STORAGE")));
       a.o(ot, "PermissionDlgUtils.reque¡­  }\n          }\n        }");
       return ot;
    }
}
