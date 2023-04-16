package ec9.y;
import erd.g;
import ec9.w;
import java.lang.String;
import cc9.k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import w46.b;
import ec9.b1;
import ec9.k;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import java.lang.Integer;
import cc9.j;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import u80.d;
import java.util.Map;
import ac9.j;
import ec9.f1;
import lnc.a1;
import kotlin.jvm.internal.a;
import java.util.List;

public final class y implements g	// class@0021a4
{
    public final w b;
    public final String c;
    public final k d;

    public void y(w p0,String p1,k p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
       }else {
          a.D().e("CameraAssistant", "download KuaiShan error, id = "+this.c, p0);
          b uob = this.b.a().j();
          p0 = uob.i().get(Integer.valueOf(this.d.b()));
          if (!p0 instanceof j) {
             p0 = null;
          }
          String obj = p0;
          if (obj != null) {
             uob.i().put(Integer.valueOf(this.d.b()), j.a(obj, null, -1, false, null, 5, null));
             if (uob.b() == this.d.b()) {
                obj = a1.p(R.string.arg_RES_7f1041ec);
                a.o(obj, "CommonUtil.string\(R.stri¡­rt_shoot_recommend_error\)");
                this.b.c.u0().g(obj);
                this.b.a().h(q.a(uob, null, 0, 0, null, true, false, false, false, 207, null));
             }
          }
       }
       return;
    }
}
