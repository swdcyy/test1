package fva.k;
import java.lang.Object;
import java.lang.String;
import k2b.e0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import qrd.l1;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import java.lang.Number;

public final class k	// class@002a0d
{
    public static final k a;

    static {
       k.a = new k();
    }
    public void k(){
       super();
    }
    public final void a(String p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "4")) {
          return;
       }
       a.p(p0, "type");
       a.p(p1, "page");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "HOT_SPOT_NEWS_FOLD_BTN";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("module_name", "every_day_look");
       jsonObject.c0("btn_type", p0);
       uElementPack.params = jsonObject.toString();
       u1.L(null, p1, 1, uElementPack, null);
       return;
    }
    public final void b(String p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "3")) {
          return;
       }
       a.p(p0, "type");
       a.p(p1, "page");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "HOT_SPOT_NEWS_FOLD_BTN";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("module_name", "every_day_look");
       jsonObject.c0("btn_type", p0);
       uElementPack.params = jsonObject.toString();
       u1.D0(null, p1, 3, uElementPack, null, null);
       return;
    }
    public final void c(HotSpotItem p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "2")) {
          return;
       }
       a.p(p0, "data");
       a.p(p1, "page");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "HOT_SPOT_NEWS_ENTRY";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("module_name", "every_day_look");
       jsonObject.c0("news_title", p0.mKeyWord);
       jsonObject.a0("news_id", p0.mWordId);
       uElementPack.params = jsonObject.toString();
       u1.L(null, p1, 1, uElementPack, null);
       return;
    }
    public final void d(HotSpotItem p0,e0 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "1")) {
          return;
       }
       a.p(p0, "data");
       a.p(p1, "page");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "HOT_SPOT_NEWS_ENTRY";
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("module_name", "every_day_look");
       jsonObject.c0("news_title", p0.mKeyWord);
       jsonObject.a0("news_id", p0.mWordId);
       uElementPack.params = jsonObject.toString();
       u1.C0(null, p1, 3, uElementPack, null);
       return;
    }
}
