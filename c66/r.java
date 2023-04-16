package c66.r;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import c66.q;
import ok.x;
import java.lang.Object;
import pa6.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class r extends ConfigAutoParseJsonConsumer	// class@000664
{

    public void r(){
       super(q.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
       }else {
          try{
             QCurrentUser.ME.updateBySystemStatResponse(p0);
          }catch(org.json.JSONException e3){
             ExceptionHandler.handleCaughtException(e3);
          }
       }
    }
}
