package com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$c;
import android.view.View$OnLayoutChangeListener;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Runnable;
import android.os.Handler;

public class LiveAsrFloatEditorFragment$c implements View$OnLayoutChangeListener	// class@000a92
{
    public final LiveAsrFloatEditorFragment b;

    public void LiveAsrFloatEditorFragment$c(LiveAsrFloatEditorFragment p0){
       this.b = p0;
       super();
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(LiveAsrFloatEditorFragment$c.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, LiveAsrFloatEditorFragment$c.class, "1")) {
             return;
          }
       }
       LiveAsrFloatEditorFragment$c tb = this.b;
       tb.s1.removeCallbacks(tb.H1);
       tb = this.b;
       tb.s1.postDelayed(tb.H1, 20);
       return;
    }
}
