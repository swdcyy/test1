package com.yxcorp.gifshow.ad.util.a;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fud.d;
import java.lang.Throwable;
import yx.j0;
import com.yxcorp.gifshow.ad.tachikoma.AdTkException;
import java.lang.StringBuilder;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.io.InputStream;
import ekd.p;

public class a	// class@001879
{

    public void a(){
       super();
    }
    public static String a(File p0){
       byte[] obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.c(p0);
          if (obj == null || !obj.length) {
             return null;
          }
          return new String(d.c(obj, true));
       }catch(java.security.NoSuchAlgorithmException e3){
       }catch(java.io.IOException e3){
       }
       j0.b("FileMD5Utils", "cannot calculate md5 of file :  ", e3);
       StringBuilder str = "calculate md5 error : ";
       String str1 = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (str1 != PatchProxyResult.class) {
       }else {
          JsonObject jsonObject = new JsonObject();
          jsonObject.H("canRead", Boolean.valueOf(p0.canRead()));
          jsonObject.H("canWrite", Boolean.valueOf(p0.canWrite()));
          jsonObject.a0("length", Long.valueOf(p0.length()));
          jsonObject.c0("path", p0.getPath());
          jsonObject.H("exists", Boolean.valueOf(p0.exists()));
          jsonObject.a0("lastModified", Long.valueOf(p0.lastModified()));
          str1 = jsonObject.toString();
       }
       ExceptionHandler.handleCaughtException(new AdTkException(str+str1, e3));
       return null;
    }
    public static String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       return a.a(new File(p0));
    }
    public static byte[] c(File p0){
       FileInputStream obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       try{
          obj = new FileInputStream(p0);
          MessageDigest instance = MessageDigest.getInstance("MD5");
          byte[] uobyteArray = new byte[4096];
          int i = obj.read(uobyteArray);
          while (i != -1) {
             instance.update(uobyteArray, 0, i);
          }
          p.c(obj);
          return instance.digest();
       }catch(java.lang.Exception e5){
          j0.b("FileMD5Utils", "getting file md5 digest error.", e5);
          p.c(obj);
          return null;
       }
    }
}
