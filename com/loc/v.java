package com.loc.v;
import java.lang.String;
import android.net.Proxy;
import java.lang.Throwable;
import com.loc.an;
import com.loc.x;
import android.content.Context;
import java.net.Proxy;
import java.net.URI;
import java.net.ProxySelector;
import java.util.List;
import java.lang.Object;
import java.net.Proxy$Type;
import android.net.Uri;
import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Locale;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.o;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import com.loc.ak;

public final class v	// class@00146e
{

    public static String a(){
       String defaultHost = Proxy.getDefaultHost();
       if (defaultHost == null) {
          defaultHost = "null";
       }
       return defaultHost;
    }
    public static String a(String p0){
       return x.c(p0);
    }
    public static Proxy a(Context p0){
       Proxy proxy = v.a(p0, new URI("http://restsdk.amap.com"));
       return proxy;
    }
    public static Proxy a(Context p0,URI p1){
       Proxy proxy = null;
       if (!v.c(p0)) {
          return proxy;
       }
       List list = ProxySelector.getDefault().select(p1);
       if (list != null && !list.isEmpty()) {
          Proxy proxy1 = list.get(0);
          if (proxy1 != null && proxy1.type() != Proxy$Type.DIRECT) {
             proxy = proxy1;
          }
       }
       return proxy;
    }
    public static int b(){
       int defaultPort = Proxy.getDefaultPort();
       return defaultPort;
    }
    public static Proxy b(Context p0){
       Cursor uCursor;
       Proxy proxy;
       Locale locale;
       int i2;
       int i3;
       int i4;
       int i5;
       String str = "QMTAuMC4wLjE3Mg==";
       String str1 = "QMTAuMC4wLjIwMA==";
       if (v.c(p0)) {
          Uri uri = Uri.parse("content://telephony/carriers/preferapn");
          ContentResolver contentResol = p0.getContentResolver();
          String[] stringArray = null;
          int i = 0;
          try{
             int i1 = -1;
             uCursor = contentResol.query(uri, stringArray, null, null, null);
             if (uCursor != null && uCursor.moveToFirst()) {
                String str2 = uCursor.getString(uCursor.getColumnIndex("apn"));
                if (str2 != null) {
                   str2 = str2.toLowerCase(Locale.US);
                }
                try{
                   if (str2 != null && str2.contains("ctwap")) {
                      str2 = v.a();
                      i4 = v.b();
                      try{
                         if (!TextUtils.isEmpty(str2) && !str2.equals("null")) {
                            proxy = str2;
                            i3 = 1;
                         }else {
                            proxy = null;
                            i3 = 0;
                         }
                         if (!i3) {
                            try{
                               proxy = v.a(str1);
                            }catch(java.lang.SecurityException e0){
                            }
                         }
                         if (i4 == i1) {
                         label_0076 :
                            i5 = 80;
                         }
                      }catch(java.lang.SecurityException e0){
                         proxy = null;
                      }
                   }else if(str2 != null && str2.contains("wap")){
                      str2 = v.a();
                      i4 = v.b();
                      if (!TextUtils.isEmpty(str2) && !str2.equals("null")) {
                         proxy = str2;
                         str2 = 1;
                      }else {
                         proxy = null;
                         str2 = null;
                      }
                      if (!str2) {
                         proxy = v.a(str);
                      }
                      if (i4 == i1) {
                         goto label_0076 ;
                      }
                   }else {
                   label_00b4 :
                      proxy = null;
                      i5 = -1;
                   }
                   i5 = i4;
                }catch(java.lang.SecurityException e0){
                }catch(java.lang.SecurityException e0){
                }
                an.b(e0, "pu", "ghp");
                str2 = o.q(p0);
                if (str2 != null) {
                   str2 = str2.toLowerCase(Locale.US);
                   String str3 = v.a();
                   i2 = v.b();
                   if (str2.indexOf("ctwap") != i1) {
                      if (!TextUtils.isEmpty(str3) && !str3.equals("null")) {
                         proxy = str3;
                         i3 = 1;
                      }else {
                         i3 = 0;
                      }
                      if (!i3) {
                         proxy = v.a(str1);
                      }
                      if (i2 != i1) {
                      label_0139 :
                         if (uCursor) {
                            uCursor.close();
                         }
                         i4 = i2;
                      label_0145 :
                         if (proxy != null && (proxy.length() > 0 && i4 != i1)) {
                            i = 1;
                         }
                      label_0154 :
                         if (i) {
                            return new Proxy(Proxy$Type.HTTP, InetSocketAddress.createUnresolved(proxy, i4));
                         }
                      }
                   }else if(str2.indexOf("wap") != i1){
                      if (!TextUtils.isEmpty(str3) && !str3.equals("null")) {
                         proxy = str3;
                         i3 = 1;
                      }else {
                         i3 = 0;
                      }
                      if (!i3) {
                         proxy = v.a(str);
                      }
                   }else {
                      goto label_0139 ;
                   }
                   i2 = 80;
                   goto label_0139 ;
                }else {
                   i2 = locale;
                   goto label_0139 ;
                }
             }else {
                goto label_00b4 ;
             }
             if (uCursor != null) {
                uCursor.close();
             }
             i4 = i5;
             goto label_0145 ;
          }catch(java.lang.SecurityException e0){
             uCursor = null;
             proxy = uCursor;
          }catch(java.lang.SecurityException e0){
             proxy = null;
          }
          locale = -1;
          goto label_00e1 ;
       }
    label_0176 :
       return null;
    }
    public static boolean c(Context p0){
       if (!o.o(p0)) {
          return true;
       }
       return false;
    }
}
