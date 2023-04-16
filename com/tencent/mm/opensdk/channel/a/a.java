package com.tencent.mm.opensdk.channel.a.a;
import android.os.Bundle;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Exception;
import com.tencent.mm.opensdk.utils.Log;
import java.lang.Object;
import java.lang.Double;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import android.content.Context;
import com.tencent.mm.opensdk.channel.a.a$a;
import com.tencent.mm.opensdk.utils.b;
import android.content.Intent;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.lang.StringBuffer;
import java.security.MessageDigest;

public class a	// class@000e6d
{

    public static int a(Bundle p0,String p1,int p2){
       if (p0 == null) {
          return p2;
       }
       try{
          p2 = p0.getInt(p1, p2);
       }catch(java.lang.Exception e1){
          Log.e("MicroMsg.IntentUtil", "getIntExtra exception:"+e1.getMessage());
       }
       return p2;
    }
    public static Object a(int p0,String p1){
       try{
          switch (p0){
              case 1:
                return Integer.valueOf(p1);
              case 2:
                return Long.valueOf(p1);
              case 3:
                return p1;
              case 4:
                return Boolean.valueOf(p1);
              case 5:
                return Float.valueOf(p1);
              case 6:
                return Double.valueOf(p1);
              default:
                Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
          }
       }catch(java.lang.Exception e2){
          Log.e(v0, "resolveObj exception:"+e2.getMessage());
       }
       return null;
    }
    public static String a(Bundle p0,String p1){
       String str = null;
       if (p0 == null) {
          return str;
       }
       try{
          str = p0.getString(p1);
       }catch(java.lang.Exception e2){
          Log.e("MicroMsg.IntentUtil", "getStringExtra exception:"+e2.getMessage());
       }
       return str;
    }
    public static boolean a(Context p0,a$a p1){
       String str;
       boolean b = false;
       if (p0 == null || p1 == null) {
          str = "send fail, invalid argument";
       }else if(b.b(p1.b)){
          str = "send fail, action is null";
       }else {
          StringBuilder str1 = null;
          if (!b.b(p1.a)) {
             str1 = p1.a+".permission.MM_MESSAGE";
          }
          Intent intent = new Intent(p1.b);
          a$a e = p1.e;
          if (e != null) {
             intent.putExtras(e);
          }
          String packageName = p0.getPackageName();
          intent.putExtra("_mmessage_sdkVersion", 0x26080000);
          intent.putExtra("_mmessage_appPackage", packageName);
          intent.putExtra("_mmessage_content", p1.c);
          intent.putExtra("_mmessage_support_content_type", p1.d);
          byte[] uobyteArray = a.a(p1.c, 0x26080000, packageName);
          intent.putExtra("_mmessage_checksum", uobyteArray);
          p0.sendBroadcast(intent, str1);
          Log.d("MicroMsg.SDK.MMessage", "send mm message, intent="+intent+", perm="+str1);
          return true;
       }
       Log.e("MicroMsg.SDK.MMessage", str);
       return b;
    }
    public static byte[] a(String p0,int p1){
       HttpURLConnection httpURLConne;
       MalformedURLException malformedURL;
       InputStream inputStream;
       ByteArrayOutputStream uByteArrayOu;
       IOException iOException;
       Exception uException;
       InputStream inputStream1;
       ByteArrayOutputStream uByteArrayOu1;
       if (p0 == null || !p0.length()) {
          Log.e("MicroMsg.SDK.NetUtil", "httpGet, url is null");
          return null;
       }else {
          try{
             httpURLConne = new URL(p0).openConnection();
             if (httpURLConne == null) {
                try{
                   Log.e("MicroMsg.SDK.NetUtil", "open connection failed.");
                   if (httpURLConne != null) {
                      httpURLConne.disconnect();
                   }
                   return null;
                }catch(java.net.MalformedURLException e9){
                   inputStream = null;
                   uByteArrayOu = inputStream;
                }catch(java.io.IOException e9){
                   inputStream = null;
                   uByteArrayOu = inputStream;
                }catch(java.lang.Exception e9){
                   inputStream = null;
                   uByteArrayOu = inputStream;
                }
             }else {
                try{
                   httpURLConne.setRequestMethod("GET");
                   httpURLConne.setConnectTimeout(p1);
                   httpURLConne.setReadTimeout(p1);
                   if (httpURLConne.getResponseCode() >= 300) {
                      Log.e("MicroMsg.SDK.NetUtil", "httpURLConnectionGet 300");
                      httpURLConne.disconnect();
                      return null;
                   }else {
                      try{
                         inputStream1 = httpURLConne.getInputStream();
                         try{
                            uByteArrayOu1 = new ByteArrayOutputStream();
                            uByteArrayOu = 1024;
                            byte[] uobyteArray = new byte[uByteArrayOu];
                            int i = inputStream1.read(uobyteArray);
                            while (i != -1) {
                               uByteArrayOu1.write(uobyteArray, 0, i);
                            }
                            Log.d("MicroMsg.SDK.NetUtil", "httpGet end");
                            httpURLConne.disconnect();
                            inputStream1.close();
                            uByteArrayOu1.close();
                            return uByteArrayOu1.toByteArray();
                         }catch(java.net.MalformedURLException e3){
                            inputStream = inputStream1;
                            malformedURL = e3;
                         }catch(java.io.IOException e3){
                            inputStream = inputStream1;
                            iOException = e3;
                         }catch(java.lang.Exception e3){
                            inputStream = inputStream1;
                            uException = e3;
                         }
                      }catch(java.io.IOException e9){
                         inputStream = null;
                      }catch(java.lang.Exception e9){
                         inputStream = null;
                      }
                   }
                }catch(java.net.MalformedURLException e9){
                   inputStream = null;
                }catch(java.io.IOException e9){
                }catch(java.lang.Exception e9){
                }
             }
          }catch(java.net.MalformedURLException e8){
             malformedURL = e8;
             httpURLConne = null;
             inputStream = httpURLConne;
          }catch(java.io.IOException e8){
             iOException = e8;
             httpURLConne = null;
             inputStream = httpURLConne;
          }catch(java.lang.Exception e8){
             uException = e8;
             httpURLConne = null;
             inputStream = httpURLConne;
          }catch(java.net.MalformedURLException e9){
          }catch(java.io.IOException e9){
          }catch(java.lang.Exception e9){
          }catch(java.net.MalformedURLException e4){
             inputStream = inputStream1;
             malformedURL = e4;
             uByteArrayOu = uByteArrayOu1;
          }catch(java.io.IOException e4){
             inputStream = inputStream1;
             iOException = e4;
             uByteArrayOu = uByteArrayOu1;
          }catch(java.lang.Exception e4){
             inputStream = inputStream1;
             uException = e4;
             uByteArrayOu = uByteArrayOu1;
          }
          Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:"+uException.getMessage());
          if (httpURLConne) {
             httpURLConne.disconnect();
          }
          if (inputStream) {
             inputStream.close();
          }
          if (uByteArrayOu) {
             uByteArrayOu.close();
          }
          return null;
       }
    }
    public static byte[] a(String p0,int p1,String p2){
       StringBuffer str = "";
       if (p0 != null) {
          str = str+p0;
       }
       byte[] bytes = ((str+p1+p2+"mMcShCsTr").substring(1, 9)).getBytes();
       char[] uocharArray = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          instance.update(bytes);
          bytes = instance.digest();
          int len = bytes.length;
          char[] uocharArray1 = new char[(len * 2)];
          int i1 = 0;
          for (int i = 0; i < len; i = i + 1) {
             int b = bytes[i];
             int i2 = i1 + 1;
             int i3 = b >> 4;
             i3 = i3 & 0x0f;
             uocharArray1[i1] = uocharArray[i3];
             i1 = i2 + 1;
             b = b & 0x0f;
             uocharArray1[i2] = uocharArray[b];
          }
          bytes = new String(uocharArray1);
       }catch(java.lang.Exception e0){
          bytes = null;
       }
       return bytes.getBytes();
    }
}
