package de9.a$b;
import n4b.a$b;
import ie9.a;
import de9.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.base.d;
import ce9.l;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camerasdk.q;
import kotlin.jvm.internal.a;
import ui9.j;

public final class a$b extends a implements a$b	// class@001f1d
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public MagicEmoji$MagicFace o(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.d.d(l.i).a;
    }
    public q p0(){
       d obj = PatchProxy.apply(null, this, a$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.h;
       a.o(obj, "mCameraHelper");
       return obj;
    }
    public j q0(){
       d obj = PatchProxy.apply(null, this, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.g;
       a.o(obj, "mImageHelper");
       return obj;
    }
}
