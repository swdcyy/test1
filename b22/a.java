package b22.a;
import java.lang.Object;
import android.app.Activity;
import android.net.Uri;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.x0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.net.URLDecoder;
import d61.v;
import java.lang.Number;
import lnc.a1;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public class a	// class@0002ef
{

    public void a(){
       super();
    }
    public static LiveWebViewParam a(Activity p0,Uri p1){
       boolean b;
       float f;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, null, uoa, "1");
       if (p0 != patchProxyRe) {
          return p0;
       }
       LiveWebViewParam liveWebViewP = LiveWebViewParam.createDefaultParam();
       String str = x0.a(p1, "url");
       if (!TextUtils.x(str)) {
          try{
             URLDecoder.decode(str, "utf-8");
             String str1 = x0.a(p1, "fullscreen");
             int i = 0;
             if (!TextUtils.x(str1)) {
                b = (v.e(str1, 1) == 1)? true: false;
                liveWebViewP.setFullScreen(b);
             }
             str1 = x0.a(p1, "heightratio");
             if (TextUtils.x(str1)) {
                str1 = x0.a(p1, "heightRatio");
             }
             if (!TextUtils.x(str1)) {
                Object obj = PatchProxy.applyOneRefs(str1, null, uoa, "2");
                if (obj != patchProxyRe) {
                   f = obj.floatValue();
                }else if(!TextUtils.x(str1)){
                   f = v.d(str1, 0x3f19999a);
                   if (f > 0) {
                      if (f - 0x3f800000 > 0) {
                         f = 0x3f800000;
                      }
                   }
                }
                f = 0x3f19999a;
                liveWebViewP.setPortraitHeightRatio(f);
             }else {
                str1 = x0.a(p1, "portraitheight");
                if (!TextUtils.x(str1)) {
                   liveWebViewP.setPortraitHeightPixel(a1.e((float)v.e(str1, 325)));
                }
             }
             str1 = x0.a(p1, "layouttype");
             if (!TextUtils.x(str1)) {
                liveWebViewP.setLayoutType(str1);
             }
             str1 = x0.a(p1, "dimamount");
             if (!TextUtils.x(str1)) {
                f = v.d(str1, 0);
                if (f >= 0 && f - 0x3f800000 <= 0) {
                   liveWebViewP.setDimAmount(f);
                }
             }
             str1 = x0.a(p1, "intoutanimation");
             if (!TextUtils.x(str1)) {
                liveWebViewP.setInOutAnimation(v.e(str1, i));
             }
             str1 = x0.a(p1, "enablepandown");
             if (!TextUtils.x(str1)) {
                b = (v.e(str1, 1) == 1)? true: false;
                liveWebViewP.setEnablePanDown(b);
             }
             str1 = x0.a(p1, "dismisstouchoutside");
             if (!TextUtils.x(str1)) {
                b = (v.e(str1, 1) == 1)? true: false;
                liveWebViewP.setEnableClickOutsideDismiss(b);
             }
             str1 = x0.a(p1, "transparent");
             if (!TextUtils.x(str1)) {
                b = (v.e(str1, 1) == 1)? true: false;
                liveWebViewP.setTransparent(b);
             }
             str1 = x0.a(p1, "needcorner");
             if (!TextUtils.x(str1)) {
                b = (v.e(str1, 1) == 1)? true: false;
                liveWebViewP.setNeedCorner(b);
             }
             str1 = x0.a(p1, "actionbarleftdrawableresid");
             if (!TextUtils.x(str1)) {
                liveWebViewP.setActionBarLeftDrawableResId(v.e(str1, i));
             }
             str1 = x0.a(p1, "actionbarleftbtntype");
             if (!TextUtils.x(str1)) {
                liveWebViewP.setActionBarLeftBtnType(str1);
             }
             str1 = x0.a(p1, "hidelefttopbtn");
             if (!TextUtils.x(str1)) {
                b = (v.e(str1, i) == 1)? true: false;
                liveWebViewP.setHideLeftTopBtn(b);
             }
             str1 = x0.a(p1, "title");
             if (!TextUtils.x(str1)) {
                liveWebViewP.setTitle(str1);
             }
             str1 = x0.a(p1, "titlecolor");
             if (!TextUtils.x(str1)) {
                liveWebViewP.setTitleColor(str1);
             }
             str1 = x0.a(p1, "actionbarbgcolor");
             if (!TextUtils.x(str1)) {
                liveWebViewP.setActionBarBgColor(str1);
             }
             str1 = x0.a(p1, "enableloading");
             if (!TextUtils.x(str1)) {
                b = (v.e(str1, 1) == 1)? true: false;
                liveWebViewP.setEnableLoading(b);
             }
             str1 = x0.a(p1, "closefullscreenwhenloaderror");
             if (!TextUtils.x(str1)) {
                b = (v.e(str1, i) == 1)? true: false;
                liveWebViewP.setCloseFullScreenWhenLoadError(b);
             }
             str1 = x0.a(p1, "progressbarcolor");
             if (!TextUtils.x(str1)) {
                liveWebViewP.setProgressBarColor(str1);
             }
             str1 = x0.a(p1, "daynightmode");
             Object obj1 = PatchProxy.applyOneRefs(str1, null, uoa, "3");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(!TextUtils.n(str1, "0") && (TextUtils.n(str1, "2") || TextUtils.n(str1, "1"))){
                b1 = true;
             }else {
                b1 = false;
             }
             if (b1) {
                liveWebViewP.setDayNightMode(str1);
             }
             String str2 = x0.a(p1, "webviewbgcolor");
             if (!TextUtils.x(str2)) {
                liveWebViewP.setWebViewBgColor(str2);
             }
             str2 = x0.a(p1, "keeplandscapeifneeded");
             if (!TextUtils.x(str2)) {
                liveWebViewP.setIsKeepLandscape(Boolean.parseBoolean(str2));
             }
             str2 = x0.a(p1, "enablepercentscreenheight");
             if (!TextUtils.x(str2)) {
                b1 = (v.e(str2, i) == 1)? true: false;
                liveWebViewP.setEnablePercentScreenHeight(b1);
             }
             String str3 = x0.a(p1, "enableshowexitbutton");
             if (!TextUtils.x(str3)) {
                if (v.e(str3, i) == 1) {
                   i = true;
                }
                liveWebViewP.setEnableShowExitIcon(i);
             }
          }catch(java.io.UnsupportedEncodingException e15){
             b.H(LiveLogTag.LIVE_ROUTER, "LiveWebViewUtils decode url fail", "url", str, e15);
          }
       }
    }
}
