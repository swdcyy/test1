package com.yxcorp.gifshow.growth.framework.GrowthListFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import pna.j;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment$backward$1;
import android.app.Activity;
import msd.l;
import pna.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment$inflate$$inlined$apply$lambda$1;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$d;
import zqa.b$e;
import com.yxcorp.gifshow.growth.util.GrowthCommonExtKt;
import zqa.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestLayout$Companion$SubTitleScope;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment$select$1;
import java.util.Objects;
import zqa.b$h;
import zqa.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import java.lang.CharSequence;
import android.content.res.Resources;
import com.yxcorp.gifshow.growth.framework.GrowthListFragment$initActionBar$1;
import android.view.View$OnClickListener;
import pna.d;
import pna.e;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import z8c.a;
import androidx.recyclerview.widget.RecyclerView$n;

public final class GrowthListFragment extends BaseFragment implements d	// class@001377
{
    public View j;
    public TextView k;
    public TextView l;
    public RecyclerView m;
    public j n;
    public ArrayList o;

    public void GrowthListFragment(){
       super(null, null, null, null, 15, null);
       this.n = super();
       this.o = new ArrayList();
    }
    public final void ch(){
       if (PatchProxy.applyVoid(null, this, GrowthListFragment.class, "6")) {
          return;
       }
       if (a.g(CollectionsKt___CollectionsKt.b5(this.o), CollectionsKt___CollectionsKt.b5(this.n.e))) {
          this.dh();
          return;
       }else if(this.n.b == 1){
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             a.a(activity, this.n.a, "当前已选择"+this.o.size()+"项, 是否保存修改", "保存", "取消", new GrowthListFragment$backward$1(this));
          }
       }else {
          FragmentActivity activity1 = this.getActivity();
          if (activity1 != null) {
             activity1.finish();
          }
       }
       return;
    }
    public final boolean dh(){
       FragmentActivity obj = PatchProxy.apply(null, this, GrowthListFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.o = new ArrayList(this.n.e);
       obj = this.getActivity();
       if (obj != null) {
          obj.finish();
       }
       return true;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthListFragment.class, "3")) {
          return;
       }
       a.p(p0, "rootView");
       this.j = m1.f(this.getView(), 0x7f0a1716);
       this.k = m1.f(this.getView(), 0x7f0a3f7b);
       this.l = m1.f(this.getView(), 0x7f0a3643);
       this.m = m1.f(this.getView(), 0x7f0a34da);
       return;
    }
    public final boolean eh(){
       Object obj = PatchProxy.apply(null, this, GrowthListFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.ch();
       return true;
    }
    public final j fh(){
       return this.n;
    }
    public String getUrl(){
       return "ks://growth_list";
    }
    public final GrowthTestLayout gh(GrowthTestLayout p0){
       GrowthListFragment$inflate$$inlined$apply$lambda$1 obj = PatchProxy.applyOneRefs(p0, this, GrowthListFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GrowthListFragment$inflate$$inlined$apply$lambda$1(this);
       if (!PatchProxy.applyVoidOneRefs(obj, p0, GrowthTestLayout.class, "4")) {
          a.p(obj, "titleScope");
          obj.invoke(new GrowthTestLayout$Companion$d(p0.a, null));
       }
       return p0;
    }
    public final void hh(){
       if (PatchProxy.applyVoid(null, this, GrowthListFragment.class, "12")) {
          return;
       }
       GrowthListFragment tm = this.m;
       if (tm != null) {
          tm.setAdapter(new a(this.gh(new GrowthTestLayout())));
          tm.scrollToPosition(GrowthCommonExtKt.a(tm));
       }
       return;
    }
    public final void ih(GrowthTestLayout$Companion$SubTitleScope p0,String p1,int p2){
       if (PatchProxy.isSupport(GrowthListFragment.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, GrowthListFragment.class, "11")) {
          return;
       }
       boolean b = this.o.contains(Integer.valueOf(p2));
       j c = this.n.c;
       GrowthListFragment$select$1 oselect$1 = new GrowthListFragment$select$1(this, p2);
       Objects.requireNonNull(p0);
       if (!PatchProxy.isSupport(GrowthTestLayout$Companion$SubTitleScope.class) || !PatchProxy.applyVoidFourRefs(p1, Boolean.valueOf(b), Integer.valueOf(c), oselect$1, p0, GrowthTestLayout$Companion$SubTitleScope.class, "8")) {
          a.p(p1, "title");
          a.p(oselect$1, "onSelect");
          b$h oh = new b$h(p1, b, c, oselect$1);
          GrowthTestLayout$Companion$SubTitleScope b1 = p0.b;
          if (b1 != null) {
             b1.d(oh);
          }else {
             p0.a.add(oh);
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, GrowthListFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0562, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       GrowthListFragment tm;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GrowthListFragment.class, "4")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       if (!PatchProxy.applyVoid(null, this, GrowthListFragment.class, "5")) {
          tm = this.j;
          if (tm != null) {
             GrowthListFragment tk = this.k;
             if (tk != null) {
                GrowthListFragment tl = this.l;
                if (tl != null) {
                   tk.setText(this.n.a);
                   if (this.n.b == 1) {
                      tl.setVisibility(false);
                      tl.setText(this.getResources().getString(R.string.arg_RES_7f1007e2));
                      tl.setOnClickListener(new GrowthListFragment$initActionBar$1(this));
                      tm.setOnClickListener(new d(this));
                   }else {
                      tm.setOnClickListener(new e(this));
                      tl.setVisibility(8);
                   }
                }
             }
          }
       }
       Context context = p0.getContext();
       a.o(context, "view.context");
       if (!PatchProxy.applyVoidOneRefs(context, this, GrowthListFragment.class, "9")) {
          tm = this.m;
          if (tm != null) {
             tm.setLayoutManager(new LinearLayoutManager(context));
             tm.addItemDecoration(new a(1, false, false));
             tm.setAdapter(new a(this.gh(new GrowthTestLayout())));
          }
       }
       return;
    }
}
