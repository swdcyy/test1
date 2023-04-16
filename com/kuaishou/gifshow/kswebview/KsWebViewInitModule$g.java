package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$g;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import io7.f;
import com.google.gson.JsonElement;
import fg6.a;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$g$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.List;
import wkd.b;
import com.kuaishou.gifshow.kswebview.CNYWebviewIntelligentPreinit;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class KsWebViewInitModule$g implements Runnable	// class@0019dd
{
    public static final KsWebViewInitModule$g b;

    static {
       KsWebViewInitModule$g.b = new KsWebViewInitModule$g();
    }
    public void KsWebViewInitModule$g(){
       super();
    }
    public final void run(){
       Gson a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KsWebViewInitModule$g.class, "1")) {
          return;
       }
       f uof = a.t().f("LaunchOptCNYWebViewLoadRule");
       if (uof != null) {
          objArray = uof.c();
       }
       a = a.a;
       List list = a.d(objArray, new KsWebViewInitModule$g$a().getType());
       if (list != null) {
          a.q(list);
          b.a(-1436040059).b(list);
       }
       return;
    }
}
