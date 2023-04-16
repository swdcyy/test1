package com.tencent.mm.opensdk.diffdev.a.c;
import android.os.AsyncTask;
import java.lang.String;
import com.tencent.mm.opensdk.diffdev.OAuthListener;
import java.lang.Object;
import java.lang.Void;
import java.lang.Thread;
import java.lang.StringBuilder;
import com.tencent.mm.opensdk.utils.Log;
import java.lang.System;
import com.tencent.mm.opensdk.channel.a.a;
import com.tencent.mm.opensdk.diffdev.a.c$a;
import org.json.JSONObject;
import java.lang.Integer;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import java.lang.Exception;
import java.lang.Long;
import com.tencent.mm.opensdk.diffdev.a.d;

public class c extends AsyncTask	// class@000e82
{
    public String a;
    public String b;
    public OAuthListener c;
    public int d;

    public void c(String p0,OAuthListener p1){
       super();
       this.a = p0;
       this.c = p1;
       Object[] objArray = new Object[]{p0};
       this.b = String.format("https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid=%s", objArray);
    }
    public Object doInBackground(Object[] p0){
       c$a uoa;
       OAuthErrCode wechatAuth_E;
       OAuthErrCode wechatAuth_E1;
       c$a a;
       Object[] objArray2;
       String str4;
       Thread.currentThread().setName("OpenSdkNoopingTask");
       c ta = this.a;
       if (ta == null || !ta.length()) {
          Log.e("MicroMsg.SDK.NoopingTask", "run fail, uuid is null");
          uoa = new c$a();
       label_0199 :
          wechatAuth_E = OAuthErrCode.WechatAuth_Err_NormalErr;
       label_019b :
          uoa.a = wechatAuth_E;
       }else {
          Log.i("MicroMsg.SDK.NoopingTask", "doInBackground start "+this.isCancelled());
          while (true) {
             if (!this.isCancelled()) {
                String str = this.b;
                String str1 = (this.d == null)? "": "&last="+this.d;
                str = str+str1;
                long l = System.currentTimeMillis();
                byte[] uobyteArray = a.a(str, 0xea60);
                long l1 = System.currentTimeMillis();
                uoa = new c$a();
                String str2 = "MicroMsg.SDK.NoopingResult";
                Log.d(str2, "star parse NoopingResult");
                if (uobyteArray == null || !uobyteArray.length) {
                   Log.e(str2, "parse fail, buf is null");
                   wechatAuth_E1 = OAuthErrCode.WechatAuth_Err_NetworkErr;
                label_0100 :
                   uoa.a = wechatAuth_E1;
                }else {
                   try{
                      String str3 = "utf-8";
                      try{
                         String str5 = new String(uobyteArray, str3);
                         JSONObject jSONObject = new JSONObject(str5);
                         int intx = jSONObject.getInt("wx_errcode");
                         uoa.c = intx;
                         Object[] objArray3 = new Object[]{Integer.valueOf(intx)};
                         Log.d(str2, String.format("nooping uuidStatusCode = %d", objArray3));
                         c$a c = uoa.c;
                         if (c != 408) {
                            if (c != 500) {
                               switch (c){
                                   case 402:
                                     wechatAuth_E1 = OAuthErrCode.WechatAuth_Err_Timeout;
                                     break;
                                   case 403:
                                     wechatAuth_E1 = OAuthErrCode.WechatAuth_Err_Cancel;
                                     break;
                                   case 404:
                                     wechatAuth_E1 = OAuthErrCode.WechatAuth_Err_OK;
                                     break;
                                   case 405:
                                     uoa.a = OAuthErrCode.WechatAuth_Err_OK;
                                     uoa.b = jSONObject.getString("wx_code");
                                     break;
                                   default:
                               }
                            }
                            wechatAuth_E1 = OAuthErrCode.WechatAuth_Err_NormalErr;
                         }else {
                            goto label_00cf ;
                         }
                         uoa.a = wechatAuth_E1;
                      }catch(java.lang.Exception e3){
                         objArray2 = new Object[]{e3.getMessage()};
                         str4 = String.format("parse json fail, ex = %s", objArray2);
                      }
                      Log.e(str2, str4);
                      wechatAuth_E1 = OAuthErrCode.WechatAuth_Err_NormalErr;
                      goto label_0100 ;
                   }catch(java.lang.Exception e3){
                      objArray2 = new Object[]{e3.getMessage()};
                      str4 = String.format("parse fail, build String fail, ex = %s", objArray2);
                      goto label_00f3 ;
                   }
                }
                Object[] objArray = new Object[4];
                objArray[0] = str;
                objArray[1] = uoa.a.toString();
                int i = 2;
                objArray[i] = Integer.valueOf(uoa.c);
                l1 = l1 - l;
                objArray[3] = Long.valueOf(l1);
                Log.d("MicroMsg.SDK.NoopingTask", String.format("nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d\(ms\)", objArray));
                a = uoa.a;
                if (a == OAuthErrCode.WechatAuth_Err_OK) {
                   a = uoa.c;
                   this.d = a;
                   if (a == d.d.a()) {
                      this.c.onQrcodeScanned();
                   }else if(uoa.c != d.f.a() && uoa.c == d.e.a()){
                      a = uoa.b;
                      if (a == null || !a.length()) {
                         Log.e("MicroMsg.SDK.NoopingTask", "nooping fail, confirm with an empty code!!!");
                         goto label_0199 ;
                      }
                   }
                }else {
                   Object[] objArray1 = new Object[i];
                   objArray1[0] = a.toString();
                   objArray1[1] = Integer.valueOf(uoa.c);
                   Log.e("MicroMsg.SDK.NoopingTask", String.format("nooping fail, errCode = %s, uuidStatusCode = %d", objArray1));
                   break ;
                }
             }else {
                Log.i("MicroMsg.SDK.NoopingTask", "IDiffDevOAuth.stopAuth / detach invoked");
                uoa = new c$a();
                wechatAuth_E = OAuthErrCode.WechatAuth_Err_Auth_Stopped;
                goto label_019b ;
             }
          }
       }
       return uoa;
    }
    public void onPostExecute(Object p0){
       this.c.onAuthFinish(p0.a, p0.b);
    }
}
