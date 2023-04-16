package com.tencent.connect.emotion.QQEmotion;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.auth.QQToken;
import android.app.Activity;
import java.util.ArrayList;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Object;
import android.net.Uri;
import android.content.Context;
import com.tencent.open.utils.k;
import com.tencent.open.log.SLog;
import com.tencent.tauth.IUiListener;
import com.tencent.open.utils.i;
import java.lang.CharSequence;
import android.widget.Toast;
import java.lang.StringBuffer;
import android.text.TextUtils;
import android.util.Base64;
import android.content.Intent;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.tauth.UiError;

public class QQEmotion extends BaseApi	// class@000e4a
{
    public IUiListener a;

    public void QQEmotion(QQToken p0){
       super(p0);
    }
    public final String a(Activity p0,ArrayList p1){
       StringBuilder str = "";
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          Uri uri = k.a(p0, this.c.getAppId(), k.b(p0, iterator.next()));
          if (uri == null) {
             SLog.e("QQEmotion", "getFilePathListJson: grantedUri = null");
          }else {
             str = str+uri+";";
          }
       }
       String str1 = str;
       SLog.i("QQEmotion", "-->getFilePathListJson listStr : "+str1);
       return str1;
    }
    public final boolean a(Context p0,ArrayList p1){
       long l1;
       if (p1 == null || !p1.size()) {
          return false;
       }
       if (p1.size() > 9) {
          SLog.i("QQEMOTION", "isLegality -->illegal, file count > 9, count = "+p1.size());
          return false;
       }else {
          long l = 0;
          int i = 0;
          while (true) {
             if (i < p1.size()) {
                l1 = k.a(p0, p1.get(i));
                if (l1 - 0x100000 > 0) {
                   break ;
                }else {
                   l = l + l1;
                   i = i + 1;
                }
             }else if(l - 0x300000 > 0){
                SLog.i("QQEMOTION", "isLegality -->illegal, totalSize: "+l);
                return false;
             }else {
                SLog.i("QQEMOTION", "isLegality -->legal, totalSize: "+l);
                return true;
             }
          }
          SLog.i("QQEMOTION", "isLegality -->illegal, fileSize: "+l1);
          return false;
       }
    }
    public void setEmotions(Activity p0,ArrayList p1,IUiListener p2){
       QQEmotion ta = this.a;
       if (ta != null) {
          ta.onCancel();
       }
       this.a = p2;
       int i = 1;
       if (!i.b(p0)) {
          Toast.makeText(p0.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", i).show();
          return;
       }else if(i.c(p0, "8.0.0") < 0){
          Toast.makeText(p0.getApplicationContext(), "当前手机QQ版本过低，不支持设置表情功能。", i).show();
          return;
       }else if(!this.a(p0.getApplicationContext(), p1)){
          Toast.makeText(p0.getApplicationContext(), "图片不符合要求，不支持设置表情功能。", i).show();
          return;
       }else {
          String str = k.a(p0);
          StringBuffer str1 = "mqqapi://profile/sdk_face_collection?";
          StringBuilder str2 = "";
          if (!TextUtils.isEmpty(str)) {
             int i1 = 20;
             if (str.length() > i1) {
                str = str.substring(0, i1)+"...";
             }
             str2 = str2+str;
             str1 = str1+"&app_name="+Base64.encodeToString(k.j(str), 2);
          }
          str = this.c.getAppId();
          String openId = this.c.getOpenId();
          if (!TextUtils.isEmpty(str)) {
             str1 = str1+"&share_id="+str;
             str2 = str2+str;
          }
          if (!TextUtils.isEmpty(openId)) {
             str2 = str2+openId;
             str1 = str1+"&open_id="+Base64.encodeToString(k.j(openId), 2);
          }
          str1 = str1+"&sdk_version="+Base64.encodeToString(k.j("3.5.4.lite"), 2);
          str2 = str2+"3.5.4.lite";
          str = this.a(p0, p1);
          if (!TextUtils.isEmpty(str)) {
             str1 = str1+"&set_uri_list="+Base64.encodeToString(k.j(str), 2)+"&"+"ppsts"+"="+i.a(p0, str2+str);
             SLog.v("QQEMOTION", "-->set avatar, url: "+str1);
             Intent intent = new Intent("android.intent.action.VIEW");
             intent.setData(Uri.parse(str1));
             intent.putParcelableArrayListExtra("android.intent.extra.STREAM", p1);
             if (this.a(intent)) {
                UIListenerManager.getInstance().setListenerWithRequestcode(0x277d, p2);
                this.a(p0, 0x277d, intent, 0);
             }
             return;
          }else {
             p2.onError(new UiError(-6, "未知错误!", "picPathList is null"));
             return;
          }
       }
    }
}
