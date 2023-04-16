package fy1.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveTopUserForbiddenInfo;
import wg3.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;

public class b	// class@0023db
{

    public void b(){
       super();
    }
    public static String a(int p0){
       LiveConfigStartupResponse$LiveTopUserForbiddenInfo obj1;
       b uob = b.class;
       Object obj = null;
       if (PatchProxy.isSupport(uob)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uob, "2");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = LiveConfigStartupResponse$LiveTopUserForbiddenInfo.class;
       String str = a.a.getString("liveTopUserForbiddenInfo", "");
       if (str != null && str != "") {
          obj = b.a(str, obj1);
       }
       if (obj == null || !p0) {
          return "";
       }else if(p0 == 1){
          return obj.mShopScoreLessToast;
       }else if(p0 == 2){
          return obj.mUserInfoUncomfortableToast;
       }else {
          return obj.mDefaultToast;
       }
    }
}
