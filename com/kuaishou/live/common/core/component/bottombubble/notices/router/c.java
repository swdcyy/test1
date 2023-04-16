package com.kuaishou.live.common.core.component.bottombubble.notices.router.c;
import bq5.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo;
import jd1.e;
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
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeView;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo$ButtonInfo;
import jd1.c;
import android.view.View$OnClickListener;
import jd1.d;

public class c implements b	// class@000ff4
{
    public LiveRouterNoticeView b;
    public LiveRouterNoticeInfo c;
    public e d;

    public void c(LiveRouterNoticeInfo p0,e p1){
       super();
       this.c = p0;
       this.d = p1;
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
       return this.b;
    }
    public int h(){
       return 2;
    }
    public void i(LayoutInflater p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       LiveRouterNoticeView liveRouterNo = a.c(p0, R.layout.arg_RES_7f0d0a97, p1, false);
       c tc = this.c;
       LiveRouterNoticeInfo mSubTitle = tc.mSubTitle;
       LiveRouterNoticeInfo mDescription = tc.mDescription;
       Objects.requireNonNull(liveRouterNo);
       if (!PatchProxy.applyVoidTwoRefs(mSubTitle, mDescription, liveRouterNo, LiveRouterNoticeView.class, "2") && (!TextUtils.x(mSubTitle) || !TextUtils.x(mDescription))) {
          if (!TextUtils.x(mSubTitle)) {
             liveRouterNo.setFirstLineContent(mSubTitle);
             liveRouterNo.setSecondLineContent(mDescription);
          }else if(!TextUtils.x(mDescription)){
             liveRouterNo.setFirstLineContent(mDescription);
          }
       }
       tc = this.c;
       mSubTitle = tc.mContentIconUrls;
       mDescription = tc.mIsContentIconSquare;
       if (PatchProxy.isSupport(LiveRouterNoticeView.class) && (!PatchProxy.applyVoidTwoRefs(mSubTitle, Boolean.valueOf(mDescription), liveRouterNo, LiveRouterNoticeView.class, "3") && !q.f(mSubTitle))) {
          liveRouterNo.setContentIconShape(mDescription);
          liveRouterNo.c.P(mSubTitle);
          liveRouterNo.c.setVisibility(false);
       }
       tc = this.c;
       if (tc.mEnableShowButton != null) {
          liveRouterNo.setButtonTitle(tc.mButtonInfo.mButtonText);
       }
       if (this.d != null) {
          liveRouterNo.setButtonClickListener(new c(this));
          liveRouterNo.setContainerClickListener(new d(this));
       }
       this.b = liveRouterNo;
       return;
    }
    public int r(){
       return a.d(this);
    }
    public int z(){
       return a.e(this);
    }
}
