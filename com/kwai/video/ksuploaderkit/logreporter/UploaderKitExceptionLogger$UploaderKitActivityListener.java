package com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger$UploaderKitActivityListener;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import com.kwai.video.ksuploaderkit.logreporter.UploaderKitExceptionLogger$1;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class UploaderKitExceptionLogger$UploaderKitActivityListener implements Application$ActivityLifecycleCallbacks	// class@0009ad
{
    public String mActivityName;
    public boolean mIsForeground;

    public void UploaderKitExceptionLogger$UploaderKitActivityListener(){
       super();
    }
    public void UploaderKitExceptionLogger$UploaderKitActivityListener(UploaderKitExceptionLogger$1 p0){
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
    }
    public void onActivityPaused(Activity p0){
       this.mIsForeground = false;
    }
    public void onActivityResumed(Activity p0){
       this.mIsForeground = true;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UploaderKitExceptionLogger$UploaderKitActivityListener.class, "1")) {
          return;
       }
       this.mActivityName = p0.getClass().getSimpleName();
       return;
    }
    public void onActivityStopped(Activity p0){
    }
}
