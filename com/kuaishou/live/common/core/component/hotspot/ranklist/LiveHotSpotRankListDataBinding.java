package com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListDataBinding;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import android.app.Activity;
import yn1.h;
import yn1.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListDataBinding$layoutManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListDataBinding$adapter$2;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListAdapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListLayoutManager;
import qrd.l1;

public final class LiveHotSpotRankListDataBinding	// class@001431
{
    public final KwaiImageView a;
    public final ImageView b;
    public final RecyclerView c;
    public final View d;
    public View e;
    public a f;
    public final p g;
    public final p h;
    public final LifecycleOwner i;
    public final h j;
    public final i k;

    public void LiveHotSpotRankListDataBinding(LifecycleOwner p0,View p1,Activity p2,h p3,i p4){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "rootView");
       a.p(p2, "activity");
       a.p(p3, "delegate");
       a.p(p4, "logger");
       super();
       this.i = p0;
       this.j = p3;
       this.k = p4;
       this.a = p1.findViewById(0x7f0a2026);
       this.b = p1.findViewById(0x7f0a2023);
       this.c = p1.findViewById(0x7f0a2024);
       this.d = p1.findViewById(0x7f0a2022);
       this.g = s.c(new LiveHotSpotRankListDataBinding$layoutManager$2(this, p1));
       this.h = s.c(new LiveHotSpotRankListDataBinding$adapter$2(this, p2));
    }
    public final LiveHotSpotRankListAdapter a(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotRankListDataBinding.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final LiveHotSpotRankListLayoutManager b(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotRankListDataBinding.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotRankListDataBinding.class, "4")) {
          return;
       }
       if (this.b().t != null) {
          LiveHotSpotRankListDataBinding tf = this.f;
          if (tf != null) {
             tf.invoke();
          }
          this.f = null;
       }
       return;
    }
}
