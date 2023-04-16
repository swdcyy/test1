package com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.a;
import bq5.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.a$a;
import cy5.a;
import java.lang.Object;
import dp3.g;
import dp3.f;
import android.animation.Animator;
import bq5.a;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ag6.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeBubbleView;
import java.util.Objects;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import ld1.a;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.LiveServiceAccountNoticeInfo$ExtraInfo;

public class a implements b	// class@000ffd
{
    public final LiveServiceAccountNoticeInfo b;
    public final a$a c;
    public LiveServiceAccountNoticeBubbleView d;
    public final a e;

    public void a(LiveServiceAccountNoticeInfo p0,a$a p1,a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.e = p2;
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
       f.c(this);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a te = this.e;
       if (te != null) {
          te.a();
       }
       LiveServiceAccountNoticeBubbleView liveServiceA = a.c(p0, R.layout.arg_RES_7f0d0a99, p1, false);
       this.d = liveServiceA;
       a tb = this.b;
       Objects.requireNonNull(liveServiceA);
       if (!PatchProxy.applyVoidOneRefs(tb, liveServiceA, LiveServiceAccountNoticeBubbleView.class, "2")) {
          LiveServiceAccountNoticeInfo mContentIcon = tb.mContentIconUrls;
          if (!PatchProxy.applyVoidOneRefs(mContentIcon, liveServiceA, LiveServiceAccountNoticeBubbleView.class, "5") && !mContentIcon.isEmpty()) {
             liveServiceA.c.P(mContentIcon);
             liveServiceA.c.setVisibility(false);
          }
          liveServiceA.setTitleContent(tb.mDescription);
          liveServiceA.setRightButtonContent(tb.mLiveCommentNoticeButtonInfo.mBtnTitle);
       }
       this.d.setOnClickListener(new a(this));
       a te1 = this.e;
       if (te1 != null && this.b.mExtraInfo != null) {
          te1.e();
          this.e.b(this.b.mExtraInfo.mTunaBizType, 2);
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
