package ag1.g;
import va1.g$a;
import com.kuaishou.live.common.core.component.effect.renderer.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.effect.engine.render.local.drawer.LiveGLTextureView;

public class g implements g$a	// class@000088
{
    public final c a;

    public void g(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.a.p.a();
       return;
    }
    public void deactivate(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.a.p.c();
       return;
    }
    public String getName(){
       return "gl_thread_middle_low_layer";
    }
}
