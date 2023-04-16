package aa9.c$a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import aa9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import u99.f;

public final class c$a	// class@000071
{
    public f a;
    public Boolean b;
    public final QPhoto c;
    public final BaseFragment d;

    public void c$a(QPhoto p0,BaseFragment p1){
       a.p(p0, "mPhoto");
       a.p(p1, "mBaseFragment");
       super();
       this.c = p0;
       this.d = p1;
       this.b = Boolean.FALSE;
    }
    public final c a(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
    public final c$a b(boolean p0){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.b = Boolean.valueOf(p0);
       return this;
    }
    public final c$a c(f p0){
       this.a = p0;
       return this;
    }
}
