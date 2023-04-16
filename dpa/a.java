package dpa.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.SharedPreferences;
import oe6.n;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.alarm.KwaiAlarm$Builder;
import android.app.Activity;
import com.yxcorp.utility.alarm.KwaiAlarm;
import android.content.SharedPreferences$Editor;

public class a	// class@0024d6
{

    public void a(){
       super();
    }
    public static String a(String p0){
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, a.class, "7");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       p0 = a.b(p0);
       obj1 = n.b().getString(p0, obj);
       StringBuilder str = "Key:"+p0;
       Object[] objArray = new Object[0];
       w.C().s("LiveSubscribe_AlarmClock", str+" 是否找到指定闹钟:"+obj1, objArray);
       return obj1;
    }
    public static String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return QCurrentUser.me().getId()+p0;
    }
    public static void c(String p0,String p1,KwaiAlarm$Builder p2,Activity p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "6")) {
          return;
       }
       KwaiAlarm.d(p2, p3);
       a.d(p0, p1);
       return;
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "8")) {
          return;
       }
       p0 = a.b(p0);
       Object[] objArray = new Object[0];
       w.C().s("LiveSubscribe_AlarmClock", "Key:"+p0+" 设置指定闹钟:"+p1, objArray);
       n.b().edit().putString(p0, p1);
       return;
    }
}
