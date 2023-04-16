package com.yxcorp.gifshow.camera.record.live.LiveEntryWrapperFragment;
import mm6.c;
import j03.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mm6.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j8c.a;
import q87.c;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import crd.b;
import lnc.b9;
import java.lang.System;
import qs5.d;
import java.lang.Long;
import brd.t;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.camera.record.live.a;
import erd.o;
import t45.d;
import brd.z;
import ae9.b;
import erd.g;
import w46.b;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.view.KeyEvent;
import hka.d;
import hka.c;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import ae9.c;
import android.view.View$OnClickListener;
import ae9.a;
import sm6.b;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public class LiveEntryWrapperFragment extends BaseFragment implements c, a	// class@000e1a
{
    public KwaiLoadingView j;
    public KwaiEmptyStateView k;
    public View l;
    public b m;
    public BaseFragment n;
    public long o;
    public long p;
    public boolean q;
    public static final int r;

    public void LiveEntryWrapperFragment(){
       super();
       this.o = 0;
       this.p = 0;
       this.q = false;
    }
    public int Ff(){
       return b.c(this);
    }
    public int M(){
       return 5;
    }
    public int S5(){
       return b.d(this);
    }
    public String Xa(){
       Object obj = PatchProxy.apply(null, this, LiveEntryWrapperFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("LiveEntryWrapperFragment", "getPage2String", objArray);
       return "LIVE_ENTRY_PLUGIN";
    }
    public boolean a4(){
       Object obj = PatchProxy.apply(null, this, LiveEntryWrapperFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("LiveEntryWrapperFragment", "disableAnimCameraView", objArray);
       return 0;
    }
    public void ch(){
       t ot;
       if (PatchProxy.applyVoid(null, this, LiveEntryWrapperFragment.class, "6")) {
          return;
       }
       int i = 0;
       if (this.getActivity() == null || this.getActivity().isFinishing()) {
          Object[] objArray = new Object[i];
          a.D().t("LiveEntryWrapperFragment", "getActivity is null or isFinishing", objArray);
          return;
       }else {
          this.j.setVisibility(i);
          b9.a(this.m);
          this.o = System.currentTimeMillis();
          String str = "live_anchor_plugin";
          this.q = d.c(str);
          LiveEntryWrapperFragment tp = this.p;
          if (PatchProxy.isSupport(LiveEntryWrapperFragment.class)) {
             ot = PatchProxy.applyOneRefs(Long.valueOf(tp), this, LiveEntryWrapperFragment.class, "7");
             if (ot != PatchProxyResult.class) {
             }else if(tp - null > 0){
                ot = t.timer(tp, TimeUnit.MILLISECONDS).flatMap(a.b);
             }else {
                ot = d.a(str, 40);
             }
          }else {
             goto label_0053 ;
          }
          this.m = ot.observeOn(d.a).subscribe(new b(this));
          return;
       }
    }
    public void dg(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEntryWrapperFragment.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("LiveEntryWrapperFragment", "checkPermissionGranted", objArray);
       return;
    }
    public boolean f9(){
       return b.f(this);
    }
    public boolean gg(){
       LiveEntryWrapperFragment obj = PatchProxy.apply(null, this, LiveEntryWrapperFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.n;
       if (obj instanceof a) {
          return obj.gg();
       }
       return false;
    }
    public Drawable i9(){
       return b.i(this);
    }
    public boolean lf(){
       return b.h(this);
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, LiveEntryWrapperFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("LiveEntryWrapperFragment", "getPage2", objArray);
       return "LIVE_ENTRY_PLUGIN";
    }
    public boolean onBackPressed(){
       Object obj = PatchProxy.apply(null, this, LiveEntryWrapperFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("LiveEntryWrapperFragment", "onBackPressed", objArray);
       return 0;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveEntryWrapperFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, LiveEntryWrapperFragment.class, "4")) {
          p0 = this.getArguments();
          if (p0 != null) {
             this.p = p0.getLong("liveAnchorPluginDelayLoadMs", 0);
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveEntryWrapperFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d0aee, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveEntryWrapperFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().w("LiveEntryWrapperFragment", "onDestroyView", objArray);
       b9.a(this.m);
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return c.a(this, p0, p1);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       return c.b(this, p0, p1);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveEntryWrapperFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveEntryWrapperFragment.class, "5")) {
          this.j = p0.findViewById(0x7f0a1c33);
          KwaiEmptyStateView kwaiEmptySta = p0.findViewById(R.id.live_entry_error);
          this.k = kwaiEmptySta;
          kwaiEmptySta.q(3);
          KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
          uoa.h(R.string.arg_RES_7f100a3e);
          uoa.p(new c(this));
          uoa.a(this.k);
          View view = p0.findViewById(R.id.button_close);
          this.l = view;
          view.setOnClickListener(new a(this));
          if (this.getActivity() != null) {
             FrameLayout$LayoutParams layoutParams = this.l.getLayoutParams();
             layoutParams.topMargin = b.p(this.getActivity(), p0);
             this.l.setLayoutParams(layoutParams);
          }
       }
       this.ch();
       return;
    }
    public boolean re(){
       return b.g(this);
    }
    public boolean x2(){
       Object obj = PatchProxy.apply(null, this, LiveEntryWrapperFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("LiveEntryWrapperFragment", "isShowTabGroup", objArray);
       return true;
    }
}
