package nl0.a$d;
import erd.g;
import nl0.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import nl0.b;
import com.yxcorp.gifshow.commercial.adsdk.model.AdLogAltData;
import com.kuaishou.android.model.feed.k;

public final class a$d implements g	// class@003352
{
    public final a b;
    public final BaseFeed c;

    public void a$d(a p0,BaseFeed p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          j0.f("AdLogTrackHelper", "requestTrackData suc", objArray);
          if (p0.a().a() == null) {
             p0 = this.b;
             p0.d = p0.d + 1;
             p0.c(i);
             p0 = new Object[i];
             j0.c("AdLogTrackHelper", "it.body\(\).data is null", p0);
          }else {
             AdLogAltData uAdLogAltDat = p0.a().a();
             uAdLogAltDat = (uAdLogAltDat != null)? uAdLogAltDat.mSourceType: null;
             if (uAdLogAltDat != null) {
                this.b.c(3);
                k.M(this.c, "adAltData", p0.a().a());
                this.b.d();
             }else {
                p0 = this.b;
                p0.d = p0.d + 1;
                p0.c(i);
                p0 = new Object[i];
                j0.c("AdLogTrackHelper", "buildKuaishouConfig sourceType is 0", p0);
             }
          }
       }
       return;
    }
}
