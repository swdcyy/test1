package com.kwai.video.ksspark.NewSparkDownloadListenerJniImpl;
import com.kwai.video.ksspark.NewSparkDownloadListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;

public class NewSparkDownloadListenerJniImpl implements NewSparkDownloadListener	// class@000927
{
    public long nativeAddress;

    public void NewSparkDownloadListenerJniImpl(){
       super();
       this.nativeAddress = 0;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, NewSparkDownloadListenerJniImpl.class, "4")) {
          return;
       }
       _monitor_enter(this);
       NewSparkDownloadListenerJniImpl tnativeAddre = this.nativeAddress;
       if (tnativeAddre) {
          this.onNativeCancel(tnativeAddre);
          this.nativeAddress = 0;
       }
       _monitor_exit(this);
       return;
    }
    public void onFail(int p0,String p1){
       NewSparkDownloadListenerJniImpl newSparkDown = NewSparkDownloadListenerJniImpl.class;
       if (PatchProxy.isSupport(newSparkDown) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, newSparkDown, "3")) {
          return;
       }
       _monitor_enter(this);
       newSparkDown = this.nativeAddress;
       if (newSparkDown) {
          this.onNativeFail(newSparkDown, p0, p1);
          this.nativeAddress = 0;
       }
       _monitor_exit(this);
       return;
    }
    public native void onNativeCancel(long p0);
    public native void onNativeFail(long p0,int p1,String p2);
    public native void onNativeProgress(long p0,float p1);
    public native void onNativeStart(long p0,String p1);
    public native void onNativeSuccess(long p0,String p1);
    public void onProgress(float p0){
       NewSparkDownloadListenerJniImpl newSparkDown = NewSparkDownloadListenerJniImpl.class;
       if (PatchProxy.isSupport(newSparkDown) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, newSparkDown, "2")) {
          return;
       }
       _monitor_enter(this);
       newSparkDown = this.nativeAddress;
       if (newSparkDown) {
          this.onNativeProgress(newSparkDown, p0);
       }
       _monitor_exit(this);
       return;
    }
    public void onStart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewSparkDownloadListenerJniImpl.class, "1")) {
          return;
       }
       NewSparkDownloadListenerJniImpl tnativeAddre = this.nativeAddress;
       if (tnativeAddre) {
          this.onNativeStart(tnativeAddre, p0);
       }
       return;
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewSparkDownloadListenerJniImpl.class, "5")) {
          return;
       }
       _monitor_enter(this);
       NewSparkDownloadListenerJniImpl tnativeAddre = this.nativeAddress;
       if (tnativeAddre) {
          this.onNativeSuccess(tnativeAddre, p0);
          this.nativeAddress = 0;
       }
       _monitor_exit(this);
       return;
    }
}
