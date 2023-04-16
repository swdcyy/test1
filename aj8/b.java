package aj8.b;
import aj8.a;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.io.InputStream;
import java.io.IOException;
import zi8.p;
import java.lang.Exception;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;

public class b extends a	// class@0000a7
{

    public void b(){
       super();
    }
    public static String b(File p0){
       FileInputStream uFileInputSt;
       byte[] obj = PatchProxy.applyOneRefs(p0, null, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.exists()) {
          p0.toString();
          return "";
       }else if(!p0.isFile()){
          p0.toString();
          return "";
       }else {
          System.currentTimeMillis();
          int i = 1024;
          try{
             obj = new byte[i];
             try{
                uFileInputSt = new FileInputStream(p0);
                MessageDigest instance = MessageDigest.getInstance("MD5");
                int i1 = uFileInputSt.read(obj);
                while (i1 > 0) {
                   instance.update(obj, 0, i1);
                }
                String str = b.e(instance.digest());
                try{
                   uFileInputSt.close();
                }catch(java.io.IOException e1){
                   e1.printStackTrace();
                }
                if (p.d()) {
                   p0.length();
                   System.currentTimeMillis();
                   p0.getPath();
                }
                return str;
             }catch(java.lang.Exception e0){
                InputStream inputStream = uFileInputSt;
             }
             e0.printStackTrace();
             if (null) {
                try{
                   null.close();
                }catch(java.io.IOException e0){
                   e0.printStackTrace();
                }
             }
          }catch(java.lang.Exception e0){
             goto label_006c ;
          }
       }
    }
    public static String c(String p0){
       MessageDigest obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = MessageDigest.getInstance("MD5");
          obj.update(p0.getBytes("utf-8"));
          p0 = b.e(obj.digest());
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return p0;
    }
    public static String d(String p0){
       MessageDigest obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       try{
          obj = MessageDigest.getInstance("MD5");
          obj.update(p0.getBytes("utf-8"));
          p0 = b.f(obj.digest());
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return p0;
    }
    public static String e(byte[] p0){
       int b;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          b = p0[i];
          char[] a = a.a;
          int i1 = b & 0x00f0;
          i1 = i1 >> 4;
          b = b & 0x0f;
          obj = obj+a[i1]+a[b];
       }
       return obj;
    }
    public static String f(byte[] p0){
       int b;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          b = p0[i];
          char[] b1 = a.b;
          int i1 = b & 0x00f0;
          i1 = i1 >> 4;
          b = b & 0x0f;
          obj = obj+b1[i1]+b1[b];
       }
       return obj;
    }
}
