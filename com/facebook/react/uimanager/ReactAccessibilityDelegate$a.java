package com.facebook.react.uimanager.ReactAccessibilityDelegate$a;
import android.os.Handler;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public class ReactAccessibilityDelegate$a extends Handler	// class@00131f
{
    public final ReactAccessibilityDelegate a;

    public void ReactAccessibilityDelegate$a(ReactAccessibilityDelegate p0){
       this.a = p0;
       super();
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactAccessibilityDelegate$a.class, "1")) {
          return;
       }
       p0.obj.sendAccessibilityEvent(4);
       return;
    }
}
