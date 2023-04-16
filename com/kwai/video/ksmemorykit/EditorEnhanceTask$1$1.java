package com.kwai.video.ksmemorykit.EditorEnhanceTask$1$1;
import com.kwai.kve.LutEnhancer$EventListener;
import com.kwai.video.ksmemorykit.EditorEnhanceTask$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksmemorykit.EditorEnhanceTask;
import com.kwai.video.ksmemorykit.EditorEnhanceTask$EventListener;
import java.util.List;
import com.kwai.kve.ErrorInfo;
import com.kwai.kve.LutEnhancer$EnhanceLut;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.io.File;
import java.lang.StringBuilder;
import java.io.FileOutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.OutputStream;
import com.kwai.video.ksmemorykit.EditorEnhanceResultImpl;
import com.kwai.video.ksmemorykit.EditorEnhanceResult;
import java.io.IOException;
import java.io.FileNotFoundException;
import com.kwai.kve.ErrorInfo$ErrorCode;

public class EditorEnhanceTask$1$1 implements LutEnhancer$EventListener	// class@0008e5
{
    public final EditorEnhanceTask$1 this$1;

    public void EditorEnhanceTask$1$1(EditorEnhanceTask$1 p0){
       this.this$1 = p0;
       super();
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, EditorEnhanceTask$1$1.class, "3")) {
          return;
       }
       EditorEnhanceTask mEventListen = this.this$1.this$0.mEventListener;
       if (mEventListen != null) {
          mEventListen.onCancel();
       }
       EditorEnhanceTask$1 this$0 = this.this$1.this$0;
       this$0.mLutEnhancer = null;
       this$0.mCPUImageFrames.clear();
       this.this$1.this$0.mCPUImageFrames = null;
       return;
    }
    public void onError(ErrorInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorEnhanceTask$1$1.class, "2")) {
          return;
       }
       EditorEnhanceTask mEventListen = this.this$1.this$0.mEventListener;
       if (mEventListen != null) {
          mEventListen.onError(p0);
       }
       EditorEnhanceTask$1 this$0 = this.this$1.this$0;
       this$0.mLutEnhancer = null;
       this$0.mCPUImageFrames.clear();
       this$0.mCPUImageFrames = null;
       return;
    }
    public void onFinish(LutEnhancer$EnhanceLut p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorEnhanceTask$1$1.class, "1")) {
          return;
       }
       Bitmap uBitmap = Bitmap.createBitmap((p0.getLutWidth() * p0.getBlockSizeRow()), (p0.getLutHeight() * p0.getBlockSizeCol()), Bitmap$Config.ARGB_8888);
       uBitmap.copyPixelsFromBuffer(p0.getData());
       new File(this.this$1.val$workspacePath).mkdirs();
       String str = this.this$1.val$workspacePath+"/enhance_lut.png";
       File uFile = new File(str);
       try{
          uFile.delete();
          FileOutputStream uFileOutputS = new FileOutputStream(uFile);
          uBitmap.compress(Bitmap$CompressFormat.PNG, 100, uFileOutputS);
          this.this$1.this$0.mLutPath = str;
          _monitor_enter(this);
          this.this$1.this$0.mEventListener.onFinish(new EditorEnhanceResultImpl(str, p0));
          try{
             _monitor_exit(this);
             uFileOutputS.close();
          }catch(java.io.IOException e6){
             e6.getMessage();
             e6.printStackTrace();
          }
          EditorEnhanceTask$1 this$0 = this.this$1.this$0;
          this$0.mLutEnhancer = null;
          this$0.mCPUImageFrames.clear();
          this$0.mCPUImageFrames = null;
          return;
       }catch(java.io.FileNotFoundException e6){
          this.this$1.this$0.callOnError(ErrorInfo$ErrorCode.UNSPECIFIED_FAIL, "Failed to finish enhance task. "+e6.getMessage());
          e6.printStackTrace();
          return;
       }
    }
}
