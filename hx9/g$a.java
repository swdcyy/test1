package hx9.g$a;
import com.kwai.component.tabs.panel.h$d;
import hx9.g;
import java.lang.Object;
import com.kwai.component.tabs.panel.h$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hx9.f;
import com.yxcorp.gifshow.entity.QPhoto;

public final class g$a implements h$d	// class@00272f
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public final h$b a(){
       Object obj = PatchProxy.apply(null, this, g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       g$a ta = this.a;
       return new f(ta, ta.l);
    }
}
