package com.facebook.react.modules.network.c;
import com.kuaishou.webkit.ValueCallback;
import com.facebook.react.modules.network.e;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.modules.network.e$b;

public class c implements ValueCallback	// class@0012cf
{
    public final Callback a;
    public final e b;

    public void c(e p0,Callback p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onReceiveValue(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          this.b.a.a();
          Object[] objArray = new Object[]{p0};
          this.a.invoke(objArray);
       }
       return;
    }
}
