package com.kuaishou.live.common.core.component.bottombubble.notices.follow.a;
import bq5.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.follow.a$b;
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
import com.kuaishou.live.common.core.component.bottombubble.notices.follow.LiveFollowBubbleView;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import java.lang.CharSequence;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import android.text.TextUtils;
import android.widget.TextView;
import android.text.TextPaint;
import lnc.a1;
import java.lang.Math;
import xc1.a;
import android.view.View$OnClickListener;

public class a implements b	// class@000fbb
{
    public final LiveGenericCommentNoticeInfo b;
    public final a$b c;
    public LiveFollowBubbleView d;

    public void a(LiveGenericCommentNoticeInfo p0,a$b p1){
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
       boolean b = false;
       LiveFollowBubbleView liveFollowBu = a.c(p0, R.layout.arg_RES_7f0d0a92, p1, b);
       this.d = liveFollowBu;
       a tb = this.b;
       Objects.requireNonNull(liveFollowBu);
       if (!PatchProxy.applyVoidOneRefs(tb, liveFollowBu, LiveFollowBubbleView.class, "3")) {
          LiveGenericCommentNoticeInfo mContentIcon = tb.mContentIconUrls;
          if (!PatchProxy.applyVoidOneRefs(mContentIcon, liveFollowBu, LiveFollowBubbleView.class, "7") && !q.f(mContentIcon)) {
             liveFollowBu.c.P(mContentIcon);
             liveFollowBu.c.setVisibility(b);
          }
          liveFollowBu.setTitleContent(tb.mDescription);
          mContentIcon = tb.mButtonInfo;
          if (mContentIcon != null && !TextUtils.isEmpty(mContentIcon.mBtnTitle)) {
             liveFollowBu.e.setText(tb.mButtonInfo.mBtnTitle);
             liveFollowBu.e.setWidth(((int)Math.max(liveFollowBu.e.getPaint().measureText(tb.mButtonInfo.mBtnTitle), liveFollowBu.e.getPaint().measureText(a1.p(R.string.arg_RES_7f101034))) + a1.e(16.00f)));
          }
       }
    label_008f :
       this.d.setRightButtonOnClickListener(new a(this));
       return;
    }
    public int r(){
       return a.d(this);
    }
    public int z(){
       return a.e(this);
    }
}
