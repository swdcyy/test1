package com.yxcorp.image.fresco.wrapper.a$a;
import wc.c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;

public final class a$a extends c	// class@001a0b
{
    public final ImageCallback a;

    public void a$a(ImageCallback p0){
       this.a = p0;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.a.onCompletedBitmap(null);
       return;
    }
    public void onNewResultImpl(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.a.onCompletedBitmap(p0);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.toString();
    }
}
