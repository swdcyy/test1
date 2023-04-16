package com.yxcorp.gifshow.settings.page.SettingItemListFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.settings.page.SettingItemListArguments;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.lang.CharSequence;
import qrd.l1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import fhc.b;
import g9c.a;
import java.util.Collection;
import ekd.m1;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import fhc.h;
import crd.a;
import java.util.Iterator;
import java.lang.Iterable;
import ehc.b;
import ehc.a;
import ehc.h;
import fhc.g;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import fhc.f;
import java.lang.Runnable;
import crd.b;
import crd.c;
import ehc.g;
import msd.a;
import android.view.LayoutInflater;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import ag6.a;

public class SettingItemListFragment extends BaseFragment implements d	// class@001b33
{
    public KwaiActionBar j;
    public View k;
    public RecyclerView l;
    public h m;
    public SettingItemListArguments n;

    public void SettingItemListFragment(){
       super(null, null, null, null, 15, null);
    }
    public final void ch(){
       l1 a;
       if (PatchProxy.applyVoid(null, this, SettingItemListFragment.class, "9")) {
          return;
       }
       SettingItemListFragment tn = this.n;
       String str = "divider";
       if (tn != null) {
          String title = tn.getTitle();
          if (title != null) {
             SettingItemListFragment tk = this.k;
             if (tk == null) {
                a.S(str);
             }
             tk.setVisibility(0);
             tk = this.j;
             if (tk == null) {
                a.S("actionBar");
             }
             tk.setVisibility(0);
             tk = this.j;
             if (tk == null) {
                a.S("actionBar");
             }
             tk.j(j.n(this.getActivity(), R.drawable.arg_RES_7f08068e, 0x7f060148));
             tk = this.j;
             if (tk == null) {
                a.S("actionBar");
             }
             tk.r(title);
             tn = this.j;
             if (tn == null) {
                a.S("actionBar");
             }
             if (tn.m(0) != null) {
             label_0077 :
                return;
             }
          }
       }
       tn = this.k;
       if (tn == null) {
          a.S(str);
       }
       tn.setVisibility(8);
       tn = this.j;
       if (tn == null) {
          a.S("actionBar");
       }
       tn.setVisibility(8);
       a = l1.a;
       goto label_0077 ;
    }
    public final void dh(){
       List items;
       if (PatchProxy.applyVoid(null, this, SettingItemListFragment.class, "10")) {
          return;
       }
       SettingItemListFragment tn = this.n;
       if (tn != null) {
          items = tn.getItems();
          if (items != null) {
          label_001b :
             SettingItemListFragment tl = this.l;
             if (tl == null) {
                a.S("itemList");
             }
             RecyclerView$Adapter adapter = tl.getAdapter();
             Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.yxcorp.gifshow.settings.page.SettingItemListAdapter");
             adapter.Q0().clear();
             adapter.Q0().addAll(items);
             adapter.k0();
             return;
          }
       }
       items = CollectionsKt__CollectionsKt.E();
       goto label_001b ;
    }
    public void doBindView(View p0){
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, SettingItemListFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       view = m1.f(p0, R.id.title_root);
       a.o(view, "ViewBindUtils.bindWidget\(view, R.id.title_root\)");
       this.j = view;
       view = m1.f(p0, R.id.tag_divider_line);
       a.o(view, "ViewBindUtils.bindWidget¡­w, R.id.tag_divider_line\)");
       this.k = view;
       p0 = m1.f(p0, R.id.item_list);
       a.o(p0, "ViewBindUtils.bindWidget\(view, R.id.item_list\)");
       this.l = p0;
       String str = "itemList";
       if (p0 == null) {
          a.S(str);
       }
       SettingItemListFragment tl = this.l;
       if (tl == null) {
          a.S(str);
       }
       p0.setLayoutManager(new LinearLayoutManager(tl.getContext()));
       SettingItemListFragment tl1 = this.l;
       if (tl1 == null) {
          a.S(str);
       }
       tl1.setAdapter(new b(this));
       return;
    }
    public final void eh(){
       h a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SettingItemListFragment.class, "7")) {
          return;
       }
       SettingItemListFragment tn = this.n;
       if (tn != null) {
          List items = tn.getItems();
          if (items != null) {
             SettingItemListFragment tm = this.m;
             if (tm == null) {
                a.S("redDotHelper");
             }
             Objects.requireNonNull(tm);
             if (!PatchProxy.applyVoidOneRefs(items, tm, h.class, "1")) {
                a.p(items, "items");
                tm.a();
                tm.a = new a();
                Iterator iterator1 = items.iterator();
                while (iterator1.hasNext()) {
                   b uob = iterator1.next();
                   if (!uob instanceof a) {
                      uob = objArray;
                   }
                   if (uob != null) {
                      h oh = uob.i();
                      if (oh == null || PatchProxy.applyVoidOneRefs(oh, tm, h.class, "3")) {
                         continue ;
                      }else {
                         g og1 = new g(oh);
                         oh.d();
                         oh.f().observe(tm.b, og1);
                         a = tm.a;
                         if (a != null) {
                            a.c(c.d(new f(oh, og1)));
                         }
                      }
                   }
                }
             }
             Iterator iterator = items.iterator();
             while (iterator.hasNext()) {
                g og = iterator.next().f();
                if (og != null) {
                   og.h();
                }
             }
          }
       }
       return;
    }
    public final void fh(SettingItemListArguments p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SettingItemListFragment.class, "8")) {
          return;
       }
       this.n = p0;
       p1.invoke();
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SettingItemListFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.c(p0, 0x7f0d14c7, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, SettingItemListFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       SettingItemListFragment tm = this.m;
       if (tm == null) {
          a.S("redDotHelper");
       }
       tm.a();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SettingItemListFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       LifecycleOwner viewLifecycl = this.getViewLifecycleOwner();
       a.o(viewLifecycl, "viewLifecycleOwner");
       this.m = new h(viewLifecycl);
       this.doBindView(p0);
       this.ch();
       this.dh();
       return;
    }
}
