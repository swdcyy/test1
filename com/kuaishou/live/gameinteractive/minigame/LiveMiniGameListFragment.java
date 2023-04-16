package com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment$a;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import fq5.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import j43.a;
import crd.b;
import lnc.b9;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.widget.FrameLayout;
import e43.b;
import e43.a;
import p91.m;
import com.yxcorp.utility.TextUtils;
import brd.t;
import t45.d;
import brd.z;
import k43.g;
import k43.h;
import erd.g;
import java.lang.Integer;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kuaishou.live.gameinteractive.minigame.data.LiveMiniGameInfo;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Application;
import o56.a;
import u07.t$a;
import android.app.Activity;
import java.lang.CharSequence;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment$e;
import u07.u;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment$d;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGameListFragment$c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import lnc.a1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import mq5.h;
import mq5.b;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import k43.e;
import android.view.View$OnClickListener;
import k43.f;

public class LiveMiniGameListFragment extends LiveDialogContainerFragment	// class@001bd7
{
    public b A;
    public b B;
    public KwaiLoadingView C;
    public KwaiEmptyStateView D;
    public ImageView E;
    public RecyclerView F;
    public d G;
    public a0 H;
    public c I;
    public final h J;
    public final View$OnClickListener K;
    public static final int L;

    public void LiveMiniGameListFragment(){
       super();
       this.J = new LiveMiniGameListFragment$a(this);
       this.K = new LiveMiniGameListFragment$b(this);
    }
    public void Eh(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveMiniGameListFragment.class, "14")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("interaction_game_id", p1);
       oi3.d("interaction_game_name", p2);
       oi3.d("button_name", p3);
       a.a(p0, this.H.b().a(), oi3.e());
       return;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, LiveMiniGameListFragment.class, "10")) {
          return;
       }
       b9.a(this.A);
       this.C.setVisibility(0);
       this.D.setVisibility(8);
       this.A = a.a().g(TextUtils.k(this.H.Z2.getLiveStreamId())).observeOn(d.a).subscribe(new g(this), new h(this));
       return;
    }
    public final void Fh(int p0){
       if (PatchProxy.isSupport(LiveMiniGameListFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMiniGameListFragment.class, "11")) {
          return;
       }
       this.D.setVisibility(0);
       if (p0 == 1) {
          this.D.g(R.string.arg_RES_7f100d25);
          this.D.i(R.drawable.arg_RES_7f0805f4);
       }else {
          this.D.g(R.string.arg_RES_7f100d26);
          this.D.i(R.drawable.arg_RES_7f0805e6);
       }
       this.D.d(p0);
       return;
    }
    public void Gh(String p0,LiveMiniGameInfo p1){
       Object[] objArray;
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMiniGameListFragment.class, "1")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       if (("open").equals(p0)) {
          objArray = new Object[]{p1.gameName};
          str = a.b().getString(R.string.arg_RES_7f1027a0, objArray);
       }else {
          objArray = new Object[]{p1.gameName};
          str = a.b().getString(R.string.arg_RES_7f102797, objArray);
       }
       t$a uoa = new t$a(this.getActivity());
       uoa.z0(str);
       uoa.S0(R.string.arg_RES_7f100a73);
       uoa.u0(new LiveMiniGameListFragment$e(this, p1, p0));
       uoa.Q0(R.string.arg_RES_7f100a72);
       uoa.t0(new LiveMiniGameListFragment$d(this, p0, p1));
       uoa.z(0);
       uoa.A(0);
       uoa.v(1);
       f.e(uoa).Y(new LiveMiniGameListFragment$c(this));
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMiniGameListFragment.class, "6")) {
          return;
       }
       super.onCreate(p0);
       this.Bh(a1.d(R.dimen.arg_RES_7f070637), a1.d(R.dimen.arg_RES_7f0705cc));
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveMiniGameListFragment.class, "7");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       return a.g(p0, 0x7f0d0ca1, null, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveMiniGameListFragment.class, "12")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.A);
       b9.a(this.B);
       this.H.D2.le(this.J);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMiniGameListFragment.class, "8")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.H.D2.Km(this.J);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveMiniGameListFragment.class, "9")) {
          this.C = p0.findViewById(0x7f0a2921);
          this.D = p0.findViewById(0x7f0a0d35);
          this.E = p0.findViewById(0x7f0a1509);
          this.F = p0.findViewById(0x7f0a105d);
          this.D.p(new e(this));
          this.F.setOverScrollMode(2);
          this.E.setOnClickListener(new f(this));
       }
       this.F2();
       return;
    }
}
