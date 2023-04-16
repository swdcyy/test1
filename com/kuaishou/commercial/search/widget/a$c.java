package com.kuaishou.commercial.search.widget.a$c;
import xy.d;
import com.kuaishou.commercial.search.widget.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import nl9.h;
import com.google.gson.JsonObject;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.commercial.search.widget.AdSearchHomeWidgetViewPresenter$initView$2;
import msd.l;
import lnc.y0;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import xy.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SearchSuspendedBallInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$WeakStyle;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.commercial.search.widget.AdSearchHomeWidgetViewPresenter$bindViewData$1;
import com.kuaishou.android.model.ads.PhotoAdvertisement$StrongStyle;
import com.kuaishou.commercial.search.widget.AdSearchHomeWidgetViewPresenter$bindViewData$2;
import java.lang.Boolean;

public final class a$c implements d	// class@001578
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       a y;
       PhotoAdvertisement$WeakStyle mPictureUrl;
       PhotoAdvertisement$StrongStyle mPictureUrl1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$c.class, "1")) {
          return;
       }
       a$c ta = this.a;
       Objects.requireNonNull(ta);
       a uoa = a.class;
       if (!PatchProxy.applyVoid(objArray, ta, uoa, "4")) {
          if (!PatchProxy.applyVoid(objArray, ta, uoa, "13")) {
             ta.W8(1);
             y = ta.D;
             if (y != null) {
                Iterator iterator1 = y.iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().a(ta.S8());
                }
             }
          }
          boolean b = false;
          View view = a.d(ta.getContext(), R.layout.arg_RES_7f0d1359, ta.w, b);
          ta.x = view;
          if (view != null) {
             ta.z = view.findViewById(0x7f0a458c);
             a w = ta.w;
             if (w != null) {
                w.addView(view);
             }
             ta.B = view.findViewById(0x7f0a4560);
             ta.A = view.findViewById(0x7f0a3b7f);
             ta.y = view.findViewById(0x7f0a0782);
          }
          y = ta.y;
          if (y != null) {
             y0.a(y, new AdSearchHomeWidgetViewPresenter$initView$2(ta));
          }
          String str = "mAdSuspendedBallManager";
          if (!PatchProxy.applyVoid(objArray, ta, uoa, "6")) {
             y = ta.v;
             a.o(y, str);
             if (y.a() != null) {
                y = ta.v;
                a.o(y, str);
                PhotoAdvertisement photoAdverti = k.A(y.a());
                a b1 = ta.B;
                if (b1 != null) {
                   if (photoAdverti != null) {
                      PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
                      if (adData != null) {
                         adData = adData.mSearchSuspendedBallInfo;
                         if (adData != null) {
                            PhotoAdvertisement$SearchSuspendedBallInfo mWeakStyle = adData.mWeakStyle;
                            if (mWeakStyle != null) {
                               mPictureUrl = mWeakStyle.mPictureUrl;
                            label_00d0 :
                               b1.L(mPictureUrl);
                            }
                         }
                      }
                   }
                   mPictureUrl = objArray;
                   goto label_00d0 ;
                }
                b1 = ta.B;
                if (b1 != null) {
                   y0.a(b1, new AdSearchHomeWidgetViewPresenter$bindViewData$1(ta));
                }
                b1 = ta.A;
                if (b1 != null) {
                   if (photoAdverti != null) {
                      PhotoAdvertisement$AdData adData1 = photoAdverti.getAdData();
                      if (adData1 != null) {
                         adData1 = adData1.mSearchSuspendedBallInfo;
                         if (adData1 != null) {
                            PhotoAdvertisement$SearchSuspendedBallInfo mStrongStyle = adData1.mStrongStyle;
                            if (mStrongStyle != null) {
                               mPictureUrl1 = mStrongStyle.mPictureUrl;
                            label_00f7 :
                               b1.L(mPictureUrl1);
                            }
                         }
                      }
                   }
                   mPictureUrl1 = objArray;
                   goto label_00f7 ;
                }
                y = ta.A;
                if (y != null) {
                   y0.a(y, new AdSearchHomeWidgetViewPresenter$bindViewData$2(ta));
                }
             }
          }
          ta.Y8(b);
          y = ta.z;
          if (y != null) {
             float f = (ta.E != null)? ta.p + (float)ta.s: ta.q;
             y.setTranslationY((- f));
          }
          y = ta.v;
          a.o(y, str);
          if (y.b() != 2 && !PatchProxy.applyVoid(objArray, ta, uoa, "10")) {
             a d = ta.D;
             if (d != null) {
                Iterator iterator = d.iterator();
                while (iterator.hasNext()) {
                   iterator.next().d(ta.z);
                }
             }
          }
       }
    label_014d :
       return;
    }
    public void b(boolean p0){
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "2")) {
          return;
       }
       this.a.Y8(p0);
       return;
    }
}
