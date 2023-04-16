package com.yxcorp.gifshow.ad.detail.presenter.side.l$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.side.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.c;
import android.widget.TextView;
import com.kuaishou.android.model.mix.PhotoMeta;
import bt7.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import g19.l0;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import g19.m0;
import com.yxcorp.gifshow.widget.AvatarWithPendantView;
import com.kwai.framework.model.user.DynamicPendant;
import java.lang.Float;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import zz5.f;
import androidx.fragment.app.Fragment;
import com.kwai.component.photo.detail.slide.degrade.SlidePlayDegradeApi;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import zz5.d;

public class l$a extends a	// class@0016b4
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void i2(){
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l$a.class, "1")) {
          return;
       }
       l$a tb = this.b;
       l x = tb.x;
       Objects.requireNonNull(tb);
       String str = PatchProxy.apply(objArray, tb, ol, "13");
       if (str != PatchProxyResult.class) {
       }else {
          str = c.A(tb.getPhoto());
       }
       x.setText(str);
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, ol, "7") && tb.getPhoto().getPhotoMeta() != null) {
          ol = tb.L;
          if (ol == null) {
             tb.L = new a(tb.getActivity(), tb.y, tb.getPhoto().getPhotoMeta().mActivityUserIconMode);
          }else {
             ol.b(tb.getPhoto().getPhotoMeta().mActivityUserIconMode);
          }
          tb.L.a();
       }
       return;
    }
    public void k1(){
       l ol = l.class;
       if (PatchProxy.applyVoid(null, this, l$a.class, "2")) {
          return;
       }
       l$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, ol, "6")) {
          g.k(tb.r, tb.S8(), HeadImageSize.SMALL);
          tb.r.setOnClickListener(new l0(tb));
          tb.x.setOnClickListener(new m0(tb));
          if (!PatchProxy.applyVoid(null, tb, ol, "8")) {
             l q = tb.q;
             if (q != null) {
                q.r();
                User user = tb.S8();
                User mDynamicPend = user.mDynamicPendant;
                user = user.mPendants;
                if (mDynamicPend != null) {
                   tb.q.s(mDynamicPend.getLottieUrl(), mDynamicPend.getWidthRadio().floatValue(), mDynamicPend.getHeightRadio().floatValue());
                }else if(!j.h(user)){
                   tb.q.setStaticPendantUrl(user);
                }else {
                   tb.q.r();
                }
             }
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, ol, "18")) {
          QPhoto photo = tb.getPhoto();
          if (photo != tb.z) {
             f uof = new f(photo);
             uof.a(true);
             Fragment parentFragme = tb.E.getParentFragment();
             if (parentFragme != null) {
                RequestTiming oN_HOME_PAGE = (SlidePlayDegradeApi.PHOTO_START_UP.shouldDegrade())? RequestTiming.ON_HOME_PAGE_CREATED: RequestTiming.DEFAULT;
                d.h(photo, parentFragme, null, uof, oN_HOME_PAGE);
             }
          }
       }
       return;
    }
}
