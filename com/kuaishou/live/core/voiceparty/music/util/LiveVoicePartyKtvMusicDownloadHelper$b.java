package com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$b;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$d;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import z12.e;
import xt2.d;
import java.lang.Runnable;
import android.os.Handler;
import xt2.c;
import java.lang.Throwable;
import xt2.f;
import xt2.b;
import java.lang.Integer;
import xt2.e;

public class LiveVoicePartyKtvMusicDownloadHelper$b implements LiveVoicePartyKtvMusicDownloadHelper$d	// class@0017ec
{
    public final LiveVoicePartyKtvMusicDownloadHelper b;

    public void LiveVoicePartyKtvMusicDownloadHelper$b(LiveVoicePartyKtvMusicDownloadHelper p0){
       this.b = p0;
       super();
    }
    public void A1(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvMusicDownloadHelper$b.class, "5")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoicePartyKtvMusicDownloadHelper", "on dispatch listener completed and current music name:"+p0.mName, stringArray);
       this.b.a.post(new d(this, p0));
       return;
    }
    public void F0(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvMusicDownloadHelper$b.class, "4")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoicePartyKtvMusicDownloadHelper", "on dispatch listener cancelled and current music name:"+p0.mName, stringArray);
       this.b.a.post(new c(this, p0));
       return;
    }
    public void P0(Music p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyKtvMusicDownloadHelper$b.class, "3")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoicePartyKtvMusicDownloadHelper", "on dispatch listener failed and current music name:"+p0.mName, stringArray);
       this.b.a.post(new f(this, p0, p1));
       return;
    }
    public void o2(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvMusicDownloadHelper$b.class, "1")) {
          return;
       }
       String[] stringArray = new String[0];
       e.c("LiveVoicePartyKtvMusicDownloadHelper", "on dispatch listener created and current music name:"+p0.mName, stringArray);
       this.b.a.post(new b(this, p0));
       return;
    }
    public void s1(Music p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveVoicePartyKtvMusicDownloadHelper$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveVoicePartyKtvMusicDownloadHelper$b.class, "2")) {
          return;
       }
       if (p2 < 0) {
          return;
       }
       this.b.a.post(new e(this, p0, p1, p2));
       return;
    }
}
