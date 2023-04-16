package com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import z0b.b;
import o26.c;
import aha.a;
import eb5.g;
import dd5.k;
import iia.o1;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import e50.g;
import com.kuaishou.eve.kit.rerank.BizPage;
import iia.u1;
import com.yxcorp.gifshow.action.RealActionBizType;
import nga.h;
import hka.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import h1b.a;
import y0b.n;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import qvb.n0;
import jb5.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager;
import z0b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z0b.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dd5.j;
import com.yxcorp.gifshow.entity.QPhoto;
import o26.b;
import rvb.k$a;
import rvb.k;
import com.kwai.kcube.TabIdentifier;
import com.yxcorp.gifshow.follow.stagger.container.presenter.c;
import on5.a;
import com.yxcorp.gifshow.follow.stagger.container.presenter.d;
import java.lang.Throwable;
import java.lang.Boolean;
import wkd.b;
import gb5.a;
import com.yxcorp.retrofit.model.KwaiException;
import y8c.g;
import g9c.a;
import iia.d;
import xl8.b;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import lga.a;
import com.kwai.framework.model.user.QCurrentUser;
import rkd.b;
import com.yxcorp.gifshow.follow.stagger.presenter.a0;
import com.yxcorp.gifshow.follow.stagger.presenter.z;
import rja.c;
import brd.t;
import eb5.f;
import iha.b;
import com.yxcorp.gifshow.refresh.RefreshType;
import yv8.c;
import on5.b;
import wa5.e;
import java.lang.CharSequence;
import com.yxcorp.gifshow.follow.common.degrade.FollowPerformanceDegradeManager;
import java.util.Objects;
import xia.e;
import com.yxcorp.gifshow.model.LivePlayConfig;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import xia.g;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import com.yxcorp.gifshow.follow.stagger.container.presenter.HomeFollowDebugInfoPresenter;
import com.yxcorp.gifshow.follow.stagger.container.presenter.e;
import oia.r;
import com.yxcorp.gifshow.follow.stagger.presenter.b0;
import eja.n1;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.HomeItemRecoRealShowPresenter;
import com.yxcorp.gifshow.follow.stagger.presenter.v;
import com.yxcorp.gifshow.follow.stagger.presenter.r;
import oia.n;
import mia.d;
import e1b.d;
import mia.c;
import oia.m;
import e9c.a;
import androidx.fragment.app.Fragment;
import xa5.a;
import uja.s;
import tia.d;
import eja.t0;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment$a;
import eja.z;
import eja.s1;
import fs3.g;
import fs3.f;
import com.kwai.component.homepage_interface.pagelist.prefetch.HomeDataPrefetchLogger;
import pia.d;
import com.yxcorp.gifshow.model.FollowTabNotify;
import tkd.b;
import tkd.d;
import lv5.c;
import lv5.b;
import qia.a;
import com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils;
import xf6.l;
import e17.i;
import tja.a;
import com.yxcorp.gifshow.follow.model.FilterOption;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper;
import bha.a;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import kha.a;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import com.yxcorp.gifshow.follow.model.FilterBox;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.follow.stagger.data.i;
import q99.a;
import y99.i;
import ea5.d;
import java.lang.Integer;
import y0b.t;
import android.view.View;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import wia.b;
import java.lang.Float;
import gha.a;
import java.lang.Number;
import java.lang.Runtime;
import hn5.n;
import wia.a;
import android.app.Activity;
import java.lang.Runnable;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.refresh.RefreshLayout;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import y8c.q;
import mia.n;
import qvb.q;
import qvb.a;
import y8c.t;
import on5.f;
import uv6.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import am6.b;
import t45.d;
import brd.z;
import mia.f;
import erd.g;
import crd.b;
import wq6.d;
import as6.a;
import yq6.e;
import androidx.lifecycle.Lifecycle;
import do5.a;
import mia.a;
import yq6.a;
import xq6.b;
import qn5.a;
import com.yxcorp.gifshow.follow.stagger.container.a;
import mia.b;
import db5.c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.component.feedstaggercard.model.CardStyle;
import iia.x1;
import db5.a;
import db5.a$a;
import android.view.ViewGroup;
import iia.q1;
import androidx.recyclerview.widget.RecyclerView$n;
import android.content.res.Resources;
import com.yxcorp.gifshow.follow.stagger.c;
import qb5.b;
import qb5.e;
import com.kwai.component.fpsrecorder.PageFpsRecorder;
import na5.d$a;
import com.kwai.component.fpsrecorder.biz.FpsSocialBizType;
import na5.a;
import na5.d;
import com.kwai.component.fpsrecorder.ListScrollFpsRecorder;
import iia.r1;
import na5.b;
import com.kwai.component.feedsmonitor.FeedMonitor$b;
import com.kwai.component.feedsmonitor.FeedMonitor;
import com.kwai.component.feedsmonitor.f;
import com.kwai.component.feedsmonitor.pool.FeedPoolLifecycle;
import com.kwai.component.feedsmonitor.report.FeedReportRefreshLifecycle;
import qvb.i;
import com.kwai.component.feedsmonitor.report.FeedReportLifecycle;
import androidx.lifecycle.LifecycleOwner;
import y0b.s;
import y0b.h;
import o0b.b;
import java.lang.Long;
import via.v;
import sia.b;
import fja.l;
import a7c.h;
import pia.c;
import fja.h;
import ok.x;
import a7c.h$a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.pymk.f;
import com.kwai.component.feedstaggercard.widget.a;
import fja.i;
import fja.d;
import fja.k;
import i7c.f;
import fja.m;
import k2b.e0;
import f7c.d;
import com.yxcorp.gifshow.pymk.b;
import f7c.a;
import a7c.b$a;
import o0b.a;
import uia.f;
import fja.g;
import com.yxcorp.gifshow.listcomponent.module.b;
import com.yxcorp.gifshow.page.cost.RecyclerFragmentWithStageTrace;
import com.yxcorp.gifshow.listcomponent.event.a;
import java.util.HashMap;
import kotlin.Pair;
import nsd.u;
import mia.m;
import java.util.Locale;
import ekd.q;
import java.util.Set;
import ro5.d0;
import hha.b;
import ro5.e0;
import e50.i;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowEveRankPresenter;
import com.yxcorp.gifshow.follow.stagger.presenter.y;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.i;
import wh5.c;
import ayb.i;
import com.yxcorp.gifshow.follow.stagger.data.m;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import y0b.i;
import y0b.j;
import java.util.Collection;
import hn5.m;
import android.content.Context;
import za5.a;
import com.yxcorp.gifshow.follow.stagger.container.b;
import lnc.l$b;
import lnc.l;
import android.content.res.Configuration;
import com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.h;
import iia.b;
import com.kwai.component.feedsmonitor.pool.a;
import uh5.e;
import ob5.a;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import wia.g;
import wia.f;
import iia.a;
import android.content.SharedPreferences;
import km8.b;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import android.view.LayoutInflater;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import o26.d;
import ed5.e;
import dha.d;
import com.yxcorp.gifshow.postwork.PostStatus;
import jia.k;
import ab5.a;
import io.reactivex.subjects.PublishSubject;
import com.google.common.collect.ImmutableList;
import r26.a;
import mia.e;
import wia.h;
import java.lang.Enum;
import android.app.Application;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import aja.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import java.lang.System;
import k2b.k2;
import com.kwai.soc.arch.rubas.base.Rubas;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import android.util.Pair;
import nia.h;
import iia.c;
import jia.g;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment$2;
import rja.e;

public class HomeFollowFragment extends HomeItemFragment implements b, c, a, g, k, o1	// class@001155
{
    public n R;
    public View S;
    public c T;
    public k U;
    public a U0;
    public final i V;
    public f V0;
    public boolean W;
    public a W0;
    public final u1 X;
    public final h X0;
    public d Y;
    public boolean Y0;
    public RealActionBizType Z;
    public t Z0;
    public v a1;
    public g b1;
    public f c1;
    public b d1;
    public h e1;
    public static final int f1;

    public void HomeFollowFragment(){
       super();
       this.V = new g(BizPage.MAIN_FOLLOW);
       this.X = new u1(this);
       this.Z = RealActionBizType.FOLLOW;
       this.X0 = new h();
       this.Y0 = false;
    }
    public k Ah(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onCreateRefreshController");
       a uoa = new a(new a(this.Q8()), this, this.Q8().I());
       this.G = uoa;
       return uoa;
    }
    public VirtualLayoutManager B1(){
       return a.a(this);
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, HomeFollowFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onCreatePresenter");
       PatchProxy.onMethodExit(HomeFollowFragment.class, "24");
       return this.Yh();
    }
    public c C0(){
       return this.U;
    }
    public BaseFragment Cg(){
       return this;
    }
    public boolean D5(){
       return j.a(this);
    }
    public void Dc(QPhoto p0){
       b.a(this, p0);
    }
    public k$a I0(){
       return k.a;
    }
    public PresenterV2 Kh(TabIdentifier p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, HomeFollowFragment.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "createHomeItemPresenter");
       PatchProxy.onMethodExit(HomeFollowFragment.class, "30");
       return new c(a.a(p0));
    }
    public PresenterV2 Lh(){
       Object obj = PatchProxy.applyWithListener(null, this, HomeFollowFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "createHomeItemRecyclerViewPresenter");
       PatchProxy.onMethodExit(HomeFollowFragment.class, "31");
       return new d(false);
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(HomeFollowFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, HomeFollowFragment.class, "36")) {
          return;
       }
       super.M1(p0, p1);
       c.f(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowFragment"), "onError", p1, "isFirstPage", String.valueOf(p0));
       b.a(0x8708467).g("followLoad", false);
       if (p1 instanceof KwaiException && p1.mErrorCode == 13) {
          return;
       }
       if (p0 && this.g7().R0()) {
          this.Y.t.d(Boolean.TRUE);
       }
       return;
    }
    public PresenterV2 Mh(){
       Object obj = PatchProxy.applyWithListener(null, this, HomeFollowFragment.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "createHomeItemRefreshPresenter");
       PatchProxy.onMethodExit(HomeFollowFragment.class, "33");
       return new HomeFollowRefreshPresenter();
    }
    public PresenterV2 Nh(){
       a0 obj = PatchProxy.applyWithListener(null, this, HomeFollowFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "createHomeLoadUiPresenter");
       if (a.a() && !QCurrentUser.ME.isLogined()) {
          PatchProxy.onMethodExit(HomeFollowFragment.class, "32");
          return new PresenterV2();
       }else if(b.g()){
          obj = new a0();
          this.e1 = obj;
          PatchProxy.onMethodExit(HomeFollowFragment.class, "32");
          return obj;
       }else {
          PatchProxy.onMethodExit(HomeFollowFragment.class, "32");
          return new z();
       }
    }
    public void Oh(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFragment.class, "27")) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "createItemPresenter");
       this.gi();
       return;
    }
    public n Q8(){
       return this.R;
    }
    public c Qa(){
       return this.Y.z;
    }
    public d Qh(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.R.I();
    }
    public t Ra(){
       return f.b(this);
    }
    public b S3(){
       return this.Y.s;
    }
    public void S9(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFragment.class, "58")) {
          return;
       }
       this.J3(RefreshType.FOLLOW_NO_PHOTO);
       return;
    }
    public String Sh(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "getSubName");
       return "HomeFollowFragment";
    }
    public c Tc(){
       return this.Z;
    }
    public TabIdentifier Ua(){
       return b.c;
    }
    public boolean Vh(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.o() != null) {
          return (e.a()).contains(this.o());
       }
       return false;
    }
    public boolean X0(){
       return false;
    }
    public String X3(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.d(this.Ua());
    }
    public boolean Xf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeFollowFragment.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!("following").equals(p0)) {
          return false;
       }
       this.yf();
       return true;
    }
    public PresenterV2 Yh(){
       FollowPerformanceDegradeManager c;
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, HomeFollowFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.Ah();
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "createPresenter");
       obj = new PresenterV2();
       c = FollowPerformanceDegradeManager.c;
       Objects.requireNonNull(c);
       if (FollowPerformanceDegradeManager.a) {
          obj.U7(new e());
       }
       if (FollowConfigUtil.o() != null && FollowConfigUtil.o().mStrategy == 2) {
          Objects.requireNonNull(c);
          FollowPerformanceDegradeManager.a = true;
          obj.U7(new g());
       }
       if (SystemUtil.K() && a.a().c()) {
          obj.U7(new HomeFollowDebugInfoPresenter());
       }
       obj.U7(new e());
       obj.U7(new r());
       obj.U7(new b0());
       obj.U7(new n1());
       obj.U7(new HomeItemRecoRealShowPresenter());
       obj.U7(new v());
       obj.U7(new r());
       n on = new n();
       on.A = this.G;
       on.y = new d(this);
       on.z = new c(this);
       obj.U7(on);
       obj.U7(new m());
       obj.U7(new a());
       if (a.h(this)) {
          obj.U7(new s());
       }
       if (!a.a()) {
          obj.U7(new d());
       }
       if (a.a()) {
          obj.U7(new t0());
       }
       obj.U7(new HomeFollowFragment$a(this));
       obj.U7(new z());
       obj.U7(new s1());
       obj.U7(f.a().ZT());
       PatchProxy.onMethodExit(HomeFollowFragment.class, "26");
       return obj;
    }
    public void Z1(boolean p0,boolean p1){
       RefreshType refreshType;
       if (PatchProxy.isSupport(HomeFollowFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, HomeFollowFragment.class, "37")) {
          return;
       }
       super.Z1(p0, p1);
       int i = 2;
       if (!HomeDataPrefetchLogger.c(i)) {
          HomeDataPrefetchLogger.i(i);
       }
       d uod = this.ii();
       Objects.requireNonNull(uod);
       Object[] objArray = null;
       String str = "12";
       String str1 = "refreshType";
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, uod, d.class, str)) {
          b uob = uod.I.S3();
          uod.H = (uob == null || (uob.c() != null || d.a(-242212848).YB() != null))? "redpoint": uod.y2();
          if (uod.K()) {
             Object obj = PatchProxy.apply(objArray, objArray, HomeFollowExperimentUtils.class, str);
             if (obj != PatchProxyResult.class) {
                obj = obj.booleanValue();
             }else if(SystemUtil.K() && l.c("KEY_ENABLE_FOLLOW_REFRESH_TYPE_HINT", 0)){
                obj = true;
             }else {
                obj = false;
             }
             if (obj) {
                i.e(R.style.arg_RES_7f11066a, uod.H, 0);
             }
          }
          c.j(KsLogFollowTag.STAGGER_REFRESH.appendTag("FollowStaggerPageListDelegate"), "recordRefreshType", str1, uod.H);
       }
       b.a(0x8708467).E("followLoad");
       this.Y.t.d(Boolean.FALSE);
       refreshType = this.ii().x2();
       KsLogFollowTag sTAGGER_REFR = KsLogFollowTag.STAGGER_REFRESH;
       String str2 = "HomeFollowFragment";
       sTAGGER_REFR.appendTag(str2);
       KsLogFollowTag ksLogFollowT = sTAGGER_REFR;
       String str3 = (refreshType != null)? refreshType.refreshTypeToRefreshSource(): "";
       c.j(ksLogFollowT, "onStartLoading", str1, str3);
       HomeFollowFragment tY = this.Y;
       boolean b1 = (refreshType == RefreshType.PULL_DOWN)? true: false;
       tY.c = Boolean.valueOf(b1);
       tY = this.Y;
       if (refreshType != RefreshType.TAB_CLICK) {
          b = false;
       }
       tY.d = Boolean.valueOf(b);
       FilterOption uFilterOptio = this.Y.z.c().a();
       if (uFilterOptio != null) {
          c.i(sTAGGER_REFR.appendTag(str2), "current filter is "+uFilterOptio.mName);
       }
       return;
    }
    public final boolean Zh(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       FollowFilterHelper obj = PatchProxy.apply(objArray, this, HomeFollowFragment.class, "22");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = FollowFilterHelper.class;
       Object obj1 = PatchProxy.apply(objArray, objArray, obj, "18");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(FollowConfigUtil.f()){
          QCurrentUser obj2 = PatchProxy.apply(objArray, objArray, obj, "16");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else {
             Map map = a.b(new a().getType());
             if (map != null) {
                obj2 = QCurrentUser.ME;
                a.o(obj2, "QCurrentUser.ME");
                List list = map.get(obj2.getId());
                if (list != null) {
                   Iterator iterator = list.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         FilterBox mOptions = iterator.next().mOptions;
                         if (mOptions != null) {
                            Iterator iterator1 = mOptions.iterator();
                            while (true) {
                               if (iterator1.hasNext()) {
                                  if (TextUtils.n(iterator1.next().mName, FollowFilterHelper.e.h())) {
                                     b = true;
                                     break ;
                                  }
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                   }
                }
             }
             b = false;
          }
          if (b) {
             b = true;
          }
       }
       b = false;
       return b;
    }
    public String a2(){
       String obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.Y0 != null)? "ks://home/following/empty": super.a2();
       return obj;
    }
    public i ai(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.R.I() != null) {
          return this.R.I().Y2();
       }
       return null;
    }
    public d bi(){
       return this.Y;
    }
    public void c0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeFollowFragment.class, "44")) {
          return;
       }
       super.c0();
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onPageUnSelect");
       this.U0.d.d(false);
       if (!PatchProxy.applyVoid(objArray, this, HomeFollowFragment.class, "45")) {
          d uod = b.a(0x15ea63e);
          int i = 16;
          Objects.requireNonNull(uod);
          d uod1 = d.class;
          if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uod, uod1, "8")) {
             uod.a.remove(Integer.valueOf(i));
          }
       }
       return;
    }
    public h ci(){
       return this.X0;
    }
    public t di(){
       return this.d1;
    }
    public t ei(){
       return this.b1;
    }
    public int f(){
       return 16;
    }
    public void fh(View p0,Bundle p1){
       d z;
       c a;
       Object[] objArray1;
       h$a this;
       d$a uoa3;
       CardStyle uCardStyle;
       a$a h;
       q1 oq1;
       float f;
       boolean b3;
       RecyclerView recyclerView = this;
       HomeFollowFragment obj = p0;
       String obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "5";
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, recyclerView, HomeFollowFragment.class, str)) {
          return;
       }
       boolean b = true;
       int i = 0;
       d obj2 = null;
       if (FollowConfigUtil.j() && this.getActivity() != null) {
          FragmentActivity activity = this.getActivity();
          FollowConfigUtil uFollowConfi = FollowConfigUtil.class;
          String str1 = "1";
          if (!PatchProxy.applyVoidOneRefs(activity, obj2, b.class, str1)) {
             a.p(activity, "activity");
             a obj4 = PatchProxy.apply(obj2, obj2, uFollowConfi, "37");
             boolean b2 = (obj4 != patchProxyRe)? obj4.booleanValue(): a.e(FollowConfigUtil.z.v(), 0x3f800000);
             int i1 = 6;
             if (b2) {
                b.a(i1, i);
             }else {
                obj4 = PatchProxy.apply(obj2, obj2, uFollowConfi, "38");
                b2 = (obj4 != patchProxyRe)? obj4.booleanValue(): a.e(FollowConfigUtil.z.v(), 2.00f);
                int i2 = 4;
                if (b2) {
                   b.a(i1, i2);
                }else {
                   obj4 = a.a;
                   Float obj5 = PatchProxy.apply(obj2, obj2, uFollowConfi, "35");
                   if (obj5 != patchProxyRe) {
                      f = obj5.floatValue();
                   }else {
                      obj5 = FollowConfigUtil.z.v();
                      a.o(obj5, "mPreCreateLowMemoryThreshold");
                      f = obj5.floatValue();
                   }
                   Objects.requireNonNull(obj4);
                   a uoa4 = a.class;
                   if (PatchProxy.isSupport(uoa4)) {
                      Runtime obj6 = PatchProxy.applyOneRefs(Float.valueOf(f), obj4, uoa4, str1);
                      if (obj6 != patchProxyRe) {
                         b3 = obj6.booleanValue();
                      }else {
                      label_00be :
                         obj6 = Runtime.getRuntime();
                         long l2 = obj6.maxMemory();
                         long l3 = obj6.totalMemory();
                         long l4 = l2 - (l3 - obj6.freeMemory());
                         b3 = (l2 - null <= 0 || (((double)l4 * 0x3ff0000000000000) / (double)l2) - (double)f < 0)? true: false;
                      }
                   }else {
                      goto label_00be ;
                   }
                   if (!b3) {
                      b.a(i1, i2);
                   }
                }
             }
             d.a(-1883158055).OP(new a(activity));
          }
       }
       PageMonitor.INSTANCE.trackRealShow(recyclerView);
       KsLogFollowTag fOLLOW_STAGG = KsLogFollowTag.FOLLOW_STAGGER;
       String str2 = "HomeFollowFragment";
       fOLLOW_STAGG.appendTag(str2);
       String str3 = "doInitAfterViewCreated";
       c.i(fOLLOW_STAGG, str3);
       recyclerView.t = obj.findViewById(0x7f0a34da);
       recyclerView.s = obj.findViewById(0x7f0a3537);
       this.th();
       if (!PatchProxy.applyVoid(obj2, recyclerView, HomeFollowFragment.class, "65")) {
          this.h0().setAdapter(recyclerView.T);
          this.g7().o1(recyclerView);
       }
       recyclerView.I = new PresenterV2();
       n on = PatchProxy.apply(obj2, recyclerView, HomeFollowFragment.class, "66");
       if (on != patchProxyRe) {
       }else {
          on = new n(recyclerView.S, recyclerView);
       }
       recyclerView.R = on;
       on.g(recyclerView);
       if (recyclerView.R.I() != null) {
          n0 on0 = recyclerView.R.I();
          if (!PatchProxy.applyVoidOneRefs(on0, recyclerView, RecyclerFragment.class, "33")) {
             recyclerView.w = on0;
             if (recyclerView.B != null) {
                recyclerView.B = this.Ah();
                recyclerView.y.i(this.fg().toArray());
             }
          }
          recyclerView.R.I().h(recyclerView);
       }
       recyclerView.Z0 = recyclerView.R.N();
       String str4 = "6";
       if (!PatchProxy.applyVoidTwoRefs(obj, obj1, recyclerView, HomeFollowFragment.class, "12")) {
          fOLLOW_STAGG.appendTag(str2);
          c.i(fOLLOW_STAGG, str3);
          recyclerView.X.b();
          recyclerView.X.a();
          if (!PatchProxy.applyVoid(obj2, recyclerView, HomeFollowFragment.class, "14") && !a.a()) {
             c.i(KsLogFollowTag.FOLLOW_NOTIFY.appendTag(str2), "setMightExistNotifyInfo");
             recyclerView.Y.s.e(d.a(-242212848).YB());
          }
          this.a6();
          if (b.e()) {
             this.Uh();
          }else {
             recyclerView.M = RxBus.f.f(b.class).observeOn(d.a).subscribe(new f(recyclerView));
          }
          z = a.e(this);
          if (z != null) {
             z.c0().b(this.getLifecycle(), a.a, new a(recyclerView));
             z.c0().b(this.getLifecycle(), a.b, a.a);
             z.c0().b(this.getLifecycle(), a.c, new b(recyclerView));
          }
          this.h0().addOnScrollListener(c.b);
          if (!PatchProxy.applyVoid(obj2, recyclerView, HomeFollowFragment.class, "13") && this.Ac() != null) {
             if (recyclerView.W != null) {
                CardStyle mBottomType = recyclerView.Y.v.mBottomType;
                if (PatchProxy.isSupport(x1.class)) {
                   uCardStyle = mBottomType;
                   if (!PatchProxy.applyVoidThreeRefs(this, Integer.valueOf(mBottomType), Boolean.TRUE, null, x1.class, "1")) {
                   }
                }else {
                   uCardStyle = mBottomType;
                }
             }else {
                this.Ac().setBackgroundColor(this.getResources().getColor(R.color.arg_RES_7f060bcc));
             }
          }
          c uoc1 = new c(recyclerView);
          a = c.class;
          if (!PatchProxy.applyVoid(obj2, uoc1, a, "4")) {
             new b(uoc1).b();
             if (!PatchProxy.applyVoid(obj2, uoc1, a, str)) {
                uoa3 = new d$a(FpsSocialBizType.FOLLOW, "FOLLOW_PAGE");
                uoa3.c(i);
                new PageFpsRecorder(uoc1.b, uoa3.a()).a();
             }
             RecyclerView recyclerView1 = uoc1.b.h0();
             if (!PatchProxy.applyVoidOneRefs(recyclerView1, uoc1, a, str4)) {
                uoa3 = new d$a(FpsSocialBizType.FOLLOW, "FOLLOW_SCROLL");
                uoa3.c(b);
                uoa3.b(new r1(uoc1));
                new ListScrollFpsRecorder(uoc1.b, recyclerView1, uoa3.a()).a();
             }
             FeedMonitor$b uob2 = FeedMonitor.b("Follow");
             uob2.b(uoc1.b.V0);
             uob2.c(uoc1.b.W0);
             uob2.d(new FeedReportRefreshLifecycle(uoc1.b.Qh(), uoc1.b));
             uob2.a().d(uoc1.b);
          }
       }
       if (!PatchProxy.applyVoid(obj2, recyclerView, HomeFollowFragment.class, "11")) {
          long l1 = recyclerView.R.G().g();
          b uob1 = recyclerView.R.D();
          uob1.c(Long.valueOf(l1), "FOLLOW_FILTER_STATE", recyclerView.Y.z);
          uob1.c(Long.valueOf(l1), "FOLLOW_FEEDS_STATE_USER_LOGIN", recyclerView.Y.f);
          uob1.c(Long.valueOf(l1), "HOST_PLAY_BACK_FROM_DETAIL", recyclerView.U0.k);
          uob1.c(Long.valueOf(l1), "FOLLOW_PULL_DOWN", recyclerView.Y.c);
          uob1.c(Long.valueOf(l1), "HOST_PLAY_STATE_RESUME", recyclerView.U0.c);
          uob1.c(Long.valueOf(l1), "FOLLOW_VERSION", Integer.valueOf(recyclerView.Y.i));
          uob1.c(Long.valueOf(l1), "HOME_FOLLOW_PHOTO_CLICKED", recyclerView.Y.h);
          uob1.c(Long.valueOf(l1), "PHOTO_DETAIL_PARAM_PROCESSOR", recyclerView.Y.H);
          uob1.c(Long.valueOf(l1), "HOST_PLAY_STATE_SELECT", recyclerView.U0.d);
       }
       if (!PatchProxy.applyVoid(obj2, recyclerView, HomeFollowFragment.class, "8")) {
          v ov = new v(recyclerView.Y, recyclerView.U0, this.Qh());
          recyclerView.a1 = ov;
          recyclerView.R.z(ov);
       }
       if (!PatchProxy.applyVoid(obj2, recyclerView, HomeFollowFragment.class, "9")) {
          b uob = new b(recyclerView.Y, recyclerView.U0, this.Qh());
          recyclerView.d1 = uob;
          recyclerView.R.z(uob);
       }
       if (!PatchProxy.applyVoid(obj2, recyclerView, HomeFollowFragment.class, "7")) {
          obj = recyclerView.Y;
          d l = obj.L;
          d z1 = obj.z;
          d uod = this.Qh();
          z = l;
          d uod1 = z1;
          d uod2 = uod;
          l ol = l.class;
          obj2 = uod;
          d uod3 = z1;
          d uod4 = l;
          h oh = PatchProxy.applyFourRefs(z, uod1, uod2, this, 0, l.class, "1");
          if (oh != patchProxyRe) {
          }else {
             Objects.requireNonNull(uod3);
             uod2 = uod3;
             super(l.a(uod2, obj2), new c(i, new h(uod2)), this.m());
             a uoa1 = PatchProxy.applyTwoRefs(uod2, obj2, null, ol, "3");
             if (uoa1 != patchProxyRe) {
             }else if(obj2 == null){
                uoa1 = a.b;
             }else {
                uoa1 = new i(uod2, obj2);
             }
             k ok = PatchProxy.apply(null, null, ol, "2");
             if (ok != patchProxyRe) {
             }else {
                ok = k.b;
             }
             this.p(new d(uoa1, ok));
             boolean b1 = true;
             this.c(b1);
             this.m(new m(uod4, obj2, recyclerView));
             this = this.q((b.c() ^ b1));
             this.r(a.b);
             h$a uoa2 = this.j(i, null, uoa1);
             super();
             this.f = new h(uod2);
             uoa2.g(this);
             uoa2.h(b1);
             oh = uoa2.b();
          }
          this.Q8().C().d(Long.valueOf(this.Q8().G().g()), "PymkParams", oh);
       }
       if (FollowConfigUtil.a() && !PatchProxy.applyVoid(null, recyclerView, HomeFollowFragment.class, str4)) {
          fOLLOW_STAGG.appendTag(str2);
          c.i(fOLLOW_STAGG, "addRecommendSection");
          f uof = new f();
          recyclerView.c1 = uof;
          recyclerView.R.z(uof);
       }
       if (!PatchProxy.applyVoid(null, recyclerView, HomeFollowFragment.class, "68")) {
          c.i(KsLogFollowTag.FOLLOW_PYMK.appendTag(str2), "addFooterSection");
          g og = new g();
          recyclerView.b1 = og;
          recyclerView.R.z(og);
       }
       obj = recyclerView.R;
       Objects.requireNonNull(obj);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, obj, n.class, "4")) {
          obj.f(obj.k().toArray());
       }
       this.Ch();
       this.Q8().G().e().d("kscc.event.page.arch.request.willTriggerFirstPageRequest");
       if (this.Zh()) {
          z = recyclerView.Y.z;
          obj1 = FollowFilterHelper.e();
          Objects.requireNonNull(z);
          c uoc = c.class;
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(obj1, Boolean.FALSE, z, uoc, "25")) {
             a.p(obj1, "tabName");
             Object obj3 = z.e.get(obj1);
             if (obj3 != null) {
                a = z.a;
                FilterBox uFilterBox = z.d.get(obj3.getFirst());
                if (uFilterBox != null) {
                   uFilterBox = uFilterBox.mOptions;
                   if (uFilterBox != null) {
                      objArray1 = uFilterBox.get(obj3.getSecond().intValue());
                   label_0600 :
                      a.o(obj3, "it");
                      a uoa = new a(objArray1, obj3, null, false, 4, null);
                      a.d(uoc);
                   }
                }
                objArray1 = objArray;
                goto label_0600 ;
             }
          }
       }else if(FollowConfigUtil.g() && recyclerView.Y.z.e()){
          a.e("default");
       }
       return;
    }
    public t fi(){
       return this.a1;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "getLayoutResId");
       if (this.ni()) {
          return 0x7f0d15f5;
       }
       if (FollowConfigUtil.g()) {
          return 0x7f0d05d5;
       }
       return 0x7f0d05d4;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HomeFollowFragment.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, HomeFollowFragment.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(HomeFollowFragment.class, new m());
       }else {
          obj.put(HomeFollowFragment.class, null);
       }
       return obj;
    }
    public int getPage(){
       int i = (this.Y0 != null)? 59: 2;
       return i;
    }
    public String getPageParams(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StringBuilder obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "49");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "distribution_model=falls";
       Locale uS = Locale.US;
       String str = "&is_play=%b";
       int i = 1;
       Object[] objArray = new Object[i];
       HomeFollowFragment tY = this.Y;
       if (tY != null) {
          d f = tY.F;
          if (f != null && f.get().booleanValue()) {
          label_0038 :
             objArray[0] = Boolean.valueOf(i);
             obj = obj+String.format(uS, str, objArray);
             if (!PatchProxy.applyVoidOneRefs(obj, this, HomeFollowFragment.class, "50")) {
                HomeFollowFragment tY1 = this.Y;
                if (tY1 != null) {
                   d s = tY1.s;
                   if (s != null) {
                      FollowTabNotify uFollowTabNo = s.d();
                      if (uFollowTabNo != null) {
                         Map map = uFollowTabNo.toMaps();
                         if (!q.h(map)) {
                            Iterator iterator = map.keySet().iterator();
                            while (iterator.hasNext()) {
                               String str1 = iterator.next();
                               obj = obj+"&"+str1+"="+map.get(str1);
                            }
                         }
                      }
                   }
                }
             }
             if (a.d(this)) {
                d0.o0(this.getActivity(), "following", obj);
             }
             b uob = b.a(-713764853);
             _monitor_enter(uob);
             str = PatchProxy.applyOneRefs(this, uob, b.class, "5");
             if (str != patchProxyRe) {
             }else {
                str = "&follow_session_id="+uob.c(this)+"&visited_source="+uob.e(this);
             }
             _monitor_exit(uob);
             obj = obj+str;
             e0.b(this, obj);
             c.i(KsLogFollowTag.FOLLOW_VISIT.appendTag("HomeFollowFragment"), ("getPageParams").concat(obj));
             return obj;
          }
       }
       i = false;
       goto label_0038 ;
    }
    public PresenterV2 gi(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.applyWithListener(objArray, this, HomeFollowFragment.class, "28");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, this, HomeFollowFragment.class, "29");
       boolean b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(HomeFollowExperimentUtils.b() && this.V.isEnabled()){
          b1 = true;
       }else {
          b1 = false;
       }
       if (b1) {
          c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "enable rerank");
          this.I.U7(new HomeFollowEveRankPresenter(this.V, this));
       }
       super.Oh();
       if (a.h(this)) {
          this.I.U7(new y(this));
       }else {
          this.I.U7(new y(this, b));
       }
       this.I.U7(new i(c.b(), "f"));
       b1 = 0x4f878389;
       if (d.a(b1).CP() || FollowConfigUtil.e()) {
          d.a(b1).CX(this.I, FollowConfigUtil.e());
       }
       PatchProxy.onMethodExit(HomeFollowFragment.class, "28");
       return this.I;
    }
    public m hi(){
       HomeFollowFragment obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.R;
       if (obj != null && obj.I() != null) {
          return this.R.I().Z2();
       }
       return null;
    }
    public boolean i8(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.yf();
       return true;
    }
    public d ii(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.R.I();
    }
    public LifecycleOwner j(){
       return this;
    }
    public void j8(boolean p0){
       if (PatchProxy.isSupport(HomeFollowFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HomeFollowFragment.class, "61")) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_PYMI.appendTag("HomeFollowFragment"), "collapsePymi animate:"+p0);
       RecyclerView$LayoutManager layoutManage = this.h0().getLayoutManager();
       if (layoutManage instanceof VirtualLayoutManager && !layoutManage.h()) {
          if (this.ai() != null) {
             layoutManage = (!this.ai().D - 1)? 1: 0;
             if (layoutManage) {
                this.h0().scrollToPosition(1);
                return;
             }
          }
          if (p0) {
             this.h0().smoothScrollToPosition(1);
          }else {
             this.h0().scrollToPosition(1);
          }
       }
       return;
    }
    public void ji(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFragment.class, "41")) {
          return;
       }
       j oj = this.b1.A(0).H();
       if (q.f(oj.w())) {
          return;
       }
       oj.r();
       return;
    }
    public boolean kf(){
       return f.a(this);
    }
    public boolean ki(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Y.z.h();
    }
    public boolean lh(){
       return true;
    }
    public boolean li(){
       HomeFollowFragment obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b1;
       if (obj != null) {
          return obj.A(0).H().j().isLoading();
       }
       return 0;
    }
    public boolean mi(){
       HomeFollowFragment obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b1;
       if (obj != null) {
          return (obj.A(0).H().w().isEmpty() ^ 0x01);
       }
       return 0;
    }
    public final boolean ni(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "67");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (m.a().U3(this.getActivity()) && a.o0(this.getActivity()).p0() == 2)? true: false;
       return b;
    }
    public void oi(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFragment.class, "56")) {
          return;
       }
       c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowFragment"), "refreshIfEmpty");
       l.a(this.g7(), new b(this));
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowFragment.class, "69")) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onConfigurationChanged");
       if (b.g()) {
          HomeFollowFragment td1 = this.d1;
          if (td1 != null) {
             Objects.requireNonNull(td1);
             if (!PatchProxy.applyVoidOneRefs(p0, td1, b.class, "5")) {
                String str = "newConfig";
                a.p(p0, str);
                b y = td1.y;
                if (y != null && !PatchProxy.applyVoidOneRefs(p0, y, HomeFollowFeedsComponent.class, "11")) {
                   a.p(p0, str);
                   if (p0.orientation == 1) {
                      y.O(2);
                   }else {
                      y.O(4);
                   }
                }
             }
          }
          td1 = this.e1;
          if (td1 != null) {
             td1.S8(p0);
          }
       }
       super.onConfigurationChanged(p0);
       return;
    }
    public void onCreate(Bundle p0){
       String str2;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowFragment.class, str)) {
          return;
       }
       KsLogFollowTag fOLLOW_STAGG = KsLogFollowTag.FOLLOW_STAGGER;
       String str1 = "HomeFollowFragment";
       fOLLOW_STAGG.appendTag(str1);
       c.i(fOLLOW_STAGG, "onCreate");
       b.a(0x8708467).a("followInit");
       super.onCreate(p0);
       this.Y = new d(this);
       this.U0 = new b(this, FollowConfigUtil.o(), 1);
       this.W = a.h(this);
       this.V0 = new f();
       this.W0 = new a();
       HomeFollowFragment tX = this.X;
       Objects.requireNonNull(tX);
       if (!PatchProxy.applyVoid(null, tX, u1.class, str)) {
          if (!e.f() && b.a(-1684107285).i(2)) {
             fOLLOW_STAGG.appendTag(str1);
             c.i(fOLLOW_STAGG, "isPreFetched");
          }else {
             FragmentActivity activity = tX.a.getActivity();
             if (activity != null) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                   Uri data = intent.getData();
                   if (data != null && data.isHierarchical() == true) {
                      str = x0.a(data, "feedId");
                      str2 = x0.a(data, "feedType");
                      if (!TextUtils.x(str) && !TextUtils.x(str2)) {
                         h oh = tX.a.ci();
                         a.o(oh, "fragment.followPageListWrapper");
                         oh.a(str);
                         h oh1 = tX.a.ci();
                         a.o(oh1, "fragment.followPageListWrapper");
                         oh1.b(str2);
                      }
                   }
                }
             }
          }
       }
       FollowFilterHelper.l();
       if (!PatchProxy.applyVoid(null, null, g.class, "2")) {
          Type type = new f().getType();
          str2 = a.a.getString("follow_stagger_live_subscribe_showed_cache", "{}");
          Object[] objArray = (str2 == null || str2 == "")? null: b.a(str2, type);
          g.a = objArray;
          if (objArray == null) {
             g.a = Maps.s();
          }
          g.b = new b(null);
          g.c = new ArrayList();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HomeFollowFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onCreateView");
       View view = super.onCreateView(p0, p1, p2);
       this.S = view;
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFragment.class, "20")) {
          return;
       }
       super.onDestroy();
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onDestroy");
       HomeFollowFragment tU0 = this.U0;
       if (tU0 != null) {
          tU0.a();
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeFollowFragment.class, "19")) {
          return;
       }
       super.onDestroyView();
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onDestroyView");
       if (this.hi() != null) {
          this.hi().m3(objArray);
          m om = this.hi();
          Objects.requireNonNull(om);
          if (!PatchProxy.applyVoid(objArray, om, m.class, "1")) {
             c.i(KsLogFollowTag.FOLLOW_POST.appendTag("NewPublishHomeFollowPageList"), "destroy");
             om.U0.Qb(om);
          }
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFragment.class, "3")) {
          return;
       }
       super.onResume();
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onResume");
       b.a(0x8708467).z("followInit");
       return;
    }
    public void onScrollStateChanged(int p0){
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFragment.class, "46")) {
          return;
       }
       super.onStart();
       if (this.Y.t.a().booleanValue()) {
          c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowFragment"), "followRetry");
          this.J3(RefreshType.FOLLOW_RETRY);
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFragment.class, "4")) {
          return;
       }
       super.onStop();
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onStop");
       return;
    }
    public i q(){
       return this.Qh();
    }
    public e qe(){
       return j.b(this);
    }
    public List r1(){
       return null;
    }
    public boolean r4(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowFragment"), "onBottomTabClick");
       this.Y.D.b(4);
       super.r4();
       return true;
    }
    public t sh(){
       return this.Z0;
    }
    public void t5(boolean p0){
       if (PatchProxy.isSupport(HomeFollowFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, HomeFollowFragment.class, "48")) {
          return;
       }
       KsLogFollowTag sTAGGER_REFR = KsLogFollowTag.STAGGER_REFRESH;
       String str = "HomeFollowFragment";
       sTAGGER_REFR.appendTag(str);
       c.i(sTAGGER_REFR, "onPageListDataModified");
       if (this.Qh().isEmpty() && (!this.Y.L.a().booleanValue() && QCurrentUser.me().isLogined())) {
          c.i(sTAGGER_REFR.appendTag(str), "refresh");
          this.ii().T2(false);
          this.J3(RefreshType.FOLLOW_DELETE_TO_NULL);
       }
    label_005e :
       return;
    }
    public void tc(PostStatus p0,int p1,float p2,TabIdentifier p3){
       b.c(this, p0, p1, p2, p3);
    }
    public void th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeFollowFragment.class, "10")) {
          return;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "initRecyclerView");
       k ok = PatchProxy.apply(objArray, this, HomeFollowFragment.class, "63");
       if (ok != PatchProxyResult.class) {
       }else {
          k ok1 = new k(this, this.Ua(), this.Y, this.U0, this.H);
          this.U = ok;
       }
       this.T = ok;
       super.th();
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFragment.class, "39")) {
          return;
       }
       super.u();
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onPageSelect");
       this.U0.d.d(true);
       this.Y.b.onNext(new Object());
       return;
    }
    public void u4(ImmutableList p0,a p1,boolean p2){
       boolean b1;
       if (PatchProxy.isSupport(HomeFollowFragment.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, HomeFollowFragment.class, "57")) {
          return;
       }
       if (p2) {
          l.a(this.g7(), new e(this));
       }
       boolean b = this.c1();
       h oh = h.class;
       Object obj = null;
       if (!PatchProxy.isSupport(oh) || (!PatchProxy.applyVoidTwoRefs(p1, Boolean.valueOf(b), obj, oh, "1") && p1 != null)) {
          PostStatus status = p1.getStatus();
          KsLogFollowTag fOLLOW_POST = KsLogFollowTag.FOLLOW_POST;
          fOLLOW_POST.appendTag("NewPublishProcessHelper");
          c.j(fOLLOW_POST, "showToast", "status", status.name());
          if (p1.isDisableUploadSuccessToast()) {
             fOLLOW_POST.appendTag("NewPublishProcessHelper");
             c.i(fOLLOW_POST, "showToast is disabled");
          }else if(status == PostStatus.ENCODE_CANCELED || (status == PostStatus.UPLOAD_CANCELED && !p1.getRecoverStatus())){
             String str = a.B.getString(R.string.arg_RES_7f1004c5);
             if (!b) {
                i.d(R.style.arg_RES_7f110668, str);
             }
          }else if(status == PostStatus.UPLOAD_COMPLETE && p1.getShareOption() == KwaiOp.NONE){
             String str1 = a.B.getString(R.string.arg_RES_7f103f4d);
             Object obj1 = PatchProxy.applyOneRefs(p1, obj, oh, "2");
             if (obj1 != PatchProxyResult.class) {
                b1 = obj1.booleanValue();
             }else if(p1.getUploadInfo() != null && p1.getUploadInfo().getUploadPostType() == IUploadRequest$UploadPostType.SCHOOL){
                b1 = true;
             }else {
                b1 = false;
             }
             if (!b || b1) {
                i.d(R.style.arg_RES_7f110669, str1);
             }
          }
       }
       this.Y.e.onNext(Boolean.valueOf(p2));
       return;
    }
    public void v2(boolean p0,boolean p1){
       HomeFollowFragment z0;
       d h;
       String str1;
       d uod1;
       d uod2;
       d uod3;
       HashMap hashMap1;
       k2 ok2;
       ClientEvent$ElementPackage uElementPack;
       int str21;
       boolean b = this;
       boolean b1 = p1;
       if (PatchProxy.isSupport(HomeFollowFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), b, HomeFollowFragment.class, "47")) {
          return;
       }
       KsLogFollowTag sTAGGER_REFR = KsLogFollowTag.STAGGER_REFRESH;
       sTAGGER_REFR.appendTag("HomeFollowFragment");
       c.i(sTAGGER_REFR, "onFinishLoading");
       boolean b2 = true;
       if (!b1) {
          d uod = this.ii();
          Objects.requireNonNull(uod);
          k ok = k.class;
          if (!PatchProxy.applyVoidOneRefs(b, uod, d.class, "13")) {
             boolean b5 = uod.K();
             h = uod.H;
             String str = "unkown";
             if (PatchProxy.isSupport(ok)) {
                str1 = str;
                uod1 = h;
                if (!PatchProxy.applyVoidThreeRefs(this, Boolean.valueOf(b5), h, null, k.class, "18")) {
                label_006f :
                   Object[] String str2 = "h_l_r";
                   if (b5) {
                      if (!PatchProxy.applyVoidTwoRefs(b, uod1, null, ok, "20")) {
                         uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.name = str2;
                         uElementPack.action2 = "REFRESH";
                         str2 = new Object[b2];
                         str2[0] = uod1;
                         uElementPack.params = String.format("{\"refresh_type\":\"%s\"}", str2);
                         Objects.requireNonNull(uod1);
                         switch (uod1.hashCode()){
                             case 0x8ae4b05e:
                               if (!uod1.equals("click_tab")) {
                               label_013d :
                                  str21 = -1;
                               }else {
                                  str21 = 0;
                               }
                               break;
                             case 0xc9829637:
                               if (!uod1.equals("delete_to_null")) {
                                  goto label_013d ;
                               }else {
                                  str21 = 1;
                               }
                               break;
                             case 0xcde76d54:
                               if (!uod1.equals(str1)) {
                                  goto label_013d ;
                               }else {
                                  str21 = 2;
                               }
                               break;
                             case 0xd1a92d3e:
                               if (!uod1.equals("click_back")) {
                                  goto label_013d ;
                               }else {
                                  str21 = 3;
                               }
                               break;
                             case 0xd21e4f9f:
                               if (!uod1.equals("redpoint")) {
                                  goto label_013d ;
                               }else {
                                  str21 = 4;
                               }
                               break;
                             case 0x316510:
                               if (!uod1.equals("init")) {
                                  goto label_013d ;
                               }else {
                                  str21 = 5;
                               }
                               break;
                             case 0x34ae45:
                               if (!uod1.equals("pull")) {
                                  goto label_013d ;
                               }else {
                                  str21 = 6;
                               }
                               break;
                             case 0x67622a8:
                               if (!uod1.equals("retry")) {
                                  goto label_013d ;
                               }else {
                                  str21 = 7;
                               }
                               break;
                             case 0xce008c2:
                               if (!uod1.equals("click_bottom")) {
                                  goto label_013d ;
                               }else {
                                  str21 = 8;
                               }
                               break;
                             case 0x135b3a0f:
                               if (!uod1.equals("click_filter")) {
                                  goto label_013d ;
                               }else {
                                  str21 = 9;
                               }
                               break;
                             case 0x2af363fa:
                               if (!uod1.equals("red_bubble")) {
                                  goto label_013d ;
                               }else {
                                  str21 = 10;
                               }
                               break;
                             case 0x3b0c9a34:
                               if (!uod1.equals("no_photo")) {
                                  goto label_013d ;
                               }else {
                                  str21 = 11;
                               }
                               break;
                             case 0x5ba8c5a0:
                               if (!uod1.equals("return_follow")) {
                                  goto label_013d ;
                               }else {
                                  str21 = 12;
                               }
                               break;
                             default:
                               goto label_013d ;
                         }
                         switch (str21){
                             case 0:
                             case 2:
                             case 3:
                             case 4:
                             case 5:
                             case 7:
                             case 8:
                             case 9:
                             case 10:
                             case 11:
                             case 12:
                             case 1:
                               u1.M("", this, 1, uElementPack, null, null);
                               break;
                             case 6:
                               u1.M("", this, 8, uElementPack, null, null);
                               break;
                             default:
                               u1.U("home_load_reason", "error");
                         }
                      }
                   }else if(PatchProxy.applyVoidOneRefs(b, null, ok, "21")){
                      uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.name = str2;
                      uElementPack.action2 = "LOAD_MORE";
                      u1.M("", this, 9, uElementPack, null, null);
                   }
                }
             }else {
                str1 = str;
                uod1 = h;
                goto label_006f ;
             }
             if (uod.K()) {
                uod1 = uod.H;
                d l = uod.L;
                d m = uod.M;
                if (PatchProxy.isSupport(ok)) {
                   uod2 = m;
                   uod3 = l;
                   if (!PatchProxy.applyVoidFourRefs(this, uod1, Long.valueOf(l), Long.valueOf(m), 0, k.class, "19")) {
                   }
                }else {
                   uod2 = m;
                   uod3 = l;
                }
             }
          label_01fc :
             uod.H = str1;
             sTAGGER_REFR.appendTag("FollowStaggerPageListDelegate");
             c.j(sTAGGER_REFR, "finishLoad", "refreshType", "UNKNOWN");
          }
       }
       HomeFeedResponse homeFeedResp = this.Qh().L0();
       int b3 = (p0 && (q.f(homeFeedResp.getItems()) && (homeFeedResp.mNeedShowInterestedUser == null && homeFeedResp.mNeedShowNotLoginInterestedUser == null)))? true: false;
       b.Y0 = b3;
       super.v2(p0, p1);
       b.a(0x8708467).g("followLoad", b1);
       if (p0) {
          b.X0.c(null, b2);
          if (!b1) {
             this.h0().scrollToPosition(0);
          }
       }
       b3 = 2;
       if (HomeDataPrefetchLogger.c(b3) && !HomeDataPrefetchLogger.b(b3)) {
          HomeDataPrefetchLogger.h(b3);
       }
       if (p0) {
          HashMap hashMap = new HashMap();
          hashMap.put("isFollowCache", String.valueOf(p1));
          boolean b4 = (homeFeedResp.mLocalRequestSource == b2)? true: false;
          hashMap.put("isFollowPreload", String.valueOf(b4));
          Rubas.d("followStaggerRequestExtra", hashMap);
       }
       if (p0) {
          if (!b1) {
             if (homeFeedResp.mLocalRequestSource != b2 || homeFeedResp.mIsPrefetchExpired == null) {
                b2 = false;
             }
             if (!b2) {
                z0 = b.Z0;
                if (z0 instanceof h) {
                   Objects.requireNonNull(z0);
                   if (!PatchProxy.applyVoid(null, z0, h.class, "3") && z0.p != null) {
                      z0.p = false;
                      z0.x();
                   }
                }
             }
          }
          z0 = b.Z0;
          if (z0 instanceof h) {
             z0.s();
          }
       }
    label_02c4 :
       return;
    }
    public g vh(){
       HomeFollowFragment obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "64");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onCreateAdapter");
       obj = this.Y;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(this, obj, d.class, "1")) {
          obj.H = new c(obj, this);
       }
       return new g(this.T);
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, HomeFollowFragment.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onCreateLayoutManager");
       return new HomeFollowFragment$2(this, this.getContext());
    }
    public boolean yf(){
       Object[] objArray = null;
       KsLogFollowTag obj = PatchProxy.apply(objArray, this, HomeFollowFragment.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KsLogFollowTag.FOLLOW_STAGGER;
       String str = "HomeFollowFragment";
       obj.appendTag(str);
       c.i(obj, "onTabClick");
       d b = this.Y.B;
       if (!b.isEmpty()) {
          Iterator iterator = b.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
          return true;
       }else {
          this.Y.D.b(4);
          if (e.f()) {
             return super.yf();
          }
          if (!PatchProxy.isSupport(HomeFollowFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, this, HomeFollowFragment.class, "60")) {
             c.i(obj.appendTag(str), "scrollToTop");
             if (this.h0() != null) {
                this.h0().scrollToPosition(0);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, HomeFollowFragment.class, "53") && this.Y.s.c() != null) {
             if (FollowConfigUtil.g() && !this.Y.z.d()) {
                this.Y.z.n(RefreshType.FOLLOW_REDPOINT, true);
             }else {
                this.J3(RefreshType.FOLLOW_REDPOINT);
             }
          }
          return true;
       }
    }
    public i yh(){
       Object[] objArray = null;
       m obj = PatchProxy.apply(objArray, this, HomeFollowFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER.appendTag("HomeFollowFragment"), "onCreatePageList");
       obj = new m(this.X0, this, this.V, this.t);
       obj.I = this.V0;
       obj.J = this.W0;
       d uod = new d(obj, this, this.V, this.t);
       uod.Z2().m3(this);
       this.U.p = uod;
       if (this.Zh()) {
          String str = FollowFilterHelper.e();
          if (!PatchProxy.applyVoidOneRefs(str, objArray, FollowFilterHelper.class, "15")) {
             a.p(str, "selectTab");
             FollowFilterHelper.b = str;
          }
          uod.c3(FollowFilterHelper.e());
       }
       return uod;
    }
}
