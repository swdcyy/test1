package me9.b$a;
import f55.g;
import brd.v;
import java.lang.Object;
import java.lang.String;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import j8c.a;
import java.lang.StringBuilder;
import w46.b;
import com.google.gson.JsonObject;
import java.lang.Number;
import brd.g;
import q87.c;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import kotlin.jvm.internal.a;
import java.lang.Throwable;

public final class b$a implements g	// class@002fdf
{
    public final v b;

    public void b$a(v p0){
       this.b = p0;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("MagicRequestBridgeCenterHandler", "onError, errorCode:"+p0+", errorMsg:"+p1+','+" extraInfo:"+p2, objArray);
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("result", Integer.valueOf(p0));
       jsonObject.c0("message", p1);
       this.b.onNext(jsonObject);
       this.b.onComplete();
       return;
    }
    public void onSuccess(Object p0){
       JsonObject jsonObject;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("MagicRequestBridgeCenterHandler", "onSuccess, result:"+p0, objArray);
       if (p0 != null) {
          try{
             p0 = a.a.x(p0);
             a.o(p0, "Gsons.KWAI_GSON.toJsonTree\(result\)");
             p0 = p0.r();
          }catch(java.lang.Exception e5){
             a.D().e("MagicRequestBridgeCenterHandler", "onSuccess to json error", e5);
             p0 = new JsonObject();
          }
       }else {
          p0 = new JsonObject();
       }
    }
}
