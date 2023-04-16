package i6a.r$b;
import erd.g;
import i6a.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class r$b implements g	// class@0027ad
{
    public final r b;

    public void r$b(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r$b.class, "1")) {
       }else if(!p0.booleanValue()){
          this.b.R8(true);
       }
       PatchProxy.onMethodExit(r$b.class, "1");
       return;
    }
}
