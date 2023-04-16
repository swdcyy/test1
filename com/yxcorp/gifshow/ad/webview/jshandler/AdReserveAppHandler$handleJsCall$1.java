package com.yxcorp.gifshow.ad.webview.jshandler.AdReserveAppHandler$handleJsCall$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.webview.jshandler.AdReserveAppHandler;
import java.lang.String;
import zl9.e;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import fg6.a;
import com.yxcorp.gifshow.ad.webview.jshandler.ReserveData;
import com.google.gson.Gson;
import tkd.b;
import tkd.d;
import nl9.u;
import p59.t;
import com.kwai.framework.model.feed.BaseFeed;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import nl9.d;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Throwable;
import yx.j0;

public final class AdReserveAppHandler$handleJsCall$1 extends Lambda implements a	// class@0018e2
{
    public final String $data;
    public final e $function;
    public final AdReserveAppHandler this$0;

    public void AdReserveAppHandler$handleJsCall$1(AdReserveAppHandler p0,String p1,e p2){
       this.this$0 = p0;
       this.$data = p1;
       this.$function = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       AdReserveAppHandler a;
       if (PatchProxy.applyVoid(null, this, AdReserveAppHandler$handleJsCall$1.class, "1")) {
          return;
       }
       AdReserveAppHandler$handleJsCall$1 tthis$0 = this.this$0;
       AdReserveAppHandler$handleJsCall$1 t$data = this.$data;
       AdReserveAppHandler$handleJsCall$1 t$function = this.$function;
       Objects.requireNonNull(tthis$0);
       AdReserveAppHandler uAdReserveAp = AdReserveAppHandler.class;
       if (!PatchProxy.applyVoidTwoRefs(t$data, t$function, tthis$0, uAdReserveAp, "2")) {
          ReserveData reserveData = a.a.h(t$data, ReserveData.class);
          String orderId = (reserveData != null)? reserveData.getOrderId(): null;
          boolean b = false;
          int i = (orderId == null || !orderId.length())? 1: 0;
          if (i) {
             t$function.onError(-1, "date error");
          }else {
             i = reserveData.getState();
             if (i != 1) {
                if (i != 2) {
                   t$function.onError(-1, "date state error");
                }else {
                   d.a(-1694791652).DB(b, reserveData.getOrderId(), tthis$0.a.d);
                   t$function.onSuccess(null);
                }
             }else {
                d.a(-1694791652).DB(true, reserveData.getOrderId(), tthis$0.a.d);
                if (!PatchProxy.applyVoid(null, tthis$0, uAdReserveAp, "4") && !PermissionUtils.a(a.B, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                   a = tthis$0.a;
                   d.a(0x4bd38ddd).wn(a.a, new PhotoAdDataWrapper(a.d));
                }
                t$function.onSuccess(null);
             }
             t$function.onSuccess(null);
          }
       }
       return;
    }
}
