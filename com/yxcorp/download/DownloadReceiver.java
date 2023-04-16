package com.yxcorp.download.DownloadReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import java.lang.String;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import android.content.pm.ApplicationInfo;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import java.lang.Exception;
import android.content.IntentFilter;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.yxcorp.download.DownloadManager;
import nu8.a;
import ekd.e0;

public class DownloadReceiver extends BroadcastReceiver	// class@0011aa
{
    public static boolean a;

    public void DownloadReceiver(){
       super();
    }
    public static Intent a(Context p0,int p1,String p2){
       IntentFilter obj;
       Intent intent;
       if (PatchProxy.isSupport(DownloadReceiver.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, DownloadReceiver.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!DownloadReceiver.a) {
          int i = 26;
          if (SystemUtil.a(i)) {
             String str = null;
             if (p0 != null) {
                try{
                   ApplicationInfo uApplication = p0.getApplicationInfo();
                   if (uApplication != null) {
                      uApplication = uApplication.targetSdkVersion;
                   label_004a :
                      if (uApplication >= i) {
                         str = 1;
                      }
                      if (str && SystemUtil.L(p0)) {
                         obj = new IntentFilter();
                         obj.addAction("download.intent.action.DOWNLOAD_PAUSE");
                         obj.addAction("download.intent.action.DOWNLOAD_RESUME");
                         obj.addAction("download.intent.action.DOWNLOAD_CANCEL");
                         UniversalReceiver.e(p0.getApplicationContext(), new DownloadReceiver(), obj);
                      }
                   }else {
                      uApplication = b.d(p0.getPackageName(), str);
                      if (uApplication != null) {
                         uApplication = uApplication.targetSdkVersion;
                         goto label_004a ;
                      }
                   }
                }catch(java.lang.Exception e3){
                   e3.printStackTrace();
                }
             }
          }
       label_0075 :
          DownloadReceiver.a = true;
       }
       intent = new Intent(p2);
       intent.setClass(p0, DownloadReceiver.class);
       intent.putExtra("download.intent.action.EXTRA_TASK_ID", p1);
       return intent;
    }
    public static Intent b(Context p0,int p1){
       if (PatchProxy.isSupport(DownloadReceiver.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, DownloadReceiver.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return DownloadReceiver.a(p0, p1, "download.intent.action.DOWNLOAD_PAUSE");
    }
    public static Intent c(Context p0,int p1){
       if (PatchProxy.isSupport(DownloadReceiver.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, DownloadReceiver.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return DownloadReceiver.a(p0, p1, "download.intent.action.DOWNLOAD_RESUME");
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DownloadReceiver.class, "5")) {
          return;
       }
       if (("download.intent.action.DOWNLOAD_PAUSE").equals(p1.getAction())) {
          DownloadManager.n().z(p1.getIntExtra("download.intent.action.EXTRA_TASK_ID", 0));
       }else if(("download.intent.action.DOWNLOAD_RESUME").equals(p1.getAction())){
          DownloadManager.n().D(p1.getIntExtra("download.intent.action.EXTRA_TASK_ID", 0));
       }else if(("download.intent.action.DOWNLOAD_CANCEL").equals(p1.getAction())){
          DownloadManager.n().c(p1.getIntExtra("download.intent.action.EXTRA_TASK_ID", 0));
          a.b().a(p1.getIntExtra("download.intent.action.EXTRA_TASK_ID", 0));
       }
       return;
    }
}
