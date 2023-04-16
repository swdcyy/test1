package aq.a;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Long;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.l;

public final class a	// class@00020c
{

    public void a(){
       super();
    }
    public static String a(UserProfile p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.x(p0.mConstellation)) {
          return p0.mConstellation;
       }
       if (!TextUtils.x(p0.mBirthday)) {
          return l.b(a.b(), (Long.valueOf(p0.mBirthday).longValue() * 1000));
       }
       return "";
    }
}
