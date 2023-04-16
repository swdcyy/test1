package com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import hka.l;
import b9c.y;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2$a;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2$b;
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
import androidx.viewpager.widget.ViewPager$i;
import b9c.x;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import android.os.Bundle;
import android.content.Context;
import b9c.z;
import b9c.a0;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import gka.j;
import com.google.android.material.tabs.TabLayout$f;
import h3.a;
import java.util.Collection;
import ekd.q;
import com.google.android.material.tabs.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import i2b.a;
import androidx.fragment.app.c;
import com.google.android.material.tabs.TabLayout$g;
import com.google.android.material.tabs.TabLayout$c;

public abstract class TabHostFragmentV2 extends BaseFragment implements l, y	// class@0017af
{
    public TabLayout j;
    public ViewPager k;
    public i l;
    public int m;
    public final ViewPager$i n;
    public final TabLayout$d o;
    public static final int p;

    public void TabHostFragmentV2(){
       super();
       this.n = new TabHostFragmentV2$a(this);
       this.o = new TabHostFragmentV2$b(this);
    }
    public boolean S0(){
       return j.d(this);
    }
    public boolean S1(){
       return true;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TabHostFragmentV2.class, "5")) {
          return;
       }
       Fragment uFragment = this.t();
       if (uFragment instanceof l) {
          uFragment.a();
       }
       return;
    }
    public boolean ch(){
       return true;
    }
    public int dh(){
       TabHostFragmentV2 obj = PatchProxy.apply(null, this, TabHostFragmentV2.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.k;
       if (obj != null) {
          return obj.getCurrentItem();
       }
       return 0;
    }
    public Fragment eh(int p0){
       TabHostFragmentV2 obj;
       if (PatchProxy.isSupport(TabHostFragmentV2.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TabHostFragmentV2.class, "14");
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
    public abstract List fh();
    public void g(ViewPager$i p0){
       x.b(this, p0);
    }
    public abstract int getLayoutResId();
    public boolean gh(){
       return this instanceof VoicePartyTheaterTubeListTabFragment;
    }
    public Fragment hh(Class p0,Bundle p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TabHostFragmentV2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Fragment.instantiate(this.getContext(), p0.getName(), p1);
    }
    public void i(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabHostFragmentV2.class, "11")) {
          return;
       }
       TabHostFragmentV2 tk = this.k;
       if (tk != null) {
          tk.addOnPageChangeListener(p0);
       }
       return;
    }
    public boolean i0(){
       return j.c(this);
    }
    public void ih(int p0){
       if (PatchProxy.isSupport2(TabHostFragmentV2.class, "17") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, TabHostFragmentV2.class, "17")) {
          return;
       }
       TabHostFragmentV2 tl = this.l;
       if (tl == null) {
          PatchProxy.onMethodExit(TabHostFragmentV2.class, "17");
          return;
       }else {
          TabHostFragmentV2 tm = this.m;
          if (p0 != tm) {
             z.a(tl.z(tm), this.l.z(p0));
             this.m = p0;
          }
          this.k.post(new a0(this, p0));
          PatchProxy.onMethodExit(TabHostFragmentV2.class, "17");
          return;
       }
    }
    public void jh(int p0){
       if (PatchProxy.isSupport(TabHostFragmentV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TabHostFragmentV2.class, "15")) {
          return;
       }
       TabHostFragmentV2 tk = this.k;
       if (tk != null) {
          tk.setCurrentItem(p0, false);
       }
       return;
    }
    public void kh(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabHostFragmentV2.class, "7")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = p0.iterator();
       int i = 0;
       int i1 = 0;
       while (iterator.hasNext()) {
          j oj = iterator.next();
          Fragment uFragment = this.hh(oj.b(), oj.a());
          uArrayList.add(uFragment);
          oj.d(i1, uFragment);
          uArrayList1.add(oj.c());
          i1 = i1 + 1;
       }
       this.l.A(uArrayList);
       this.l.q();
       if (!q.f(uArrayList1)) {
          this.j.z();
          for (; i < uArrayList1.size(); i = i + 1) {
             this.j.b(uArrayList1.get(i));
          }
       }
       return;
    }
    public void lh(int p0){
       if (PatchProxy.isSupport(TabHostFragmentV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TabHostFragmentV2.class, "16")) {
          return;
       }
       TabHostFragmentV2 tk = this.k;
       if (tk != null) {
          tk.setOffscreenPageLimit(p0);
       }
       return;
    }
    public boolean n5(){
       return j.e(this);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, TabHostFragmentV2.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, this.getLayoutResId(), p1, false);
       this.j = view.findViewById(0x7f0a3c8b);
       this.k = view.findViewById(0x7f0a444e);
       PatchProxy.onMethodExit(TabHostFragmentV2.class, "1");
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, TabHostFragmentV2.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, TabHostFragmentV2.class, "3")) {
          i oi = new i(this.getChildFragmentManager());
          this.l = oi;
          this.k.setAdapter(oi);
          this.k.addOnPageChangeListener(this.n);
          this.k.addOnPageChangeListener(new TabLayout$g(this.j));
       }
       if (!PatchProxy.applyVoid(objArray, this, TabHostFragmentV2.class, "4")) {
          this.j.a(this.o);
       }
       List list = this.fh();
       if (!q.f(list)) {
          this.kh(list);
       }
       PatchProxy.onMethodExit(TabHostFragmentV2.class, "2");
       return;
    }
    public Fragment t(){
       Object obj = PatchProxy.apply(null, this, TabHostFragmentV2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.eh(this.dh());
    }
    public boolean u2(){
       return false;
    }
    public boolean x0(){
       return j.a(this);
    }
}
