package com.yxcorp.gifshow.homeroot.HomeRootFragment;
import kn5.c;
import eb5.g;
import ta9.b;
import im8.g;
import com.kwai.kcube.KCubeRootContainerFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.a;
import mrd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import brd.t;
import eb5.f;
import wq6.f;
import com.kwai.kcube.KCubeContainerFragment;
import wq6.e;
import wq6.g;
import wq6.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.kcube.TabIdentifier;
import java.lang.StringBuilder;
import wq6.l;
import androidx.fragment.app.FragmentActivity;
import ko5.d;
import ko5.c;
import crd.b;
import androidx.viewpager.widget.ViewPager$i;
import kn5.b;
import sua.f;
import java.util.Map;
import java.util.HashMap;
import android.content.Intent;
import nn5.a;
import android.content.Context;
import sua.a;
import com.yxcorp.gifshow.homeroot.c;
import tkd.b;
import tkd.d;
import wxb.a;
import lp5.a;
import java.lang.RuntimeException;
import java.lang.Boolean;
import com.trello.rxlifecycle3.components.support.RxFragment;
import sua.g;
import java.util.List;
import hn5.q$b;
import yxb.b;
import kotlin.jvm.internal.a;
import vw5.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import os5.j;
import hn5.s;
import java.util.Objects;
import hn5.s$a;
import hn5.r;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import hn5.q;
import java.util.Iterator;
import hn5.q$a;
import q87.c;
import com.yxcorp.gifshow.widget.SwipeLayout;
import android.widget.FrameLayout;
import java.lang.IllegalArgumentException;
import tua.j;
import tua.l;
import tua.x;
import tua.s;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import t45.d;
import brd.z;
import sua.c;
import erd.g;
import ujc.e;
import sua.b;
import java.lang.Number;
import yq6.d;
import un5.a;
import com.yxcorp.gifshow.homeroot.a;
import yq6.a;
import msd.l;

public class HomeRootFragment extends KCubeRootContainerFragment implements c, g, b, g	// class@001813
{
    public final PresenterV2 n;
    public final a o;
    public final a p;
    public a q;
    public static final int r;

    public void HomeRootFragment(){
       super();
       this.n = new PresenterV2();
       this.o = new a();
       this.p = a.g();
    }
    public static HomeRootFragment fh(int p0){
       HomeRootFragment obj;
       if (PatchProxy.isSupport(HomeRootFragment.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, HomeRootFragment.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new HomeRootFragment();
       Bundle uBundle = new Bundle();
       uBundle.putInt("HOME_UI_MODE", p0);
       obj.setArguments(uBundle);
       return obj;
    }
    public t Ra(){
       return f.b(this);
    }
    public String X3(){
       e obj = PatchProxy.apply(null, this, HomeRootFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Xg().N();
       String str = obj.F("KEY_TAB_LAUNCH_ID");
       if (TextUtils.x(str)) {
          TabIdentifier tabIdentifie = obj.M2();
          str = TextUtils.I(tabIdentifie.getType());
          if (!TextUtils.x(tabIdentifie.getId())) {
             str = str+"_"+tabIdentifie.getId();
          }
       }
       return str;
    }
    public l dh(){
       Object obj = PatchProxy.apply(null, this, HomeRootFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a(this.getActivity()).d();
    }
    public final void eh(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeRootFragment.class, "6")) {
          return;
       }
       this.o.c(p0);
       return;
    }
    public void g(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeRootFragment.class, "19")) {
          return;
       }
       this.Xg().g(p0);
       return;
    }
    public Fragment g0(){
       return b.a(this);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeRootFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, HomeRootFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(HomeRootFragment.class, new f());
       }else {
          obj.put(HomeRootFragment.class, null);
       }
       return obj;
    }
    public String getUrl(){
       return "ks://home";
    }
    public void i(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeRootFragment.class, "18")) {
          return;
       }
       this.Xg().i(p0);
       return;
    }
    public boolean kf(){
       return false;
    }
    public void og(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeRootFragment.class, "13")) {
          return;
       }
       HomeRootFragment tq = this.q;
       if (tq == null) {
          return;
       }
       tq.d(p0);
       return;
    }
    public void onAttach(Context p0){
       c uoc;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeRootFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       int intx = this.requireArguments().getInt("HOME_UI_MODE");
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoc = PatchProxy.applyTwoRefs(Integer.valueOf(intx), this, null, uoa, "1");
          if (uoc != PatchProxyResult.class) {
          }else if(intx == 3){
             uoc = new c(this);
          }else if(intx == 2){
             uoc = d.a(-1243444263).PH(this);
          }else if(intx == 4){
             uoc = new c(this);
          }else if(intx == 5){
             uoc = d.a(0x193fad4a).UF(this);
          }else {
             throw new RuntimeException("homeUiMode = "+intx+" 没有delegate!");
          }
       }else {
          goto label_0032 ;
       }
       this.q = uoc;
       return;
    }
    public boolean onBackPressed(){
       HomeRootFragment obj = PatchProxy.apply(null, this, HomeRootFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       boolean b = (obj != null && obj.e())? true: false;
       return b;
    }
    public void onCreate(Bundle p0){
       q$b uob;
       q$b uob1;
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeRootFragment.class, "3")) {
          return;
       }
       this.q.f();
       super.onCreate(p0);
       Object[] objArray = null;
       List list = PatchProxy.apply(objArray, objArray, g.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          q$b[] uobArray = new q$b[]{uob,uob1,d.a(0x28675fc9).sm()};
          uob = d.a(-430326918).Xk();
          a.o(uob, "PluginManager.get\(Detail…teCommentFrameUIElement\(\)");
          uob1 = d.a(-430326918).HZ();
          a.o(uob1, "PluginManager.get\(Detail…ateAiTextFrameUIElement\(\)");
          list = CollectionsKt__CollectionsKt.P(uobArray);
          list.add(d.a(0x396c0e3f).JE());
       }
       FragmentActivity uFragmentAct = this.requireActivity();
       if (!PatchProxy.applyVoidTwoRefs(uFragmentAct, list, objArray, s.class, "1")) {
          s$a b = s.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidTwoRefs(uFragmentAct, list, b, s$a.class, "1")) {
             a.p(uFragmentAct, "activity");
             a.p(list, "homeUIElements");
             ViewModelProviders.of(uFragmentAct, new r(list)).get(s.class);
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HomeRootFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 == null) {
          throw new IllegalArgumentException("不能为空");
       }
       View view = super.onCreateView(p0, p1, p2);
       if (view instanceof ViewGroup) {
          q oq = s.o0(this.requireActivity());
          if (oq != null) {
             obj = view;
             if (!PatchProxy.applyVoidOneRefs(obj, oq, q.class, "1")) {
                a.p(obj, "rootLayout");
                Iterator iterator = oq.b.iterator();
                while (iterator.hasNext()) {
                   q$b uob = iterator.next();
                   Objects.requireNonNull(uob);
                   View view1 = PatchProxy.applyOneRefs(obj, uob, q$b.class, "2");
                   if (view1 != PatchProxyResult.class) {
                   }else {
                      a.p(obj, "rootLayout");
                      view1 = obj;
                   }
                   View view2 = uob.a(view1);
                   uob.c(view2);
                   view1.addView(view2);
                   Object[] objArray = new Object[0];
                   q$a.c.s("HomeUIElement", "element\("+uob.c+"\) is added", objArray);
                }
             }
          }
       }
       SwipeLayout swipeLayout = new SwipeLayout(p1.getContext());
       swipeLayout.setId(R.id.swipe);
       swipeLayout.addView(view);
       return this.q.g(swipeLayout);
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeRootFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       this.o.dispose();
       this.n.destroy();
       this.q.j();
       q oq = s.o0(this.requireActivity());
       if (oq != null && !PatchProxy.applyVoid(objArray, oq, q.class, "2")) {
          Iterator iterator = oq.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().b();
          }
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, HomeRootFragment.class, "9")) {
          return;
       }
       super.onPause();
       Objects.requireNonNull(this.q);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, HomeRootFragment.class, "8")) {
          return;
       }
       super.onResume();
       this.q.i();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       z a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeRootFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       HomeRootFragment tq = this.q;
       KCubeRootContainerFragment kCubeRootCon = PatchProxy.apply(null, this, KCubeRootContainerFragment.class, "3");
       if (kCubeRootCon != PatchProxyResult.class) {
       }else {
          kCubeRootCon = this.m;
          if (kCubeRootCon == null) {
             a.S("mTabTree");
          }
       }
       tq.c = kCubeRootCon;
       tq.b = this.Xg();
       this.q.k(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, HomeRootFragment.class, "10")) {
          this.n.U7(new j(this.Xg()));
          this.n.U7(new l(this.Xg()));
          this.n.U7(new x(this.Xg()));
          this.n.U7(new s(this.Xg(), this));
          this.n.f(p0);
          Object[] objArray = new Object[]{this};
          this.n.i(objArray);
       }
       RxBus f = RxBus.f;
       a = d.a;
       this.eh(f.f(x.class).observeOn(a).subscribe(new c(this)));
       this.eh(f.f(e.class).observeOn(a).subscribe(new b(this)));
       return;
    }
    public int r(){
       f obj = PatchProxy.apply(null, this, HomeRootFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Yg();
       int i = 0;
       if (obj == null) {
          return i;
       }
       return obj.d().a(a.e, a.b, Integer.valueOf(i)).intValue();
    }
    public Fragment t(){
       f obj = PatchProxy.apply(null, this, HomeRootFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Yg();
       if (obj != null) {
          return obj.t();
       }
       return null;
    }
    public boolean x1(){
       HomeRootFragment obj = PatchProxy.apply(null, this, HomeRootFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       if (obj == null) {
          return false;
       }
       return obj.c();
    }
}
