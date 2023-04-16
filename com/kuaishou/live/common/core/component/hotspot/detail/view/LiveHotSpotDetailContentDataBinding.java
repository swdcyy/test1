package com.kuaishou.live.common.core.component.hotspot.detail.view.LiveHotSpotDetailContentDataBinding;
import com.kuaishou.live.common.core.component.hotspot.detail.view.LiveHotSpotDetailContentDataBinding$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import android.app.Activity;
import un1.k;
import un1.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.live.common.core.component.hotspot.detail.view.LiveHotSpotDetailContentDataBinding$adapter$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailAdapter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.hotspot.detail.view.LiveHotSpotDetailContentDataBinding$b;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.content.res.Resources;

public final class LiveHotSpotDetailContentDataBinding	// class@00141c
{
    public final RecyclerView a;
    public final KwaiEmptyStateView b;
    public final LottieAnimationView c;
    public final p d;
    public a e;
    public final LifecycleOwner f;
    public final View g;
    public final Activity h;
    public final k i;
    public final d j;
    public static final LiveHotSpotDetailContentDataBinding$a k;

    static {
       LiveHotSpotDetailContentDataBinding.k = new LiveHotSpotDetailContentDataBinding$a(null);
    }
    public void LiveHotSpotDetailContentDataBinding(LifecycleOwner p0,View p1,Activity p2,k p3,d p4){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "rootView");
       a.p(p2, "activity");
       a.p(p3, "detailMainVCDelegate");
       a.p(p4, "detailContentVCDelegate");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.a = p1.findViewById(0x7f0a12f7);
       this.b = p1.findViewById(0x7f0a0d85);
       this.c = p1.findViewById(0x7f0a290a);
       this.d = s.c(new LiveHotSpotDetailContentDataBinding$adapter$2(this));
    }
    public final LiveHotSpotDetailAdapter a(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailContentDataBinding.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final void b(boolean p0){
       LiveHotSpotDetailContentDataBinding liveHotSpotD = LiveHotSpotDetailContentDataBinding.class;
       if (PatchProxy.isSupport(liveHotSpotD) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveHotSpotD, "5")) {
          return;
       }
       this.j.d2(false);
       liveHotSpotD = this.c;
       a.o(liveHotSpotD, "loadingImageView");
       int i = 8;
       liveHotSpotD.setVisibility(i);
       liveHotSpotD = this.b;
       a.o(liveHotSpotD, "errorStateView");
       liveHotSpotD.setVisibility(false);
       liveHotSpotD = this.a;
       a.o(liveHotSpotD, "recyclerView");
       liveHotSpotD.setVisibility(i);
       int i1 = (p0)? 0x7f100d25: 0x7f103dc1;
       LiveHotSpotDetailContentDataBinding tb = this.b;
       int i2 = (p0)? 1: 2;
       tb.d(i2);
       this.b.h(this.h.getString(i1));
       i1 = (p0)? 0x7f0805f4: 0x7f0805d5;
       this.b.i(i1);
       this.b.n(R.string.arg_RES_7f100d2d);
       this.b.p(new LiveHotSpotDetailContentDataBinding$b(this));
       this.c((p0 ^ 1));
       return;
    }
    public final void c(boolean p0){
       TextView textView;
       LiveHotSpotDetailContentDataBinding liveHotSpotD = LiveHotSpotDetailContentDataBinding.class;
       if (PatchProxy.isSupport(liveHotSpotD) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveHotSpotD, "6")) {
          return;
       }
       int i = 0x7f0a35e0;
       if (p0) {
          textView = this.b.findViewById(i);
          if (textView != null) {
             textView.setBackgroundResource(R.drawable.arg_RES_7f0812b2);
             textView.setTextColor(this.h.getResources().getColor(R.color.arg_RES_7f0607c6));
          }
       }else {
          textView = this.b.findViewById(i);
          if (textView != null) {
             textView.setBackgroundResource(R.drawable.arg_RES_7f081051);
             textView.setTextColor(this.h.getResources().getColor(R.color.arg_RES_7f0607de));
          }
       }
       return;
    }
}
