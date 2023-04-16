package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaViewController$b;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;

public final class LiveLiteQuickInteractiveAreaViewController$b extends RecyclerView$n	// class@000ac6
{

    public void LiveLiteQuickInteractiveAreaViewController$b(){
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveLiteQuickInteractiveAreaViewController$b.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       if (p2.getChildLayoutPosition(p1) > 0) {
          p0.set(a1.e(8.00f), 0, 0, 0);
       }
       return;
    }
}
