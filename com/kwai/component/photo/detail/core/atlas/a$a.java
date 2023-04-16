package com.kwai.component.photo.detail.core.atlas.a$a;
import kb.b;
import com.kwai.component.photo.detail.core.atlas.a;
import tyc.k;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.common.references.a;
import android.graphics.drawable.Drawable;
import com.yxcorp.image.fresco.wrapper.a;

public class a$a extends b	// class@000a1a
{
    public final k a;
    public final a b;

    public void a$a(a p0,k p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.a.a();
       p0.close();
       return;
    }
    public void onNewResultImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       if (!p0.a()) {
          return;
       }
       a result = p0.getResult();
       this.a.b(a.c(result));
       a.f(result);
       p0.close();
       return;
    }
}
