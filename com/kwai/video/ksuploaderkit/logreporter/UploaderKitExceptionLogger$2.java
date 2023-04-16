package com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger$2;
import java.lang.Runnable;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicInteger;

public class UploaderKitExceptionLogger$2 implements Runnable	// class@0009aa
{
    public final UploaderKitExceptionLogger this$0;
    public final String val$taskID;

    public void UploaderKitExceptionLogger$2(UploaderKitExceptionLogger p0,String p1){
       this.this$0 = p0;
       this.val$taskID = p1;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, UploaderKitExceptionLogger$2.class, "1")) {
          return;
       }
       UploaderKitExceptionLogger$2 tval$taskID = this.val$taskID;
       if (tval$taskID != null) {
          UploaderKitExceptionLogger mTaskID = this.this$0.mTaskID;
          if (mTaskID != null && tval$taskID.equalsIgnoreCase(mTaskID)) {
             tval$taskID = this.this$0;
             if (tval$taskID.mIsInit != null) {
                tval$taskID.mIsFinished = true;
                tval$taskID = this.this$0;
                tval$taskID.mTaskID = objArray;
                tval$taskID.mSessionID = objArray;
                tval$taskID.mPublishLogInfo = objArray;
                tval$taskID.mLowMemoryCnt.set(0);
                tval$taskID = this.this$0;
                tval$taskID.mTranscodeFinished = false;
                tval$taskID.mFragmentCnt.set(0);
                tval$taskID = this.this$0;
                tval$taskID.mStartTimeStamp = 0;
                tval$taskID.mProgress = 0;
                tval$taskID.removeExceptionFile();
                this.this$0.removeLogTask();
             }
          }
       }
       return;
    }
}
