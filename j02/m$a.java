package j02.m$a;
import androidx.lifecycle.ViewModelProvider$Factory;
import j02.m;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import j02.o;
import j02.m$a$a;
import hf3.a;
import aq5.d;
import xp5.g;
import vq5.d;
import xp5.i;
import jv1.b;
import z1.k;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class m$a implements ViewModelProvider$Factory	// class@002a23
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       m$a obj = PatchProxy.applyOneRefs(p0, this, m$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "aClass");
       if (!a.g(p0, o.class)) {
          throw new IllegalArgumentException("unsupported ViewModel class "+p0);
       }
       obj = this.a;
       o oo = new o(obj.m, obj.p, obj.n, obj.o, obj.q, obj.s, new m$a$a(this));
       return p0;
    }
}
