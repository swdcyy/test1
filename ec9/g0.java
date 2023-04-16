package ec9.g0;
import erd.g;
import ec9.e0;
import cc9.k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import w46.b;
import ec9.b1;
import ec9.k;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import java.lang.Integer;
import cc9.p;
import com.kuaishou.android.model.music.Music;
import android.content.Intent;
import java.util.Map;
import ac9.j;
import ec9.f1;
import lnc.a1;
import kotlin.jvm.internal.a;
import java.util.List;

public final class g0 implements g	// class@002175
{
    public final e0 b;
    public final k c;

    public void g0(e0 p0,k p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().t("CameraAssistant", "download music error", objArray);
          b uob = this.b.a().j();
          p0 = uob.i().get(Integer.valueOf(this.c.b()));
          if (!p0 instanceof p) {
             p0 = null;
          }
          String obj = p0;
          if (obj != null) {
             uob.i().put(Integer.valueOf(this.c.b()), p.a(obj, null, -1, null, false, 9, null));
             if (uob.b() == this.c.b()) {
                obj = a1.p(R.string.arg_RES_7f1041ec);
                a.o(obj, "CommonUtil.string\(R.stri¡­rt_shoot_recommend_error\)");
                this.b.c.u0().g(obj);
                this.b.a().h(q.a(uob, null, 0, 0, null, true, false, false, false, 207, null));
             }else {
                this.b.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 255, null));
             }
          }
       }
       return;
    }
}
