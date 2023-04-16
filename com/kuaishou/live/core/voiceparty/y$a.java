package com.kuaishou.live.core.voiceparty.y$a;
import fw8.b;
import com.kuaishou.live.core.voiceparty.y;
import android.app.Activity;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.utils.e;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;

public class y$a extends b	// class@001ae3
{
    public final y b;

    public void y$a(y p0){
       this.b = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, y$a.class, "1")) {
          return;
       }
       if (!e.s(p0) && !p0 instanceof LivePlayActivity) {
          return;
       }
       this.b.a9(true);
       return;
    }
}
