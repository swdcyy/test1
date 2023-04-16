package com.tencent.mm.opensdk.diffdev.a.b$a;
import java.lang.Object;
import java.lang.String;
import org.json.JSONObject;
import java.lang.Integer;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.diffdev.OAuthErrCode;
import android.util.Base64;
import java.lang.Exception;

public class b$a	// class@000e7f
{
    public OAuthErrCode a;
    public String b;
    public String c;
    public String d;
    public byte[] e;

    public void b$a(){
       super();
    }
    public static b$a a(byte[] p0){
       OAuthErrCode wechatAuth_E;
       Object[] objArray;
       String str1;
       b$a uoa = new b$a();
       if (p0 == null || !p0.length) {
          Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, buf is null");
          wechatAuth_E = OAuthErrCode.WechatAuth_Err_NetworkErr;
       }else {
          int i = 0;
          try{
             String str = "utf-8";
             try{
                String str2 = new String(p0, str);
                JSONObject jSONObject = new JSONObject(str2);
                int intx = jSONObject.getInt("errcode");
                if (intx) {
                   Object[] objArray1 = new Object[]{Integer.valueOf(intx)};
                   Log.e("MicroMsg.SDK.GetQRCodeResult", String.format("resp errcode = %d", objArray1));
                   uoa.a = OAuthErrCode.WechatAuth_Err_NormalErr;
                   jSONObject.optString("errmsg");
                   return uoa;
                }else {
                   str2 = jSONObject.getJSONObject("qrcode").getString("qrcodebase64");
                   if (str2 == null || !str2.length()) {
                      Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBase64 is null");
                      uoa.a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                      return uoa;
                   }else {
                      byte[] uobyteArray = Base64.decode(str2, i);
                      if (uobyteArray == null || !uobyteArray.length) {
                         Log.e("MicroMsg.SDK.GetQRCodeResult", "parse fail, qrcodeBuf is null");
                         uoa.a = OAuthErrCode.WechatAuth_Err_JsonDecodeErr;
                         return uoa;
                      }else {
                         uoa.a = OAuthErrCode.WechatAuth_Err_OK;
                         uoa.e = uobyteArray;
                         uoa.b = jSONObject.getString("uuid");
                         str1 = jSONObject.getString("appname");
                         uoa.c = str1;
                         Object[] objArray2 = new Object[]{uoa.b,str1,Integer.valueOf(uoa.e.length)};
                         Log.d("MicroMsg.SDK.GetQRCodeResult", String.format("parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d", objArray2));
                         return uoa;
                      }
                   }
                }
             }catch(java.lang.Exception e7){
                objArray = new Object[1];
                objArray[i] = e7.getMessage();
                str1 = String.format("parse json fail, ex = %s", objArray);
             }
             Log.e("MicroMsg.SDK.GetQRCodeResult", str1);
             wechatAuth_E = OAuthErrCode.WechatAuth_Err_NormalErr;
          }catch(java.lang.Exception e7){
             objArray = new Object[1];
             objArray[i] = e7.getMessage();
             str1 = String.format("parse fail, build String fail, ex = %s", objArray);
             goto label_00b4 ;
          }
       }
       uoa.a = wechatAuth_E;
       return uoa;
    }
}
