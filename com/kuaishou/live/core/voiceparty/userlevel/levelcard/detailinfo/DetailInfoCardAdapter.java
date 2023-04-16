package com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardAdapter;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
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
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardAdapter$a;
import android.view.View;

public final class DetailInfoCardAdapter extends ViewControllerAdapter	// class@001aa5
{

    public void DetailInfoCardAdapter(LifecycleOwner p0,Activity p1){
       a.p(p0, "parentLifecycleOwner");
       a.p(p1, "activity");
       super(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       DetailInfoCardAdapter$a uoa;
       DetailInfoCardAdapter uDetailInfoC = DetailInfoCardAdapter.class;
       if (PatchProxy.isSupport(uDetailInfoC)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uDetailInfoC, "1");
          if (uoa != PatchProxyResult.class) {
          label_003e :
             return uoa;
          }
       }
       a.p(p0, "parent");
       FrameLayout uFrameLayout = new FrameLayout(p0.getContext());
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       uoa = new DetailInfoCardAdapter$a(this, uFrameLayout, this.N0(), this.K0());
       goto label_003e ;
    }
}
