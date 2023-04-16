package ec9.f0;
import erd.g;
import ec9.e0;
import cc9.k;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ec9.b1;
import ec9.k;
import sa6.b;
import cc9.q;
import java.util.HashMap;
import java.lang.Integer;
import cc9.p;
import java.lang.Number;
import android.content.Intent;
import com.kuaishou.android.model.music.Music;
import java.util.Map;
import java.util.List;

public final class f0 implements g	// class@002172
{
    public final e0 b;
    public final k c;

    public void f0(e0 p0,k p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "1")) {
       }else {
          b uob = this.b.a().j();
          Object obj = uob.i().get(Integer.valueOf(this.c.b()));
          if (!obj instanceof p) {
             obj = null;
          }
          Object obj1 = obj;
          if (obj1 != null) {
             uob.i().put(Integer.valueOf(this.c.b()), p.a(obj1, null, (int)(p0.getFirst().floatValue() * (float)100), p0.getSecond(), false, 9, null));
             if (uob.b() == this.c.b()) {
                this.b.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 239, null));
             }else {
                this.b.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 255, null));
             }
          }
       }
       return;
    }
}
