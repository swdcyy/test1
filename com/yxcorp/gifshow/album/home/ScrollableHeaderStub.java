package com.yxcorp.gifshow.album.home.ScrollableHeaderStub;
import s79.a;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub$a;
import nsd.u;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub$scrollableLayout$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub$mViewPager$2;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub$mTopCustomArea$2;
import androidx.lifecycle.ViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import w69.d0;
import com.yxcorp.gifshow.album.widget.ScrollableLayout;
import com.kwai.robust.PatchProxyResult;
import w69.e;
import z69.f0;
import java.util.HashMap;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import android.view.View;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub$b;
import com.yxcorp.gifshow.album.widget.ScrollableLayout$d;
import com.yxcorp.gifshow.album.home.ScrollableHeaderStub$c;
import com.yxcorp.gifshow.album.widget.ScrollableLayout$c;
import o79.i;
import android.widget.LinearLayout;
import java.lang.Boolean;
import androidx.viewpager.widget.ViewPager;
import z69.b0;
import androidx.viewpager.widget.ViewPager$i;
import z69.c0;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import z69.d0;
import androidx.recyclerview.widget.RecyclerView$r;
import z69.e0;
import com.kwai.moved.ks_page.fragment.KsAlbumTabHostFragment;

public final class ScrollableHeaderStub extends a	// class@001a1c
{
    public d0 e;
    public String f;
    public final List g;
    public e h;
    public final p i;
    public final p j;
    public final p k;
    public boolean l;
    public int m;
    public boolean n;
    public HashMap o;
    public static final String p = "debug_tag";
    public static final float q = 0.333333;
    public static final ScrollableHeaderStub$a r;

    static {
       ScrollableHeaderStub.r = new ScrollableHeaderStub$a(null);
       ScrollableHeaderStub.p = "debug_tag";
       ScrollableHeaderStub.q = 0.33f;
    }
    public void ScrollableHeaderStub(AlbumHomeFragment p0){
       a.q(p0, "host");
       super(p0);
       this.g = new ArrayList();
       this.i = s.c(new ScrollableHeaderStub$scrollableLayout$2(p0));
       this.j = s.c(new ScrollableHeaderStub$mViewPager$2(p0));
       this.k = s.c(new ScrollableHeaderStub$mTopCustomArea$2(p0));
    }
    public void b(ViewModel p0){
       ScrollableHeaderStub scrollableHe = ScrollableHeaderStub.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, scrollableHe, "6")) {
          return;
       }
       super.b(p0);
       ScrollableHeaderStub te = this.e;
       int i = 0;
       int i1 = (te != null)? te.h(): 0;
       this.m = i1;
       this.m().setHeaderScrollHeight(this.m);
       Object[] objArray = null;
       f0 uof0 = PatchProxy.apply(objArray, this, scrollableHe, "7");
       if (uof0 != PatchProxyResult.class) {
       }else {
          uof0 = new f0(this);
       }
       this.h = uof0;
       ScrollableHeaderStub te1 = this.e;
       if (te1 != null) {
          te1.f(uof0);
       }
       HashMap hashMap = new HashMap();
       te1 = this.f;
       if (te1 != null) {
          hashMap.put("taskId", te1);
       }
       te1 = this.e;
       if (te1 != null) {
          objArray = te1.c(hashMap);
       }
       Log.b(ScrollableHeaderStub.p, "onBind: headerFragment:"+objArray);
       if (objArray != null) {
          c childFragmen = this.e().getChildFragmentManager();
          a.h(childFragmen, "mHost.childFragmentManager");
          e uoe = childFragmen.beginTransaction();
          uoe.v(R.id.top_custom_area, objArray);
          uoe.m();
       }
       this.k().setVisibility(i);
       this.m().setScrollEnabled(i);
       ScrollableLayout scrollableLa = this.m();
       float f = (float)this.m;
       float q = ScrollableHeaderStub.q;
       scrollableLa.i = (int)(f * q);
       scrollableLa.h = (int)(f * ((float)1 - q));
       this.m().setHeader(this.k());
       this.m().setScrollListProvider(new ScrollableHeaderStub$b(this));
       this.m().setHeaderScrolledListener(new ScrollableHeaderStub$c(this));
       this.m().setBackgroundColor(i.a(R.color.arg_RES_7f060b27));
       this.m().h(i, i);
       te = this.e;
       if (te != null) {
          i = te.g();
       }
       this.m().setAutoScrollEnable((i ^ 0x01));
       if (!PatchProxy.isSupport(scrollableHe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(i), this, scrollableHe, "8")) {
          this.l().addOnPageChangeListener(new b0(this, i));
          this.l().post(new c0(this, i));
       }
       return;
    }
    public final void h(boolean p0,int p1){
       if (PatchProxy.isSupport(ScrollableHeaderStub.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, ScrollableHeaderStub.class, "9")) {
          return;
       }
       RecyclerView recyclerView = this.i();
       if (recyclerView != null && this.m().e()) {
          if (recyclerView.canScrollVertically(-1)) {
             ScrollableHeaderStub th = this.h;
             if (th != null) {
                th.l3();
             }
             Log.b("albumAni", "onPageSelected collapse");
          }
          if (this.g.get(p1).booleanValue()) {
             return;
          }else {
             this.g.set(p1, Boolean.TRUE);
             if (p0) {
                if (!PatchProxy.applyVoidOneRefs(recyclerView, this, ScrollableHeaderStub.class, "11")) {
                   recyclerView.setOverScrollMode(2);
                   recyclerView.addOnScrollListener(new d0(this));
                }
             }else if(PatchProxy.applyVoidOneRefs(recyclerView, this, ScrollableHeaderStub.class, "10")){
                recyclerView.addOnScrollListener(new e0(this));
             }
          }
       }
    label_007e :
       return;
    }
    public final RecyclerView i(){
       Object[] objArray = null;
       Fragment obj = PatchProxy.apply(objArray, this, ScrollableHeaderStub.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e().t();
       if (obj != null) {
          View view = obj.getView();
          if (view != null) {
             objArray = view.findViewById(0x7f0a01e3);
          }
       }
       return objArray;
    }
    public final e j(){
       return this.h;
    }
    public View j0(){
       Object obj = PatchProxy.apply(null, this, ScrollableHeaderStub.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e().dh();
    }
    public final View k(){
       Object obj = PatchProxy.apply(null, this, ScrollableHeaderStub.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final ViewPager l(){
       Object obj = PatchProxy.apply(null, this, ScrollableHeaderStub.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final ScrollableLayout m(){
       Object obj = PatchProxy.apply(null, this, ScrollableHeaderStub.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final void n(int p0){
       ScrollableHeaderStub scrollableHe = ScrollableHeaderStub.class;
       if (PatchProxy.isSupport(scrollableHe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, scrollableHe, "12")) {
          return;
       }
       int i = 1;
       if (p0 == i || (p0 == 2 && this.m().d())) {
          this.m().h(false, i);
          Log.b(ScrollableHeaderStub.p, "scrollIfNeed");
       }
       return;
    }
}
