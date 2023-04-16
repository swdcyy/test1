package nf9.g$a;
import i5b.p$a;
import ie9.a;
import nf9.g;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.base.d;
import ce9.l;
import com.yxcorp.gifshow.camera.record.base.b;
import crd.b;
import android.app.Activity;
import com.yxcorp.gifshow.camerasdk.q;
import ui9.j;

public class g$a extends a implements p$a	// class@00317c
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public MagicEmoji$MagicFace E(){
       Object obj = PatchProxy.apply(null, this, g$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.d.d(l.i).a;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.b.Y1(p0);
       return;
    }
    public Activity getActivity(){
       return this.b.e;
    }
    public q p0(){
       return this.b.h;
    }
    public j q0(){
       return this.b.g;
    }
}
