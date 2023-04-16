package com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantAdapter$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import xp5.i;
import ks5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import gv1.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import gv1.c;
import gv1.d;

public final class TempPlayPendantAdapter extends ViewControllerAdapter	// class@0016d4
{
    public final i j;
    public final i k;
    public static final TempPlayPendantAdapter$a l;

    static {
       TempPlayPendantAdapter.l = new TempPlayPendantAdapter$a(null);
    }
    public void TempPlayPendantAdapter(LifecycleOwner p0,Activity p1,i p2,i p3){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "liveLogPackageProvider");
       a.p(p3, "topPendantEnterAnimationService");
       super(p0, p1);
       this.j = p2;
       this.k = p3;
    }
    public int f0(int p0){
       TempPlayPendantAdapter tempPlayPend = TempPlayPendantAdapter.class;
       if (PatchProxy.isSupport(tempPlayPend)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, tempPlayPend, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.L0().get(p0) instanceof e;
    }
    public void u0(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TempPlayPendantAdapter.class, "2")) {
          return;
       }
       a.p(p0, "recyclerView");
       super.u0(p0);
       p0.getRecycledViewPool().k(1, 0);
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       c uoc;
       TempPlayPendantAdapter tempPlayPend = TempPlayPendantAdapter.class;
       if (PatchProxy.isSupport(tempPlayPend)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, tempPlayPend, "3");
          if (uoc != PatchProxyResult.class) {
          label_0058 :
             return uoc;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-2, -1));
       uFrameLayout.setClipChildren(false);
       if (p1) {
          c uoc1 = new c(uFrameLayout, this.N0(), this.K0(), this.j, this.k);
       }else {
          d uod = new d(uFrameLayout, this.N0(), this.K0());
       }
       uoc = false;
       goto label_0058 ;
    }
}
