package com.yxcorp.gifshow.growth.unmute.UnmuteTipView$f;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class UnmuteTipView$f implements Runnable	// class@001590
{
    public int b;
    public final UnmuteTipView c;

    public void UnmuteTipView$f(UnmuteTipView p0){
       this.c = p0;
       super();
       this.b = 3;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, UnmuteTipView$f.class, "1")) {
          return;
       }
       this.c.L(this.b);
       return;
    }
}
