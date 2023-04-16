package com.kwai.framework.krn.bridges.share.KrnShareBridge$a;
import com.kwai.framework.krn.bridges.share.b$a;
import com.kwai.framework.krn.bridges.share.KrnShareBridge;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.krn.bridges.share.JsKsShareResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.base.KrnBridge;

public class KrnShareBridge$a implements b$a	// class@0015d5
{
    public final Callback a;
    public final Callback b;
    public final KrnShareBridge c;

    public void KrnShareBridge$a(KrnShareBridge p0,Callback p1,Callback p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(String p0){
    }
    public void b(JsKsShareResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnShareBridge$a.class, "1")) {
          return;
       }
       if (p0 != null && p0.mResult == 1) {
          this.c.callbackToJS(this.a, p0);
       }else {
          this.c.callbackToJS(this.b, p0);
       }
       return;
    }
}
