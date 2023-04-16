package lld.e$d$a;
import t36.f$a;
import lld.e$d;
import java.lang.Integer;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Asset$b;
import java.io.File;
import maa.a;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Object;
import vpc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.CropOptions;
import kotlin.Pair;
import vpc.c;
import wba.z;
import com.kuaishou.edit.draft.c;
import com.kuaishou.edit.draft.AssetSegment;
import qrd.r0;
import java.util.HashMap;
import trd.t0;

public final class e$d$a implements f$a	// class@001c4a
{
    public final e$d a;
    public final Integer b;
    public final Asset c;
    public final Asset$b d;
    public final File e;
    public final a f;
    public final Size g;
    public final Size h;

    public void e$d$a(e$d p0,Integer p1,Asset p2,Asset$b p3,File p4,a p5,Size p6,Size p7){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       super();
    }
    public void apply(Object p0){
       AssetSegment uAssetSegmen;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d$a.class, "1")) {
       }else {
          e$d$a tc = this.c;
          a.o(tc, "asset");
          CropOptions cropOptions = tc.getCropOptions();
          a.o(cropOptions, "asset.cropOptions");
          e$d$a td = this.d;
          a.o(td, "builder");
          CropOptions cropOptions1 = td.getCropOptions();
          a.o(cropOptions1, "builder.cropOptions");
          p0.a(this.b.intValue(), cropOptions, cropOptions1);
          String absolutePath = this.e.getAbsolutePath();
          a.o(absolutePath, "assetOriginFile.absolutePath");
          p0.b(this.b.intValue(), absolutePath);
          Pair[] pairArray = new Pair[]{r0.a(this.a.d, new c(uAssetSegmen, this.g, this.h))};
          e$d$a td1 = this.d;
          a.o(td1, "builder");
          uAssetSegmen = z.a.i(td1, this.f);
          p0.d(t0.M(pairArray), 0);
       }
       return;
    }
}
