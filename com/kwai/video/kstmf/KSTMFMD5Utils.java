package com.kwai.video.kstmf.KSTMFMD5Utils;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.lang.System;
import java.lang.Throwable;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.util.Objects;
import java.lang.IndexOutOfBoundsException;

public class KSTMFMD5Utils	// class@00093e
{
    public static final char[] FIRST_CHAR;
    public static final char[] HEX_CHARS;
    public static final char[] HEX_DIGITS;
    public static final char[] SECOND_CHAR;

    static {
       KSTMFMD5Utils.HEX_CHARS = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
       KSTMFMD5Utils.HEX_DIGITS = new char[16]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
       char[] uocharArray = new char[256];
       KSTMFMD5Utils.FIRST_CHAR = uocharArray;
       uocharArray = new char[256];
       KSTMFMD5Utils.SECOND_CHAR = uocharArray;
       for (int i = 0; i < 256; i = i + 1) {
          char[] hEX_DIGITS = KSTMFMD5Utils.HEX_DIGITS;
          int i1 = i >> 4;
          i1 = i1 & 0x0f;
          KSTMFMD5Utils.FIRST_CHAR[i] = hEX_DIGITS[i1];
          i1 = i & 0x0f;
          KSTMFMD5Utils.SECOND_CHAR[i] = hEX_DIGITS[i1];
       }
    }
    public void KSTMFMD5Utils(){
       super();
    }
    public static String encodeHex(byte[] p0,boolean p1){
       char[] obj;
       KSTMFMD5Utils kSTMFMD5Util = KSTMFMD5Utils.class;
       if (PatchProxy.isSupport(kSTMFMD5Util)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, kSTMFMD5Util, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new char[(p0.length * 2)];
       int i1 = 0;
       for (int i = 0; i < p0.length; i = i + 1) {
          int i2 = p0[i] & 0x00ff;
          if (!i2 && p1) {
             break ;
          }
          int i3 = i1 + 1;
          obj[i1] = KSTMFMD5Utils.FIRST_CHAR[i2];
          i1 = i3 + 1;
          obj[i3] = KSTMFMD5Utils.SECOND_CHAR[i2];
       }
       return new String(obj, 0, i1);
    }
    public static String getFileMD5(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSTMFMD5Utils.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          byte[] fileMD5Diges = KSTMFMD5Utils.getFileMD5Digest(p0);
          if (fileMD5Diges == null || !fileMD5Diges.length) {
             return null;
          }
          return KSTMFMD5Utils.encodeHex(fileMD5Diges, true);
       }catch(java.security.NoSuchAlgorithmException e0){
       }catch(java.io.IOException e0){
       }
    }
    public static String getFileMD5(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSTMFMD5Utils.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       return KSTMFMD5Utils.getFileMD5(new File(p0));
    }
    public static byte[] getFileMD5Digest(File p0){
       FileInputStream obj = PatchProxy.applyOneRefs(p0, null, KSTMFMD5Utils.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       try{
          obj = new FileInputStream(p0);
          MessageDigest instance = MessageDigest.getInstance("MD5");
          byte[] uobyteArray = new byte[4096];
          int i = obj.read(uobyteArray);
          while (i != -1) {
             instance.update(uobyteArray, 0, i);
          }
          obj.close();
          return instance.digest();
       }catch(java.lang.Exception e0){
          e0.close();
          return null;
       }
    }
    public static byte[] getFileMD5Digest(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSTMFMD5Utils.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       return KSTMFMD5Utils.getFileMD5Digest(new File(p0));
    }
    public static String getFileMD5DigestFast(File p0){
       Object obj = null;
       FileInputStream obj1 = PatchProxy.applyOneRefs(p0, obj, KSTMFMD5Utils.class, "7");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new FileInputStream(p0);
       long l = p0.length();
       int i = 128;
       byte[] uobyteArray = new byte[i];
       byte[] uobyteArray1 = new byte[8];
       byte[] uobyteArray2 = new byte[136];
       for (int i1 = 0; i1 < 8; i1 = i1 + 1) {
          int i2 = i1 * 8;
          i2 = i2 - 56;
          long l1 = l >> i2;
          l1 = l1 & 255;
          uobyteArray1[i1] = (byte)(int)l1;
       }
       obj1.read(uobyteArray);
       System.arraycopy(uobyteArray, 0, uobyteArray2, 0, i);
       System.arraycopy(uobyteArray1, 0, uobyteArray2, i, 8);
       obj1.close();
       return KSTMFMD5Utils.hexdigest(uobyteArray2);
    }
    public static String hexdigest(String p0){
       String str;
       Object obj = PatchProxy.applyOneRefs(p0, null, KSTMFMD5Utils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          str = KSTMFMD5Utils.hexdigest(p0.getBytes());
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return str;
    }
    public static String hexdigest(byte[] p0){
       String str = null;
       MessageDigest obj = PatchProxy.applyOneRefs(p0, str, KSTMFMD5Utils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = MessageDigest.getInstance("MD5");
          obj.update(p0);
          p0 = obj.digest();
          char[] uocharArray = new char[32];
          int i1 = 0;
          for (int i = 0; i < 16; i = i + 1) {
             int b = p0[i];
             int i2 = i1 + 1;
             char[] hEX_CHARS = KSTMFMD5Utils.HEX_CHARS;
             int i3 = b >> 4;
             i3 = i3 & 0x0f;
             uocharArray[i1] = hEX_CHARS[i3];
             i1 = i2 + 1;
             b = b & 0x0f;
             uocharArray[i2] = hEX_CHARS[b];
          }
          str = new String(uocharArray);
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return str;
    }
    public static String md5(String p0){
       MessageDigest obj = PatchProxy.applyOneRefs(p0, null, KSTMFMD5Utils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = MessageDigest.getInstance("MD5");
          obj.update(p0.getBytes());
          byte[] uobyteArray = obj.digest();
          StringBuilder str = "";
          int len = uobyteArray.length;
          for (int i = 0; i < len; i = i + 1) {
             byte b = uobyteArray[i];
             if (b < 0) {
                b = b + 256;
             }
             if (b < 16) {
                str = str+"0";
             }
             str = str+Integer.toHexString(b);
          }
          return str;
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static String sha1(String p0){
       MessageDigest obj = PatchProxy.applyOneRefs(p0, null, KSTMFMD5Utils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = MessageDigest.getInstance("SHA-1");
          obj.update(p0.getBytes());
          byte[] uobyteArray = obj.digest();
          return KSTMFMD5Utils.toHexString(uobyteArray, 0, uobyteArray.length);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return "";
       }
    }
    public static String toHexString(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(KSTMFMD5Utils.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, KSTMFMD5Utils.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Objects.requireNonNull(p0, "bytes is null");
       if (p1 >= 0 && (p1 + p2) <= p0.length) {
          int i = p2 * 2;
          char[] uocharArray = new char[i];
          int i2 = 0;
          for (int i1 = 0; i1 < p2; i1 = i1 + 1) {
             int i3 = i1 + p1;
             i3 = p0[i3] & 0x00ff;
             int i4 = i2 + 1;
             char[] hEX_CHARS = KSTMFMD5Utils.HEX_CHARS;
             int i5 = i3 >> 4;
             uocharArray[i2] = hEX_CHARS[i5];
             i2 = i4 + 1;
             i3 = i3 & 0x0f;
             uocharArray[i4] = hEX_CHARS[i3];
          }
          return new String(uocharArray, 0, i);
       }else {
          throw new IndexOutOfBoundsException();
       }
    }
}
