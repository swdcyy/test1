package com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardLineAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import com.kuaishou.live.core.show.benefitcard.model.LiveBenefitCardElement;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import com.kuaishou.live.common.core.basic.widget.LiveShrinkableFrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardLineAdapter$a;

public final class LiveLiteBenefitCardLineAdapter extends ViewControllerAdapter	// class@001e98
{

    public void LiveLiteBenefitCardLineAdapter(LifecycleOwner p0,Activity p1){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       super(p0, p1);
    }
    public int f0(int p0){
       LiveLiteBenefitCardLineAdapter liveLiteBene = LiveLiteBenefitCardLineAdapter.class;
       if (PatchProxy.isSupport(liveLiteBene)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveLiteBene, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.L0().get(p0).mItemType;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBenefitCardLineAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.L0().size();
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveLiteBenefitCardLineAdapter$a uoa;
       LiveLiteBenefitCardLineAdapter liveLiteBene = LiveLiteBenefitCardLineAdapter.class;
       if (PatchProxy.isSupport(liveLiteBene)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveLiteBene, "1");
          if (uoa != PatchProxyResult.class) {
          label_0047 :
             return uoa;
          }
       }
       a.p(p0, "parent");
       LiveShrinkableFrameLayout liveShrinkab = new LiveShrinkableFrameLayout(this.K0(), null, 0, 6, null);
       p0.setLayoutParams(new ViewGroup$LayoutParams(-2, -1));
       p0.setClipChildren(false);
       uoa = new LiveLiteBenefitCardLineAdapter$a(p0, this.N0(), this.K0(), p1);
       goto label_0047 ;
    }
}
