package com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosAdMutableLabelPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosAdMutableLabelPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosAdMutableLabelPresenter$mLabelContainer$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosAdMutableLabelPresenter$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.label.thanos.ThanosAdMutableLabelPresenter$c;
import t19.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayInfo;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ExtraDisplayTag;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import android.text.TextUtils;
import java.util.Collection;
import com.yxcorp.gifshow.ad.report.ReportModuleUseTools;
import vy6.a;
import java.util.Objects;
import android.widget.LinearLayout;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Integer;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.TextView;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import android.text.TextPaint;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.ad.detail.view.AdLabelContainer$addLabel$2;
import msd.l;
import lnc.y0;
import vq4.a;
import ekd.m1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import im8.f;
import n49.o;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class ThanosAdMutableLabelPresenter extends PresenterV2	// class@0015c2
{
    public QPhoto p;
    public PhotoDetailParam q;
    public f r;
    public o s;
    public BaseFragment t;
    public LinearLayout u;
    public final p v;
    public final ThanosAdMutableLabelPresenter$b w;
    public final ThanosAdMutableLabelPresenter$c x;
    public static final ThanosAdMutableLabelPresenter$a y;

    static {
       ThanosAdMutableLabelPresenter.y = new ThanosAdMutableLabelPresenter$a(null);
    }
    public void ThanosAdMutableLabelPresenter(){
       super();
       this.v = s.c(new ThanosAdMutableLabelPresenter$mLabelContainer$2(this));
       this.w = new ThanosAdMutableLabelPresenter$b(this);
       this.x = new ThanosAdMutableLabelPresenter$c(this);
    }
    public void E8(){
       Object[] obj1;
       int i1;
       String str3;
       Object obj = this;
       a uoa = a.class;
       ThanosAdMutableLabelPresenter thanosAdMuta = ThanosAdMutableLabelPresenter.class;
       if (PatchProxy.applyVoid(null, obj, thanosAdMuta, "14")) {
          return;
       }
       ThanosAdMutableLabelPresenter p = obj.p;
       String str = "mPhoto";
       if (p == null) {
          a.S(str);
       }
       if (s.D(p)) {
          this.R8().a();
          return;
       }else {
          p = obj.t;
          String str1 = "mFragment";
          if (p == null) {
             a.S(str1);
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(p.getParentFragment());
          ThanosAdMutableLabelPresenter p1 = obj.p;
          if (p1 == null) {
             a.S(str);
          }
          PhotoAdvertisement photoAdverti = k.B(p1);
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
             if (adData != null) {
                adData = adData.mExtraDisplayInfo;
             label_004f :
                if (adData != null && adData.mShowStyle == 3) {
                   PhotoAdvertisement$ExtraDisplayInfo mTagInfoList = adData.mTagInfoList;
                   if (!PatchProxy.applyVoidOneRefs(mTagInfoList, obj, thanosAdMuta, "15")) {
                      Iterator iterator1 = (mTagInfoList != null)? mTagInfoList.iterator(): null;
                      while (iterator1 != null && iterator1.hasNext() == true) {
                         PhotoAdvertisement$ExtraDisplayTag uExtraDispla = iterator1.next();
                         Object obj2 = PatchProxy.applyOneRefs(uExtraDispla, obj, thanosAdMuta, "16");
                         if (obj2 != PatchProxyResult.class) {
                            i1 = obj2.booleanValue();
                         }else if(uExtraDispla != null){
                            uExtraDispla = uExtraDispla.mText;
                            if (uExtraDispla != null) {
                               str3 = StringsKt__StringsKt.o5(uExtraDispla).toString();
                            label_0099 :
                               i1 = TextUtils.isEmpty(str3) ^ true;
                            }
                         }
                         str3 = null;
                         goto label_0099 ;
                         if (!i1) {
                            iterator1.remove();
                         }
                      }
                   }
                   PhotoAdvertisement$ExtraDisplayInfo mTagInfoList1 = adData.mTagInfoList;
                   thanosAdMuta = (mTagInfoList1 == null || mTagInfoList1.isEmpty())? 1: null;
                   if (!thanosAdMuta) {
                      ThanosAdMutableLabelPresenter p2 = obj.p;
                      if (p2 == null) {
                         a.S(str);
                      }
                      ReportModuleUseTools.c("ks_feed_extra_display_info", p2, null, false, null, 28, null);
                      if (slidePlayVie != null) {
                         thanosAdMuta = obj.t;
                         if (thanosAdMuta == null) {
                            a.S(str1);
                         }
                         slidePlayVie.P(thanosAdMuta, obj.w);
                      }
                      this.R8().a = obj.x;
                      a uoa1 = this.R8();
                      Objects.requireNonNull(uoa1);
                      if (!PatchProxy.applyVoid(null, uoa1, uoa, "5")) {
                         uoa1.b.setVisibility(false);
                      }
                      uoa1 = this.R8();
                      PhotoAdvertisement$ExtraDisplayInfo mTagInfoList2 = adData.mTagInfoList;
                      a.o(mTagInfoList2, "displayInfo.mTagInfoList");
                      Objects.requireNonNull(uoa1);
                      if (!PatchProxy.applyVoidOneRefs(mTagInfoList2, uoa1, uoa, "1")) {
                         str = "labelList";
                         a.p(mTagInfoList2, str);
                         if (!PatchProxy.applyVoid(null, uoa1, uoa, "2")) {
                            uoa1.b.removeAllViews();
                         }
                         if (!PatchProxy.applyVoidOneRefs(mTagInfoList2, uoa1, uoa, "3")) {
                            a.p(mTagInfoList2, str);
                            Iterator iterator = mTagInfoList2.iterator();
                            int i = 0;
                            while (iterator.hasNext()) {
                               obj1 = iterator.next();
                               i1 = i + 1;
                               if (i < 0) {
                                  CollectionsKt__CollectionsKt.W();
                               }
                               boolean b = (i1 == mTagInfoList2.size())? true: false;
                               if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), obj1, Boolean.valueOf(b), uoa1, a.class, "4")) {
                                  TextView textView = a.k(uoa1.b, R.layout.bg, false);
                                  if (b) {
                                     Drawable drawable = ContextCompat.getDrawable(uoa1.b.getContext(), R.drawable.arg_RES_7f0800a5);
                                     if (drawable != null) {
                                        a.o(drawable, "this");
                                        drawable.setBounds(false, false, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                                        textView.setCompoundDrawables(null, null, drawable, null);
                                     }
                                  }
                                  a.o(textView, "textView");
                                  TextPaint paint = textView.getPaint();
                                  a.o(paint, "textView.paint");
                                  paint.setFakeBoldText(true);
                                  String str2 = (!b)? obj1.mText+" ": obj1.mText;
                                  textView.setText(str2);
                                  y0.a(textView, new AdLabelContainer$addLabel$2(uoa1, i, obj1));
                                  uoa1.b.addView(textView);
                               }
                               i = i1;
                            }
                         }
                      }
                   }else {
                      this.R8().a();
                   }
                }else {
                   this.R8().a();
                }
                return;
             }
          }
          obj1 = null;
          goto label_004f ;
       }
    }
    public final a P8(int p0,PhotoAdvertisement$ExtraDisplayTag p1){
       a obj;
       ThanosAdMutableLabelPresenter thanosAdMuta = ThanosAdMutableLabelPresenter.class;
       if (PatchProxy.isSupport(thanosAdMuta)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, thanosAdMuta, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a();
       obj.a = p0;
       obj.b = p1.mText;
       return obj;
    }
    public final a R8(){
       Object obj = PatchProxy.apply(null, this, ThanosAdMutableLabelPresenter.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdMutableLabelPresenter.class, "13")) {
          return;
       }
       p0 = m1.f(p0, R.id.slide_play_ad_label_container);
       a.o(p0, "bindWidget\(rootView, R.i¡­_play_ad_label_container\)");
       this.u = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdMutableLabelPresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.q = obj;
       obj = this.x8("DETAIL_AVATAR_CLICK_HANDLER");
       a.o(obj, "injectRef\(AccessIds.DETAIL_AVATAR_CLICK_HANDLER\)");
       this.r = obj;
       Object obj1 = this.q8(o.class);
       a.o(obj1, "inject\(PhotoAdActionBarClickProcessor::class.java\)");
       this.s = obj1;
       obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.t = obj1;
       return;
    }
}
