package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaViewController;
import n93.a;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaViewController$a;
import nsd.u;
import vc3.l;
import java.util.List;
import vc3.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.viewcontroller.ViewController;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaViewController$onCreate$layoutCompletedListener$1;
import com.kuaishou.live.common.core.basic.widget.LiveOverflowHiddenLayoutManager;
import qrd.l1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaViewController$b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaAdapter;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;

public final class LiveLiteQuickInteractiveAreaViewController extends a	// class@000ac8
{
    public final l j;
    public final List k;
    public final f l;
    public static final LiveLiteQuickInteractiveAreaViewController$a m;

    static {
       LiveLiteQuickInteractiveAreaViewController.m = new LiveLiteQuickInteractiveAreaViewController$a(null);
    }
    public void LiveLiteQuickInteractiveAreaViewController(l p0,List p1,f p2){
       a.p(p0, "vcFactoryHolder");
       a.p(p1, "itemList");
       a.p(p2, "delegate");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteQuickInteractiveAreaViewController.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0c6d);
       RecyclerView recyclerView = this.P2().findViewById(R.id.live_lite_quick_interactive_area_recycler_view);
       a.o(recyclerView, "recyclerView");
       LiveOverflowHiddenLayoutManager liveOverflow = new LiveOverflowHiddenLayoutManager(0, 0);
       liveOverflow.a = new LiveLiteQuickInteractiveAreaViewController$onCreate$layoutCompletedListener$1(this, recyclerView);
       recyclerView.setLayoutManager(liveOverflow);
       recyclerView.addItemDecoration(new LiveLiteQuickInteractiveAreaViewController$b());
       LiveLiteQuickInteractiveAreaAdapter liveLiteQuic = new LiveLiteQuickInteractiveAreaAdapter(this, this.B2(), this.j, this.l);
       liveLiteQuic.O0(this.k);
       recyclerView.setAdapter(liveLiteQuic);
       return;
    }
    public int V2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteQuickInteractiveAreaViewController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(28.00f);
    }
}
