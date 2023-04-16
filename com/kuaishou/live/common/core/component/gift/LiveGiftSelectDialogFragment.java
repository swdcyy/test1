package com.kuaishou.live.common.core.component.gift.LiveGiftSelectDialogFragment;
import ml8.d;
import yr5.a;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import com.kuaishou.live.common.core.basic.config.LiveCommonConfigResponse$WishListConfig;
import java.lang.reflect.Type;
import s81.a;
import com.kwai.feature.api.live.merchant.gift.LiveGiftSelectDialogType;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import mkc.b;
import android.view.View;
import mkc.c;
import brd.t;
import yr5.d;
import ug1.q0;
import erd.a;
import com.kuaishou.live.common.core.component.gift.k;
import erd.r;
import t45.d;
import brd.z;
import com.kuaishou.live.common.core.component.gift.i;
import com.kuaishou.live.common.core.component.gift.j;
import erd.g;
import crd.b;
import yr5.e;
import com.yxcorp.utility.TextUtils;
import ekd.m1;
import com.kuaishou.live.common.core.basic.widget.LiveGridViewPager;
import android.widget.TextView;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import android.widget.ImageView;
import ug1.j0;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.m;
import androidx.fragment.app.KwaiDialogFragment;
import lnc.a1;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.gift.l;
import android.graphics.Typeface;
import ekd.d0;
import ug1.m0;
import ug1.k0;
import ug1.l0;
import vg1.e;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;

public class LiveGiftSelectDialogFragment extends LiveDialogContainerFragment implements d, a	// class@001135
{
    public LiveCommonConfigResponse$WishListConfig A;
    public TextView B;
    public View C;
    public ImageView D;
    public HorizontalPageIndicator E;
    public LiveGridViewPager F;
    public View G;
    public TextView H;
    public View I;
    public d J;
    public e K;
    public String L;
    public int M;
    public b N;
    public a O;
    public Gift P;
    public LiveGiftSelectDialogType Q;
    public int R;
    public static final int S;

    public void LiveGiftSelectDialogFragment(){
       super();
       this.A = a.A(LiveCommonConfigResponse$WishListConfig.class);
       this.L = "";
    }
    public static LiveGiftSelectDialogFragment Fh(LiveGiftSelectDialogType p0){
       LiveGiftSelectDialogFragment obj = PatchProxy.applyOneRefs(p0, null, LiveGiftSelectDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveGiftSelectDialogFragment();
       Bundle uBundle = new Bundle();
       SerializableHook.putSerializable(uBundle, "LiveGiftSelectDialogType", p0);
       obj.setArguments(uBundle);
       return obj;
    }
    public final void Eh(){
       if (PatchProxy.applyVoid(null, this, LiveGiftSelectDialogFragment.class, "9")) {
          return;
       }
       if (this.J == null) {
          return;
       }
       c.h(this.I, b.e);
       this.N = this.J.a().doFinally(new q0(this)).filter(k.b).observeOn(d.a).subscribe(new i(this), new j(this));
       return;
    }
    public LiveGiftSelectDialogFragment Gh(int p0){
       if (p0 > 0) {
       }else {
          p0 = 1;
       }
       this.M = p0;
       return this;
    }
    public LiveGiftSelectDialogFragment Hh(d p0){
       this.J = p0;
       return this;
    }
    public LiveGiftSelectDialogFragment Ih(e p0){
       this.K = p0;
       return this;
    }
    public a Jb(int p0){
       this.Gh(p0);
       return this;
    }
    public LiveGiftSelectDialogFragment Jh(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftSelectDialogFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.L = TextUtils.k(p0);
       return this;
    }
    public a Ld(d p0){
       this.Hh(p0);
       return this;
    }
    public a X9(String p0){
       return this.Jh(p0);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSelectDialogFragment.class, "1")) {
          return;
       }
       this.F = m1.f(p0, 0x7f0a2546);
       this.B = m1.f(p0, 0x7f0a2545);
       this.I = m1.f(p0, 0x7f0a2544);
       this.E = m1.f(p0, 0x7f0a2542);
       this.G = m1.f(p0, 0x7f0a2543);
       this.C = m1.f(p0, 0x7f0a253c);
       this.D = m1.f(p0, 0x7f0a2541);
       this.H = m1.f(p0, 0x7f0a2540);
       p0.setOnClickListener(new j0(this));
       p0.findViewById(R.id.live_select_gift_container).setOnClickListener(m.b);
       return;
    }
    public int getTheme(){
       return 0x1030010;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSelectDialogFragment.class, "6")) {
          return;
       }
       super.onActivityCreated(p0);
       this.Eh();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSelectDialogFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       this.Bh(0, (a1.d(R.dimen.arg_RES_7f070950) + n.q(a.a().a())));
       this.nh(0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveGiftSelectDialogFragment.class, "5");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       ViewGroup viewGroup = null;
       View view = a.g(p0, R.layout.arg_RES_7f0d0dbe, viewGroup, false);
       this.doBindView(view);
       if (!PatchProxy.applyVoid(viewGroup, this, LiveGiftSelectDialogFragment.class, "10")) {
          Bundle arguments = this.getArguments();
          if (arguments != null) {
             this.Q = arguments.get("LiveGiftSelectDialogType");
          }
       }
       if (!PatchProxy.applyVoid(viewGroup, this, LiveGiftSelectDialogFragment.class, "11")) {
          LiveGiftSelectDialogType wISH_LIST = LiveGiftSelectDialogType.WISH_LIST;
          int i = (this.Q == wISH_LIST)? 10: 1;
          this.R = i;
          this.B.setText(this.L);
          this.H.setText(String.valueOf(this.M));
          this.H.setOnClickListener(new l(this));
          this.H.setTypeface(d0.a("alte-din.ttf", this.getContext()));
          this.G.setOnClickListener(new m0(this));
          if (this.Q == wISH_LIST) {
             this.C.setVisibility(8);
             this.D.setVisibility(false);
             this.D.setOnClickListener(new k0(this));
          }else {
             this.D.setVisibility(8);
             this.C.setVisibility(false);
             this.C.setOnClickListener(new l0(this));
          }
       }
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGiftSelectDialogFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       LiveGiftSelectDialogFragment tN = this.N;
       if (tN != null) {
          tN.dispose();
       }
       tN = this.O;
       if (tN != null) {
          tN.M();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveGiftSelectDialogFragment.class, "8")) {
          return;
       }
       super.onStart();
       if (this.Q == LiveGiftSelectDialogType.WISH_LIST) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             dialog.getWindow().setWindowAnimations(R.style.arg_RES_7f1103e0);
          }
       }
       return;
    }
    public a t8(e p0){
       this.Ih(p0);
       return this;
    }
}
