package com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kob.k;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment$Tab;
import java.lang.Enum;
import com.yxcorp.gifshow.util.rx.RxBus;
import yob.e;
import k2b.e0;
import jqb.k;

public class PostMusicTabHostFragment$a extends ViewPager$l	// class@001fe8
{
    public final PostMusicTabHostFragment b;

    public void PostMusicTabHostFragment$a(PostMusicTabHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       PostMusicTabHostFragment$a uoa = PostMusicTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       k.D().w("PostMusicTabHostFragment", "onPageSelected position is "+p0, objArray);
       PostMusicTabHostFragment$Tab mUSIC = PostMusicTabHostFragment$Tab.MUSIC;
       if (p0 == mUSIC.ordinal()) {
          RxBus.f.b(new e(mUSIC));
          k.n(this.b, "music");
       }else {
          mUSIC = PostMusicTabHostFragment$Tab.KTV_RN;
          if (p0 == mUSIC.ordinal()) {
             RxBus.f.b(new e(mUSIC));
             k.n(this.b, "karaoke");
          }
       }
       return;
    }
}
