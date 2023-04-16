package c03.k$a;
import e03.a$a;
import c03.k;
import java.lang.Object;
import java.util.HashMap;
import java.util.List;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;

public class k$a implements a$a	// class@000491
{
    public final a$a a;
    public int b;
    public final Map c;
    public final k d;

    public void k$a(k p0,a$a p1,int p2){
       this.d = p0;
       super();
       this.c = new HashMap();
       this.a = p1;
       this.b = p2;
       if (!p2) {
          b.r(p0.a, "[checkDependResourceReady] liveDependencyResource resList size <= 0");
          p1.b(true);
       }
       return;
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.c.putAll(p0);
       }
       return;
    }
    public void b(boolean p0){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0) {
          int i = this.b - 1;
          this.b = i;
          if (!i) {
             b.Z(LiveLogTag.PARALLEL_EFFECT, "onAllResourceCheck: true");
             this.a.a(this.c);
             this.a.b(1);
          }
       }else if(this.b != null){
          b.Z(LiveLogTag.PARALLEL_EFFECT, "onAllResourceCheck: false");
          this.b = 0;
          this.a.b(0);
       }
       return;
    }
}
