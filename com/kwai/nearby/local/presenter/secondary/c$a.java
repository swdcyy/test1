package com.kwai.nearby.local.presenter.secondary.c$a;
import qvb.q;
import com.kwai.nearby.local.presenter.secondary.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.widget.ImageView;
import qvb.p;
import qvb.n0;
import com.kwai.nearby.model.NearbySecondaryFeedResponse;
import java.util.Objects;
import com.kwai.nearby.model.NearbySecondaryFeedResponse$HeadMessage;
import com.kwai.social.startup.local.model.DarkLightModel;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import com.kwai.nearby.model.NearbyCommonTag;
import ed7.d;
import android.view.View$OnClickListener;
import android.view.View;
import ed7.f;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$e;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn;
import java.util.List;
import ed7.e;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$d;

public class c$a implements q	// class@000fd1
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, c$a.class, "2")) {
          return;
       }
       this.b.q.setVisibility(4);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0) {
          c$a tb = this.b;
          NearbySecondaryFeedResponse nearbySecond = tb.z.L0();
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(nearbySecond, tb, c.class, "5") && nearbySecond != null) {
             NearbySecondaryFeedResponse mHeadMessage = nearbySecond.mHeadMessage;
             if (mHeadMessage != null) {
                NearbySecondaryFeedResponse$HeadMessage mBgImgUrl = mHeadMessage.mBgImgUrl;
                if (mBgImgUrl != null) {
                   tb.p.L(mBgImgUrl.getMUrl());
                }
                int i = 0;
                tb.q.setVisibility(i);
                tb.q.L(nearbySecond.mHeadMessage.mCoverUrl);
                tb.r.setText(nearbySecond.mHeadMessage.mTitle);
                if (!TextUtils.isEmpty(nearbySecond.mHeadMessage.mSubtitle)) {
                   tb.s.setVisibility(i);
                   tb.s.setText(nearbySecond.mHeadMessage.mSubtitle);
                }else {
                   tb.s.setVisibility(8);
                }
                if (nearbySecond.mHeadMessage.hasValidTag()) {
                   tb.t.setVisibility(i);
                   tb.t.setText(nearbySecond.mHeadMessage.mTag.mText);
                   tb.v.setOnClickListener(new d(tb, nearbySecond));
                   if (nearbySecond.mHeadMessage.mTag.mTag != null) {
                      tb.w.setVisibility(i);
                      tb.w.L(nearbySecond.mHeadMessage.mTag.mTag.getMUrl());
                   }else {
                      tb.w.setVisibility(8);
                   }
                }else {
                   tb.t.setVisibility(8);
                   tb.w.setVisibility(8);
                }
                if (!TextUtils.isEmpty(nearbySecond.mHeadMessage.mSubtitle) && nearbySecond.mHeadMessage.hasValidTag()) {
                   tb.u.setVisibility(i);
                }else {
                   tb.u.setVisibility(8);
                }
                tb.x.setBtnVisibilityChangedListener(new f(tb));
                tb.x.setData(nearbySecond.mHeadMessage.mButtons);
                tb.x.setBtnClickedListener(new e(tb));
             }
          }
       }
       return;
    }
}
