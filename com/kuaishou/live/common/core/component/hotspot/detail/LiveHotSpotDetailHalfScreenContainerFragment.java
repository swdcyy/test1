package com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailHalfScreenContainerFragment;
import k2b.e0;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailHalfScreenContainerFragment$a;
import nsd.u;
import java.lang.String;
import sr5.a;
import sr5.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import k2b.e0$a;
import k2b.d0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.Objects;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.HashMap;
import un1.i;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailHalfScreenContainerFragment$onViewCreated$1;
import msd.a;
import com.kuaishou.live.viewcontroller.ViewController;
import f33.a;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;

public final class LiveHotSpotDetailHalfScreenContainerFragment extends LiveDialogContainerFragment implements e0	// class@001363
{
    public final String A;
    public final int B;
    public final a C;
    public final b D;
    public final e0$a E;
    public HashMap F;
    public static final LiveHotSpotDetailHalfScreenContainerFragment$a G;

    static {
       LiveHotSpotDetailHalfScreenContainerFragment.G = new LiveHotSpotDetailHalfScreenContainerFragment$a(null);
    }
    public void LiveHotSpotDetailHalfScreenContainerFragment(String p0,int p1,a p2,b p3){
       a.p(p0, "hotSpotId");
       super();
       this.E = new e0$a();
       this.A = p0;
       this.B = p1;
       this.C = p2;
       this.D = p3;
    }
    public int D4(){
       return d0.h(this);
    }
    public ClientEvent$ExpTagTrans I1(){
       return d0.e(this);
    }
    public ClientEvent$ExpTagTrans K5(){
       return d0.d(this);
    }
    public int Lb(){
       return d0.j(this);
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailHalfScreenContainerFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.E.M();
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailHalfScreenContainerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.E);
       return null;
    }
    public String P7(){
       return d0.i(this);
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailHalfScreenContainerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.E);
       return null;
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailHalfScreenContainerFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.E);
       return "";
    }
    public Activity cd(){
       return d0.f(this);
    }
    public boolean eg(){
       return true;
    }
    public int getPage(){
       Objects.requireNonNull(this.E);
       return 0;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailHalfScreenContainerFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.getPageParams();
    }
    public String h5(){
       return d0.g(this);
    }
    public ClientEvent$ElementPackage j4(){
       return d0.c(this);
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailHalfScreenContainerFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.o();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveHotSpotDetailHalfScreenContainerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.c(p0, 0x7f0d0c16, p1, false);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailHalfScreenContainerFragment.class, "10")) {
       }else {
          LiveHotSpotDetailHalfScreenContainerFragment tF = this.F;
          if (tF != null) {
             tF.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHotSpotDetailHalfScreenContainerFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       c childFragmen = this.getChildFragmentManager();
       a.o(childFragmen, "childFragmentManager");
       i oi = new i(this.A, this.B, childFragmen, this, this.C, this.D, new LiveHotSpotDetailHalfScreenContainerFragment$onViewCreated$1(this));
       a.a(this, R.id.fragment_container, p1);
       return;
    }
    public String pg(){
       return d0.k(this);
    }
    public ClientContentWrapper$ContentWrapper ye(){
       return d0.b(this);
    }
}
