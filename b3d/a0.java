package b3d.a0;
import ou5.a;
import com.kwai.feature.api.social.login.model.LoginParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.userlogin.LaunchLoginHelper;

public class a0 implements a	// class@00031a
{
    public final LoginParams a;

    public void a0(LoginParams p0){
       this.a = p0;
       super();
    }
    public void onDismiss(){
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       LaunchLoginHelper.a(this.a.mLoginSource);
       return;
    }
}
