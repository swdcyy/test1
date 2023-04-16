package com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.a;
import bq5.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.LiveCommonBubbleInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.a$a;
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
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.LiveCommonCommentNoticeView;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import oc1.a;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;

public class a implements b	// class@000faa
{
    public final LiveCommonBubbleInfo b;
    public final a$a c;
    public LiveCommonCommentNoticeView d;

    public void a(LiveCommonBubbleInfo p0,a$a p1){
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
       LiveCommonCommentNoticeView liveCommonCo = a.c(p0, R.layout.arg_RES_7f0d0a91, p1, false);
       this.d = liveCommonCo;
       a tb = this.b;
       Objects.requireNonNull(liveCommonCo);
       if (!PatchProxy.applyVoidOneRefs(tb, liveCommonCo, LiveCommonCommentNoticeView.class, "2")) {
          LiveCommonBubbleInfo mDescription = (TextUtils.x(tb.mSubTitle))? tb.mDescription: tb.mSubTitle;
          liveCommonCo.setFirstLineContent(mDescription);
          CharSequence uCharSequenc = (TextUtils.x(tb.mSubTitle))? null: tb.mDescription;
          liveCommonCo.setSecondLineContent(uCharSequenc);
          liveCommonCo.setContentIconShape(tb.mIsContentIconSquare);
          LiveCommonBubbleInfo mContentIcon = tb.mContentIconUrls;
          if (!PatchProxy.applyVoidOneRefs(mContentIcon, liveCommonCo, LiveCommonCommentNoticeView.class, "3") && !mContentIcon.isEmpty()) {
             liveCommonCo.c.P(mContentIcon);
             liveCommonCo.c.setVisibility(false);
          }
       }
    label_0069 :
       if (this.c != null) {
          this.d.setOnClickListener(new a(this));
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
