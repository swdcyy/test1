package com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView$b;
import java.lang.Runnable;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView;
import java.lang.Object;
import com.kwai.emotionsdk.widget.EmotionLongClickRecyclerView$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class EmotionLongClickRecyclerView$b implements Runnable	// class@000dbc
{
    public int b;
    public final EmotionLongClickRecyclerView c;

    public void EmotionLongClickRecyclerView$b(EmotionLongClickRecyclerView p0){
       this.c = p0;
       super();
    }
    public void EmotionLongClickRecyclerView$b(EmotionLongClickRecyclerView p0,EmotionLongClickRecyclerView$a p1){
       super(p0);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, EmotionLongClickRecyclerView$b.class, "1")) {
          return;
       }
       EmotionLongClickRecyclerView$b tc = this.c;
       tc.j = true;
       tc.y(this.b);
       return;
    }
}
