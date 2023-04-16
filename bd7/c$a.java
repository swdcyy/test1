package bd7.c$a;
import com.kwai.nearby.local.migrate.view.NearbyMigrateGuideView$b;
import bd7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bd7.e;

public final class c$a implements NearbyMigrateGuideView$b	// class@000407
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       c c = this.a.c;
       if (c != null) {
          c.a();
       }
       this.a.b.a();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       c c = this.a.c;
       if (c != null) {
          c.b();
       }
       return;
    }
}
