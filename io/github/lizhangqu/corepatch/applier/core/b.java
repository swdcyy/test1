package io.github.lizhangqu.corepatch.applier.core.b;
import io.github.lizhangqu.corepatch.applier.a;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.security.MessageDigest;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.lang.Exception;
import io.github.lizhangqu.corepatch.applier.ApplierException;
import java.lang.Throwable;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class b implements a	// class@001038
{
    public File a;

    public void b(){
       super();
    }
    public void b(File p0){
       this.a = p0;
    }
    public final String d(File p0){
       String str;
       FileInputStream uFileInputSt;
       try{
          str = null;
          if (p0 == null || (p0.exists() && p0.isFile())) {
             int i = 2048;
             byte[] uobyteArray = new byte[i];
             try{
                MessageDigest instance = MessageDigest.getInstance("MD5");
                uFileInputSt = new FileInputStream(p0);
                while (true) {
                   int i1 = 0;
                   break ;
                }
                try{
                   int i2 = uFileInputSt.read(uobyteArray, i1, i);
                   if (i2 != -1) {
                      instance.update(uobyteArray, i1, i2);
                   }else {
                      str = (new BigInteger(1, instance.digest()).toString(16)).toUpperCase();
                      uFileInputSt.close();
                   }
                }catch(java.lang.Exception e8){
                }
                e8.printStackTrace();
                if (uFileInputSt) {
                   uFileInputSt.close();
                }
             }catch(java.lang.Exception e8){
                uFileInputSt = str;
                goto label_004e ;
             }
          }
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       if (str != null && str.length()) {
          return str;
       }else {
          throw new ApplierException("calculate md5 error");
       }
    }
    public void e(File p0,File p1,File p2){
       if (!this.isSupport()) {
          throw new ApplierException("not support");
       }
       if (p0 == null) {
          throw new ApplierException("oldFile == null");
       }
       if (p1 == null) {
          throw new ApplierException("oldFile == null");
       }
       if (!p0.exists()) {
          throw new ApplierException("oldFile not exists");
       }
       if (!p1.exists()) {
          throw new ApplierException("patchFile not exists");
       }
       if (p2.exists()) {
          p2.delete();
       }
       if (!p2.getParentFile().exists()) {
          p2.getParentFile().mkdirs();
       }
       try{
          if (p2.exists() || p2.createNewFile()) {
             return;
          }else {
             throw new ApplierException("create newFile failure");
          }
       }catch(java.io.IOException e3){
          throw new ApplierException("create newFile failure", e3);
       }
    }
    public void f(File p0,InputStream p1,OutputStream p2){
       if (!this.isSupport()) {
          throw new ApplierException("not support");
       }
       if (p0 == null) {
          throw new ApplierException("oldRandomAccessFile == null");
       }
       if (!p0.exists()) {
          throw new ApplierException("oldFile not exists");
       }
       if (p1 == null) {
          throw new ApplierException("patchInputStream == null");
       }
       if (p2 != null) {
          return;
       }
       throw new ApplierException("newOutputStream == null");
    }
}
