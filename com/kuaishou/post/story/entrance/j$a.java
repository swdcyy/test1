package com.kuaishou.post.story.entrance.j$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.kuaishou.post.story.entrance.j;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;

public class j$a extends DecorationContainerView$e	// class@000b3c
{
    public final j a;

    public void j$a(j p0){
       this.a = p0;
       super();
    }
    public void v(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
       }else {
          super.v(p0);
          j$a ta = this.a;
          if ((SystemClock.elapsedRealtime() - ta.p) - 1000 > 0) {
             ta.p = SystemClock.elapsedRealtime();
             if (p0.getDecorationType() == 1) {
                this.a.P8(p0);
             }
          }
       }
       return;
    }
}
