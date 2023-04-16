package com.kwai.yoda.function.ui.g$a;
import erd.g;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import com.kwai.yoda.model.BehaviorParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import px7.b;

public final class g$a implements g	// class@00123c
{
    public final YodaBaseWebView b;

    public void g$a(YodaBaseWebView p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
       }else {
          g$a tb = this.b;
          if (tb != null) {
             b.d(tb, p0.mBehaviorType);
          }
       }
       return;
    }
}
