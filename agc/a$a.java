package agc.a$a;
import qh7.b;
import java.lang.String;
import agc.c;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.schema.ActionSchemaException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import agc.a;

public class a$a implements b	// class@000118
{
    public final String a;
    public final c b;

    public void a$a(String p0,c p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a uoa = 200;
       if (p0.a != uoa) {
          Log.g("ActionSchemeJumper", "plc scheme krouter route result:"+p0.a+", url:"+this.a);
          ExceptionHandler.handleCaughtException(new ActionSchemaException("action scheme jumper error for KRouter! code is:"+p0.a));
       }
       a$a tb = this.b;
       if (tb != null) {
          if (p0.a == uoa) {
             a.e(tb);
          }else if(PatchProxy.applyVoidTwoRefs(tb, p0, null, a.class, "6")){
             try{
                tb.a(p0);
             }catch(java.lang.Exception e5){
                ExceptionHandler.handleCaughtException(e5);
             }
          }
       }
    }
}
