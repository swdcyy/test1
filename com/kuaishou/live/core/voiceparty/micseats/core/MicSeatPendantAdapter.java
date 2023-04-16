package com.kuaishou.live.core.voiceparty.micseats.core.MicSeatPendantAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import rs2.b;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.MicSeatPendantId;
import java.lang.Enum;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import com.kuaishou.live.core.voiceparty.micseats.core.MicSeatPendantAdapter$a;

public final class MicSeatPendantAdapter extends ViewControllerAdapter	// class@00157b
{
    public final Map j;

    public void MicSeatPendantAdapter(LifecycleOwner p0,Activity p1,Map p2){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "factoryRegister");
       super(p0, p1);
       this.j = p2;
    }
    public int f0(int p0){
       MicSeatPendantAdapter micSeatPenda = MicSeatPendantAdapter.class;
       if (PatchProxy.isSupport(micSeatPenda)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, micSeatPenda, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.L0().get(p0).b().ordinal();
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       MicSeatPendantAdapter micSeatPenda = MicSeatPendantAdapter.class;
       if (PatchProxy.isSupport(micSeatPenda)) {
          MicSeatPendantAdapter$a uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, micSeatPenda, "1");
          if (uoa != PatchProxyResult.class) {
          label_0043 :
             return uoa;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(this.K0());
       uFrameLayout.setClipChildren(false);
       uFrameLayout.setClipToPadding(false);
       MicSeatPendantAdapter$a uoa1 = new MicSeatPendantAdapter$a(this, uFrameLayout, this.K0(), this.N0(), MicSeatPendantId.values()[p1]);
       goto label_0043 ;
    }
}
