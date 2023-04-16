package com.kwai.video.wayne.player.util.PreferenceUtil;
import java.lang.Object;
import android.content.SharedPreferences;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.o;

public class PreferenceUtil	// class@000dc1
{
    public static SharedPreferences sConfigPreferences;

    public void PreferenceUtil(){
       super();
    }
    public static SharedPreferences getConfigPrefernce(){
       return PreferenceUtil.sConfigPreferences;
    }
    public static void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PreferenceUtil.class, "1")) {
          return;
       }
       PreferenceUtil.sConfigPreferences = o.c(p0, "KpMidPreference", 4);
       return;
    }
}
