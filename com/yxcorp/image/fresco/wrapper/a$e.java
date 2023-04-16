package com.yxcorp.image.fresco.wrapper.a$e;
import kb.b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import android.os.Handler;
import android.os.Looper;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Drawable;
import com.yxcorp.image.fresco.wrapper.a;
import java.lang.Throwable;
import com.facebook.common.references.a;
import m0d.k;
import java.lang.Runnable;

public class a$e extends b	// class@001a0f
{
    public final ImageCallback a;
    public final Handler b;

    public void a$e(ImageCallback p0){
       super();
       this.b = new Handler(Looper.getMainLooper());
       this.a = p0;
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "3")) {
          return;
       }
       a.i(this.b, this.a, null);
       a.h(this.b, this.a, p0.e());
       return;
    }
    public void onNewResultImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "2")) {
          return;
       }
       Throwable throwable = null;
       if (!p0.a()) {
          a.h(this.b, this.a, throwable);
          return;
       }else if(!p0.hasResult()){
          a.i(this.b, this.a, throwable);
          a.h(this.b, this.a, throwable);
       }else {
          a result = p0.getResult();
          a.i(this.b, this.a, a.c(result));
          a.f(result);
       }
       return;
    }
    public void onProgressUpdate(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
          return;
       }
       this.b.post(new k(this, p0));
       return;
    }
}
