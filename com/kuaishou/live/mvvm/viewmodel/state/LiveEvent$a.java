package com.kuaishou.live.mvvm.viewmodel.state.LiveEvent$a;
import androidx.lifecycle.Observer;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class LiveEvent$a implements Observer	// class@000d17
{
    public final Observer b;
    public final a c;

    public void LiveEvent$a(Observer p0,a p1){
       a.p(p0, "observer");
       a.p(p1, "pending");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEvent$a.class, "1")) {
          return;
       }
       if (this.c.invoke().booleanValue()) {
          this.b.onChanged(p0);
       }
       return;
    }
}
