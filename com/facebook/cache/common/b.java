package com.facebook.cache.common.b;
import com.facebook.cache.common.CacheKey;
import java.util.List;
import ta.b;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.security.MessageDigest;
import android.util.Base64;

public final class b	// class@00103e
{

    public static List a(CacheKey p0){
       ArrayList uArrayList;
       try{
          if (p0 instanceof b) {
             List list = p0.d();
             uArrayList = new ArrayList(list.size());
             for (int i = 0; i < list.size(); i = i + 1) {
                uArrayList.add(b.b(list.get(i)));
             }
          }else {
             uArrayList = new ArrayList(1);
             String str = (p0.b())? p0.a(): b.b(p0);
             uArrayList.add(str);
          }
          return uArrayList;
       }catch(java.io.UnsupportedEncodingException e3){
          throw new RuntimeException(e3);
       }
    }
    public static String b(CacheKey p0){
       byte[] bytes = (p0.a()).getBytes("UTF-8");
       try{
          MessageDigest instance = MessageDigest.getInstance("SHA-1");
          instance.update(bytes, 0, bytes.length);
          bytes = instance.digest();
          return Base64.encodeToString(bytes, 11);
       }catch(java.security.NoSuchAlgorithmException e3){
          throw new RuntimeException(e3);
       }
    }
}
