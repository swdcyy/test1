package com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$a;
import nsd.u;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import rvc.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.CheckBox;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.os.Bundle;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import rvc.d;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import rvc.g;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$d;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$e;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$f;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import rvc.e;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffectFragment$g;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import java.util.HashMap;

public final class TransitionEffectFragment extends BaseFragment	// class@00151d
{
    public RecyclerView j;
    public CheckBox k;
    public View l;
    public g m;
    public TransitionEffectFragment$c n;
    public int o;
    public int p;
    public TransitionEffect q;
    public boolean r;
    public boolean s;
    public a t;
    public HashMap u;
    public static final TransitionEffectFragment$a v;

    static {
       TransitionEffectFragment.v = new TransitionEffectFragment$a(null);
    }
    public void TransitionEffectFragment(){
       super(null, null, null, null, 15, null);
       this.o = 0x7f0d0fd8;
       this.p = 0x7f0d162a;
       this.q = TransitionEffect.Companion.b();
       this.r = true;
    }
    public static final a ch(TransitionEffectFragment p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mAdapter");
       }
       return p0;
    }
    public static final CheckBox dh(TransitionEffectFragment p0){
       p0 = p0.k;
       if (p0 == null) {
          a.S("mCheckBox");
       }
       return p0;
    }
    public final void eh(TransitionEffect p0,boolean p1,TransitionEffectFragment$c p2,boolean p3,int p4,int p5){
       if (PatchProxy.isSupport(TransitionEffectFragment.class)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),p2,Boolean.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, TransitionEffectFragment.class, "4")) {
             return;
          }
       }
       a.p(p0, "initEffect");
       a.p(p2, "l");
       this.n = p2;
       this.r = p1;
       this.q = p0;
       this.s = p3;
       this.o = p4;
       this.p = p5;
       return;
    }
    public final void fh(){
       if (PatchProxy.applyVoid(null, this, TransitionEffectFragment.class, "12")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          c supportFragm = activity.getSupportFragmentManager();
          if (supportFragm != null) {
             e uoe = supportFragm.beginTransaction();
             a.o(uoe, "it.beginTransaction\(\)");
             uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
             uoe.s(this).m();
          }
       }
       return;
    }
    public final void gh(){
       if (PatchProxy.applyVoid(null, this, TransitionEffectFragment.class, "8")) {
          return;
       }
       TransitionEffectFragment tn = this.n;
       if (tn != null) {
          tn.a(this.q);
       }
       this.fh();
       return;
    }
    public final void hh(int p0,FragmentActivity p1){
       if (PatchProxy.isSupport(TransitionEffectFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, TransitionEffectFragment.class, "11")) {
          return;
       }
       a.p(p1, "activity");
       c supportFragm = p1.getSupportFragmentManager();
       a.o(supportFragm, "activity.supportFragmentManager");
       e uoe = supportFragm.beginTransaction();
       a.o(uoe, "fm.beginTransaction\(\)");
       uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       if (this.isAdded()) {
          if (!PatchProxy.applyVoid(null, this, TransitionEffectFragment.class, "6")) {
             TransitionEffectFragment tt = this.t;
             String str = "mAdapter";
             if (tt == null) {
                a.S(str);
             }
             tt.K0(this.q);
             tt = this.t;
             if (tt == null) {
                a.S(str);
             }
             tt.k0();
             if (this.q == TransitionEffect.Companion.b()) {
                tt = this.j;
                if (tt == null) {
                   a.S("mRecyclerView");
                }
                tt.scrollToPosition(0);
             }
             tt = this.k;
             if (tt == null) {
                a.S("mCheckBox");
             }
             tt.setChecked(this.r);
             tt = this.l;
             if (tt == null) {
                a.S("mRoot");
             }
             tt.setBackgroundResource(R.drawable.arg_RES_7f081870);
          }
          uoe.E(this);
       }else {
          Fragment uFragment = supportFragm.findFragmentByTag("transitionFragment");
          if (uFragment != null) {
             uoe.u(uFragment);
          }
          uoe.g(p0, this, "transitionFragment");
       }
       uoe.m();
       return;
    }
    public final void ih(TransitionEffect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransitionEffectFragment.class, "3")) {
          return;
       }
       a.p(p0, "effect");
       TransitionEffectFragment tt = this.t;
       if (tt == null) {
          a.S("mAdapter");
       }
       tt.K0(p0);
       TransitionEffectFragment tt1 = this.t;
       if (tt1 == null) {
          a.S("mAdapter");
       }
       tt1.k0();
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TransitionEffectFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!PatchProxy.applyVoid(null, this, TransitionEffectFragment.class, "5")) {
          this.t = new a(this.q, this.p);
          NpaLinearLayoutManager npaLinearLay = new NpaLinearLayoutManager(this.getContext(), 0, 0);
          d uod = new d(this);
          TransitionEffectFragment tj = this.j;
          if (tj == null) {
             a.S("mRecyclerView");
          }
          tj.removeItemDecoration(uod);
          tj = this.j;
          if (tj == null) {
             a.S("mRecyclerView");
          }
          tj.addItemDecoration(uod);
          TransitionEffectFragment tj1 = this.j;
          if (tj1 == null) {
             a.S("mRecyclerView");
          }
          tj1.setLayoutManager(npaLinearLay);
          TransitionEffectFragment tj2 = this.j;
          if (tj2 == null) {
             a.S("mRecyclerView");
          }
          tj1 = this.t;
          if (tj1 == null) {
             a.S("mAdapter");
          }
          tj2.setAdapter(tj1);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       e a;
       g og = g.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TransitionEffectFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       boolean b = false;
       View view = a.g(p0, this.o, p1, b);
       View view1 = view.findViewById(R.id.apply_all_checkbox);
       a.o(view1, "root.findViewById\(R.id.apply_all_checkbox\)");
       this.k = view1;
       String str = "mCheckBox";
       if (view1 == null) {
          a.S(str);
       }
       view1.setChecked(this.r);
       TransitionEffectFragment tk = this.k;
       if (tk == null) {
          a.S(str);
       }
       if (this.s == null) {
          b = 8;
       }
       tk.setVisibility(b);
       tk = this.k;
       if (tk == null) {
          a.S(str);
       }
       tk.setOnClickListener(new TransitionEffectFragment$d(this));
       view1 = view.findViewById(R.id.transition_recycler);
       a.o(view1, "root.findViewById\(R.id.transition_recycler\)");
       this.j = view1;
       view1 = view.findViewById(R.id.transition_des);
       a.o(view1, "root.findViewById\(R.id.transition_des\)");
       int i = (this.s != null)? 0x7f1005f3: 0x7f100cab;
       view1.setText(i);
       view1 = view.findViewById(R.id.transition_root);
       a.o(view1, "root.findViewById\(R.id.transition_root\)");
       this.l = view1;
       view.findViewById(R.id.transition_close).setOnClickListener(new TransitionEffectFragment$e(this));
       view.findViewById(R.id.transition_confirm).setOnClickListener(new TransitionEffectFragment$f(this));
       ViewModel viewModel = ViewModelProviders.of(this).get(og);
       a.o(viewModel, "ViewModelProviders.of\(th¡­ectViewModel::class.java\)");
       this.m = viewModel;
       if (viewModel == null) {
          a.S("viewModel");
       }
       Objects.requireNonNull(viewModel);
       Object[] objArray = null;
       viewModel = PatchProxy.apply(objArray, viewModel, og, "1");
       if (viewModel != PatchProxyResult.class) {
       }else {
          a = e.a;
          Objects.requireNonNull(a);
          MutableLiveData mutableLiveD = PatchProxy.apply(objArray, a, e.class, "1");
          if (mutableLiveD != PatchProxyResult.class) {
          }else {
             ImmutableMap immutableMap = TransitionEffect.Companion.c();
             ArrayList uArrayList = new ArrayList(immutableMap.size());
             Iterator iterator = immutableMap.entrySet().iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().getValue());
             }
             mutableLiveD = new MutableLiveData(uArrayList);
          }
       }
       viewModel.observe(this, new TransitionEffectFragment$g(this));
       return view;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, TransitionEffectFragment.class, "14")) {
       }else {
          TransitionEffectFragment tu = this.u;
          if (tu != null) {
             tu.clear();
          }
       }
       return;
    }
}
