package com.tencent.open.web.security.SecureJsInterface;
import com.tencent.open.a$b;
import java.lang.String;
import com.tencent.open.log.SLog;
import com.tencent.open.web.security.JniInterface;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Integer;
import com.tencent.open.web.security.a;
import java.lang.Boolean;

public class SecureJsInterface extends a$b	// class@000f88
{
    public String a;
    public static boolean isPWDEdit;

    public void SecureJsInterface(){
       super();
    }
    public void clearAllEdit(){
       String str = "openSDK_LOG.SecureJsInterface";
       try{
          SLog.i(str, "-->clear all edit.");
          JniInterface.clearAllPWD();
          return;
       }catch(java.lang.Exception e1){
          SLog.e(str, "-->clear all edit exception: "+e1.getMessage());
          throw new RuntimeException(e1);
       }
    }
    public void curPosFromJS(String p0){
       int i;
       String str = "-->curPosFromJS: "+p0;
       try{
          SLog.d("openSDK_LOG.SecureJsInterface", str);
          i = Integer.parseInt(p0);
       }catch(java.lang.NumberFormatException e4){
          SLog.e("openSDK_LOG.SecureJsInterface", "-->curPosFromJS number format exception.", e4);
          i = -1;
       }
       if (i < 0) {
          throw new RuntimeException("position is illegal.");
       }
       boolean b = a.b;
       if (b) {
          if (Boolean.valueOf(JniInterface.BackSpaceChar(b, i)).booleanValue()) {
             a.b = false;
          }
       }else {
          str = a.a;
          this.a = str;
          JniInterface.insetTextToArray(i, str, str.length());
          SLog.v("openSDK_LOG.SecureJsInterface", "curPosFromJS mKey: "+this.a);
       }
       return;
    }
    public boolean customCallback(){
       return true;
    }
    public String getMD5FromNative(){
       String str = "openSDK_LOG.SecureJsInterface";
       SLog.i(str, "-->get md5 form native");
       try{
          int i = 0;
          String pWDKeyToMD5 = JniInterface.getPWDKeyToMD5(i);
          SLog.v(str, "-->getMD5FromNative, MD5= "+pWDKeyToMD5);
          return pWDKeyToMD5;
       }catch(java.lang.Exception e1){
          SLog.e(str, "-->get md5 form native exception: "+e1.getMessage());
          throw new RuntimeException(e1);
       }
    }
    public void isPasswordEdit(String p0){
       int i;
       String str = "-->is pswd edit, flag: "+p0;
       try{
          SLog.i("openSDK_LOG.SecureJsInterface", str);
          i = Integer.parseInt(p0);
       }catch(java.lang.Exception e4){
          SLog.e("openSDK_LOG.SecureJsInterface", "-->is pswd edit exception: "+e4.getMessage());
          i = -1;
       }
       boolean b = true;
       if (i && i != b) {
          throw new RuntimeException("is pswd edit flag is illegal.");
       }
       if (!i) {
          SecureJsInterface.isPWDEdit = false;
       }else if(i == b){
          SecureJsInterface.isPWDEdit = b;
       }
       return;
    }
}
