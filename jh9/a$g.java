package jh9.a$g;
import erd.g;
import jh9.a;
import java.lang.Object;
import ih9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import h26.a;

public final class a$g implements g	// class@002ad2
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
       }else {
          a v = this.b.v;
          if (v != null) {
             v.onActivityResult(p0.a, p0.b, p0.c);
          }
       }
       return;
    }
}
