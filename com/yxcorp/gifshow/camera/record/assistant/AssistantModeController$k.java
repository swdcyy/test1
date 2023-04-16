package com.yxcorp.gifshow.camera.record.assistant.AssistantModeController$k;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.assistant.AssistantModeController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewParent;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;

public final class AssistantModeController$k implements Runnable	// class@001cf0
{
    public final AssistantModeController b;

    public void AssistantModeController$k(AssistantModeController p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AssistantModeController$k.class, "1")) {
          return;
       }
       AssistantModeController k = this.b.K;
       if (k != null) {
          ViewParent parent = k.getParent();
          if (parent != null) {
             parent.removeView(k);
          }
          this.b.K = null;
       }
       return;
    }
}
