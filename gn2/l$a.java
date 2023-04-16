package gn2.l$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import gn2.l;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mn2.c;
import android.app.Application;
import o56.a;
import jn2.d;

public class l$a implements ViewModelProvider$Factory	// class@002b58
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, l$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new c(this.a.k, a.b());
    }
}
