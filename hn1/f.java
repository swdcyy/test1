package hn1.f;
import yh3.a;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hn1.f$a;
import z0.a;
import androidx.lifecycle.Transformations;
import hn1.f$b;
import hn1.f$c;

public final class f extends a	// class@00272d
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;

    public void f(LiveData p0){
       a.p(p0, "dataProvider");
       super();
       p0 = Transformations.map(p0, new f$a());
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.a = p0;
       LiveData liveData = Transformations.map(p0, new f$b());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.b = liveData;
       p0 = Transformations.map(p0, new f$c());
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.c = p0;
    }
}
