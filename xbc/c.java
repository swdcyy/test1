package xbc.c;
import java.lang.Object;
import com.kwai.social.startup.relation.model.SocialShakeConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import mw4.a;
import com.kwai.social.startup.relation.model.EntranceConfig;
import android.app.Activity;
import lnc.a1;
import xbc.c$a;
import q96.d;
import o96.u;
import android.app.Application;
import o56.a;
import android.os.Vibrator;
import com.yxcorp.gifshow.relation.shake.ShakeConfData;
import xbc.a;

public class c	// class@0027e2
{
    public static a a;

    public void c(){
       super();
    }
    public static SocialShakeConfig a(){
       SocialShakeConfig obj = PatchProxy.apply(null, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.y(SocialShakeConfig.class);
       if (obj == null) {
          obj = new SocialShakeConfig(false, null);
       }
       return obj;
    }
    public static void b(String p0,Activity p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "10")) {
          return;
       }
       u.m("socialShake", a1.p(R.string.arg_RES_7f1049ac), a1.p(R.string.arg_RES_7f1049ab), false, false, new c$a(p0, p1), "socialShake", "socialShake", "socialShakeAlert");
       return;
    }
    public static void c(){
       if (PatchProxy.applyVoid(null, null, c.class, "9")) {
          return;
       }
       Vibrator systemServic = a.b().getSystemService("vibrator");
       ShakeConfData shakeConfDat = a.a();
       if (systemServic != null) {
          systemServic.vibrate((long)shakeConfDat.shakeDuration);
       }
       return;
    }
}
