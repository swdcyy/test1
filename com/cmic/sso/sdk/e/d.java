package com.cmic.sso.sdk.e.d;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.security.MessageDigest;
import com.cmic.sso.sdk.e.r;

public class d	// class@000f5c
{

    public static String a(String p0){
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       try{
          return d.a(p0.getBytes("utf-8"));
       }catch(java.io.UnsupportedEncodingException e0){
          return v1;
       }
    }
    public static String a(byte[] p0){
       if (p0 == null) {
          return "";
       }
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          instance.update(p0);
          return r.a(instance.digest());
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
}
