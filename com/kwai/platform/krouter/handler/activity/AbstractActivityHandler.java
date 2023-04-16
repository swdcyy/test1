package com.kwai.platform.krouter.handler.activity.AbstractActivityHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import java.lang.Integer;
import android.content.ComponentName;
import yh7.a;
import android.net.Uri;
import xh7.a;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.os.Bundle;
import java.util.Map;
import android.app.Activity;
import androidx.core.app.a;
import androidx.core.content.ContextCompat;
import java.lang.Throwable;
import vh7.a;

public abstract class AbstractActivityHandler extends AnnotationUriHandler	// class@00128f
{

    public void AbstractActivityHandler(){
       super();
    }
    public void c(b p0,c p1){
       int i1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AbstractActivityHandler.class, "1")) {
          return;
       }
       Intent intent = this.e(p0);
       if (!PatchProxy.applyVoidThreeRefs(intent, p0, p1, this, AbstractActivityHandler.class, "2")) {
          try{
             if (intent.getComponent() == null) {
                p1.a(new a(405));
             }else {
                intent.setData(p0.g());
                Context uContext = p0.b();
                String str = "com.kwai.platform.krouter.request_code";
                a uoa = a.class;
                int i = 0;
                if (PatchProxy.isSupport(uoa)) {
                   Integer obj = PatchProxy.applyTwoRefs(str, Integer.valueOf(i), p0, uoa, "5");
                   if (obj != PatchProxyResult.class) {
                      i1 = obj.intValue();
                   label_006c :
                      obj = p0.c(Integer.class, "com.kwai.platform.krouter.flags");
                      if (obj != null) {
                         intent.addFlags(obj.intValue());
                      }
                      Bundle uBundle = p0.c(Bundle.class, "com.kwai.platform.krouter.handler.extra_intent");
                      if (uBundle != null) {
                         intent.putExtras(uBundle);
                      }
                      uBundle = p0.c(Bundle.class, "com.kwai.platform.krouter.options");
                      String str1 = "com.kwai.platform.krouter.return_intent";
                      if (p0.a(str1, i)) {
                         a uoa1 = new a(201);
                         uoa1.b.put(str1, intent);
                         p1.a(uoa1);
                      }else if(i1 > 0 && uContext instanceof Activity){
                         a.j(uContext, intent, i1, uBundle);
                      }else if(!uContext instanceof Activity && !(intent.getFlags() & 0x10000000)){
                         intent.addFlags(0x10000000);
                      }
                      ContextCompat.startActivity(uContext, intent, uBundle);
                      this.f(p0);
                      p1.a(new a(200));
                   }
                }
                i1 = p0.d(Integer.class, str, Integer.valueOf(i)).intValue();
                goto label_006c ;
             }
          }catch(android.content.ActivityNotFoundException e9){
             a.a("ActivityNotFoundException:", e9);
             p1.a(new a(404));
          }catch(java.lang.SecurityException e9){
             a.a("SecurityException:", e9);
             p1.a(new a(403));
          }catch(java.lang.Exception e9){
             a.a("unknown:", e9);
             p1.a(new a(499));
          }
       }
    }
    public abstract Intent e(b p0);
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbstractActivityHandler.class, "3")) {
          return;
       }
       Context uContext = p0.b();
       int[] ointArray = p0.c(int[].class, "com.kwai.platform.krouter.r_animation");
       if (uContext instanceof Activity && (ointArray != null && ointArray.length == 2)) {
          uContext.overridePendingTransition(ointArray[0], ointArray[1]);
       }
    label_002e :
       return;
    }
}
