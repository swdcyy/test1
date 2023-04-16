package com.yxcorp.gifshow.aggregate.feed.FeedsAggregateTipsHelper$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.aggregate.feed.FeedsAggregateTipsHelper;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.f;
import kotlin.jvm.internal.a;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class FeedsAggregateTipsHelper$a implements View$OnClickListener	// class@00192d
{
    public final FeedsAggregateTipsHelper b;

    public void FeedsAggregateTipsHelper$a(FeedsAggregateTipsHelper p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, FeedsAggregateTipsHelper$a.class, "1")) {
          return;
       }
       f g = this.b.g;
       a.o(g, "mFragment");
       g.q().a();
       PatchProxy.onMethodExit(FeedsAggregateTipsHelper$a.class, "1");
       return;
    }
}
