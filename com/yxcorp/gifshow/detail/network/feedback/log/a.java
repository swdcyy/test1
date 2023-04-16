package com.yxcorp.gifshow.detail.network.feedback.log.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import dy6.a;
import e2a.a;
import java.lang.Runnable;
import t45.c;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;

public final class a	// class@0015c5
{

    public void a(){
       super();
    }
    public static void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("NetworkDetectFeedback", p0, objArray);
       return;
    }
    public static void b(a p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "8")) {
          return;
       }
       if (p0 != null) {
          c.a(new a(p0, p1));
       }
       return;
    }
    public static void c(BaseFeed p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "2")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       String str = (p1)? "weak": "none";
       jsonObject.c0("net_type", str);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = "NET_JUDGE";
       uElementPack.action2 = "NET_JUDGE";
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p0 != null) {
          uContentPack.photoPackage = w1.f(p0);
       }
       u1.u(6, uElementPack, uContentPack);
       return;
    }
    public static void d(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = "NET_SET_POPUP";
       uElementPack.action2 = "NET_SET_POPUP";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p0 != null) {
          uContentPack.photoPackage = w1.f(p0);
       }
       u1.u0(4, uElementPack, uContentPack);
       return;
    }
    public static void e(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = "FIND_PLAY_FEEDBACK";
       uElementPack.action2 = "FIND_PLAY_FEEDBACK";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (p0 != null) {
          uContentPack.photoPackage = w1.f(p0);
       }
       u1.u0(6, uElementPack, uContentPack);
       return;
    }
}
