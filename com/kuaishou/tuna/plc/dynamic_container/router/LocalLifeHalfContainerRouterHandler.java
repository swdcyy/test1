package com.kuaishou.tuna.plc.dynamic_container.router.LocalLifeHalfContainerRouterHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.SystemClock;
import android.content.Context;
import xh7.a;
import yh7.a;
import android.app.Activity;
import lnc.a1;
import android.content.Intent;
import com.kuaishou.locallife.half_container.LocalLifeHalfContainerActivity;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import com.yxcorp.gifshow.entity.QPhoto;
import moc.b;
import tkd.b;
import tkd.d;
import xw5.a;
import java.lang.Thread;
import android.os.Looper;
import com.kuaishou.tuna.plc.dynamic_container.router.LocalLifeHalfContainerRouterHandler$a;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.utility.n;

public final class LocalLifeHalfContainerRouterHandler extends AnnotationUriHandler	// class@000ff6
{

    public void LocalLifeHalfContainerRouterHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalLifeHalfContainerRouterHandler.class, "1")) {
          return;
       }
       a.p(p0, "request");
       a.p(p1, "callback");
       long l = SystemClock.elapsedRealtime();
       Context uContext = p0.b();
       a.o(uContext, "request.context");
       a uoa = new a(200);
       if (uContext instanceof Activity && !a1.i(uContext)) {
          uoa.a = 406;
          p1.a(uoa);
          return;
       }else {
          Intent intent = new Intent(uContext, LocalLifeHalfContainerActivity.class);
          intent.putExtra("start_enter_page_animation", R.anim.arg_RES_7f010105);
          intent.putExtra("activityCloseEnterAnimation", R.anim.arg_RES_7f01010d);
          intent.setData(p0.g());
          Object obj = null;
          HashMap hashMap = p0.d(HashMap.class, "EXTRA_CONTEXT_MAP", obj);
          int i = -1;
          if (hashMap instanceof Map) {
             Object obj1 = hashMap.get("QPhoto");
             if (obj1 != null) {
                if (!obj1 instanceof QPhoto) {
                   obj1 = obj;
                }
                if (obj1 != null) {
                   i = b.d(obj1);
                }
             }
          }
          if (hashMap != null) {
             obj = hashMap.get("QPhoto");
          }
          if (obj instanceof QPhoto) {
             d.a(0x2ac28c95).o0(true);
          }
          intent.putExtra("SOURCE_PHOTO_SAVE_ID", i);
          intent.putExtra("EXTRA_KEY_ROUTER_HANDLE_DURATION", (SystemClock.elapsedRealtime() - l));
          Looper mainLooper = Looper.getMainLooper();
          a.o(mainLooper, "Looper.getMainLooper\(\)");
          if (a.g(Thread.currentThread(), mainLooper.getThread())) {
             this.e(intent, uContext);
          }else {
             k1.o(new LocalLifeHalfContainerRouterHandler$a(this, intent, uContext));
          }
          p1.a(uoa);
          return;
       }
    }
    public final void e(Intent p0,Context p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalLifeHalfContainerRouterHandler.class, "2")) {
          return;
       }
       if (p1 instanceof Activity) {
          p0.putExtra("EXTRA_KEY_DISPLAY_HEIGHT", n.j(p1));
       }
       p1.startActivity(p0);
       if (p1 instanceof Activity) {
          p1.overridePendingTransition(R.anim.arg_RES_7f010105, 0);
       }
       return;
    }
}
