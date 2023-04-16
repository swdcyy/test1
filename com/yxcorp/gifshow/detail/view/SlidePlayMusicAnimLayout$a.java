package com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout$MusicAnimIcon;
import android.util.SparseArray;
import java.util.LinkedList;

public class SlidePlayMusicAnimLayout$a extends AnimatorListenerAdapter	// class@001a64
{
    public final View a;
    public final SlidePlayMusicAnimLayout b;

    public void SlidePlayMusicAnimLayout$a(SlidePlayMusicAnimLayout p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayMusicAnimLayout$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(4);
       SlidePlayMusicAnimLayout$a tb = this.b;
       SlidePlayMusicAnimLayout$a ta = this.a;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(ta, tb, SlidePlayMusicAnimLayout.class, "7")) {
          Object tag = ta.getTag(R.id.viewtag);
          if (tag instanceof SlidePlayMusicAnimLayout$MusicAnimIcon) {
             LinkedList linkedList = tb.n.get(tag.mBackgroundResId);
             if (linkedList == null) {
                linkedList = new LinkedList();
                tb.n.put(tag.mBackgroundResId, linkedList);
             }
             linkedList.add(ta);
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayMusicAnimLayout$a.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.setVisibility(0);
       return;
    }
}
