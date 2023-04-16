package eg1.j$b;
import lz2.c;
import java.lang.Object;
import eg1.j$a;
import pz2.c;
import lz2.b;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import pz2.a;
import fg1.a;
import java.lang.Boolean;
import com.kuaishou.live.effect.resource.download.track.LiveEffectResCleanManager;

public class j$b implements c	// class@002153
{

    public void j$b(){
       super();
    }
    public void j$b(j$a p0){
       super();
    }
    public void a(c p0){
       b.a(this, p0);
    }
    public void e(List p0){
       b.f(this, p0);
    }
    public void g(c p0){
       b.e(this, p0);
    }
    public void h(c p0){
       b.d(this, p0);
    }
    public void i(c p0,boolean p1,String p2){
       b.c(this, p0, p1, p2);
    }
    public void j(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "1")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          String str = String.valueOf(uoc.b());
          boolean b = true;
          if (a.f(uoc) != b) {
             b = false;
          }
          uArrayList.add(new Pair(str, Boolean.valueOf(b)));
       }
       LiveEffectResCleanManager.f(uArrayList);
       return;
    }
}
