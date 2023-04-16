package a96.a;
import com.kwai.bridge.context.AbsBridgeContext;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.content.Context;
import com.kuaishou.krn.c;

public class a extends AbsBridgeContext	// class@000043
{
    public LaunchModel h;

    public void a(LaunchModel p0){
       super();
       this.h = p0;
    }
    public String S(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h != null) {
          return this.h.a()+"\("+this.h.b()+"\)";
       }
       return objArray;
    }
    public String getBizId(){
       return "pre_request";
    }
    public Context getContext(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b().d();
    }
}
