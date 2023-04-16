package com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.util.GsonUtil;
import com.google.gson.Gson;
import com.kwai.video.wayne.player.config.ks_sub.KpMidConfigManager$INSTANCE_HOLDER;
import com.kwai.video.wayne.player.config.ks_sub.AbstractBaseConfig;
import java.util.Map;
import java.util.Locale;
import com.kwai.video.wayne.player.util.DebugLog;
import java.lang.InstantiationException;
import java.lang.IllegalAccessException;
import android.content.SharedPreferences;
import com.kwai.video.wayne.player.util.PreferenceUtil;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class KpMidConfigManager	// class@000cfa
{
    public final Map mConfigMap;
    public static final String TAG = "KpMidConfigManager";

    public void KpMidConfigManager(){
       super();
       this.mConfigMap = new HashMap(16);
    }
    public static Object deserialize(String p0,Type p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KpMidConfigManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GsonUtil.KP_MID_GSON.i(p0, p1);
    }
    public static KpMidConfigManager instance(){
       return KpMidConfigManager$INSTANCE_HOLDER.INSTANCE;
    }
    public static String serialize(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KpMidConfigManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return GsonUtil.KP_MID_GSON.q(p0);
    }
    public AbstractBaseConfig getConfig(String p0,Class p1){
       KpMidConfigManager obj = PatchProxy.applyTwoRefs(p0, p1, this, KpMidConfigManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mConfigMap;
       _monitor_enter(obj);
       AbstractBaseConfig uAbstractBas = this.mConfigMap.get(p0);
       if (uAbstractBas != null) {
          if (p1.equals(uAbstractBas.getClass())) {
             _monitor_exit(obj);
             return uAbstractBas;
          }else {
             Object[] objArray = new Object[]{p0,p1.getClass().getCanonicalName(),p1.getCanonicalName()};
             DebugLog.w(KpMidConfigManager.TAG, String.format(Locale.US, "[KpMidConfigManager.getConfig]maybe inner error, wrong type, for prefKey:%s, cached config class:%s, expect config class:%s", objArray));
          }
       }
       _monitor_exit(obj);
       try{
          AbstractBaseConfig uAbstractBas1 = this.loadConfig(p0, p1, p1.newInstance());
          obj = this.mConfigMap;
          _monitor_enter(obj);
          this.mConfigMap.put(p0, uAbstractBas1);
          _monitor_exit(obj);
          return uAbstractBas1;
       }catch(java.lang.IllegalAccessException e8){
          e8.printStackTrace();
       }catch(java.lang.InstantiationException e8){
          e8.printStackTrace();
       }
       return null;
    }
    public final Object loadConfig(String p0,Type p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KpMidConfigManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = "";
       if (PreferenceUtil.getConfigPrefernce() != null) {
          str = PreferenceUtil.getConfigPrefernce().getString(p0, str);
       }
       if (TextUtils.isEmpty(str)) {
          return p2;
       }else {
          p0 = KpMidConfigManager.deserialize(str, p1);
          if (p0 == null) {
             return p2;
          }else {
             return p0;
          }
       }
    }
    public void saveConfig(String p0,AbstractBaseConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KpMidConfigManager.class, "2")) {
          return;
       }
       if (PreferenceUtil.getConfigPrefernce() != null) {
          g.a(PreferenceUtil.getConfigPrefernce().edit().putString(p0, KpMidConfigManager.serialize(p1)));
       }
       KpMidConfigManager tmConfigMap = this.mConfigMap;
       _monitor_enter(tmConfigMap);
       this.mConfigMap.put(p0, p1);
       _monitor_exit(tmConfigMap);
       return;
    }
}
