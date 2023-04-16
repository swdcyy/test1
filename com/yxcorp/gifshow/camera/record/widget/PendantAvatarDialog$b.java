package com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog$b;
import com.kwai.gifshow.post.api.feature.pendant.PendantAvatarInfo;
import com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog$b$a;
import io.reactivex.g;

public final class PendantAvatarDialog$b	// class@000fcb
{
    public final PendantAvatarInfo a;
    public PendantAvatarDialog b;

    public void PendantAvatarDialog$b(PendantAvatarInfo p0,PendantAvatarDialog p1){
       a.p(p0, "info");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       this.b = null;
    }
    public final t b(String p0,int p1,int p2){
       if (PatchProxy.isSupport(PendantAvatarDialog$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, PendantAvatarDialog$b.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       t ot = t.create(new PendantAvatarDialog$b$a(p0, p1, p2));
       a.o(ot, "Observable.create { emit¡­     }\n        }\)\n      }");
       return ot;
    }
}
