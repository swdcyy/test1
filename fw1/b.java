package fw1.b;
import lf3.g;
import fw1.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import wu1.a;
import wu1.a$a;
import com.kuaishou.livestream.message.nano.LiveCommonTopRightTkWidgetProto$TkWidgetConfig;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority;
import java.lang.Enum;
import va1.l0;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder;
import java.lang.Long;
import yb6.d;
import java.lang.StringBuilder;
import wu1.g;
import java.util.Map;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import fw1.c;
import fw1.d;
import erd.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lf3.f;

public final class b implements g	// class@0023c1
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       int i;
       int i1;
       b tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uoe, "4")) {
       }else if(p0 == null){
          b.Z(e.u, "[handlePendantMessage] msg is null");
       }else if(tb.q == null){
          b.Z(e.u, "[handlePendantMessage] mTkPendantService is null");
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget obj = PatchProxy.applyOneRefs(p0, tb, uoe, "7");
          if (obj != patchProxyRe) {
          }else {
             obj = p0.tkConfig;
             if (obj == null) {
                b.Z(e.u, "[transformMsg2Config] msg.tkConfig is null");
                obj = null;
             }else {
                a$a uoa = new a$a();
                uoa.b(obj.activityId);
                uoa.d(obj.bizId);
                uoa.f(obj.bundleId);
                uoa.g(obj.data);
                uoa.h = (int)obj.minBundleVer;
                uoa.k(obj.viewKey);
                LiveCommonTopRightTkWidgetProto$TkWidgetConfig bizPriority = obj.bizPriority;
                a uoa1 = 1;
                if (PatchProxy.isSupport(uoe)) {
                   Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(bizPriority), tb, uoe, "8");
                   if (obj1 != patchProxyRe) {
                      i = obj1.intValue();
                   }else if(bizPriority == uoa1){
                      i = LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.TK_HIGH.ordinal();
                   }else if(bizPriority == null){
                      i = LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.TK_LOW.ordinal();
                   }else {
                      l0.n("服务端下发的优先级在端上没有映射");
                      i = LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.TK_LOW.ordinal();
                   }
                }else {
                   goto label_0086 ;
                }
                uoa.e(i);
                String str1 = (obj.bizPriority == uoa1)? "dynamicHigh": "dynamicLow";
                uoa.j(str1);
                LiveCommonTopRightTkWidgetProto$TkWidgetConfig bizPriority1 = obj.bizPriority;
                if (PatchProxy.isSupport(uoe)) {
                   Object obj2 = PatchProxy.applyOneRefs(Integer.valueOf(bizPriority1), tb, uoe, "9");
                   if (obj2 != patchProxyRe) {
                      i1 = obj2.intValue();
                   }else if(bizPriority1 == uoa1){
                      i1 = LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder.TK_HIGH.ordinal();
                   }else if(bizPriority1 == null){
                      i1 = LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder.TK_LOW.ordinal();
                   }else {
                      i1 = LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder.TK_LOW.ordinal();
                   }
                }else {
                   goto label_00cd ;
                }
                uoa.i(i1);
                i1 = 2;
                uoa.c(i1);
                uoa.h(i1);
                obj = uoa.a();
             }
          }
          if (obj == null) {
             b.Z(e.u, "[handlePendantMessage] config is null");
          }else {
             c u = e.u;
             b.c0(u, "[handlePendantMessage]", "msg", p0.toString());
             if (p0.canShow != null) {
                LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget showDeadline = p0.showDeadline;
                if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(obj, Long.valueOf(showDeadline), tb, uoe, "5")) {
                   long l = showDeadline - d.a();
                   b.d0(u, "[tryShowPendant]", "pendantId", obj.k, "interval", Long.valueOf(l));
                   String str = ", interval = ";
                   if (l <= 0) {
                      b.Z(u, "[tryShowPendant] message has expired");
                      l0.n("下发的挂件过期，移除挂件，挂件id="+obj.k+str+l);
                      tb.P8(obj.k);
                   }else {
                      l0.n("展示挂件，挂件id="+obj.k+str+l);
                      tb.q.b(obj);
                      b uob = tb.s.get(obj.k);
                      if (uob != null) {
                         uob.dispose();
                      }
                      uob = t.timer(l, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new c(tb, obj), d.b);
                      tb.s.put(obj.k, uob);
                      tb.X7(uob);
                   }
                }
             }else {
                tb.P8(obj.k);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
