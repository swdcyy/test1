package bb0.a0;
import erd.g;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.e;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import fb0.l;

public final class a0 implements g	// class@000252
{
    public final e b;

    public void a0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "7")) {
       }else if(("CLICK_INTELLIGENCT_ALBUM_THUMBNAIL").equals(p0)){
          tb.K = "click";
          tb.V8();
          tb.W8();
       }
       l.h(p0, l.n(tb.P8()));
       return;
    }
}
