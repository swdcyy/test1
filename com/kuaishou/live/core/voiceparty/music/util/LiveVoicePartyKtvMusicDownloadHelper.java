package com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$b;
import android.os.Handler;
import android.os.Looper;
import t45.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingDeque;
import hkd.b;
import java.lang.String;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.io.File;
import ojd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xt2.a;
import com.kwai.framework.network.util.HttpDownloadUtil;
import java.io.IOException;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$d;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$c;
import java.lang.Runnable;
import java.util.List;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$e;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$Status;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;

public class LiveVoicePartyKtvMusicDownloadHelper	// class@0017f0
{
    public final Handler a;
    public final ThreadPoolExecutor b;
    public final List c;
    public final LiveVoicePartyKtvMusicDownloadHelper$b d;
    public final List e;

    public void LiveVoicePartyKtvMusicDownloadHelper(){
       super();
       this.c = new ArrayList();
       this.e = new ArrayList();
       this.d = new LiveVoicePartyKtvMusicDownloadHelper$b(this);
       this.a = new Handler(Looper.getMainLooper());
       e uoe = new e(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingDeque(), new b("ktv-music-download-pool"));
       this.b = v0;
       v0.allowCoreThreadTimeOut(true);
    }
    public static void b(String[] p0,File p1,f p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, LiveVoicePartyKtvMusicDownloadHelper.class, "4")) {
          return;
       }
       int len = p0.length;
       int i = 0;
    label_0011 :
       if (i >= len) {
          throw new IOException(p0.toString());
       }
       object oobject = p0[i];
       try{
          HttpDownloadUtil.e(oobject, p1, new a(p2), 0x3a98);
          return;
       }catch(java.io.IOException e0){
          i = i + 1;
          goto label_0011 ;
       }
    }
    public void a(Music p0,LiveVoicePartyKtvMusicDownloadHelper$d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyKtvMusicDownloadHelper.class, "1")) {
          return;
       }
       LiveVoicePartyKtvMusicDownloadHelper$c uoc = new LiveVoicePartyKtvMusicDownloadHelper$c(p0, this.d);
       this.b.execute(uoc);
       this.c.add(uoc);
       this.e.add(new LiveVoicePartyKtvMusicDownloadHelper$e(p0, LiveVoicePartyKtvMusicDownloadHelper$Status.WAITING, p1, null));
       this.d.o2(p0);
       return;
    }
    public int c(Music p0){
       LiveVoicePartyKtvMusicDownloadHelper$e uoe;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyKtvMusicDownloadHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.e.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return 0;
          }
          uoe = obj.next();
          if (uoe.a.equals(p0)) {
             break ;
          }
       }
       return uoe.c;
    }
    public LiveVoicePartyKtvMusicDownloadHelper$Status d(Music p0){
       LiveVoicePartyKtvMusicDownloadHelper$e uoe;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyKtvMusicDownloadHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uoe = obj.next();
          if (uoe.a.equals(p0)) {
             break ;
          }
       }
       return uoe.b;
    }
}
