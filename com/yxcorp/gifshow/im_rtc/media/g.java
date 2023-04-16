package com.yxcorp.gifshow.im_rtc.media.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.im_rtc.media.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import android.media.SoundPool$Builder;
import android.media.SoundPool;
import cxa.g;
import android.media.SoundPool$OnLoadCompleteListener;
import android.app.Application;
import o56.a;
import android.content.Context;

public final class g implements Runnable	// class@001939
{
    public final h b;

    public void g(h p0){
       this.b = p0;
    }
    public final void run(){
       g tb = this.b;
       _monitor_enter(tb);
       if (PatchProxy.applyVoid(null, tb, h.class, "5")) {
          _monitor_exit(tb);
       }else if(tb.c != null){
          c.c("IMRTCSound", "playSound, destroyed");
          _monitor_exit(tb);
       }else if(tb.a == null){
          tb.a = new SoundPool$Builder().setAudioAttributes(new AudioAttributes$Builder().setContentType(4).setUsage(5).build()).setMaxStreams(1).build();
       }
       tb.a.setOnLoadCompleteListener(new g(tb));
       tb.a.load(a.b(), R.raw.arg_RES_7f0f002a, 0);
       _monitor_exit(tb);
       return;
    }
}
