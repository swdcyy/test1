package com.kwai.video.ksmemorykit.EditorMemoryTask$1;
import com.kwai.kve.ProgressCallback;
import com.kwai.video.ksmemorykit.EditorMemoryTask;
import com.kwai.video.ksmemorykit.EditorMemoryListener;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import tv7.f;
import java.lang.Runnable;
import android.os.Handler;

public class EditorMemoryTask$1 implements ProgressCallback	// class@0008f2
{
    public final EditorMemoryTask this$0;
    public final EditorMemoryListener val$listener;
    public final EditorMemoryTask val$thisObject;

    public void EditorMemoryTask$1(EditorMemoryTask p0,EditorMemoryListener p1,EditorMemoryTask p2){
       this.this$0 = p0;
       this.val$listener = p1;
       this.val$thisObject = p2;
       super();
    }
    public static void lambda$update$0(EditorMemoryListener p0,EditorMemoryTask p1,float p2){
       if (p0 != null) {
          p0.onProgress(p1, (double)p2);
       }
       return;
    }
    public void update(float p0,String p1){
       EditorMemoryTask$1 u1 = EditorMemoryTask$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, u1, "1")) {
          return;
       }
       EditorMemoryTask mLock = this.this$0.mLock;
       _monitor_enter(mLock);
       this.this$0.mMainHandler.post(new f(this.val$listener, this.val$thisObject, p0));
       _monitor_exit(mLock);
       return;
    }
}
