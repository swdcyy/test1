package com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendTabHostFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.relation.explore.model.TabConfig;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.relation.explore.model.TabConfig$TabInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import fac.a;
import java.lang.Integer;
import android.widget.LinearLayout;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.view.View;
import android.widget.TextView;
import android.text.TextPaint;
import android.app.Application;
import o56.a;
import android.content.Context;
import zf6.j;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.lang.StringBuilder;
import ekd.m1;
import androidx.viewpager.widget.ViewPager;
import n7c.c;
import lnc.i3;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import f3b.o;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import dac.b;
import dac.d;
import wwb.f;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import dac.x;
import android.view.View$OnClickListener;
import dac.z;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import r0.a;
import android.widget.HorizontalScrollView;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import ekd.i;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import ny5.a;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import dac.a0;
import java.util.ArrayList;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import dac.y;

public class ExploreFriendTabHostFragment extends TabHostFragment implements d	// class@001803
{
    public KwaiActionBar B;
    public Drawable C;
    public Drawable D;
    public Drawable E;
    public Drawable F;
    public TabConfig G;
    public boolean H;
    public b I;
    public Integer J;
    public static final int K;

    public void ExploreFriendTabHostFragment(){
       super();
       this.H = true;
    }
    public int M(){
       return 1;
    }
    public String Qh(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExploreFriendTabHostFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("recommend").equals(p0)) {
          return "recommend_friends";
       }
       return "contact_friends";
    }
    public int Rh(){
       ExploreFriendTabHostFragment obj = PatchProxy.apply(null, this, ExploreFriendTabHostFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.G;
       if (obj == null) {
          return 0;
       }
       Iterator iterator = obj.tabIds.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return 0;
          }
          if (TextUtils.n("recommend", iterator.next().tabId)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public boolean Sh(){
       ExploreFriendTabHostFragment obj = PatchProxy.apply(null, this, ExploreFriendTabHostFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.G;
       boolean b = (obj != null && (obj.mNotChangeStatusBarColor == null && a.a()))? true: false;
       return b;
    }
    public final boolean Th(){
       ExploreFriendTabHostFragment obj = PatchProxy.apply(null, this, ExploreFriendTabHostFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.G;
       boolean b = (obj != null && (("recommend").equalsIgnoreCase(obj.indexId) || TextUtils.x(this.G.indexId)))? true: false;
       return b;
    }
    public void Uh(int p0){
       if (PatchProxy.isSupport(ExploreFriendTabHostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ExploreFriendTabHostFragment.class, "4")) {
          return;
       }
       int i = 0;
       while (i < this.t.getTabsContainer().getChildCount()) {
          TextView childAt = this.t.getTabsContainer().getChildAt(i);
          if (childAt != null) {
             boolean b = true;
             if (i == p0) {
                childAt.getPaint().setFakeBoldText(b);
                if (!this.Sh()) {
                   childAt.setTextColor(j.b(a.b(), R.color.arg_RES_7f061642));
                }
                childAt.setTextSize(b, 17.00f);
                childAt.setSelected(b);
                childAt.invalidate();
             }else {
                childAt.setTextSize(b, 16.00f);
                childAt.setTypeface(Typeface.create(childAt.getTypeface(), 0), 0);
                if (!this.Sh()) {
                   childAt.setTextColor(j.b(a.b(), R.color.arg_RES_7f061673));
                }
                childAt.setSelected(0);
                childAt.invalidate();
             }
          }
          i = i + 1;
       }
       return;
    }
    public void Vh(int p0,int p1,Drawable p2,Drawable p3){
       if (PatchProxy.isSupport(ExploreFriendTabHostFragment.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, ExploreFriendTabHostFragment.class, "5")) {
          return;
       }
       this.t.setTextColor(p0);
       this.B.t(this.getResources().getColor(p1));
       this.t.setIndicatorColor(p1);
       if (p2 != null) {
          this.B.j(p2);
       }
       if (p3 != null) {
          this.B.o(p3);
       }
       return;
    }
    public String a2(){
       String obj = PatchProxy.apply(null, this, ExploreFriendTabHostFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.u == null)? this.sh(): this.xh(this.ph());
       StringBuilder str = "ks://profile/pymk";
       obj = (TextUtils.x(obj))? "": "/"+obj;
       return str+obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreFriendTabHostFragment.class, "1")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a3f6a);
       return;
    }
    public int f(){
       int currentItem;
       TabHostFragment obj = PatchProxy.apply(null, this, ExploreFriendTabHostFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.u;
       obj = (obj == null)? 0: obj.getCurrentItem();
       if (obj) {
          return 10;
       }else {
          return 1;
       }
    }
    public int getLayoutResId(){
       return 0x7f0d040a;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, ExploreFriendTabHostFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!c.f() || (!("contact").equalsIgnoreCase(this.sh()) || this.J == null)) {
          return super.getPageParams();
       }
       obj = i3.f();
       obj.c("entry_portal", this.J);
       return obj.e();
    }
    public String getUrl(){
       Object obj = PatchProxy.apply(null, this, ExploreFriendTabHostFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a2();
    }
    public String o(){
       Fragment obj = PatchProxy.apply(null, this, ExploreFriendTabHostFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t();
       if (obj instanceof BaseFragment) {
          return obj.o();
       }
       String str = this.sh();
       if (("friend").equalsIgnoreCase(str)) {
          return "FRIENDS_LIST_TAB";
       }
       if (("contact").equalsIgnoreCase(str)) {
          return "FIND_FRIENDS_CONTACT";
       }
       if (("newFans").equalsIgnoreCase(str)) {
          return "FOLLOW_MESSAGE_AGGR";
       }
       return o.i(66);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreFriendTabHostFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.G = SerializableHook.getSerializable(this.getArguments(), "tab_config");
       this.J = SerializableHook.getSerializable(this.getArguments(), "page_portal");
       this.I = d.a(this);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       f uof = f.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExploreFriendTabHostFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       boolean i = 0;
       this.t.A(i, 1);
       int i1 = 0x7f080623;
       Drawable uDrawable = j.n(this.getContext(), i1, R.color.arg_RES_7f060148);
       this.E = uDrawable;
       this.B.j(uDrawable);
       uDrawable = j.n(this.getContext(), R.drawable.arg_RES_7f08062d, 0x7f060148);
       this.F = uDrawable;
       this.B.o(uDrawable);
       this.B.l(new x(this));
       this.B.post(new z(this));
       if (this.Sh()) {
          if (this.E != null) {
             this.C = j.n(this.getContext(), i1, 0x7f0606d0);
          }
          if (this.F != null) {
             this.D = a.d(a.b(), 0x7f0803c3);
          }
          if (this.Th()) {
             this.B.j(this.C);
             this.B.o(this.D);
             int i2 = 0x7f061a2a;
             this.B.setBackgroundColor(this.getResources().getColor(i2));
             this.t.setTextColor(R.color.arg_RES_7f060a2e);
             this.t.setIndicatorColor(R.color.arg_RES_7f061ad6);
             this.t.setBackgroundColor(this.getResources().getColor(i2));
             i.a(this.getActivity(), this.getResources().getColor(i2), i);
          }
       }
       this.Nh(2);
       this.Oh(new ExploreFriendTabHostFragment$a(this));
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, uof, "4");
       i = (obj != PatchProxyResult.class)? obj.booleanValue(): a.a.getBoolean(b.d("user")+"request_contact_before", i);
       if (!i && !this.I.c.c()) {
          ExploreFriendTabHostFragment tG = this.G;
          if (tG != null && tG.mNeedRequestContactPermission != null) {
             if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, objArray, uof, "5")) {
                SharedPreferences$Editor uEditor = a.a.edit();
                uEditor.putBoolean(b.d("user")+"request_contact_before", 1);
                g.a(uEditor);
             }
             this.I.c.h(this.getActivity(), new a0(this));
          }
       }
       return;
    }
    public String sh(){
       ExploreFriendTabHostFragment obj = PatchProxy.apply(null, this, ExploreFriendTabHostFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.G;
       if (obj != null && !TextUtils.x(obj.indexId)) {
          return this.G.indexId;
       }
       return super.sh();
    }
    public List wh(){
       ArrayList obj = PatchProxy.apply(null, this, ExploreFriendTabHostFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.G.tabIds.iterator();
       while (iterator.hasNext()) {
          TabConfig$TabInfo tabInfo = iterator.next();
          TabConfig$TabInfo tabId = tabInfo.tabId;
          TabConfig$TabInfo tabName = tabInfo.tabName;
          PagerSlidingTabStrip$d uod = PatchProxy.applyTwoRefs(tabId, tabName, this, ExploreFriendTabHostFragment.class, "18");
          if (uod != PatchProxyResult.class) {
          }else {
             uod = new PagerSlidingTabStrip$d(tabId, tabName);
             uod.i(new y(this, tabId));
          }
          obj.add(new b(uod, tabInfo.fragmentClass, this.getArguments()));
       }
       return obj;
    }
}
