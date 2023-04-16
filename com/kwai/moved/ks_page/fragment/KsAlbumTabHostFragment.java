package com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;
import dc7.h;
import com.yxcorp.gifshow.base.fragment.AlbumBaseFragment;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import com.kwai.library.widget.viewpager.tabstrip.a;
import dc7.g;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.ArrayList;
import androidx.viewpager.widget.ViewPager;
import android.view.View;
import java.lang.Integer;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import android.content.Context;
import dc7.f;
import androidx.viewpager.widget.ViewPager$i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import h3.a;
import java.lang.Boolean;

public abstract class KsAlbumTabHostFragment extends AlbumBaseFragment implements h	// class@000f6f
{
    public View i;
    public PagerSlidingTabStrip j;
    public ViewPager k;
    public a l;
    public int m;
    public int n;
    public String o;
    public ViewPager$i p;
    public ViewPager$i q;

    public void KsAlbumTabHostFragment(){
       super();
       this.n = -1;
       this.o = null;
       this.p = new KsAlbumTabHostFragment$a(this);
    }
    private int hh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.apply(null, this, KsAlbumTabHostFragment.class, "8");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (this.gh() != null && this.l != null) {
          obj = this.gh();
          Object obj1 = PatchProxy.applyOneRefs(obj, this, KsAlbumTabHostFragment.class, "11");
          int i = (obj1 != patchProxyRe)? obj1.intValue(): this.l.c(obj);
          if (i >= 0) {
             return i;
          }
       }
    label_003c :
       return 0;
    }
    public boolean S0(){
       return g.d(this);
    }
    public boolean S1(){
       return true;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, KsAlbumTabHostFragment.class, "6")) {
          return;
       }
       Fragment uFragment = this.t();
       if (uFragment instanceof h) {
          uFragment.a();
       }
       return;
    }
    public List ch(){
       ArrayList obj = PatchProxy.apply(null, this, KsAlbumTabHostFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       KsAlbumTabHostFragment tk = this.k;
       if (tk != null && this.l != null) {
          int currentItem = tk.getCurrentItem();
          obj.add(this.fh(currentItem));
          int i = 1;
          while (i <= this.k.getOffscreenPageLimit()) {
             int i1 = currentItem + i;
             if (i1 < this.l.j()) {
                obj.add(this.fh(i1));
             }
             i1 = currentItem - i;
             if (i1 >= 0) {
                obj.add(this.fh(i1));
             }
             i = i + 1;
          }
       }
       return obj;
    }
    public View dh(){
       return this.i;
    }
    public int eh(){
       KsAlbumTabHostFragment obj = PatchProxy.apply(null, this, KsAlbumTabHostFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.k;
       if (obj != null) {
          return obj.getCurrentItem();
       }
       return this.hh();
    }
    public Fragment fh(int p0){
       KsAlbumTabHostFragment obj;
       if (PatchProxy.isSupport(KsAlbumTabHostFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, KsAlbumTabHostFragment.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.l;
       Fragment uFragment = (obj == null)? null: obj.a(p0);
       return uFragment;
    }
    public String gh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       KsAlbumTabHostFragment obj = PatchProxy.apply(objArray, this, KsAlbumTabHostFragment.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!TextUtils.isEmpty(this.o)) {
          return this.o;
       }
       obj = this.n;
       if (obj < null) {
          return "";
       }
       if (PatchProxy.isSupport(KsAlbumTabHostFragment.class)) {
          Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(obj), this, KsAlbumTabHostFragment.class, "9");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
          label_0039 :
             KsAlbumTabHostFragment tl = this.l;
             if (tl != null) {
                objArray = tl.d(obj);
             }
          }
       }else {
          goto label_0039 ;
       }
       return objArray;
    }
    public boolean i0(){
       return g.c(this);
    }
    public abstract List ih();
    public PagerSlidingTabStrip jh(){
       return this.j;
    }
    public void kh(){
       if (PatchProxy.applyVoid(null, this, KsAlbumTabHostFragment.class, "5")) {
          return;
       }
       this.l = new a(this.getActivity(), this.getChildFragmentManager());
       return;
    }
    public void lh(int p0){
       if (PatchProxy.isSupport(KsAlbumTabHostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KsAlbumTabHostFragment.class, "1")) {
          return;
       }
       KsAlbumTabHostFragment tl = this.l;
       if (tl == null) {
          return;
       }
       Fragment uFragment = tl.a(this.m);
       if (p0 != this.m && (uFragment instanceof f && uFragment.isVisible())) {
          uFragment.c0();
       }
    label_0035 :
       uFragment = this.l.a(p0);
       if (uFragment instanceof f && uFragment.isVisible()) {
          uFragment.u();
       }
       if (this.m != p0) {
          this.m = p0;
       }
       return;
    }
    public void mh(ViewPager$i p0){
       this.q = p0;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumTabHostFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.setHasOptionsMenu(true);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, KsAlbumTabHostFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.onCreateView(p0, p1, p2);
       this.i = view;
       return view;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumTabHostFragment.class, "29")) {
          return;
       }
       p0.putInt("last_selected_item_pos", this.eh());
       super.onSaveInstanceState(p0);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsAlbumTabHostFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.j = p0.findViewById(0x7f0a3cb6);
       this.k = p0.findViewById(0x7f0a444e);
       this.kh();
       List list = this.ih();
       this.k.setAdapter(this.l);
       if (list != null && !list.isEmpty()) {
          this.l.D(list);
          this.l.q();
          this.m = this.hh();
          boolean b = false;
          if (this.getArguments() != null) {
             String str = "last_selected_item_pos";
             if (this.getArguments().containsKey(str)) {
                this.k.setCurrentItem(this.getArguments().getInt(str), b);
             }
          }
          this.k.setCurrentItem(this.m, b);
       }
       this.j.setViewPager(this.k);
       this.j.setOnPageChangeListener(this.p);
       return;
    }
    public void onViewStateRestored(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumTabHostFragment.class, "30")) {
          return;
       }
       if (p0 != null) {
          int i = -1;
          int intx = p0.getInt("last_selected_item_pos", i);
          if (intx != i && (!PatchProxy.isSupport(KsAlbumTabHostFragment.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(intx), p0, this, KsAlbumTabHostFragment.class, "15") && (!PatchProxy.isSupport(KsAlbumTabHostFragment.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(intx), p0, Boolean.FALSE, this, KsAlbumTabHostFragment.class, "16"))))) {
             this.l.C(intx, p0);
             this.k.setCurrentItem(intx, false);
          }
       }
       super.onViewStateRestored(p0);
       return;
    }
    public ViewPager s2(){
       return this.k;
    }
    public Fragment t(){
       Object obj = PatchProxy.apply(null, this, KsAlbumTabHostFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.fh(this.eh());
    }
    public boolean u2(){
       return false;
    }
    public boolean x0(){
       return g.a(this);
    }
}
