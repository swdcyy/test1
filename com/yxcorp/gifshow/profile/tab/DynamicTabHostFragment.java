package com.yxcorp.gifshow.profile.tab.DynamicTabHostFragment;
import hka.l;
import b9c.y;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.profile.tab.DynamicTabHostFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.fragment.app.Fragment;
import lnc.s5;
import hka.j;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import androidx.viewpager.widget.ViewPager;
import x5c.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import android.content.Context;
import java.util.List;
import h3.a;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import b9c.z;

public abstract class DynamicTabHostFragment extends LazyInitSupportedFragment implements l, y	// class@0015c1
{
    public ViewPager$i A;
    public String s;
    public View t;
    public PagerSlidingTabStrip u;
    public ViewPager v;
    public b w;
    public int x;
    public int y;
    public ViewPager$i z;

    public void DynamicTabHostFragment(){
       super();
       this.s = null;
       this.y = -1;
       this.A = new DynamicTabHostFragment$a(this);
    }
    private int ph(){
       Object obj = PatchProxy.apply(null, this, DynamicTabHostFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.oh() != null && this.w != null) {
          int i = this.rh(this.oh());
          if (i >= 0) {
             return i;
          }
       }
       return 0;
    }
    public int Ab(){
       Fragment obj = PatchProxy.apply(null, this, DynamicTabHostFragment.class, "21");
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
    public boolean S0(){
       return j.d(this);
    }
    public boolean S1(){
       return true;
    }
    public boolean Xg(){
       return false;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, DynamicTabHostFragment.class, "6")) {
          return;
       }
       Fragment uFragment = this.t();
       if (uFragment instanceof l) {
          uFragment.a();
       }
       return;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DynamicTabHostFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, this.getLayoutResId(), p1, false);
       this.t = view;
       return view;
    }
    public int f(){
       Fragment obj = PatchProxy.apply(null, this, DynamicTabHostFragment.class, "20");
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DynamicTabHostFragment.class, "4")) {
          return;
       }
       this.u = this.t.findViewById(0x7f0a3cb6);
       this.v = this.t.findViewById(this.sh());
       if (!PatchProxy.applyVoid(null, this, DynamicTabHostFragment.class, "5")) {
          this.w = new b(this.getActivity(), this.getChildFragmentManager());
       }
       List list = this.qh();
       this.v.setAdapter(this.w);
       if (list != null && !list.isEmpty()) {
          this.w.B(list);
          this.x = this.ph();
          boolean b = false;
          if (this.getArguments() != null) {
             String str = "last_selected_item_pos";
             if (this.getArguments().containsKey(str)) {
                this.v.setCurrentItem(this.getArguments().getInt(str), b);
             }
          }
          this.v.setCurrentItem(this.x, b);
       }
       this.u.setViewPager(this.v);
       this.u.setOnPageChangeListener(this.A);
       return;
    }
    public void g(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTabHostFragment.class, "23")) {
          return;
       }
       DynamicTabHostFragment tv = this.v;
       if (tv != null) {
          tv.removeOnPageChangeListener(p0);
       }
       return;
    }
    public abstract int getLayoutResId();
    public void i(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTabHostFragment.class, "22")) {
          return;
       }
       DynamicTabHostFragment tv = this.v;
       if (tv != null) {
          tv.addOnPageChangeListener(p0);
       }
       return;
    }
    public boolean i0(){
       return j.c(this);
    }
    public int mh(){
       DynamicTabHostFragment obj = PatchProxy.apply(null, this, DynamicTabHostFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.v;
       if (obj != null) {
          return obj.getCurrentItem();
       }
       return this.ph();
    }
    public boolean n5(){
       return j.e(this);
    }
    public Fragment nh(int p0){
       DynamicTabHostFragment obj;
       if (PatchProxy.isSupport(DynamicTabHostFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, DynamicTabHostFragment.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.w;
       Fragment uFragment = (obj == null)? null: obj.a(p0);
       return uFragment;
    }
    public String oh(){
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicTabHostFragment obj = PatchProxy.apply(null, this, DynamicTabHostFragment.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.s)) {
          return this.s;
       }
       obj = this.y;
       if (obj < null) {
          return "";
       }
       if (PatchProxy.isSupport(DynamicTabHostFragment.class)) {
          str = PatchProxy.applyOneRefs(Integer.valueOf(obj), this, DynamicTabHostFragment.class, "9");
          if (str != patchProxyRe) {
          label_003e :
             return str;
          }
       }
       str = this.w.d(obj);
       goto label_003e ;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTabHostFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.setHasOptionsMenu(true);
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTabHostFragment.class, "18")) {
          return;
       }
       p0.putInt("last_selected_item_pos", this.mh());
       super.onSaveInstanceState(p0);
       return;
    }
    public void onViewStateRestored(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTabHostFragment.class, "19")) {
          return;
       }
       if (p0 != null) {
          int intx = p0.getInt("last_selected_item_pos", -1);
          if (intx != -1) {
             this.uh(intx);
          }
       }
       super.onViewStateRestored(p0);
       return;
    }
    public abstract List qh();
    public int rh(String p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       DynamicTabHostFragment obj = PatchProxy.applyOneRefs(p0, this, DynamicTabHostFragment.class, "11");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.w;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "18");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(TextUtils.isEmpty(p0)){
          int i1 = 0;
          while (true) {
             if (i1 < obj.f.size()) {
                b uob = obj.f.get(i1);
                if (uob != null && (uob.c() != null && p0.equals(uob.c().c()))) {
                   i = i1;
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }
          }
       }
       i = -1;
       return i;
    }
    public int sh(){
       return 0x7f0a444e;
    }
    public Fragment t(){
       Object obj = PatchProxy.apply(null, this, DynamicTabHostFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nh(this.mh());
    }
    public void th(int p0){
       if (PatchProxy.isSupport(DynamicTabHostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicTabHostFragment.class, "1")) {
          return;
       }
       DynamicTabHostFragment tw = this.w;
       if (tw == null) {
          return;
       }
       DynamicTabHostFragment tx = this.x;
       if (p0 != tx) {
          z.a(tw.a(tx), this.w.a(p0));
          this.x = p0;
       }
       return;
    }
    public boolean u2(){
       return false;
    }
    public void uh(int p0){
       if (PatchProxy.isSupport(DynamicTabHostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicTabHostFragment.class, "13")) {
          return;
       }
       this.v.setCurrentItem(p0, false);
       if (this.mh() == p0) {
          this.th(p0);
       }
       return;
    }
    public void vh(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DynamicTabHostFragment.class, "17")) {
          return;
       }
       this.w.B(p0);
       this.u.q();
       return;
    }
    public boolean x0(){
       return j.a(this);
    }
}
