package b4d.g;
import erd.g;
import b4d.j;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class g implements g	// class@00036f
{
    public final j b;

    public void g(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "7")) {
       }else if(tb.t == null){
          tb.S8(true);
       }
       return;
    }
}
