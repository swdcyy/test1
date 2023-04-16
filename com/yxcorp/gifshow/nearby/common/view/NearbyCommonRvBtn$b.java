package com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.nearby.common.model.CommonBtnModel;
import com.kwai.social.startup.local.model.DarkLightModel;
import android.graphics.Color;
import lnc.a1;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.util.w0;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$d;

public final class NearbyCommonRvBtn$b extends PresenterV2	// class@002137
{
    public CommonBtnModel p;
    public KwaiImageView q;
    public SelectShapeTextView r;
    public SelectShapeConstraintLayout s;
    public NearbyCommonRvBtn$d t;

    public void NearbyCommonRvBtn$b(){
       super();
    }
    public void E8(){
       NearbyCommonRvBtn$b tp;
       int i;
       NearbyCommonRvBtn$b tp1;
       CommonBtnModel mLeftIconUrl;
       String mUrl;
       NearbyCommonRvBtn$b ts;
       int i3;
       Object[] objArray1;
       NearbyCommonRvBtn$b uob = NearbyCommonRvBtn$b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "5")) {
          return;
       }
       String str = "mRootContainer";
       if (!PatchProxy.applyVoid(objArray, this, uob, "6")) {
          tp1 = this.p;
          if (tp1 == null) {
             a.S("mCommonBtnModel");
          }
          mLeftIconUrl = tp1.mBorderColor;
          if (mLeftIconUrl != null && mLeftIconUrl.getMUrl() != null) {
             try{
                tp1 = this.p;
                if (tp1 == null) {
                   a.S("mCommonBtnModel");
                }
                mLeftIconUrl = tp1.mBorderColor;
                mUrl = (mLeftIconUrl != null)? mLeftIconUrl.getMUrl(): objArray;
                i3 = Color.parseColor(mUrl);
             }catch(java.lang.IllegalArgumentException e0){
                i3 = a1.a(R.color.arg_RES_7f0606b3);
             }
             ts = this.s;
             if (ts == null) {
                a.S(str);
             }
             b uob1 = new b();
             uob1.w(i3);
             uob1.x(0x3f800000);
             uob1.g(KwaiRadiusStyles.FULL);
             ts.setBackground(uob1.a());
          }
       }
    label_0067 :
       if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
          tp1 = this.p;
          if (tp1 == null) {
             a.S("mCommonBtnModel");
          }
          mLeftIconUrl = tp1.mLeftIconUrl;
          int i1 = 8;
          if (mLeftIconUrl != null) {
             mUrl = mLeftIconUrl.getMUrl();
             if (mUrl != null) {
                int i2 = (!mUrl.length())? 1: 0;
                if (i2) {
                   tp1 = this.s;
                   if (tp1 == null) {
                      a.S(str);
                   }
                   tp1.setPadding(a1.e(16.00f), 0, a1.e(16.00f), 0);
                   tp1 = this.q;
                   if (tp1 == null) {
                      a.S("mIvCommonIcon");
                   }
                   tp1.setVisibility(i1);
                }else {
                   ts = this.s;
                   if (ts == null) {
                      a.S(str);
                   }
                   ts.setPadding(a1.e(14.00f), 0, a1.e(16.00f), 0);
                   tp = this.q;
                   if (tp == null) {
                      a.S("mIvCommonIcon");
                   }
                   tp.setVisibility(0);
                   tp = this.q;
                   if (tp == null) {
                      a.S("mIvCommonIcon");
                   }
                   tp.L(mUrl);
                }
             }
          }
          tp1 = this.s;
          if (tp1 == null) {
             a.S(str);
          }
          tp1.setPadding(a1.e(20.00f), 0, a1.e(20.00f), 0);
          tp1 = this.q;
          if (tp1 == null) {
             a.S("mIvCommonIcon");
          }
          tp1.setVisibility(i1);
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "8")) {
          uob = this.r;
          if (uob == null) {
             a.S("mTvCommonText");
          }
          tp = this.p;
          if (tp == null) {
             a.S("mCommonBtnModel");
          }
          uob.setText(tp.mText);
          uob = this.p;
          if (uob == null) {
             a.S("mCommonBtnModel");
          }
          CommonBtnModel mTextColor = uob.mTextColor;
          if (mTextColor != null && mTextColor.getMUrl() != null) {
             try{
                uob = this.p;
                if (uob == null) {
                   a.S("mCommonBtnModel");
                }
                mTextColor = uob.mTextColor;
                if (mTextColor != null) {
                   objArray = mTextColor.getMUrl();
                }
                i = Color.parseColor(objArray);
             }catch(java.lang.IllegalArgumentException e0){
                i = a1.a(R.color.arg_RES_7f061d77);
             }
             NearbyCommonRvBtn$b tr = this.r;
             if (tr == null) {
                a.S("mTvCommonText");
             }
             tr.setTextColor(i);
          }
       }
    label_014c :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyCommonRvBtn$b.class, "4")) {
          return;
       }
       int i = 0x7f0a06fe;
       View view = m1.f(p0, i);
       a.o(view, "ViewBindUtils.bindWidget¡­View, R.id.cl_common_btn\)");
       this.s = view;
       view = m1.f(p0, R.id.iv_common_icon);
       a.o(view, "ViewBindUtils.bindWidget¡­iew, R.id.iv_common_icon\)");
       this.q = view;
       view = m1.f(p0, R.id.tv_common_btn);
       a.o(view, "ViewBindUtils.bindWidget¡­View, R.id.tv_common_btn\)");
       this.r = view;
       m1.a(p0, new NearbyCommonRvBtn$b$a(this), i);
       NearbyCommonRvBtn$b ts = this.s;
       if (ts == null) {
          a.S("mRootContainer");
       }
       w0.a(ts, 0x3f000000);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NearbyCommonRvBtn$b.class, "3")) {
          return;
       }
       Object obj = this.q8(CommonBtnModel.class);
       a.o(obj, "inject\(CommonBtnModel::class.java\)");
       this.p = obj;
       this.t = this.t8("ON_BTN_CLICK");
       return;
    }
}
