package com.yxcorp.gifshow.map.PhotoMapActivity$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import u5b.a;
import java.lang.StringBuilder;
import q87.c;
import wkd.b;
import nf6.i;
import android.app.Application;
import o56.a;
import android.net.Uri;
import ekd.x0;
import android.content.Context;
import android.content.Intent;

public final class PhotoMapActivity$a	// class@001c63
{

    public void PhotoMapActivity$a(){
       super();
    }
    public void PhotoMapActivity$a(u p0){
       super();
    }
    public final void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoMapActivity$a.class, "1")) {
          return;
       }
       a.p(p0, "uri");
       Object[] objArray = new Object[0];
       a.c.w("PhotoMapActivity", "uri = "+p0, objArray);
       Intent intent = b.a(0x66dce92a).a(a.b(), x0.f(p0));
       if (intent != null) {
          intent.addFlags(0x10000000);
          a.b().startActivity(intent);
       }
       return;
    }
}
