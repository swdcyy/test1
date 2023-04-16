package com.kuaishou.live.playeradapter.config.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kuaishou.live.playeradapter.config.a;
import ok.x;
import java.lang.Object;
import mj3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gj3.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@000d46
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else if(p0 == null){
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("enable_live_guest_rt_qos_log", p0.mEnableLiveGuestRTQosLog);
          uEditor.putLong("live_guest_rt_qos_interval", p0.mLiveGuestRTQosInterval);
          uEditor.putString("media_player_config", p0.mMediaPlayerConfig);
          g.a(uEditor);
       }
       return;
    }
}
