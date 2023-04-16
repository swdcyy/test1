package com.kwai.linkturbo.handler.LinkTurboHandler;
import android.os.Handler;
import com.kwai.linkturbo.handler.LinkTurboHandler$a;
import nsd.u;
import android.os.Looper;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.linkturbo.handler.LinkTurboHandler$uiHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Message;
import e37.a;
import android.os.Bundle;
import com.kwai.linkturbo.linkturbo_eunm.LagEventActionType;
import d37.a;
import java.lang.Runnable;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import c37.b;
import b37.c;
import java.lang.Integer;
import d37.b;
import d37.c;

public final class LinkTurboHandler extends Handler	// class@000ae7
{
    public final p a;
    public static final LinkTurboHandler$a b;

    static {
       LinkTurboHandler.b = new LinkTurboHandler$a(null);
    }
    public void LinkTurboHandler(Looper p0){
       a.p(p0, "looper");
       super(p0);
       this.a = s.c(LinkTurboHandler$uiHandler$2.INSTANCE);
    }
    public final Handler a(){
       Object obj = PatchProxy.apply(null, this, LinkTurboHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public void handleMessage(Message p0){
       a a;
       b uob;
       LagEventActionType eNTERING_LAG;
       if (PatchProxy.applyVoidOneRefs(p0, this, LinkTurboHandler.class, "2")) {
          return;
       }
       String str = "msg";
       a.p(p0, str);
       Message what = p0.what;
       a uoa = 1;
       if (what != null) {
          if (what == uoa) {
             if (!PatchProxy.applyVoidOneRefs(p0, this, LinkTurboHandler.class, "4")) {
                Bundle uBundle1 = a.a.a(p0);
                if (uBundle1 != null) {
                   int intx = uBundle1.getInt("action");
                   if (intx) {
                      eNTERING_LAG = (intx != uoa)? LagEventActionType.ENTERING_LAGS_FENCE: LagEventActionType.APPROACHING_LAGS_FENCE;
                   }else {
                      eNTERING_LAG = LagEventActionType.OUT_OF_LAGS_FENCE;
                   }
                   if (p0.arg1 == 101) {
                      this.a().post(new a(eNTERING_LAG));
                   }
                }
             }
             a = a.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(p0, a, a.class, "1")) {
                a.p(p0, str);
                Bundle uBundle = a.a(p0);
                if (uBundle != null) {
                   StringBuilder str1 = "";
                   Iterator iterator = uBundle.keySet().iterator();
                   while (iterator.hasNext()) {
                      String str2 = iterator.next();
                      str1 = str1+"-{"+str2+0xff1a+uBundle.get(str2)+"}-";
                   }
                   uob = c.a();
                   if (uob != null) {
                      uob.e("MESSAGE_LAGS_PREDICTION_NOTIFY£º"+p0.arg1+"--"+str1);
                   }
                }
             }
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, this, LinkTurboHandler.class, "3")){
          if (p0.arg1 != uoa) {
             uob = c.a();
             if (uob != null) {
                uob.e("state msg is unknown, msg:"+p0.what);
             }
          }else {
             p0 = p0.obj;
             Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
             int i = p0.intValue();
             if (!i) {
                this.a().post(b.b);
             }else {
                this.a().post(new c(i));
             }
          }
       }
       return;
    }
}
