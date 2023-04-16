package com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class GzonePagerSlidingTabStrip$a implements Runnable	// class@001857
{
    public final GzonePagerSlidingTabStrip b;

    public void GzonePagerSlidingTabStrip$a(GzonePagerSlidingTabStrip p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, GzonePagerSlidingTabStrip$a.class, "1")) {
          return;
       }
       GzonePagerSlidingTabStrip$a tb = this.b;
       GzonePagerSlidingTabStrip g1 = tb.G1;
       if (g1 >= null) {
          tb.t(g1, 0);
       }
       return;
    }
}
