package com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger$3;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Environment;
import java.io.File;
import android.content.Context;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import java.lang.StringBuilder;
import java.io.RandomAccessFile;
import java.util.Arrays;
import org.json.JSONObject;
import java.util.UUID;
import java.lang.Exception;
import java.io.IOException;
import java.io.FileNotFoundException;

public class UploaderKitExceptionLogger$3 implements Runnable	// class@0009ab
{
    public final UploaderKitExceptionLogger this$0;

    public void UploaderKitExceptionLogger$3(UploaderKitExceptionLogger p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       Object[] objArray1;
       Exception uException;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UploaderKitExceptionLogger$3.class, "1")) {
          return;
       }
       if (!UploaderKitExceptionLogger.getEnableExceptionCollection()) {
          return;
       }
       if (("mounted").equals(Environment.getExternalStorageState())) {
          File externalFile = this.this$0.mContext.getExternalFilesDir(objArray);
          if (externalFile == null) {
             KSUploaderKitLog.e(this.this$0.TAG, "checkAndReportExceptionInfo: getExternalFilesDir return null");
             return;
          }else {
             this.this$0.mFile = new File(externalFile.getPath()+File.separator+this.this$0.mFileName);
             if (this.this$0.mFile.exists()) {
                try{
                   UploaderKitExceptionLogger mFile = this.this$0.mFile;
                   String str = "r";
                   try{
                      RandomAccessFile randomAccess = new RandomAccessFile(mFile, str);
                      byte[] uobyteArray = new byte[UploaderKitExceptionLogger.BUFFER_SIZE];
                      int i = randomAccess.read(uobyteArray);
                      if (i < UploaderKitExceptionLogger.BUFFER_SIZE) {
                         objArray = Arrays.copyOfRange(uobyteArray, 0, i);
                      label_007e :
                         if (objArray != null) {
                            uobyteArray = objArray;
                         }
                         str = new String(uobyteArray, "UTF-8");
                         JSONObject jSONObject = new JSONObject(str);
                         String str1 = UUID.randomUUID().toString();
                         if (jSONObject.has(UploaderKitExceptionLogger.SESSION_ID_KEY)) {
                            str1 = jSONObject.getString(UploaderKitExceptionLogger.SESSION_ID_KEY);
                         }
                         KSUploaderKitLog.e(this.this$0.TAG, "report VP_PUBLISHEXCEPTION");
                         UploaderKitExceptionLogger$3 tthis$0 = this.this$0;
                         try{
                            tthis$0.writeLogger("VP_PUBLISHEXCEPTION", 7, str, str1);
                            randomAccess.close();
                         }catch(java.io.IOException e0){
                         }
                      label_00f1 :
                         e0.printStackTrace();
                      }else {
                         goto label_007e ;
                      }
                   label_00f4 :
                      this.this$0.removeExceptionFile();
                   }catch(java.io.FileNotFoundException e1){
                   }catch(java.io.IOException e1){
                   }catch(java.lang.Exception e1){
                   }
                   try{
                      uException.printStackTrace();
                      if (objArray1 != null) {
                         objArray1.close();
                         goto label_00f4 ;
                      }else {
                         goto label_00f4 ;
                      }
                   }catch(java.io.IOException e0){
                      goto label_00f1 ;
                   }
                }catch(java.io.FileNotFoundException e0){
                   FileNotFoundException uFileNotFoun = e0;
                   objArray1 = objArray;
                }catch(java.io.IOException e0){
                   IOException iOException = e0;
                   objArray1 = objArray;
                }catch(java.lang.Exception e0){
                   uException = e0;
                   objArray1 = objArray;
                   goto label_00c9 ;
                }
             }
          }
       }
       return;
    }
}
