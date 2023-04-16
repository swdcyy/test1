package jk9.a$c;
import erd.g;
import mrd.a;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$c implements g	// class@002af2
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          this.b.onNext(p0);
       }
       return;
    }
}
