package on1.c;
import yh3.a;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import on1.c$a;
import z0.a;
import androidx.lifecycle.Transformations;
import on1.c$b;
import on1.c$c;

public final class c extends a	// class@003547
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;

    public void c(LiveData p0){
       a.p(p0, "dataProvider");
       super();
       this.d = p0;
       p0 = Transformations.map(p0, new c$a(this));
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.a = p0;
       LiveData liveData = Transformations.map(p0, new c$b());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.b = liveData;
       p0 = Transformations.map(p0, new c$c());
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.c = p0;
    }
}
