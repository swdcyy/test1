package com.yxcorp.gifshow.follow.stagger.presenter.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kwai.framework.model.user.User;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.d;
import com.yxcorp.gifshow.follow.stagger.presenter.m$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import com.kwai.framework.model.user.UserExtraInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.TextView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class m extends PresenterV2	// class@001219
{
    public View p;
    public KwaiImageView q;
    public TextView r;
    public TextView s;
    public View t;
    public CommonMeta u;
    public AggregateTemplateMeta v;

    public void m(){
       super();
    }
    public void E8(){
       m om = m.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, om, "4")) {
          ViewGroup$MarginLayoutParams layoutParams = this.t.getLayoutParams();
          layoutParams.topMargin = n.c(this.getContext(), 20.00f);
          layoutParams.bottomMargin = n.c(this.getContext(), 27.00f);
          this.t.requestLayout();
       }
       AggregateTemplateMeta mRecommendUs = this.v.mRecommendUser;
       if (mRecommendUs != null && !PatchProxy.applyVoidOneRefs(mRecommendUs, this, om, "5")) {
          this.p.setBackgroundColor(this.u.mColor);
          a.d(d.g(this.v.mRecommendUser)[0], new m$a(this, mRecommendUs));
          g.b(this.q, mRecommendUs, HeadImageSize.BIG);
          User mExtraInfo = mRecommendUs.mExtraInfo;
          if (mExtraInfo != null) {
             UserExtraInfo mOpenUserNam = mExtraInfo.mOpenUserName;
             m tr = this.r;
             if (TextUtils.isEmpty(mOpenUserNam)) {
                mOpenUserNam = mRecommendUs.mName;
             }
             tr.setText(mOpenUserNam);
             this.s.setText(mRecommendUs.mExtraInfo.mRecommendReason);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3bd1);
       this.p = m1.f(p0, 0x7f0a0923);
       this.r = m1.f(p0, 0x7f0a3f2c);
       this.q = m1.f(p0, 0x7f0a0333);
       this.t = m1.f(p0, 0x7f0a0f4e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.u = this.q8(CommonMeta.class);
       this.v = this.q8(AggregateTemplateMeta.class);
       return;
    }
}
