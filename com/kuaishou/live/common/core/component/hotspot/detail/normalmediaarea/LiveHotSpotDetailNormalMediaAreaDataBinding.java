package com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaDataBinding;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaDataBinding$a;
import nsd.u;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaDataBinding$itemClickHandler$1;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaDataBinding$adapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.hotspot.detail.normalmediaarea.LiveHotSpotDetailNormalMediaAreaAdapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveHotSpotDetailNormalMediaAreaDataBinding	// class@0013d8
{
    public final TextView a;
    public final RecyclerView b;
    public final p c;
    public d d;
    public final p e;
    public final View f;
    public final LifecycleOwner g;
    public final Activity h;
    public final k i;
    public static final LiveHotSpotDetailNormalMediaAreaDataBinding$a j;

    static {
       LiveHotSpotDetailNormalMediaAreaDataBinding.j = new LiveHotSpotDetailNormalMediaAreaDataBinding$a(null);
    }
    public void LiveHotSpotDetailNormalMediaAreaDataBinding(View p0,LifecycleOwner p1,Activity p2,k p3){
       a.p(p0, "rootView");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "activity");
       a.p(p3, "detailMainVCDelegate");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.a = p0.findViewById(0x7f0a2015);
       this.b = p0.findViewById(0x7f0a2014);
       this.c = new LiveHotSpotDetailNormalMediaAreaDataBinding$itemClickHandler$1(this);
       this.e = s.c(new LiveHotSpotDetailNormalMediaAreaDataBinding$adapter$2(this));
    }
    public final LiveHotSpotDetailNormalMediaAreaAdapter a(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailNormalMediaAreaDataBinding.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
}
