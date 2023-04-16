package com.facebook.react.bridge.GuardedResultAsyncTask;
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

public abstract class GuardedResultAsyncTask extends AsyncTask	// class@0011c4
{
    public final NativeModuleCallExceptionHandler mExceptionHandler;

    public void GuardedResultAsyncTask(NativeModuleCallExceptionHandler p0){
       super();
       this.mExceptionHandler = p0;
    }
    public void GuardedResultAsyncTask(ReactContext p0){
       super(p0.getExceptionHandler());
    }
    public Object doInBackground(Object[] p0){
       return this.doInBackground(p0);
    }
    public final Object doInBackground(Void[] p0){
       p0 = PatchProxy.applyOneRefs(p0, this, GuardedResultAsyncTask.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       try{
          return this.doInBackgroundGuarded();
       }catch(java.lang.RuntimeException e3){
          this.mExceptionHandler.handleException(e3);
          throw e3;
       }
    }
    public abstract Object doInBackgroundGuarded();
    public final void onPostExecute(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GuardedResultAsyncTask.class, "2")) {
          return;
       }
       try{
          this.onPostExecuteGuarded(p0);
       }catch(java.lang.RuntimeException e3){
          this.mExceptionHandler.handleException(e3);
       }
       return;
    }
    public abstract void onPostExecuteGuarded(Object p0);
}
