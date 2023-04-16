package l66.d;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import byc.f;
import ll8.d;
import bwd.d;
import l5d.f;
import ll8.b;
import java.util.Set;

public class d	// class@001d48
{
    public Set a;

    public void d(){
       super();
       this.a = new HashSet();
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
       }else if(PatchProxy.applyVoidOneRefs(this, null, f.class, "1")){
          this.a(new d());
       }
       if (!PatchProxy.applyVoidOneRefs(this, null, f.class, "1")) {
          this.a(new b());
       }
       return;
    }
    public void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public Set b(){
       return this.a;
    }
}
