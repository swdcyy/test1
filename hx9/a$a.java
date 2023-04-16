package hx9.a$a;
import com.kwai.component.tabs.panel.h$d;
import hx9.a;
import java.lang.Object;
import com.kwai.component.tabs.panel.h$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hx9.d;
import com.kwai.component.tabs.panel.h;

public final class a$a implements h$d	// class@00271c
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public final h$b a(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(this.a);
    }
}
