package com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b9c.b0;
import b9c.w;
import b9c.a;
import b9c.c;
import nsd.u;
import java.util.ArrayList;
import java.lang.reflect.Type;
import rq.a;
import java.util.Collection;
import ekd.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import pw8.a;
import pw8.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import com.kwai.library.widget.viewpager.tabstrip.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.share.copywriting.ShareCopyWritingListFragment;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.f;
import qvb.n0;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import ag6.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import androidx.viewpager.widget.ViewPager;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.lang.Boolean;
import java.util.List;
import android.widget.FrameLayout;
import androidx.fragment.app.c;
import pw8.d;
import com.yxcorp.gifshow.activity.share.copywriting.CopyWritingList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import h3.a;
import com.kwai.sdk.switchconfig.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import pw8.b;
import androidx.viewpager.widget.ViewPager$i;
import pw8.c;
import java.lang.Runnable;

public final class ShareCopyWritingFragment extends BaseFragment	// class@00137d
{
    public PagerSlidingTabStrip j;
    public ViewPager k;
    public e l;
    public KwaiEmptyStateView m;
    public String n;
    public String o;
    public String p;
    public int q;
    public CopyWritingList r;
    public d s;
    public final List t;

    public void ShareCopyWritingFragment(){
       ArrayList uArrayList;
       super(null, null, null, null, 15, null);
       this.n = "";
       this.o = "";
       this.p = "";
       if (!q.f(a.D(ArrayList.class))) {
          uArrayList = a.D(ArrayList.class);
          a.o(uArrayList, "DefaultPreferenceHelper.¡­ig\(ArrayList::class.java\)");
       }else {
          uArrayList = a.a;
          a.o(uArrayList, "TAB_LIST");
       }
       this.t = uArrayList;
       return;
    }
    public static final e ch(ShareCopyWritingFragment p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("pageAdapter");
       }
       return p0;
    }
    public final void dh(String p0,String p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareCopyWritingFragment.class, "6")) {
          return;
       }
       a.p(p0, "originText");
       a.p(p1, "searchText");
       Object[] objArray = new Object[0];
       a.b().w("ShareCopyWritingFragment", "updateSearchText\(\) called with: originText = "+p0+", searchText = "+p1, objArray);
       this.n = p0;
       this.o = p1;
       ShareCopyWritingFragment tl = this.l;
       if (tl == null) {
          return;
       }
       if (tl == null) {
          a.S("pageAdapter");
       }
       Objects.requireNonNull(tl);
       String str = "<set-?>";
       if (!PatchProxy.applyVoidOneRefs(p0, tl, uoe, "2")) {
          a.p(p0, str);
          tl.o = p0;
       }
       tl = this.l;
       if (tl == null) {
          a.S("pageAdapter");
       }
       Objects.requireNonNull(tl);
       if (!PatchProxy.applyVoidOneRefs(p1, tl, uoe, "3")) {
          a.p(p1, str);
          tl.p = p1;
       }
       ShareCopyWritingFragment tl1 = this.l;
       if (tl1 == null) {
          a.S("pageAdapter");
       }
       int i = tl1.j();
       if (i >= 0) {
          int i1 = 0;
          ShareCopyWritingFragment tl2 = this.l;
          while (tl2 == null) {
             a.S("pageAdapter");
             break ;
             i1 = i1 + 1;
          }
          Fragment uFragment = tl2.a(i1);
          if (uFragment instanceof ShareCopyWritingListFragment) {
             Objects.requireNonNull(uFragment);
             if (!PatchProxy.applyVoidTwoRefs(p0, p1, uFragment, ShareCopyWritingListFragment.class, "14")) {
                a.p(p0, "originText");
                a.p(p1, "searchText");
                Object[] objArray1 = new Object[0];
                a.b().w("ShareCopyWritingListFg", "updateSearchText\(\) called with: "+"originText = "+p0+", searchText ="+p1+" , tabName="+uFragment.M, objArray1);
                uFragment.H = p0;
                uFragment.I = p1;
                uFragment.J = null;
                if (uFragment.N != null || uFragment.O == uFragment.P) {
                   i oi = uFragment.q();
                   a.o(oi, "pageList");
                   if (!oi instanceof f || (oi.isLoading() || uFragment.Q != null)) {
                      uFragment.Q = true;
                      uFragment.R.removeMessages(0);
                      uFragment.R.sendEmptyMessageDelayed(0, 300);
                   }else {
                      uFragment.a();
                   }
                }
             }
          }
          if (i1 != i) {
             goto label_011d ;
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ShareCopyWritingFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.c(LayoutInflater.from(this.getContext()), 0x7f0d14dc, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       boolean b1;
       String str;
       ShareCopyWritingFragment tk2;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShareCopyWritingFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       view = p0.findViewById(R.id.tab_strip);
       a.o(view, "view.findViewById\(R.id.tab_strip\)");
       this.j = view;
       view = p0.findViewById(R.id.view_pager);
       a.o(view, "view.findViewById\(R.id.view_pager\)");
       this.k = view;
       p0 = p0.findViewById(R.id.empty_view);
       a.o(p0, "view.findViewById\(R.id.empty_view\)");
       this.m = p0;
       Object[] objArray = null;
       p0 = PatchProxy.apply(objArray, this, ShareCopyWritingFragment.class, "4");
       boolean b = true;
       int i = 0;
       if (p0 != PatchProxyResult.class) {
          b1 = p0.booleanValue();
       }else if(this.t.isEmpty()){
          tk2 = this.m;
          str = "emptyView";
          if (tk2 == null) {
             a.S(str);
          }
          tk2.setVisibility(i);
          tk2 = this.m;
          if (tk2 == null) {
             a.S(str);
          }
          tk2.setRetryBtnVisibility(4);
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          return;
       }else if(PatchProxy.applyVoid(objArray, this, ShareCopyWritingFragment.class, "5")){
          Object[] objArray1 = new Object[i];
          a.b().w("ShareCopyWritingFragment", "initViewPager\(\) called", objArray1);
          ShareCopyWritingFragment tk = this.k;
          if (tk == null) {
             a.S("viewPager");
          }
          Context context = tk.getContext();
          a.o(context, "viewPager.context");
          c childFragmen = this.getChildFragmentManager();
          a.o(childFragmen, "childFragmentManager");
          e uoe = new e(context, childFragmen, this.s, this.p, this.n, this.o, this.q, this.r);
          this.l = a.b();
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = this.t.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new b(new PagerSlidingTabStrip$d(iterator.next(), iterator.next()), ShareCopyWritingListFragment.class, objArray));
          }
          ShareCopyWritingFragment tl = this.l;
          str = "pageAdapter";
          if (tl == null) {
             a.S(str);
          }
          tl.D(uArrayList);
          tl = this.k;
          if (tl == null) {
             a.S("viewPager");
          }
          ShareCopyWritingFragment tl1 = this.l;
          if (tl1 == null) {
             a.S(str);
          }
          tl.setAdapter(tl1);
          tl = this.j;
          if (tl == null) {
             a.S("tabStrip");
          }
          tk = this.k;
          if (tk == null) {
             a.S("viewPager");
          }
          tl.setViewPager(tk);
          boolean b2 = a.t().d("preloadPublishPageCopywriting", b);
          Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
          uBooleanRef.element = b;
          ShareCopyWritingFragment tk1 = this.k;
          if (tk1 == null) {
             a.S("viewPager");
          }
          tk1.addOnPageChangeListener(new b(this, b2, uBooleanRef, uArrayList));
          tk2 = this.k;
          if (tk2 == null) {
             a.S("viewPager");
          }
          tk2.post(new c(this, uBooleanRef));
       }
       return;
    }
}
