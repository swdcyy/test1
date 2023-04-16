package av2.b;
import com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedList;
import av2.b$a;
import com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Bitmap;
import cm1.a;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import z12.e;
import com.yxcorp.gifshow.models.Gift;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.System;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.kuaishou.live.core.voiceparty.giftanimation.a;
import android.animation.Animator$AnimatorListener;

public final class b	// class@0002d0
{
    public boolean a;
    public final LinkedList b;
    public final VoicePartyGiftAnimationView$c c;
    public final VoicePartyGiftAnimationView d;

    public void b(VoicePartyGiftAnimationView p0){
       a.p(p0, "attachedView");
       super();
       this.d = p0;
       this.b = new LinkedList();
       b$a uoa = new b$a(this);
       this.c = uoa;
       p0.setOnGiftAnimationEndListener(uoa);
    }
    public final void a(){
       boolean b;
       String[] stringArray;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, b.class, str)) {
          return;
       }
       if (this.a == null) {
          Integer integer = this.b.poll();
          if (integer != null) {
             b = true;
             this.a = b;
             b td = this.d;
             int i = integer.intValue();
             Objects.requireNonNull(td);
             if (!PatchProxy.isSupport(VoicePartyGiftAnimationView.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), td, VoicePartyGiftAnimationView.class, "2") && td.e == null)) {
                if (PatchProxy.isSupport(VoicePartyGiftAnimationView.class)) {
                   Bitmap obj = PatchProxy.applyOneRefs(Integer.valueOf(i), td, VoicePartyGiftAnimationView.class, "4");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else {
                   label_0066 :
                      obj = a.b(i);
                      if (obj != null) {
                         td.b.setImageDrawable(new BitmapDrawable(td.getResources(), obj));
                         stringArray = new String[b];
                         stringArray[0] = String.valueOf(i);
                         e.c("VoicePartyGiftAnimationView", "onBindGiftBitmapSucceed: ", stringArray);
                      }else {
                         Gift gift = a.a(i);
                         if (gift != null) {
                            Gift mImageUrl = gift.mImageUrl;
                            if (mImageUrl != null && !mImageUrl.isEmpty()) {
                               td.b.P(gift.mImageUrl);
                               stringArray = new String[b];
                               stringArray[0] = String.valueOf(i);
                               e.c("VoicePartyGiftAnimationView", "onBindGiftImageUrlSucceed ", stringArray);
                            }
                         }
                         String[] stringArray1 = new String[b];
                         stringArray1[0] = String.valueOf(i);
                         e.c("VoicePartyGiftAnimationView", "onBindGiftFailed", stringArray1);
                         b = false;
                      }
                   }
                }else {
                   goto label_0066 ;
                }
                if (b && !PatchProxy.applyVoid(objArray, td, VoicePartyGiftAnimationView.class, str)) {
                   if ((System.currentTimeMillis() - td.f) - 3000 < 0) {
                      b.P(LiveVoicePartyLogTag.MIC_SEATS_MANAGE.appendTag("VoicePartyGiftAnimationView"), "play duration not available");
                      VoicePartyGiftAnimationView d = td.d;
                      if (d != null) {
                         d.a();
                      }
                   }else {
                      td.f = System.currentTimeMillis();
                      ObjectAnimator fadeInTransl = td.getFadeInTranslateAnimator();
                      ObjectAnimator fadeInAnimat = td.getFadeInAnimator();
                      ObjectAnimator fadeOutAnima = td.getFadeOutAnimator();
                      VoicePartyGiftAnimationView c = td.c;
                      if (c != null && c.isRunning()) {
                         td.c.cancel();
                      }
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      td.c = uAnimatorSet;
                      uAnimatorSet.play(fadeInAnimat).before(fadeOutAnima).with(fadeInTransl);
                      td.c.addListener(new a(td));
                      td.c.start();
                   }
                }
             }
          }
       }
    label_0129 :
       return;
    }
}
