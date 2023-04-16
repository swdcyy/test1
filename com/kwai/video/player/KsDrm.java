package com.kwai.video.player.KsDrm;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import android.content.Context;

public class KsDrm	// class@000ad1
{
    public static final String APP_CONFIG = "wasabi";
    public static final String TAG = "KsDrm";
    public static Context mContext;
    public static String path;

    public void KsDrm(){
       super();
    }
    public static synchronized String getMarlindrmPath(){
       _monitor_enter(KsDrm.class);
       String obj = PatchProxy.apply(null, null, KsDrm.class, "1");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(KsDrm.class);
          return obj;
       }else {
          obj = KsDrm.path;
          if (obj != null) {
             _monitor_exit(KsDrm.class);
             return obj;
          }else {
             try{
                KsDrm.path = KsDrm.mContext.getDir("wasabi", 0).getAbsolutePath();
                _monitor_exit(e0);
                return KsDrm.path;
             }catch(java.lang.Exception e0){
             }
          }
       }
    }
    public static void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KsDrm.class, "2")) {
          return;
       }
       KsDrm.mContext = p0.getApplicationContext();
       return;
    }
}
