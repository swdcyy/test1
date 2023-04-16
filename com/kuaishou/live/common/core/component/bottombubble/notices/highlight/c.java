package com.kuaishou.live.common.core.component.bottombubble.notices.highlight.c;
import bq5.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.LiveHighlightNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.c$a;
import java.lang.Object;
import dp3.g;
import dp3.f;
import android.animation.Animator;
import bq5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d61.c0;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.LiveHighLightNoticeView;
import android.widget.RelativeLayout;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import java.util.Objects;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.core.show.highlight.model.LiveAudienceHighlightVideoInfo;
import bd1.c;
import android.view.View$OnClickListener;

public class c implements b	// class@000fd5
{
    public final LiveHighlightNoticeInfo b;
    public final c$a c;
    public LiveHighLightNoticeView d;
    public LiveLottieAnimationView e;

    public void c(LiveHighlightNoticeInfo p0,c$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void A(int p0){
       f.b(this, p0);
    }
    public Animator a(){
       return a.b(this);
    }
    public int b(){
       return a.f(this);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       if (this.e != null) {
          this.e.setAnimationFromUrl(c0.a.b("/udata/pkg/kwai-client-image/live_high_light/live_highlight_comment_notice_image_box.json"));
          this.e.s();
       }
       return;
    }
    public Animator d(){
       return a.a(this);
    }
    public void e(){
       f.d(this);
    }
    public View getView(){
       return this.d;
    }
    public int h(){
       return 2;
    }
    public void i(LayoutInflater p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       LiveHighLightNoticeView liveHighLigh = a.c(p0, R.layout.arg_RES_7f0d0a94, p1, false);
       this.d = liveHighLigh;
       this.e = liveHighLigh.findViewById(0x7f0a1b55);
       c td = this.d;
       c tb = this.b;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoidOneRefs(tb, td, LiveHighLightNoticeView.class, "2")) {
          td.setTitleContent(tb.mDescription);
          td.setButtonContent(tb.mLiveCommentNoticeButtonInfo.mBtnTitle);
          if (tb.mExtraInfo != null) {
             LiveHighlightNoticeInfo mVideoInfo = tb.mVideoInfo;
             LiveHighlightNoticeInfo mContentIcon = tb.mContentIconUrls;
             if (!PatchProxy.applyVoidOneRefs(mContentIcon, td, LiveHighLightNoticeView.class, "6")) {
                td.c.P(mContentIcon);
             }
             td.setDurationContent(mVideoInfo.mHighlightVideoDurationMills);
          }
       }
       if (this.c != null) {
          this.d.setOnClickListener(new c(this));
       }
       return;
    }
    public int r(){
       return a.d(this);
    }
    public int z(){
       return a.e(this);
    }
}
