package e19.e;
import gz8.b$a;
import e19.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public class e implements b$a	// class@002123
{
    public final c a;

    public void e(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.a.V8();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       if (this.a.t.getPlayer().isVideoRenderingStart()) {
          if (this.a.t.getPlayer().isBuffering()) {
             this.a.V8();
          }
       }else if(this.a.t.getPlayer().b() == 4 || this.a.t.getPlayer().b() == 2){
          if (this.a.t.getPlayer().isBuffering()) {
             this.a.V8();
          }
       }else {
          this.a.V8();
       }
       return;
    }
}
