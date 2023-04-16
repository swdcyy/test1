package com.kwai.yoda.function.ui.DialogFunction$c;
import erd.g;
import com.kwai.yoda.function.ui.DialogFunction;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xz7.f;
import android.util.Log;
import com.kwai.yoda.function.c;

public final class DialogFunction$c implements g	// class@001233
{
    public final DialogFunction b;
    public final YodaBaseWebView c;
    public final String d;
    public final String e;
    public final String f;

    public void DialogFunction$c(DialogFunction p0,YodaBaseWebView p1,String p2,String p3,String p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogFunction$c.class, "1")) {
       }else {
          a.q(p0, "e");
          this.b.o(this.c, this.d, this.e, f.a(p0), Log.getStackTraceString(p0), this.f);
       }
       return;
    }
}
