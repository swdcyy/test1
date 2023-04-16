package com.sina.weibo.sdk.b.d;
import java.lang.String;
import java.security.MessageDigest;
import java.lang.Exception;

public final class d	// class@000bb7
{
    public static final char[] aj;

    static {
       d.aj = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    }
    public static String a(byte[] p0){
       String str;
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          instance.update(p0);
          p0 = instance.digest();
          char[] uocharArray = new char[32];
          int i1 = 0;
          for (int i = 0; i < 16; i = i + 1) {
             int b = p0[i];
             int i2 = i1 + 1;
             char[] aj = d.aj;
             int i3 = b >> 4;
             i3 = i3 & 0x0f;
             uocharArray[i1] = aj[i3];
             i1 = i2 + 1;
             b = b & 0x0f;
             uocharArray[i2] = aj[b];
          }
          str = new String(uocharArray);
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
          str = null;
       }
       return str;
    }
    public static String f(String p0){
       try{
          p0 = d.a(p0.getBytes());
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          p0 = null;
       }
       return p0;
    }
}
