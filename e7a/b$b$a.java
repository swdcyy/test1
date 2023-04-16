package e7a.b$b$a;
import ok.x;
import e7a.b$b;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dd5.m;
import e7a.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dd5.p;
import androidx.lifecycle.LifecycleOwner;
import dd5.a;
import dd5.n;

public final class b$b$a implements x	// class@00207c
{
    public final b$b b;

    public void b$b$a(b$b p0){
       this.b = p0;
       super();
    }
    public Object get(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       BaseFragment obj = PatchProxy.apply(objArray, this, b$b$a.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = b.P8(this.b.b);
          Object obj1 = PatchProxy.applyOneRefs(obj, objArray, p.class, "20");
          obj = (obj1 != patchProxyRe)? obj1: n.a(obj, p.q);
       }
       return obj;
    }
}
