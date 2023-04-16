package com.kwai.video.kstmf.KSTMFSoManager$1;
import java.lang.Runnable;
import com.kwai.video.kstmf.KSTMFSoManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import java.lang.ClassLoader;
import dalvik.system.BaseDexClassLoader;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kwai.video.kstmf.KSTMFLogReporter;

public class KSTMFSoManager$1 implements Runnable	// class@000940
{
    public final KSTMFSoManager this$0;

    public void KSTMFSoManager$1(KSTMFSoManager p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       JsonObject jsonObject;
       int i;
       if (PatchProxy.applyVoid(null, this, KSTMFSoManager$1.class, "1")) {
          return;
       }
       KSTMFSoManager$1 tthis$0 = this.this$0;
       if (tthis$0.mContext == null) {
          return;
       }
       if (tthis$0.mTmfEnableBackupApkFFmpeg != null) {
          try{
             jsonObject = new JsonObject();
             i = this.this$0.startBackupFFmpeg(KSTMFSoManager.class.getClassLoader().findLibrary("ffmpeg"), jsonObject);
          }catch(java.lang.Exception e1){
             e1.getMessage();
             i = -60005;
          }
          this.this$0.safeAddJsonProperty(jsonObject, "backup_ret", Integer.valueOf(i));
          JsonObject jsonObject1 = new JsonObject();
          jsonObject1.c0("apk_backup", this.this$0.safeGetJsonString(jsonObject));
          KSTMFLogReporter.report(jsonObject1.toString());
       }
       return;
    }
}
