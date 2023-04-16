package com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainDataBinding$a;
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

public final class LiveHotSpotDetailExplainDataBinding$a extends RecyclerView$n	// class@001398
{
    public int a;

    public void LiveHotSpotDetailExplainDataBinding$a(){
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveHotSpotDetailExplainDataBinding$a.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       if (p2.getChildLayoutPosition(p1) >= this.a) {
          p0.set(0, 0, a1.d(R.dimen.arg_RES_7f070295), 0);
       }else {
          p0.set(0, 0, a1.d(R.dimen.arg_RES_7f070295), a1.d(R.dimen.arg_RES_7f07031b));
       }
       return;
    }
}
