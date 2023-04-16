package c2c.g$e;
import b2c.a$b;
import c2c.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import e17.i;
import java.lang.Integer;
import android.os.SystemClock;

public final class g$e implements a$b	// class@000503
{
    public long a;
    public final g b;

    public void g$e(g p0){
       this.b = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$e.class, "4")) {
          return;
       }
       a.p(p0, "targetFilePath");
       g t = this.b.t;
       if (t != null) {
          t.dismiss();
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f1004c5);
       PatchProxy.onMethodExit(g$e.class, "4");
       return;
    }
    public void b(String p0,int p1){
       if (PatchProxy.isSupport2(g$e.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, g$e.class, "2")) {
          return;
       }
       a.p(p0, "targetFilePath");
       g t = this.b.t;
       if (t != null) {
          t.Fh(p1, 100, true);
       }
       PatchProxy.onMethodExit(g$e.class, "2");
       return;
    }
    public void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, g$e.class, "3")) {
          return;
       }
       a.p(p0, "targetFilePath");
       a.p(p1, "errorMsg");
       g t = this.b.t;
       if (t != null) {
          t.dismiss();
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f1043cb);
       PatchProxy.onMethodExit(g$e.class, "3");
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$e.class, "1")) {
          return;
       }
       a.p(p0, "targetFilePath");
       this.a = SystemClock.elapsedRealtime();
       this.b.S8();
       PatchProxy.onMethodExit(g$e.class, "1");
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g$e.class, "5")) {
          return;
       }
       a.p(p0, "targetFilePath");
       g t = this.b.t;
       if (t != null) {
          t.dismiss();
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f10163c);
       PatchProxy.onMethodExit(g$e.class, "5");
       return;
    }
}
