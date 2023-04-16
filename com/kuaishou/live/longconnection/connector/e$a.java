package com.kuaishou.live.longconnection.connector.e$a;
import erd.g;
import com.kuaishou.live.longconnection.connector.e;
import com.kuaishou.android.live.model.Round;
import java.lang.Object;
import com.kuaishou.live.longconnection.horserace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;

public class e$a implements g	// class@000c60
{
    public final Round b;
    public final e c;

    public void e$a(e p0,Round p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
       }else if(this.c.g == null){
          e$a tb = this.b;
          p0.mCost = SystemClock.elapsedRealtime() - tb.mStartRealTime;
          tb.mSuccess = true;
       }
       return;
    }
}
