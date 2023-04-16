package com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant$f;
import java.lang.Runnable;
import com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant$a;
import android.widget.FrameLayout;
import java.lang.Boolean;

public final class UiStatusPendant$f implements Runnable	// class@00062c
{
    public final UiStatusPendant b;

    public void UiStatusPendant$f(UiStatusPendant p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, UiStatusPendant$f.class, "1")) {
          return;
       }
       UiStatusPendant.z.a().put(String.valueOf(this.b.hashCode()), Boolean.TRUE);
       return;
    }
}
