package com.frog.engine.download.DownloadAndroidManager;
import java.lang.Object;
import com.frog.engine.network.FrogOkHttpManager;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import java.io.Closeable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.Flushable;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.frog.engine.internal.FrogLog;
import java.lang.CharSequence;
import android.text.TextUtils;
import pg.a;
import java.lang.Runnable;
import com.frog.engine.view.FrogRender;
import okhttp3.Request$Builder;
import okhttp3.Request;
import okhttp3.Call;
import com.frog.engine.download.DownloadAndroidManager$a;
import okhttp3.Callback;
import com.kwai.robust.PatchProxyResult;

public class DownloadAndroidManager	// class@0014ff
{
    public OkHttpClient mClient;
    public static DownloadAndroidManager sInstance;
    public static String uniqueRenderId;

    public void DownloadAndroidManager(){
       super();
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       this.mClient = FrogOkHttpManager.getInstance().getBuilder().connectTimeout(6000, mILLISECONDS).readTimeout(0x4e20, mILLISECONDS).writeTimeout(0x4e20, mILLISECONDS).build();
    }
    public static void closeQuietly(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DownloadAndroidManager.class, "3")) {
          return;
       }
       try{
          if (p0 != null) {
             if (p0 instanceof Flushable) {
                try{
                   p0.flush();
                }catch(java.lang.Exception e0){
                }
             }
             p0.close();
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static void createCoTask(String p0,int p1,int p2,String p3,String p4,String p5){
       DownloadAndroidManager uDownloadAnd = DownloadAndroidManager.class;
       if (PatchProxy.isSupport(uDownloadAnd)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, uDownloadAnd, "2")) {
             return;
          }
       }
       FrogLog.d("frog_download_android", "Java with createCoTask: id= "+p1+"  task"+p2+" url"+p3+"  storagePath"+p4+"  uniqueRenderId"+p0);
       if (TextUtils.isEmpty(p3)) {
          FrogRender.postGLRunnable(p0, new a(p1, p2));
          return;
       }else {
          DownloadAndroidManager.uniqueRenderId = p0;
          DownloadAndroidManager$a uoa = new DownloadAndroidManager$a(p0, p1, p2, p4, p3);
          DownloadAndroidManager.getInstance().mClient.newCall(new Request$Builder().url(p3).build()).enqueue(v6);
          return;
       }
    }
    public static DownloadAndroidManager getInstance(){
       DownloadAndroidManager uDownloadAnd = DownloadAndroidManager.class;
       Object obj = PatchProxy.apply(null, null, uDownloadAnd, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (DownloadAndroidManager.sInstance == null) {
          _monitor_enter(uDownloadAnd);
          if (DownloadAndroidManager.sInstance == null) {
             DownloadAndroidManager.sInstance = new DownloadAndroidManager();
          }
          _monitor_exit(uDownloadAnd);
       }
       return DownloadAndroidManager.sInstance;
    }
    public static void lambda$createCoTask$0(int p0,int p1){
       DownloadAndroidManager.nativeOnFinish(p0, p1, 0x2712, "Download Fail Url Or Path empty", null);
    }
    public static native void nativeOnFinish(int p0,int p1,int p2,String p3,byte[] p4);
    public static native void nativeOnProgress(int p0,int p1,long p2,long p3,long p4);
}
