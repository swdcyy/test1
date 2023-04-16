package com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListFragment$a;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListFragment;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import un1.k;

public final class LiveHotSpotRankListFragment$a implements DialogInterface$OnCancelListener	// class@001432
{
    public final LiveHotSpotRankListFragment b;

    public void LiveHotSpotRankListFragment$a(LiveHotSpotRankListFragment p0){
       this.b = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotRankListFragment$a.class, "1")) {
          return;
       }
       LiveHotSpotRankListFragment k = this.b.K;
       if (k != null) {
          k.m2();
       }
       return;
    }
}
