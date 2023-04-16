package com.kuaishou.ark.rtx.widget.scrollview.view.VScrollerView$a;
import android.os.Handler;
import com.kuaishou.ark.rtx.widget.scrollview.view.VScrollerView;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class VScrollerView$a extends Handler	// class@000fa3
{
    public WeakReference a;

    public void VScrollerView$a(VScrollerView p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VScrollerView$a.class, "1")) {
          return;
       }
       if (p0.what == 1) {
          this.a.get().l();
       }
       return;
    }
}
