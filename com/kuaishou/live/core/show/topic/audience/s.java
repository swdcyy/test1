package com.kuaishou.live.core.show.topic.audience.s;
import k51.c;
import com.kuaishou.live.core.show.topic.audience.s$a;
import com.kuaishou.live.core.show.topic.audience.s$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View$OnAttachStateChangeListener;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import wb5.g;
import b61.b;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.kuaishou.live.core.show.topic.audience.s$c;
import com.yxcorp.gifshow.widget.m;
import y8c.d;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$b;

public class s extends c	// class@001218
{
    public KwaiImageView p;
    public TextView q;
    public LiveLottieAnimationView r;
    public LiveAudienceTopicDetailRecommendView$b s;
    public UserInfo t;
    public d u;
    public final View$OnAttachStateChangeListener v;
    public final View$OnAttachStateChangeListener w;
    public static String sLivePresenterClassName = "LiveAudienceTopicDetailRecommendLivingItemPresenter";

    public void s(){
       super();
       this.v = new s$a(this);
       this.w = new s$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s.class, "3")) {
          return;
       }
       this.m8().addOnAttachStateChangeListener(this.v);
       g.d(this.p, this.t, HeadImageSize.BIG);
       this.q.setText(b.c(this.t));
       this.r.addOnAttachStateChangeListener(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, s.class, "4")) {
          return;
       }
       this.m8().removeOnAttachStateChangeListener(this.v);
       this.r.removeOnAttachStateChangeListener(this.w);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a20fc);
       this.q = m1.f(p0, 0x7f0a20fe);
       this.r = m1.f(p0, 0x7f0a20fb);
       m1.b(p0, new s$c(this), R.id.live_living_user_avatar_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s.class, "2")) {
          return;
       }
       this.t = this.q8(UserInfo.class);
       this.u = this.r8("ADAPTER_POSITION_GETTER");
       this.s = this.r8("KEY_RECOMMEND_CLICK_LISTENER");
       return;
    }
}
