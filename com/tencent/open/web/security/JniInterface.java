package com.tencent.open.web.security.JniInterface;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import com.tencent.open.utils.f;
import java.io.File;
import java.lang.StringBuilder;
import com.tencent.connect.auth.AuthAgent;
import java.lang.System;
import com.tencent.open.log.SLog;
import java.lang.Throwable;

public class JniInterface	// class@000f87
{
    public static boolean isJniOk;

    public void JniInterface(){
       super();
    }
    public static native boolean BackSpaceChar(boolean p0,int p1);
    public static native boolean clearAllPWD();
    public static native String d1(String p0);
    public static native String d2(String p0);
    public static native String getPWDKeyToMD5(String p0);
    public static native boolean insetTextToArray(int p0,String p1,int p2);
    public static void loadSo(){
       String str = "/";
       if (JniInterface.isJniOk) {
          return;
       }
       Context uContext = f.a();
       if (uContext != null) {
          if (new File(uContext.getFilesDir().toString()+str+AuthAgent.SECURE_LIB_NAME).exists()) {
             System.load(uContext.getFilesDir().toString()+str+AuthAgent.SECURE_LIB_NAME);
             JniInterface.isJniOk = true;
             SLog.i("openSDK_LOG.JniInterface", "-->load lib success:"+AuthAgent.SECURE_LIB_NAME);
          }else {
             SLog.i("openSDK_LOG.JniInterface", "-->fail, because so is not exists:"+AuthAgent.SECURE_LIB_NAME);
          }
       }else {
          SLog.i("openSDK_LOG.JniInterface", "-->load lib fail, because context is null:"+AuthAgent.SECURE_LIB_NAME);
       }
       return;
    }
}
