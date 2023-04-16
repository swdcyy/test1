package com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView$c;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;

public class LiveKtvReverbEffectView$c extends RecyclerView$n	// class@0016b1
{
    public final LiveKtvReverbEffectView a;

    public void LiveKtvReverbEffectView$c(LiveKtvReverbEffectView p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveKtvReverbEffectView$c.class, "1")) {
          return;
       }
       super.c(p0, p1, p2, p3);
       int childLayoutP = p2.getChildLayoutPosition(p1);
       int i = childLayoutP / 4;
       childLayoutP = childLayoutP % 4;
       LiveKtvReverbEffectView f = this.a.f;
       int i1 = ((a1.h() - (f * 2)) - (a1.e(50.00f) * 4)) / 3;
       if (!childLayoutP) {
          p0.left = f;
          p0.right = i1 / 2;
       }else if(childLayoutP == 3){
          p0.left = i1 / 2;
          p0.right = f;
       }else {
          i1 = i1 / 2;
          p0.left = i1;
          p0.right = i1;
       }
       p0.top = (!i)? 0: this.a.g;
       return;
    }
}
