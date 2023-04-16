package com.kuaishou.webkit.internal.FileLockHelper;
import java.io.Closeable;
import java.io.File;
import java.lang.Object;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import com.kuaishou.webkit.internal.KsWebViewUtils;
import com.kuaishou.webkit.internal.Logger;
import java.lang.Exception;

public class FileLockHelper implements Closeable	// class@001313
{
    public FileLock mFileLock;
    public FileOutputStream mOutputStream;

    public void FileLockHelper(File p0){
       try{
          super();
          FileOutputStream uFileOutputS = new FileOutputStream(p0);
          this.mOutputStream = uFileOutputS;
          this.mFileLock = uFileOutputS.getChannel().tryLock();
       }catch(java.lang.Exception e3){
          KsWebViewUtils.addLoaderStep("f11_"+e3.getClass().getSimpleName());
          Logger.e("kw_sdk", "FileLockHelper lock failed");
       }
       return;
    }
    public static FileLockHelper tryGetFileLock(File p0){
       FileLockHelper uFileLockHel = new FileLockHelper(p0);
       if (uFileLockHel.isLock()) {
          return uFileLockHel;
       }
       KsWebViewUtils.addLoaderStep("f21");
       uFileLockHel.close();
       return null;
    }
    public void close(){
       FileLockHelper tmFileLock;
       FileLock uFileLock = null;
       try{
          tmFileLock = this.mFileLock;
          if (tmFileLock != null) {
             tmFileLock.release();
             try{
             label_0008 :
                tmFileLock = this.mOutputStream;
                if (tmFileLock != null) {
                   tmFileLock.close();
                }
             }catch(java.lang.Exception e1){
             }
             e1.printStackTrace();
          }else {
             goto label_0008 ;
          }
       }catch(java.lang.Exception e1){
          try{
             e1.printStackTrace();
             tmFileLock = this.mOutputStream;
             if (tmFileLock != null) {
                tmFileLock.close();
             }
          }catch(java.lang.Exception e1){
             goto label_0011 ;
          }
       }
       this.mFileLock = uFileLock;
       this.mOutputStream = uFileLock;
       return;
    }
    public final boolean isLock(){
       boolean b = (this.mFileLock != null)? true: false;
       return b;
    }
}
