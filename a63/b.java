package a63.b;
import erd.g;
import com.kuaishou.live.gzone.v2.imagepreview.g;
import java.lang.Object;
import a63.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class b implements g	// class@000052
{
    public final g b;

    public void b(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, g.class, "7")) {
       }else if(p0.a != null){
          tb.P8(0);
       }else {
          tb.P8(4);
       }
       return;
    }
}
