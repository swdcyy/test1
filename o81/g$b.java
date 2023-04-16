package o81.g$b;
import o81.g;
import java.lang.Object;
import o81.c;
import cp3.b;
import o81.h;
import cp3.a;
import com.kuaishou.live.richtext.segment.IconSegmentDecoder;
import com.kuaishou.live.materialresource.LiveMaterialResourceManager;
import java.util.Objects;
import o81.i;
import cp3.f;

public class g$b	// class@0034ad
{
    public final IconSegmentDecoder a;
    public final b b;
    public final g c;

    public void g$b(g p0){
       super();
       this.c = p0;
       this.b = new b(new h(p0.g()));
       LiveMaterialResourceManager h = LiveMaterialResourceManager.h;
       Objects.requireNonNull(h);
       this.a = new IconSegmentDecoder(new i(h));
    }
}
