package b68.a;
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

public class a extends c	// class@000315
{

    public void a(int p0,LaunchPageInfo p1,a p2,c p3){
       super(p0, p1, p2, p3);
    }
    public m g(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.A.a(this.e, this.g, true, true);
    }
}
