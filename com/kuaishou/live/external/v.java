package com.kuaishou.live.external.v;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kuaishou.live.external.LiveSettingsActivity;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class v implements SlipSwitchButton$b	// class@001bc0
{
    public static final v a;

    static {
       v.a = new v();
    }
    public void v(){
       super();
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("live_play_follow_user_photo_feed_notice_setting_switch", p1);
       g.a(uEditor);
    }
}
