package com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler$a;
import p59.t$a;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.a;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import k59.t0;
import java.util.HashMap;
import ekd.k1;
import p59.s;

public final class AdNeoH5VideoActionHandler$a implements t$a	// class@0018d8
{
    public final AdNeoH5VideoActionHandler a;

    public void AdNeoH5VideoActionHandler$a(AdNeoH5VideoActionHandler p0){
       this.a = p0;
       super();
    }
    public final void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdNeoH5VideoActionHandler$a.class, "1")) {
          return;
       }
       AdNeoH5VideoActionHandler b = this.a.b;
       if (b != null) {
          b.dispose();
       }
       AdNeoH5VideoActionHandler$a ta = this.a;
       ta.b = objArray;
       Iterator iterator = ta.d.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().b();
       }
       this.a.d.clear();
       k1.n(this.a);
       return;
    }
    public void onResume(){
       s.a(this);
    }
}
