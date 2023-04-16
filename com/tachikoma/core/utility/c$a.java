package com.tachikoma.core.utility.c$a;
import wc.c;
import com.tachikoma.core.utility.c;
import brd.c0;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.StringBuilder;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;
import android.graphics.Bitmap;
import com.tachikoma.core.utility.b;
import android.graphics.Bitmap$Config;

public class c$a extends c	// class@000dd6
{
    public final c0 a;
    public final c b;

    public void c$a(c p0,c0 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       this.a.onError(new Throwable("fetch decode image fail "+this.b.a.s()));
       return;
    }
    public void onNewResultImpl(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          if (!b.f()) {
             this.a.onSuccess(Bitmap.createBitmap(p0));
          }else {
             this.a.onSuccess(p0.copy(p0.getConfig(), p0.isMutable()));
          }
       }else {
          this.a.onError(new Throwable("bitmap is empty"));
       }
       return;
    }
}
