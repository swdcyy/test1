package com.yxcorp.gifshow.common_music_player.MusicListPlayerView$c;
import qm9.e0;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import qm9.i;

public final class MusicListPlayerView$c implements e0	// class@001186
{
    public final MusicListPlayerView a;

    public void MusicListPlayerView$c(MusicListPlayerView p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,Music p1){
    }
    public void b(boolean p0,Music p1){
       MusicListPlayerView$c uoc = MusicListPlayerView$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "1")) {
          return;
       }
       i.d(this.a.getMCurrentMusic(), "PLAY", this.a.getMExtraLogParams(), this.a.getMExtPageName());
       return;
    }
    public void c(boolean p0,Music p1){
       MusicListPlayerView$c uoc = MusicListPlayerView$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       i.d(this.a.getMCurrentMusic(), "PAUSE", this.a.getMExtraLogParams(), this.a.getMExtPageName());
       return;
    }
}
