package ha9.a;
import java.util.Collection;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.base.livedata.UpdateType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class a	// class@002578
{
    public int a;
    public int b;
    public Object c;
    public UpdateType d;
    public Collection e;

    public void a(Collection p0){
       a.q(p0, "collection");
       super();
       this.e = p0;
       this.a = -2;
    }
    public final int a(){
       return this.a;
    }
    public final Object b(){
       return this.c;
    }
    public final UpdateType c(){
       return this.d;
    }
    public final void d(int p0){
       this.a = p0;
    }
    public final void e(UpdateType p0){
       this.d = p0;
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
}
