package com.kwai.robust.Utils;
import java.lang.Object;
import java.io.File;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.String;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.Throwable;
import com.kwai.robust.RobustException;
import java.io.BufferedInputStream;
import java.security.MessageDigest;
import java.lang.Integer;

public class Utils	// class@001408
{
    public static final int MD5_FILE_BUF_LENGTH = 102400;

    public void Utils(){
       super();
    }
    public static void enforceDir(File p0){
       if (p0 == null) {
          return;
       }
       if (p0.exists()) {
          if (!p0.isDirectory()) {
             throw new IOException("File "+p0+" exists and is not a directory. Unable to create directory.");
          }
       }else if(p0.mkdirs() || p0.isDirectory()){
          throw new IOException("Unable to create directory "+p0);
       }
       return;
    }
    public static String md5(File p0){
       if (p0 == null || !p0.exists()) {
          throw new RobustException("File not exists:"+p0);
       }
       FileInputStream uFileInputSt = new FileInputStream(p0);
       uFileInputSt.close();
       return Utils.md5(uFileInputSt);
    }
    public static String md5(InputStream p0){
       BufferedInputStream uBufferedInp = new BufferedInputStream(p0);
       MessageDigest instance = MessageDigest.getInstance("MD5");
       StringBuilder str = new StringBuilder(32);
       byte[] uobyteArray = new byte[0x19000];
       int i = uBufferedInp.read(uobyteArray);
       int i1 = 0;
       while (i != -1) {
          instance.update(uobyteArray, i1, i);
       }
       byte[] uobyteArray1 = instance.digest();
       for (; i1 < uobyteArray1.length; i1 = i1 + 1) {
          int i2 = uobyteArray1[i1] & 0x00ff;
          i2 = i2 + 256;
          str = str+(Integer.toString(i2, 16)).substring(1);
       }
       return str;
    }
}
