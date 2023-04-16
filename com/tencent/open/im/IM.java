package com.tencent.open.im.IM;
import com.tencent.connect.common.BaseApi;
import android.content.Context;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.auth.c;
import android.app.Activity;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Character;
import com.tencent.open.utils.k;
import android.content.Intent;
import android.net.Uri;
import com.tencent.open.TDialog;
import com.tencent.tauth.IUiListener;
import android.app.Dialog;
import java.lang.RuntimeException;

public class IM extends BaseApi	// class@000f5d
{

    public void IM(Context p0,QQToken p1){
       super(p1);
    }
    public void IM(Context p0,c p1,QQToken p2){
       super(p1, p2);
    }
    public void IM(QQToken p0){
       super(p0);
    }
    public int startIMConversation(Activity p0,String p1,String p2,String p3){
       if (p1 != null) {
          String str = "video_chat";
          String str1 = "audio_chat";
          if (p1.equals("thirdparty2c") || (p1.equals(str1) || p1.equals(str))) {
             if (!p1.equals(str1)) {
                p1.equals(str);
             }
             if (TextUtils.isEmpty(p2)) {
                return -1;
             }else {
                int i = 5;
                if (p2.length() < i) {
                   return -3;
                }else {
                   int i1 = 0;
                   while (true) {
                      if (i1 < p2.length()) {
                         if (!Character.isDigit(p2.charAt(i1))) {
                            return -4;
                         }else {
                            i1 = i1 + 1;
                         }
                      }else if(k.d(p0)){
                         Intent intent = new Intent("android.intent.action.VIEW");
                         Object[] objArray = new Object[i];
                         objArray[0] = p1;
                         objArray[1] = p2;
                         objArray[2] = k.l(this.c.getOpenId());
                         objArray[3] = k.l(this.c.getAppId());
                         objArray[4] = k.l(p3);
                         intent.setData(Uri.parse(String.format("mqqapi://im/chat?chat_type=%1$s&uin=%2$s&version=1&src_type=app&open_id=%3$s&app_id=%4$s&app_pkg_name=%5$s", objArray)));
                         intent.putExtra("pkg_name", p3);
                         p0.startActivity(intent);
                         return 0;
                      }else {
                         try{
                            TDialog tDialog = new TDialog(p0, "", this.a(""), null, this.c);
                            p1.show();
                            break ;
                         }catch(java.lang.RuntimeException e10){
                            e10.printStackTrace();
                         }
                      }
                   }
                   return -2;
                }
             }
          }
       }
       return -5;
    }
}
