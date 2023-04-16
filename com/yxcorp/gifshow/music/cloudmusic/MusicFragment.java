package com.yxcorp.gifshow.music.cloudmusic.MusicFragment;
import ml8.d;
import c35.i;
import c35.c;
import lob.r;
import lob.s;
import im8.g;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment$a;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment$b;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jqb.n;
import androidx.fragment.app.Fragment;
import com.kuaishou.viewbinder.IViewBinder;
import com.yxcorp.gifshow.music.cloudmusic.viewbinder.AbsMusicFragmentViewBinder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.yxcorp.gifshow.music.cloudmusic.widget.MusicSmoothPagerSlidingTabStrip;
import java.util.List;
import lob.k0;
import java.util.Map;
import java.util.HashMap;
import jqb.k;
import kob.k;
import java.lang.StringBuilder;
import w46.b;
import java.lang.IllegalArgumentException;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import java.lang.Integer;
import gka.i;
import android.widget.HorizontalScrollView;
import jpb.b;
import java.lang.Boolean;
import android.content.Context;
import i2b.a;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import android.graphics.Typeface;
import lnc.a1;
import java.lang.CharSequence;
import android.content.Intent;
import java.util.Objects;
import dpb.b;
import com.kwai.feature.component.searchhistory.SearchLayout;
import com.yxcorp.gifshow.music.cloudmusic.works.WorksMusicFragment;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragmentWrapper;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import q87.c;
import mkc.b;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.feature.post.api.music.cloudmusic.RecordSelectMusicData;
import com.kuaishou.android.model.music.Music;
import kob.n;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kuaishou.viewbinder.BaseViewBinder;
import com.yxcorp.gifshow.util.PostUtils;
import com.yxcorp.gifshow.music.cloudmusic.viewbinder.DefaultMusicFragmentViewBinder;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.b;
import lnc.b9;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import fpb.d;
import hpb.a;
import k2b.e0;
import kuaishou.perf.page.impl.d;
import dpb.i;
import dpb.i$a;
import dpb.h;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption$a;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import com.google.android.material.tabs.TabLayout$c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip;
import jqb.j;
import com.yxcorp.utility.n;
import java.lang.Float;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import mkc.c;
import lob.b0;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import lob.z;
import lob.w;
import erd.g;
import yob.e;
import lob.a0;
import com.trello.rxlifecycle3.android.FragmentEvent;
import eoc.f;
import com.yxcorp.gifshow.music.cloudmusic.a;
import ekd.m1;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import com.yxcorp.gifshow.music.cloudmusic.g;
import com.yxcorp.gifshow.music.cloudmusic.k;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment$d;
import ok.h;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import qvb.i;
import com.google.android.material.tabs.TabLayout$f;
import com.yxcorp.gifshow.model.response.MusicCategoriesResponse;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.music.cloudmusic.c;
import ekd.q$b;
import java.util.ArrayList;
import android.content.SharedPreferences;
import oe6.n;
import lob.v;
import com.yxcorp.gifshow.model.MusicCategory;
import oe6.b;
import jqb.l;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import q46.t;
import java.util.Locale;
import ra6.a;
import com.yxcorp.utility.SystemUtil;
import android.text.TextPaint;
import gka.j;
import com.yxcorp.gifshow.music.cloudmusic.common.CategoryMusicFragment;
import com.yxcorp.gifshow.music.cloudmusic.collect.CollectMusicFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import k2b.u1;
import com.yxcorp.gifshow.music.cloudmusic.billboard.BillboardMusicFragment;
import com.yxcorp.gifshow.music.cloudmusic.history.HistoryMusicFragment;
import com.yxcorp.gifshow.music.cloudmusic.widget.BaseMusicSmoothPagerSlidingTabStrip$c;
import lob.x;
import com.yxcorp.gifshow.music.cloudmusic.d;
import lob.y;
import com.yxcorp.gifshow.music.cloudmusic.e;

public class MusicFragment extends TabHostFragmentV2 implements d, i, c, r, s, g	// class@001fe6
{
    public PublishSubject A;
    public PublishSubject B;
    public MusicFragment C;
    public RecordSelectMusicData D;
    public Music E;
    public PresenterV2 F;
    public a G;
    public b H;
    public b I;
    public List J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public b O;
    public b P;
    public n Q;
    public final h R;
    public ViewPager$i S;
    public final TabLayout$d T;
    public KwaiActionBar q;
    public View r;
    public MusicCategoriesResponse s;
    public MusicSmoothPagerSlidingTabStrip t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public AbsMusicFragmentViewBinder y;
    public String z;
    public static final int U;

    public void MusicFragment(){
       super();
       this.w = 0;
       this.x = false;
       this.A = PublishSubject.g();
       this.B = PublishSubject.g();
       this.R = new MusicFragment$a(this);
       this.S = new MusicFragment$b(this);
       this.T = new MusicFragment$c(this);
    }
    public void Ea(){
       if (PatchProxy.applyVoid(null, this, MusicFragment.class, "12")) {
          return;
       }
       String str = this.ph();
       n.a(1, str);
       n.a(0, str);
       return;
    }
    public Fragment H8(){
       return this;
    }
    public int M(){
       return 4;
    }
    public IViewBinder O1(){
       return this.rh();
    }
    public ClientContent$ContentPackage Q3(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, MusicFragment.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$TagPackage tagPackage = new ClientContent$TagPackage();
       tagPackage.identity = this.ph();
       tagPackage.name = this.qh();
       obj.tagPackage = tagPackage;
       return obj;
    }
    public IViewBinder V5(int p0){
       return this.nh(p0);
    }
    public boolean Wd(){
       return this.N;
    }
    public boolean Xg(){
       return false;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MusicFragment.class, "10")) {
          return;
       }
       if (this.s == null) {
          this.sh();
       }
       super.a();
       return;
    }
    public void cb(){
       this.N = true;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicFragment.class, "1")) {
          return;
       }
       this.k = this.rh().B();
       this.q = this.rh().f;
       this.j = this.rh().z();
       this.r = this.rh().A();
       this.t = this.rh().y();
       return;
    }
    public int f(){
       return 56;
    }
    public List fh(){
       return null;
    }
    public int getLayoutResId(){
       return 0x7f0d1009;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicFragment.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MusicFragment.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MusicFragment.class, new k0());
       }else {
          obj.put(MusicFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       return 50;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, MusicFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return k.g(this.z, this.qh(), this.ph());
    }
    public String getUrl(){
       MusicFragment obj = PatchProxy.apply(null, this, MusicFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj == null) {
          return "ks://online_music/record";
       }
       if (obj == 1) {
          return "ks://online_music/edit";
       }
       if (obj == 2) {
          return "ks://online_music/live";
       }
       Object[] objArray = new Object[0];
       k.D().t("music_fragment", "Illegal enter type:"+this.u, objArray);
       throw new IllegalArgumentException("Illegal enter type:"+this.u);
    }
    public boolean gh(){
       return true;
    }
    public void kh(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicFragment.class, "36")) {
          return;
       }
       super.kh(p0);
       this.t.g();
       this.mh(0);
       return;
    }
    public void mh(int p0){
       if (PatchProxy.isSupport(MusicFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, MusicFragment.class, "38")) {
          return;
       }
       MusicFragment tt = this.t;
       if (tt != null) {
          TabHostFragmentV2 tl = this.l;
          if (tl != null) {
             if (tl.j() <= 1) {
                p0 = 8;
             }
             tt.setVisibility(p0);
          }
       }
       return;
    }
    public AbsMusicFragmentViewBinder nh(int p0){
       if (PatchProxy.isSupport(MusicFragment.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, MusicFragment.class, "35");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       AbsMusicFragmentViewBinder uAbsMusicFra = PatchProxy.applyTwoRefs(AbsMusicFragmentViewBinder.class, this, null, b.class, "1");
       if (uAbsMusicFra != PatchProxyResult.class) {
       }else {
          uAbsMusicFra = b.a(null, AbsMusicFragmentViewBinder.class, this);
       }
       return uAbsMusicFra;
    }
    public final View oh(String p0,boolean p1){
       View obj;
       if (PatchProxy.isSupport(MusicFragment.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, MusicFragment.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.a(this.getContext(), R.layout.arg_RES_7f0d0ffc);
       obj.setLayoutParams(new LinearLayout$LayoutParams(-1, -1));
       TextView textView = obj.findViewById(R.id.tab_text);
       if (p1) {
          textView.setTextSize(17.00f);
          textView.setTypeface(Typeface.defaultFromStyle(1));
       }else {
          textView.setTextSize(16.00f);
          textView.setTypeface(Typeface.defaultFromStyle(0));
       }
       textView.setSingleLine();
       int i = (p1)? 0x7f061915: 0x7f061916;
       textView.setTextColor(a1.a(i));
       textView.setText(p0);
       return obj;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(MusicFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, MusicFragment.class, "29")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       if (p0 == 1002 && p1 == -1) {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, MusicFragment.class, "30")) {
             MusicFragment tO = this.O;
             Objects.requireNonNull(tO);
             if (!PatchProxy.applyVoid(objArray, tO, b.class, "17")) {
                b a = tO.a;
                if (a != null) {
                   a.g(0);
                }
             }
             if (!this.t() instanceof WorksMusicFragment) {
                this.jh(this.w);
             }
             Fragment uFragment1 = this.eh(this.w);
             if (uFragment1 instanceof WorksMusicFragment) {
                uFragment1.Ph(true);
             }
          }
       }
       if (p0 == 1004 && p1 == -1) {
          Fragment uFragment = this.eh(this.K);
          if (uFragment instanceof LocalMusicFragmentWrapper) {
             Objects.requireNonNull(uFragment);
             if (!PatchProxy.applyVoidOneRefs(p2, uFragment, LocalMusicFragmentWrapper.class, "6")) {
                String str = "LocalMusicFragmentWrapp";
                Log.g(str, "refreshLocalMusicList");
                LocalMusicFragmentWrapper j = uFragment.j;
                if (j != null) {
                   j.W = p2.getStringExtra("KEY_IMPORT_MUSIC_ADDED");
                   uFragment.j.a();
                }else {
                   i1.b(str, new RuntimeException("refreshLocalMusicList error mLocalMusicFragment is null"));
                }
                uFragment.j.h0().scrollToPosition(0);
             }
          }
       }
       return;
    }
    public boolean onBackPressed(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       MusicFragment obj = PatchProxy.apply(objArray, this, MusicFragment.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.O;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, b.class, "15");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b a = obj.a;
          if (a != null) {
             a.m(a);
             if (a.onBackPressed()) {
                b = true;
             }
          }
          b = false;
       }
       if (b) {
          return true;
       }else {
          Intent intent = new Intent();
          if (this.getArguments() != null) {
             intent.putExtra("isMusicActivityLaunchFromTemplate", this.getArguments().getBoolean("is_launcher_from_template", false));
          }
          this.Ea();
          if (this.getActivity() != null) {
             this.getActivity().setResult(false, intent);
             this.getActivity().finish();
          }
          return true;
       }
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MusicFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       k.D().w("CloudMusic", "fragment onCreate", objArray);
       this.C = this;
       this.u = this.getArguments().getInt("enter_type", i);
       this.P = new b(b.g.a);
       this.v = this.getArguments().getInt("duration");
       this.z = this.getArguments().getString("photo_task_id");
       this.D = SerializableHook.getSerializable(this.getArguments(), "RECORD_SELECT_MUSIC_DATA");
       this.E = SerializableHook.getSerializable(this.getArguments(), "RECORD_FORCE_INSERT_MAGIC_MUSIC");
       this.x = this.getArguments().getBoolean("MUSIC_TEMPLATE_ENTRANCE_ENABLED", i);
       FragmentActivity activity = this.getActivity();
       if (activity != null) {
          this.Q = new n(activity.getIntent());
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       AbsMusicFragmentViewBinder obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, MusicFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       k.D().w("CloudMusic", "fragment onCreateView", objArray);
       obj = this.nh(-1);
       this.y = obj;
       View bindedView = obj.getBindedView(p0, p1, p2);
       if (bindedView.findViewById(0x7f0a3a78) == null) {
          PostUtils.x("CloudMusic_onCreateView", "layout may be wrong");
          MusicFragment ty = this.y;
          if (ty instanceof DefaultMusicFragmentViewBinder) {
             Objects.requireNonNull(ty);
             objArray = new Object[0];
             k.D().w("CloudMusic", "layout is wrong "+0, objArray);
          }
          bindedView = a.g(p0, this.getLayoutResId(), p1, 0);
          Object[] objArray1 = new Object[0];
          k.D().w("CloudMusic", "reInflate", objArray1);
       }
       this.y.bindViews(bindedView);
       this.doBindView(bindedView);
       return bindedView;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MusicFragment.class, "32")) {
          return;
       }
       super.onDestroy();
       MusicFragment tF = this.F;
       if (tF != null) {
          tF.destroy();
       }
       this.O.i();
       b9.a(this.H);
       b9.a(this.I);
       if (!q.f(this.J)) {
          Iterator iterator = this.J.iterator();
          while (iterator.hasNext()) {
             b9.a(iterator.next());
          }
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MusicFragment.class, "31")) {
          return;
       }
       MusicFragment tF = this.F;
       if (tF != null) {
          tF.unbind();
       }
       super.onDestroyView();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MusicFragment.class, "4")) {
          return;
       }
       super.onResume();
       if (!this.O.h()) {
          d.a.m(this.C, a.a.a(this.u, 0));
       }
       d.d("postMusicPageMonitor").h("loadDataToRenderFinish");
       d.d("postMusicPageMonitor").c();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       MusicFragment tQ;
       View view;
       AppBarLayout$LayoutParams layoutParams;
       float f;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = new Object[0];
       k.D().w("CloudMusic", "fragment onViewCreated", objArray);
       Object[] objArray1 = null;
       i oi = PatchProxy.apply(objArray1, this, MusicFragment.class, "6");
       if (oi != PatchProxyResult.class) {
       }else {
          i$a uoa1 = new i$a().d(this).g(this.R);
          uoa1.h(this.z);
          uoa1.c(this.u);
          uoa1.e(this.v);
          uoa1.b(this.x);
          uoa1.f(R.id.tabs_container);
          MusicSearchUiOption$a uoa2 = new MusicSearchUiOption$a();
          uoa2.b(0);
          uoa2.c(a1.d(R.dimen.arg_RES_7f070cb1));
          oi = uoa1.i(uoa2.a()).a();
       }
       b uob = new b(oi);
       this.O = uob;
       uob.b(p0);
       this.j.a(this.T);
       this.i(this.S);
       this.t.setViewPager(this.k);
       g og = 0x7f0a37a8;
       if (!PatchProxy.applyVoidOneRefs(p0, this, MusicFragment.class, "8") && this.q != null) {
          if (j.a(this.u)) {
             tQ = this.Q;
             if (tQ != null && tQ.g()) {
                n.Y(this.q, 8, 0);
                tQ = this.O;
                f = 8.00f;
                Objects.requireNonNull(tQ);
                b uob1 = b.class;
                if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), tQ, uob1, "14")) {
                   uob = tQ.a;
                   if (uob != null) {
                      ViewGroup$LayoutParams layoutParams2 = uob.getLayoutParams();
                      a.o(layoutParams2, "layoutParams");
                      if (layoutParams2 instanceof ViewGroup$MarginLayoutParams) {
                         layoutParams2.topMargin = a1.e(f);
                         uob.setLayoutParams(layoutParams2);
                      }
                   }
                }
                if (p0 != null) {
                   view = p0.findViewById(og);
                   if (view != null) {
                      ViewGroup$LayoutParams layoutParams1 = view.getLayoutParams();
                      layoutParams1.height = a1.e(52.00f);
                      view.setLayoutParams(layoutParams1);
                   }
                }
             }
          }
          this.q.d(R.drawable.arg_RES_7f081b8d, 0, R.string.arg_RES_7f103aa5);
       }
    label_011a :
       this.O.e();
       if (!PatchProxy.applyVoid(objArray1, this, MusicFragment.class, "15")) {
          c.h(this.r, b.d);
          this.H = t.fromCallable(new b0(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new z(this), new w(this));
       }
       f.c(e.class, new a0(this), this, FragmentEvent.DESTROY_VIEW);
       this.F = new PresenterV2();
       a uoa = new a();
       this.G = uoa;
       this.F.U7(uoa);
       if (j.a(this.u)) {
          tQ = this.Q;
          if (tQ == null || !tQ.g()) {
          label_01a8 :
             this.F.U7(new g());
          }else if(PatchProxy.applyVoidOneRefs(p0, this, MusicFragment.class, "7")){
             view = m1.f(p0, og);
             if (view != null) {
                layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                   layoutParams.d(0);
                   view.setLayoutParams(layoutParams);
                }
             }
          }
       }else {
          goto label_01a8 ;
       }
       if (this.D != null) {
          this.F.U7(new k());
       }
       this.F.f(p0);
       Object[] objArray2 = new Object[]{this};
       this.F.i(objArray2);
       return;
    }
    public String ph(){
       Fragment obj = PatchProxy.apply(null, this, MusicFragment.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t();
       if (obj != null && obj.getArguments() != null) {
          return String.valueOf(obj.getArguments().getLong("category_id"));
       }
       return "";
    }
    public String qh(){
       Fragment obj = PatchProxy.apply(null, this, MusicFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t();
       if (obj != null && obj.getArguments() != null) {
          return obj.getArguments().getString("category_name", "");
       }
       return "";
    }
    public AbsMusicFragmentViewBinder rh(){
       return this.y;
    }
    public void sh(){
       if (PatchProxy.applyVoid(null, this, MusicFragment.class, "13")) {
          return;
       }
       b[] uobArray = new b[]{this.P};
       c.d(this.r, uobArray);
       c.h(this.r, b.d);
       this.I = b9.c(this.I, new MusicFragment$d(this));
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, MusicFragment.class, "24")) {
          return;
       }
       SearchMusicFragment searchMusicF = (this.O.g())? this.O.c(): this.t();
       if (searchMusicF instanceof CloudMusicRecyclerFragment) {
          searchMusicF.Hh().reset();
       }else if(searchMusicF instanceof LocalMusicFragmentWrapper){
          searchMusicF.ch().Hh().reset();
       }
       return;
    }
    public void u(){
       b b;
       b a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MusicFragment.class, "37")) {
          return;
       }
       if (!this.O.h()) {
          d.a.m(this.C, a.a.a(this.u, 0));
       }
       MusicFragment tO = this.O;
       Objects.requireNonNull(tO);
       if (!PatchProxy.applyVoid(objArray, tO, b.class, "16")) {
          b = tO.b;
          if (b != null) {
             a.m(b);
             if (b.isVisible()) {
                b = tO.b;
                a.m(b);
                i oi = b.q();
                a.o(oi, "searchMusicFragment!!.pageList");
                if (!oi.isEmpty()) {
                label_005c :
                   return;
                }
             }
          }
          a = tO.a;
          if (a != null) {
             a.onBackPressed();
             goto label_005c ;
          }else {
             goto label_005c ;
          }
       }
    }
    public void uh(TabLayout$f p0,int p1){
       if (PatchProxy.isSupport(MusicFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, MusicFragment.class, "23")) {
          return;
       }
       View view = p0.a();
       if (view == null) {
          return;
       }
       view = view.findViewById(R.id.indicator);
       if (view == null) {
          return;
       }
       view.setVisibility(p1);
       return;
    }
    public void vh(MusicCategoriesResponse p0){
       String str2;
       boolean b;
       MusicCategory obj2;
       Bundle uBundle;
       ArrayList uArrayList2;
       MusicCategory musicCategor2;
       int i7;
       ArrayList uArrayList3;
       int i8;
       int i9;
       View view;
       ArrayList uArrayList4;
       Object[] objArray;
       int i = this;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, i, MusicFragment.class, "16")) {
          return;
       }
       if (obj != null && !q.f(p0.getItems())) {
          String str = "music_fragment";
          MusicCategory musicCategor = null;
          if (!QCurrentUser.ME.isLogined() && (!PatchProxy.applyVoidOneRefs(obj, i, MusicFragment.class, "19") && !q.f(obj.mCategories))) {
             Object[] objArray1 = new Object[musicCategor];
             k.D().s(str, "removeCollectCategory\(\)", objArray1);
             q.c(obj.mCategories, c.a);
          }
       label_0050 :
          ArrayList uArrayList = new ArrayList();
          MusicFragment u = i.u;
          n on = n.class;
          String str1 = "";
          MusicCategory obj1 = null;
          if (PatchProxy.isSupport(on)) {
             str2 = PatchProxy.applyOneRefs(Integer.valueOf(u), obj1, on, "4");
             if (str2 != PatchProxyResult.class) {
             label_008a :
                MusicCategory musicCategor1 = -1;
                if (this.getArguments() != null) {
                   str2 = "EXTRA_DEFAULT_SELECTED_TAB";
                   if (this.getArguments().getInt(str2)) {
                      str1 = Integer.toString(this.getArguments().getInt(str2));
                   }
                   int[] intArray = this.getArguments().getIntArray("EXTRA_HIDDEN_TABS");
                   if (PatchProxy.applyVoidTwoRefs(obj, intArray, i, MusicFragment.class, "20") || (!q.f(obj.mCategories) && intArray != null)) {
                      objArray = new Object[musicCategor];
                      k.D().s(str, "removeHiddenCategory\(\) = "+intArray, objArray);
                      q.c(obj.mCategories, new v(intArray));
                   }
                label_00ed :
                   if (intArray != null) {
                      int len = intArray.length;
                      int i1 = 0;
                      while (true) {
                         if (i1 < len) {
                            if (intArray[i1] == musicCategor1) {
                               str2 = str1;
                               b = true;
                            label_00ff :
                               int i2 = p0.getItems().size();
                               if ((p0.getItems().get((i2 - 1)).mType).equals("mine") && !b.s()) {
                                  i2 = i2 - 1;
                               }
                               int i3 = i2;
                               FragmentActivity activity = this.getActivity();
                               l ol = l.class;
                               if (PatchProxy.isSupport(ol)) {
                                  obj2 = PatchProxy.applyTwoRefs(activity, Integer.valueOf(i3), obj1, ol, "2");
                                  if (obj2 != PatchProxyResult.class) {
                                     i2 = obj2.intValue();
                                  }else {
                                  label_0148 :
                                     float f = (float)n.x(activity);
                                     float f1 = (i3 <= 0.00f)? (float)i3: 4.70f;
                                     i2 = (int)(f / f1);
                                     if (i2 <= 0) {
                                        i2 = l.a;
                                     }
                                  }
                               }else {
                                  goto label_0148 ;
                               }
                               int i4 = i2;
                               i2 = 0;
                               int i5 = 0;
                               while (i2 < i3) {
                                  if (TextUtils.n(String.valueOf(p0.getItems().get(i2).mId), str2)) {
                                     i5 = i2;
                                  }
                                  i2 = i2 + 1;
                                  musicCategor1 = -1;
                               }
                               ArrayList uArrayList1 = new ArrayList();
                               int i6 = 0;
                               while (i6 < i3) {
                                  LinearLayout$LayoutParams obj3 = p0.getItems().get(i6);
                                  MusicCategory obj4 = PatchProxy.applyOneRefs(obj3, i, MusicFragment.class, "21");
                                  if (obj4 != PatchProxyResult.class) {
                                     uBundle = obj4;
                                     uArrayList2 = uArrayList;
                                  }else {
                                     Bundle uBundle1 = new Bundle();
                                     uBundle1.putString("photo_task_id", i.z);
                                     uBundle1.putInt("enter_type", i.u);
                                     uBundle1.putInt("duration", i.v);
                                     uArrayList2 = uArrayList;
                                     uBundle1.putLong("category_id", obj3.mId);
                                     uBundle1.putString("category_name", obj3.mName);
                                     SerializableHook.putSerializable(uBundle1, "RECORD_SELECT_MUSIC_DATA", i.D);
                                     SerializableHook.putSerializable(uBundle1, "RECORD_FORCE_INSERT_MAGIC_MUSIC", i.E);
                                     uBundle1.putBoolean("MUSIC_TEMPLATE_ENTRANCE_ENABLED", i.x);
                                     t.b(uBundle1, t.d(this.getArguments()));
                                     uBundle = uBundle1;
                                  }
                                  TabLayout$f uof = i.j.w();
                                  obj2 = obj3.mName;
                                  obj4 = obj3.mShowLabel;
                                  if (PatchProxy.isSupport(MusicFragment.class)) {
                                     musicCategor2 = obj4;
                                     obj1 = obj2;
                                     obj = obj3;
                                     i7 = i5;
                                     uArrayList3 = uArrayList1;
                                     i8 = i4;
                                     i9 = i3;
                                     view = PatchProxy.applyThreeRefs(obj2, Integer.valueOf(i4), Boolean.valueOf(obj4), this, MusicFragment.class, "22");
                                     if (view != PatchProxyResult.class) {
                                     label_0294 :
                                        uof.k(view);
                                        i2 = 0x7f061915;
                                        obj2 = obj.mType;
                                        Objects.requireNonNull(obj2);
                                        switch (obj2.hashCode()){
                                            case 0x332453:
                                              if (obj2.equals("mine")) {
                                                 len = 0;
                                              }
                                              break;
                                            case 0x36ebbd:
                                              if (obj2.equals("used")) {
                                                 len = 1;
                                              }
                                              break;
                                            case 0x625df6b:
                                              if (obj2.equals("local")) {
                                                 len = 2;
                                              }
                                              break;
                                            case 0xf3f7aea:
                                              if (obj2.equals("rankList")) {
                                                 len = 3;
                                              }
                                              break;
                                            case 0x3ea1c99c:
                                              if (obj2.equals("favorite")) {
                                                 len = 4;
                                              }
                                              break;
                                            default:
                                           label_02a6 :
                                              len = -1;
                                        }
                                        switch (len){
                                            case 0:
                                              uArrayList4 = uArrayList2;
                                              i3 = 0;
                                              if (b.s()) {
                                                 i.w = i6;
                                                 uArrayList4.add(new j(uof, WorksMusicFragment.class, uBundle));
                                              }
                                              break;
                                            case 1:
                                              uArrayList4 = uArrayList2;
                                              i3 = 0;
                                              uBundle.putBoolean("EXTRA_HIDDEN_LOCAL", b);
                                              uArrayList4.add(new j(uof, HistoryMusicFragment.class, uBundle));
                                              break;
                                            case 2:
                                              uArrayList4 = uArrayList2;
                                              i3 = 0;
                                              uArrayList4.add(new j(uof, LocalMusicFragmentWrapper.class, uBundle));
                                              break;
                                            case 3:
                                              uArrayList4 = uArrayList2;
                                              i3 = 0;
                                              uArrayList4.add(new j(uof, BillboardMusicFragment.class, uBundle));
                                              break;
                                            case 4:
                                              uArrayList4 = uArrayList2;
                                              uArrayList4.add(new j(uof, CollectMusicFragment.class, uBundle));
                                              objArray = null;
                                              if (!PatchProxy.applyVoid(objArray, objArray, k.class, "10")) {
                                                 ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                                                 uElementPack.name = "show_collect_tab";
                                                 uElementPack.type = 1;
                                                 uElementPack.status = 1;
                                                 uElementPack.action = 1161;
                                                 ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
                                                 showEvent.elementPackage = uElementPack;
                                                 u1.g0(showEvent);
                                              }
                                              break;
                                            default:
                                              uArrayList4 = uArrayList2;
                                              uArrayList4.add(new j(uof, CategoryMusicFragment.class, uBundle));
                                              objArray = 0;
                                        }
                                     label_0367 :
                                        BaseMusicSmoothPagerSlidingTabStrip$c uoc = new BaseMusicSmoothPagerSlidingTabStrip$c(obj.mName, a1.a(i2), i.oh(obj.mName, true), i.oh(obj.mName, false), i8);
                                        ArrayList uArrayList5 = uArrayList3;
                                        uArrayList5.add(len);
                                        i6 = i6 + 1;
                                        uArrayList = uArrayList4;
                                        i4 = i8;
                                        i5 = i7;
                                        i3 = i9;
                                        uArrayList1 = uArrayList5;
                                     }
                                  }else {
                                     musicCategor2 = obj4;
                                     obj1 = obj2;
                                     obj = obj3;
                                     i7 = i5;
                                     i9 = i3;
                                     uArrayList3 = uArrayList1;
                                     i8 = i4;
                                  }
                                  view = a.a(this.getActivity(), R.layout.arg_RES_7f0d1027);
                                  RelativeLayout relativeLayo = view.findViewById(R.id.text_region);
                                  obj3 = relativeLayo.getLayoutParams();
                                  obj3.width = i8;
                                  relativeLayo.setLayoutParams(obj3);
                                  TextView textView = view.findViewById(R.id.text);
                                  textView.setText(obj1);
                                  if (!SystemUtil.G(a.c())) {
                                     textView.setTextSize(13.00f);
                                  }
                                  if (musicCategor2 != null) {
                                     view.findViewById(R.id.new_label).setVisibility(0);
                                  }
                                  View view1 = view.findViewById(R.id.indicator);
                                  LinearLayout$LayoutParams layoutParams = view1.getLayoutParams();
                                  layoutParams.width = (int)textView.getPaint().measureText(obj1);
                                  view1.setLayoutParams(layoutParams);
                                  goto label_0294 ;
                               }
                               i.t.x(uArrayList1);
                               i.t.q(j.c, j.d);
                               i2 = i3;
                               i.lh((i2 - 1));
                               i.kh(uArrayList);
                               i.jh(i5);
                               i.S2(i);
                               if (!PatchProxy.isSupport(MusicFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i2), i, MusicFragment.class, "18")) {
                                  i.J = new ArrayList();
                                  int i10 = 0;
                                  while (i10 < i2) {
                                     Fragment uFragment = i.eh(i10);
                                     if (uFragment instanceof CloudMusicRecyclerFragment) {
                                        i.J.add(uFragment.Hh().e().subscribe(new x(i), d.b));
                                     }else if(uFragment instanceof LocalMusicFragmentWrapper){
                                        i.J.add(uFragment.ch().Hh().e().subscribe(new y(i), e.b));
                                     }
                                     i10 = i10 + 1;
                                  }
                               }
                               i.b2(1);
                            }else {
                               i1 = i1 + 1;
                            }
                         }
                      }
                   }
                   str2 = str1;
                }
                b = false;
                goto label_00ff ;
             }
          }
          str2 = n.b().getString("music_last_tab_id_"+u, str1);
          goto label_008a ;
       }
       return;
    }
}
