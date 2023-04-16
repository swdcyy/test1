package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$w;
import android.view.ViewOutlineProvider;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;

public final class LiveCoverAnnexHelper$w extends ViewOutlineProvider	// class@0010e0
{

    public void LiveCoverAnnexHelper$w(){
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCoverAnnexHelper$w.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "outline");
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), (float)a1.e(4.00f));
       return;
    }
}
