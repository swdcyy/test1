package com.yxcorp.gifshow.widget.record.ArcScaleView$b;
import android.os.Handler;
import com.yxcorp.gifshow.widget.record.ArcScaleView;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.record.ArcScaleView$a;

public class ArcScaleView$b extends Handler	// class@0019ab
{
    public final ArcScaleView a;

    public void ArcScaleView$b(ArcScaleView p0){
       this.a = p0;
       super(Looper.getMainLooper());
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ArcScaleView$b.class, "1")) {
          return;
       }
       if (p0.what == 1) {
          ArcScaleView w0 = this.a.W0;
          if (w0 != null) {
             w0.a();
          }
       }
       return;
    }
}
