package com.kuaishou.merchant.home2.magnet.supersale.SuperSaleBannerPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zw3.d;
import java.util.Objects;
import com.kuaishou.merchant.home2.skin.f;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.home2.magnet.supersale.SuperSaleBannerPresenter$onBind$1$1;
import rz3.d;
import msd.l;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$ShowConfig;
import com.kuaishou.merchant.home2.magnet.supersale.SuperSaleBannerPresenter$onUnbind$1;
import rz3.c;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import p74.a;
import o74.a;
import d04.h;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$SuperSaleBannerStyle;
import android.net.Uri;
import d04.h$a;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.Boolean;
import com.kuaishou.merchant.home2.skin.model.SkinConfig;
import zw3.b;
import km8.b;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import androidx.fragment.app.FragmentActivity;
import xw3.e;
import rz3.b;
import xw3.c;
import ot3.a;
import com.kwai.robust.PatchProxyResult;
import ekd.b0;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.Number;
import android.media.ExifInterface;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import java.lang.Exception;
import java.lang.Throwable;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.merchant.home2.magnet.supersale.SuperSaleBannerPresenter$a;
import android.view.View$OnClickListener;
import java.lang.Integer;
import java.util.Map;
import com.kuaishou.merchant.home2.skin.model.MerchantHomeSkin$HotWord;
import com.kuaishou.merchant.home2.magnet.supersale.SuperSaleBannerPresenter$b;
import rz3.a;
import tb7.c;
import java.lang.Long;
import android.view.View;
import ekd.m1;
import com.kuaishou.merchant.feed.widget.MerchantKwaiImageView;

public final class SuperSaleBannerPresenter extends PresenterV2	// class@0017f6
{
    public MerchantKwaiImageView p;
    public MerchantKwaiImageView q;
    public f r;
    public MerchantHomeSkin$ShowConfig s;

    public void SuperSaleBannerPresenter(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, SuperSaleBannerPresenter.class, "3")) {
          return;
       }
       Objects.requireNonNull(d.a);
       SuperSaleBannerPresenter tr = this.r;
       if (tr != null) {
          f b = tr.b;
          if (b != null) {
             Activity activity = this.getActivity();
             Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
             b.observe(activity, new d(new SuperSaleBannerPresenter$onBind$1$1(this)));
          }
       }
       this.R8(this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SuperSaleBannerPresenter.class, "6")) {
          return;
       }
       SuperSaleBannerPresenter tr = this.r;
       if (tr != null) {
          f b = tr.b;
          if (b != null) {
             b.removeObserver(new c(new SuperSaleBannerPresenter$onUnbind$1(this)));
          }
       }
       return;
    }
    public final void P8(MerchantHomeSkin$ShowConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SuperSaleBannerPresenter.class, "5")) {
          return;
       }
       SuperSaleBannerPresenter ts = this.s;
       this.s = p0;
       if (a.g(ts, p0) ^ 0x01) {
          this.R8(p0);
       }
       return;
    }
    public final void R8(MerchantHomeSkin$ShowConfig p0){
       SuperSaleBannerPresenter p;
       String str2;
       int i2;
       int hotWordType;
       h$a a;
       boolean b;
       Object obj = this;
       String obj1 = p0;
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, SuperSaleBannerPresenter.class, str)) {
          return;
       }
       SuperSaleBannerPresenter obj2 = null;
       MerchantHomeSkin$ShowConfig mSuperSaleBa = (obj1 != null)? obj1.mSuperSaleBannerStyle: obj2;
       int i = 8;
       String str1 = "mSuperScaleBannerIv";
       if (mSuperSaleBa == null) {
          p = obj.p;
          if (p == null) {
             a.S(str1);
          }
          p.setVisibility(i);
          a.g(MerchantHomeLogBiz.Skin, "SuperSaleBannerPresenter", "mSuperSaleBannerStyle == null");
          return;
       }else {
          p = obj.p;
          if (p == null) {
             a.S(str1);
          }
          int i1 = 0;
          p.setVisibility(i1);
          MerchantHomeSkin$ShowConfig mSuperSaleBa1 = obj1.mSuperSaleBannerStyle;
          Uri uri = h.a.b(mSuperSaleBa1.mSkinRootDirPath, mSuperSaleBa1.mBackgroundImgUrl);
          if (uri == null) {
             str2 = mSuperSaleBa1.mSkinRootDirPath+File.separator+mSuperSaleBa1.mBackgroundImgUrl;
             a.i(MerchantHomeLogBiz.Skin, "SuperSaleBannerPresenter", "uri == null", "resPath", str2, "exist", Boolean.valueOf(new File(str2).exists()));
             p = obj.p;
             if (p == null) {
                a.S(str1);
             }
             p.setVisibility(i);
             return;
          }else {
             SkinConfig skinConfig = SkinConfig.class;
             String str3 = b.a.getString(b.d("user")+"merchant_home_skin_config", "null");
             SkinConfig skinConfig1 = (str3 == null || str3 == "")? obj2: b.a(str3, skinConfig);
             Activity activity = this.getActivity();
             str2 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity";
             Objects.requireNonNull(activity, str2);
             e uoe = e.q0(activity);
             long l = (skinConfig1 != null)? skinConfig1.getMaterialId(): 0;
             uoe.x0(new b(l));
             String str4 = mSuperSaleBa1.mSkinRootDirPath+mSuperSaleBa1.mBackgroundImgUrl;
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             a uoa = a.class;
             b0 uob0 = PatchProxy.applyOneRefs(str4, obj2, uoa, str);
             if (uob0 != patchProxyRe) {
             }else {
                BitmapFactory$Options options = new BitmapFactory$Options();
                b = true;
                options.inJustDecodeBounds = b;
                BitmapFactory.decodeFile(str4, options);
                Object obj3 = PatchProxy.applyOneRefs(str4, obj2, uoa, "5");
                BitmapFactory$Options options1 = 270;
                if (obj3 != patchProxyRe) {
                   i2 = obj3.intValue();
                }else {
                   try{
                      i2 = new ExifInterface(str4).getAttributeInt("Orientation", b);
                      if (i2 != 3) {
                         if (i2 != 6) {
                            if (i2 == i) {
                               i2 = 270;
                            }
                         }else {
                            i2 = 90;
                         }
                      }else {
                         i2 = 180;
                      }
                   }catch(java.lang.Exception e0){
                      a.l(MerchantCommonLogBiz.KERNELS, a.a, e0.getMessage(), e0);
                   }
                   i2 = 0;
                }
                b0 uob01 = (i2 == 90 || i2 == options1)? new b0(options.outHeight, options.outWidth): new b0(options.outWidth, options.outHeight);
                uob0 = uob01;
             }
             if (uob0.a == null || uob0.b == null) {
                String str5 = mSuperSaleBa1.mSkinRootDirPath+File.separator+mSuperSaleBa1.mBackgroundImgUrl;
                File uFile = new File(str5);
                a.k(MerchantHomeLogBiz.Skin, "SuperSaleBannerPresenter", "uri == null", "resPath", str5, "exist", Boolean.valueOf(uFile.exists()), "fileSize", Long.valueOf(c.c(uFile)), "picSize", uob0.a+','+uob0.b);
                return;
             }else {
                activity = this.getActivity();
                Objects.requireNonNull(activity, str2);
                i2 = (int)((((float)uob0.b * 0x3f800000) / (float)uob0.a) * (float)n.z(activity));
                if (skinConfig1 != null && skinConfig1.getVersion() == obj1.mVersion) {
                   obj1 = skinConfig1.getSuperBannerJumpUrl();
                   hotWordType = skinConfig1.getHotWordType();
                }else {
                   obj1 = null;
                   hotWordType = 0;
                }
                obj2 = obj.p;
                if (obj2 == null) {
                   a.S(str1);
                }
                ViewGroup$LayoutParams layoutParams = obj2.getLayoutParams();
                layoutParams.height = i2;
                p = obj.p;
                if (p == null) {
                   a.S(str1);
                }
                p.setLayoutParams(layoutParams);
                p = obj.p;
                if (p == null) {
                   a.S(str1);
                }
                p.A(uri, i1, i1);
                p = obj.p;
                if (p == null) {
                   a.S(str1);
                }
                p.setTag(R.id.view_data_tag, obj1);
                p = obj.p;
                if (p == null) {
                   a.S(str1);
                }
                p.setOnClickListener(new SuperSaleBannerPresenter$a(obj, skinConfig1));
                MerchantHomeSkin$HotWord hotWord = mSuperSaleBa1.mHotWordMap.get(Integer.valueOf(hotWordType));
                a = h.a;
                MerchantHomeSkin$SuperSaleBannerStyle mSkinRootDir = mSuperSaleBa1.mSkinRootDirPath;
                MerchantHomeSkin$HotWord mImageUrl = (hotWord != null)? hotWord.mImageUrl: null;
                Uri uri1 = a.b(mSkinRootDir, mImageUrl);
                if (hotWord == null || uri1 == null) {
                   p = obj.q;
                   if (p == null) {
                      a.S("mHotWordIv");
                   }
                   p.setVisibility(i);
                   return;
                }else {
                   SuperSaleBannerPresenter q = obj.q;
                   if (q == null) {
                      a.S("mHotWordIv");
                   }
                   q.setVisibility(i1);
                   q = obj.q;
                   if (q == null) {
                      a.S("mHotWordIv");
                   }
                   q.A(uri1, i1, i1);
                   SuperSaleBannerPresenter q1 = obj.q;
                   if (q1 == null) {
                      a.S("mHotWordIv");
                   }
                   q1.setTag(R.id.view_data_tag, hotWord.mJumpUrl);
                   p = obj.q;
                   if (p == null) {
                      a.S("mHotWordIv");
                   }
                   p.setOnClickListener(new SuperSaleBannerPresenter$b(obj, hotWordType, skinConfig1));
                   activity = this.getActivity();
                   Objects.requireNonNull(activity, str2);
                   uoe = e.q0(activity);
                   l = (skinConfig1 != null)? skinConfig1.getMaterialId(): 0;
                   uoe.x0(new a(hotWordType, l));
                   return;
                }
             }
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SuperSaleBannerPresenter.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3c1c);
       this.q = m1.f(p0, 0x7f0a12ff);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SuperSaleBannerPresenter.class, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.r = f.p0(activity);
       this.s = this.t8("MERCHANT_HOME_SKIN_SHOW_CONFIG");
       return;
    }
}
