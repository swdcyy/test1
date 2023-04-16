package com.kuaishou.live.audience.course.e$b;
import java.lang.Runnable;
import com.kuaishou.live.audience.course.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import android.os.Handler;

public class e$b implements Runnable	// class@000bfe
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "1")) {
          return;
       }
       e$b tb = this.b;
       if ((SystemClock.elapsedRealtime() - tb.z) - tb.A > 0) {
          tb.X8();
       }else {
          tb.D.postDelayed(this, 0x2710);
       }
       return;
    }
}
