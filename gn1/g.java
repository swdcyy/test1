package gn1.g;
import yh3.a;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import gn1.g$a;
import z0.a;
import androidx.lifecycle.Transformations;
import gn1.g$b;
import gn1.g$c;
import gn1.g$d;
import gn1.g$e;
import gn1.g$f;
import gn1.g$g;

public final class g extends a	// class@00252c
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final LiveData g;
    public final LiveData h;

    public void g(Resources p0,LiveData p1){
       a.p(p0, "resource");
       a.p(p1, "dataProvider");
       super();
       this.h = p1;
       p1 = Transformations.map(p1, new g$a());
       a.h(p1, "Transformations.map\(this\) { transform\(it\) }");
       this.a = p1;
       LiveData liveData = Transformations.map(p1, new g$b());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.b = liveData;
       liveData = Transformations.map(p1, new g$c());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.c = liveData;
       liveData = Transformations.map(p1, new g$d());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.d = liveData;
       LiveData liveData1 = Transformations.map(p1, new g$e(p0));
       a.h(liveData1, "Transformations.map\(this\) { transform\(it\) }");
       this.e = liveData1;
       liveData1 = Transformations.map(p1, new g$f());
       a.h(liveData1, "Transformations.map\(this\) { transform\(it\) }");
       this.f = liveData1;
       liveData1 = Transformations.map(p1, new g$g());
       a.h(liveData1, "Transformations.map\(this\) { transform\(it\) }");
       this.g = liveData1;
    }
}
