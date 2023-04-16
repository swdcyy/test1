package com.yxcorp.gifshow.camera.record.widget.g;
import erd.g;
import com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog$b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog;
import ra9.c;
import com.yxcorp.gifshow.camera.bubble.c;

public final class g implements g	// class@000fe9
{
    public final PendantAvatarDialog$b b;

    public void g(PendantAvatarDialog$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, PendantAvatarDialog$b.class, "3")) {
             PendantAvatarDialog$b b = p0.b;
             if (b != null && !PatchProxy.applyVoid(objArray, b, PendantAvatarDialog.class, "4")) {
                b.f.u(b.d());
             }
             p0.a();
          }
       }
       return;
    }
}
