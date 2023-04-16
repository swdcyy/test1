package com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment$mCompositeDisposable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashMap;
import crd.a;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.a;
import android.view.Window;
import android.app.Activity;
import lnc.g2;
import ey4.a;
import lnc.g2$a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment$a;
import lnc.a1;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment$b;
import erd.g;
import com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment$c;
import crd.b;
import lnc.b9;
import android.view.KeyEvent;
import com.kuaishou.tuna.plc.dynamic_container.AbsPlcDynamicMVPsFragment$d;
import java.lang.Runnable;

public abstract class AbsPlcDynamicMVPsFragment extends BaseFragment	// class@000fc5
{
    public g2 j;
    public AbsPlcDynamicMVPsFragment$a k;
    public Fragment l;
    public View m;
    public View n;
    public final p o;
    public HashMap p;

    public void AbsPlcDynamicMVPsFragment(){
       super(null, null, null, null, 15, null);
       this.o = s.c(AbsPlcDynamicMVPsFragment$mCompositeDisposable$2.INSTANCE);
    }
    public abstract PresenterV2 B2();
    public void ch(){
       if (PatchProxy.applyVoid(null, this, AbsPlcDynamicMVPsFragment.class, "11")) {
          return;
       }
       AbsPlcDynamicMVPsFragment tp = this.p;
       if (tp != null) {
          tp.clear();
       }
       return;
    }
    public void dh(){
    }
    public void eh(){
    }
    public void fh(){
    }
    public final a gh(){
       Object obj = PatchProxy.apply(null, this, AbsPlcDynamicMVPsFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o.getValue();
    }
    public abstract void hh();
    public ArrayList ih(){
       return null;
    }
    public abstract void jh();
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsPlcDynamicMVPsFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       if (this.getView() == null) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       a.m(activity);
       a.o(activity, "activity!!");
       Window window = activity.getWindow();
       a.m(window);
       window.setSoftInputMode(34);
       super.onActivityCreated(p0);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsPlcDynamicMVPsFragment.class, "2")) {
          return;
       }
       this.fh();
       if (!PatchProxy.applyVoid(null, this, AbsPlcDynamicMVPsFragment.class, "9")) {
          this.j = new g2(this, new a(this));
       }
       this.dh();
       super.onCreate(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       RxFragment rxFragment1;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AbsPlcDynamicMVPsFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       boolean b = false;
       View view = a.g(p0, R.layout.arg_RES_7f0d04fe, p1, b);
       this.m = view;
       RxFragment rxFragment = null;
       view = (view != null)? view.findViewById(R.id.fl_dynamic_content): rxFragment;
       this.n = view;
       AbsPlcDynamicMVPsFragment tk = this.k;
       Fragment uFragment = (tk != null)? tk.a(): rxFragment;
       if (uFragment != null && a1.i(this.getActivity())) {
          b = true;
       }
       if (b) {
          this.l = uFragment;
          e uoe = this.getChildFragmentManager().beginTransaction();
          a.m(uFragment);
          uoe.v(R.id.fl_dynamic_content_fragment, uFragment);
          uoe.o();
          tk = this.l;
          if (tk instanceof RxFragment) {
             rxFragment = tk;
          }
          if (rxFragment != null) {
             t ot = rxFragment.m();
             if (ot != null) {
                ot = ot.doOnSubscribe(new AbsPlcDynamicMVPsFragment$b(this));
                if (ot != null) {
                   ot.subscribe(new AbsPlcDynamicMVPsFragment$c(this));
                }
             }
          }
       }else {
          this.jh();
       }
    label_0088 :
       return this.m;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AbsPlcDynamicMVPsFragment.class, "6")) {
          return;
       }
       super.onDestroy();
       b9.a(this.gh());
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.ch();
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return false;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AbsPlcDynamicMVPsFragment.class, "5")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.eh();
       p0.post(new AbsPlcDynamicMVPsFragment$d(this));
       return;
    }
}
