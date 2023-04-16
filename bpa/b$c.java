package bpa.b$c;
import sn.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonElement;
import com.google.gson.c;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import java.lang.NullPointerException;
import cra.w;
import java.lang.StringBuilder;
import java.lang.Throwable;
import q87.c;

public final class b$c extends b	// class@00041a
{

    public void b$c(){
       super("openProtocol");
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       try{
          JsonElement obj = this.d();
          if (obj != null) {
             obj = c.d(obj);
             a.o(obj, "JsonParser.parseString\(params as String\)");
             obj = obj.r().e0("type");
             a.o(obj, "JsonParser.parseString\(p¡­.asJsonObject.get\(\"type\"\)");
             String str = "ks://protocol";
             Intent intent = (obj.p() == 1)? KwaiWebViewActivity.N3(a.b(), WebEntryUrls.I).o(str).a(): KwaiWebViewActivity.N3(a.b(), WebEntryUrls.D).o(str).a();
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             Activity uActivity = uActivityCon.e();
             if (uActivity != null) {
                uActivity.startActivity(intent);
             }
          }else {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
          }
       }catch(java.lang.Exception e0){
          w.C().e("KBubbleTkBridge", this.c()+" error", e0);
       }
       return;
    }
}
