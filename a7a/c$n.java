package a7a.c$n;
import jta.a;
import a7a.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import androidx.recyclerview.widget.RecyclerView;

public final class c$n extends a	// class@00004f
{
    public final c a;

    public void c$n(c p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       if (PatchProxy.isSupport2(c$n.class, "2") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, c$n.class, "2")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          c.X8(this.a).G(false);
          this.a.b9(5);
       }
       PatchProxy.onMethodExit(c$n.class, "2");
       return;
    }
    public void d(float p0){
       if (PatchProxy.isSupport2(c$n.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, c$n.class, "1")) {
          return;
       }
       c.X8(this.a).G(true);
       this.a.c9(5);
       c.X8(this.a).stopScroll();
       c.X8(this.a).O(c.X8(this.a).getCurrentPosition());
       PatchProxy.onMethodExit(c$n.class, "1");
       return;
    }
}
