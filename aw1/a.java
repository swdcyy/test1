package aw1.a;
import pv1.a;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.kds.LiveMiniWidgetKdsItem;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import vv1.a;
import java.lang.Integer;
import lnc.i3;
import k2b.k2;
import k2b.u1;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import cs5.f;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetPositionType;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import k2b.e0;
import java.lang.Long;

public final class a implements a	// class@0002be
{
    public final LiveMiniWidgetKdsItem a;

    public void a(LiveMiniWidgetKdsItem p0){
       a.p(p0, "item");
       super();
       this.a = p0;
    }
    public void a(String p0,String p1){
       ClientContent$LiveStreamPackage liveStreamId;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       a.p(p0, "widgetId");
       a.p(p1, "bundleId");
       ClientContent$LiveStreamPackage liveStreamPa = this.a.w0().a();
       int i = 1;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Integer.valueOf(i), null, uoa, "5")) {
          i3 oi3 = i3.f();
          oi3.d("status", "START");
          String str = "";
          String str1 = (u1.j() == null)? str: u1.j().d;
          oi3.d("current_page", str1);
          oi3.c("pendantType", Integer.valueOf(i));
          i = (liveStreamPa == null)? str: liveStreamPa.liveStreamId;
          oi3.d("live_stream_id", i);
          if (liveStreamPa != null) {
             str = liveStreamPa.anchorUserId;
          }
          oi3.d("anchor_user_id", str);
          u1.Y("LIVE_REVENUE_PENDANT_RENDER_TASK", oi3.toString(), 3);
       }
       return;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       a.p(p0, "widgetId");
       a.p(p1, "bundleId");
       BaseFragment uBaseFragmen = this.a.w0().b();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.w0().a();
       String str = this.a.r();
       int i = 1;
       int i1 = 0;
       boolean b = (this.a.u() == LiveMiniWidgetPositionType.RIGHT_BOTTOM_LARGE_STYLE)? true: false;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{uBaseFragmen,liveStreamPa,str,Boolean.valueOf(b),p0};
          if (PatchProxy.applyVoid(objArray, null, uoa, "3")) {
          label_0082 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "KWAI_ACTIVE_PENDANT";
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.moreInfoPackage = a.b(str, b, p0);
       u1.M("", uBaseFragmen, 1, uElementPack, a.a(liveStreamPa), uContentWrap);
       goto label_0082 ;
    }
    public void c(String p0,String p1,String p2){
       ClientContent$LiveStreamPackage liveStreamId;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "4")) {
          return;
       }
       a.p(p0, "widgetId");
       a.p(p1, "bundleId");
       a.p(p2, "errMsg");
       ClientContent$LiveStreamPackage liveStreamPa = this.a.w0().a();
       int i = 1;
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Integer.valueOf(i), null, uoa, "7")) {
          i3 oi3 = i3.f();
          oi3.d("status", "FAIL");
          String str = "";
          String str1 = (u1.j() == null)? str: u1.j().d;
          oi3.d("current_page", str1);
          oi3.c("pendantType", Integer.valueOf(i));
          i = (liveStreamPa == null)? str: liveStreamPa.liveStreamId;
          oi3.d("live_stream_id", i);
          if (liveStreamPa != null) {
             str = liveStreamPa.anchorUserId;
          }
          oi3.d("anchor_user_id", str);
          u1.Y("LIVE_REVENUE_PENDANT_RENDER_TASK", oi3.toString(), 3);
       }
       return;
    }
    public void d(String p0,String p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, str)) {
          return;
       }
       a.p(p0, "widgetId");
       a.p(p1, "bundleId");
       BaseFragment uBaseFragmen = this.a.w0().b();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.w0().a();
       String str1 = this.a.r();
       int i = 1;
       int i1 = 0;
       boolean b = (this.a.u() == LiveMiniWidgetPositionType.RIGHT_BOTTOM_LARGE_STYLE)? true: false;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{uBaseFragmen,liveStreamPa,str1,Boolean.valueOf(b),p0};
          if (PatchProxy.applyVoid(objArray, null, uoa, str)) {
          label_0081 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "KWAI_ACTIVE_PENDANT";
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.moreInfoPackage = a.b(str1, b, p0);
       u1.D0("", uBaseFragmen, 9, uElementPack, a.a(liveStreamPa), uContentWrap);
       goto label_0081 ;
    }
    public void e(String p0,String p1,long p2){
       ClientContent$LiveStreamPackage liveStreamId;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, a.class, "3")) {
          return;
       }
       a.p(p0, "widgetId");
       a.p(p1, "bundleId");
       ClientContent$LiveStreamPackage liveStreamPa = this.a.w0().a();
       int i = 1;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, Integer.valueOf(i), Long.valueOf(p2), null, a.class, "6")) {
          i3 oi3 = i3.f();
          oi3.d("status", "FINISH");
          String str = "";
          String str1 = (u1.j() == null)? str: u1.j().d;
          oi3.d("current_page", str1);
          oi3.c("pendantType", Integer.valueOf(i));
          i = (liveStreamPa == null)? str: liveStreamPa.liveStreamId;
          oi3.d("live_stream_id", i);
          if (liveStreamPa != null) {
             str = liveStreamPa.anchorUserId;
          }
          oi3.d("anchor_user_id", str);
          oi3.c("time_cost", Long.valueOf(p2));
          u1.Y("LIVE_REVENUE_PENDANT_RENDER_TASK", oi3.toString(), 3);
       }
       return;
    }
}
