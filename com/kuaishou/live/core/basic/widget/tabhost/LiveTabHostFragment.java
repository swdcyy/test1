package com.kuaishou.live.core.basic.widget.tabhost.LiveTabHostFragment;
import hka.l;
import b9c.y;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.core.basic.widget.tabhost.a;
import com.kuaishou.live.core.basic.widget.tabhost.LiveTabHostFragment$a;
import hka.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.viewpager.widget.ViewPager;
import java.lang.Integer;
import gka.i;
import java.util.List;
import android.os.Bundle;
import android.content.Context;
import androidx.viewpager.widget.ViewPager$i;
import b9c.x;
import b9c.z;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import e22.b;
import e22.c;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import e22.a;
import java.util.Objects;
import java.util.Collection;
import h3.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.view.LayoutInflater;
import android.view.View;
import i2b.a;
import androidx.fragment.app.c;
import ekd.q;

public abstract class LiveTabHostFragment extends BaseFragment implements l, y	// class@00091c
{
    public PagerSlidingTabStrip j;
    public ViewPager k;
    public b l;
    public final a m;
    public int n;
    public final ViewPager$i o;
    public static final int p;

    public void LiveTabHostFragment(){
       super();
       this.m = new a();
       this.o = new LiveTabHostFragment$a(this);
    }
    public boolean S0(){
       return j.d(this);
    }
    public boolean S1(){
       return true;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveTabHostFragment.class, "5")) {
          return;
       }
       Fragment uFragment = this.t();
       if (uFragment instanceof l) {
          uFragment.a();
       }
       return;
    }
    public int ch(){
       LiveTabHostFragment obj = PatchProxy.apply(null, this, LiveTabHostFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.k;
       if (obj != null) {
          return obj.getCurrentItem();
       }
       return 0;
    }
    public Fragment dh(int p0){
       LiveTabHostFragment obj;
       if (PatchProxy.isSupport(LiveTabHostFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveTabHostFragment.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.l;
       if (obj == null) {
          return null;
       }else {
          return obj.z(p0);
       }
    }
    public abstract List eh();
    public Fragment fh(Class p0,Bundle p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveTabHostFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Fragment.instantiate(this.getContext(), p0.getName(), p1);
    }
    public void g(ViewPager$i p0){
       x.b(this, p0);
    }
    public abstract int getLayoutResId();
    public void gh(int p0){
       if (PatchProxy.isSupport(LiveTabHostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveTabHostFragment.class, "17")) {
          return;
       }
       LiveTabHostFragment tl = this.l;
       if (tl == null) {
          return;
       }
       LiveTabHostFragment tn = this.n;
       if (p0 != tn) {
          z.a(tl.z(tn), this.l.z(p0));
          this.n = p0;
          this.m.a(this.l.b(p0));
       }
       this.k.post(new c(this, p0));
       return;
    }
    public void hh(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTabHostFragment.class, "7")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       int i = 0;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          Fragment uFragment = this.fh(uoa.a, uoa.b);
          uArrayList.add(uFragment);
          uoa.a(i, uFragment);
          uArrayList1.add(uoa.c);
          i = i + 1;
       }
       LiveTabHostFragment tl = this.l;
       Objects.requireNonNull(tl);
       if (!PatchProxy.applyVoidOneRefs(uArrayList1, tl, b.class, "1")) {
          tl.l.clear();
          tl.l.addAll(uArrayList1);
       }
       this.l.A(uArrayList);
       this.l.q();
       this.j.q();
       return;
    }
    public void i(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTabHostFragment.class, "11")) {
          return;
       }
       LiveTabHostFragment tk = this.k;
       if (tk != null) {
          tk.addOnPageChangeListener(p0);
       }
       return;
    }
    public boolean i0(){
       return j.c(this);
    }
    public boolean n5(){
       return j.e(this);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveTabHostFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, this.getLayoutResId(), p1, false);
       this.j = view.findViewById(0x7f0a3c8b);
       this.k = view.findViewById(0x7f0a444e);
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveTabHostFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveTabHostFragment.class, "3")) {
          b uob = new b(this.getChildFragmentManager());
          this.l = uob;
          this.k.setAdapter(uob);
          this.k.addOnPageChangeListener(this.o);
          this.j.setViewPager(this.k);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveTabHostFragment.class, "4")) {
          this.j.setViewPager(this.k);
       }
       List list = this.eh();
       if (!q.f(list)) {
          this.hh(list);
       }
       return;
    }
    public Fragment t(){
       Object obj = PatchProxy.apply(null, this, LiveTabHostFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.dh(this.ch());
    }
    public boolean u2(){
       return false;
    }
    public boolean x0(){
       return j.a(this);
    }
}
