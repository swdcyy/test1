package mn1.d;
import yh3.a;
import mn1.d$d;
import nsd.u;
import androidx.lifecycle.LiveData;
import android.app.Activity;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mn1.d$a;
import z0.a;
import androidx.lifecycle.Transformations;
import mn1.d$b;
import mn1.d$c;

public final class d extends a	// class@0031d6
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final Activity e;
    public final k f;
    public static final d$d g;

    static {
       d.g = new d$d(null);
    }
    public void d(LiveData p0,Activity p1,k p2){
       a.p(p0, "dataProvider");
       a.p(p1, "activity");
       a.p(p2, "detailMainVCDelegate");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       p0 = Transformations.map(p0, new d$a());
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.a = p0;
       LiveData liveData = Transformations.map(p0, new d$b(this));
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.b = liveData;
       p0 = Transformations.map(p0, new d$c());
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.c = p0;
    }
}
