package com.yxcorp.gifshow.prettify.RecordPrettifyFragment;
import ml8.d;
import o0c.a;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import j8c.a;
import q87.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.animation.ObjectAnimator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.StringBuilder;
import android.view.View;
import android.util.Property;
import com.yxcorp.gifshow.prettify.RecordPrettifyFragment$a;
import android.animation.Animator$AnimatorListener;
import th0.e;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.activity.GifshowActivity;
import q0c.o2;
import com.yxcorp.gifshow.prettify.beauty.h;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;
import java.util.ArrayList;
import a17.g;
import com.kwai.library.widget.popup.sheet.SheetItemStatus;
import java.lang.CharSequence;
import a17.c$a;
import android.app.Activity;
import a17.f;
import java.util.List;
import l0c.m0;
import a17.b$b;
import l0c.l0;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import java.lang.Integer;
import java.util.Objects;
import com.yxcorp.gifshow.prettify.beauty.RecordBeautySwitchEntrance;
import com.yxcorp.gifshow.util.rx.RxBus;
import q0c.n2;
import ekd.m1;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import java.util.Map;
import android.widget.LinearLayout;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.widget.RadioButton;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.gifshow.prettify.RecordPrettifyFragment$b;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import android.app.Dialog;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import crd.b;
import android.view.ViewPropertyAnimator;
import com.yxcorp.gifshow.prettify.j;
import p0c.h;
import p0c.a;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import ra6.a;
import l0c.n0;
import com.yxcorp.gifshow.prettify.beauty.RecordBeautySwitchEntrance$a;
import l0c.p0;
import l0c.o0;
import erd.g;
import eoc.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import l0c.f0;
import g16.c;
import android.util.Log;
import com.yxcorp.gifshow.util.PostUtils;
import uv8.w1;

public class RecordPrettifyFragment extends BottomSheetFragment implements d, a	// class@0010e6
{
    public CameraPageType A;
    public ObjectAnimator B;
    public BaseFragment C;
    public h D;
    public c E;
    public List F;
    public RecordPrettifyFragment$b G;
    public RecordPrettifyFragment$c H;
    public RecordBeautySwitchEntrance I;
    public int J;
    public boolean K;
    public b L;
    public View z;
    public static final int M;

    static {
       RecordPrettifyFragment.M = a1.e(321.00f);
    }
    public void RecordPrettifyFragment(){
       super();
    }
    public int Dh(){
       Object obj = PatchProxy.apply(null, this, RecordPrettifyFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0x7f1103bf;
    }
    public void Eh(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, RecordPrettifyFragment.class, "17")) {
          return;
       }
       int i = 0;
       String str = "RecordPrettifyFragment";
       if (this.z == null) {
          objArray = new Object[i];
          a.D().w(str, "hide when fragment is null", objArray);
          ClientEvent$ExceptionEvent uExceptionEv = new ClientEvent$ExceptionEvent();
          uExceptionEv.extraMessage = str;
          ExceptionHandler.handleCaughtException(new Throwable("hideFragment when view is null"), uExceptionEv);
          return;
       }else {
          RecordPrettifyFragment tB = this.B;
          if (tB != null && tB.isRunning()) {
             objArray = new Object[i];
             a.D().s(str, "hideFragment is running", objArray);
             return;
          }else if(this.z == null){
             objArray = new Object[i];
             a.D().w(str, "mPrettifyFragmentView is null", objArray);
             return;
          }else {
             int i1 = RecordPrettifyFragment.M + n.q(this.getActivity());
             Object[] objArray1 = new Object[i];
             a.D().s(str, "hideFragment translationY :"+i1, objArray1);
             float[] uofloatArray = new float[]{(float)i1};
             ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.z, View.TRANSLATION_Y.getName(), uofloatArray);
             this.B = objectAnimat;
             objectAnimat.setDuration(300);
             this.B.addListener(new RecordPrettifyFragment$a(this));
             this.B.setInterpolator(new e());
             this.B.start();
             return;
          }
       }
    }
    public void Ih(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecordPrettifyFragment.class, "9")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       boolean b = o2.b();
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(activity, Boolean.valueOf(b), objArray, oh, "18")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SWITCH_BEAUTY_VERSION";
          i3 oi3 = i3.f();
          oi3.a("is_new_version", Boolean.valueOf(b));
          uElementPack.params = oi3.e();
          u1.L("", activity, 1, uElementPack, objArray);
       }
       int i = 0;
       if (this.J != null) {
          this.C.ih(i);
       }else if(o2.b()){
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f104aa8), SheetItemStatus.Primary));
          uArrayList.add(new g(a1.p(R.string.arg_RES_7f104b6c), SheetItemStatus.Enable));
          c$a uoa = f.a(new c$a(this.getActivity()));
          uoa.n0(this.getString(R.string.arg_RES_7f104b6e));
          uoa.j0(uArrayList);
          uoa.g0(R.string.cancel);
          uoa.i0(new m0(this));
          uoa.J(new l0(this));
          uoa.Y(PopupInterface.a);
       }else {
          o2.c();
          this.Kh(o2.b());
          this.Jh(i);
       }
       return;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, RecordPrettifyFragment.class, "19")) {
          return;
       }
       this.Eh();
       return;
    }
    public void Jh(int p0){
       if (PatchProxy.isSupport(RecordPrettifyFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordPrettifyFragment.class, "21")) {
          return;
       }
       RecordPrettifyFragment tI = this.I;
       if (tI != null) {
          Objects.requireNonNull(tI);
          if (!PatchProxy.applyVoid(null, tI, RecordBeautySwitchEntrance.class, "3")) {
             tI.c(0, (tI.f ^ 0x01));
          }
       }
       if (!p0) {
          RxBus.f.b(new n2(o2.b()));
       }
       return;
    }
    public final void Kh(boolean p0){
       if (PatchProxy.isSupport(RecordPrettifyFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RecordPrettifyFragment.class, "8")) {
          return;
       }
       if (this.I == null) {
          return;
       }
       if (this.C.getView() == null) {
          return;
       }
       Map radioBtns = m1.f(this.C.getView(), R.id.tabs_container).getRadioBtns();
       if (radioBtns == null) {
          return;
       }
       int i = p0 ^ 0x01;
       RecordPrettifyFragment tI = this.I;
       int i1 = (i)? 0: 8;
       tI.setVisibility(i1);
       Iterator iterator = radioBtns.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry.getKey().intValue() == 0x7f0a03f8) {
             LinearLayout$LayoutParams layoutParams = uEntry.getValue().getLayoutParams();
             layoutParams.setMarginStart(a1.e(12.00f));
             i = (i)? a1.e(71.00f): a1.e(12.00f);
             layoutParams.setMarginEnd(i);
             uEntry.getValue().setLayoutParams(layoutParams);
             break ;
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordPrettifyFragment.class, "4")) {
          return;
       }
       this.z = p0.findViewById(0x7f0a31bf);
       return;
    }
    public void ka(){
       if (PatchProxy.applyVoid(null, this, RecordPrettifyFragment.class, "23")) {
          return;
       }
       RecordPrettifyFragment tG = this.G;
       if (tG != null) {
          tG.a();
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordPrettifyFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       if (p0 != null && !p0.getBoolean("pageIsHidden", false)) {
          this.getFragmentManager().beginTransaction().p(this).m();
       }
       if (this.getArguments() != null) {
          this.A = SerializableHook.getSerializable(this.getArguments(), "page_key");
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecordPrettifyFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCanceledOnTouchOutside(false);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RecordPrettifyFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d12dd, p1, false);
       this.doBindView(view);
       RxBus.f.b(new PanelShowEvent(this.A, PanelShowEvent$PanelType.PRETTIFY, this.getActivity(), true));
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, RecordPrettifyFragment.class, "16")) {
          return;
       }
       if (this.getActivity() != null && this.C != null) {
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.u(this.C);
          uoe.m();
       }
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, RecordPrettifyFragment.class, "11")) {
          return;
       }
       super.onDestroyView();
       RecordPrettifyFragment tL = this.L;
       if (tL != null) {
          tL.dispose();
          this.L = null;
       }
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecordPrettifyFragment.class, "13")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(objArray, this, RecordPrettifyFragment.class, "18")) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          a.D().s("RecordPrettifyFragment", "showFragment ", objArray1);
          if (this.z.getVisibility()) {
             int i1 = RecordPrettifyFragment.M + n.q(this.getActivity());
             Object[] objArray2 = new Object[i];
             a.D().s("RecordPrettifyFragment", "showFragment translationY :"+i1, objArray2);
             this.z.setTranslationY((float)i1);
             this.z.setVisibility(i);
             this.z.animate().translationY(0).setDuration(300).setInterpolator(new e()).setListener(new j(this)).start();
          }
       }
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecordPrettifyFragment.class, "12")) {
          return;
       }
       super.onStart();
       if (this.D.c() != 1 || (!o2.a() || (this.D.a().v() != -1 && (!PatchProxy.applyVoid(objArray, this, RecordPrettifyFragment.class, "7") && this.K == null)))) {
          PostRadioGroupWithIndicator postRadioGro = m1.f(this.C.getView(), R.id.tabs_container);
          Map radioBtns = postRadioGro.getRadioBtns();
          if (radioBtns != null) {
             this.I = new RecordBeautySwitchEntrance(postRadioGro.getContext());
             RadioButton radioButton = radioBtns.get(Integer.valueOf(R.id.beauty_radio_btn));
             if (radioButton != null) {
                FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
                int i = (a.e())? a1.e(81.00f): a1.e(61.00f);
                layoutParams.leftMargin = i;
                layoutParams.gravity = (this.D.d())? 16: radioButton.getLineHeight() - a1.e(16.00f);
                if (this.D.a().s() || (this.D.a().t() == 1 && (!o2.b() && o2.a()))) {
                   this.D.a().V(true);
                   this.Ih();
                }
             label_00d5 :
                this.I.setListener(new n0(this));
                postRadioGro.addView(this.I, layoutParams);
                boolean b = o2.b();
                this.I.c(this.J, b);
                this.K = true;
                this.Kh(b);
                this.L = f.a(p0.class, new o0(this));
             }
          }
       }
    label_0101 :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RecordPrettifyFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       BaseFragment uBaseFragmen = PatchProxy.apply(null, this, RecordPrettifyFragment.class, "10");
       if (uBaseFragmen != PatchProxyResult.class) {
       }else {
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "page_key", this.A);
          uBaseFragmen = f0.a(this.D, uBundle);
       }
       this.C = uBaseFragmen;
       uBaseFragmen.gh(this.E);
       if (this.getActivity() != null) {
          try{
             e uoe = this.getChildFragmentManager().beginTransaction();
             uoe.w(R.id.prettify_fragment_container, this.C, "RecordPrettify");
             uoe.m();
          }catch(java.lang.IllegalArgumentException e3){
             PostUtils.x("prettify_exception", Log.getStackTraceString(e3));
          }
       }
    }
    public void q0(int p0){
       if (PatchProxy.isSupport(RecordPrettifyFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordPrettifyFragment.class, "20")) {
          return;
       }
       if (p0) {
          if (p0 != 1) {
             if (p0 != 2) {
                if (p0 == 3) {
                   w1.d(this.getActivity());
                }
             }else {
                w1.c(this.getActivity());
             }
          }else {
             w1.f(this.getActivity());
          }
       }else {
          w1.a(this.getActivity());
       }
       this.J = p0;
       if (!PatchProxy.isSupport(RecordPrettifyFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RecordPrettifyFragment.class, "22")) {
          RecordPrettifyFragment tI = this.I;
          if (tI != null && (!PatchProxy.isSupport(RecordBeautySwitchEntrance.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tI, RecordBeautySwitchEntrance.class, "5"))) {
             if (p0) {
                tI.a();
             }else {
                tI.b();
             }
          }
       }
       return;
    }
    public void r6(BaseFragment p0){
    }
}
