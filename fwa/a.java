package fwa.a;
import java.lang.Object;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.yxcorp.gifshow.commoninsertcard.entity.TrendingCard$Trending;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import kp.r1;
import k2b.u1;

public final class a	// class@002a42
{

    public void a(){
       super();
    }
    public static ClientContent$ContentPackage a(CommonInsertCardFeed p0,QPhoto p1){
       ClientContent$ContentPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       if (p1 != null && p0 != null) {
          ClientContent$PhotoPackage photoPackage = w1.f(p1.getEntity());
          photoPackage.llsid = a.e(p0);
          obj.photoPackage = photoPackage;
       }
       if (p0 != null) {
          obj.ksOrderInfoPackage = l0.a(w1.o(p0));
       }
       return obj;
    }
    public static ClientEvent$ElementPackage b(CommonInsertCardFeed p0,TrendingCard$Trending p1){
       ClientEvent$ElementPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("word_id", p1.mWordId);
       oi3.d("name", p1.mDesc);
       oi3.d("llsid", a.e(p0));
       obj.params = oi3.e();
       obj.name = "TAG_HOT_KEYWORD";
       obj.action2 = "TAG_HOT_KEYWORD";
       return obj;
    }
    public static ClientEvent$ElementPackage c(){
       ClientEvent$ElementPackage obj = PatchProxy.apply(null, null, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.name = "HOT_CARD_PHOTO";
       obj.action2 = "HOT_CARD_PHOTO";
       return obj;
    }
    public static ClientEvent$ElementPackage d(String p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, null, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("button_text", p0);
       obj.params = oi3.e();
       obj.name = "FIND_MORE_RELATED";
       obj.action2 = "FIND_MORE_RELATED";
       return obj;
    }
    public static String e(CommonInsertCardFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return String.valueOf(r1.h1(p0));
       }
       return "";
    }
    public static void f(QPhoto p0,CommonInsertCardFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "6")) {
          return;
       }
       if (p0 != null && p1 != null) {
          u1.u(1, a.c(), a.a(p1, p0));
       }
       return;
    }
}
