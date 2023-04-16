package jk9.c$c;
import androidx.recyclerview.widget.RecyclerView$r;
import jk9.c;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class c$c extends RecyclerView$r	// class@002af8
{
    public final c a;

    public void c$c(c p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       c$c uoc = c$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (!p1) {
          this.a.b();
       }
       return;
    }
}
