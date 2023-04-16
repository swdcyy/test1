package com.kwai.video.player.loader.PlayerLoaderSdcardImpl;
import com.kwai.video.player.PlayerLibraryLoader$DvaLoader;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.io.File;
import com.kwai.video.player.loader.PlayerLibrary;
import com.kwai.video.player.PlayerLibraryLoader$DvaListener;
import com.kwai.video.player.loader.PlayerLoaderSdcardImpl$1;
import com.kwai.video.player.KsSoLoader;
import android.os.Environment;
import java.lang.StringBuilder;
import com.kwai.video.player.kwai_player.FileUtils;
import java.lang.Exception;
import com.kwai.video.player.PlayerLibraryLoader;

public class PlayerLoaderSdcardImpl implements PlayerLibraryLoader$DvaLoader	// class@000b5a
{
    public File appJniLibs;
    public final boolean fakeDva;

    public void PlayerLoaderSdcardImpl(){
       super();
       this.fakeDva = false;
    }
    public void PlayerLoaderSdcardImpl(boolean p0){
       super();
       this.fakeDva = p0;
    }
    public boolean init(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlayerLoaderSdcardImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       File dir = p0.getDir("jniLibs", i);
       this.appJniLibs = dir;
       if (dir != null) {
          i = true;
       }
       return i;
    }
    public void load(PlayerLibrary p0,PlayerLibraryLoader$DvaListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlayerLoaderSdcardImpl.class, "2")) {
          return;
       }
       if (this.appJniLibs == null) {
          p1.onLoadFailed(p0.getDvaName(), "appJniLibs is null");
          return;
       }else {
          p0.tryLoadLibrarySdcard(new PlayerLoaderSdcardImpl$1(this, p1, p0));
          return;
       }
    }
    public String loadSoFromSdcard(File p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, PlayerLoaderSdcardImpl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!(Environment.getExternalStorageState()).equals("mounted")) {
          return null;
       }
       obj = Environment.getExternalStorageDirectory().toString();
       String str = "/";
       if (!obj.endsWith(str)) {
          obj = obj+str;
       }
       try{
          p1 = "lib"+p1+".so";
          File uFile = new File(obj, p1);
          this.log("try load so from sdcard: "+uFile.getAbsolutePath());
          File uFile1 = new File(p0, p1);
          if (uFile.exists() && !FileUtils.copyTo(uFile1, uFile)) {
             return uFile1.getAbsolutePath();
          }
       }catch(java.lang.Exception e5){
          this.log("try load so from sdcard failed, "+e5);
          e5.printStackTrace();
       }
    label_009d :
       return null;
    }
    public void log(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayerLoaderSdcardImpl.class, "3")) {
          return;
       }
       PlayerLibraryLoader.getInstance().log("[sdcard] "+p0);
       return;
    }
    public void setPriority(String p0,String p1){
    }
    public boolean shouldLoadSo(){
       return false;
    }
}
