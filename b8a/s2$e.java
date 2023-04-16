package b8a.s2$e;
import erd.g;
import b8a.s2;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class s2$e implements g	// class@0003ea
{
    public final s2 b;

    public void s2$e(s2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s2$e.class, "1")) {
       }else if(p0.intValue() > 0 && this.b.S8()){
          this.b.Y8();
       }
       return;
    }
}
