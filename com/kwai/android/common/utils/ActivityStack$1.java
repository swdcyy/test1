package com.kwai.android.common.utils.ActivityStack$1;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import com.kwai.android.common.utils.ActivityStack;

public final class ActivityStack$1 implements Application$ActivityLifecycleCallbacks	// class@000997
{

    public void ActivityStack$1(){
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       ActivityStack.pushInstance(p0);
    }
    public void onActivityDestroyed(Activity p0){
       ActivityStack.popInstance(ActivityStack.lastIndexOf(p0), false);
    }
    public void onActivityPaused(Activity p0){
    }
    public void onActivityResumed(Activity p0){
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
       ActivityStack.saveResume(p0);
    }
    public void onActivityStopped(Activity p0){
       ActivityStack.removeResume(p0);
    }
}
