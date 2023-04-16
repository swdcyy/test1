package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hn5.n;
import hn5.m;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import crd.b;
import lnc.b9;
import xl8.d;
import y8c.a;
import brd.t;
import r19.n;
import erd.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import az6.a;
import sd5.f;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.util.DateUtils;
import o56.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kuaishou.android.model.mix.CommonMeta;
import android.widget.TextView;
import lnc.a9;
import com.kuaishou.android.model.mix.PhotoMeta;
import android.widget.ImageView;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class f extends PresenterV2	// class@0016de
{
    public PhotoMeta A;
    public NasaBizParam B;
    public SlidePlayViewModel C;
    public b D;
    public b E;
    public View p;
    public TextView q;
    public TextView r;
    public TextView s;
    public TextView t;
    public ImageView u;
    public ImageView v;
    public QPhoto w;
    public BaseFragment x;
    public PhotoDetailParam y;
    public CommonMeta z;

    public void f(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       if (m.a().U3(this.getActivity())) {
          this.p.setVisibility(4);
          return;
       }else {
          this.C = SlidePlayViewModel.B0(this.x.getParentFragment());
          this.S8();
          b9.a(this.D);
          this.D = b9.d(this.A, this.x).subscribe(new n(this));
          return;
       }
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       b9.a(this.D);
       b9.a(this.E);
       this.E = null;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       b9.a(this.E);
       return;
    }
    public final boolean P8(){
       f obj = PatchProxy.apply(null, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.B;
       boolean b = (obj != null && (obj.getNasaSlideParam() != null && (this.B.getNasaSlideParam().isDetailPage() && (this.B.getNasaSlideParam().mEnableCameraButton != null || this.B.getNasaSlideParam().mEnableSearchButton != null))))? true: false;
       return b;
    }
    public final boolean R8(){
       boolean b = (this.y.mSource == 2)? true: false;
       return b;
    }
    public final void S8(){
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       f tw = this.w;
       a mSource = this.y.mSource;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          objArray = PatchProxy.applyTwoRefs(tw, Integer.valueOf(mSource), null, uof, "1");
          if (objArray != patchProxyRe) {
          }else if(k.B(tw) != null && !TextUtils.x(k.B(tw).mSourceDescription)){
             objArray = null;
          }else {
             objArray = tw.getDisplayTime();
             f uof1 = (mSource != 8 && (mSource == 82 || mSource == 90))? 1: null;
             if (!uof1 || objArray == null) {
                long l = tw.created();
                if (objArray == null) {
                   String str = (TextUtils.n(tw.getUserId(), QCurrentUser.ME.getId()))? DateUtils.d(l): DateUtils.w(a.B, l);
                   objArray = str;
                }
             }
          }
       }else {
          goto label_002e ;
       }
       CommonMeta uCommonMeta = PatchProxy.apply(null, this, f.class, "17");
       if (uCommonMeta != patchProxyRe) {
       }else {
          f ty = this.y;
          uCommonMeta = (ty.mSource != 9 || ty.getBizType() == 4)? null: this.z.mLocationDistanceStr;
       }
       if (this.R8() || TextUtils.x(objArray)) {
          this.r.setVisibility(8);
       }else {
          this.r.setVisibility(0);
          this.r.setText(objArray);
       }
       if (TextUtils.x(uCommonMeta)) {
          this.t.setVisibility(8);
       }else {
          this.t.setVisibility(0);
          this.t.setText(uCommonMeta);
       }
       if (this.w.isMine() && this.w.isPublic()) {
          this.q.setVisibility(0);
          this.q.setText(a9.a(this.getContext(), this.w.isImageType(), this.w.numberOfReview()));
       }else {
          this.q.setVisibility(8);
       }
       f.c(this.r, this.s, this.A, objArray);
       if (!PatchProxy.applyVoid(null, this, f.class, "7")) {
          if (this.P8()) {
             this.u.setVisibility(8);
          }else {
             this.R8();
             this.u.setVisibility(8);
          }
       }
       if (!PatchProxy.applyVoid(null, this, f.class, "8")) {
          if (this.P8()) {
             this.v.setVisibility(8);
          }else {
             this.R8();
             this.v.setVisibility(8);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a4176);
       this.t = m1.f(p0, 0x7f0a0aea);
       this.q = m1.f(p0, 0x7f0a30ef);
       this.p = m1.f(p0, 0x7f0a04fc);
       this.r = m1.f(p0, 0x7f0a0a1b);
       this.u = m1.f(p0, 0x7f0a0b20);
       this.v = m1.f(p0, 0x7f0a0abb);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.w = this.q8(QPhoto.class);
       this.x = this.r8("DETAIL_FRAGMENT");
       this.y = this.q8(PhotoDetailParam.class);
       this.z = this.q8(CommonMeta.class);
       this.A = this.q8(PhotoMeta.class);
       this.B = this.q8(NasaBizParam.class);
       return;
    }
}
