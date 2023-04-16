package com.yxcorp.gifshow.camera.record.widget.RecordInnerAnimView$c;
import android.view.ViewOutlineProvider;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;

public final class RecordInnerAnimView$c extends ViewOutlineProvider	// class@000fd5
{

    public void RecordInnerAnimView$c(){
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecordInnerAnimView$c.class, "1")) {
          return;
       }
       if (p0 != null && p1 != null) {
          p1.setOval(new Rect(0, 0, p0.getWidth(), p0.getHeight()));
       }
       return;
    }
}
