package io1.b;
import java.lang.Object;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.Boolean;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import q2b.h$b;
import k2b.u1;

public class b	// class@002974
{

    public void b(){
       super();
    }
    public static void a(e0 p0,int p1,ClientContent$LiveStreamPackage p2,long p3,JsonElement p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Long.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "4")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LIKE_RESULT";
       b.d(p0, p1, p2, p3, p4, uElementPack, null);
       return;
    }
    public static void b(e0 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "2")) {
          return;
       }
       b.a(p0, 1, p1, 0, null);
       return;
    }
    public static void c(e0 p0,int p1,ClientContent$LiveStreamPackage p2,long p3,boolean p4,JsonElement p5,String p6,FeedLogCtx p7){
       object oobject = p6;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Long.valueOf(p3),Boolean.valueOf(p4),p5,oobject,p7};
          if (PatchProxy.applyVoid(objArray, null, uob, "3")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LIKE_RESULT";
       i3 oi3 = i3.f();
       oi3.a("is_slide", Boolean.valueOf(p4));
       oi3.a("is_normal_live", Boolean.TRUE);
       oi3.d("send_type", oobject);
       uElementPack.params = oi3.e();
       b.d(p0, p1, p2, p3, p5, uElementPack, p7);
       return;
    }
    public static void d(e0 p0,int p1,ClientContent$LiveStreamPackage p2,long p3,JsonElement p4,ClientEvent$ElementPackage p5,FeedLogCtx p6){
       b uob = b.class;
       ClientEvent$ResultPackage resultPackag = null;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Long.valueOf(p3),p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, resultPackag, uob, "5")) {
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p2;
       CommonParams uCommonParam = new CommonParams();
       uCommonParam.mCsLogCorrelateInfo = p4;
       if (p1 == 7 || p1 == 8) {
          resultPackag = new ClientEvent$ResultPackage();
          resultPackag.timeCost = p3;
       }
       h$b uob1 = h$b.e(p1, "LIVE_LIKE_RESULT");
       uob1.k(p5);
       uob1.h(uContentPack);
       uob1.g(uCommonParam);
       uob1.q(resultPackag);
       uob1.l(p6);
       u1.p0("", p0, uob1);
       return;
    }
}
