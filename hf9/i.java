package hf9.i;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import hf9.c;
import java.util.Objects;
import java.util.LinkedHashSet;

public final class i implements HGalleryLayoutManager$f	// class@002648
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final void a(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "1")) {
          return;
       }
       c e = c.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), e, c.class, "5")) {
          c.a.add(Integer.valueOf(p0));
       }
       return;
    }
}
