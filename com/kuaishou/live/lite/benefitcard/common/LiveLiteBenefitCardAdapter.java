package com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Integer;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.lite.benefitcard.common.LiveLiteBenefitCardAdapter$a;

public final class LiveLiteBenefitCardAdapter extends ViewControllerAdapter	// class@001e92
{

    public void LiveLiteBenefitCardAdapter(LifecycleOwner p0,Activity p1){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       super(p0, p1);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBenefitCardAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.L0().size();
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       LiveLiteBenefitCardAdapter$a uoa;
       LiveLiteBenefitCardAdapter liveLiteBene = LiveLiteBenefitCardAdapter.class;
       if (PatchProxy.isSupport(liveLiteBene)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, liveLiteBene, "1");
          if (uoa != PatchProxyResult.class) {
          label_0042 :
             return uoa;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(this.K0());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
       uFrameLayout.setClipChildren(false);
       uoa = new LiveLiteBenefitCardAdapter$a(uFrameLayout, this.N0(), this.K0());
       goto label_0042 ;
    }
}
