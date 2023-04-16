package com.yxcorp.gifshow.webview.yoda.h$a;
import com.yxcorp.gifshow.webview.yoda.function.f;
import com.yxcorp.gifshow.webview.yoda.h;
import erd.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class h$a extends f	// class@0017c4
{
    public final g f;
    public final h g;

    public void h$a(h p0,g p1){
       this.g = p0;
       this.f = p1;
       super();
    }
    public void s(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$a.class, "1")) {
          return;
       }
       this.f.accept(p0);
       return;
    }
}
