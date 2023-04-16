package av2.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import zu2.e;
import co2.f2;
import qu2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.LinkedList;
import av2.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo;
import com.kuaishou.live.core.voiceparty.emoji.play.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo$PlayStatus;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.kuaishou.live.core.voiceparty.emoji.play.a;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class a	// class@0002ce
{
    public boolean a;
    public final LinkedList b;
    public final h c;
    public final KwaiImageView d;
    public final e e;
    public final f2 f;
    public final a g;

    public void a(KwaiImageView p0,e p1,f2 p2,a p3){
       a.p(p0, "attachedView");
       a.p(p1, "viewFinder");
       a.p(p2, "voicePartyContext");
       a.p(p3, "liveContextWrapper");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.b = new LinkedList();
       this.c = new a$a(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.a == null) {
          VoicePartyEmojiPlayInfo voicePartyEm = this.b.poll();
          if (voicePartyEm != null) {
             this.a = true;
             a td = this.d;
             a te = this.e;
             if (!PatchProxy.applyVoidThreeRefs(td, voicePartyEm, te, null, d.class, "1") && (!PatchProxy.applyVoidThreeRefs(td, voicePartyEm, te, null, d.class, "2") && td != null)) {
                String emojiRes = voicePartyEm.getEmojiRes();
                if (TextUtils.isEmpty(emojiRes)) {
                   voicePartyEm.advancePlayStatus(VoicePartyEmojiPlayInfo$PlayStatus.Finished);
                }else if(!voicePartyEm.advancePlayStatus(VoicePartyEmojiPlayInfo$PlayStatus.Playing)){
                   voicePartyEm.advancePlayStatus(VoicePartyEmojiPlayInfo$PlayStatus.Finished);
                }else {
                   LiveVoicePartyLogTag eMOJI = LiveVoicePartyLogTag.EMOJI;
                   b.Z(eMOJI, "Start Emoji Animation");
                   d obj = PatchProxy.applyThreeRefs(voicePartyEm, td, te, null, d.class, "3");
                   if (obj != PatchProxyResult.class) {
                      td = obj;
                   }else if(te == null){
                      if (voicePartyEm.isGuestEmoji()) {
                         ViewGroup viewGroup = te.W0();
                         if (viewGroup != null) {
                            ViewGroup$LayoutParams layoutParams = td.getLayoutParams();
                            if (layoutParams != null && (layoutParams.width > null && layoutParams.height > null)) {
                               b.Z(eMOJI, "determineAnimatingView new view");
                               KwaiImageView kwaiImageVie = new KwaiImageView(td.getContext());
                               kwaiImageVie.setTag("guestEmojiView");
                               int[] ointArray = new int[2];
                               td.getLocationOnScreen(ointArray);
                               int[] ointArray1 = new int[2];
                               viewGroup.getLocationOnScreen(ointArray1);
                               if (viewGroup instanceof ConstraintLayout) {
                                  ConstraintLayout$LayoutParams layoutParams1 = new ConstraintLayout$LayoutParams(layoutParams.width, layoutParams.height);
                                  layoutParams1.leftMargin = (ointArray[0] - ointArray1[0]) - viewGroup.getPaddingLeft();
                                  layoutParams1.topMargin = (ointArray[1] - ointArray1[1]) - viewGroup.getPaddingTop();
                                  layoutParams1.h = 0;
                                  layoutParams1.d = 0;
                                  viewGroup.addView(kwaiImageVie, layoutParams1);
                               }else {
                                  FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(layoutParams.width, layoutParams.height);
                                  layoutParams2.leftMargin = (ointArray[0] - ointArray1[0]) - viewGroup.getPaddingLeft();
                                  layoutParams2.topMargin = (ointArray[1] - ointArray1[1]) - viewGroup.getPaddingTop();
                                  viewGroup.addView(kwaiImageVie, layoutParams2);
                               }
                               td = kwaiImageVie;
                            }
                         }
                      }
                      b.Z(eMOJI, "determineAnimatingView original view");
                   }
                   td.setVisibility(0);
                   obj = Fresco.newDraweeControllerBuilder().E(emojiRes);
                   obj.s(new a(voicePartyEm, te, td));
                   obj.y(td.getController());
                   td.setController(obj.e());
                }
             }
          }
       }
       return;
    }
}
