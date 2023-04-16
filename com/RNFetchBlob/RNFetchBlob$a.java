package com.RNFetchBlob.RNFetchBlob$a;
import java.lang.Runnable;
import com.RNFetchBlob.RNFetchBlob;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.RNFetchBlob.b;
import java.util.HashMap;
import java.lang.StringBuilder;
import java.io.File;
import java.security.MessageDigest;
import java.io.FileInputStream;
import java.lang.Byte;
import java.lang.Exception;

public class RNFetchBlob$a implements Runnable	// class@000d4a
{
    public final String b;
    public final String c;
    public final Promise d;
    public final RNFetchBlob e;

    public void RNFetchBlob$a(RNFetchBlob p0,String p1,String p2,Promise p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       int i;
       RNFetchBlob$a tb = this.b;
       RNFetchBlob$a tc = this.c;
       RNFetchBlob$a td = this.d;
       HashMap e = b.e;
       try{
          e = new HashMap();
          e.put("md5", "MD5");
          e.put("sha1", "SHA-1");
          e.put("sha224", "SHA-224");
          e.put("sha256", "SHA-256");
          e.put("sha384", "SHA-384");
          e.put("sha512", "SHA-512");
          if (!e.containsKey(tc)) {
             td.reject("EINVAL", "Invalid algorithm \'"+tc+"\', must be one of md5, sha1, sha224, sha256, sha384, sha512");
          }else {
             File uFile = new File(tb);
             if (uFile.isDirectory()) {
                td.reject("EISDIR", "Expecting a file but \'"+tb+"\' is a directory");
             }else if(!uFile.exists()){
                td.reject("ENOENT", "No such file \'"+tb+"\'");
             }else {
                MessageDigest instance = MessageDigest.getInstance(e.get(tc));
                FileInputStream uFileInputSt = new FileInputStream(tb);
                byte[] uobyteArray = new byte[0x100000];
                if (uFile.length() - null) {
                   i = uFileInputSt.read(uobyteArray);
                   while (i != -1) {
                      instance.update(uobyteArray, 0, i);
                   }
                }
                StringBuilder str = "";
                byte[] uobyteArray1 = instance.digest();
                int len = uobyteArray1.length;
                for (i = 0; i < len; i = i + 1) {
                   Object[] objArray = new Object[]{Byte.valueOf(uobyteArray1[i])};
                   str = str+String.format("%02x", objArray);
                }
                td.resolve(str);
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          td.reject("EUNSPECIFIED", e0.getLocalizedMessage());
       }
       return;
    }
}
