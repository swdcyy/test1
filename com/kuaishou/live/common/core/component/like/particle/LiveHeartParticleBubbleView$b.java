package com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView$b;
import com.kuaishou.live.common.core.component.like.particle.LiveHeartParticleBubbleView$c;
import java.util.Random;
import java.lang.Object;
import android.util.SparseArray;

public class LiveHeartParticleBubbleView$b	// class@001470
{
    public final LiveHeartParticleBubbleView$c a;
    public final SparseArray b;
    public final Random c;

    public void LiveHeartParticleBubbleView$b(LiveHeartParticleBubbleView$c p0,Random p1){
       super();
       this.a = p0;
       this.c = p1;
       this.b = new SparseArray(p0.b());
    }
    public void LiveHeartParticleBubbleView$b(int[] p0,Random p1){
       super();
       this.a = new LiveHeartParticleBubbleView$c(p0);
       this.c = p1;
       this.b = new SparseArray(p0.length);
    }
}
