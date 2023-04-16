package gq1.s;
import gq1.r;
import lp3.a;
import androidx.collection.ArraySet;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gq1.r$b;
import java.util.Iterator;
import java.lang.Iterable;
import gq1.r$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class s extends a implements r	// class@00255f
{
    public r$b d;
    public final ArraySet e;

    public void s(){
       super();
       this.e = new ArraySet();
    }
    public void C5(int p0,JsonObject p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, os, "1")) {
          return;
       }
       a.p(p1, "animParam");
       os = this.d;
       if (os != null) {
          os.C5(p0, p1);
       }
       return;
    }
    public void Jo(){
       if (PatchProxy.applyVoid(null, this, s.class, "6")) {
          return;
       }
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void M7(r$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "5")) {
          return;
       }
       a.p(p0, "callback");
       this.e.remove(p0);
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, s.class, "7")) {
          return;
       }
       this.e.clear();
       this.d = null;
       return;
    }
    public void Ul(r$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "4")) {
          return;
       }
       a.p(p0, "callback");
       this.e.add(p0);
       return;
    }
    public boolean Y4(){
       s obj = PatchProxy.apply(null, this, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = (obj != null)? obj.Y4(): false;
       return b;
    }
    public void ye(r$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "2")) {
          return;
       }
       a.p(p0, "delegate");
       this.d = p0;
       return;
    }
}
