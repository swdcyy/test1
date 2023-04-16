package n2a.i;
import q96.d;
import n2a.g;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import e17.i;
import q96.c;

public class i implements d	// class@0030d3
{
    public final g a;

    public void i(g p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,LocationCityInfo p1){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, i.class, "1")) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f100edf);
       i ta = this.a;
       ta.t = null;
       ta.u = null;
       return;
    }
    public void onError(int p0,String p1){
       i ta = this.a;
       ta.t = null;
       ta.u = null;
    }
    public void onFinish(){
       c.b(this);
    }
    public void onStart(){
       c.c(this);
    }
}
