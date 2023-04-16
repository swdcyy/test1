package a7a.c$m;
import androidx.recyclerview.widget.RecyclerView$r;
import a7a.c;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class c$m extends RecyclerView$r	// class@00004e
{
    public final c a;

    public void c$m(c p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport2(c$m.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, c$m.class, "2")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p1 == 1) {
          this.a.c9(8);
       }
       PatchProxy.onMethodExit(c$m.class, "2");
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport2(c$m.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c$m.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       PatchProxy.onMethodExit(c$m.class, "1");
       return;
    }
}
