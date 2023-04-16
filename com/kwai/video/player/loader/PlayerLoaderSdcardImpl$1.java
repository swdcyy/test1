package com.kwai.video.player.loader.PlayerLoaderSdcardImpl$1;
import com.kwai.video.player.KsSoLoader;
import com.kwai.video.player.loader.PlayerLoaderSdcardImpl;
import com.kwai.video.player.PlayerLibraryLoader$DvaListener;
import com.kwai.video.player.loader.PlayerLibrary;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import java.lang.Error;
import java.lang.Exception;

public class PlayerLoaderSdcardImpl$1 implements KsSoLoader	// class@000b59
{
    public final PlayerLoaderSdcardImpl this$0;
    public final PlayerLibrary val$library;
    public final PlayerLibraryLoader$DvaListener val$listener;

    public void PlayerLoaderSdcardImpl$1(PlayerLoaderSdcardImpl p0,PlayerLibraryLoader$DvaListener p1,PlayerLibrary p2){
       this.this$0 = p0;
       this.val$listener = p1;
       this.val$library = p2;
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLoaderSdcardImpl$1.class, "1")) {
          return;
       }
       if (this.this$0.fakeDva != null) {
          p0 = p0+"_dva";
       }
       PlayerLoaderSdcardImpl$1 tthis$0 = this.this$0;
       p0 = tthis$0.loadSoFromSdcard(tthis$0.appJniLibs, p0);
       if (!TextUtils.isEmpty(p0)) {
          int i = 0;
          if (this.this$0.fakeDva != null) {
             this.val$listener.onWillLoad(this.val$library.getDvaName(), i);
          }
          try{
             System.load(p0);
             this.val$listener.onLoadSuccess(this.val$library.getDvaName(), i);
          }catch(java.lang.Exception e5){
             this.val$listener.onLoadFailed(this.val$library.getDvaName(), "sdcard load failed!:"+e5.toString());
          }catch(java.lang.Error e5){
             this.val$listener.onLoadFailed(this.val$library.getDvaName(), "sdcard load failed! error£º"+e5.toString());
          }
       }else {
          this.val$listener.onLoadFailed(this.val$library.getDvaName(), "sdcard load failed! can not find file.");
       }
    }
}
