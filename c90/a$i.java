package c90.a$i;
import erd.g;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z80.b;

public final class a$i implements g	// class@000ced
{
    public final boolean b;

    public void a$i(boolean p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$i.class, "1")) {
       }else if(this.b != null){
          b.a.f("downloadAudio");
       }
       return;
    }
}
