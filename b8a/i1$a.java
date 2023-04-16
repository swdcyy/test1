package b8a.i1$a;
import d6a.a;
import b8a.i1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import de5.a;
import p5a.e;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import java.util.Objects;
import ekd.y0;
import b8a.h1;
import java.lang.Runnable;

public final class i1$a extends a	// class@0003af
{
    public final i1 b;

    public void i1$a(i1 p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, i1$a.class, "2")) {
          return;
       }
       e player = i1.P8(this.b).getPlayer();
       if (player != null) {
          player.O(this.b.z);
       }
       this.b.V8();
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i1$a.class, "1")) {
          return;
       }
       i1$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, i1.class, "4")) {
          tb.w = new y0(200, new h1(tb));
       }
       e player = i1.P8(this.b).getPlayer();
       if (player != null) {
          player.w(this.b.z);
       }
       this.b.S8();
       return;
    }
}
