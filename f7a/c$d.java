package f7a.c$d;
import hka.a;
import f7a.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.component.tabs.panel.a;

public final class c$d implements a	// class@0022de
{
    public final c b;

    public void c$d(c p0){
       this.b = p0;
       super();
    }
    public boolean onBackPressed(){
       c obj = PatchProxy.apply(null, this, c$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.C;
       if (obj == null || obj.d() != true) {
          return false;
       }
       this.b.P8("BACK_BUTTON");
       return true;
    }
}
