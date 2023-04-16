package com.kwai.video.clipkit.mv.ClipSparkAzerothHttpService$1;
import ca7.c;
import com.kwai.video.clipkit.mv.ClipSparkAzerothHttpService;
import com.kwai.video.ksspark.NewSparkHttpCallback;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.video.clipkit.KSClipLog;

public class ClipSparkAzerothHttpService$1 implements c	// class@001ab0
{
    public final ClipSparkAzerothHttpService this$0;
    public final NewSparkHttpCallback val$callback;

    public void ClipSparkAzerothHttpService$1(ClipSparkAzerothHttpService p0,NewSparkHttpCallback p1){
       this.this$0 = p0;
       this.val$callback = p1;
       super();
    }
    public void onFailure(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipSparkAzerothHttpService$1.class, "2")) {
          return;
       }
       KSClipLog.e("ClipSparkRecovery", "sendHttpRequest onFailure "+p0, p0);
       this.val$callback.onResponse(-1, p0.toString());
       return;
    }
    public void onSuccess(Object p0){
       this.onSuccess(p0);
    }
    public void onSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipSparkAzerothHttpService$1.class, "1")) {
          return;
       }
       KSClipLog.i("ClipSparkRecovery", "sendHttpRequest onSuccess data: "+p0);
       this.val$callback.onResponse(0, p0);
       return;
    }
}
