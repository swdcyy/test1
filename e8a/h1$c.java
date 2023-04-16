package e8a.h1$c;
import m3a.u;
import e8a.h1;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uc6.c;
import sd5.d;
import java.lang.Boolean;
import de5.a;
import p5a.e;
import kotlin.jvm.internal.a;
import com.kwai.framework.player.core.b;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import im8.f;

public final class h1$c implements u	// class@0020ae
{
    public final h1 a;

    public void h1$c(h1 p0){
       this.a = p0;
       super();
    }
    public Bitmap a(){
       Object[] objArray = null;
       h1$c obj = PatchProxy.apply(objArray, this, h1$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       h1 y = obj.y;
       if (y != null) {
          return y;
       }
       h1 w = obj.w;
       if (w != null) {
          c uoc = w.N();
          if (uoc != null) {
             objArray = uoc.a();
          }
       }
       return objArray;
    }
    public boolean b(){
       e obj = PatchProxy.apply(null, this, h1$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = h1.R8(this.a).getPlayer();
       a.o(obj, "mPlayModule.player");
       return obj.isPlaying();
    }
    public PhotoDetailLogger c(){
       h1 obj = PatchProxy.apply(null, this, h1$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.v;
       if (obj == null) {
          a.S("mPhotoDetailLogger");
       }
       Object obj1 = obj.get();
       a.o(obj1, "mPhotoDetailLogger.get\(\)");
       return obj1;
    }
}
