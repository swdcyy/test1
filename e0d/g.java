package e0d.g;
import com.yxcorp.image.fresco.wrapper.a$f;
import p0d.j;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import com.facebook.imagepipeline.memory.BasePool;
import android.util.SparseArray;
import ed.f;
import java.lang.StringBuilder;
import java.lang.Integer;
import ed.w;
import com.facebook.imagepipeline.memory.BasePool$a;

public final class g implements a$f	// class@001508
{
    public final j a;

    public void g(j p0){
       this.a = p0;
    }
    public final int getSizeInBytes(){
       int i;
       g ta = this.a;
       Objects.requireNonNull(ta);
       HashMap obj = PatchProxy.apply(null, ta, j.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          j a = ta.a;
          if (a == null) {
             a.S("mBasePool");
          }
          _monitor_enter(a);
          obj = new HashMap();
          for (int i1 = 0; i1 < a.d.size(); i1 = i1 + 1) {
             obj.put("buckets_used_"+a.v(a.d.keyAt(i1)), Integer.valueOf(a.d.valueAt(i1).d()));
          }
          obj.put("soft_cap", Integer.valueOf(a.c.b));
          obj.put("hard_cap", Integer.valueOf(a.c.a));
          obj.put("used_count", Integer.valueOf(a.g.a));
          obj.put("used_bytes", Integer.valueOf(a.g.b));
          obj.put("free_count", Integer.valueOf(a.h.a));
          obj.put("free_bytes", Integer.valueOf(a.h.b));
          _monitor_exit(a);
          Integer integer = obj.get("used_bytes");
          if (integer != null) {
             i = integer.intValue();
          }else {
             i = 0;
          }
       }
       return i;
    }
}
