package c24.l0;
import hu4.f;
import hu4.h;
import c24.i0;
import java.lang.String;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import ms3.c;
import c24.j0;
import android.view.View;
import com.kuaishou.merchant.api.live.service.pendant.model.PendantArea;
import ls3.b;
import hu4.e;

public final class l0 implements f	// class@000488
{
    public final h a;
    public final i0 b;
    public final String c;
    public final long d;
    public final Ref$IntRef e;
    public final Ref$IntRef f;
    public final Ref$ObjectRef g;

    public void l0(h p0,i0 p1,String p2,long p3,Ref$IntRef p4,Ref$IntRef p5,Ref$ObjectRef p6){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, l0.class, "2")) {
          return;
       }
       l0 ta = this.a;
       if (ta != null) {
          ta.i();
       }
       a.n(MerchantCommonLogBiz.ROUTER, "LivePendantActionHandler", "show dynamic bubble failed", p0, "pendantId", this.c, "renderUrl", this.g.element);
       PatchProxy.onMethodExit(l0.class, "2");
       return;
    }
    public void b(ViewGroup p0){
       i0 a;
       ViewParent parent;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, l0.class, "1")) {
          return;
       }
       if (p0 != null && p0.getParent() != null) {
          a.g(MerchantCommonLogBiz.ROUTER, "LivePendantActionHandler", "setRenderCallback: rootView parent not null");
       }
       l0 tb = this.b;
       a = tb.a;
       l0 tc = this.c;
       l0 td = this.d;
       l0 ta = this.a;
       Ref$IntRef element = this.e.element;
       Ref$IntRef element1 = this.f.element;
       Objects.requireNonNull(tb);
       i0 oi0 = i0.class;
       if (PatchProxy.isSupport(oi0)) {
          Object[] objArray = new Object[]{tc,p0,Long.valueOf(td),ta,Integer.valueOf(element),Integer.valueOf(element1)};
          j0 oj0 = PatchProxy.apply(objArray, tb, oi0, "4");
          if (oj0 != PatchProxyResult.class) {
          label_006e :
             a.a(oj0, PendantArea.AREA_RIGHT);
             MerchantCommonLogBiz rOUTER = MerchantCommonLogBiz.ROUTER;
             l0 tc1 = this.c;
             Ref$ObjectRef objectRef = this.g.element;
             if (p0 != null) {
                parent = p0.getParent();
                if (parent != null) {
                label_0089 :
                   a.v(rOUTER, "LivePendantActionHandler", "handler show dynamic pendant bubble", "pendantId", tc1, "renderUrl", objectRef, "bubbleParent", parent);
                   PatchProxy.onMethodExit(l0.class, "1");
                   return;
                }
             }
             parent = "null";
             goto label_0089 ;
          }
       }
       j0 oj01 = new j0(td, tc, p0, element, element1, ta);
       goto label_006e ;
    }
    public void c(){
       e.a(this);
    }
}
