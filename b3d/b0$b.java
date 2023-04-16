package b3d.b0$b;
import ou5.a;
import com.kwai.feature.api.social.login.model.LoginParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.userlogin.LaunchLoginHelper;

public class b0$b implements a	// class@00031d
{
    public final LoginParams a;

    public void b0$b(LoginParams p0){
       this.a = p0;
       super();
    }
    public void onDismiss(){
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, b0$b.class, "1")) {
          return;
       }
       LaunchLoginHelper.a(this.a.mLoginSource);
       return;
    }
}
