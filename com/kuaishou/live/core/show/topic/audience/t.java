package com.kuaishou.live.core.show.topic.audience.t;
import k51.c;
import com.kuaishou.live.core.show.topic.audience.t$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import wb5.g;
import b61.b;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View$OnAttachStateChangeListener;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.topic.audience.t$b;
import com.yxcorp.gifshow.widget.m;
import y8c.d;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$b;

public class t extends c	// class@00121b
{
    public KwaiImageView p;
    public TextView q;
    public UserInfo r;
    public LiveAudienceTopicDetailRecommendView$b s;
    public d t;
    public final View$OnAttachStateChangeListener u;
    public static String sLivePresenterClassName = "LiveAudienceTopicDetailRecommendNoLivingItemPresenter";

    public void t(){
       super();
       this.u = new t$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       g.d(this.p, this.r, HeadImageSize.BIG);
       this.q.setText(b.c(this.r));
       this.m8().addOnAttachStateChangeListener(this.u);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t.class, "4")) {
          return;
       }
       this.m8().removeOnAttachStateChangeListener(this.u);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2212);
       this.q = m1.f(p0, 0x7f0a2213);
       m1.b(p0, new t$b(this), R.id.live_no_living_user_avatar_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "2")) {
          return;
       }
       this.r = this.q8(UserInfo.class);
       this.t = this.r8("ADAPTER_POSITION_GETTER");
       this.s = this.r8("KEY_RECOMMEND_CLICK_LISTENER");
       return;
    }
}
