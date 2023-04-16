package ag9.f$a;
import com.yxcorp.gifshow.bubble.b$c;
import ag9.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;

public final class f$a implements b$c	// class@0000bb
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = CameraLogger.d(this.a.d);
       int i1 = 0;
       Object[] objArray = new Object[i1];
       a.D().w("RecoCollectMusicController", "ShowCondition : "+i, objArray);
       if (i != 5 && (i != 1 && i != 2)) {
          i1 = true;
       }
    label_0043 :
       return i1;
    }
}
