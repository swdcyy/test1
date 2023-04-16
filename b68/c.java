package b68.c;
import a68.c;
import com.mini.app.model.page.LaunchPageInfo;
import e68.a;
import h88.c;
import m68.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.mini.app.runtime.f;
import com.mini.app.starter.g;

public class c extends c	// class@000317
{

    public void c(int p0,LaunchPageInfo p1,a p2,c p3){
       super(p0, p1, p2, p3);
    }
    public m g(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.A.d(this.e);
    }
}
