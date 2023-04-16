package z66.a;
import gg.b;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import rg.d;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class a implements b	// class@0028fd
{
    public Context a;

    public void a(Context p0){
       super();
       this.a = p0;
    }
    public String a(String p0){
       return null;
    }
    public boolean b(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       try{
          d.a(this.a, p0);
          return true;
       }catch(java.lang.Exception e3){
          ExceptionHandler.handleCaughtException(e3);
          return false;
       }
    }
    public int c(){
       return 0;
    }
}
