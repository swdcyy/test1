package com.kwai.video.stannis.utils.ContextUtils;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalArgumentException;

public class ContextUtils	// class@000c7a
{
    public static Context applicationContext;

    public void ContextUtils(){
       super();
    }
    public static Context getApplicationContext(){
       return ContextUtils.applicationContext;
    }
    public static void initialize(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ContextUtils.class, "1")) {
          return;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
       }
       ContextUtils.applicationContext = p0;
       return;
    }
}
