package jk9.f;
import erd.g;
import jk9.c;
import ll9.a;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class f implements g	// class@002afd
{
    public final c b;
    public final a c;

    public void f(c p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          this.c.c = p0;
          this.b.d();
       }
       return;
    }
}
