package com.tencent.open.miniapp.MiniApp;
import com.tencent.connect.common.BaseApi;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.content.Context;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.auth.c;
import android.app.Activity;
import com.tencent.open.log.SLog;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Character;
import com.tencent.open.utils.k;
import android.content.Intent;
import com.tencent.open.utils.i;
import android.net.Uri;
import com.tencent.open.TDialog;
import com.tencent.tauth.IUiListener;
import android.app.Dialog;
import java.lang.StringBuilder;
import java.lang.RuntimeException;

public class MiniApp extends BaseApi	// class@000f6c
{
    public static final List OPEN_CONNECT_DEMO_MINI_APP_VERSIONS;

    static {
       String[] stringArray = new String[]{"develop","trial","release"};
       MiniApp.OPEN_CONNECT_DEMO_MINI_APP_VERSIONS = Arrays.asList(stringArray);
    }
    public void MiniApp(Context p0,QQToken p1){
       super(p1);
    }
    public void MiniApp(Context p0,c p1,QQToken p2){
       super(p1, p2);
    }
    public void MiniApp(QQToken p0){
       super(p0);
    }
    public int startMiniApp(Activity p0,String p1,String p2,String p3,String p4,String p5){
       if (p0 == null) {
          SLog.i("openSDK_LOG.MiniApp", "Result is MINIAPP_CONTEXT_NULL : -6");
          return -6;
       }else if(!("mini_program_or_game").equals(p1)){
          SLog.i("openSDK_LOG.MiniApp", "Result is MINIAPP_UNKNOWN_TYPE : -5");
          return -5;
       }else if(TextUtils.isEmpty(p2)){
          SLog.i("openSDK_LOG.MiniApp", "Result is MINIAPP_ID_EMPTY : -1");
          return -1;
       }else {
          int i = 0;
          while (true) {
             if (i < p2.length()) {
                if (!Character.isDigit(p2.charAt(i))) {
                   SLog.i("openSDK_LOG.MiniApp", "Result is MINIAPP_ID_NOT_DIGIT : -4");
                   return -4;
                }else {
                   i = i + 1;
                }
             }else {
                String str = "";
                if (p4 == null) {
                   p4 = str;
                }
                if (!MiniApp.OPEN_CONNECT_DEMO_MINI_APP_VERSIONS.contains(p5)) {
                   SLog.i("openSDK_LOG.MiniApp", "Result is MINIAPP_VERSION_WRONG : -7");
                   return -7;
                }else if(k.e(p0)){
                   Intent intent = new Intent("android.intent.action.VIEW");
                   Object[] objArray = new Object[]{p1,p2,k.l(i.a(p0)),k.l(this.c.getAppId()),p3,k.l(p4),k.l(p5),k.l(this.c.getOpenId())};
                   intent.setData(Uri.parse(String.format("mqqapi://connect_miniapp/launch?app_type=%1$s&mini_app_id=%2$s&version=1&src_type=app&app_name=%3$s&app_id=%4$s&src_id=%5$s&mini_app_path=%6$s&mini_app_type=%7$s&open_id=%8$s", objArray)));
                   intent.putExtra("pkg_name", p0.getPackageName());
                   p0.startActivity(intent);
                   SLog.i("openSDK_LOG.MiniApp", "Result is MINIAPP_SUCCESS : 0");
                   return 0;
                }else {
                   try{
                      TDialog tDialog = new TDialog(p0, "", this.a(str), null, this.c);
                      p1.show();
                      break ;
                   }catch(java.lang.RuntimeException e9){
                      SLog.e("openSDK_LOG.MiniApp", "Show download dialog exception:"+e9.getMessage());
                   }
                }
             }
          }
          SLog.i("openSDK_LOG.MiniApp", "Result is MINIAPP_SHOULD_DOWNLOAD : -2");
          return -2;
       }
    }
}
