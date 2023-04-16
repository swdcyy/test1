package com.yxcorp.gifshow.common_music_player.MusicListPlayerView$d;
import qm9.c0;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils;
import java.util.Map;
import qm9.i;

public final class MusicListPlayerView$d implements c0	// class@001187
{
    public final MusicListPlayerView a;

    public void MusicListPlayerView$d(MusicListPlayerView p0){
       this.a = p0;
       super();
    }
    public void a(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicListPlayerView$d.class, "1")) {
          return;
       }
       a.p(p0, "music");
       if (!MusicExperienceUtils.b() && p0.isSleepMusic()) {
          i.d(p0, "HOT", this.a.getMExtraLogParams(), this.a.getMExtPageName());
          MusicListPlayerView y = this.a.y;
          if (y != null) {
             y.a(p0);
          }
       }
       return;
    }
}
