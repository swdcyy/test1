package com.kuaishou.live.core.voiceparty.micseats.core.viewmanager.MicSeatViewAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter$a;
import android.widget.FrameLayout;
import android.content.Context;
import com.kuaishou.live.core.voiceparty.micseats.core.viewmanager.MicSeatViewAdapter$a;

public final class MicSeatViewAdapter extends ViewControllerAdapter	// class@00158f
{
    public final Map j;

    public void MicSeatViewAdapter(LifecycleOwner p0,Activity p1,Map p2){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       a.p(p2, "factoryRegister");
       super(p0, p1);
       this.j = p2;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       MicSeatViewAdapter$a uoa;
       MicSeatViewAdapter micSeatViewA = MicSeatViewAdapter.class;
       if (PatchProxy.isSupport(micSeatViewA)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, micSeatViewA, "1");
          if (uoa != PatchProxyResult.class) {
          label_003b :
             return uoa;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(this.K0());
       uFrameLayout.setClipChildren(false);
       uFrameLayout.setClipToPadding(false);
       uoa = new MicSeatViewAdapter$a(this, uFrameLayout, this.N0(), this.K0());
       goto label_003b ;
    }
}
