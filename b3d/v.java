package b3d.v;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import o56.a;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import java.lang.Boolean;
import z45.b;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.login.http.response.SharedAccountInfo;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;

public class v	// class@000347
{
    public static SharedAccountInfo a;

    public void v(){
       super();
    }
    public static Map a(){
       HashMap obj = PatchProxy.apply(null, null, v.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("kwaiRemoteDid", a.a);
       return obj;
    }
    public static boolean b(Context p0,LoginParams p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, v.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (v.f(p1)) {
          return false;
       }
       if (p1.mLoginSource == 127) {
          return false;
       }
       if (b.c(p0, "nebula_app")) {
          return true;
       }
       return false;
    }
    public static boolean c(Context p0,LoginParams p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, v.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (v.f(p1)) {
          return false;
       }
       if (p1 != null && p1.mLoginSource == 127) {
          return false;
       }
       if (!a.t().d("enableKwaiAppLogin", false)) {
          return false;
       }
       if (b.c(p0, "nebula_app")) {
          return true;
       }
       return false;
    }
    public static boolean d(){
       SharedAccountInfo obj = PatchProxy.apply(null, null, v.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = v.a;
       boolean b = (obj != null && obj.isValid())? true: false;
       return b;
    }
    public static boolean e(int p0,KwaiImageView p1,KwaiImageView p2,TextView p3){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, null, v.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       if (v.d()) {
          if (!PatchProxy.isSupport(ov) || !PatchProxy.applyVoidFourRefs(p1, p2, p3, Integer.valueOf(p0), null, v.class, "7")) {
             SharedAccountInfo a = v.a;
             if (a != null) {
                if (p1 != null) {
                   g.k(p1, a.convertToQUser(), HeadImageSize.MIDDLE);
                }
                if (p2 != null) {
                   if (p0 != 1) {
                      if (p0 != 2) {
                         if (p0 != 3) {
                            if (p0 == 4) {
                               i = 0x7f080d34;
                            }
                         }else {
                         label_006d :
                            i = 0x7f080d3a;
                         }
                      }else {
                         i = 0x7f080d2b;
                      }
                   }else {
                      goto label_006d ;
                   }
                   p2.setPlaceHolderImage(i);
                }
                if (p3 != null) {
                   p3.setText(v.a.getUserName());
                   ViewGroup$LayoutParams layoutParams = p3.getLayoutParams();
                   layoutParams.width = (int)((float)n.z(a.B) * 0x3f395810);
                   p3.setLayoutParams(layoutParams);
                }
             }
          }
          return true;
       }else {
          return i;
       }
    }
    public static boolean f(LoginParams p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, v.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null && ("initModule").equals(p0.mSourcePage)) {
          return b;
       }
       SharedAccountInfo a = v.a;
       if (a == null || !a.isValid()) {
          b = true;
       }
       return b;
    }
}
