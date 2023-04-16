package nn1.h;
import nn1.a;
import androidx.lifecycle.LiveData;
import msd.p;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nn1.h$a;
import z0.a;
import androidx.lifecycle.Transformations;
import nn1.h$b;
import nn1.h$c;
import nn1.h$d;

public final class h extends a	// class@003387
{
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final LiveData g;
    public final LiveData h;
    public final p i;
    public final k j;

    public void h(LiveData p0,p p1,k p2){
       a.p(p0, "dataProvider");
       a.p(p1, "clickHandler");
       a.p(p2, "detailMainVCDelegate");
       super(p0, p1, p2);
       this.h = p0;
       this.i = p1;
       this.j = p2;
       LiveData liveData = Transformations.map(p0, new h$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.d = liveData;
       liveData = Transformations.map(p0, new h$b());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.e = liveData;
       liveData = Transformations.map(p0, new h$c());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.f = liveData;
       p0 = Transformations.map(p0, new h$d());
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.g = p0;
    }
}
