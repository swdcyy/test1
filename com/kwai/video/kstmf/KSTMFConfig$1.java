package com.kwai.video.kstmf.KSTMFConfig$1;
import com.kwai.plugin.dva.work.c$c;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.kstmf.KSTMFSoManager;
import com.kwai.video.kstmf.KSTMFConfig;
import java.lang.Integer;
import com.google.gson.JsonObject;
import java.lang.Number;
import java.lang.System;
import java.lang.Long;
import sj7.d;
import com.kwai.plugin.dva.install.PluginUrlManager;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.ClassLoader;
import dalvik.system.BaseDexClassLoader;

public final class KSTMFConfig$1 implements c$c	// class@000937
{
    public final long val$start;

    public void KSTMFConfig$1(long p0){
       this.val$start = p0;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSTMFConfig$1.class, "2")) {
          return;
       }
       KSTMFSoManager.getInstance().safeAddJsonProperty(KSTMFConfig.jsonObject, "dva_download_ffmpeg", Integer.valueOf(0));
       KSTMFSoManager.getInstance().safeAddJsonProperty(KSTMFConfig.jsonObject, "dva_download_cost", Long.valueOf((System.currentTimeMillis() - this.val$start)));
       KSTMFConfig.changeLoadState(4, -60008);
       KSTMFConfig.report();
       return;
    }
    public void onProgress(float p0){
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       this.onSucceed(p0);
    }
    public void onSucceed(String p0){
       int i2;
       if (PatchProxy.applyVoidOneRefs(p0, this, KSTMFConfig$1.class, "1")) {
          return;
       }
       int i = 0;
       int i1 = 3;
       if (TextUtils.isEmpty(PluginUrlManager.a.c("tmf_ffmpeg_full"))) {
          KSTMFConfig.changeLoadState(i1, i);
          return;
       }else {
          KSTMFSoManager.getInstance().safeAddJsonProperty(KSTMFConfig.jsonObject, "dva_download_ffmpeg", Integer.valueOf(1));
          KSTMFSoManager.getInstance().safeAddJsonProperty(KSTMFConfig.jsonObject, "dva_download_cost", Long.valueOf((System.currentTimeMillis() - this.val$start)));
          p0 = KSTMFConfig.class.getClassLoader().findLibrary("ffmpeg_full");
          KSTMFSoManager.getInstance().backupPluginSo(p0);
          if (KSTMFConfig.loadState != i1) {
             if (!TextUtils.isEmpty(p0)) {
                i2 = KSTMFSoManager.getInstance().loadFullFFmpeg(p0, 1);
                if (i2 < 0) {
                   i1 = 4;
                }
                KSTMFConfig.changeLoadState(i1, i2);
             }else {
                KSTMFConfig.changeLoadState(4, i);
                i2 = -60010;
             }
             KSTMFSoManager.getInstance().safeAddJsonProperty(KSTMFConfig.jsonObject, "dva_load_ffmpeg", Integer.valueOf(i2));
          }
          KSTMFConfig.report();
          return;
       }
    }
}
