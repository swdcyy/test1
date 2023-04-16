package com.yxcorp.gifshow.settings.holder.EntryListFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.settings.holder.EntryListFragment$a;
import ag6.a;
import java.util.List;
import com.yxcorp.gifshow.settings.holder.a;
import java.util.Collection;
import ok.o;
import com.google.common.collect.e;
import java.lang.Iterable;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.LinearLayout;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c$b;
import android.os.Bundle;
import java.util.Iterator;
import wgc.c;
import ml8.c;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import wgc.d;
import xgc.m;
import xgc.g;
import xgc.l;
import wgc.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import android.graphics.drawable.Drawable;
import zf6.j;
import wgc.m;
import android.view.View$OnClickListener;
import mrd.a;

public class EntryListFragment extends BaseFragment implements d	// class@001b28
{
    public View j;
    public KwaiActionBar k;
    public View l;
    public LinearLayout m;
    public List n;
    public String o;
    public c$b p;
    public boolean q;
    public c r;
    public static EntryListFragment$a s;

    public void EntryListFragment(){
       super();
    }
    public View ch(LayoutInflater p0,int p1,ViewGroup p2,boolean p3){
       EntryListFragment$a obj;
       if (PatchProxy.isSupport(EntryListFragment.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, EntryListFragment.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = EntryListFragment.s;
       if (obj != null) {
          return obj.a(p0, p1, p2, p3);
       }else {
          return a.c(p0, p1, p2, p3);
       }
    }
    public EntryListFragment dh(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EntryListFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.n = Lists.c(e.c(p0, a.b));
       return this;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EntryListFragment.class, "1")) {
          return;
       }
       this.l = m1.f(p0, 0x7f0a3cde);
       this.k = m1.f(p0, 0x7f0a3f6a);
       this.m = m1.f(p0, 0x7f0a45bb);
       this.j = m1.f(p0, 0x7f0a0953);
       return;
    }
    public EntryListFragment eh(int p0){
       if (PatchProxy.isSupport(EntryListFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, EntryListFragment.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.o = a.a().a().getString(p0);
       return this;
    }
    public EntryListFragment fh(String p0){
       this.o = p0;
       return this;
    }
    public String getUrl(){
       return "ks://entrylist";
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EntryListFragment.class, "4")) {
          return;
       }
       super.onAttach(p0);
       if (this.p != null) {
          this.getFragmentManager().registerFragmentLifecycleCallbacks(this.p, false);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, EntryListFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return this.ch(p0, 0x7f0d03fa, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, EntryListFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       EntryListFragment tn = this.n;
       if (tn != null) {
          Iterator iterator = tn.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next().q();
             if (uoc != null) {
                uoc.destroy();
             }
          }
       }
       return;
    }
    public void onDetach(){
       if (PatchProxy.applyVoid(null, this, EntryListFragment.class, "5")) {
          return;
       }
       super.onDetach();
       if (this.p != null) {
          this.getFragmentManager().unregisterFragmentLifecycleCallbacks(this.p);
       }
       return;
    }
    public void onResume(){
       int b;
       if (PatchProxy.applyVoid(null, this, EntryListFragment.class, "6")) {
          return;
       }
       super.onResume();
       if (this.n == null) {
          this.getActivity().finish();
          return;
       }else {
          int i = 0;
          while (true) {
             if (i < this.n.size()) {
                c uoc = this.n.get(i);
                if (this.q == null) {
                   uoc.a();
                }
                c uoc1 = uoc.q();
                if (uoc1 != null) {
                   d uod = uoc.h();
                   if (uod == null) {
                      break ;
                   }else if(PatchProxy.isSupport(EntryListFragment.class)){
                      c obj = PatchProxy.applyOneRefs(Integer.valueOf(i), this, EntryListFragment.class, "12");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else if(i >= 0){
                         b = this.n.size() - 1;
                         if (i < b) {
                            int i1 = i + 1;
                            obj = this.n.get(i1);
                            if (!obj instanceof m && (!obj instanceof g && !obj instanceof l)) {
                               b = true;
                            }
                         }
                      }
                      b = false;
                   }else {
                      goto label_0061 ;
                   }
                   uod.b = b;
                   uod.c = this;
                   uod.d = uoc.getModel();
                   Object[] objArray = new Object[]{uod};
                   uoc1.i(objArray);
                }
                i = i + 1;
             }else {
                this.q = true;
                return;
             }
          }
          return;
       }
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EntryListFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, EntryListFragment.class, "8") && !TextUtils.isEmpty(this.o)) {
          this.k.setVisibility(false);
          this.l.setVisibility(false);
          this.k.j(j.n(this.getActivity(), R.drawable.arg_RES_7f08068e, 0x7f060148));
          this.k.r(this.o);
          this.k.m(-1);
       }
       if (!PatchProxy.applyVoid(objArray, this, EntryListFragment.class, "9")) {
          if (this.n == null) {
             this.getActivity().finish();
          }else {
             LayoutInflater layoutInflat = LayoutInflater.from(this.getContext());
             this.m.removeAllViews();
             Iterator iterator = this.n.iterator();
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                View view = this.ch(layoutInflat, uoc.y0(), this.m, false);
                view.setOnClickListener(new m(uoc));
                d uod = uoc.h();
                if (uod != null) {
                   uod.f = view;
                }
                this.m.addView(view);
                uoc = uoc.q();
                if (uoc != null) {
                   uoc.f(view);
                }
             }
          }
       }
       this.r = a.g();
       return;
    }
}
