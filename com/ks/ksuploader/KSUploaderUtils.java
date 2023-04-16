package com.ks.ksuploader.KSUploaderUtils;
import java.lang.Object;
import java.io.BufferedInputStream;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.zip.CRC32;
import java.lang.Math;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class KSUploaderUtils	// class@000769
{

    public void KSUploaderUtils(){
       super();
    }
    public static long getContinuousFileCRC32(BufferedInputStream p0,long p1){
       CRC32 obj;
       KSUploaderUtils kSUploaderUt = KSUploaderUtils.class;
       if (PatchProxy.isSupport(kSUploaderUt)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, kSUploaderUt, "2");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       try{
          obj = new CRC32();
          byte[] uobyteArray = new byte[4096];
          while (p1 > 0) {
             int i = p0.read(uobyteArray, 0, Math.min((int)p1, 4096));
             if (i != -1) {
                obj.update(uobyteArray, 0, i);
                p1 = p1 - (long)i;
             }else {
                break ;
             }
          }
          return obj.getValue();
       }catch(java.io.IOException e0){
          return -1;
       }
    }
    public static long getFileCRC32(String p0,long p1,long p2){
       InputStream obj;
       BufferedInputStream uBufferedInp;
       if (PatchProxy.isSupport(KSUploaderUtils.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), null, KSUploaderUtils.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       obj = 0;
       try{
          FileInputStream uFileInputSt = new FileInputStream(p0);
          try{
             uBufferedInp = new BufferedInputStream(uFileInputSt);
             uBufferedInp.skip(p1);
             CRC32 uCRC32 = new CRC32();
             byte[] uobyteArray = new byte[4096];
             while (p2 > 0) {
                int i = 0;
                int i1 = uBufferedInp.read(uobyteArray, i, Math.min((int)p2, 4096));
                if (i1 != -1) {
                   uCRC32.update(uobyteArray, i, i1);
                   p2 = p2 - (long)i1;
                }else {
                   break ;
                }
             }
             long value = uCRC32.getValue();
             try{
                uBufferedInp.close();
             }catch(java.io.IOException e9){
                e9.printStackTrace();
             }
             return value;
          }catch(java.io.IOException e0){
             obj = uBufferedInp;
          }
          if (e0) {
             try{
                e0.close();
             }catch(java.io.IOException e7){
                e7.printStackTrace();
             }
          }
       }catch(java.io.IOException e0){
          goto label_0074 ;
       }
    }
}
