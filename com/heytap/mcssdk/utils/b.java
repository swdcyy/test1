package com.heytap.mcssdk.utils.b;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.heytap.mcssdk.a.a;
import java.nio.charset.Charset;
import com.heytap.mcssdk.utils.c;
import java.lang.StringBuilder;
import com.heytap.mcssdk.utils.d;
import java.lang.Exception;
import com.heytap.msp.push.encrypt.AESEncrypt;
import com.heytap.mcssdk.utils.e;

public class b	// class@000540
{
    public static String a;
    public static String c;

    public void b(){
       super();
    }
    public static String a(){
       if (TextUtils.isEmpty(b.c)) {
          b.c = new String(a.b("Y29tLm5lYXJtZS5tY3M="));
       }
       byte[] uobyteArray = b.a(b.a(b.c));
       String str = (uobyteArray != null)? new String(uobyteArray, Charset.forName("UTF-8")): "";
       return str;
    }
    public static byte[] a(String p0){
       if (p0 != null) {
          return p0.getBytes("UTF-8");
       }
       byte[] uobyteArray = new byte[0];
       return uobyteArray;
    }
    public static byte[] a(byte[] p0){
       int len = (!(p0.length % 2))? p0.length: p0.length - 1;
       for (int i = 0; i < len; i = i + 2) {
          byte b = p0[i];
          int i1 = i + 1;
          p0[i] = p0[i1];
          p0[i1] = b;
       }
       return p0;
    }
    public static String b(String p0){
       String str2;
       String str = "";
       if (!TextUtils.isEmpty(p0)) {
          String str1 = null;
          try{
             str = c.a(p0, b.a());
             d.b("sdkDecrypt desDecrypt des data "+str);
             str2 = 1;
          }catch(java.lang.Exception e2){
             d.b("sdkDecrypt DES excepiton "+e2.toString());
             str2 = 0;
          }
          if (!TextUtils.isEmpty(str)) {
             str1 = str2;
          }
          if (str1 == null) {
             try{
                str = AESEncrypt.decrypt("isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=", p0);
                b.a = "AES";
                e.f().b(b.a);
                d.b("sdkDecrypt desDecrypt aes data "+str);
             }catch(java.lang.Exception e5){
                d.b("sdkDecrypt AES excepiton "+e5.toString());
             }
          }
       }
    }
    public static String c(String p0){
       String str2;
       String str = "";
       if (!TextUtils.isEmpty(p0)) {
          String str1 = null;
          try{
             str = AESEncrypt.decrypt("isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=", p0);
             d.b("sdkDecrypt aesDecrypt aes data "+str);
             str2 = 1;
          }catch(java.lang.Exception e2){
             d.b("sdkDecrypt AES excepiton "+e2.toString());
             str2 = 0;
          }
          if (!TextUtils.isEmpty(str)) {
             str1 = str2;
          }
          if (str1 == null) {
             try{
                str = c.a(p0, b.a());
                b.a = "DES";
                e.f().b(b.a);
                d.b("sdkDecrypt aesDecrypt des data "+str);
             }catch(java.lang.Exception e5){
                d.b("sdkDecrypt DES excepiton "+e5.toString());
             }
          }
       }
    }
    public static String d(String p0){
       d.b("sdkDecrypt start data "+p0);
       if (TextUtils.isEmpty(b.a)) {
          b.a = e.f().e();
       }
       if (("DES").equals(b.a)) {
          d.b("sdkDecrypt start DES");
          p0 = b.b(p0);
       }else {
          d.b("sdkDecrypt start AES");
          p0 = b.c(p0);
       }
       return p0;
    }
}
