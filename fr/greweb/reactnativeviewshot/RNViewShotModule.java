package fr.greweb.reactnativeviewshot.RNViewShotModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import android.content.res.Resources;
import android.content.ContextWrapper;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;
import android.content.Context;
import java.io.File;
import android.app.Activity;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import fr.greweb.reactnativeviewshot.a;
import ze.q0;
import java.lang.StringBuilder;
import java.io.IOException;
import java.util.Map;
import java.util.Collections;
import com.facebook.react.bridge.BaseJavaModule;
import fr.greweb.reactnativeviewshot.RNViewShotModule$a;
import android.os.AsyncTask;
import java.lang.Void;
import java.util.concurrent.Executor;
import android.net.Uri;

public class RNViewShotModule extends ReactContextBaseJavaModule	// class@000e56
{
    public final ReactApplicationContext reactContext;

    public void RNViewShotModule(ReactApplicationContext p0){
       super(p0);
       this.reactContext = p0;
    }
    public void captureRef(int p0,ReadableMap p1,Promise p2){
       int i;
       RNViewShotModule rNViewShotMo = this;
       ReadableMap readableMap = p1;
       DisplayMetrics uDisplayMetr = c.c(this.getReactApplicationContext().getResources());
       String str = readableMap.getString("format");
       if (("jpg").equals(str)) {
          i = 0;
       }else if(("webm").equals(str)){
          i = 2;
       }else if(("raw").equals(str)){
          i = -1;
       }else {
          i = 1;
       }
       double doublex = readableMap.getDouble("quality");
       String str1 = "width";
       int i1 = 0;
       Integer integer = (readableMap.hasKey(str1))? Integer.valueOf((int)((double)uDisplayMetr.density * readableMap.getDouble(str1))): i1;
       Integer integer1 = (readableMap.hasKey("height"))? Integer.valueOf((int)((double)uDisplayMetr.density * readableMap.getDouble("height"))): i1;
       String str2 = readableMap.getString("result");
       Boolean uBoolean = Boolean.valueOf(readableMap.getBoolean("snapshotContentContainer"));
       File uFile = (("tmpfile").equals(str2))? rNViewShotMo.createTempFile(this.getReactApplicationContext(), str): i1;
       a uoa = new a(p0, str, i, doublex, integer, integer1, uFile, str2, uBoolean, rNViewShotMo.reactContext, this.getCurrentActivity(), p2);
       rNViewShotMo.reactContext.getNativeModule(UIManagerModule.class).addUIBlock(uDisplayMetr);
       return;
    }
    public void captureScreen(ReadableMap p0,Promise p1){
       this.captureRef(-1, p0, p1);
    }
    public final File createTempFile(Context p0,String p1){
       File externalCach = p0.getExternalCacheDir();
       File cacheDir = p0.getCacheDir();
       if (externalCach == null && cacheDir == null) {
          throw new IOException("No cache directory available");
       }
       if (externalCach == null || (cacheDir != null && externalCach.getFreeSpace() - cacheDir.getFreeSpace() <= 0)) {
          externalCach = cacheDir;
       }
       return File.createTempFile("ReactNative-snapshot-image", "."+p1, externalCach);
    }
    public Map getConstants(){
       return Collections.emptyMap();
    }
    public String getName(){
       return "RNViewShot";
    }
    public void onCatalystInstanceDestroy(){
       super.onCatalystInstanceDestroy();
       Void[] voidArray = new Void[0];
       new RNViewShotModule$a(this.getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
    }
    public void releaseCapture(String p0){
       p0 = Uri.parse(p0).getPath();
       if (p0 == null) {
          return;
       }
       File uFile = new File(p0);
       if (!uFile.exists()) {
          return;
       }
       File parentFile = uFile.getParentFile();
       if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
          uFile.delete();
       }
       return;
    }
}
