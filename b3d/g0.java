package b3d.g0;
import java.lang.Object;
import lnc.i3;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.login.http.response.RefreshTokenResponse;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.u1;

public class g0	// class@000329
{

    public void g0(){
       super();
    }
    public static i3 a(){
       i3 obj = PatchProxy.apply(null, null, g0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("uid", QCurrentUser.me().getId());
       obj.d("local_token", QCurrentUser.me().getToken());
       obj.d("local_passToken", QCurrentUser.me().getPassToken());
       obj.d("local_apiServiceToken", QCurrentUser.me().getApiServiceToken());
       obj.d("local_h5ServiceToken", QCurrentUser.me().getH5ServiceToken());
       return obj;
    }
    public static void b(RefreshTokenResponse p0,boolean p1){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, og0, "8")) {
          return;
       }
       if (!TextUtils.x(p0.passToken) && (TextUtils.x(p0.apiServiceToken) || TextUtils.x(p0.h5ServiceToken))) {
          i3 oi3 = g0.a();
          oi3.d("passToken", p0.passToken);
          oi3.d("apiServiceToken", p0.apiServiceToken);
          oi3.d("h5ServiceToken", p0.h5ServiceToken);
          oi3.a("isNebula", Boolean.valueOf(p1));
          String str = oi3.e();
          u1.R("REFRESH_TOKEN_ERROR", str, 9);
       }
       return;
    }
    public static void c(){
       if (PatchProxy.applyVoid(null, null, g0.class, "3")) {
          return;
       }
       u1.R("RESTORE_TOKEN_ERROR", g0.a().e(), 9);
       return;
    }
}
