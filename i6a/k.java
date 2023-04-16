package i6a.k;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import k2b.e0;
import java.lang.String;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import qrd.l1;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.util.List;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementMeta$InterestEntity;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta$InterestV3Entity;
import com.google.gson.JsonArray;
import q2b.h$b;

public final class k	// class@00279c
{
    public static final int a = 1;
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final int a(){
       return k.a;
    }
    public final void b(BaseFeed p0,e0 p1,String p2,Integer p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, this, k.class, "2")) {
          return;
       }
       a.p(p0, "feed");
       a.p(p1, "iLogPage");
       a.p(p2, "buttonName");
       super();
       this.action2 = "CONTENT_INTEREST_ADJUSTMENT_CARD_BTN";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("button_type", p2);
       if (p3 != null) {
          jsonObject.a0("card_type", Integer.valueOf(p3.intValue()));
       }
       this.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0);
       u1.M(null, p1, 1, this, uContentPack, null);
       PatchProxy.onMethodExit(k.class, "2");
       return;
    }
    public final void c(BaseFeed p0,e0 p1,Integer p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, k.class, "1")) {
          return;
       }
       a.p(p0, "entity");
       a.p(p1, "iLogPage");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CONTENT_INTEREST_ADJUSTMENT_CARD";
       if (p2 != null) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("card_type", Integer.valueOf(p2.intValue()));
          uElementPack.params = jsonObject.toString();
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0);
       u1.D0(null, null, 3, uElementPack, uContentPack, null);
       PatchProxy.onMethodExit(k.class, "1");
       return;
    }
    public final void d(BaseFeed p0,e0 p1,Integer p2,List p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, this, k.class, "5")) {
          return;
       }
       a.p(p0, "feed");
       a.p(p1, "iLogPage");
       a.p(p3, "optionList");
       super();
       this.action2 = "CONTENT_INTEREST_ADJUSTMENT_CARD_OPTION";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("option_list", new Gson().q(p3));
       if (p2 != null) {
          jsonObject.a0("card_type", Integer.valueOf(p2.intValue()));
       }
       this.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0);
       u1.D0(null, p1, 3, this, uContentPack, null);
       PatchProxy.onMethodExit(k.class, "5");
       return;
    }
    public final void e(BaseFeed p0,e0 p1,List p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, k.class, "3")) {
          return;
       }
       a.p(p0, "feed");
       a.p(p1, "iLogPage");
       a.p(p2, "entityList");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("option_name", iterator.next().mName);
          uArrayList.add(jsonObject);
       }
       this.d(p0, p1, null, uArrayList);
       PatchProxy.onMethodExit(k.class, "3");
       return;
    }
    public final void f(BaseFeed p0,e0 p1,List p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, k.class, "4")) {
          return;
       }
       a.p(p0, "feed");
       a.p(p1, "iLogPage");
       a.p(p2, "entityList");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("option_name", iterator.next().mName);
          uArrayList.add(jsonObject);
       }
       this.d(p0, p1, null, uArrayList);
       PatchProxy.onMethodExit(k.class, "4");
       return;
    }
    public final void g(BaseFeed p0,e0 p1,int p2,int p3,Integer p4,List p5){
       if (PatchProxy.isSupport2(k.class, "6")) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, this, k.class, "6")) {
             return;
          }
       }
       a.p(p0, "feed");
       a.p(p1, "iLogPage");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CONTENT_INTEREST_ADJUSTMENT_CARD_ADJUSTMENT_RESULT";
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("shown_option", Integer.valueOf(p2));
       jsonObject.a0("changed_option", Integer.valueOf(p3));
       if (p5 != null) {
          JsonArray jsonArray = new JsonArray();
          Iterator iterator = p5.iterator();
          while (iterator.hasNext()) {
             jsonArray.G(iterator.next());
          }
          jsonObject.G("option_result_list", jsonArray);
       }
       if (p4 != null) {
          jsonObject.a0("card_type", Integer.valueOf(p4.intValue()));
       }
       uElementPack.params = jsonObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p0);
       h$b uob = h$b.e(0, "CONTENT_INTEREST_ADJUSTMENT_CARD_ADJUSTMENT_RESULT");
       a.o(uob, "it");
       uob.h(uContentPack);
       uob.k(uElementPack);
       a.o(uob, "TaskEventBuilder.newBuil¡­ elementPackage\n        }");
       u1.p0("", p1, uob);
       PatchProxy.onMethodExit(k.class, "6");
       return;
    }
}
