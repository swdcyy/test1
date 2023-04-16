package iy8.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mxb.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAction;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import android.content.Context;
import lnc.y0;
import android.widget.RelativeLayout$LayoutParams;
import android.view.View;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoShopOrderWidgetPresenter$initView$1;
import msd.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$SecondNeoInfo;
import java.lang.CharSequence;
import android.text.SpannableString;
import com.yxcorp.utility.TextUtils;
import com.kwai.library.widget.popup.bubble.a$c;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import yx.j0;

public final class b extends PresenterV2	// class@002737
{
    public BaseFeed p;

    public void b(){
       super();
    }
    public void E8(){
       boolean b;
       PhotoAdvertisement photoAdverti;
       PhotoAdvertisement$InspireAction mAwardType;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       c a = c.a;
       b tp = this.p;
       Objects.requireNonNull(a);
       View obj = PatchProxy.applyOneRefs(tp, a, c.class, "35");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!c.R(tp)){
          b = false;
       }else if(tp != null){
          photoAdverti = tp.get("AD");
       }else {
          photoAdverti = objArray;
       }
       if (photoAdverti != null) {
          PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
          if (adData != null) {
             adData = adData.mInspireAdInfo;
             if (adData != null) {
                PhotoAdvertisement$InspireAdInfo mInspireActi = adData.mInspireAction;
                if (mInspireActi != null) {
                   mAwardType = mInspireActi.mAwardType;
                label_004e :
                   b = a.g(mAwardType, "PLAY_AND_ORDER");
                }
             }
          }
       }
       mAwardType = objArray;
       goto label_004e ;
       if (!b) {
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uob, "3")){
          ImageView imageView = new ImageView(this.getContext());
          RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(y0.l(0x7f07032a), y0.l(0x7f07032a));
          layoutParams.addRule(11);
          layoutParams.topMargin = y0.l(0x7f0702d5);
          layoutParams.rightMargin = y0.l(0x7f070271);
          obj = this.m8();
          if (obj instanceof RelativeLayout) {
             objArray = obj;
          }
          if (objArray != null) {
             objArray.addView(imageView, layoutParams);
          }
          this.P8(imageView);
          imageView.setImageResource(R.drawable.arg_RES_7f0800ad);
          y0.a(imageView, new AwardVideoShopOrderWidgetPresenter$initView$1(this, imageView));
       }
       return;
    }
    public final void P8(ImageView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       PhotoAdvertisement$SecondNeoInfo secondNeoInf = c.r(this.p);
       CharSequence uCharSequenc = null;
       Activity uActivity = null;
       if (secondNeoInf != null) {
          PhotoAdvertisement$SecondNeoInfo mWebWidgetTo = secondNeoInf.mWebWidgetToast;
          mWebWidgetTo = (mWebWidgetTo == null || !mWebWidgetTo.length())? 1: null;
          if (mWebWidgetTo) {
             secondNeoInf = uCharSequenc;
          }
          if (secondNeoInf != null) {
             uCharSequenc = TextUtils.C(y0.k(R.color.arg_RES_7f061e1d), secondNeoInf.mWebWidgetToast, String.valueOf(secondNeoInf.mExtraNeoValue));
          }
       }
       a$c uoc = (uCharSequenc == null || !uCharSequenc.length())? 1: null;
       if (!uoc) {
          uActivity = this.getActivity();
          a.m(uActivity);
          uoc = new a$c(uActivity);
          uoc.q0(true);
          uoc.o0(p0);
          uoc.F0(uCharSequenc);
          uoc.P(true);
          uoc.T(3000);
          uoc.D(PopupInterface$Excluded.NOT_AGAINST);
          a.o(uoc, "builder");
          p.m(uoc);
       }else {
          Object[] objArray = new Object[uActivity];
          j0.l("ShopOrder", "toast value is null or empty", objArray);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(BaseFeed.class);
       return;
    }
}
