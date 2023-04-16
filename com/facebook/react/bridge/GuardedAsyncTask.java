package com.facebook.react.bridge.GuardedAsyncTask;
import android.os.AsyncTask;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;

public abstract class GuardedAsyncTask extends AsyncTask	// class@0011c3
{
    public final NativeModuleCallExceptionHandler mExceptionHandler;

    public void GuardedAsyncTask(NativeModuleCallExceptionHandler p0){
       super();
       this.mExceptionHandler = p0;
    }
    public void GuardedAsyncTask(ReactContext p0){
       super(p0.getExceptionHandler());
    }
    public Object doInBackground(Object[] p0){
       return this.doInBackground(p0);
    }
    public final Void doInBackground(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GuardedAsyncTask.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          this.doInBackgroundGuarded(p0);
       }catch(java.lang.RuntimeException e3){
          this.mExceptionHandler.handleException(e3);
       }
       return null;
    }
    public abstract void doInBackgroundGuarded(Object[] p0);
}
