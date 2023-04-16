package com.tencent.connect.share.QzoneShare;
import com.tencent.connect.common.BaseApi;
import android.content.Context;
import com.tencent.connect.auth.QQToken;
import android.app.Activity;
import android.os.Bundle;
import com.tencent.tauth.IUiListener;
import java.lang.String;
import com.tencent.open.log.SLog;
import java.lang.StringBuffer;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONObject;
import java.util.Iterator;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.net.URLEncoder;
import com.tencent.open.utils.k;
import android.util.Base64;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.tencent.open.utils.f;
import com.tencent.connect.a.a;
import android.content.Intent;
import android.net.Uri;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.b.e;
import android.os.SystemClock;
import java.lang.Long;
import com.tencent.tauth.UiError;
import com.tencent.open.utils.i;
import com.tencent.connect.share.QQShare;
import com.tencent.open.TDialog;
import android.app.Dialog;

public class QzoneShare extends BaseApi	// class@000e51
{
    public boolean a;
    public boolean d;
    public boolean e;
    public boolean f;
    public String mViaShareQzoneType;

    public void QzoneShare(Context p0,QQToken p1){
       super(p1);
       this.mViaShareQzoneType = "";
       this.a = true;
       this.d = false;
       this.e = false;
       this.f = false;
    }
    public final void b(Activity p0,Bundle p1,IUiListener p2){
       int i1;
       CharSequence uCharSequenc;
       String str12;
       int i2;
       String str14;
       BaseApi uBaseApi = this;
       Activity uActivity = p0;
       Bundle uBundle = p1;
       IUiListener iUiListener = p2;
       String str = "openSDK_LOG.QzoneShare";
       SLog.i(str, "doshareToQzone\(\) --start");
       StringBuffer str1 = "mqqapi://share/to_qzone?src_type=app&version=1&file_type=news";
       ArrayList stringArrayL = uBundle.getStringArrayList("imageUrl");
       String str2 = uBundle.getString("title");
       String str3 = uBundle.getString("summary");
       String str4 = uBundle.getString("targetUrl");
       String str5 = uBundle.getString("audio_url");
       int intx = uBundle.getInt("req_type", 1);
       String str6 = uBundle.getString("appName");
       String str7 = uBundle.getString("mini_program_appid");
       String str8 = uBundle.getString("mini_program_type");
       String str9 = uBundle.getString("mini_program_path");
       int intx1 = uBundle.getInt("cflag", 0);
       String str10 = uBundle.getString("share_qq_ext_str");
       String str11 = "";
       try{
          int i = intx1;
          uBundle = uBundle.getBundle("extMap");
          if (uBundle != null) {
             Set set = uBundle.keySet();
             try{
                str12 = str10;
                JSONObject jSONObject = new JSONObject();
                Iterator iterator = set.iterator();
                try{
                   while (iterator.hasNext()) {
                      Object obj = iterator.next();
                      try{
                         str14 = str7;
                         Object obj1 = obj;
                         i1 = intx;
                         jSONObject.put(obj1, uBundle.get(obj1));
                         intx = i1;
                         i2 = str14;
                      }catch(java.lang.Exception e0){
                         i1 = intx;
                      }
                   label_00c6 :
                      SLog.e(str, "ShareToQzone\(\)  --error parse extmap", e0);
                   }
                   i1 = intx;
                   str14 = str7;
                   if (set.size() > 0) {
                      str11 = jSONObject.toString();
                   }
                }catch(java.lang.Exception e0){
                   goto label_00c6 ;
                }
             }catch(java.lang.Exception e0){
                i1 = intx;
                uCharSequenc = str7;
                goto label_00c6 ;
             }
          }else {
             i1 = intx;
             str14 = str7;
             str12 = str10;
          }
          String appId = uBaseApi.c.getAppId();
          String openIdWithCa = uBaseApi.c.getOpenIdWithCache();
          SLog.v(str, "openId:"+openIdWithCa);
          i2 = 2;
          if (stringArrayL != null && stringArrayL.size() > 0) {
             String str13 = stringArrayL.get(0);
             str1 = str1+"&image_url="+Base64.encodeToString(k.j(URLEncoder.encode(str13)), i2);
             if (!k.h(str13)) {
                str13 = k.a(appId, uActivity, str13, iUiListener);
                if (!TextUtils.isEmpty(str13)) {
                   str1 = str1+"&image_uri="+Base64.encodeToString(k.j(URLEncoder.encode(str13)), i2);
                }
             }
          }
          if (!TextUtils.isEmpty(str2)) {
             str1 = str1+"&title="+Base64.encodeToString(k.j(str2), i2);
          }
          if (!TextUtils.isEmpty(str3)) {
             str1 = str1+"&description="+Base64.encodeToString(k.j(str3), i2);
          }
          if (!TextUtils.isEmpty(appId)) {
             str1 = str1+"&share_id="+appId;
          }
          if (!TextUtils.isEmpty(str4)) {
             str1 = str1+"&url="+Base64.encodeToString(k.j(str4), i2);
          }
          if (!TextUtils.isEmpty(str6)) {
             str1 = str1+"&app_name="+Base64.encodeToString(k.j(str6), i2);
          }
          if (!k.e(openIdWithCa)) {
             str1 = str1+"&open_id="+Base64.encodeToString(k.j(openIdWithCa), i2);
          }
          if (!k.e(str5)) {
             str1 = str1+"&audioUrl="+Base64.encodeToString(k.j(str5), i2);
          }
          str1 = str1+"&req_type="+Base64.encodeToString(k.j(String.valueOf(i1)), i2);
          if (!TextUtils.isEmpty(uCharSequenc)) {
             str1 = str1+"&mini_program_appid="+Base64.encodeToString(k.j(String.valueOf(uCharSequenc)), i2);
          }
          if (!TextUtils.isEmpty(str9)) {
             str1 = str1+"&mini_program_path="+Base64.encodeToString(k.j(String.valueOf(str9)), i2);
          }
          if (!TextUtils.isEmpty(str8)) {
             str1 = str1+"&mini_program_type="+Base64.encodeToString(k.j(String.valueOf(str8)), i2);
          }
          if (!k.e(str12)) {
             str1 = str1+"&share_qq_ext_str="+Base64.encodeToString(k.j(str12), i2);
          }
          if (!TextUtils.isEmpty(str11)) {
             str1 = str1+"&share_qzone_ext_str="+Base64.encodeToString(k.j(str11), i2);
          }
          str1 = str1+"&cflag="+Base64.encodeToString(k.j(String.valueOf(i)), i2);
          SLog.v(str, "doshareToQzone, url: "+str1);
          String[] stringArray = new String[]{"shareToNativeQQ"};
          a.a(f.a(), uBaseApi.c, "requireApi", stringArray);
          Intent intent = new Intent("android.intent.action.VIEW");
          intent.setData(Uri.parse(str1));
          intent.putExtra("pkg_name", p0.getPackageName());
          if (k.g(uActivity, "4.6.0")) {
             if (uBaseApi.a(intent)) {
                int i3 = 0x2b60;
                UIListenerManager.getInstance().setListenerWithRequestcode(i3, iUiListener);
                uBaseApi.a(uActivity, intent, i3);
             }
             SLog.i(str, "doShareToQzone\(\) -- QQ Version is < 4.6.0");
          }else {
             SLog.i(str, "doShareToQzone\(\) -- QQ Version is > 4.6.0");
             if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", iUiListener) != null) {
                SLog.i(str, "doShareToQzone\(\) -- do listener onCancel\(\)");
             }
             if (uBaseApi.a(intent)) {
                uBaseApi.a(uActivity, 0x2778, intent, false);
             }
          }
          int i4 = 4;
          if (uBaseApi.a(intent)) {
             e.a().a(uBaseApi.c.getOpenId(), uBaseApi.c.getAppId(), "ANDROIDQQ.SHARETOQZ.XX", "11", "3", "0", uBaseApi.mViaShareQzoneType, "0", "1", "0");
             e.a().a(0, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(i4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
          }else {
             e.a().a(uBaseApi.c.getOpenId(), uBaseApi.c.getAppId(), "ANDROIDQQ.SHARETOQZ.XX", "11", "3", "1", uBaseApi.mViaShareQzoneType, "0", "1", "0");
             e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(i4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent fail");
          }
          SLog.i("openSDK_LOG", "doShareToQzone\(\) --end");
          return;
       }catch(java.lang.Exception e0){
          i1 = intx;
          uCharSequenc = str7;
          str12 = str10;
          goto label_00c6 ;
       }
    }
    public void releaseResource(){
    }
    public void shareToQzone(Activity p0,Bundle p1,IUiListener p2){
       String str11;
       String str12;
       boolean b1;
       BaseApi uBaseApi = this;
       Context uContext = p0;
       Bundle uBundle = p1;
       IUiListener iUiListener = p2;
       SLog.i("openSDK_LOG.QzoneShare", "shareToQzone\(\) -- start");
       int i = -6;
       int i1 = 4;
       String str = null;
       if (!uBundle) {
          iUiListener.onError(new UiError(i, "传入参数不可以为空", str));
          SLog.e("openSDK_LOG.QzoneShare", "shareToQzone\(\) params is null");
          e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(i1), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "传入参数不可以为空");
          return;
       }else {
          String str1 = "title";
          String str2 = uBundle.getString(str1);
          String str3 = "summary";
          String str4 = uBundle.getString(str3);
          String str5 = uBundle.getString("targetUrl");
          String str6 = uBundle.getString("mini_program_appid");
          String str7 = uBundle.getString("mini_program_path");
          String str8 = "imageUrl";
          ArrayList stringArrayL = uBundle.getStringArrayList(str8);
          String str9 = k.a(p0);
          str = "appName";
          String str10 = str8;
          if (str9 == null) {
             str9 = uBundle.getString(str);
             str11 = str;
          }else {
             str11 = str;
             int intx = 20;
             if (str9.length() > intx) {
                str12 = str3;
                str9 = str9.substring(0, intx)+"...";
             label_00a1 :
                intx = uBundle.getInt("req_type");
                SLog.e("openSDK_LOG.QzoneShare", "shareToQzone\(\) get SHARE_TO_QZONE_KEY_TYPE: "+intx);
                str3 = "1";
                QzoneShare qzoneShare = 5;
                boolean b = true;
                if (intx != b) {
                   uBaseApi.mViaShareQzoneType = (intx != qzoneShare)? str3: "2";
                }else {
                   uBaseApi.mViaShareQzoneType = str3;
                }
                int i2 = -5;
                if (intx != b) {
                   if (intx != qzoneShare) {
                      if (intx != 7) {
                         if (k.e(str2) && k.e(str4)) {
                            if (stringArrayL != null && stringArrayL.size()) {
                               uBaseApi.a = false;
                            }else {
                               str2 = "来自"+str9+"的分享";
                               uBaseApi.a = b;
                            }
                         }else {
                            uBaseApi.a = b;
                         }
                         b1 = false;
                         uBaseApi.d = b1;
                         SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, default needTitle = true, shareType = "+intx);
                         uBaseApi.e = b;
                         uBaseApi.f = b1;
                      }else if(TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)){
                         iUiListener.onError(new UiError(i2, "传入参数有误!", "appid or path empty."));
                      }
                      b1 = false;
                      uBaseApi.e = b1;
                      uBaseApi.f = b1;
                      uBaseApi.a = b1;
                   }else {
                      iUiListener.onError(new UiError(i2, "请选择支持的分享类型", null));
                      SLog.e("openSDK_LOG.QzoneShare", "shareToQzone\(\) error--end请选择支持的分享类型");
                      e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone\(\) 请选择支持的分享类型");
                      return;
                   }
                }else {
                   SLog.e("openSDK_LOG.QzoneShare", "-->shareToQzone, SHARE_TO_QZONE_TYPE_IMAGE_TEXT needTitle = true");
                   uBaseApi.a = b;
                   b1 = false;
                   uBaseApi.d = b1;
                   uBaseApi.e = b;
                   uBaseApi.f = b1;
                }
                if (!k.a() && k.g(uContext, "4.5.0")) {
                   iUiListener.onError(new UiError(-6, "分享图片失败，检测不到SD卡!", null));
                   SLog.e("openSDK_LOG.QzoneShare", "shareToQzone\(\) sdcard is null--end");
                   e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "分享图片失败，检测不到SD卡!");
                   return;
                }else if(uBaseApi.a != null){
                   if (TextUtils.isEmpty(str5)) {
                      iUiListener.onError(new UiError(i2, "targetUrl为必填项，请补充后分享", null));
                      SLog.e("openSDK_LOG.QzoneShare", "shareToQzone\(\) targetUrl null error--end");
                      e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "targetUrl为必填项，请补充后分享");
                      return;
                   }else if(!k.h(str5)){
                      iUiListener.onError(new UiError(i2, "targetUrl有误", null));
                      SLog.e("openSDK_LOG.QzoneShare", "shareToQzone\(\) targetUrl error--end");
                      e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "targetUrl有误");
                      return;
                   }
                }
                if (uBaseApi.d != null) {
                   uBundle = p1;
                   uBundle.putString(str1, "");
                   uBundle.putString(str12, "");
                }else {
                   uBundle = p1;
                   str6 = str12;
                   if (uBaseApi.e != null && k.e(str2)) {
                      iUiListener.onError(new UiError(-6, "title不能为空!", null));
                      SLog.e("openSDK_LOG.QzoneShare", "shareToQzone\(\) title is null--end");
                      e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone\(\) title is null");
                      return;
                   }else if(!k.e(str2)){
                      i2 = 200;
                      if (str2.length() > i2) {
                         uBundle.putString(str1, k.a(str2, i2, null, null));
                      label_02bf :
                         if (!k.e(str4) && str4.length() > 600) {
                            uBundle.putString(str6, k.a(str4, 600, null, null));
                         }
                      }
                   }
                   str8 = null;
                   goto label_02bf ;
                }
                if (!TextUtils.isEmpty(str9)) {
                   uBundle.putString(str11, str9);
                }
                if (stringArrayL == null || !stringArrayL.size()) {
                   if (uBaseApi.f != null) {
                      iUiListener.onError(new UiError(-6, "纯图分享，imageUrl 不能为空", null));
                      SLog.e("openSDK_LOG.QzoneShare", "shareToQzone\(\) imageUrl is null -- end");
                      e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone\(\) imageUrl is null");
                      return;
                   }
                }else {
                   for (i2 = 0; i2 < stringArrayL.size(); i2 = i2 + 1) {
                      str9 = stringArrayL.get(i2);
                      if (!k.h(str9) && !k.i(str9)) {
                         stringArrayL.remove(i2);
                         i2 = i2 - 1;
                      }
                   }
                   if (!stringArrayL.size()) {
                      iUiListener.onError(new UiError(-6, "非法的图片地址!", null));
                      SLog.e("openSDK_LOG.QzoneShare", "shareToQzone\(\) MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end");
                      e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone\(\) 非法的图片地址!");
                      return;
                   }else {
                      uBundle.putStringArrayList(str10, stringArrayL);
                   }
                }
                str9 = "4.6.0";
                if (!k.g(uContext, str9)) {
                   SLog.i("openSDK_LOG.QzoneShare", "shareToQzone\(\) qqver greater than 4.6.0");
                   this.b(p0, p1, p2);
                }else if(i.c(uContext, "4.2.0") >= 0 && i.c(uContext, str9) < 0){
                   SLog.w("openSDK_LOG.QzoneShare", "shareToQzone\(\) qqver between 4.2.0 and 4.6.0, will use qqshare");
                   QQShare qQShare = new QQShare(uContext, uBaseApi.c);
                   if (stringArrayL != null && stringArrayL.size() > 0) {
                      String str13 = stringArrayL.get(0);
                      if (intx == 5 && !k.i(str13)) {
                         iUiListener.onError(new UiError(-6, "手Q版本过低，纯图分享不支持网路图片", null));
                         SLog.e("openSDK_LOG.QzoneShare", "shareToQzone\(\)手Q版本过低，纯图分享不支持网路图片");
                         e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone\(\)手Q版本过低，纯图分享不支持网路图片");
                         return;
                      }else {
                         uBundle.putString("imageLocalUrl", str13);
                      }
                   }
                   if (!k.g(uContext, "4.5.0")) {
                      uBundle.putInt("cflag", 1);
                   }
                   qQShare.shareToQQ(uContext, uBundle, iUiListener);
                }else {
                   SLog.w("openSDK_LOG.QzoneShare", "shareToQzone\(\) qqver below 4.2.0, will show download dialog");
                   TDialog tDialog = new TDialog(p0, "", uBaseApi.a(""), null, uBaseApi.c);
                   str1.show();
                }
                SLog.i("openSDK_LOG.QzoneShare", "shareToQzone\(\) --end");
                return;
             }
          }
          str12 = str3;
          goto label_00a1 ;
       }
    }
}
