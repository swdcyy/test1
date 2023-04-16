package com.kuaishou.bowl.event.utils.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.lang.StringBuilder;
import java.util.UUID;
import java.security.MessageDigest;
import java.lang.Integer;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class a	// class@001202
{

    public void a(){
       super();
    }
    public static String a(){
       String obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = String.valueOf(System.currentTimeMillis());
       try{
          return a.b(obj+UUID.randomUUID().toString());
       }catch(java.lang.Exception e0){
          return e0+UUID.randomUUID().toString();
       }
    }
    public static String b(String p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          byte[] uobyteArray = MessageDigest.getInstance("MD5").digest(p0.getBytes("UTF-8"));
          obj = new StringBuilder((uobyteArray.length * 2));
          int len = uobyteArray.length;
          for (int i = 0; i < len; i = i + 1) {
             int i1 = uobyteArray[i] & 0x00ff;
             if (i1 < 16) {
                obj = obj+"0";
             }
             obj = obj+Integer.toHexString(i1);
          }
          return obj;
       }catch(java.security.NoSuchAlgorithmException e5){
          throw new RuntimeException("Huh, MD5 should be supported?", e5);
       }catch(java.io.UnsupportedEncodingException e5){
          throw new RuntimeException("Huh, UTF-8 should be supported?", e5);
       }
    }
}
