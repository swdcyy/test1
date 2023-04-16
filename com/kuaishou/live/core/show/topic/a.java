package com.kuaishou.live.core.show.topic.a;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.show.topic.LiveTopicTabsResponse$LiveTopicTab;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public class a	// class@0011da
{

    public void a(){
       super();
    }
    public static void a(long p0,String p1,String p2,ClientContent$LiveStreamPackage p3,LiveTopicTabsResponse$LiveTopicTab p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoa, "4")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_CIRCLE_PANEL_TOPIC_ITEM";
       i3 oi3 = i3.f();
       oi3.c("tag_id", Long.valueOf(p0));
       oi3.d("tag_name", p1);
       oi3.d("btn_type", p2);
       if (p4 != null && !TextUtils.x(p4.mTabId)) {
          oi3.d("first_tab", p4.mTabId);
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p3 != null) {
          uContentPack.liveStreamPackage = p3;
       }
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, a.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_CIRCLE_PANEL_RULE_ICON";
       u1.u(1, uElementPack, null);
       return;
    }
    public static void c(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoa, "24")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_CIRCLE_PANEL_TAB";
       i3 oi3 = i3.f();
       oi3.d("first_tab", p0);
       uElementPack.params = oi3.e();
       u1.u(p1, uElementPack, null);
       return;
    }
    public static void d(long p0,String p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, null, a.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_PENDANT";
       i3 oi3 = i3.f();
       oi3.c("tag_id", Long.valueOf(p0));
       oi3.d("tag_name", p1);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void e(boolean p0,ClientContent$LiveStreamPackage p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, uoa, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SWITCH_LIVE_TOPIC_CONFIRM_DIALOGS";
       i3 oi3 = i3.f();
       String str = (p0)? "CONFIRM": "CANCEL";
       oi3.d("btn_type", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void f(long p0,String p1,String p2,ClientContent$LiveStreamPackage p3,LiveTopicTabsResponse$LiveTopicTab p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_CIRCLE_PANEL_TOPIC_ITEM";
       i3 oi3 = i3.f();
       oi3.c("tag_id", Long.valueOf(p0));
       oi3.d("tag_name", p1);
       oi3.d("btn_type", p2);
       if (p4 != null && !TextUtils.x(p4.mTabId)) {
          oi3.d("first_tab", p4.mTabId);
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p3 != null) {
          uContentPack.liveStreamPackage = p3;
       }
       u1.u0(3, uElementPack, uContentPack);
       return;
    }
    public static void g(int p0,ClientContent$LiveStreamPackage p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uoa, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_CIRCLE_PANEL_CARD";
       i3 oi3 = i3.f();
       oi3.c("source", Integer.valueOf(p0));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p1 != null) {
          uContentPack.liveStreamPackage = p1;
       }
       u1.u0(4, uElementPack, uContentPack);
       return;
    }
    public static void h(long p0,String p1,LiveStreamFeed p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), p1, p2, Integer.valueOf(p3), null, a.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_DETAIL_PANEL_CARD";
       i3 oi3 = i3.f();
       oi3.c("tag_id", Long.valueOf(p0));
       oi3.d("tag_name", p1);
       oi3.d("anchor_user_id", r1.U1(p2));
       oi3.d("live_stream_id", r1.n1(p2));
       oi3.d("server_exp_tag", r1.I1(p2));
       oi3.c("source", Integer.valueOf(p3));
       uElementPack.params = oi3.e();
       u1.u0(4, uElementPack, null);
       return;
    }
    public static void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "23")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_CIRCLE_PANEL_TAB";
       i3 oi3 = i3.f();
       oi3.d("first_tab", p0);
       uElementPack.params = oi3.e();
       u1.u0(3, uElementPack, null);
       return;
    }
    public static void j(long p0,String p1,ClientContent$LiveStreamPackage p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, null, a.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_TOPIC_PENDANT";
       i3 oi3 = i3.f();
       oi3.c("tag_id", Long.valueOf(p0));
       oi3.d("tag_name", p1);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       u1.u0(3, uElementPack, uContentPack);
       return;
    }
    public static void k(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SWITCH_LIVE_TOPIC_CONFIRM_DIALOGS";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u0(4, uElementPack, uContentPack);
       return;
    }
}
