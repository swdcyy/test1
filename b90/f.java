package b90.f;
import erd.g;
import b90.e;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;

public final class f implements g	// class@000af9
{
    public final e b;

    public void f(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else if(this.b.h == null){
          p0 = this.b;
          p0.h = p0.p0();
       }
       return;
    }
}
