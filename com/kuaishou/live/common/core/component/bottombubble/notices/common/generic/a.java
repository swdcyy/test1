package com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a;
import bq5.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
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
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import kc1.a;
import android.view.View$OnClickListener;

public class a implements b	// class@000f93
{
    public LiveGenericCommentNoticeInfo b;
    public final a$a c;
    public LiveGenericCommentNoticeView d;

    public void a(LiveGenericCommentNoticeInfo p0,a$a p1){
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
       LiveGenericCommentNoticeView liveGenericC = a.c(p0, R.layout.arg_RES_7f0d0a93, p1, false);
       this.d = liveGenericC;
       a tb = this.b;
       Objects.requireNonNull(liveGenericC);
       if (!PatchProxy.applyVoidOneRefs(tb, liveGenericC, LiveGenericCommentNoticeView.class, "2")) {
          LiveGenericCommentNoticeInfo mDescription = (TextUtils.x(tb.mSubTitle))? tb.mDescription: tb.mSubTitle;
          liveGenericC.setFirstLineContent(mDescription);
          CharSequence uCharSequenc = (TextUtils.x(tb.mSubTitle))? null: tb.mDescription;
          liveGenericC.setSecondLineContent(uCharSequenc);
          liveGenericC.setContentIconShape(tb.mIsContentIconSquare);
          liveGenericC.c(tb.mContentIconUrls);
          LiveGenericCommentNoticeInfo mButtonInfo = tb.mButtonInfo;
          if (mButtonInfo != null) {
             liveGenericC.setRightButtonContent(mButtonInfo.mBtnTitle);
          }
       }
       a tc = this.c;
       if (tc != null) {
          tc.a(this.d);
          this.d.setRightButtonOnClickListener(new a(this));
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
