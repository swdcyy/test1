package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import vc3.l;
import vc3.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import vc3.c;
import java.lang.Enum;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveAreaAdapter$a;

public final class LiveLiteQuickInteractiveAreaAdapter extends ViewControllerAdapter	// class@000ac2
{
    public final l j;
    public final f k;

    public void LiveLiteQuickInteractiveAreaAdapter(LifecycleOwner p0,Activity p1,l p2,f p3){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "vcFactoryHolder");
       a.p(p3, "delegate");
       super(p0, p1);
       this.j = p2;
       this.k = p3;
    }
    public int f0(int p0){
       LiveLiteQuickInteractiveAreaAdapter liveLiteQuic = LiveLiteQuickInteractiveAreaAdapter.class;
       if (PatchProxy.isSupport(liveLiteQuic)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveLiteQuic, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.L0().get(p0).b.ordinal();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LiveLiteQuickInteractiveAreaAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.L0().size();
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveLiteQuickInteractiveAreaAdapter liveLiteQuic = LiveLiteQuickInteractiveAreaAdapter.class;
       if (PatchProxy.isSupport(liveLiteQuic)) {
          LiveLiteQuickInteractiveAreaAdapter$a uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveLiteQuic, "1");
          if (uoa != PatchProxyResult.class) {
          label_0041 :
             return uoa;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-2, -1));
       LiveLiteQuickInteractiveAreaAdapter$a uoa1 = new LiveLiteQuickInteractiveAreaAdapter$a(this, uFrameLayout, this.N0(), this.K0(), p1);
       goto label_0041 ;
    }
}
