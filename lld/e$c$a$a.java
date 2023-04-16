package lld.e$c$a$a;
import t36.f$a;
import lld.e$c$a;
import com.kuaishou.edit.draft.Asset$b;
import nld.a;
import java.lang.Object;
import vpc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.Asset;
import kotlin.Pair;
import lld.e$c;
import vpc.c;
import wba.z;
import com.kuaishou.edit.draft.c;
import maa.a;
import com.kuaishou.edit.draft.AssetSegment;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import qrd.r0;
import java.util.HashMap;
import trd.t0;

public final class e$c$a$a implements f$a	// class@001c47
{
    public final e$c$a a;
    public final Asset$b b;
    public final a c;

    public void e$c$a$a(e$c$a p0,Asset$b p1,a p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void apply(Object p0){
       AssetSegment uAssetSegmen;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c$a$a.class, "1")) {
       }else {
          e$c$a g = this.a.g;
          a.o(g, "asset");
          CropOptions cropOptions = g.getCropOptions();
          a.o(cropOptions, "asset.cropOptions");
          e$c$a$a tb = this.b;
          a.o(tb, "builder");
          CropOptions cropOptions1 = tb.getCropOptions();
          a.o(cropOptions1, "builder.cropOptions");
          p0.a(this.a.f.intValue(), cropOptions, cropOptions1);
          p0.b(this.a.f.intValue(), this.c.b());
          Pair[] pairArray = new Pair[]{r0.a(this.a.b.d, new c(uAssetSegmen, this.a.h, new Size(this.c.a().getWidth(), this.c.a().getHeight())))};
          e$c$a$a tb1 = this.b;
          a.o(tb1, "builder");
          uAssetSegmen = z.a.i(tb1, this.a.c);
          p0.d(t0.M(pairArray), 0);
       }
       return;
    }
}
