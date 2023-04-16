package com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcButtonType;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcLogger$VfcPopType;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.c;
import cra.w;
import java.lang.Exception;
import q87.c;

public final class GrowthVfcLogger$a	// class@0015a5
{

    public void GrowthVfcLogger$a(){
       super();
    }
    public void GrowthVfcLogger$a(u p0){
       super();
    }
    public static void d(GrowthVfcLogger$a p0,GrowthVfcLogger$VfcButtonType p1,GrowthVfcLogger$VfcPopType p2,String p3,int p4,Object p5){
       p0.b(p1, p2, null);
    }
    public final void a(JsonObject p0,GrowthVfcLogger$VfcButtonType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthVfcLogger$a.class, "8")) {
          return;
       }
       a.p(p0, "jsonObject");
       a.p(p1, "btnType");
       p0.c0(p1.getKey(), p1.getType());
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "V_F_C_GET_COUPON_POP";
       uElementPack.params = p0.toString();
       u1.G("", 1, uElementPack, null);
       return;
    }
    public final void b(GrowthVfcLogger$VfcButtonType p0,GrowthVfcLogger$VfcPopType p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GrowthVfcLogger$a.class, "3")) {
          return;
       }
       a.p(p0, "btnType");
       a.p(p1, "type");
       JsonObject jsonObject = this.g(p2);
       jsonObject.a0(p1.getKey(), Integer.valueOf(p1.getType()));
       jsonObject.c0(p0.getKey(), p0.getType());
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "V_F_C_CODE_BACK_POP";
       uElementPack.params = jsonObject.toString();
       u1.G("", 1, uElementPack, null);
       return;
    }
    public final void c(GrowthVfcLogger$VfcButtonType p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthVfcLogger$a.class, "4")) {
          return;
       }
       a.p(p0, "btnType");
       JsonObject jsonObject = this.g(p1);
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "V_F_C_CODE_BACK_POP";
       jsonObject.c0(p0.getKey(), p0.getType());
       uElementPack.params = jsonObject.toString();
       u1.G("", 1, uElementPack, null);
       return;
    }
    public final void e(String p0,GrowthVfcLogger$VfcButtonType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthVfcLogger$a.class, "6")) {
          return;
       }
       a.p(p1, "button");
       JsonObject jsonObject = this.g(p0);
       jsonObject.c0(p1.getKey(), p1.getType());
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "V_F_C_SHARE_GET_COUPON_POP_BUTTON";
       uElementPack.params = jsonObject.toString();
       u1.u(4, uElementPack, null);
       return;
    }
    public final void f(GrowthVfcLogger$VfcPopType p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthVfcLogger$a.class, "1")) {
          return;
       }
       a.p(p0, "type");
       JsonObject jsonObject = this.g(p1);
       jsonObject.a0(p0.getKey(), Integer.valueOf(p0.getType()));
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "V_F_C_CODE_BACK_POP";
       uElementPack.params = jsonObject.toString();
       u1.u0(4, uElementPack, null);
       return;
    }
    public final JsonObject g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrowthVfcLogger$a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          try{
             JsonElement jsonElement = c.d(p0);
             a.o(jsonElement, "JsonParser.parseString\(value\)");
             JsonObject jsonObject = jsonElement.r();
             a.o(jsonObject, "JsonParser.parseString\(value\).asJsonObject");
             return jsonObject;
          }catch(java.lang.Exception e4){
             Object[] objArray = new Object[0];
             w.C().t("GrowthVfcLogger", e4.getLocalizedMessage(), objArray);
          }
          return new JsonObject();
       }else {
          goto label_0035 ;
       }
    }
}
