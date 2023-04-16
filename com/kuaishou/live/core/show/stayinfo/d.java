package com.kuaishou.live.core.show.stayinfo.d;
import ek2.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.g;
import android.widget.ImageView;
import im8.f;
import java.lang.Integer;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.live.core.basic.utils.e;
import jp.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import ub.b;
import dd.d;
import wb5.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import lnc.a1;
import ek2.t;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;

public class d extends q	// class@0010b5
{
    public KwaiImageView v;
    public KwaiImageView w;
    public TextView x;
    public static String sLivePresenterClassName = "LiveAudienceStayInfoRecommendCoverItemPresenter";

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       q tp = this.p;
       if (tp != null && (!tp.mEntity instanceof LiveStreamFeed || g.h(this.getActivity()))) {
          this.w.setVisibility(4);
          return;
       }else {
          this.w.setVisibility(0);
          if (!this.p.isShowed()) {
             this.p.setShowed(true);
             r1.g5(this.p.mEntity, this.t.get().intValue());
             e.u(this.p.mEntity);
          }
          h.f(this.v, this.p.mEntity, false, a.c, null, null);
          if (!TextUtils.x(this.p.getCaption())) {
             this.x.setText(this.p.getCaption());
          }else {
             this.x.setText(a1.p(R.string.arg_RES_7f101f9a));
          }
          this.R8();
          this.v.setOnClickListener(new t(this));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a25df);
       this.x = m1.f(p0, 0x7f0a25e3);
       this.w = m1.f(p0, 0x7f0a25e1);
       return;
    }
}
