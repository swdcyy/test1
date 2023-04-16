package com.kuaishou.live.core.voiceparty.ktv.singersetting.a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.StringBuilder;
import z12.e;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog$b;
import s81.a;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog$a;

public class a implements SeekBar$OnSeekBarChangeListener	// class@001534
{
    public final LiveVoicePartyKtvSingerSettingDialog b;

    public void a(LiveVoicePartyKtvSingerSettingDialog p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, a.class, "1")) {
          return;
       }
       this.b.u.setText(String.valueOf(p1));
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoicePartyKtvSinger", "onVoiceVolumeChanged\(»À…˘“Ù¡ø\): "+p0.getProgress(), stringArray);
       int progress = p0.getProgress();
       float f = (float)progress / 100.00f;
       this.b.M.c = f;
       a.L(f);
       LiveVoicePartyKtvSingerSettingDialog g = this.b.G;
       if (g != null) {
          g.a(progress);
       }
       return;
    }
}
