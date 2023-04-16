package com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import hka.l;
import b9c.y;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.fragment.app.Fragment;
import lnc.s5;
import com.kwai.library.widget.viewpager.tabstrip.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import android.content.Context;
import java.lang.Integer;
import b9c.z;
import android.os.Bundle;
import java.lang.Boolean;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import androidx.viewpager.widget.ViewPager$i;
import hka.j;
import com.yxcorp.plugin.search.result.fragment.SearchResultTabFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import h3.a;
import java.util.ArrayList;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;

public abstract class TabHostFragment extends LazyInitSupportedFragment implements l, y	// class@0017ac
{
    public ViewPager$i A;
    public View s;
    public PagerSlidingTabStrip t;
    public ViewPager u;
    public a v;
    public int w;
    public int x;
    public String y;
    public ViewPager$i z;

    public void TabHostFragment(){
       super();
       this.x = -1;
       this.y = null;
       this.z = new TabHostFragment$a(this);
    }
    private int th(){
       Object obj = PatchProxy.apply(null, this, TabHostFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.sh() != null && this.v != null) {
          int i = this.yh(this.sh());
          if (i >= 0) {
             return i;
          }
       }
       return 0;
    }
    public int Ab(){
       Fragment obj = PatchProxy.apply(null, this, TabHostFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.isAdded()) {
          return 0;
       }
       obj = this.t();
       if (obj instanceof s5) {
          return obj.Ab();
       }
       return 0;
    }
    public int Ah(){
       return 0x7f0a3cb6;
    }
    public int Bh(){
       return 0x7f0a444e;
    }
    public void Ch(){
       if (PatchProxy.applyVoid(null, this, TabHostFragment.class, "5")) {
          return;
       }
       this.v = new a(this.getActivity(), this.getChildFragmentManager());
       return;
    }
    public boolean Dh(){
       return false;
    }
    public boolean Eh(){
       return true;
    }
    public void Fh(int p0){
       if (PatchProxy.isSupport2(TabHostFragment.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Integer.valueOf(p0), this, TabHostFragment.class, "1")) {
          return;
       }
       TabHostFragment tv = this.v;
       if (tv == null) {
          PatchProxy.onMethodExit(TabHostFragment.class, "1");
          return;
       }else {
          TabHostFragment tw = this.w;
          if (p0 != tw) {
             z.a(tv.a(tw), this.v.a(p0));
             this.w = p0;
          }
          PatchProxy.onMethodExit(TabHostFragment.class, "1");
          return;
       }
    }
    public void Gh(int p0,Bundle p1){
       if (PatchProxy.isSupport(TabHostFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, TabHostFragment.class, "15")) {
          return;
       }
       this.Hh(p0, p1, false);
       return;
    }
    public void Hh(int p0,Bundle p1,boolean p2){
       if (PatchProxy.isSupport(TabHostFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, TabHostFragment.class, "16")) {
          return;
       }
       this.v.C(p0, p1);
       this.u.setCurrentItem(p0, p2);
       return;
    }
    public void Ih(String p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TabHostFragment.class, "17")) {
          return;
       }
       TabHostFragment tv = this.v;
       if (tv == null) {
          return;
       }
       if (tv.c(p0) >= 0) {
          this.Gh(this.v.c(p0), p1);
       }
       return;
    }
    public void Jh(int p0){
       if (PatchProxy.isSupport(TabHostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TabHostFragment.class, "18")) {
          return;
       }
       this.u.setCurrentItem(p0, false);
       return;
    }
    public void Kh(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabHostFragment.class, "28")) {
          return;
       }
       this.v.D(p0);
       this.t.q();
       return;
    }
    public void Lh(String p0){
       this.y = p0;
    }
    public void Mh(int p0){
       this.x = p0;
    }
    public void Nh(int p0){
       if (PatchProxy.isSupport(TabHostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TabHostFragment.class, "7")) {
          return;
       }
       this.u.setOffscreenPageLimit(p0);
       return;
    }
    public void Oh(ViewPager$i p0){
       this.A = p0;
    }
    public void Ph(){
       if (PatchProxy.applyVoid(null, this, TabHostFragment.class, "35")) {
          return;
       }
       List list = this.wh();
       if (list != null && !list.isEmpty()) {
          TabHostFragment tv = this.v;
          if (tv != null) {
             tv.D(list);
          }
          TabHostFragment tt = this.t;
          if (tt != null) {
             tt.q();
          }
       }
    label_0026 :
       return;
    }
    public boolean S0(){
       return j.d(this);
    }
    public boolean S1(){
       return true;
    }
    public boolean Xg(){
       return this instanceof SearchResultTabFragment;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, TabHostFragment.class, "6")) {
          return;
       }
       Fragment uFragment = this.t();
       if (uFragment instanceof l) {
          uFragment.a();
       }
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, TabHostFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = this.uh(p0, p1, p2);
       this.s = view;
       if (view == null) {
          this.s = a.g(p0, this.getLayoutResId(), p1, false);
       }
       return this.s;
    }
    public int f(){
       Fragment obj = PatchProxy.apply(null, this, TabHostFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!this.isAdded()) {
          return 0;
       }
       obj = this.t();
       if (obj instanceof s5) {
          return obj.f();
       }
       return 0;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TabHostFragment.class, "4")) {
          return;
       }
       this.t = this.s.findViewById(this.Ah());
       this.u = this.s.findViewById(this.Bh());
       this.Ch();
       List list = this.wh();
       this.u.setAdapter(this.v);
       if (list != null && !list.isEmpty()) {
          this.v.D(list);
          this.w = this.th();
          boolean b = false;
          if (this.getArguments() != null) {
             String str = "last_selected_item_pos";
             if (this.getArguments().containsKey(str)) {
                this.u.setCurrentItem(this.getArguments().getInt(str), b);
             }
          }
          this.u.setCurrentItem(this.w, b);
       }
       this.t.setViewPager(this.u);
       this.t.setOnPageChangeListener(this.z);
       return;
    }
    public void g(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabHostFragment.class, "34")) {
          return;
       }
       TabHostFragment tu = this.u;
       if (tu != null) {
          tu.removeOnPageChangeListener(p0);
       }
       return;
    }
    public abstract int getLayoutResId();
    public void i(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabHostFragment.class, "33")) {
          return;
       }
       TabHostFragment tu = this.u;
       if (tu != null) {
          tu.addOnPageChangeListener(p0);
       }
       return;
    }
    public boolean i0(){
       return j.c(this);
    }
    public void mh(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabHostFragment.class, "27")) {
          return;
       }
       this.v.z(p0);
       this.t.q();
       return;
    }
    public boolean n5(){
       return j.e(this);
    }
    public List nh(){
       ArrayList obj = PatchProxy.apply(null, this, TabHostFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int currentItem = this.u.getCurrentItem();
       obj.add(this.rh(currentItem));
       int i = 1;
       while (i <= this.u.getOffscreenPageLimit()) {
          int i1 = currentItem + i;
          if (i1 < this.v.j()) {
             obj.add(this.rh(i1));
          }
          i1 = currentItem - i;
          if (i1 >= 0) {
             obj.add(this.rh(i1));
          }
          i = i + 1;
       }
       return obj;
    }
    public View oh(){
       return this.s;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TabHostFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.setHasOptionsMenu(true);
       PatchProxy.onMethodExit(TabHostFragment.class, "2");
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TabHostFragment.class, "29")) {
          return;
       }
       p0.putInt("last_selected_item_pos", this.ph());
       super.onSaveInstanceState(p0);
       PatchProxy.onMethodExit(TabHostFragment.class, "29");
       return;
    }
    public void onViewStateRestored(Bundle p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TabHostFragment.class, "30")) {
          return;
       }
       if (p0 != null) {
          int i = -1;
          int intx = p0.getInt("last_selected_item_pos", i);
          if (intx != i) {
             Bundle uBundle = (this.Eh())? p0: null;
             this.Gh(intx, uBundle);
          }
       }
       super.onViewStateRestored(p0);
       PatchProxy.onMethodExit(TabHostFragment.class, "30");
       return;
    }
    public int ph(){
       TabHostFragment obj = PatchProxy.apply(null, this, TabHostFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.u;
       if (obj != null) {
          return obj.getCurrentItem();
       }
       return this.th();
    }
    public String qh(){
       return "";
    }
    public Fragment rh(int p0){
       TabHostFragment obj;
       if (PatchProxy.isSupport(TabHostFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TabHostFragment.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.v;
       Fragment uFragment = (obj == null)? null: obj.a(p0);
       return uFragment;
    }
    public ViewPager s2(){
       return this.u;
    }
    public String sh(){
       TabHostFragment obj = PatchProxy.apply(null, this, TabHostFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.y)) {
          return this.y;
       }
       obj = this.x;
       if (obj >= null) {
          return this.xh(obj);
       }
       return this.qh();
    }
    public Fragment t(){
       Object obj = PatchProxy.apply(null, this, TabHostFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.rh(this.ph());
    }
    public boolean u2(){
       return false;
    }
    public View uh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       return null;
    }
    public PagerSlidingTabStrip$d vh(int p0){
       if (PatchProxy.isSupport(TabHostFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TabHostFragment.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.v.b(p0);
    }
    public abstract List wh();
    public boolean x0(){
       return j.a(this);
    }
    public String xh(int p0){
       if (PatchProxy.isSupport(TabHostFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, TabHostFragment.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.v.d(p0);
    }
    public int yh(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, TabHostFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       PatchProxy.onMethodExit(TabHostFragment.class, "11");
       return this.v.c(p0);
    }
    public PagerSlidingTabStrip zh(){
       return this.t;
    }
}
