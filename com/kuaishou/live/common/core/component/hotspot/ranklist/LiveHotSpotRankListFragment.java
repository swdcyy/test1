package com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListFragment;
import yn1.h;
import k2b.e0;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import java.lang.String;
import androidx.fragment.app.c;
import sr5.a;
import sr5.b;
import un1.k;
import java.lang.Object;
import kotlin.jvm.internal.a;
import k2b.e0$a;
import yn1.i;
import fq5.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.d0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.Objects;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.HashMap;
import lnc.i3;
import k2b.u1;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListViewController;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.viewcontroller.ViewController;
import f33.a;
import com.kuaishou.live.common.core.component.hotspot.ranklist.LiveHotSpotRankListFragment$a;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import androidx.fragment.app.FragmentActivity;
import en1.d;

public final class LiveHotSpotRankListFragment extends LiveDialogContainerFragment implements h, e0	// class@001433
{
    public i A;
    public final int B;
    public final boolean C;
    public final int D;
    public final String E;
    public final String F;
    public final String G;
    public final c H;
    public final a I;
    public final b J;
    public final k K;
    public final e0$a L;
    public HashMap M;

    public void LiveHotSpotRankListFragment(int p0,boolean p1,int p2,String p3,String p4,String p5,c p6,a p7,b p8,k p9){
       BaseFragment uBaseFragmen;
       String str;
       a.p(p6, "parentFragmentManager");
       super();
       this.L = new e0$a();
       this.B = p0;
       this.C = p1;
       this.D = p2;
       this.E = p3;
       this.F = p4;
       this.G = p5;
       this.H = p6;
       this.I = p7;
       this.J = p8;
       this.K = p9;
       b uob = this.Eh();
       if (uob != null) {
          uBaseFragmen = uob.b();
          if (uBaseFragmen != null) {
          label_0033 :
             b uob1 = this.Eh();
             if (uob1 != null) {
                str = uob1.d();
                if (str != null) {
                   p4 = str;
                }
             }
             uob1 = this.Eh();
             if (uob1 != null) {
                str = uob1.getLiveStreamId();
                if (str != null) {
                   p5 = str;
                }
             }
             this.A = new i(p2, uBaseFragmen, p4, p5);
             this.Bh(-1, p0);
             return;
          }
       }
       uBaseFragmen = this;
       goto label_0033 ;
    }
    public int D4(){
       return d0.h(this);
    }
    public final b Eh(){
       Object[] objArray = null;
       LiveHotSpotRankListFragment obj = PatchProxy.apply(objArray, this, LiveHotSpotRankListFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.I;
       if (obj != null) {
          b uob = obj.b();
          if (uob != null) {
             objArray = uob;
          }else {
          label_001c :
             obj = this.J;
             if (obj != null) {
                objArray = obj.b();
             }
          }
       }else {
          goto label_001c ;
       }
       return objArray;
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
       Object obj = PatchProxy.apply(null, this, LiveHotSpotRankListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.L.M();
    }
    public ClientContent$ContentPackage Nf(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotRankListFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.L);
       return null;
    }
    public void Od(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotRankListFragment.class, "4")) {
          return;
       }
       this.dismissAllowingStateLoss();
       return;
    }
    public String P7(){
       return d0.i(this);
    }
    public ClientContent$ContentPackage Q3(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotRankListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.L);
       return null;
    }
    public String a2(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotRankListFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(this.L);
       return "";
    }
    public Activity cd(){
       return d0.f(this);
    }
    public boolean eg(){
       return true;
    }
    public int getPage(){
       Objects.requireNonNull(this.L);
       return 0;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotRankListFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L.getPageParams();
    }
    public String h5(){
       return d0.g(this);
    }
    public ClientEvent$ElementPackage j4(){
       return d0.c(this);
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotRankListFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L.o();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveHotSpotRankListFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0c27, p1, false);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, LiveHotSpotRankListFragment.class, "13")) {
       }else {
          LiveHotSpotRankListFragment tM = this.M;
          if (tM != null) {
             tM.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       String str = "3";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveHotSpotRankListFragment.class, str)) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       LiveHotSpotRankListFragment tA = this.A;
       Objects.requireNonNull(tA);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tA, i.class, str)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "LIVE_HOTSPOT_NAVI_PANEL";
          uElementPack.params = tA.b().toString();
          u1.C0("", tA.b, 6, uElementPack, objArray);
       }
       a.a(this, R.id.live_hot_spot_rank_list_container, new LiveHotSpotRankListViewController(this.E, this, this.A));
       this.oh(new LiveHotSpotRankListFragment$a(this));
       return;
    }
    public String pg(){
       return d0.k(this);
    }
    public ClientContentWrapper$ContentWrapper ye(){
       return d0.b(this);
    }
    public float yh(){
       float f = (this.C != null)? 0.30f: 0;
       return f;
    }
    public void z8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotRankListFragment.class, "5")) {
          return;
       }
       a.p(p0, "hotSpotId");
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          a.o(activity, "activity ?: return");
          LiveHotSpotRankListFragment tK = this.K;
          int i = 8;
          if (tK != null) {
             tK.y1(p0, i);
          }else {
             LiveHotSpotRankListFragment tI = this.I;
             tK = (tI != null || this.J != null)? 1: 0;
             if (tK) {
                d.b(activity, this.H, tI, this.J, p0, 8);
             }else {
                d.a(activity, p0, i);
             }
          }
       }
       return;
    }
}
