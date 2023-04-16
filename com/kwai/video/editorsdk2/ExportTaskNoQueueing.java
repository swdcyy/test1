package com.kwai.video.editorsdk2.ExportTaskNoQueueing;
import com.kwai.video.editorsdk2.ExportTask;
import android.content.Context;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;

public class ExportTaskNoQueueing extends ExportTask	// class@001c4e
{

    public void ExportTaskNoQueueing(Context p0,EditorSdk2V2$VideoEditorProject p1,String p2,EditorSdk2$ExportOptions p3){
       super(p0, p1, p2, p3);
    }
    public void ExportTaskNoQueueing(Context p0,EditorSdk2V2$VideoEditorProject p1,String p2,EditorSdk2$ExportOptions p3,long p4){
       super(p0, p1, p2, p3, p4);
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, ExportTaskNoQueueing.class, "2")) {
          return;
       }
       EditorSdkLogger.i("ExportTaskNoQueueing", "cancel called: "+this);
       this.b();
       return;
    }
    public void e(){
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, ExportTaskNoQueueing.class, "4")) {
          return;
       }
       EditorSdkLogger.i("ExportTaskNoQueueing", "resume called: "+this);
       this.d();
       return;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, ExportTaskNoQueueing.class, "1")) {
          return;
       }
       EditorSdkLogger.i("ExportTaskNoQueueing", "run called: "+this);
       this.a();
       return;
    }
    public void suspend(){
       if (PatchProxy.applyVoid(null, this, ExportTaskNoQueueing.class, "3")) {
          return;
       }
       EditorSdkLogger.i("ExportTaskNoQueueing", "suspend called: "+this);
       this.c();
       return;
    }
}
