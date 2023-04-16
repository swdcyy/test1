package h62.d;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketPopupPageType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import lnc.i3;
import h62.c;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType$a;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import java.lang.Throwable;
import com.kuaishou.live.core.show.conditionredpacket.logger.SourceType;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketGrabButtonType;
import java.util.Objects;
import java.util.Map;
import h62.c$a;
import k2b.u1;
import java.lang.Number;
import com.kwai.framework.model.user.QCurrentUser;

public final class d	// class@002c6b
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public static final void b(long p0,String p1,RedPacketType p2,int p3,LiveRedPacketStage p4,LiveRedPacketPopupPageType p5,int p6){
       object oobject = p2;
       object oobject1 = p4;
       object oobject2 = p5;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,oobject,Integer.valueOf(p3),oobject1,oobject2,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, uod, "11")) {
             return;
          }
       }
       a.p(p2, "redPacketType");
       a.p(p4, "stage");
       a.p(p5, "pageType");
       d.c(p0, p1, p2, p3, p4, p5, p6, null);
       return;
    }
    public static final void c(long p0,String p1,RedPacketType p2,int p3,LiveRedPacketStage p4,LiveRedPacketPopupPageType p5,int p6,i3 p7){
       object oobject = p2;
       object oobject1 = p4;
       object oobject2 = p5;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,oobject,Integer.valueOf(p3),oobject1,oobject2,Integer.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, null, uod, "12")) {
             return;
          }
       }
       a.p(oobject, "redPacketType");
       a.p(oobject1, "stage");
       a.p(oobject2, "pageType");
       i3 oi3 = (p7 != null)? p7: i3.f();
       oi3.d("popup_page_type", p5.getValue());
       c uoc = v14;
       c uoc1 = v14;
       uoc = new c(p0, p4, LiveRedPacketAction.RED_PACK_POPUP, p1, p2, -1, -1, FirstReportType.Companion.a(p6), ActionType.DEFAULT, ActionStatus.SUCCESS, "1.0");
       c uoc2 = uoc1;
       uoc2.d(oi3.e());
       d.j(uoc2.e(p3));
       return;
    }
    public static final void d(LiveRedPacketAction p0,ActionStatus p1,Throwable p2,RedPacketType p3,int p4,String p5){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uod, "4")) {
             return;
          }
       }
       a.p(oobject, "action");
       a.p(oobject1, "actionStatus");
       a.p(oobject3, "redPacketType");
       c uoc = v14;
       c uoc1 = v14;
       uoc = new c(d.a.a(), LiveRedPacketStage.RED_PACKET_SEND, p0, p5, p3, -1, -1, FirstReportType.DEFAULT, ActionType.TASK, p1, "1.0");
       d.j(uoc1.a(p2).e(p4));
       return;
    }
    public static final void e(LiveRedPacketAction p0,SourceType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "3")) {
          return;
       }
       d.f(p0, p1, RedPacketType.RED_PACKET_TYPE_UNKNOWN, 0);
       return;
    }
    public static final void f(LiveRedPacketAction p0,SourceType p1,RedPacketType p2,int p3){
       c uoc1;
       Object obj = p1;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, d.class, "1")) {
          return;
       }
       a.p(p0, "action");
       String str = "sourceType";
       a.p(obj, str);
       a.p(p2, "redPacketType");
       c uoc = new c(d.a.a(), LiveRedPacketStage.RED_PACKET_SEND, p0, "", p2, -1, -1, FirstReportType.DEFAULT, ActionType.DEFAULT, ActionStatus.SUCCESS, "1.0");
       Object obj1 = PatchProxy.applyOneRefs(obj, v2, c.class, "4");
       if (obj1 != PatchProxyResult.class) {
          uoc1 = obj1;
       }else {
          a.p(obj, str);
          v2.f = obj;
       }
       d.j(uoc1.e(p3));
       return;
    }
    public static final void g(long p0,String p1,RedPacketType p2,int p3,LiveRedPacketGrabButtonType p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, uod, "9")) {
             return;
          }
       }
       a.p(p2, "redPacketType");
       a.p(p4, "grabButtonType");
       d.a.h(p0, p1, p2, p3, LiveRedPacketAction.RED_PACK_POPUP_GRAB_CLICK, FirstReportType.DEFAULT, p4);
       return;
    }
    public static final void i(long p0,String p1,RedPacketType p2,int p3,int p4,LiveRedPacketGrabButtonType p5){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uod, "8")) {
             return;
          }
       }
       a.p(p2, "redPacketType");
       a.p(p5, "grabButtonType");
       d.a.h(p0, p1, p2, p3, LiveRedPacketAction.RED_PACK_POPUP_GRAB_SHOW, FirstReportType.Companion.a(p4), p5);
       return;
    }
    public static final void j(c p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, d.class, "7")) {
          return;
       }
       a.p(p0, "liveRedPacketTraceData");
       Objects.requireNonNull(p0);
       String str = PatchProxy.apply(obj, p0, c.class, "5");
       if (str != PatchProxyResult.class) {
       }else {
          str = c.r.a(p0.f());
       }
       u1.Q("RED_PACKET_TRACE", str);
       return;
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       String id = mE.getId();
       a.o(id, "QCurrentUser.ME.id");
       return Long.parseLong(id);
    }
    public final void h(long p0,String p1,RedPacketType p2,int p3,LiveRedPacketAction p4,FirstReportType p5,LiveRedPacketGrabButtonType p6){
       object oobject = p2;
       object oobject1 = p4;
       object oobject2 = p5;
       object oobject3 = p6;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,oobject,Integer.valueOf(p3),oobject1,oobject2,oobject3};
          if (PatchProxy.applyVoid(objArray, this, uod, "10")) {
             return;
          }
       }else {
          int i = this;
       }
       a.p(oobject, "redPacketType");
       a.p(oobject1, "action");
       a.p(oobject2, "firstReportType");
       a.p(oobject3, "grabButtonType");
       c uoc = v13;
       c uoc1 = v13;
       uoc = new c(p0, LiveRedPacketStage.RED_PACKET_COUNTDOWN, p4, p1, p2, -1, -1, p5, ActionType.DEFAULT, ActionStatus.SUCCESS, "1.0");
       i3 oi3 = i3.f();
       oi3.d("grab_btn_type", p6.getValue());
       c uoc2 = uoc1;
       uoc2.d(oi3.e());
       d.j(uoc2.e(p3));
       return;
    }
}
