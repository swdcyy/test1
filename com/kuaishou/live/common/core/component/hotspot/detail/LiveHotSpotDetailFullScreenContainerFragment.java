package com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailFullScreenContainerFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailFullScreenContainerFragment$a;
import nsd.u;
import java.lang.String;
import androidx.fragment.app.c;
import sr5.a;
import sr5.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import lnc.i3;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import java.util.HashMap;
import k2b.e0;
import un1.h;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailFullScreenContainerFragment$onViewCreated$1;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailFullScreenContainerFragment$onViewCreated$2;
import msd.a;
import msd.l;
import com.kuaishou.live.viewcontroller.ViewController;
import f33.a;

public final class LiveHotSpotDetailFullScreenContainerFragment extends BaseFragment	// class@001360
{
    public final boolean j;
    public String k;
    public final int l;
    public final c m;
    public final a n;
    public final b o;
    public HashMap p;
    public static final LiveHotSpotDetailFullScreenContainerFragment$a q;

    static {
       LiveHotSpotDetailFullScreenContainerFragment.q = new LiveHotSpotDetailFullScreenContainerFragment$a(null);
    }
    public void LiveHotSpotDetailFullScreenContainerFragment(String p0,int p1,c p2,a p3,b p4){
       a.p(p0, "hotSpotId");
       a.p(p2, "parentFragmentManager");
       super(null, null, null, null, 15, null);
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       boolean b = (p3 != null || p4 != null)? true: false;
       this.j = b;
       return;
    }
    public int M(){
       return 5;
    }
    public boolean eg(){
       return this.j;
    }
    public String getPageParams(){
       String str;
       ClientEvent$UrlPackage obj = PatchProxy.apply(null, this, LiveHotSpotDetailFullScreenContainerFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u1.p();
       if (obj != null) {
          obj = obj.page2;
          if (obj != null) {
          label_001d :
             i3 oi3 = i3.f();
             oi3.d("entry_src_page", obj);
             oi3.d("hot_id", this.k);
             str = oi3.e();
             a.o(str, "JsonStringBuilder.newIns¡­hotSpotId\)\n      .build\(\)");
             return str;
          }
       }
       str = "";
       goto label_001d ;
    }
    public String o(){
       String str = (this.j != null)? "": "LIVE_FULL_SCREEN_HOTSPOT_DETAIL_PAGE";
       return str;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveHotSpotDetailFullScreenContainerFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.c(p0, 0x7f0d0c16, p1, false);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailFullScreenContainerFragment.class, "6")) {
       }else {
          LiveHotSpotDetailFullScreenContainerFragment tp = this.p;
          if (tp != null) {
             tp.clear();
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailFullScreenContainerFragment.class, "4")) {
          return;
       }
       super.onResume();
       u1.L0(this);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHotSpotDetailFullScreenContainerFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       c childFragmen = this.getChildFragmentManager();
       a.o(childFragmen, "childFragmentManager");
       h oh = new h(this.k, this.l, childFragmen, this, this.n, this.o, new LiveHotSpotDetailFullScreenContainerFragment$onViewCreated$1(this), new LiveHotSpotDetailFullScreenContainerFragment$onViewCreated$2(this));
       a.a(this, R.id.fragment_container, p1);
       return;
    }
}
