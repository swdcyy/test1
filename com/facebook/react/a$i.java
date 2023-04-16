package com.facebook.react.a$i;
import java.lang.Runnable;
import com.facebook.react.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Process;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMarker;

public class a$i implements Runnable	// class@00117b
{
    public final a b;

    public void a$i(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$i.class, "1")) {
          return;
       }
       Process.setThreadPriority(0);
       ReactMarker.logMarker(ReactMarkerConstants.CHANGE_THREAD_PRIORITY, "js_default");
       return;
    }
}
