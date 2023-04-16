package nn1.n;
import nn1.a;
import androidx.lifecycle.LiveData;
import msd.p;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nn1.n$a;
import z0.a;
import androidx.lifecycle.Transformations;
import nn1.n$b;
import nn1.n$c;
import nn1.n$d;
import nn1.n$e;

public final class n extends a	// class@003392
{
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final LiveData g;
    public final LiveData h;
    public final LiveData i;
    public final p j;
    public final k k;

    public void n(LiveData p0,p p1,k p2){
       a.p(p0, "dataProvider");
       a.p(p1, "clickHandler");
       a.p(p2, "detailMainVCDelegate");
       super(p0, p1, p2);
       this.i = p0;
       this.j = p1;
       this.k = p2;
       LiveData liveData = Transformations.map(p0, new n$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.d = liveData;
       liveData = Transformations.map(p0, new n$b());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.e = liveData;
       liveData = Transformations.map(p0, new n$c());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.f = liveData;
       liveData = Transformations.map(p0, new n$d());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.g = liveData;
       p0 = Transformations.map(p0, new n$e());
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.h = p0;
    }
}
