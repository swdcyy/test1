package com.kuaishou.merchant.live.basic.container.LiveMerchantAnchorContainerFragment;
import hka.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.basic.LiveBasicLogBiz;
import p74.a;
import o74.a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import java.lang.Runnable;
import android.os.Bundle;
import java.lang.Boolean;
import tkd.b;
import tkd.d;
import vs3.a;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.merchant.api.router.FragmentConfig;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import java.util.Map;
import us3.i;
import l14.a;
import z1.k;
import java.lang.Integer;
import java.util.List;
import androidx.fragment.app.c$a;
import java.lang.Throwable;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import java.util.Iterator;
import com.kuaishou.merchant.live.basic.container.LiveMerchantAnchorContainerFragment$b;
import l14.b;
import androidx.fragment.app.c$c;

public class LiveMerchantAnchorContainerFragment extends BaseFragment implements a	// class@001888
{
    public final List j;
    public Runnable k;
    public int l;
    public static final int m;

    public void LiveMerchantAnchorContainerFragment(){
       super();
       this.j = new ArrayList();
       this.l = 0;
    }
    public void ch(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorContainerFragment.class, "8")) {
          return;
       }
       a.t(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragment ", "closeContainerFragment", "reason", p0);
       if (this.getFragmentManager() != null) {
          e uoe = this.getFragmentManager().beginTransaction();
          uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
          uoe.u(this).m();
          this.k.run();
       }
       return;
    }
    public final void dh(Fragment p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantAnchorContainerFragment.class, "10")) {
          return;
       }
       a.t(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragment ", "showChildFragmentInner", "fragmentTag", p1);
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.y(R.anim.arg_RES_7f010105, 0x7f01004c);
       uoe.v(R.id.content_fragment, p0);
       uoe.j(p1);
       uoe.m();
       return;
    }
    public final void eh(String p0,Bundle p1,String p2,boolean p3,boolean p4){
       FragmentConfig uFragmentCon2;
       if (PatchProxy.isSupport(LiveMerchantAnchorContainerFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveMerchantAnchorContainerFragment.class, "7")) {
             return;
          }
       }
       if (p1 == null) {
          p1 = new Bundle();
       }
       Bundle uBundle = p1;
       uBundle.putBoolean("NEED_JUST_TOP_PADDING", p3);
       b uob = d.a(0x7074b578);
       FragmentActivity activity = this.getActivity();
       FragmentConfig uFragmentCon = new FragmentConfig();
       uFragmentCon.k(this.getChildFragmentManager());
       uFragmentCon = uFragmentCon.j(R.id.content_fragment).f(R.anim.arg_RES_7f010105).g(0).h(0).i(p2);
       Objects.requireNonNull(uFragmentCon);
       FragmentConfig uFragmentCon1 = FragmentConfig.class;
       if (PatchProxy.isSupport(uFragmentCon1)) {
          uFragmentCon1 = PatchProxy.applyOneRefs(Boolean.valueOf(p4), uFragmentCon, uFragmentCon1, "16");
          if (uFragmentCon1 != PatchProxyResult.class) {
             uFragmentCon2 = uFragmentCon1;
          label_0096 :
             uob.Yr(activity, p0, uBundle, null, uFragmentCon2);
             return;
          }
       }
       uFragmentCon.b().putBoolean("forceReplace", p4);
       uFragmentCon2 = uFragmentCon;
       goto label_0096 ;
    }
    public final void fh(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorContainerFragment.class, "9")) {
          return;
       }
       a.s(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragment ", "showSelf");
       e uoe = p0.beginTransaction();
       uoe.y(R.anim.arg_RES_7f010105, 0x7f01004c);
       uoe.v(R.id.live_fragment_container, this);
       uoe.m();
       return;
    }
    public boolean onBackPressed(){
       String str = "LiveMerchantAnchorContainerFragment ";
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, LiveMerchantAnchorContainerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       this.l = i;
       c uoc = d.a(0x7074b578).LD(this.getChildFragmentManager(), new a(this));
       if (uoc != null) {
          i = uoc.getBackStackEntryCount();
       }
       LiveBasicLogBiz fRAGMENT_CON = LiveBasicLogBiz.FRAGMENT_CONTAINER;
       a.u(fRAGMENT_CON, "LiveMerchantAnchorContainerFragment ", "onBackPressed", "backStackEntryCount", Integer.valueOf(i), "fragmentSize", Integer.valueOf(this.getChildFragmentManager().getFragments().size()));
       if (i > 0) {
          i = i - 1;
          try{
             obj = uoc.getBackStackEntryAt(i).getName();
             List fragments = uoc.getFragments();
             if (fragments.size() > 0) {
                objArray = fragments.get((fragments.size() - 1));
             }
             if (objArray instanceof a) {
                a.t(fRAGMENT_CON, str, "pop childFragment with BackPressable", "fragmentTag", obj);
                return objArray.onBackPressed();
             }else {
                a.t(fRAGMENT_CON, str, "pop childFragment without BackPressable", "fragmentTag", obj);
                return uoc.popBackStackImmediate();
             }
          }catch(java.lang.IllegalStateException e1){
             a.l(LiveBasicLogBiz.FRAGMENT_CONTAINER, str, "popBackStackImmediate error", e1);
          }
          this.ch("onBackPressed");
          return 1;
       }else {
          goto label_009c ;
       }
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantAnchorContainerFragment.class, "3")) {
          return;
       }
       super.onConfigurationChanged(p0);
       a.s(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragment ", "onConfigurationChanged£¬dismiss");
       this.ch("ConfigurationChanged");
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveMerchantAnchorContainerFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.d(p0, 0x7f0d04ac, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMerchantAnchorContainerFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       a.s(LiveBasicLogBiz.FRAGMENT_CONTAINER, "LiveMerchantAnchorContainerFragment ", "onViewCreated");
       _monitor_enter(this);
       Iterator iterator = this.j.iterator();
       while (iterator.hasNext()) {
          LiveMerchantAnchorContainerFragment$b uob = iterator.next();
          if (uob.c != null) {
             LiveMerchantAnchorContainerFragment$b e = uob.e;
             LiveMerchantAnchorContainerFragment$b d = uob.d;
             LiveMerchantAnchorContainerFragment$b b = uob.b;
             boolean b1 = (e != null && e.getBoolean("KEY_ADJUST_PADDING_TOP"))? true: false;
             this.eh(d, e, b, b1, false);
          }else {
             this.dh(uob.a, uob.b);
          }
       }
       this.j.clear();
       _monitor_exit(this);
       this.getChildFragmentManager().addOnBackStackChangedListener(new b(this));
       return;
    }
}
