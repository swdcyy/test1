package com.kwai.video.kstmf.KSTMFSoManager$2;
import java.lang.Runnable;
import com.kwai.video.kstmf.KSTMFSoManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.JsonObject;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kwai.video.kstmf.KSTMFLogReporter;

public class KSTMFSoManager$2 implements Runnable	// class@000941
{
    public final KSTMFSoManager this$0;
    public final String val$soPath;

    public void KSTMFSoManager$2(KSTMFSoManager p0,String p1){
       this.this$0 = p0;
       this.val$soPath = p1;
       super();
    }
    public void run(){
       JsonObject jsonObject;
       int i;
       if (PatchProxy.applyVoid(null, this, KSTMFSoManager$2.class, "1")) {
          return;
       }
       try{
          jsonObject = new JsonObject();
          i = this.this$0.startBackupFFmpeg(this.val$soPath, jsonObject);
       }catch(java.lang.Exception e1){
          e1.getMessage();
          i = -60006;
       }
       this.this$0.safeAddJsonProperty(jsonObject, "backup_ret", Integer.valueOf(i));
       JsonObject jsonObject1 = new JsonObject();
       jsonObject1.c0("plugin_backup", this.this$0.safeGetJsonString(jsonObject));
       KSTMFLogReporter.report(jsonObject1.toString());
       return;
    }
}
