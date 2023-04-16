package com.yxcorp.gifshow.profile.collect.fragment.ProfileCollectionTabFragment;
import k3c.v1;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v1c.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import android.content.Context;
import s1c.r0;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import androidx.viewpager.widget.ViewPager;
import java.util.Collection;
import ekd.q;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.robust.PatchProxyResult;
import i2c.m0;
import android.view.View$OnClickListener;
import androidx.core.widget.NestedScrollView;
import java.lang.Number;
import android.widget.FrameLayout;
import android.view.View;
import java.lang.Math;
import android.text.SpannableStringBuilder;
import com.yxcorp.gifshow.util.span.CustomTypefaceSpan;
import android.graphics.Typeface;
import ekd.d0;
import lnc.u9;
import lnc.a1;
import android.text.style.AbsoluteSizeSpan;
import com.kwai.feature.api.router.social.profile.ProfileStartParam$CollectionSub;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.kwai.library.widget.viewpager.tabstrip.a;
import java.lang.Integer;
import u2c.d;
import crd.b;
import com.yxcorp.gifshow.profile.collect.fragment.m;
import ok.h;
import lnc.b9;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import i2c.p0;
import erd.g;
import com.kwai.framework.model.user.UserProfile;
import x2c.a;
import com.yxcorp.gifshow.profile.common.model.UserCollectCount;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.os.Bundle;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import android.view.ViewStub;
import android.app.Activity;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import android.view.ViewGroup$LayoutParams;
import r2c.j;
import z5c.j0;
import android.app.Application;
import o56.a;
import android.widget.TextView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import zf6.j;
import android.widget.LinearLayout$LayoutParams;
import i2c.u0;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.widget.viewpager.ScrollViewPager;
import s1c.a;
import j5c.c;
import i2c.s0;
import com.yxcorp.gifshow.profile.collect.fragment.o;
import i2c.q0;
import android.widget.LinearLayout;
import java.util.Iterator;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcorp.gifshow.profile.collect.fragment.ProfileCollectionTabFragment$a;
import java.lang.Enum;
import i2c.b1;
import android.content.res.Resources;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionSerialFragment;
import i2c.a1;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPOIFragment;
import i2c.z0;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionTemplateFragment;
import i2c.y0;
import f2c.e;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionMagicFragment;
import i2c.x0;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionTagFragment;
import i2c.w0;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment;
import i2c.v0;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment;

public class ProfileCollectionTabFragment extends TabHostFragment implements v1	// class@0012b1
{
    public int B;
    public final List C;
    public boolean D;
    public boolean E;
    public r0 F;
    public UserCollectCount G;
    public NestedScrollView H;
    public b I;
    public b J;
    public b K;
    public b L;
    public boolean M;
    public View N;
    public View O;
    public RxPageBus P;
    public static final int Q;

    public void ProfileCollectionTabFragment(){
       super();
       this.B = -1;
       this.C = new ArrayList();
       this.E = false;
       this.M = true;
    }
    public void Ch(){
       if (PatchProxy.applyVoid(null, this, ProfileCollectionTabFragment.class, "10")) {
          return;
       }
       this.v = new a(this.getActivity(), this.getChildFragmentManager());
       return;
    }
    public void Fc(r0 p0){
       this.F = p0;
    }
    public final void Qh(String p0,boolean p1){
       int i;
       if (PatchProxy.isSupport(ProfileCollectionTabFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ProfileCollectionTabFragment.class, "3")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          ProfileCollectionTabFragment tC = this.C;
          if (tC != null && !tC.isEmpty()) {
             tC = -1;
             try{
                i = this.C.indexOf(p0);
             }catch(java.lang.Exception e0){
                i = -1;
             }
             if (i != e0) {
                TabHostFragment tu = this.u;
                if (tu != null) {
                   tu.setCurrentItem(i);
                }
             }else if(p1){
                this.Vh();
             }
             return;
          }
       }
       if (p1 && q.f(this.C)) {
          this.Vh();
       }
       return;
    }
    public final PagerSlidingTabStrip$d Rh(String p0,CharSequence p1){
       PagerSlidingTabStrip$d obj = PatchProxy.applyTwoRefs(p0, p1, this, ProfileCollectionTabFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PagerSlidingTabStrip$d(p0, p1);
       obj.i(new m0(this, p0));
       return obj;
    }
    public final int Sh(NestedScrollView p0){
       int top;
       View obj = PatchProxy.applyOneRefs(p0, this, ProfileCollectionTabFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int childCount = p0.getChildCount();
       if (childCount <= 0) {
          return 0;
       }
       obj = p0.getChildAt((childCount - 1));
       if (obj != null) {
          childCount = Math.min(((obj.getBottom() + p0.getPaddingBottom()) + p0.getPaddingTop()), p0.getMeasuredHeight());
          top = p0.getTop();
       }else {
          childCount = p0.getMeasuredHeight();
          top = p0.getTop();
       }
       return (childCount + top);
    }
    public final CharSequence Th(String p0,String p1){
       SpannableStringBuilder obj = PatchProxy.applyTwoRefs(p0, p1, this, ProfileCollectionTabFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p1)) {
          return p0;
       }
       obj = new SpannableStringBuilder(p0);
       obj.setSpan(new CustomTypefaceSpan("", d0.a("alte-din.ttf", this.getContext())), 0, obj.length(), 17);
       int i = obj.length();
       obj.append(" ");
       obj.setSpan(new u9(a1.e(2.00f)), i, (i + 1), 17);
       obj.append(p1);
       obj.setSpan(new AbsoluteSizeSpan(14, true), obj.length(), obj.length(), 17);
       return obj;
    }
    public final int Uh(ProfileStartParam$CollectionSub p0){
       ProfileCollectionTabFragment obj = PatchProxy.applyOneRefs(p0, this, ProfileCollectionTabFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.C;
       if (obj != null && obj.contains(p0.name)) {
          return this.C.indexOf(p0.name);
       }
       return p0.id;
    }
    public final void Vh(){
       if (PatchProxy.applyVoid(null, this, ProfileCollectionTabFragment.class, "4")) {
          return;
       }
       ProfileCollectionTabFragment tP = this.P;
       if (tP != null) {
          tP.b("PROFILE_REFRESH", "MAIN_KEY", ProfileRefreshStatus.ALL);
       }
       return;
    }
    public void Wh(){
       if (PatchProxy.applyVoid(null, this, ProfileCollectionTabFragment.class, "20")) {
          return;
       }
       int i = this.C.size();
       n.Y(this.O, 8, false);
       if (i <= 1) {
          this.N.setVisibility(8);
          this.u.setVisibility(false);
          this.H.setVisibility(8);
          if (!i) {
             this.u.setVisibility(8);
             n.Y(this.O, false, false);
             this.ai();
          }
       }else {
          this.N.setVisibility(false);
          this.t.setVisibility(false);
          this.u.setVisibility(false);
          this.H.setVisibility(8);
       }
       return;
    }
    public final void Xh(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileCollectionTabFragment.class, "19")) {
          return;
       }
       int i = 0;
       while (i < p0.j()) {
          if (p0.a(i) instanceof p0.a(i)) {
             p0.a(i).ga(true);
          }
          i = i + 1;
       }
       return;
    }
    public final void Yh(int p0){
       if (PatchProxy.isSupport(ProfileCollectionTabFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ProfileCollectionTabFragment.class, "24")) {
          return;
       }
       ProfileCollectionTabFragment tP = this.P;
       if (tP == null) {
          return;
       }
       tP.b("PROFILE_SCROLL_SIZE", "MAIN_KEY", new d(this.hashCode(), p0));
       return;
    }
    public final void Zh(){
       if (PatchProxy.applyVoid(null, this, ProfileCollectionTabFragment.class, "22")) {
          return;
       }
       ProfileCollectionTabFragment tJ = this.J;
       if (tJ == null || (!tJ.isDisposed() || this.H.getVisibility() == 8)) {
          return;
       }
       this.J = b9.c(this.J, new m(this));
       return;
    }
    public final void ai(){
       if (PatchProxy.applyVoid(null, this, ProfileCollectionTabFragment.class, "23")) {
          return;
       }
       ProfileCollectionTabFragment tO = this.O;
       if (tO == null) {
          return;
       }
       if (tO.getMeasuredHeight() > 0) {
          this.Yh(this.O.getMeasuredHeight());
       }else {
          b9.a(this.L);
          this.L = t.just(this.O).delay(300, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new p0(this));
       }
       return;
    }
    public final void bi(UserProfile p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileCollectionTabFragment.class, "12")) {
          return;
       }
       this.C.clear();
       List list = a.d(p0);
       if (!q.f(list)) {
          this.C.addAll(list);
       }
       this.G = a.c(p0);
       return;
    }
    public void ga(boolean p0){
       if (PatchProxy.isSupport(ProfileCollectionTabFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ProfileCollectionTabFragment.class, "18")) {
          return;
       }
       this.E = p0;
       TabHostFragment tv = this.v;
       if (tv != null) {
          this.Xh(tv);
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d11dc;
    }
    public boolean h9(){
       return this.E;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ProfileCollectionTabFragment.class, "21")) {
          return;
       }
       super.onDestroy();
       b9.a(this.I);
       b9.a(this.J);
       b9.a(this.L);
       b9.a(this.K);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileCollectionTabFragment.class, "1")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ProfileCollectionTabFragment.class, "11")) {
          ProfileCollectionTabFragment tF = this.F;
          if (tF != null) {
             r0 d = tF.d;
             if (d != null) {
                ProfileParam mUserProfile = d.mUserProfile;
                if (mUserProfile != null) {
                   this.bi(mUserProfile);
                }
             }
          }
       }
       super.onViewCreated(p0, p1);
       this.H = this.oh().findViewById(0x7f0a3225);
       this.N = this.oh().findViewById(0x7f0a3c7f);
       if (!PatchProxy.applyVoid(objArray, this, ProfileCollectionTabFragment.class, "2")) {
          ViewStub viewStub = this.oh().findViewById(R.id.empty_state_tips_container);
          viewStub.setLayoutResource(R.layout.arg_RES_7f0d11dd);
          View view = (this.getActivity() != null)? this.getActivity().findViewById(R.id.app_bar_layout): objArray;
          if (this.O == null) {
             viewStub = viewStub.inflate();
             this.O = viewStub;
             KwaiEmptyStateView kwaiEmptySta = viewStub.findViewById(R.id.empty_state_tips_view);
             if (view != null) {
                ViewGroup$LayoutParams layoutParams1 = kwaiEmptySta.getLayoutParams();
                layoutParams1.height = Math.max(j0.a(view, j.c(this)), n.c(a.b(), 192.00f));
                kwaiEmptySta.setLayoutParams(layoutParams1);
             }
             TextView titleText = kwaiEmptySta.getTitleText();
             if (titleText != null) {
                titleText.setTypeface(Typeface.defaultFromStyle(1));
             }
             KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
             uoa.m(R.string.arg_RES_7f103fda);
             uoa.a(kwaiEmptySta);
          }
       }
       this.t.setTabGravity(17);
       this.t.setBackgroundColor(j.d(this.t, R.color.arg_RES_7f061ca6));
       this.t.v(false);
       this.t.setTextColor(R.color.arg_RES_7f061cab);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -1);
       layoutParams.rightMargin = a1.e(8.00f);
       this.t.setTabLayoutParams(layoutParams);
       if (!PatchProxy.applyVoid(objArray, this, ProfileCollectionTabFragment.class, "13")) {
          this.Oh(new u0(this));
       }
       this.u.setOffscreenPageLimit(this.C.size());
       this.u.setScrollable(false);
       this.Wh();
       this.I = this.F.e.e.e().subscribe(new s0(this), o.b);
       r0 e = this.F.e;
       this.K = e.d.f("PROFILE_TAB_CHANGE").subscribe(new q0(this));
       this.P = e.d;
       this.Zh();
       this.Qh(this.F.d.mCollectSubTabName, false);
       return;
    }
    public void u(){
       int i;
       if (PatchProxy.applyVoid(null, this, ProfileCollectionTabFragment.class, "8")) {
          return;
       }
       if (q.f(this.C)) {
          this.ai();
       }
       ProfileCollectionTabFragment tG = this.G;
       if (tG != null) {
          String str = "0";
          if (!str.equals(tG.mPhoto)) {
             i = this.Uh(ProfileStartParam$CollectionSub.TAB_COLLECTION_POST);
          }else if(!str.equals(this.G.mMusic)){
             i = this.Uh(ProfileStartParam$CollectionSub.TAB_COLLECTION_MUSIC);
          }else if(!str.equals(this.G.mTag)){
             i = this.Uh(ProfileStartParam$CollectionSub.TAB_COLLECTION_TAG);
          }else if(!str.equals(this.G.mMagicFace)){
             i = this.Uh(ProfileStartParam$CollectionSub.TAB_COLLECTION_MAGIC);
          }else if(!str.equals(this.G.mTemplate)){
             i = this.Uh(ProfileStartParam$CollectionSub.TAB_COLLECTION_TEMPLATE);
          }else if(!str.equals(this.G.mPOI)){
             i = this.Uh(ProfileStartParam$CollectionSub.TAB_COLLECTION_POI);
          }else if(!str.equals(this.G.mSerial)){
             i = this.Uh(ProfileStartParam$CollectionSub.TAB_COLLECTION_SERIAL);
          }else {
             i = 0;
          }
          if (!i) {
             return;
          }else {
             i = Math.min(i, this.C.size());
             if (this.M != null) {
                i = Math.max(i, this.u.getCurrentItem());
             }
             this.u.setCurrentItem(i);
             LinearLayout tabsContaine = this.t.getTabsContainer();
             if (i < tabsContaine.getChildCount()) {
                tabsContaine.getChildAt(i).setSelected(true);
             }
          }
       }
       this.M = false;
       return;
    }
    public List wh(){
       ProfileStartParam$CollectionSub name;
       String str2;
       ProfileCollectionTabFragment tG;
       v0 ov0;
       ArrayList obj = PatchProxy.apply(null, this, ProfileCollectionTabFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = this.C.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          Object[] objArray = PatchProxy.applyOneRefs(str, this, ProfileCollectionTabFragment.class, "16");
          if (objArray != PatchProxyResult.class) {
          }else {
             String str1 = "";
             switch (ProfileCollectionTabFragment$a.a[ProfileStartParam$CollectionSub.withName(str).ordinal()]){
                 case 1:
                   name = ProfileStartParam$CollectionSub.TAB_COLLECTION_POST.name;
                   str2 = this.getResources().getString(R.string.arg_RES_7f10074e);
                   tG = this.G;
                   if (tG != null) {
                      str1 = tG.mPhoto;
                   }
                   ov0 = new v0(this, this.Rh(name, this.Th(str2, str1)), CollectionPostFragment.class, this.getArguments());
                   break;
                 case 2:
                   name = ProfileStartParam$CollectionSub.TAB_COLLECTION_MUSIC.name;
                   str2 = this.getResources().getString(R.string.arg_RES_7f10074c);
                   tG = this.G;
                   if (tG != null) {
                      str1 = tG.mMusic;
                   }
                   ov0 = new w0(this, this.Rh(name, this.Th(str2, str1)), CollectionMusicFragment.class, this.getArguments());
                   break;
                 case 3:
                   name = ProfileStartParam$CollectionSub.TAB_COLLECTION_TAG.name;
                   str2 = this.getResources().getString(R.string.arg_RES_7f104d7d);
                   tG = this.G;
                   if (tG != null) {
                      str1 = tG.mTag;
                   }
                   ov0 = new x0(this, this.Rh(name, this.Th(str2, str1)), CollectionTagFragment.class, this.getArguments());
                   break;
                 case 4:
                   name = ProfileStartParam$CollectionSub.TAB_COLLECTION_MAGIC.name;
                   Resources resources = this.getResources();
                   int i = (e.a())? 0x7f104a51: 0x7f1009fe;
                   str2 = resources.getString(i);
                   tG = this.G;
                   if (tG != null) {
                      str1 = tG.mMagicFace;
                   }
                   ov0 = new y0(this, this.Rh(name, this.Th(str2, str1)), CollectionMagicFragment.class, this.getArguments());
                   break;
                 case 5:
                   name = ProfileStartParam$CollectionSub.TAB_COLLECTION_TEMPLATE.name;
                   str2 = this.getResources().getString(R.string.arg_RES_7f101bea);
                   tG = this.G;
                   if (tG != null) {
                      str1 = tG.mTemplate;
                   }
                   ov0 = new z0(this, this.Rh(name, this.Th(str2, str1)), CollectionTemplateFragment.class, this.getArguments());
                   break;
                 case 6:
                   name = ProfileStartParam$CollectionSub.TAB_COLLECTION_POI.name;
                   str2 = this.getResources().getString(R.string.arg_RES_7f10074d);
                   tG = this.G;
                   if (tG != null) {
                      str1 = tG.mPOI;
                   }
                   ov0 = new a1(this, this.Rh(name, this.Th(str2, str1)), CollectionPOIFragment.class, this.getArguments());
                   break;
                 case 7:
                   name = ProfileStartParam$CollectionSub.TAB_COLLECTION_SERIAL.name;
                   str2 = this.getResources().getString(R.string.arg_RES_7f10089f);
                   tG = this.G;
                   if (tG != null) {
                      str1 = tG.mSerial;
                   }
                   ov0 = new b1(this, this.Rh(name, this.Th(str2, str1)), CollectionSerialFragment.class, this.getArguments());
                   break;
                 default:
                   objArray = null;
             }
             objArray = ov0;
          }
          if (objArray != null) {
             obj.add(objArray);
          }else {
             iterator.remove();
          }
       }
       return obj;
    }
}
