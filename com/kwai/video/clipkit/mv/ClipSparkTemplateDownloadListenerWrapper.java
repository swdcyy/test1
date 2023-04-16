package com.kwai.video.clipkit.mv.ClipSparkTemplateDownloadListenerWrapper;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadListener;
import com.kwai.video.ksspark.NewSparkDownloadListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.clipkit.KSClipLog;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Float;

public class ClipSparkTemplateDownloadListenerWrapper implements ClipTemplateDownloadListener	// class@001ab4
{
    public final NewSparkDownloadListener mListener;

    public void ClipSparkTemplateDownloadListenerWrapper(NewSparkDownloadListener p0){
       super();
       this.mListener = p0;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, ClipSparkTemplateDownloadListenerWrapper.class, "4")) {
          return;
       }
       KSClipLog.i("ClipSparkRecovery", "DownloadListenerWrapper onCancel");
       ClipSparkTemplateDownloadListenerWrapper tmListener = this.mListener;
       if (tmListener == null) {
          KSClipLog.e("ClipSparkRecovery", "DownloadListenerWrapper onCancel error, listener null");
          return;
       }else {
          tmListener.onCancel();
          return;
       }
    }
    public void onFail(int p0,String p1){
       ClipSparkTemplateDownloadListenerWrapper uClipSparkTe = ClipSparkTemplateDownloadListenerWrapper.class;
       if (PatchProxy.isSupport(uClipSparkTe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uClipSparkTe, "3")) {
          return;
       }
       KSClipLog.e("ClipSparkRecovery", "DownloadListenerWrapper onFail code "+p0+", msg "+p1);
       uClipSparkTe = this.mListener;
       if (uClipSparkTe == null) {
          KSClipLog.e("ClipSparkRecovery", "DownloadListenerWrapper onFail error, listener null");
          return;
       }else {
          uClipSparkTe.onFail(p0, p1);
          return;
       }
    }
    public void onProgress(float p0){
       ClipSparkTemplateDownloadListenerWrapper uClipSparkTe = ClipSparkTemplateDownloadListenerWrapper.class;
       if (PatchProxy.isSupport(uClipSparkTe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uClipSparkTe, "2")) {
          return;
       }
       KSClipLog.d("ClipSparkRecovery", "DownloadListenerWrapper onProgress "+p0);
       uClipSparkTe = this.mListener;
       if (uClipSparkTe == null) {
          KSClipLog.e("ClipSparkRecovery", "DownloadListenerWrapper onProgress error, listener null");
          return;
       }else {
          uClipSparkTe.onProgress(p0);
          return;
       }
    }
    public void onStart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipSparkTemplateDownloadListenerWrapper.class, "1")) {
          return;
       }
       KSClipLog.i("ClipSparkRecovery", "DownloadListenerWrapper onStart id "+p0);
       ClipSparkTemplateDownloadListenerWrapper tmListener = this.mListener;
       if (tmListener == null) {
          KSClipLog.e("ClipSparkRecovery", "DownloadListenerWrapper onStart error, listener null");
          return;
       }else {
          tmListener.onStart(p0);
          return;
       }
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipSparkTemplateDownloadListenerWrapper.class, "5")) {
          return;
       }
       KSClipLog.i("ClipSparkRecovery", "DownloadListenerWrapper onSuccess savePath "+p0);
       ClipSparkTemplateDownloadListenerWrapper tmListener = this.mListener;
       if (tmListener == null) {
          KSClipLog.e("ClipSparkRecovery", "DownloadListenerWrapper onSuccess error, listener null");
          return;
       }else {
          tmListener.onSuccess(p0);
          return;
       }
    }
}
