package com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoDataBinding;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import un1.d;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoDataBinding$a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoDataBinding$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import ub.a;

public final class LiveHotSpotDetailBaseInfoDataBinding	// class@00136d
{
    public final int a;
    public final LiveHotSpotDetailBaseInfoDataBinding$a b;
    public final LifecycleOwner c;
    public final View d;
    public final d e;
    public final k f;

    public void LiveHotSpotDetailBaseInfoDataBinding(LifecycleOwner p0,View p1,d p2,k p3){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "rootView");
       a.p(p2, "contentVCDelegate");
       a.p(p3, "detailMainVCDelegate");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.a = a1.e(50.00f);
       LiveHotSpotDetailBaseInfoDataBinding$a uoa = new LiveHotSpotDetailBaseInfoDataBinding$a(this);
       this.b = uoa;
       p2.C0().addOnScrollListener(uoa);
       p0.getLifecycle().addObserver(new LiveHotSpotDetailBaseInfoDataBinding$1(this));
       if (p3.i0()) {
          KwaiCDNImageView.q0(p1.findViewById(R.id.bg_image), R.string.arg_RES_7f101e92, 0, null, 6, null);
       }
       return;
    }
}
