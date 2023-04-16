package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.CallAdBridge$a;
import f55.g;
import a59.a;
import java.lang.String;
import java.lang.Object;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.CallAdBridge$a$a;
import java.lang.Runnable;
import ekd.k1;

public final class CallAdBridge$a implements g	// class@00180c
{
    public final a b;
    public final String c;

    public void CallAdBridge$a(a p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CallAdBridge$a.class, "1")) {
          return;
       }
       CallAdBridge$a tb = this.b;
       if (tb != null) {
          k1.o(new CallAdBridge$a$a(tb, this, p0));
       }
       return;
    }
}
