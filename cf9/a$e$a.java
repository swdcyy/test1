package cf9.a$e$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import cf9.a$e;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import ze9.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cf9.a;
import java.lang.Integer;
import java.lang.Float;
import android.os.CountDownTimer;
import kotlin.jvm.internal.Ref$IntRef;
import ze9.f;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import sm6.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import o07.o;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class a$e$a implements PopupInterface$h	// class@0005dd
{
    public final a$e b;

    public void a$e$a(a$e p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       d e;
       Ref$IntRef obj;
       int i;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e$a.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       a$e b = this.b.b;
       a p = b.p;
       if (p != null) {
          a r = b.r;
          float f = (float)b.s;
          if (!PatchProxy.isSupport(uoe) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(r), Float.valueOf(f), p, uoe, "5") && p.r != null)) {
             p.u = f;
             p.s = false;
             e t = p.t;
             if (t != null) {
                t.cancel();
             }
             obj = new Ref$IntRef();
             obj.element = r;
             p.d0(r);
             f uof = new f(p, obj, r, (1000 * (long)r), 1000);
             p.t = t.start();
          }
       }
       b = this.b.b;
       a p1 = b.p;
       if (p1 != null) {
          e = b.e;
          boolean b1 = b.t(e);
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             obj = PatchProxy.applyTwoRefs(e, Boolean.valueOf(b1), null, uob, "19");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             label_0096 :
                if (PatchProxy.isSupport(uoe) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), p1, uoe, "6") && p1.z() != null)) {
                   b.y(p1.z(), i);
                }
             }
          }
          i = b.f(1, 0, 0, e, b1);
          goto label_0096 ;
       }
    label_00b6 :
       return;
    }
    public void H(c p0,int p1){
       a$e$a uoe$a = a$e$a.class;
       if (PatchProxy.isSupport(uoe$a) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe$a, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       if (p1 == 1) {
          this.b.b.e.onBackPressed();
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
