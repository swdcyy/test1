package d2d.w;
import ov5.b;
import com.yxcorp.login.userlogin.pluginimpl.LoginPluginImpl;
import erd.g;
import java.lang.Object;
import java.util.Objects;
import java.lang.Boolean;
import o1d.a;
import java.lang.Exception;

public final class w implements b	// class@001468
{
    public final LoginPluginImpl a;
    public final g b;

    public void w(LoginPluginImpl p0,g p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void onResult(boolean p0){
       w ta = this.a;
       w tb = this.b;
       Objects.requireNonNull(ta);
       if (p0) {
          ta.q0();
       }
       try{
          tb.accept(Boolean.valueOf(p0));
          a.e();
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
}
