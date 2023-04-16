package com.facebook.react.bridge.CatalystInstanceImpl$NativeExceptionHandler;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.CatalystInstanceImpl;
import java.lang.Object;
import yd.e;
import java.lang.ref.WeakReference;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class CatalystInstanceImpl$NativeExceptionHandler implements QueueThreadExceptionHandler	// class@0011b1
{
    public CatalystInstanceImpl mCatalystInstanceImpl;
    public WeakReference mCatalystInstanceImplWeak;

    public void CatalystInstanceImpl$NativeExceptionHandler(CatalystInstanceImpl p0){
       super();
       this.mCatalystInstanceImplWeak = (e.N)? new WeakReference(p0): p0;
       return;
    }
    public void handleException(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CatalystInstanceImpl$NativeExceptionHandler.class, "1")) {
          return;
       }
       if (e.N) {
          CatalystInstanceImpl uCatalystIns = this.mCatalystInstanceImplWeak.get();
          if (uCatalystIns != null) {
             uCatalystIns.onNativeException(p0);
          }
       }else {
          this.mCatalystInstanceImpl.onNativeException(p0);
       }
       return;
    }
}
