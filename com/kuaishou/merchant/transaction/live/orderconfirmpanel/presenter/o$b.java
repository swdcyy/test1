package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.o$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.o;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import kk4.i;
import qk4.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ne4.a;
import nk4.y0;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.yxcorp.utility.n;
import et3.a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ue4.x;
import android.text.TextUtils;
import com.kuaishou.merchant.router.RouterConfig;
import us3.f;
import com.kuaishou.merchant.router.b;
import com.kuaishou.merchant.transaction.base.purchasepanel.OrderConfirmLogParam;
import java.util.HashMap;
import java.util.Map;
import tkd.b;
import tkd.d;
import vs3.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.n;
import erd.r;
import nk4.v0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import java.lang.Boolean;
import com.kuaishou.merchant.basic.model.AddressInfo;
import kc4.x;
import com.kuaishou.merchant.transaction.base.address.model.AddressEditParams$a;
import com.kuaishou.merchant.api.core.model.Commodity;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;
import lnc.a1;
import nk4.u0;
import n3d.a;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressEditActivity;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;

public class o$b extends m	// class@000838
{
    public final o c;

    public void o$b(o p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b;
       String str1;
       y0 oy0;
       Activity activity;
       o x;
       RouterConfig obj1;
       Object obj = this;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, obj, o$b.class, str)) {
          return;
       }
       o$b c = obj.c;
       Objects.requireNonNull(c);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, c, oo, "14")) {
          int i = c.v.a();
          int i1 = 0;
          b = true;
          if (i != b) {
             int i2 = 2;
             if (i != i2) {
                int i3 = 3;
                Object[] objArray1 = 4;
                if (i != i3) {
                   if (i != objArray1) {
                      if (i == 8) {
                         c.S8();
                      }
                   }else {
                      c.u.c();
                   }
                }else if(PatchProxy.applyVoid(objArray, c, oo, "21")){
                   str1 = c.v.b();
                   if (!TextUtils.x(str1) && c.getActivity() != null) {
                      if (a.e(str1)) {
                         oy0 = new y0(c);
                         str1 = TextUtils.c(str1, "closeWithCallback", String.valueOf(b));
                      }else {
                         oy0 = objArray;
                      }
                      activity = c.getActivity();
                      MerchantLivePurchasePanelResponse mLogParam = c.y.mLogParam;
                      x = c.x;
                      int i4 = 5;
                      if (PatchProxy.isSupport(a.class)) {
                         objArray1 = new Object[i4];
                         objArray1[i1] = activity;
                         objArray1[b] = str1;
                         objArray1[i2] = mLogParam;
                         objArray1[i3] = x;
                         objArray1[4] = oy0;
                         if (!PatchProxy.applyVoid(objArray1, null, a.class, "3")) {
                         label_00a9 :
                            if (a.e(str1)) {
                               if (n.j(activity) > 0) {
                                  str1 = TextUtils.c(str1, "heightRatio", String.valueOf(a.a));
                               }
                               String merchantSess = x.getMerchantSessionId();
                               if (PatchProxy.isSupport(x.class)) {
                                  objArray = new Object[i4];
                                  objArray[i1] = merchantSess;
                                  objArray[b] = activity;
                                  objArray[2] = str1;
                                  objArray[3] = null;
                                  objArray[4] = oy0;
                                  if (!PatchProxy.applyVoid(objArray, null, x.class, str)) {
                                  }
                               }else {
                                  object oobject = null;
                               }
                            }else {
                               d.a(0x7074b578).Gn(activity, TextUtils.e(str1, a.c(mLogParam)), x);
                            }
                         }
                      }else {
                         goto label_00a9 ;
                      }
                      o t = c.t;
                      if (t != null) {
                         c.C = t.m().skip(1).filter(n.b).subscribe(new v0(c));
                      }
                   }
                }
             }else if(PatchProxy.applyVoid(null, c, oo, "13")){
                str = c.v.b();
                if (!TextUtils.x(str) && c.getActivity() != null) {
                   a.f(c.getActivity(), str, c.y.mLogParam, c.x);
                }
             }
          }else if(PatchProxy.applyVoid(null, c, oo, "17")){
             String str2 = "LiveAudienceOrderConfirmTipsPresenter";
             if (!c.getActivity() instanceof GifshowActivity) {
                a.h(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str2, "tryCreateAddress", "activity", "invalid");
             }else {
                MerchantLivePurchasePanelResponse mAddressInfo = c.y.mAddressInfo;
                AddressEditParams$a obj2 = PatchProxy.applyTwoRefs(c.getActivity(), mAddressInfo, c, oo, "18");
                if (obj2 != patchProxyRe) {
                   i1 = obj2.booleanValue();
                }else if(!x.h(mAddressInfo)){
                   if (TextUtils.x(mAddressInfo.mAddUri)) {
                      a.h(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str2, "tryLev4Address", "addUri", "empty");
                   }else {
                      c.V8(mAddressInfo.mAddUri);
                      i1 = true;
                   }
                }
                if (!i1) {
                   obj2 = new AddressEditParams$a();
                   str2 = PatchProxy.apply(null, c, oo, "26");
                   String str3 = "";
                   if (str2 != patchProxyRe) {
                   }else {
                      o y = c.y;
                      if (y != null) {
                         MerchantLivePurchasePanelResponse mItemInfo = y.mItemInfo;
                         if (mItemInfo != null) {
                            str2 = TextUtils.k(mItemInfo.mId);
                         }
                      }
                      str2 = str3;
                   }
                   obj2.f(str2);
                   obj2.e(b);
                   obj2.d(c.t.Pa());
                   obj2.c(((n.j(c.getActivity()) - c.t.Pa()) - a1.d(R.dimen.arg_RES_7f070319)));
                   obj2.b(b);
                   str1 = PatchProxy.apply(null, c, oo, "27");
                   if (str1 != patchProxyRe) {
                   }else {
                      o x1 = c.x;
                      if (x1 != null) {
                         str3 = TextUtils.k(x1.getLiveAuthorId());
                      }
                      str1 = str3;
                   }
                   obj2.h(str1);
                   MerchantAddressEditActivity.C3(c.getActivity(), obj2, new u0(c));
                }
             }
          }
       }
    label_0244 :
       o$b c1 = obj.c;
       b.a(obj.c.getActivity()).j(c1.y, c1.x.getLiveStreamPackage());
       return;
    }
}
