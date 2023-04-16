package com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$b;
import android.view.View$OnClickListener;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.social.r;
import kotlin.jvm.internal.a;
import zl0.a1;
import km9.a;
import com.kuaishou.lite.viewcontrollers.LiveLiteConversionTaskController$b$a;
import z1.a;

public final class LiveLiteConversionTaskController$b implements View$OnClickListener	// class@000946
{
    public final LiveLiteConversionTaskController b;

    public void LiveLiteConversionTaskController$b(LiveLiteConversionTaskController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteConversionTaskController$b.class, "1")) {
          return;
       }
       r i = this.b.V2().i;
       a.o(i, "mLiveBaseTaskController.mConversionTaskService");
       a1 uoa1 = i.pn();
       if (uoa1 != null) {
          this.b.V2().i.h7(uoa1.b, 2, new LiveLiteConversionTaskController$b$a(this));
       }
       return;
    }
}
