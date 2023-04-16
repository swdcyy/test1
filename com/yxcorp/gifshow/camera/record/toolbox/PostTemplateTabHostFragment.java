package com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment;
import mm6.c;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import k2b.u1;
import com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment$Tab;
import hb0.a;
import java.lang.StringBuilder;
import java.lang.Enum;
import q87.c;
import com.yxcorp.gifshow.camera.record.toolbox.PostTemplateTabHostFragment$b;
import com.yxcorp.gifshow.camera.record.toolbox.PostToolBoxFragment;
import k2b.e0;
import ih9.q;
import android.view.View;
import com.yxcorp.gifshow.camera.record.toolbox.widget.ScrollToTopCoordinatorLayout;
import android.app.Activity;
import mm6.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import android.graphics.drawable.Drawable;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import mm6.a;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam$a;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaishanPageParam;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.Intent;
import ekd.j0;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import tkd.b;
import tkd.d;
import u80.j;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.view.KeyEvent;
import hka.d;
import hka.c;
import sm6.b;
import ih9.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.toolbox.a;
import com.yxcorp.utility.n;
import android.widget.HorizontalScrollView;
import com.yxcorp.gifshow.log.widget.CommonLogViewPager;
import ih9.s;
import ih9.e;
import com.trello.rxlifecycle3.android.FragmentEvent;
import erd.g;
import com.trello.rxlifecycle3.components.support.RxFragment;
import crd.b;
import eoc.f;
import java.util.List;
import java.util.ArrayList;
import g26.d;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import lnc.a1;
import ih9.d;
import lh9.d;
import m80.a;
import ih9.c;

public class PostTemplateTabHostFragment extends TabHostFragment implements c	// class@000f5b
{
    public final ViewPager$l B;
    public KuaishanPageParam C;
    public String D;
    public boolean E;
    public View F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public static final int K;

    public void PostTemplateTabHostFragment(){
       super();
       this.B = new PostTemplateTabHostFragment$a(this);
       this.H = "";
    }
    public int Bh(){
       return 0x7f0a3d9b;
    }
    public int Ff(){
       return 0x7f062022;
    }
    public final String Qh(){
       String obj = PatchProxy.apply(null, this, PostTemplateTabHostFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.D)) {
          obj = (this.getArguments() != null)? this.getArguments().getString("task_id"): "";
          if (TextUtils.x(obj)) {
             obj = u1.f();
          }
          this.D = obj;
       }
       return this.D;
    }
    public final void Rh(PostTemplateTabHostFragment$Tab p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostTemplateTabHostFragment.class, "13")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostTemplateTabHostFragment", "onTabSelected tab: "+p0.name(), objArray);
       Fragment uFragment = this.t();
       int i1 = PostTemplateTabHostFragment$b.a[p0.ordinal()];
       if (i1 != 1) {
          if (i1 == 2 && uFragment instanceof PostToolBoxFragment) {
             q.a(this, "follow");
          }
       }else if(uFragment instanceof PostToolBoxFragment){
          if (!PatchProxy.applyVoidOneRefs(uFragment, this, PostTemplateTabHostFragment.class, "14")) {
             Object[] objArray1 = new Object[i];
             a.D().w("PostTemplateTabHostFragment", "template List scroll to top", objArray1);
             View view = uFragment.getView();
             if (view != null) {
                ScrollToTopCoordinatorLayout scrollToTopC = view.findViewById(R.id.coordinator_layout);
                if (scrollToTopC != null) {
                   scrollToTopC.O2();
                }
             }
          }
       }else {
          q.a(this, "template");
       }
       return;
    }
    public int S5(){
       return 0x7f082465;
    }
    public String Xa(){
       String obj = PatchProxy.apply(null, this, PostTemplateTabHostFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.o() != null)? this.o(): "";
       return obj;
    }
    public boolean a4(){
       return true;
    }
    public void dg(Activity p0){
       b.a(this, p0);
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, PostTemplateTabHostFragment.class, "6");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostTemplateTabHostFragment", "doCreateView", objArray);
       if (this.s == null) {
          this.s = a.h(p0, this.getLayoutResId(), p1, 0, 2);
       }
       return this.s;
    }
    public boolean f9(){
       return b.f(this);
    }
    public int getLayoutResId(){
       return 0x7f0d118a;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, PostTemplateTabHostFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+this.Qh();
    }
    public Drawable i9(){
       return b.i(this);
    }
    public boolean lf(){
       return b.h(this);
    }
    public String o(){
       return "PRODUCE_PLAY_LIBRARY";
    }
    public boolean onBackPressed(){
       FragmentActivity obj = PatchProxy.apply(null, this, PostTemplateTabHostFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostTemplateTabHostFragment", "onBackPressed", objArray);
       obj = this.getActivity();
       if (obj == null) {
          return i;
       }
       if (this.E == null && (obj instanceof a && this.J == null)) {
          obj.A0();
       }else {
          obj.finish();
          obj.overridePendingTransition(R.anim.arg_RES_7f0100e5, 0x7f010112);
       }
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostTemplateTabHostFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostTemplateTabHostFragment", "onCreate", objArray);
       String str = this.Qh();
       this.D = str;
       this.C = new KuaishanPageParam$a().k(str).f();
       if (this.getActivity() == null) {
          PostUtils.D("PostTemplateTabHostFragment", "onCreate\(\) activity is null", new IllegalArgumentException());
          return;
       }else {
          this.J = j0.a(this.getActivity().getIntent(), "backToKuaishan", i);
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PostTemplateTabHostFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       if (this.J == null) {
          d.a(-215111236).fd();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, PostTemplateTabHostFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       Object[] objArray = new Object[0];
       a.D().w("PostTemplateTabHostFragment", "onDestroyView", objArray);
       TabHostFragment tt = this.t;
       if (tt != null) {
          tt.setOnPageChangeListener(null);
       }
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return c.a(this, p0, p1);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       return c.b(this, p0, p1);
    }
    public void onViewCreated(View p0,Bundle p1){
       int b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PostTemplateTabHostFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("PostTemplateTabHostFragment", "onViewCreate", objArray);
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          p0.setPadding(i, b.p(activity, p0), i, i);
          b.v(p0, b.q(activity));
       }
       View view = p0.findViewById(R.id.template_tab_host_tab_back_btn);
       if (view != null) {
          view.setOnClickListener(new b(this));
       }
       PostTemplateTabHostFragment tI = this.I;
       view.mGroupId = tI;
       b = (!TextUtils.x(tI) && !TextUtils.x(this.C.mInitTemplateId))? true: false;
       this.E = b;
       p0 = p0.findViewById(R.id.template_tab_host_search_btn);
       this.F = p0;
       if (p0 != null) {
          p0.setOnClickListener(new a(this));
          PostTemplateTabHostFragment tF = this.F;
          b = (this.G != null)? 0: 4;
          n.Y(tF, b, i);
       }
       TabHostFragment tt = this.t;
       if (tt != null) {
          tt.setOnPageChangeListener(this.B);
          if (this.G == null) {
             this.t.v(i);
             this.t.invalidate();
          }
       }
       tt = this.u;
       if (tt instanceof CommonLogViewPager) {
          tt.setScrollable(i);
       }
       f.c(s.class, new e(this), this, FragmentEvent.DESTROY_VIEW);
       return;
    }
    public boolean re(){
       return b.g(this);
    }
    public List wh(){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, this, PostTemplateTabHostFragment.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new ArrayList();
       this.G = d.b();
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("PostTemplateTabHostFragment", "get tab fragment delegates, has template tab? "+this.G, objArray1);
       if (this.G != null) {
          b uob = PatchProxy.apply(objArray, this, PostTemplateTabHostFragment.class, "12");
          if (uob != patchProxyRe) {
          }else {
             PagerSlidingTabStrip$d uod1 = new PagerSlidingTabStrip$d(PostTemplateTabHostFragment$Tab.TEMPLATE.name(), a1.p(0x7f105250));
             uod1.i(new d(this));
             Bundle uBundle = new Bundle();
             if (this.getArguments() != null) {
                String str2 = "task_id";
                if (!TextUtils.x(this.getArguments().getString(str2))) {
                   uBundle.putString(str2, this.getArguments().getString(str2));
                   str2 = "recordByMusicRequestDuartion";
                   uBundle.putInt(str2, this.getArguments().getInt(str2, i));
                }
             }
             String str3 = d.a(this.getActivity());
             this.I = str3;
             if (!TextUtils.x(str3)) {
                uBundle.putString("toolboxJumpToKuaishanGroupId", this.I);
             }
             uob = new b(uod1, PostToolBoxFragment.class, uBundle);
          }
          obj.add(uob);
       }
       b uob1 = PatchProxy.apply(objArray, this, PostTemplateTabHostFragment.class, "11");
       if (uob1 != patchProxyRe) {
       }else {
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             String str = j0.f(activity.getIntent(), "photo_task_id");
             if (TextUtils.x(str)) {
                str = u1.f();
             }
             str = "&taskId="+str;
             int i1 = j0.b(activity.getIntent(), "followTagGroupId", i);
             if (i1) {
                str = str+"&groupId="+i1;
             }
             str1 = str+"&"+"from"+"="+"workbox";
          }else {
             str1 = "";
          }
          PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(PostTemplateTabHostFragment$Tab.FOLLOW_KRN.name(), a1.p(0x7f10524f));
          uod.i(new c(this));
          uob1 = d.a(0xf20ac9c).No(uod, d.a(0xf20ac9c).yr()+str1);
       }
       obj.add(uob1);
       return obj;
    }
    public boolean x2(){
       return true;
    }
}
