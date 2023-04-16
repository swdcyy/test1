package jn1.e;
import yh3.a;
import androidx.lifecycle.LiveData;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import jn1.e$a;
import z0.a;
import androidx.lifecycle.Transformations;
import jn1.e$b;
import jn1.e$c;
import jn1.e$d;
import jn1.e$e;
import jn1.e$f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import jn1.e$f$a;
import jn1.e$f$b;
import java.lang.Boolean;
import fn1.b;
import fn1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import msd.l;

public final class e extends a	// class@002bd9
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final k g;

    public void e(LiveData p0,k p1){
       a.p(p0, "dataProvider");
       a.p(p1, "detailMainVCDelegate");
       super();
       this.f = p0;
       this.g = p1;
       p0 = Transformations.map(p0, new e$a());
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.a = p0;
       LiveData liveData = Transformations.map(p0, new e$b());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.b = liveData;
       liveData = Transformations.map(p0, new e$c());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.c = liveData;
       liveData = Transformations.map(p0, new e$d());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.d = liveData;
       p0 = Transformations.map(p0, new e$e());
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.e = p0;
    }
    public final LiveData getText(){
       return this.c;
    }
    public void u0(e$f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       if (a.g(p0, e$f$a.a)) {
          this.v0(true);
       }else if(a.g(p0, e$f$b.a)){
          this.v0(false);
       }
       return;
    }
    public final void v0(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "2")) {
          return;
       }
       a.a.c(p0, "LIVE_HOTSPOT_DATAIL_HOT_INTRO", this.g.E0(), this.g.a(), null);
       return;
    }
}
