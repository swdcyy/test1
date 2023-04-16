package com.kuaishou.live.core.basic.activity.e$a;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.kuaishou.live.core.basic.activity.e$b;

public class e$a implements Runnable	// class@001833
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       if (this.b.b.getActivity() != null) {
          e$a tb = this.b;
          tb.g(tb.b.getActivity());
       }
       return;
    }
}
