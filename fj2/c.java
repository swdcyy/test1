package fj2.c;
import java.lang.Object;
import t02.a0;
import java.lang.String;
import lnc.i3;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ScreenPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import q2b.h$b;
import k2b.e0;

public class c	// class@00296b
{

    public void c(){
       super();
    }
    public static i3 a(a0 p0,String p1){
       i3 obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       String str = (p0.e.isLandscape())? "landscape_live": "portrait_live";
       obj.d("portrait_mode", str);
       if (!TextUtils.x(p1)) {
          obj.d("position", p1);
       }
       obj.a("is_from_livemate", Boolean.valueOf(p0.e.mIsFromLiveMate));
       return obj;
    }
    public static ClientContent$ContentPackage b(boolean p0,a0 p1){
       ClientContent$ContentPackage obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = p1.Z2.a();
       ClientContent$ScreenPackage screenPackag = new ClientContent$ScreenPackage();
       int i = (p0)? 2: 1;
       screenPackag.orientation = i;
       obj.screenPackage = screenPackag;
       return obj;
    }
    public static void c(String p0,boolean p1,a0 p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, null, c.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_SCREENCAST_PANEL";
       i3 oi3 = i3.f();
       oi3.d("btn_type", p0);
       uElementPack.params = oi3.e();
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setContentPackage(c.b(p1, p2));
       uClickMetaDa.setElementPackage(uElementPack);
       u1.B(uClickMetaDa);
       return;
    }
    public static void d(boolean p0,String p1,boolean p2,a0 p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, Boolean.valueOf(p2), p3, null, c.class, "11")) {
          return;
       }
       int i = (p0)? 7: 8;
       h$b uob = h$b.e(i, "LIVE_SCREENCAST_SELECT_PANEL");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_SCREENCAST_SELECT_PANEL";
       i3 oi3 = i3.f();
       oi3.d("deviceId", p1);
       uElementPack.params = oi3.e();
       uob.k(uElementPack);
       uob.h(c.b(p2, p3));
       u1.p0("", null, uob);
       return;
    }
}
