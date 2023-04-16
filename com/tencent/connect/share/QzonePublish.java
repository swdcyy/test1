package com.tencent.connect.share.QzonePublish;
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
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.net.URLEncoder;
import com.tencent.open.utils.k;
import android.util.Base64;
import com.tencent.open.utils.f;
import com.tencent.connect.a.a;
import android.content.Intent;
import android.net.Uri;
import com.tencent.open.b.e;
import android.os.SystemClock;
import java.lang.Long;
import com.tencent.tauth.UiError;
import com.tencent.open.TDialog;
import android.app.Dialog;
import android.media.MediaPlayer;
import com.tencent.connect.share.QzonePublish$1;
import android.media.MediaPlayer$OnPreparedListener;
import com.tencent.connect.share.QzonePublish$2;
import android.media.MediaPlayer$OnErrorListener;

public class QzonePublish extends BaseApi	// class@000e50
{

    public void QzonePublish(Context p0,QQToken p1){
       super(p1);
    }
    public static void a(QzonePublish p0,Activity p1,Bundle p2,IUiListener p3){
       p0.b(p1, p2, p3);
    }
    public final void b(Activity p0,Bundle p1,IUiListener p2){
       int i;
       CharSequence uCharSequenc;
       String str6;
       String str8;
       int i1;
       String str9;
       String str10;
       String str13;
       String str14;
       BaseApi uBaseApi = this;
       Activity uActivity = p0;
       Bundle uBundle = p1;
       IUiListener iUiListener = p2;
       String str = "";
       String str1 = "openSDK_LOG.QzonePublish";
       SLog.i(str1, "doPublishToQzone\(\) --start");
       StringBuffer str2 = "mqqapi://qzone/publish?src_type=app&version=1&file_type=news";
       ArrayList stringArrayL = uBundle.getStringArrayList("imageUrl");
       String str3 = uBundle.getString("summary");
       int intx = uBundle.getInt("req_type", 3);
       StringBuffer str4 = uBundle.getString("appName");
       String str5 = uBundle.getString("videoPath");
       int intx1 = uBundle.getInt("videoDuration");
       long longx = uBundle.getLong("videoSize");
       try{
          uBundle = uBundle.getBundle("extMap");
          if (uBundle != null) {
             Set set = uBundle.keySet();
             try{
                str13 = str;
                JSONObject jSONObject = new JSONObject();
                Iterator iterator = set.iterator();
                try{
                   while (iterator.hasNext()) {
                      Iterator iterator1 = iterator;
                      Object obj = iterator.next();
                      if (!TextUtils.isEmpty(uBundle.getString(obj))) {
                         str14 = str4;
                         jSONObject.put(obj, uBundle.getString(obj));
                      }else {
                         str14 = str4;
                      }
                      iterator = iterator1;
                      str4 = str14;
                   }
                   str14 = str4;
                   if (jSONObject.length() > 0) {
                      str6 = jSONObject.toString();
                   }else {
                   label_00a5 :
                      str6 = i;
                   }
                }catch(java.lang.Exception e0){
                }
                SLog.e(str1, "publishToQzone\(\)  --error parse extmap", e0);
                goto label_00a5 ;
             }catch(java.lang.Exception e0){
             }
             uCharSequenc = str4;
             goto label_00a0 ;
          }else {
             str13 = str;
             str14 = str4;
             goto label_00a5 ;
          }
          str = uBaseApi.c.getAppId();
          String openId = uBaseApi.c.getOpenId();
          SLog.v(str1, "openId:"+openId);
          if (3 == intx && stringArrayL != null) {
             StringBuffer str7 = "";
             str4 = "";
             str8 = str1;
             i1 = stringArrayL.size();
             str9 = str6;
             int i2 = 0;
             while (i2 < i1) {
                str10 = openId;
                str7 = str7+URLEncoder.encode(stringArrayL.get(i2));
                openId = k.a(str, uActivity, stringArrayL.get(i2), iUiListener);
                if (!TextUtils.isEmpty(openId)) {
                   str4 = str4+URLEncoder.encode(openId);
                }
                int i3 = i1 - 1;
                if (i2 != i3) {
                   openId = ";";
                   str7 = str7+openId;
                   str4 = str4+openId;
                }
                i2 = i2 + 1;
                openId = str10;
             }
             str10 = openId;
             str2 = str2+"&image_url="+Base64.encodeToString(k.j(str7), 2);
             if (!TextUtils.isEmpty(str4)) {
                str2 = str2+"&image_uri="+Base64.encodeToString(k.j(str4), 2);
             }
             str6 = "7";
          }else {
             str9 = str6;
             str8 = str1;
             str10 = openId;
             str6 = i;
          }
          int i4 = 4;
          if (i4 == intx) {
             str2 = str2+"&videoPath="+Base64.encodeToString(k.j(str5), 2);
             str6 = k.a(str, uActivity, str5, iUiListener);
             if (!TextUtils.isEmpty(str6)) {
                str2 = str2+"&videoUri="+Base64.encodeToString(k.j(str6), 2);
             }
             i1 = 2;
             str2 = str2+"&videoDuration="+Base64.encodeToString(k.j(String.valueOf(intx1)), i1)+"&videoSize="+Base64.encodeToString(k.j(String.valueOf(longx)), i1);
             str6 = "8";
          }
          String str11 = str6;
          if (!TextUtils.isEmpty(str3)) {
             str2 = str2+"&description="+Base64.encodeToString(k.j(str3), 2);
          }
          if (!TextUtils.isEmpty(str)) {
             str2 = str2+"&share_id="+str;
          }
          if (!TextUtils.isEmpty(uCharSequenc)) {
             str2 = str2+"&app_name="+Base64.encodeToString(k.j(uCharSequenc), 2);
          }
          if (!k.e(str10)) {
             str2 = str2+"&open_id="+Base64.encodeToString(k.j(str10), 2);
          }
          if (!TextUtils.isEmpty(str9)) {
             str2 = str2+"&share_qzone_ext_str="+Base64.encodeToString(k.j(str9), 2);
          }
          str2 = str2+"&req_type="+Base64.encodeToString(k.j(String.valueOf(intx)), 2);
          String str12 = str8;
          SLog.v(str12, "doPublishToQzone, url: "+str2);
          BaseApi uBaseApi1 = this;
          String[] stringArray = new String[]{"shareToNativeQQ"};
          a.a(f.a(), uBaseApi1.c, "requireApi", stringArray);
          Intent intent = new Intent("android.intent.action.VIEW");
          intent.setData(Uri.parse(str2));
          intent.putExtra("pkg_name", p0.getPackageName());
          if (uBaseApi1.a(intent)) {
             uBaseApi1.a(uActivity, 0x2778, intent, false);
             e.a().a(0, "SHARE_CHECK_SDK", "1000", uBaseApi1.c.getAppId(), String.valueOf(i4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent success");
             e.a().a(uBaseApi1.c.getOpenId(), uBaseApi1.c.getAppId(), "ANDROIDQQ.SHARETOQZ.XX", "11", "3", "1", str11, "0", "1", "0");
          }else {
             SLog.e(str12, "doPublishToQzone\(\) target activity not found");
             e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi1.c.getAppId(), String.valueOf(i4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent fail");
             e.a().a(uBaseApi1.c.getOpenId(), uBaseApi1.c.getAppId(), "ANDROIDQQ.SHARETOQZ.XX", "11", "3", "1", str11, "0", "1", "0");
          }
          SLog.i("openSDK_LOG", "doPublishToQzone\(\) --end");
          return;
       }catch(java.lang.Exception e0){
          i = str;
          goto label_009e ;
       }
    }
    public void publishToQzone(Activity p0,Bundle p1,IUiListener p2){
       int i2;
       BaseApi uBaseApi = this;
       Bundle uBundle = p1;
       IUiListener iUiListener = p2;
       SLog.i("openSDK_LOG.QzonePublish", "publishToQzone\(\) -- start");
       int i = 4;
       String str = null;
       if (!uBundle) {
          iUiListener.onError(new UiError(-6, "传入参数不可以为空", str));
          SLog.e("openSDK_LOG.QzonePublish", "-->publishToQzone, params is null");
          e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "传入参数不可以为空");
          return;
       }else if(!k.f(p0)){
          iUiListener.onError(new UiError(-15, "手Q版本过低，请下载安装最新版手Q", str));
          SLog.e("openSDK_LOG.QzonePublish", "-->publishToQzone, this is not support below qq 5.9.5");
          e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publicToQzone, this is not support below qq 5.9.5");
          TDialog tDialog = new TDialog(p0, "", uBaseApi.a(""), null, uBaseApi.c);
          iUiListener.show();
          return;
       }else {
          String str1 = k.a(p0);
          int i1 = 0;
          String str2 = "appName";
          if (str1 == null) {
             str1 = uBundle.getString(str2);
          }else {
             i2 = 20;
             if (str1.length() > i2) {
                str1 = str1.substring(i1, i2)+"...";
             }
          }
          if (!TextUtils.isEmpty(str1)) {
             uBundle.putString(str2, str1);
          }
          int intx = uBundle.getInt("req_type");
          if (intx == 3) {
             String str3 = "imageUrl";
             ArrayList stringArrayL = uBundle.getStringArrayList(str3);
             if (stringArrayL != null && stringArrayL.size() > 0) {
                while (i1 < stringArrayL.size()) {
                   if (!k.i(stringArrayL.get(i1))) {
                      stringArrayL.remove(i1);
                      i1 = i1 - 1;
                   }
                   i1 = i1 + 1;
                }
                uBundle.putStringArrayList(str3, stringArrayL);
             }
             this.b(p0, p1, p2);
             SLog.i("openSDK_LOG.QzonePublish", "publishToQzone\(\) --end");
          }else {
             i2 = -5;
             if (intx == i) {
                String str4 = uBundle.getString("videoPath");
                if (!k.i(str4)) {
                   SLog.e("openSDK_LOG.QzonePublish", "publishToQzone\(\) video url invalid");
                   iUiListener.onError(new UiError(i2, "请选择有效的视频文件", str));
                   return;
                }else {
                   MediaPlayer mediaPlayer = new MediaPlayer();
                   QzonePublish$1 u1 = new QzonePublish$1(this, str4, p1, p0, p2);
                   mediaPlayer.setOnPreparedListener(v14);
                   QzonePublish$2 u2 = new QzonePublish$2(uBaseApi, iUiListener);
                   try{
                      mediaPlayer.setOnErrorListener(u2);
                      mediaPlayer.setDataSource(str4);
                      mediaPlayer.prepareAsync();
                   }catch(java.lang.Exception e0){
                      SLog.e("openSDK_LOG.QzonePublish", "publishToQzone\(\) exception\(s\) occurred when preparing mediaplayer");
                      iUiListener.onError(new UiError(i2, "请选择有效的视频文件", str));
                   }
                }
             }else {
                iUiListener.onError(new UiError(i2, "请选择支持的分享类型", str));
                SLog.e("openSDK_LOG.QzonePublish", "publishToQzone\(\) error--end请选择支持的分享类型");
                e.a().a(1, "SHARE_CHECK_SDK", "1000", uBaseApi.c.getAppId(), String.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publishToQzone\(\) 请选择支持的分享类型");
                return;
             }
          }
       }
    }
}
