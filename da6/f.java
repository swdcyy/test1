package da6.f;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import com.kuaishou.gifshow.platform.network.keyconfig.PassportConfig;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class f	// class@001496
{
    public static final SharedPreferences a;

    static {
       f.a = b.b("PassportConfigPrefs");
    }
    public static boolean a(){
       return f.a.getBoolean("DisableAccountOperationFlag", false);
    }
    public static void b(PassportConfig p0){
       SharedPreferences$Editor uEditor = f.a.edit();
       uEditor.putBoolean("DisableAccountOperationFlag", p0.mDisableAccountOperationFlag);
       uEditor.putBoolean("EnableIspLogin", p0.mEnableIspLogin);
       uEditor.putBoolean("EnableSfAccountRequest", p0.mEnableSfAccountRequest);
       uEditor.putBoolean("HideQQ", p0.mHideQQ);
       uEditor.putBoolean("HideWx", p0.mHideWx);
       uEditor.putInt("SmsDelay", p0.mSmsDelay);
       uEditor.putLong("TokenRefreshInterval", p0.mTokenRefreshInterval);
       g.a(uEditor);
    }
}
