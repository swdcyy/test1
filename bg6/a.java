package bg6.a;
import com.kwai.sdk.etools_api.IDayNightSetting;
import com.kwai.framework.ui.effictools.FloatToolsInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zf6.i;
import zf6.k$b;
import com.kwai.robust.PatchProxyResult;
import bg6.a$a;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Boolean;
import android.content.SharedPreferences;
import km8.b;
import java.lang.Integer;
import xf6.l;

public class a implements IDayNightSetting	// class@000499
{
    public final FloatToolsInitModule a;

    public void a(FloatToolsInitModule p0){
       this.a = p0;
       super();
    }
    public void forceOpenDayNightEntrance(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       i.b = 1;
       return;
    }
    public k$b getUiProvider(){
       Object obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$a(this);
    }
    public String getUserId(){
       Object obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return QCurrentUser.me().getId();
    }
    public boolean hasDarkModeSettingEntrance(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.a();
    }
    public boolean isDarkWhiteCommentEnable(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.b();
    }
    public boolean isHitDarkMode(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.c();
    }
    public boolean isHitDarkModeDefaultDisableAndPopupGroup(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (i.b == 2)? true: false;
       return b;
    }
    public boolean isHitDarkModeDefaultEnableGroup(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return i.d();
    }
    public SharedPreferences onGotSharePreference(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c("DayNightSettings", 0);
    }
    public void onWriteExperimentCache(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "7")) {
          return;
       }
       l.i("key_dark_mode_experiment", p0);
       return;
    }
}
