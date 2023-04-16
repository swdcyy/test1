package com.kuaishou.commercial.tach.component.TKMeasuredView$b;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.component.TKMeasuredView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKMeasuredView$b implements Runnable	// class@00165e
{
    public final TKMeasuredView b;

    public void TKMeasuredView$b(TKMeasuredView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKMeasuredView$b.class, "1")) {
          return;
       }
       this.b.destroyOnUIThread();
       return;
    }
}
