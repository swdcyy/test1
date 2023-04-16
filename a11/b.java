package a11.b;
import androidx.lifecycle.ViewModelProvider$Factory;
import a11.a;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import a11.m;
import androidx.lifecycle.LiveData;
import ul2.s;
import a11.n;
import androidx.lifecycle.MutableLiveData;

public class b implements ViewModelProvider$Factory	// class@00001b
{
    public final a a;

    public void b(a p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       b ta = this.a;
       ta = this.a;
       ta = this.a;
       m om = new m(ta.m, ta.j.e(), this.a.j.d(), ta.a, ta.b, ta.j.f(), ta.d, ta.e, ta.f, ta.c);
       return p0;
    }
}
