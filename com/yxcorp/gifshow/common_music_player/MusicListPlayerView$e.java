package com.yxcorp.gifshow.common_music_player.MusicListPlayerView$e;
import com.kwai.library.widget.viewpager.RecyclerViewPager$c;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import g9c.a;
import com.kuaishou.android.model.music.Music;
import kotlin.jvm.internal.a;
import kob.r;
import java.util.Map;
import qm9.i;

public final class MusicListPlayerView$e implements RecyclerViewPager$c	// class@001188
{
    public final MusicListPlayerView a;

    public void MusicListPlayerView$e(MusicListPlayerView p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       MusicListPlayerView$e uoe = MusicListPlayerView$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       if (!this.a.d()) {
          return;
       }
       MusicListPlayerView i = this.a.i;
       Music music = (i != null)? i.N0(p0): null;
       if (music != null && (a.g(music, this.a.getMCurrentMusic()) ^ 0x01)) {
          String uniqueCode = music.getUniqueCode();
          a.h(uniqueCode, "music.uniqueCode");
          r mMusicListPl = this.a.getMMusicListPlayerController();
          if (mMusicListPl != null) {
             mMusicListPl.qI(uniqueCode);
          }
          r mMusicListPl1 = this.a.getMMusicListPlayerController();
          if (mMusicListPl1 != null) {
             mMusicListPl1.start();
          }
          if (p0 > p1) {
             i.d(this.a.getMCurrentMusic(), "LEFT", this.a.getMExtraLogParams(), this.a.getMExtPageName());
          }else {
             i.d(this.a.getMCurrentMusic(), "RIGHT", this.a.getMExtraLogParams(), this.a.getMExtPageName());
          }
       }
       return;
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
}
