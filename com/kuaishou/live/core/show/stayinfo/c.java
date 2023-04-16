package com.kuaishou.live.core.show.stayinfo.c;
import ek2.q;
import com.kuaishou.live.core.show.stayinfo.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.live.widget.LiveBreathAvatarView;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.g;
import android.view.View;
import im8.f;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.live.core.basic.utils.e;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewGroup;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lu7.f;
import java.lang.CharSequence;
import android.widget.TextView;
import ek2.r;
import android.view.View$OnClickListener;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import ek2.s;
import erd.g;
import crd.b;
import ekd.m1;

public class c extends q	// class@0010b4
{
    public LiveBreathAvatarView v;
    public View w;
    public View x;
    public final View$OnAttachStateChangeListener y;
    public static String sLivePresenterClassName = "LiveAudienceStayInfoRecommendBreatheAvatarItemPresenter";

    public void c(){
       super();
       this.y = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       int i = 12;
       this.v.setAvatarViewPaddingDp(i);
       q tp = this.p;
       if (tp != null && (!tp.mEntity instanceof LiveStreamFeed || g.h(this.getActivity()))) {
          this.w.setVisibility(4);
          this.x.setVisibility(4);
          return;
       }else {
          int i1 = 0;
          this.w.setVisibility(i1);
          this.x.setVisibility(i1);
          if (!this.p.isShowed()) {
             this.p.setShowed(true);
             r1.g5(this.p.mEntity, this.t.get().intValue());
             e.u(this.p.mEntity);
          }
          QPhoto mEntity = this.p.mEntity;
          this.v.addOnAttachStateChangeListener(this.y);
          if (mEntity != null) {
             c tv = this.v;
             Objects.requireNonNull(tv);
             if (!PatchProxy.applyVoidOneRefs(mEntity, tv, LiveBreathAvatarView.class, "4")) {
                LiveStreamFeed mUser = mEntity.mUser;
                if (mUser != null) {
                   tv.B.U(mUser.mAvatars);
                   tv.C.setText(f.c(mEntity.mUser));
                }
             }
          }
          this.v.setUserNameTextSize(i);
          this.v.L();
          this.R8();
          this.v.setOnClickListener(new r(this));
          this.X7(this.s.m().subscribe(new s(this)));
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.v.removeOnAttachStateChangeListener(this.y);
       this.v.M();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a26d2);
       this.w = m1.f(p0, 0x7f0a20ff);
       this.x = m1.f(p0, 0x7f0a20fd);
       return;
    }
}
