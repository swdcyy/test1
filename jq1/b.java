package jq1.b;
import jq1.c;
import hr1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import xp5.g;
import n91.f;
import jq1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import jq1.d$a;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import jq1.a;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatVoteEnd;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.live.common.core.component.pk.b;
import android.animation.AnimatorSet;
import java.lang.CharSequence;
import pu1.d;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ls1.h;
import pu1.j;
import jq1.b$a;
import hc.b;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import jq1.b$b;
import com.yxcorp.image.request.a;
import s0d.e;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;

public final class b implements c	// class@002bf5
{
    public final KwaiImageView a;
    public final TextView b;
    public final KwaiImageView c;
    public AnimatorSet d;
    public final a e;
    public final LiveMultiLineGiftBattleModel f;
    public final g g;
    public final f h;
    public final e i;

    public void b(a p0,LiveMultiLineGiftBattleModel p1,g p2,f p3,e p4){
       a.p(p0, "containerVcDelegate");
       a.p(p1, "giftBattleModel");
       a.p(p2, "liveInfoManager");
       a.p(p3, "liveServerTimeProvider");
       a.p(p4, "playAnimationViewModel");
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       View view = p0.a().findViewById(R.id.live_multi_line_animation_view);
       a.o(view, "containerVcDelegate.getR¡­ulti_line_animation_view\)");
       this.a = view;
       view = p0.a().findViewById(R.id.live_multi_line_text_view);
       a.o(view, "containerVcDelegate.getR¡­ive_multi_line_text_view\)");
       this.b = view;
       view = p0.a().findViewById(R.id.live_multi_line_icon);
       a.o(view, "containerVcDelegate.getR¡­.id.live_multi_line_icon\)");
       this.c = view;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
       }else {
          p4.a.observe(p0.j(), new a(this));
       }
       LiveScoreLineChatVoteEnd liveScoreLin = p1.b0();
       if (liveScoreLin != null) {
          liveScoreLin = liveScoreLin.voteEndPicUrl;
          if (liveScoreLin != null) {
             int i = (!liveScoreLin.length)? 1: 0;
             if (i ^ 1) {
                object oobject = liveScoreLin[0];
                if (oobject != null) {
                   objArray = oobject.url;
                }
                this.d(objArray);
             }
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b.l(this.a);
       b td = this.d;
       if (td != null && (td != null && td.isRunning() == true)) {
          td = this.d;
          if (td != null) {
             td.end();
          }
       }
       this.b.setText("");
       this.b.setAlpha(0x3f800000);
       return;
    }
    public final void b(d p0,String p1,d p2,CDNUrl[] p3){
       h b;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "3")) {
          return;
       }
       LiveCommonLogTag liveCommonLo = (p1 == null || !p1.length())? 1: null;
       if (liveCommonLo) {
          b.Z(LiveCommonLogTag.MULTI_LINE, "text is null");
          this.c(p0);
          return;
       }else {
          liveCommonLo = LiveCommonLogTag.MULTI_LINE;
          b.c0(liveCommonLo, "LiveMultiLinePlayAnimationController", "playAnimation", p1);
          this.b.setText(p1);
          float f = 0;
          this.b.setAlpha(f);
          this.c.U(p3);
          this.c.setAlpha(f);
          this.b.setBackground(new BitmapDrawable(BitmapFactory.decodeFile(p2.getLocalFilePath())));
          b = h.b;
          if (!b.f(p0)) {
             return;
          }else {
             this.a.setVisibility(0);
             b.d0(liveCommonLo, "LiveMultiLinePlayAnimationController", "playAnimation", "bindAnimResource", "multiLineResource", p0.getLocalFileName());
             b.a(this.a, p0, false, null, new b$a(this));
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000})};
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu);
             a.o(objectAnimat, "ObjectAnimator.ofPropert¡­View.ALPHA, 0f, 1f\)\n    \)");
             objectAnimat.setStartDelay(160);
             objectAnimat.setDuration(200);
             PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000})};
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(this.c, propertyValu1);
             a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­View.ALPHA, 0f, 1f\)\n    \)");
             objectAnimat1.setStartDelay(160);
             objectAnimat1.setDuration(200);
             PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0})};
             ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(this.b, propertyValu2);
             a.o(objectAnimat2, "ObjectAnimator.ofPropert¡­View.ALPHA, 1f, 0f\)\n    \)");
             objectAnimat2.setStartDelay(1840);
             objectAnimat2.setDuration(200);
             PropertyValuesHolder[] propertyValu3 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0})};
             ObjectAnimator objectAnimat3 = ObjectAnimator.ofPropertyValuesHolder(this.c, propertyValu3);
             a.o(objectAnimat3, "ObjectAnimator.ofPropert¡­View.ALPHA, 1f, 0f\)\n    \)");
             objectAnimat3.setStartDelay(1840);
             objectAnimat3.setDuration(200);
             AnimatorSet uAnimatorSet = new AnimatorSet();
             this.d = uAnimatorSet;
             Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat2,objectAnimat1,objectAnimat3};
             uAnimatorSet.playTogether(uAnimatorArr);
             b td = this.d;
             if (td != null) {
                td.start();
             }
             return;
          }
       }
    }
    public final void c(d p0){
       h b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       b = h.b;
       if (!b.f(p0)) {
          return;
       }
       this.a.setVisibility(0);
       b.d0(LiveCommonLogTag.MULTI_LINE, "LiveMultiLinePlayAnimationController", "playBackupAnimation", "bindAnimResource", "multiLineResource", p0.getLocalFileName());
       b.a(this.a, p0, false, null, new b$b(this));
       return;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       e uoe = a.u(p0).q();
       a.o(uoe, "KwaiImageRequestBuilder\n¡­rl\)\n      .buildRequest\(\)");
       Fresco.getImagePipeline().prefetchToDiskCache(uoe, null);
       return;
    }
}
