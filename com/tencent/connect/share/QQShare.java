package com.tencent.connect.share.QQShare;
import com.tencent.connect.common.BaseApi;
import android.content.Context;
import com.tencent.connect.auth.QQToken;
import android.app.Activity;
import android.os.Bundle;
import com.tencent.tauth.IUiListener;
import java.lang.String;
import com.tencent.open.log.SLog;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.open.utils.k;
import com.tencent.open.utils.c;
import com.tencent.connect.share.QQShare$1;
import com.tencent.open.utils.d;
import com.tencent.connect.share.QQShare$2;
import com.tencent.connect.share.a;
import java.io.File;
import com.tencent.tauth.UiError;
import com.tencent.open.utils.f;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.StringBuffer;
import android.util.Base64;
import com.tencent.open.utils.i;
import android.net.Uri;
import com.tencent.connect.a.a;
import android.content.Intent;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.b.e;
import android.os.SystemClock;
import java.lang.Long;
import com.tencent.open.TDialog;
import android.app.Dialog;
import java.lang.Throwable;
import java.lang.RuntimeException;

public class QQShare extends BaseApi	// class@000e4d
{
    public String mViaShareQQType;

    public void QQShare(Context p0,QQToken p1){
       super(p1);
       this.mViaShareQQType = "";
    }
    public static QQToken a(QQShare p0){
       return p0.c;
    }
    public static void a(QQShare p0,Activity p1,Bundle p2,IUiListener p3){
       p0.d(p1, p2, p3);
    }
    public static QQToken b(QQShare p0){
       return p0.c;
    }
    public static QQToken c(QQShare p0){
       return p0.c;
    }
    public final void b(Activity p0,Bundle p1,IUiListener p2){
       SLog.i("openSDK_LOG.QQShare", "shareToMobileQQ\(\) -- start.");
       String str = "imageUrl";
       String str1 = p1.getString(str);
       String str2 = p1.getString("title");
       String str3 = p1.getString("summary");
       SLog.v("openSDK_LOG.QQShare", "shareToMobileQQ -- imageUrl: "+str1);
       if (!TextUtils.isEmpty(str1)) {
          String str4 = "4.3.0";
          if (k.h(str1)) {
             if (!k.f(p0, str4)) {
                this.d(p0, p1, p2);
             }else {
                QQShare$1 u1 = new QQShare$1(this, p1, str2, str3, p2, p0);
                new c(p0).a(str1, v3);
             }
          }else {
             p1.putString(str, null);
             if (k.f(p0, str4)) {
                SLog.d("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is < 4.3.0 ");
                this.d(p0, p1, p2);
             }else {
                SLog.d("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is > 4.3.0:isAppSpecificDir="+k.n(str1)+",hasSDPermission:"+k.c());
                QQShare$2 u2 = new QQShare$2(this, p1, str2, str3, p2, p0);
                a.a(p0, str1, str);
             }
          }
       }else if(p1.getInt("req_type", 1) == 5){
          this.c(p0, p1, p2);
       }else {
          this.d(p0, p1, p2);
       }
       SLog.i("openSDK_LOG.QQShare", "shareToMobileQQ\(\) -- end");
       return;
    }
    public final void c(Activity p0,Bundle p1,IUiListener p2){
       String str = p1.getString("imageLocalUrl");
       String str1 = null;
       if (new File(str).length() - 0x500000 >= 0) {
          if (p2 != null) {
             p2.onError(new UiError(-16, "图片太大，请压缩到5M内再分享!", str1));
          }
          SLog.e("openSDK_LOG.QQShare", "doShareImageToQQ -- error: 图片太大，请压缩到5M内再分享!");
          return;
       }else {
          File uFile = f.a("Images");
          if (uFile != null) {
             str1 = uFile.getAbsolutePath()+File.separator+Constants.QQ_SHARE_TEMP_DIR;
          }else {
             SLog.i("openSDK_LOG.QQShare", "doShareImageToQQ\(\) getExternalFilesDir return null");
          }
          uFile = new File(str);
          str = uFile.getAbsolutePath();
          String name = uFile.getName();
          boolean b = k.n(str);
          SLog.i("openSDK_LOG.QQShare", "doShareImageToQQ\(\) check file: isAppSpecificDir="+b+",hasSDPermission="+k.c()+",fileDir="+str);
          ArrayList uArrayList = new ArrayList(2);
          if (!b && !TextUtils.isEmpty(str1)) {
             name = str1+File.separator+name;
             b = k.a(p0, str, name);
             SLog.i("openSDK_LOG.QQShare", "doShareImageToQQ\(\) sd permission not denied. copy to app specific:"+name+",isSuccess="+b);
             if (b) {
             label_00d5 :
                uArrayList.add(str);
                uArrayList.add(name);
                SLog.i("openSDK_LOG.QQShare", "doShareImageToQQ\(\) destFilePaths=["+uArrayList.get(0)+","+uArrayList.get(1)+"]");
                p1.putStringArrayList("imageLocalUrlArray", uArrayList);
                this.d(p0, p1, p2);
                return;
             }
          }
          name = str;
          goto label_00d5 ;
       }
    }
    public final void d(Activity p0,Bundle p1,IUiListener p2){
       Uri uri;
       int i4;
       e uoe;
       BaseApi uBaseApi = this;
       Context uContext = p0;
       Bundle uBundle = p1;
       SLog.i("openSDK_LOG.QQShare", "doShareToQQ\(\) -- start");
       StringBuffer str = "mqqapi://share/to_fri?src_type=app&version=1&file_type=news";
       String str1 = uBundle.getString("imageUrl");
       String str2 = uBundle.getString("title");
       String str3 = uBundle.getString("summary");
       String str4 = uBundle.getString("targetUrl");
       String str5 = uBundle.getString("audio_url");
       int intx = uBundle.getInt("req_type", 1);
       String str6 = uBundle.getString("mini_program_appid");
       String str7 = uBundle.getString("mini_program_path");
       String str8 = uBundle.getString("mini_program_type");
       String str9 = uBundle.getString("share_to_qq_ark_info");
       String str10 = uBundle.getString("share_qq_ext_str");
       String str11 = k.a(p0);
       int i = uBundle.getInt("cflag", 0);
       if (str11 == null) {
          str11 = uBundle.getString("appName");
       }
       String str12 = str11;
       str11 = str10;
       str10 = uBundle.getString("imageLocalUrl");
       String str13 = str8;
       ArrayList stringArrayL = uBundle.getStringArrayList("imageLocalUrlArray");
       str8 = uBaseApi.c.getAppId();
       String str14 = str7;
       str7 = uBaseApi.c.getOpenIdWithCache();
       String str15 = str6;
       SLog.i("openSDK_LOG.QQShare", "doShareToQQ -- openid: "+str7+",appName="+str12);
       String str16 = "&file_data=";
       int i1 = 2;
       String str17 = str5;
       if (stringArrayL != null && stringArrayL.size() >= i1) {
          str10 = stringArrayL.get(0);
          if (str10 == null) {
             str10 = "";
          }
          str = str+str16+Base64.encodeToString(k.j(str10), i1);
          String str18 = stringArrayL.get(1);
          if (intx == 7 && (!TextUtils.isEmpty(str18) && i.c(uContext, "8.3.3") < 0)) {
             str18 = null;
             SLog.e("openSDK_LOG.QQShare", "doShareToQQ\(\) share to mini program set file uri empty");
          }
       label_00ff :
          uri = k.a(uContext, str8, str18);
          if (uri != null) {
             str = str+"&file_uri="+Base64.encodeToString(k.j(uri.toString()), i1);
          }
       }else if(!TextUtils.isEmpty(str10)){
          str = str+str16+Base64.encodeToString(k.j(str10), i1);
       }
       if (!TextUtils.isEmpty(str1)) {
          str = str+"&image_url="+Base64.encodeToString(k.j(str1), i1);
       }
       if (!TextUtils.isEmpty(str2)) {
          str = str+"&title="+Base64.encodeToString(k.j(str2), i1);
       }
       if (!TextUtils.isEmpty(str3)) {
          str = str+"&description="+Base64.encodeToString(k.j(str3), i1);
       }
       if (!TextUtils.isEmpty(str8)) {
          str = str+"&share_id="+str8;
       }
       if (!TextUtils.isEmpty(str4)) {
          str = str+"&url="+Base64.encodeToString(k.j(str4), i1);
       }
       if (!TextUtils.isEmpty(str12)) {
          int i2 = 20;
          if (str12.length() > i2) {
             str12 = str12.substring(0, i2)+"...";
          }
          str = str+"&app_name="+Base64.encodeToString(k.j(str12), i1);
       }
       if (!TextUtils.isEmpty(str7)) {
          str = str+"&open_id="+Base64.encodeToString(k.j(str7), i1);
       }
       if (!TextUtils.isEmpty(str17)) {
          str = str+"&audioUrl="+Base64.encodeToString(k.j(str17), i1);
       }
       str = str+"&req_type="+Base64.encodeToString(k.j(String.valueOf(intx)), i1);
       if (!TextUtils.isEmpty(str15)) {
          str = str+"&mini_program_appid="+Base64.encodeToString(k.j(String.valueOf(str15)), i1);
       }
       if (!TextUtils.isEmpty(str14)) {
          str = str+"&mini_program_path="+Base64.encodeToString(k.j(String.valueOf(str14)), i1);
       }
       if (!TextUtils.isEmpty(str13)) {
          str = str+"&mini_program_type="+Base64.encodeToString(k.j(String.valueOf(str13)), i1);
       }
       if (!TextUtils.isEmpty(str9)) {
          str = str+"&share_to_qq_ark_info="+Base64.encodeToString(k.j(str9), i1);
       }
       if (!TextUtils.isEmpty(str11)) {
          str = str+"&share_qq_ext_str="+Base64.encodeToString(k.j(str11), i1);
       }
       str = str+"&cflag="+Base64.encodeToString(k.j(String.valueOf(i)), i1)+"&third_sd="+Base64.encodeToString(k.j(String.valueOf(k.c())), i1);
       SLog.v("openSDK_LOG.QQShare", "doShareToQQ -- url: "+str);
       BaseApi uBaseApi1 = this;
       String[] stringArray = new String[]{"shareToNativeQQ"};
       a.a(f.a(), uBaseApi1.c, "requireApi", stringArray);
       Intent intent = new Intent("android.intent.action.VIEW");
       intent.setData(Uri.parse(str));
       intent.putExtra("pkg_name", p0.getPackageName());
       if (k.f(uContext, "4.6.0")) {
          SLog.i("openSDK_LOG.QQShare", "doShareToQQ, qqver below 4.6.");
          if (uBaseApi1.a(intent)) {
             int i3 = 0x2b5f;
             UIListenerManager.getInstance().setListenerWithRequestcode(i3, p2);
             uBaseApi1.a(uContext, intent, i3);
          }
          i4 = i;
          uoe = 1;
       }else {
          SLog.i("openSDK_LOG.QQShare", "doShareToQQ, qqver greater than 4.6.");
          if (UIListenerManager.getInstance().setListnerWithAction("shareToQQ", p2) != null) {
             SLog.i("openSDK_LOG.QQShare", "doShareToQQ, last listener is not null, cancel it.");
          }
          if (uBaseApi1.a(intent)) {
             uoe = true;
             uBaseApi1.a(uContext, 0x2777, intent, uoe);
          }else {
             uoe = true;
          }
          i4 = i;
       }
       String str19 = (i4 == uoe)? "11": "10";
       str4 = str19;
       if (uBaseApi1.a(intent)) {
          e.a().a(uBaseApi1.c.getOpenId(), uBaseApi1.c.getAppId(), "ANDROIDQQ.SHARETOQQ.XX", str4, "3", "0", uBaseApi1.mViaShareQQType, "0", "1", "0");
          e.a().a(0, "SHARE_CHECK_SDK", "1000", uBaseApi1.c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
       }else {
          e.a().a(uBaseApi1.c.getOpenId(), uBaseApi1.c.getAppId(), "ANDROIDQQ.SHARETOQQ.XX", str4, "3", "1", uBaseApi1.mViaShareQQType, "0", "1", "0");
          e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi1.c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent fail");
       }
       SLog.i("openSDK_LOG.QQShare", "doShareToQQ\(\) --end");
       return;
    }
    public void releaseResource(){
    }
    public void shareToQQ(Activity p0,Bundle p1,IUiListener p2){
       boolean b;
       Bundle uBundle1;
       BaseApi uBaseApi = this;
       Context uContext = p0;
       Bundle uBundle = p1;
       IUiListener iUiListener = p2;
       SLog.i("openSDK_LOG.QQShare", "shareToQQ\(\) -- start.");
       String str = uBundle.getString("imageUrl");
       String str1 = "title";
       String str2 = uBundle.getString(str1);
       String str3 = uBundle.getString("summary");
       String str4 = uBundle.getString("targetUrl");
       String str5 = uBundle.getString("imageLocalUrl");
       String str6 = uBundle.getString("mini_program_appid");
       String str7 = uBundle.getString("mini_program_path");
       int intx = uBundle.getInt("req_type", 1);
       String str8 = "summary";
       SLog.i("openSDK_LOG.QQShare", "shareToQQ -- type: "+intx);
       boolean i = 5;
       if (intx != 1) {
          if (intx != 2) {
             if (intx != i) {
                if (intx == 7) {
                   uBaseApi.mViaShareQQType = "9";
                }
             }else {
                uBaseApi.mViaShareQQType = "2";
             }
          }else {
             uBaseApi.mViaShareQQType = "3";
          }
       }else {
          uBaseApi.mViaShareQQType = "1";
       }
       String str9 = null;
       if (!k.a() && k.f(uContext, "4.5.0")) {
          iUiListener.onError(new UiError(-6, "分享图片失败，检测不到SD卡!", str9));
          SLog.e("openSDK_LOG.QQShare", "shareToQQ sdcard is null--end");
          e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ sdcard is null");
          return;
       }else {
          String str10 = "非法的图片地址!";
          str9 = "低版本手Q不支持该项功能!";
          if (intx == 5) {
             if (k.f(uContext, "4.3.0")) {
                iUiListener.onError(new UiError(-6, str9, null));
                SLog.e("openSDK_LOG.QQShare", "shareToQQ, version below 4.3 is not support.");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, version below 4.3 is not support.");
                return;
             }else if(!k.i(str5)){
                iUiListener.onError(new UiError(-6, str10, null));
                SLog.e("openSDK_LOG.QQShare", "shareToQQ -- error: 非法的图片地址!");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "非法的图片地址!");
                return;
             }
          }
          String str11 = "https://";
          str5 = "http://";
          String str12 = str1;
          str1 = "传入参数有误!";
          String str13 = str10;
          if (intx != 5) {
             b = 7;
             if (intx != b) {
                if (TextUtils.isEmpty(str4) || (!str4.startsWith(str5) && !str4.startsWith(str11))) {
                   iUiListener.onError(new UiError(-6, str1, null));
                   SLog.e("openSDK_LOG.QQShare", "shareToQQ, targetUrl is empty or illegal..");
                   e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, targetUrl is empty or illegal..");
                   return;
                }else if(TextUtils.isEmpty(str2)){
                   iUiListener.onError(new UiError(-6, "title不能为空!", null));
                   SLog.e("openSDK_LOG.QQShare", "shareToQQ, title is empty.");
                   e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, title is empty.");
                   return;
                }
             }else if(intx == b){
                int i1 = -5;
                if (!TextUtils.isEmpty(str6) && (!TextUtils.isEmpty(str7) && (TextUtils.isEmpty(str4) || TextUtils.isEmpty(uBaseApi.c.getAppId())))) {
                   iUiListener.onError(new UiError(i1, str1, "appid || path || url empty."));
                   return;
                }else if(i.c(uContext, "8.0.8") < 0 && (i.d(uContext, "3.1") >= 0 || i.a(uContext, "com.tencent.qqlite") != null)){
                   b = true;
                }else {
                   b = false;
                }
                if (!b) {
                   iUiListener.onError(new UiError(i1, str9, "版本过低，不支持分享小程序"));
                   return;
                }else if(TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)){
                   iUiListener.onError(new UiError(i1, str1, "title || summary empty."));
                   return;
                }
             }
             if (!TextUtils.isEmpty(str) && (!str.startsWith(str5) && (!str.startsWith(str11) && !new File(str).exists()))) {
                iUiListener.onError(new UiError(-6, str13, null));
                SLog.e("openSDK_LOG.QQShare", "shareToQQ, image url is emprty or illegal.");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, image url is emprty or illegal.");
                return;
             }else if(!TextUtils.isEmpty(str2)){
                int i2 = 128;
                if (str2.length() > i2) {
                   str11 = null;
                   uBundle1 = p1;
                   uBundle1.putString(str12, k.a(str2, i2, str11, str11));
                label_02af :
                   if (!TextUtils.isEmpty(str3)) {
                      int i3 = 512;
                      if (str3.length() > i3) {
                         uBundle1.putString(str8, k.a(str3, i3, str11, str11));
                      }
                   }
                   i = (uBundle1.getInt("cflag", 0) == 1)? true: false;
                   if (k.a(uContext, i)) {
                      SLog.i("openSDK_LOG.QQShare", "shareToQQ, support share");
                      this.b(p0, p1, p2);
                   }else {
                      try{
                         SLog.w("openSDK_LOG.QQShare", "shareToQQ, don\'t support share, will show download dialog");
                         TDialog tDialog = new TDialog(p0, "", uBaseApi.a(""), null, uBaseApi.c);
                         str4.show();
                      }catch(java.lang.RuntimeException e0){
                         SLog.e("openSDK_LOG.QQShare", " shareToQQ, TDialog.show not in main thread", e0);
                         e0.printStackTrace();
                         iUiListener.onError(new UiError(-6, "没有在主线程调用！", null));
                      }
                   }
                }
             }
             uBundle1 = p1;
             str11 = null;
             goto label_02af ;
          }
          b = 7;
          goto label_01d0 ;
       }
    }
}
