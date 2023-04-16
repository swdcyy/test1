package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.kuaishou.live.widget.LiveLottieAnimationView;

public final class LiveLiteGiftBoxSideBarItem$ViewHolder$a extends AnimatorListenerAdapter	// class@001dcb
{
    public final LiveLiteGiftBoxSideBarItem$ViewHolder a;

    public void LiveLiteGiftBoxSideBarItem$ViewHolder$a(LiveLiteGiftBoxSideBarItem$ViewHolder p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftBoxSideBarItem$ViewHolder$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.d().setVisibility(0);
       this.a.b().setVisibility(8);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftBoxSideBarItem$ViewHolder$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.b().setVisibility(0);
       this.a.d().setVisibility(8);
       return;
    }
}
