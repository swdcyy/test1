package com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment$Tab;
import java.lang.Enum;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.music.cloudmusic.bubble.MusicBubbleItem;
import ra9.c;
import android.view.View;
import com.yxcorp.gifshow.music.cloudmusic.j;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;

public class PostMusicTabHostFragment$b implements ViewTreeObserver$OnPreDrawListener	// class@001fe9
{
    public final PostMusicTabHostFragment b;

    public void PostMusicTabHostFragment$b(PostMusicTabHostFragment p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       Object obj = PatchProxy.apply(null, this, PostMusicTabHostFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.t.g.getViewTreeObserver().removeOnPreDrawListener(this);
       int i = this.b.yh(PostMusicTabHostFragment$Tab.KTV_RN.name());
       if (i >= 0 && i < this.b.t.g.getChildCount()) {
          b uob = new b(MusicBubbleItem.KTV_ENTRY_MOVE);
          uob.b(this.b.t.g.getChildAt(i));
          uob.k(new j(this));
          this.b.D.n(uob);
       }
       return true;
    }
}
