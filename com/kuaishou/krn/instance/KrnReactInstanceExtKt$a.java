package com.kuaishou.krn.instance.KrnReactInstanceExtKt$a;
import java.lang.Runnable;
import com.facebook.react.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ek0.d;

public final class KrnReactInstanceExtKt$a implements Runnable	// class@0008c0
{
    public final a b;

    public void KrnReactInstanceExtKt$a(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, KrnReactInstanceExtKt$a.class, "1")) {
          return;
       }
       d.e("[perfOpt]createReactContextInBackground start runOnUiThread: ");
       this.b.i();
       PatchProxy.onMethodExit(KrnReactInstanceExtKt$a.class, "1");
       return;
    }
}
