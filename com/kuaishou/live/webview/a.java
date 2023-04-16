package com.kuaishou.live.webview.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.bridge.YodaBaseWebView;
import o63.a;
import o63.e;
import com.kuaishou.live.webview.jsbridge.LiveWebCommandBridge;
import android.app.Activity;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import gy7.l;
import kq3.a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.LiveYodaWebViewFragment;
import lp3.e;
import com.kuaishou.live.webview.context.LiveWebViewBackgroundImageParam;
import jq3.b;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import jyc.b;
import android.content.Intent;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.yoda.model.LaunchModel;
import jq3.d;
import java.lang.reflect.Field;
import java.lang.IllegalAccessException;
import androidx.fragment.app.Fragment;
import lq3.e;
import androidx.fragment.app.DialogFragment;
import uxc.b;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import lq3.c;
import uxc.a;
import lq3.g;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import android.content.DialogInterface$OnDismissListener;
import kq3.b;
import com.kuaishou.live.webview.LiveWebViewActivity;
import com.yxcorp.gifshow.webview.c;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.utility.n;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import lnc.l1;
import com.kuaishou.live.webview.widget.LiveLandscapeDialogContainerFragment;
import java.util.Objects;
import java.lang.Integer;
import android.app.Dialog;
import android.view.Window;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import com.kuaishou.live.webview.widget.LiveSwipeDialogContainerFragment;
import com.kuaishou.live.webview.widget.LiveRoundCornerDialogContainerFragment;
import com.kuaishou.live.webview.widget.LiveWebViewBaseDialogContainerFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import jq3.c;
import com.yxcorp.gifshow.fragment.DialogContainerFragment$b;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.c;

public class a	// class@000ffd
{
    public DialogInterface$OnDismissListener a;
    public DialogInterface$OnShowListener b;
    public e c;
    public static final String d = "a";

    public void a(){
       super();
    }
    public static a c(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public static void d(YodaBaseWebView p0,a p1,e p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "10")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       LiveWebCommandBridge.s(p0, p1, p2);
       return;
    }
    public KwaiYodaWebView a(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       YodaBaseWebView yodaBaseWebV = l.d().a(p0);
       if (!yodaBaseWebV instanceof KwaiYodaWebView) {
          return null;
       }
       yodaBaseWebV.setWebViewEmbedded(true);
       return yodaBaseWebV;
    }
    public WebViewFragment b(String p0,a p1){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p1.b;
       obj.mWebUrl = p0;
       LiveYodaWebViewFragment liveYodaWebV = new LiveYodaWebViewFragment(p1.a(), this.c);
       LiveWebViewParam mBackGroundI = obj.mBackGroundImageParam;
       if (mBackGroundI != null && mBackGroundI.mIsShowLoadingBackgroundImage != null) {
          b uob = new b(liveYodaWebV, obj);
          if (!PatchProxy.applyVoidOneRefs(uob, liveYodaWebV, LiveYodaWebViewFragment.class, "3")) {
             a.p(uob, "controllerProvider");
             liveYodaWebV.C = uob;
          }
       }
       liveYodaWebV.D = obj.needClipCorner();
       liveYodaWebV.E = (float)obj.mTopRadiusDp;
       KwaiYodaWebViewActivity$c uoc = KwaiYodaWebViewActivity.G3(p1.a, p0);
       if (obj.mNeedCorner != null) {
          uoc.c("KEY_ACTIONBAR_TOP_ROUND_DP", (float)obj.mTopRadiusDp);
       }
       LiveWebViewParam mActionBarLe = obj.mActionBarLeftDrawableResId;
       if (mActionBarLe != null) {
          uoc.d("KEY_ACTIONBAR_LEFT_BUTTON_DRAWABLE", mActionBarLe);
       }
       uoc.i(obj.mActionBarLeftBtnType);
       mActionBarLe = obj.mLayoutType;
       p0 = b.b(p0);
       if (!("0").equals(p0)) {
          str = p0;
       }
       Intent intent = uoc.k(p1.e).a();
       intent.putExtra("KEY_THEME", str);
       if (!TextUtils.x(obj.mWebTypeUA)) {
          intent.putExtra("KEY_WEB_TYPE", obj.mWebTypeUA);
       }
       Serializable serializable = SerializableHook.getSerializable(intent.getExtras(), "model");
       if (serializable instanceof LaunchModel) {
          LaunchModel launchModel = obj.getLaunchModel();
          Class obj1 = PatchProxy.applyTwoRefs(launchModel, serializable, null, d.class, "2");
          if (obj1 != patchProxyRe) {
             launchModel = obj1;
          }else {
             Class class = launchModel.getClass();
             obj1 = launchModel.getClass();
             if (class == obj1) {
                Field[] declaredFiel = class.getDeclaredFields();
                Field[] declaredFiel1 = obj1.getDeclaredFields();
                int i = 0;
                while (i < declaredFiel.length) {
                   object oobject = declaredFiel[i];
                   object oobject1 = declaredFiel1[i];
                   oobject.setAccessible(1);
                   try{
                      oobject1.setAccessible(1);
                      if (oobject.get(launchModel) == null && oobject1.get(serializable) != null) {
                         oobject.set(launchModel, oobject1.get(serializable));
                      }
                   }catch(java.lang.IllegalAccessException e10){
                      e10.printStackTrace();
                   }
                   i = i + 1;
                }
             }
          }
          if (obj.mTransparent != null) {
             launchModel.setWebViewBgColorGrade(1);
             launchModel.setWebViewBgColor(0);
          }
          SerializableHook.putExtra(intent, "model", launchModel);
       }
       liveYodaWebV.setArguments(intent.getExtras());
       a f = p1.f;
       liveYodaWebV.kh(new e(f, liveYodaWebV));
       liveYodaWebV.gh(new c(f, liveYodaWebV));
       liveYodaWebV.lh(new g(f, liveYodaWebV, obj));
       f = p1.i;
       if (f != null) {
          liveYodaWebV.ch(f);
       }
       return liveYodaWebV;
    }
    public a e(e p0){
       this.c = p0;
       return this;
    }
    public a f(DialogInterface$OnDismissListener p0){
       this.a = p0;
       return this;
    }
    public void g(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       b.a(p1);
       c.i(p1.a, LiveWebViewActivity.G3(p1.a, p0).a());
       return;
    }
    public KwaiDialogFragment h(String p0,a p1){
       LiveWebViewParam obj1;
       Dialog dialog;
       LiveLandscapeDialogContainerFragment liveLandscap;
       a b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       LiveLogTag obj = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!PatchProxy.applyVoidOneRefs(p1, this, uoa, "9")) {
          a b1 = p1.b;
          obj1 = b1.mPortraitHeightRatio;
          a uoa1 = null;
          float f = 0x3f800000;
          if (obj1 - f >= 0) {
             b1.mFullScreen = true;
             b1.mPortraitHeightRatio = f;
          }else if(obj1 - uoa1 < 0){
             b1.mPortraitHeightRatio = uoa1;
          }
          if (b1.mFullScreen != null) {
             b1.mPortraitHeightPixel = n.j(p1.a);
          }else {
             LiveWebViewParam mPortraitHei = b1.mPortraitHeightRatio;
             if (mPortraitHei - uoa1 > 0 && mPortraitHei - f <= 0) {
                if (b1.mEnablePercentScreenHeight != null) {
                   b1.mPortraitHeightPixel = (int)((float)n.w(p1.a) * obj1);
                }else {
                   b1.mPortraitHeightPixel = (int)((float)n.j(p1.a) * obj1);
                }
             }
          }
       }
    label_0063 :
       obj = LiveLogTag.LIVE_WEB_VIEW;
       b.d0(obj, "showWebViewWithURL", "url", p0, "mPortraitHeightPixel", p1.b.mPortraitHeightPixel+"");
       obj1 = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "6");
       if (obj1 != patchProxyRe) {
       }else {
          uoa = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "7");
          if (uoa != patchProxyRe) {
          }else {
             uoa = p1.f;
             if (l1.a()) {
                if (uoa instanceof LiveLandscapeDialogContainerFragment) {
                }else {
                   liveLandscap = new LiveLandscapeDialogContainerFragment();
                }
                obj1 = p1.b.mLandscapeWidthPixel;
                Objects.requireNonNull(uoa);
                if (!PatchProxy.isSupport(LiveLandscapeDialogContainerFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(obj1), uoa, LiveLandscapeDialogContainerFragment.class, "3")) {
                   uoa.O = obj1;
                   if (!PatchProxy.applyVoid(null, uoa, LiveLandscapeDialogContainerFragment.class, "4")) {
                      dialog = uoa.getDialog();
                      if (dialog != null) {
                         Window window = dialog.getWindow();
                         if (window != null) {
                            window.setLayout(uoa.O, -1);
                         }
                      }
                   }
                }
                p1.f = uoa;
             }else if(uoa instanceof DialogContainerFragment){
             }else {
                uoa = p1.b;
                if (uoa.mEnablePanDown != null) {
                   liveLandscap = new LiveSwipeDialogContainerFragment(p1.b.mEnableShowExit);
                }else if(uoa.mNeedCorner != null){
                   b = p1.b;
                   liveLandscap = new LiveRoundCornerDialogContainerFragment(b.mTopRadiusDp, b.mEnableShowExit);
                }else {
                   liveLandscap = new LiveWebViewBaseDialogContainerFragment();
                }
                b = p1.b;
                if (b.mEnablePercentScreenHeight != null && b.mFullScreen == null) {
                   liveLandscap.uh(0x1030011);
                }
             }
             uoa.Kh(p1.b.mPortraitHeightPixel);
             p1.f = uoa;
             obj1 = PatchProxy.applyThreeRefs(p0, p1, uoa, this, a.class, "8");
             if (obj1 != patchProxyRe) {
             label_0177 :
                obj1.k0(this.a);
                obj1.ph(this.b);
                b.Z(obj, "showWebViewDialog before dialog showImmediate");
                obj1.Cb(p1.c, p1.d);
                b.Z(obj, "showWebViewDialog after dialog showImmediate");
             }else {
                uoa.Lh(new c(this, p0, p1));
                uoa.Fh(p1.b.mInOutAnimation);
                uoa.Mh(p1.b.mDimAmount);
                uoa.Ih(p1.b.mEnableClickOutsideDismiss);
                if (p1.b.mFullScreen != null && uoa instanceof LiveWebViewBaseDialogContainerFragment) {
                   p0.H = true;
                }
             }
          }
          obj1 = uoa;
          goto label_0177 ;
       }
       return obj1;
    }
}
