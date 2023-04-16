package da6.d;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import com.kuaishou.gifshow.platform.network.keyconfig.RecoDegradeConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.ResourcePreloadingConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.FeatureConfig;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class d	// class@001494
{
    public static final SharedPreferences a;

    static {
       d.a = b.b("FeatureConfigPrefs");
    }
    public static RecoDegradeConfig a(Type p0){
       String str = d.a.getString("RecoDegradeConfig", "null");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static ResourcePreloadingConfig b(Type p0){
       String str = d.a.getString("ResourcePreloadingConfig", "");
       if (str == null || str == "") {
          return null;
       }
       return b.a(str, p0);
    }
    public static void c(FeatureConfig p0){
       SharedPreferences$Editor uEditor = d.a.edit();
       uEditor.putBoolean("Mbusinesslogic1", p0.mBusinessLogic_1);
       uEditor.putString("DynamicTabs", b.e(p0.mDynamicTabs));
       uEditor.putString("GameCenterConfig", b.e(p0.mGameCenterConfig));
       uEditor.putString("GlobalPopup", b.e(p0.mGlobalPopup));
       uEditor.putString("LogControlConfig", b.e(p0.mLogControlConfig));
       uEditor.putString("PlayerConfig", b.e(p0.mPlayerConfig));
       uEditor.putString("RecoDegradeConfig", b.e(p0.mRecoDegradeConfig));
       uEditor.putString("ResourcePreloadingConfig", b.e(p0.mResourcePreloadingConfig));
       uEditor.putString("ZtGameConfig", b.e(p0.mZtGameConfig));
       g.a(uEditor);
    }
}
