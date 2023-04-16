package gr1.b;
import er1.a;
import java.lang.String;
import dr1.f;
import java.lang.Object;
import kotlin.jvm.internal.a;
import gr1.b$a;
import gr1.b$c;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gr1.b$b;
import z0.a;
import androidx.lifecycle.Transformations;
import cu1.d;
import androidx.lifecycle.ViewModel;

public final class b extends a	// class@00256a
{
    public final Observer g;
    public final Observer h;
    public final String i;
    public final f j;

    public void b(String p0,f p1){
       a.p(p0, "userId");
       a.p(p1, "arenaLineModel");
       super();
       this.i = p0;
       this.j = p1;
       b$a uoa = new b$a(this);
       this.g = uoa;
       b$c uoc = new b$c(this);
       this.h = uoc;
       p1.e().observeForever(uoc);
       p1.d().observeForever(uoa);
    }
    public LiveData f(){
       LiveData obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Transformations.map(this.j.e(), new b$b());
       a.h(obj, "Transformations.map\(this\) { transform\(it\) }");
       return d.a(obj);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.onCleared();
       this.j.e().removeObserver(this.h);
       this.j.d().removeObserver(this.g);
       return;
    }
}
