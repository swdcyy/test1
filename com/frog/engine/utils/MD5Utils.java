package com.frog.engine.utils.MD5Utils;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.security.MessageDigest;
import com.frog.engine.utils.StringUtils;
import java.math.BigInteger;

public class MD5Utils	// class@001575
{

    public void MD5Utils(){
       super();
    }
    public static byte[] getMd5ByteDigest(String p0){
       MessageDigest obj = PatchProxy.applyOneRefs(p0, null, MD5Utils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return v1;
       }
       try{
          obj = MessageDigest.getInstance("MD5");
          obj.update(StringUtils.getBytes(p0));
          return obj.digest();
       }catch(java.security.NoSuchAlgorithmException e0){
       }
    }
    public static String getMd5Digest(String p0){
       Object obj = null;
       MessageDigest obj1 = PatchProxy.applyOneRefs(p0, obj, MD5Utils.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       try{
          obj1 = MessageDigest.getInstance("MD5");
          obj1.update(StringUtils.getBytes(p0));
          Object[] objArray = new Object[]{new BigInteger(1, obj1.digest())};
          p0 = (String.format("%1$032X", objArray)).toLowerCase();
          return p0;
       }catch(java.security.NoSuchAlgorithmException e0){
       }
    }
}
