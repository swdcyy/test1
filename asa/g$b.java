package asa.g$b;
import hka.g;
import asa.g;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;

public final class g$b implements g	// class@0002eb
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public final void a(boolean p0,Configuration p1){
       if (PatchProxy.isSupport(g$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, g$b.class, "1")) {
          return;
       }
       this.a.R8();
       return;
    }
}
