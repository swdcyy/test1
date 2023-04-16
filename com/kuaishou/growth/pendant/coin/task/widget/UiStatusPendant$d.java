package com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant$d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.growth.pendant.coin.task.widget.UiStatusPendant;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ae0.b;

public final class UiStatusPendant$d extends m	// class@00062a
{
    public final UiStatusPendant c;

    public void UiStatusPendant$d(UiStatusPendant p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UiStatusPendant$d.class, "1")) {
          return;
       }
       a.p(p0, "view");
       UiStatusPendant t = this.c.t;
       if (t != null) {
          t.a(p0);
       }
       return;
    }
}
