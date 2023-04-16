package com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorDataBinding;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorDataBinding$a;
import nsd.u;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import android.app.Activity;
import un1.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorTextSwitcher;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fn1.a;
import fn1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorDataBinding$logBtnClick$1;
import msd.l;

public final class LiveHotSpotDetailBottomNavigatorDataBinding	// class@0013ad
{
    public final View a;
    public final View b;
    public final KwaiImageView c;
    public final LiveHotSpotDetailBottomNavigatorTextSwitcher d;
    public final TextView e;
    public String f;
    public final LifecycleOwner g;
    public final View h;
    public final Activity i;
    public final k j;
    public static final LiveHotSpotDetailBottomNavigatorDataBinding$a k;

    static {
       LiveHotSpotDetailBottomNavigatorDataBinding.k = new LiveHotSpotDetailBottomNavigatorDataBinding$a(null);
    }
    public void LiveHotSpotDetailBottomNavigatorDataBinding(LifecycleOwner p0,View p1,Activity p2,k p3){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "rootView");
       a.p(p2, "activity");
       a.p(p3, "mainVCDelegate");
       super();
       this.g = p0;
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.a = p1.findViewById(0x7f0a12f5);
       this.b = p1.findViewById(0x7f0a2dc1);
       this.c = p1.findViewById(0x7f0a131c);
       this.d = p1.findViewById(0x7f0a12f4);
       this.e = p1.findViewById(0x7f0a2dca);
    }
    public final View a(){
       return this.b;
    }
    public final TextView b(){
       return this.e;
    }
    public final void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailBottomNavigatorDataBinding.class, "2")) {
          return;
       }
       a.a.b("LIVE_HOTSPOT_DATAIL_BOTTOM_BAR", this.j.E0(), this.j.a(), new LiveHotSpotDetailBottomNavigatorDataBinding$logBtnClick$1(p0));
       return;
    }
}
