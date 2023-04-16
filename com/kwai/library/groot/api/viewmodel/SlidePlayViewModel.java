package com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.lifecycle.DefaultLifecycleObserver;
import sy6.a;
import com.kwai.library.groot.api.viewmodel.a;
import ok.x;
import com.google.common.base.Suppliers;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import yw6.g;
import java.lang.Object;
import xl8.b;
import java.lang.Boolean;
import java.util.concurrent.CopyOnWriteArrayList;
import zv6.t;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aw6.d;
import androidx.fragment.app.Fragment;
import o56.c;
import o56.a;
import java.lang.IllegalStateException;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleObserver;
import android.view.View;
import aw6.j;
import tl8.g;
import com.yxcorp.gifshow.entity.QPhoto;
import fx6.b;
import gx6.c;
import java.lang.Integer;
import aw6.e;
import h3.a;
import com.kwai.library.groot.api.viewmodel.i;
import aw6.a;
import qvb.q;
import vy6.a;
import java.util.Objects;
import aw6.c;
import zv6.t$a;
import java.util.Map;
import zv6.a;
import kotlin.jvm.internal.a;
import zv6.u;
import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;
import lw6.a;
import java.lang.Number;
import nw6.f;
import cw6.b;
import bw6.a;
import fx6.d;
import com.kwai.library.slide.base.pagelist.a;
import yw6.h;
import com.kwai.library.groot.api.viewmodel.m;
import java.lang.Iterable;
import brd.t;
import fx6.a;
import erd.o;
import brd.a0;
import com.kwai.framework.model.feed.BaseFeed;
import cx6.h;
import qvb.i;
import aw6.h;
import aw6.k;
import fw6.b;
import com.kwai.library.groot.framework.viewitem.constant.GrootViewItemSwitchType;
import dx6.b;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import nw6.e;
import uw9.v3;
import tw6.c;
import aw6.o;
import xw6.a;
import uw6.a;
import ew6.b;
import ew6.a;
import uw6.f;
import java.util.HashMap;
import ih5.g;
import jh5.a;
import aw6.s;
import aw6.b;
import aw6.u;
import fx6.f;
import java.util.Collection;
import ekd.q;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import ex6.d;
import aw6.f;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import fx6.e;
import android.view.ViewGroup;
import com.yxcorp.gifshow.refresh.RefreshType;
import m9c.a;
import wvb.e;
import aw6.g;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.groot.api.viewmodel.k;
import com.kwai.library.groot.api.viewmodel.d;
import uw6.e;
import com.kwai.library.groot.api.viewmodel.f;
import hw6.a;
import com.kwai.library.groot.api.viewmodel.g;
import com.kwai.library.groot.api.viewmodel.h;
import java.lang.Float;
import tw6.e;
import aw6.p;
import aw6.t;
import aw6.q;
import com.kwai.library.groot.api.viewmodel.l;
import androidx.viewpager.widget.ViewPager$i;
import aw6.m;
import com.kwai.library.groot.api.viewmodel.c;
import fw6.c;
import qw6.a;
import vw6.b;
import aw6.l;
import yy6.c;
import java.util.Iterator;
import aw6.i;
import ww6.a;
import com.kwai.library.groot.api.viewmodel.j;
import n2.a;
import com.kwai.library.groot.api.viewmodel.b;
import android.database.DataSetObserver;
import aw6.r;
import aw6.n;
import com.kwai.library.groot.api.viewmodel.e;
import androidx.fragment.app.c;
import jw6.a;
import dw6.a;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.greenrobot.eventbus.a;
import e6a.c;
import d6a.f;

public class SlidePlayViewModel implements DefaultLifecycleObserver, a	// class@000827
{
    public boolean b;
    public String c;
    public g d;
    public final b e;
    public KwaiGrootViewPager f;
    public g g;
    public a h;
    public final List i;
    public v3 j;
    public int k;
    public final t l;
    public static final x m;

    static {
       SlidePlayViewModel.m = Suppliers.a(a.b);
    }
    public void SlidePlayViewModel(KwaiGrootViewPager p0,g p1){
       super();
       this.b = false;
       this.e = new b(Boolean.FALSE);
       this.i = new CopyOnWriteArrayList();
       this.k = -1;
       this.g = p1;
       this.f = p0;
       this.l = new t(p0, null);
    }
    public void SlidePlayViewModel(KwaiGrootViewPager p0,g p1,SlideTaskDispatcher p2){
       super();
       this.b = false;
       this.e = new b(Boolean.FALSE);
       this.i = new CopyOnWriteArrayList();
       this.k = -1;
       this.g = p1;
       this.f = p0;
       this.l = new t(p0, p2);
    }
    public static SlidePlayViewModel A0(Activity p0){
       SlidePlayViewModel obj = PatchProxy.applyOneRefs(p0, null, SlidePlayViewModel.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, d.class, "12");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = d.e(d.b(p0));
       }
       return obj;
    }
    public static SlidePlayViewModel B0(Fragment p0){
       SlidePlayViewModel obj = PatchProxy.applyOneRefs(p0, null, SlidePlayViewModel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.d(p0);
       if (obj == null) {
          if (p0 != null) {
             p0.toString();
          }
          if (a.a().c()) {
             throw new IllegalStateException("请检查是否是上下滑场景，并执行了attach2Fragment；如果你的场景确实需要使用可空的值，请替换为SlidePlayViewModel.getNullable\(\)方法");
          }
       }
       return obj;
    }
    public static SlidePlayViewModel S0(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SlidePlayViewModel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.d(p0);
    }
    public static SlidePlayViewModel u0(FragmentActivity p0,KwaiGrootViewPager p1,g p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SlidePlayViewModel obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, SlidePlayViewModel.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new SlidePlayViewModel(p1, p2);
       d uod = d.class;
       Object obj1 = PatchProxy.applyTwoRefs(p0, obj, null, uod, "9");
       if (obj1 != patchProxyRe) {
          obj = obj1;
       }else if(PatchProxy.applyVoidTwoRefs(p0, obj, null, uod, "3")){
          if (d.e(d.b(p0)) != null) {
             d.g(d.b(p0));
          }
          d.f(d.b(p0), obj);
       }
       d.a(p0, obj);
       return obj;
    }
    public static SlidePlayViewModel v0(Fragment p0,KwaiGrootViewPager p1,g p2,SlideTaskDispatcher p3){
       SlidePlayViewModel obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, SlidePlayViewModel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SlidePlayViewModel(p1, p2, p3);
       d uod = d.class;
       p3 = PatchProxy.applyTwoRefs(p0, obj, null, uod, "8");
       if (p3 != PatchProxyResult.class) {
          obj = p3;
       }else if(PatchProxy.applyVoidTwoRefs(p0, obj, null, uod, "2")){
          if (d.e(d.c(p0)) != null) {
             d.g(d.c(p0));
          }
          d.f(d.c(p0), obj);
       }
       d.a(p0, obj);
       return obj;
    }
    public void A(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "65")) {
          return;
       }
       this.l1(new j(p0));
       return;
    }
    public void A1(QPhoto p0,boolean p1){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, slidePlayVie, "149")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && uob.i() != null) {
          uob.i().a0(p0, p1);
       }
       return;
    }
    public void B(int p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, slidePlayVie, "70")) {
          return;
       }
       this.l1(new e(p0));
       return;
    }
    public void B1(){
       if (PatchProxy.applyVoid(null, this, SlidePlayViewModel.class, "154")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && uob.c() != null) {
          uob.c().v(false);
       }
       return;
    }
    public boolean C(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_data_source_service");
       boolean b = true;
       if (obj != null && obj.j()) {
          b = false;
       }
       return b;
    }
    public a C0(){
       return this.k1(i.a, null);
    }
    public void C1(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "152")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && uob.c() != null) {
          uob.c().M0(p0);
       }
       return;
    }
    public void D(Fragment p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, "15")) {
          return;
       }
       t ot = this.t1();
       Objects.requireNonNull(ot);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ot, t.class, "13")) {
          t f = ot.f;
          if (f != null && p0 instanceof c) {
             if (!PatchProxy.applyVoidTwoRefs(p0, p1, f, t$a.class, "16")) {
                int i = p0.hashCode();
                if (f.d.containsKey(Integer.valueOf(i))) {
                   a uoa = f.d.get(Integer.valueOf(i));
                   Objects.requireNonNull(uoa);
                   if (!PatchProxy.applyVoidOneRefs(p1, uoa, a.class, "3")) {
                      a.p(p1, "photoDetailAttachChangedListener");
                      u ou = uoa.b.remove(p1);
                      if (ou != null) {
                         uoa.a.remove(ou);
                      }
                   }
                }
             }
          }else {
             ot.c(p0, p1);
          }
       }
       return;
    }
    public String D0(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "158");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null && obj.i() != null) {
          return obj.i().getUserId();
       }
       return null;
    }
    public void D1(List p0,QPhoto p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SlidePlayViewModel.class, "42")) {
          return;
       }
       a.b("SlidePlayViewModel", "removeItems reason = "+p2);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          uob.m(p0, null, p2);
       }
       return;
    }
    public void E(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "10")) {
          return;
       }
       t ot = this.t1();
       Objects.requireNonNull(ot);
       if (!PatchProxy.applyVoidOneRefs(p0, ot, t.class, "1") && !ot.a.contains(p0)) {
          ot.a.add(p0);
       }
       return;
    }
    public int E0(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "151");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null && obj.i() != null) {
          return obj.i().k0();
       }
       return 0;
    }
    public void E1(QPhoto p0,String p1){
       a.b("SlidePlayViewModel", "removePageItem reason = "+p1);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          uob.k(p0, true);
       }
       return;
    }
    public List F0(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "150");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null && obj.i() != null) {
          return obj.i().A();
       }
       return new ArrayList();
    }
    public void F1(QPhoto p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, "39")) {
          return;
       }
       a.b("SlidePlayViewModel", "removePageItemUnChange reason = "+p1);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          uob.k(p0, true);
       }
       return;
    }
    public void G(QPhoto p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, "38")) {
          return;
       }
       this.F1(p0, p1);
       return;
    }
    public int G0(int p0){
       f obj;
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, slidePlayVie, "89");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.Q0("view_item_service");
       if (obj != null) {
          int i = obj.b.E(p0);
          a.b("ViewItemService", "getViewItemType, position = "+p0+" type = "+i);
          return i;
       }else {
          return -1;
       }
    }
    public void G1(QPhoto p0,int p1,boolean p2,String p3){
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), p3, this, SlidePlayViewModel.class, "118")) {
          return;
       }
       a.b("SlidePlayViewModel", "replaceItem, reason: "+p3);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          uob.a().R0(p1, p0, p2);
       }
       return;
    }
    public boolean H(QPhoto p0){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj = PatchProxy.applyOneRefs(p0, this, SlidePlayViewModel.class, "74");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_play_service");
       boolean b = false;
       if (obj == null) {
          return b;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, d.class, "4");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          d b2 = obj.b;
          b1 = b2.l0(b2.j0(p0));
          if (b1 > -1 && b1 < (obj.b.k0() - 1)) {
             b = 1;
          }
          b1 = b;
       }
       return b1;
    }
    public a H0(){
       b uob = this.Q0("kwai_data_source_service");
       Object[] objArray = null;
       if (uob == null) {
          return objArray;
       }
       Object[] objArray1 = PatchProxy.apply(objArray, uob, b.class, "41");
       if (objArray1 != PatchProxyResult.class) {
       }else if(uob.i() == null){
          objArray = uob.i().Z();
       }
       objArray1 = objArray;
       return objArray1;
    }
    public void H1(int p0,QPhoto p1,boolean p2,String p3){
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), p3, this, SlidePlayViewModel.class, "116")) {
          return;
       }
       a.b("SlidePlayViewModel", "replaceOriginFeedItem, reason: "+p3);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          if (PatchProxy.isSupport(b.class)) {
             Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), uob, b.class, "19");
             if (obj != PatchProxyResult.class) {
                obj.booleanValue();
             }
          }
          uob.a.f().R0(p0, p1, p2);
       }
       return;
    }
    public boolean I(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "63");
       if (obj == PatchProxyResult.class) {
          obj = this.k1(m.a, Boolean.FALSE);
       }
       return obj.booleanValue();
    }
    public List I0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, SlidePlayViewModel.class, "105");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj == null) {
          return new ArrayList();
       }
       Object obj1 = PatchProxy.apply(objArray, obj, b.class, "11");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = t.fromIterable(obj.h()).map(a.b).toList().e();
       }
       return obj1;
    }
    public void I1(QPhoto p0,int p1,String p2){
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, SlidePlayViewModel.class, "115")) {
          return;
       }
       a.b("SlidePlayViewModel", "replacePhotoInFeed, reason: "+p2);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          b uob1 = b.class;
          if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), uob, uob1, "15")) {
             uob = uob.a;
             BaseFeed entity = p0.getEntity();
             Objects.requireNonNull(uob);
             h oh = h.class;
             if (!PatchProxy.isSupport(oh) || (!PatchProxy.applyVoidTwoRefs(entity, Integer.valueOf(p1), uob, oh, "9") && (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), entity, uob, oh, "10")))) {
                h p = uob.p;
                QPhoto qPhoto = new QPhoto(entity);
                Objects.requireNonNull(p);
                h oh1 = h.class;
                if (PatchProxy.isSupport(oh1) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), qPhoto, p, oh1, "2") && (p1 >= 0 && p.a.size() > p1))) {
                   p.a.remove(p1);
                   p.a.add(p1, qPhoto);
                }
             }
          }
       }
       return;
    }
    public void J(List p0,QPhoto p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SlidePlayViewModel.class, "41")) {
          return;
       }
       a.b("SlidePlayViewModel", "removeItemsMayBeDuplicate reason = "+p2);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && !PatchProxy.applyVoidThreeRefs(p0, p1, p2, uob, b.class, "27")) {
          a.b("KwaiDataSourceService", "removeItemsMayBeDuplicate");
          uob.n(p0, p1, true, p2);
       }
       return;
    }
    public i J0(){
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          return uob.f();
       }
       return null;
    }
    public void J1(int p0,int p1){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, slidePlayVie, "24")) {
          return;
       }
       this.l1(new h(p0, p1));
       return;
    }
    public void K(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "66")) {
          return;
       }
       this.l1(new k(p0));
       return;
    }
    public List K0(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "136");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.d().n0();
       }
       return new ArrayList();
    }
    public void K1(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "164")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && uob.i() != null) {
          uob.i().O(p0);
       }
       return;
    }
    public void L(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "76")) {
          return;
       }
       d uod = this.Q0("kwai_play_service");
       if (uod != null) {
          d uod1 = d.class;
          if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uod, uod1, "2")) {
             int i = uod.b.a0();
             int i1 = uod.b.l0(i);
             a.b("kwaiPlayService", "playNext: viewPagerIndex ="+i+" realPosition = "+i1);
             String str = "playNext: position = ";
             int i2 = -1;
             if (i1 > i2 && i1 < (uod.b.k0() + i2)) {
                i = i + 1;
                a.b("kwaiPlayService", str+i);
                uod.d = i1 + 1;
                uod.c.l(GrootViewItemSwitchType.AUTO);
                uod.a.l0(i, p0);
             }else if(i1 == (uod.b.k0() + i2)){
                i = i + 1;
                i1 = uod.b.l0(i);
                a.b("kwaiPlayService", str+i+"nextRealPosition = "+i1);
                if (i1 > i2 && i1 < uod.b.k0()) {
                   uod.d = i1;
                   uod.c.l(GrootViewItemSwitchType.AUTO);
                   uod.a.l0(i, p0);
                }
             }
          }
       }
       return;
    }
    public int L0(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "110");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.b();
       }
       return 0;
    }
    public void L1(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "165")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && uob.i() != null) {
          uob.i().z(p0);
       }
       return;
    }
    public int M(QPhoto p0){
       e obj = PatchProxy.applyOneRefs(p0, this, SlidePlayViewModel.class, "91");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("position_service");
       if (obj == null) {
          return -1;
       }
       int i = obj.d.j0(p0);
       a.b("PositionService", "getPositionInAdapter: "+i);
       return i;
    }
    public v3 M0(){
       return this.j;
    }
    public void M1(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "161")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && uob.i() != null) {
          uob.i().M(p0);
       }
       return;
    }
    public void N(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "49")) {
          return;
       }
       this.l1(new o(p0));
       return;
    }
    public a N0(){
       return this.h;
    }
    public void N1(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "183")) {
          return;
       }
       if (this.C0() instanceof a) {
          this.C0().U = p0;
       }
       return;
    }
    public void O(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "181")) {
          return;
       }
       SlidePlayViewModel th = this.h;
       if (th != null) {
          th.j.remove(p0);
       }
       this.i.remove(p0);
       return;
    }
    public g O0(){
       return this.g;
    }
    public void O1(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "178")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          b uob1 = b.class;
          if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, uob1, "47")) {
             uob = uob.c;
             if (uob instanceof f) {
                uob.U = p0;
             }
          }
       }
       return;
    }
    public void P(Fragment p0,a p1){
       String str = "14";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, str)) {
          return;
       }
       t ot = this.t1();
       Objects.requireNonNull(ot);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ot, t.class, "9")) {
          t f = ot.f;
          if (f != null && p0 instanceof c) {
             if (!PatchProxy.applyVoidTwoRefs(p0, p1, f, t$a.class, str)) {
                int i = p0.hashCode();
                if (!f.d.containsKey(Integer.valueOf(i))) {
                   g og = f.c.get(p0);
                   if (og != null) {
                      f.d.put(Integer.valueOf(i), new a(og.e()));
                   }else {
                      f.d.put(Integer.valueOf(i), new a(null));
                   }
                }
                a uoa = f.d.get(Integer.valueOf(i));
                Objects.requireNonNull(uoa);
                if (!PatchProxy.applyVoidOneRefs(p1, uoa, a.class, "1")) {
                   a.p(p1, "photoDetailAttachChangedListener");
                   if (uoa.b.get(p1) == null) {
                      u ou = new u(p1, uoa.c);
                      uoa.b.put(p1, ou);
                      uoa.a.add(ou);
                   }
                }
             }
          }else {
             ot.a(p0, p1);
          }
       }
       return;
    }
    public g P0(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "173");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.d();
       }
       return null;
    }
    public void P1(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "96")) {
          return;
       }
       b.a(this.C0(), new s(p0));
       return;
    }
    public int Q(){
       e obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("position_service");
       if (obj == null) {
          return 0;
       }
       int i = obj.d.k0();
       a.b("PositionService", "getRealCountInAdapter: "+i);
       return i;
    }
    public Object Q0(String p0){
       SlidePlayViewModel obj = PatchProxy.applyOneRefs(p0, this, SlidePlayViewModel.class, "176");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj != null) {
          return obj.d(p0);
       }
       a.b("SlidePlayViewModel", "getGrootService\(\): mGrootController==null");
       return null;
    }
    public void Q1(boolean p0,int[] p1){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, slidePlayVie, "97")) {
          return;
       }
       b.a(this.C0(), new u(p0, p1));
       return;
    }
    public void R(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "180")) {
          return;
       }
       SlidePlayViewModel th = this.h;
       if (th == null) {
          if (!this.i.contains(p0)) {
             this.i.add(p0);
          }
       }else {
          th.l(p0);
       }
       return;
    }
    public int R0(QPhoto p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, SlidePlayViewModel.class, "108");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj == null) {
          return -1;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "14");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          a.b("KwaiDataSourceService", "getIndexInDataSource: "+obj.a.e().h(p0));
          i = obj.a.e().h(p0);
       }
       return i;
    }
    public void R1(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "62")) {
          return;
       }
       f uof = this.Q0("Kwai_slide_logger_service");
       if (uof != null) {
          f uof1 = f.class;
          if (!PatchProxy.isSupport(uof1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uof, uof1, "1")) {
             uof.a.g = p0;
          }
       }
       return;
    }
    public void S(int p0,List p1,String p2){
       Object obj1;
       String str4;
       int i2;
       int i3;
       boolean this;
       boolean b;
       int i = p0;
       List list = p1;
       String str = p2;
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, SlidePlayViewModel.class, "119")) {
          return;
       }
       String str1 = "replaceItems, reason: ";
       String str2 = " position = ";
       a.b("SlidePlayViewModel", str1+str+str2+i);
       if (!q.f(p1) && i >= 0) {
          g obj = this.Q0("kwai_data_source_service");
          if (obj != null) {
             g og = g.class;
             if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, obj, b.class, "34")) {
                String str3 = "KwaiDataSourceService";
                a.b(str3, str1+str+str2+i);
                if (!q.f(p1) && i >= 0) {
                   QPhoto qPhoto = obj.c.b0(i);
                   if (qPhoto == null) {
                      a.b(str3, "replaceItems exception, targetPhoto == null");
                   }else {
                      int i1 = obj.a.f().h(qPhoto);
                      a.b(str3, "replaceItems,  positionInAdapter = "+i+" positionInDataSource = "+i1+" dataList size = "+p1.size());
                      if (i1 < 0) {
                         a.b(str3, "replaceItems exception, positionInDataSource < 0");
                      }else if(obj.j() == 1){
                         a.b(str3, "replaceItems in SourceType.PROFILE");
                         obj = obj.a.f();
                         Objects.requireNonNull(obj);
                         if (PatchProxy.isSupport(og)) {
                            obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(i1), p1, Boolean.TRUE, obj, g.class, "34");
                            if (obj1 != PatchProxyResult.class) {
                               obj1.booleanValue();
                            }
                         }else {
                            this = true;
                            b = false;
                         }
                         str4 = "replaceNotNotify begin... position  = ";
                         a.b("KwaiDataSource", str4+i1+" size = "+p1.size()+" modifyOriginDataAlso = "+true);
                         if (obj.g != null && !q.f(p1)) {
                            i = i1;
                            i2 = 0;
                            while (i < p1.size()) {
                               i3 = i2 + 1;
                               obj.g.F(i1, list.get(i2));
                               i = i + 1;
                               i2 = i3;
                            }
                         }
                         a.b("GrootBaseDataSource", str4+i1+" size = "+p1.size());
                         obj.B0(i1, list, false);
                      }else {
                         obj = obj.a.f();
                         Objects.requireNonNull(obj);
                         if (PatchProxy.isSupport(og)) {
                            obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(i1), p1, Boolean.TRUE, obj, g.class, "33");
                            if (obj1 != PatchProxyResult.class) {
                               obj1.booleanValue();
                            }
                         }
                         str4 = "replace begin... position  = ";
                         a.b("KwaiDataSource", str4+i1+" size = "+p1.size()+" modifyOriginDataAlso = "+true);
                         if (obj.g != null && !q.f(p1)) {
                            i = i1;
                            i2 = 0;
                            while (i < p1.size()) {
                               i3 = i2 + 1;
                               obj.g.F(i1, list.get(i2));
                               i = i + 1;
                               i2 = i3;
                            }
                         }
                         a.b("GrootBaseDataSource", str4+i1+" size = "+p1.size());
                         obj.B0(i1, list, true);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void S1(boolean p0){
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          if (!p0) {
             uob.b.setEnablePullToRefresh(false);
             uob.b.setDisableShowNoMoreTipsAtTop(true);
          }else {
             b e = uob.e;
             if (e != null) {
                e.c();
             }
             uob.b.setDisableShowNoMoreTipsAtTop(false);
          }
       }
       return;
    }
    public void T(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "140")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          uob.d().v(p0);
       }else {
          slidePlayVie = this.g;
          if (slidePlayVie != null) {
             slidePlayVie.v(p0);
          }
       }
       return;
    }
    public QPhoto T0(int p0){
       b obj;
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, slidePlayVie, "134");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.d().get(p0);
       }else {
          return null;
       }
    }
    public void T1(int p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, slidePlayVie, "53")) {
          return;
       }
       this.l1(new f(p0));
       return;
    }
    public void U(int p0,QPhoto p1,String p2){
       boolean b;
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, SlidePlayViewModel.class, "68")) {
          return;
       }
       a.b("SlidePlayViewModel", "addItem target = "+p0+" reason = "+p2);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          b uob1 = b.class;
          if (!PatchProxy.isSupport(uob1) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, uob, uob1, "32") && p1 != null)) {
             b = true;
             String str = "KwaiDataSourceService";
             if (uob.j() == b) {
                a.b(str, "addItem in SourceType.PROFILE");
                g og = uob.a.f();
                Objects.requireNonNull(og);
                if (PatchProxy.isSupport(g.class)) {
                   Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.TRUE, og, g.class, "24");
                   if (obj != PatchProxyResult.class) {
                      obj.booleanValue();
                   }
                }
                og.D0(p0, p1, b, false);
             }else {
                a.b(str, "addItem:  targetPosition = "+p0+"photo = "+p1.toString());
                int i = -1;
                if (p0 == i) {
                   uob.a.f().r0(p1, b);
                }else {
                   int i1 = uob.c.l0(uob.b.getCurrentItem());
                   QPhoto qPhoto = uob.c.b0(i1);
                   QPhoto qPhoto1 = uob.c.b0(p0);
                   if (qPhoto == null) {
                      a.b(str, "addItem  exception, curPhoto == null");
                   }else if(qPhoto1 == null){
                      a.b(str, "addItem  exception, targetPhoto == null");
                   }else {
                      int i2 = uob.a.f().h(qPhoto1);
                      a.b(str, "addItem:  currPosition = "+i1+" curPhoto: "+qPhoto.toString()+" targetPhoto: "+qPhoto1.toString()+" dataPosition = "+i2+" targetPosition = "+p0);
                      if (i2 < 0) {
                         i2 = p0;
                      }
                      if (p0 <= i1) {
                         a.b(str, "addItem: add before current item, keep current photo not change, dataPosition = "+i2);
                         uob.a.f().H(i2, p1);
                         uob.c.C0(uob.a.f().n0(), qPhoto, i, false);
                      }else {
                         a.b(str, "addItem: add after current item, keep current photo not change, dataPosition = "+i2);
                         uob.a.f().q0(i2, p1, b);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public QPhoto U0(int p0){
       b obj;
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, slidePlayVie, "133");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.g(p0);
       }else {
          slidePlayVie = this.g;
          if (slidePlayVie != null) {
             return slidePlayVie.get(p0);
          }else {
             return null;
          }
       }
    }
    public void U1(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "32")) {
          return;
       }
       e uoe = this.Q0("kwai_pull_to_refresh_service");
       if (uoe != null) {
          e uoe1 = e.class;
          if (!PatchProxy.isSupport(uoe1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoe, uoe1, "2")) {
             a.b("PullToRefreshService", "setEnablePullToRefresh -- enable: "+p0);
             uoe = uoe.a;
             if (uoe != null) {
                d uod = d.class;
                if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uoe, uod, "9")) {
                   uod = uoe.b;
                   if (uod != null && uoe.f != null) {
                      uod.setEnabled(p0);
                   }
                }
             }
          }
       }
       return;
    }
    public String V(){
       return this.c;
    }
    public List V0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, SlidePlayViewModel.class, "135");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          objArray = PatchProxy.apply(objArray, obj, b.class, "8");
          if (objArray != patchProxyRe) {
          }else {
             objArray = obj.a.f().n0();
          }
       }
       return objArray;
    }
    public void V1(RefreshType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "128")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && !PatchProxy.applyVoidOneRefs(p0, uob, b.class, "20")) {
          g og = uob.a.e();
          Objects.requireNonNull(og);
          if (!PatchProxy.applyVoidOneRefs(p0, og, g.class, "10")) {
             og = og.g;
             if (og instanceof a) {
                og.M(p0);
             }else if(og instanceof e){
                i oi = og.m();
                if (oi instanceof a) {
                   oi.M(p0);
                }
             }
          }
       }
       return;
    }
    public void W(int p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, slidePlayVie, "69")) {
          return;
       }
       this.l1(new g(p0));
       return;
    }
    public ViewGroup$LayoutParams W0(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.s2() instanceof KwaiGrootViewPager) {
          return this.k1(k.a, null);
       }
       return this.k1(d.a, null);
    }
    public void W1(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "179")) {
          return;
       }
       this.d1(KwaiGrootViewPager.class).setIgnoreTouchEvent(p0);
       return;
    }
    public void X(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, "120")) {
          return;
       }
       a.b("SlidePlayViewModel", "replaceAllItems, reason: "+p1);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          uob.a().A0(p0, true);
       }
       return;
    }
    public i X0(){
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          return uob.f();
       }
       SlidePlayViewModel tg = this.g;
       if (tg != null) {
          return tg.M7();
       }
       return null;
    }
    public void X1(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "153")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && uob.c() != null) {
          uob.c().S0(p0);
       }
       return;
    }
    public void Y(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "131")) {
          return;
       }
       d uod = this.Q0("kwai_play_service");
       if (uod != null) {
          d uod1 = d.class;
          if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uod, uod1, "7")) {
             int i = uod.b.a0();
             int i1 = uod.b.l0(i);
             a.b("kwaiPlayService", "moveNext: curIndexInViewpager ="+i+" realPosition = "+i1);
             String str = "moveNext: position = ";
             if (i1 > -1 && i1 < (uod.b.k0() - 1)) {
                i = i + 1;
                a.b("kwaiPlayService", str+i);
                uod.a.l0(i, p0);
             }else if(i1 == (uod.b.k0() - 1)){
                i = i + 1;
                i1 = uod.b.l0(i);
                a.b("kwaiPlayService", str+i+"nextRealPosition = "+i1);
                if (i1 > -1 && i1 < uod.b.k0()) {
                   uod.a.l0(i, p0);
                }
             }
          }
       }
       return;
    }
    public int Y0(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "139");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.d().f();
       }
       SlidePlayViewModel tg = this.g;
       if (tg != null) {
          return tg.f();
       }
       return 0;
    }
    public void Y1(QPhoto p0,int p1,String p2){
       boolean b;
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, SlidePlayViewModel.class, "112")) {
          return;
       }
       a.b("SlidePlayViewModel", "updateFeed, photo = "+p0.toString()+" sourceType = "+p1+" reason = "+p2);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          b uob1 = b.class;
          if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), uob, uob1, "45")) {
             b = false;
             int i = 1;
             if (p1 == i) {
                uob.b.setEnablePullToRefresh(b);
                uob.b.setDisableShowNoMoreTipsAtTop(i);
             }else {
                b e1 = uob.e;
                if (e1 != null) {
                   e1.c();
                }
                uob.b.setDisableShowNoMoreTipsAtTop(b);
             }
             a.b("KwaiDataSourceService", "updateFeed -- sourceType："+p1+"  mOriginIndexInFeed："+uob.g);
             uob1 = uob.a;
             b g = uob.g;
             Objects.requireNonNull(uob1);
             if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(g), uob1, h.class, "8")) {
                StringBuilder str = "replaceFeed... sourceType = "+p1+" originIndexInFeed = "+g+" currentPhoto = ";
                h j = uob1.j;
                String str1 = "null";
                String str2 = (j == null)? str1: j.toString();
                str = str+str2+" updatePhoto = "+p0.toString()+" currentDataSource = "+uob1.d.f()+" profileDataSource = ";
                j = uob1.h;
                if (j != null) {
                   str1 = Integer.valueOf(j.f());
                }
                a.b("DataSourceManager", str+str1+" originDataSource = "+uob1.b.f());
                uob1.j = p0;
                uob1.g = p1;
                uob1.e.M0(uob1.d, p0, p1, g, false);
             }
             b e = uob.e;
             if (e != null) {
                e.b();
             }
          }
       }
       return;
    }
    public int Z(){
       e obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "88");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("position_service");
       if (obj == null) {
          return -1;
       }
       int i = obj.d.g0();
       a.b("PositionService", "getLastValidItemPosition: "+i);
       return i;
    }
    public int Z0(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k1(f.a, Integer.valueOf(0)).intValue();
    }
    public void Z1(g p0,String p1){
       a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, "172")) {
          return;
       }
       SlidePlayViewModel tg = this.g;
       if (tg != null && p0 != tg) {
          tg.w0();
       }
       this.g = p0;
       tg = this.h;
       if (tg != null && !PatchProxy.applyVoidTwoRefs(p0, p1, tg, a.class, "24")) {
          a.b("KwaiGrootController", "updateOriginDataSource reason: "+p1);
          a = tg.a;
          if (a != p0) {
             a.g(tg.f);
             tg.a.w0();
             tg.a = p0;
             p0.u(tg.f);
             a m = tg.m;
             if (m != null) {
                m.l(tg.a, true, p1);
             }
          }
       }
       return;
    }
    public int a(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.j();
       }
       return 0;
    }
    public int a0(){
       e obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("position_service");
       if (obj == null) {
          return -1;
       }
       int i = obj.d.l0(obj.a());
       a.b("PositionService", "getCurrentRealPositionInAdapter: "+i);
       return i;
    }
    public int a1(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k1(g.a, Integer.valueOf(0)).intValue();
    }
    public void a2(int p0,String p1){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, slidePlayVie, "177")) {
          return;
       }
       a.b("SlidePlayViewModel", "updateOriginIndexInFeed, index = "+p0+"reason = "+p1);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          b uob1 = b.class;
          if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uob, uob1, "44")) {
             a.b("KwaiDataSourceService", "updateOriginIndexInFeed -- index = "+p0+"  mOriginIndexInFeed："+uob.g);
             uob.g = p0;
          }
       }
       return;
    }
    public void b(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "142")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          uob.d().S0(p0);
       }else {
          SlidePlayViewModel tg = this.g;
          if (tg != null) {
             tg.S0(p0);
          }
       }
       return;
    }
    public void b0(List p0,QPhoto p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, SlidePlayViewModel.class, "40")) {
          return;
       }
       a.b("SlidePlayViewModel", "removeItems reason = "+p2);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          uob.m(p0, p1, p2);
       }
       return;
    }
    public float b1(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.k1(h.a, Float.valueOf(0)).floatValue();
    }
    public boolean b2(i p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(p0, this, SlidePlayViewModel.class, "111");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj == null) {
          return false;
       }
       boolean b = p0 instanceof a;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(b), obj, uob, "42");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
          label_003b :
             obj = obj.a;
             Objects.requireNonNull(obj);
             h oh = h.class;
             if (PatchProxy.isSupport(oh)) {
                Object obj2 = PatchProxy.applyTwoRefs(Boolean.valueOf(b), "profileSide", obj, oh, "2");
                if (obj2 != patchProxyRe) {
                   b = obj2.booleanValue();
                }
             }
             a.b("DataSourceManager", "updateDataSource, isDetailProfileDataSource = "+b+" reason: "+"profileSide");
             if (b) {
                b = obj.l(obj.h, false, "profileSide");
             }else {
                b = obj.l(obj.b, false, "profileSide");
             }
          }
       }else {
          goto label_003b ;
       }
       return b;
    }
    public int c(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, SlidePlayViewModel.class, "36");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.Q0("kwai_play_service");
       if (obj == null) {
          return 0;
       }
       Object obj1 = PatchProxy.apply(objArray, obj, d.class, "8");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(obj.d == obj.b.l0(obj.a.getCurrentItem())){
          i = 3;
       }else {
          i = obj.b.e0();
       }
       return i;
    }
    public void c0(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "71")) {
          return;
       }
       this.l1(new p(p0));
       return;
    }
    public QPhoto c1(int p0){
       b obj;
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, slidePlayVie, "109");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.g(p0);
       }else {
          return null;
       }
    }
    public void d(boolean p0,int p1){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, slidePlayVie, "35")) {
          return;
       }
       this.l1(new t(p0, p1));
       return;
    }
    public void d0(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "72")) {
          return;
       }
       this.l1(new q(p0));
       return;
    }
    public VerticalViewPager d1(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, SlidePlayViewModel.class, "21");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.s2();
    }
    public void e(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "141")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          uob.d().M0(p0);
       }else {
          SlidePlayViewModel tg = this.g;
          if (tg != null) {
             tg.M0(p0);
          }
       }
       return;
    }
    public List e0(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "103");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.h();
       }
       return new ArrayList();
    }
    public int e1(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.k1(l.a, Integer.valueOf(0)).intValue();
    }
    public void f(int p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, slidePlayVie, "59")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          b uob1 = b.class;
          if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uob, uob1, "4")) {
             uob = uob.c;
             if (uob instanceof e) {
                uob.O0(p0);
             }
          }
       }
       return;
    }
    public boolean f0(QPhoto p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj = PatchProxy.applyOneRefs(p0, this, SlidePlayViewModel.class, "80");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_play_service");
       boolean b = false;
       if (obj == null) {
          return b;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, d.class, "5");
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          d b2 = obj.b;
          if (b2.l0(b2.j0(p0)) > 0) {
             b = 1;
          }
          b1 = b;
       }
       return b1;
    }
    public float f1(){
       VerticalViewPager obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.s2();
       if (obj != null) {
          return obj.getTranslationY();
       }
       return 0;
    }
    public void g(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "48")) {
          return;
       }
       this.l1(new m(p0));
       return;
    }
    public void g0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "11")) {
          return;
       }
       t ot = this.t1();
       Objects.requireNonNull(ot);
       if (!PatchProxy.applyVoidOneRefs(p0, ot, t.class, "2")) {
          ot.a.remove(p0);
       }
       return;
    }
    public boolean g1(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "26");
       if (obj == PatchProxyResult.class) {
          obj = this.k1(c.a, Boolean.FALSE);
       }
       return obj.booleanValue();
    }
    public QPhoto getCurrentPhoto(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, SlidePlayViewModel.class, "58");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          a uoa = PatchProxy.apply(objArray, obj, b.class, "2");
          if (uoa != patchProxyRe) {
          }else {
             uoa = obj.c.Z();
             if (uoa == null) {
                int i = obj.c.a0();
                int i1 = obj.c.l0(i);
                StringBuilder str = "getCurrentPhoto\(\): getCurrentItem\(\)="+i;
                a.b("KwaiDataSourceService", str+" | getRealPosition\(\)="+i1+" | mDataList.size\(\)="+obj.c.k0());
             }
          }
          return uoa;
       }else {
          a.b("SlidePlayViewModel", "getCurrentPhoto\(\): service==null");
          return objArray;
       }
    }
    public c getDataSource(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "174");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.P0();
    }
    public void h(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "12")) {
          return;
       }
       t ot = this.t1();
       Objects.requireNonNull(ot);
       if (!PatchProxy.applyVoidOneRefs(p0, ot, t.class, "40")) {
          t g = ot.g;
          if (g != null) {
             g.a(p0);
          }else if(ot.c.contains(p0)){
             ot.c.add(p0);
          }
       }
       return;
    }
    public Object h0(){
       i oi;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, SlidePlayViewModel.class, "144");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          oi = obj.f();
       }else {
          SlidePlayViewModel tg = this.g;
          oi = (tg != null)? tg.M7(): objArray;
       }
       if (oi != null) {
          objArray = oi.L0();
       }
       return objArray;
    }
    public void h1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "83")) {
          return;
       }
       SlidePlayViewModel th = this.h;
       if (th != null) {
          Objects.requireNonNull(th);
          if (!PatchProxy.applyVoidOneRefs(p0, th, a.class, "27")) {
             th.t = new b(p0);
          }
       }
       return;
    }
    public void i(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "47")) {
          return;
       }
       this.l1(new l(p0));
       return;
    }
    public List i0(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "104");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.V0();
    }
    public void i1(QPhoto p0,v3 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, "82")) {
          return;
       }
       SlidePlayViewModel th = this.h;
       if (th != null) {
          th.s(p0, p1.f);
          f uof = this.Q0("view_item_service");
          if (uof != null) {
             Iterator iterator = this.l.c.iterator();
             while (iterator.hasNext()) {
                uof.a(iterator.next());
             }
             this.l.g = uof;
          }
       }
       this.j = p1;
       return;
    }
    public int j(){
       e obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("position_service");
       if (obj != null) {
          return obj.a();
       }
       return -1;
    }
    public int j0(){
       e obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "87");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("position_service");
       if (obj == null) {
          return -1;
       }
       int i = obj.d.d0();
       a.b("PositionService", "getFirstValidItemPosition: "+i);
       return i;
    }
    public void j1(QPhoto p0,boolean p1,String p2){
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, SlidePlayViewModel.class, "77")) {
          return;
       }
       a.b("SlidePlayViewModel", "insertItem  shouldNotify = "+p1+" reason = "+p2);
       this.U((this.a0() + 1), p0, p2);
       return;
    }
    public void k(int p0,boolean p1){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, slidePlayVie, "31")) {
          return;
       }
       this.l1(new i(p0, p1));
       return;
    }
    public QPhoto k0(int p0){
       b obj;
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, slidePlayVie, "102");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.g(p0);
       }else {
          return null;
       }
    }
    public final Object k1(a p0,Object p1){
       VerticalViewPager obj = PatchProxy.applyTwoRefs(p0, p1, this, SlidePlayViewModel.class, "169");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s2();
       Object obj1 = PatchProxy.applyThreeRefs(obj, p0, p1, null, b.class, "1");
       if (obj1 != PatchProxyResult.class) {
          p1 = obj1;
       }else if(obj == null){
          p1 = p0.apply(obj);
       }
       return p1;
    }
    public void l(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "13")) {
          return;
       }
       t ot = this.t1();
       Objects.requireNonNull(ot);
       if (!PatchProxy.applyVoidOneRefs(p0, ot, t.class, "41")) {
          t g = ot.g;
          if (g != null) {
             f b = g.b;
             if (b != null) {
                b.z0(p0);
             }
          }
          ot.c.remove(p0);
       }
       return;
    }
    public boolean l0(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "143");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.d().J0();
       }
       SlidePlayViewModel tg = this.g;
       if (tg != null) {
          return tg.J0();
       }
       return false;
    }
    public final void l1(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "168")) {
          return;
       }
       b.a(this.s2(), p0);
       return;
    }
    public void m(int p0,List p1,String p2){
       int i = p0;
       Object obj = p1;
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, SlidePlayViewModel.class, "67")) {
          return;
       }
       a.b("SlidePlayViewModel", "addItems targetPosition =  "+i+" reason = "+p2);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          g og = g.class;
          b uob1 = b.class;
          if (!PatchProxy.isSupport(uob1) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), obj, uob, uob1, "31") && !q.f(p1))) {
             String str = "KwaiDataSourceService";
             if (uob.j() == 1) {
                a.b(str, "addItems in SourceType.PROFILE");
                g og1 = uob.a.f();
                Objects.requireNonNull(og1);
                if (PatchProxy.isSupport(og)) {
                   Object obj1 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Boolean.TRUE, og1, g.class, "30");
                   if (obj1 != PatchProxyResult.class) {
                      obj1.booleanValue();
                   }
                }
                og1.E0(i, obj, true, false);
             }else {
                a.b(str, "addItems:  targetPosition = "+i);
                Iterator iterator = p1.iterator();
                while (iterator.hasNext()) {
                   a.b(str, "addItems:  "+iterator.next().toString());
                }
                int i1 = -1;
                if (i == i1) {
                   uob.a.f().t0(obj, true);
                }else {
                   int i2 = uob.c.l0(uob.b.getCurrentItem());
                   QPhoto qPhoto = uob.c.b0(i2);
                   QPhoto qPhoto1 = uob.c.b0(i);
                   if (qPhoto == null) {
                      a.b(str, "addItems  exception, curPhoto == null");
                   }else if(qPhoto1 == null){
                      a.b(str, "addItems  exception, targetPhoto == null");
                   }else {
                      int i3 = uob.a.f().h(qPhoto1);
                      a.b(str, "addItems:  currPosition = "+i2+" curPhoto: "+qPhoto.toString()+" targetPhoto: "+qPhoto1.toString()+" dataPosition = "+i3);
                      if (i <= i2) {
                         a.b(str, "addItems: add before current item, keep current photo not change");
                         uob.a.f().o(i3, obj);
                         uob.c.C0(uob.a.f().n0(), qPhoto, i1, false);
                      }else {
                         a.b(str, "addItems: add after current item, keep current photo not change");
                         g og2 = uob.a.f();
                         Objects.requireNonNull(og2);
                         if (PatchProxy.isSupport(og)) {
                            Object obj2 = PatchProxy.applyThreeRefs(Integer.valueOf(i3), p1, Boolean.TRUE, og2, g.class, "29");
                            if (obj2 != PatchProxyResult.class) {
                               obj2.booleanValue();
                            }
                         }
                         og2.E0(i3, obj, true, true);
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public int m0(){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, SlidePlayViewModel.class, "60");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj == null) {
          return 0;
       }
       Object obj1 = PatchProxy.apply(objArray, obj, b.class, "5");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          b c = obj.c;
          i = (c instanceof e)? c.P: obj.d.d();
       }
       return i;
    }
    public boolean m1(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "167");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null && obj.i() != null) {
          return obj.i().J();
       }
       return true;
    }
    public QPhoto n(int p0){
       b obj;
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, slidePlayVie, "95");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          b uob = b.class;
          if (PatchProxy.isSupport(uob)) {
             uoa = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uob, "3");
             if (uoa != patchProxyRe) {
             label_0043 :
                return uoa;
             }
          }
          uoa = obj.c.b0(p0);
          goto label_0043 ;
       }else {
          return null;
       }
    }
    public boolean n0(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "73");
       if (obj == PatchProxyResult.class) {
          obj = this.k1(j.a, Boolean.FALSE);
       }
       return obj.booleanValue();
    }
    public boolean n1(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "124");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_data_source_service");
       boolean b = false;
       if (obj != null && obj.b() > 0) {
          b = true;
       }
       return b;
    }
    public void o(QPhoto p0,boolean p1,String p2){
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, SlidePlayViewModel.class, "117")) {
          return;
       }
       a.b("SlidePlayViewModel", "replaceCurrentItem, reason: "+p2);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null) {
          uob.a().R0(this.a0(), p0, p1);
       }
       return;
    }
    public void o0(Fragment p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, "16")) {
          return;
       }
       t ot = this.t1();
       Objects.requireNonNull(ot);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ot, t.class, "15")) {
          int i = p0.hashCode();
          if (ot.d == null) {
             ot.d = new HashMap();
          }
          if (!ot.d.containsKey(Integer.valueOf(i))) {
             ot.d.put(Integer.valueOf(i), new CopyOnWriteArrayList());
          }
          if (!ot.d.get(Integer.valueOf(i)).contains(p1)) {
             ot.d.get(Integer.valueOf(i)).add(p1);
          }
       }
       return;
    }
    public boolean o1(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, SlidePlayViewModel.class, "125");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj == null) {
          return false;
       }
       Object obj1 = PatchProxy.apply(objArray, obj, b.class, "17");
       b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.a.f().isLoading();
       return b;
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "171")) {
          return;
       }
       StringBuilder str = "onDestroy callback, callbackOwner:"+p0;
       if (p0 instanceof Fragment) {
          if (!PatchProxy.applyVoidOneRefs(p0, null, uod, "11")) {
             d.h(p0, d.g(d.c(p0)));
          }
       }else if(!p0 instanceof FragmentActivity || PatchProxy.applyVoidOneRefs(p0, null, uod, "10")){
          d.h(p0, d.g(d.b(p0)));
       }
       return;
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
    public void p(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "75")) {
          return;
       }
       d uod = this.Q0("kwai_play_service");
       if (uod != null) {
          d uod1 = d.class;
          if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uod, uod1, "3")) {
             int currentItem = uod.a.getCurrentItem();
             int i = uod.b.l0(currentItem);
             String str = "kwaiPlayService";
             a.b(str, "playPre: curIndexInViewpager ="+currentItem+" realPosition = "+i);
             if (i > 0) {
                currentItem = currentItem - 1;
                a.b(str, "playPre: position = "+currentItem);
                uod.c.l(GrootViewItemSwitchType.AUTO);
                uod.d = i - 1;
                uod.a.l0(currentItem, p0);
             }
          }
       }
       return;
    }
    public boolean p0(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "64");
       if (obj == PatchProxyResult.class) {
          obj = this.k1(b.a, Boolean.FALSE);
       }
       return obj.booleanValue();
    }
    public boolean p1(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "137");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.d().isEmpty();
       }
       return true;
    }
    public int q(int p0){
       e obj;
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, slidePlayVie, "92");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.Q0("position_service");
       if (obj != null) {
          int i = obj.d.l0(p0);
          a.b("PositionService", "getRealPositionInAdapter: position = "+p0+" realPosition = "+i);
          return i;
       }else {
          return -1;
       }
    }
    public void q0(Fragment p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, "19")) {
          return;
       }
       this.t1().c(p0, p1);
       return;
    }
    public boolean q1(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "127");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.J0() == null)? true: false;
       return b;
    }
    public boolean r(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_data_source_service");
       boolean b = false;
       if (obj != null && obj.j() == 1) {
          b = true;
       }
       return b;
    }
    public void r0(Fragment p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, "18")) {
          return;
       }
       this.t1().a(p0, p1);
       return;
    }
    public boolean r1(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "156");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null && obj.c() != null) {
          return obj.c().isEmpty();
       }
       return true;
    }
    public void registerDataSetObserver(DataSetObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "85")) {
          return;
       }
       SlidePlayViewModel th = this.h;
       if (th != null) {
          Objects.requireNonNull(th);
          if (!PatchProxy.applyVoidOneRefs(p0, th, a.class, "19")) {
             a f = th.f;
             if (f != null) {
                f.r(p0);
             }
          }
       }
       return;
    }
    public void s(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "29")) {
          return;
       }
       this.l1(new r(p0));
       return;
    }
    public void s0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "50")) {
          return;
       }
       this.l1(new n(p0));
       return;
    }
    public boolean s1(){
       Object obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.s2() == null)? true: false;
       return b;
    }
    public VerticalViewPager s2(){
       return this.f;
    }
    public Fragment t(){
       f obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Q0("view_item_service");
       if (obj != null) {
          return obj.b();
       }
       return null;
    }
    public void t0(QPhoto p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, "160")) {
          return;
       }
       a.b("SlidePlayViewModel", "addPhotoToProfileFeedPageList reason = "+p1);
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && uob.c() != null) {
          uob.c().r0(p0, true);
       }
       return;
    }
    public t t1(){
       return this.l;
    }
    public void u(boolean p0){
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.class;
       if (PatchProxy.isSupport(slidePlayVie) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayVie, "132")) {
          return;
       }
       d uod = this.Q0("kwai_play_service");
       if (uod != null) {
          d uod1 = d.class;
          if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uod, uod1, "6")) {
             int currentItem = uod.a.getCurrentItem();
             int i = uod.b.l0(currentItem);
             a.b("kwaiPlayService", "movePrevious: curIndexInViewpager ="+currentItem+" realPosition = "+i);
             if (i > 0) {
                currentItem = currentItem - 1;
                a.b("kwaiPlayService", "movePrevious: position = "+currentItem);
                uod.a.l0(currentItem, p0);
             }
          }
       }
       return;
    }
    public void u1(){
       if (PatchProxy.applyVoid(null, this, SlidePlayViewModel.class, "163")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && uob.c() != null) {
          uob.c().n();
       }
       return;
    }
    public void unregisterDataSetObserver(DataSetObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "86")) {
          return;
       }
       SlidePlayViewModel th = this.h;
       if (th != null) {
          Objects.requireNonNull(th);
          if (!PatchProxy.applyVoidOneRefs(p0, th, a.class, "20")) {
             a f = th.f;
             if (f != null) {
                f.y(p0);
             }
          }
       }
       return;
    }
    public void v(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "79")) {
          return;
       }
       d uod = this.Q0("kwai_play_service");
       if (uod != null && !PatchProxy.applyVoidOneRefs(p0, uod, d.class, "1")) {
          int i = uod.b.j0(p0);
          int i1 = uod.b.l0(i);
          a.b("kwaiPlayService", "playPhoto: indexInAdapter ="+i+" realPosition = "+i1);
          if (i1 > -1) {
             uod.c.l(GrootViewItemSwitchType.CLICK);
             d b = uod.b;
             if (b != null) {
                b.J0(i);
             }
             uod.a.l0(i, false);
          }
       }
       return;
    }
    public void v1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlidePlayViewModel.class, "122")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && !PatchProxy.applyVoid(objArray, uob, b.class, "16")) {
          uob.a.e().n();
       }
       return;
    }
    public int w(){
       b obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "106");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj != null) {
          return obj.b();
       }
       return 0;
    }
    public final void w1(){
       if (PatchProxy.applyVoid(null, this, SlidePlayViewModel.class, "98")) {
          return;
       }
       b.a(this.C0(), e.a);
       return;
    }
    public void x(List p0,QPhoto p1,boolean p2,String p3){
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, SlidePlayViewModel.class, "121")) {
          return;
       }
       a.b("SlidePlayViewModel", "replaceAllItems, reason: "+p3);
       if (q.f(p0)) {
          return;
       }
       if (p1 == null) {
          this.X(p0, p3);
          return;
       }else {
          b uob = this.Q0("kwai_data_source_service");
          if (uob != null && (!PatchProxy.isSupport(b.class) || (!PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), uob, b.class, "33") && !q.f(p0)))) {
             a.b("KwaiDataSourceService", "replaceAllItems and keep in selectPhoto position...");
             g og = uob.a.f();
             Objects.requireNonNull(og);
             g og1 = g.class;
             if (PatchProxy.isSupport(og1)) {
                Object obj = PatchProxy.applyTwoRefs(p0, Boolean.TRUE, og, og1, "36");
                if (obj != PatchProxyResult.class) {
                   obj.booleanValue();
                label_009d :
                   uob.c.C0(uob.a.f().n0(), p1, -1, p2);
                }
             }
             og1 = og.g;
             if (og1 != null) {
                og1.l0(p0);
             }
             og.D(p0);
             goto label_009d ;
          }
       label_00ad :
          return;
       }
    }
    public a x0(c p0,g p1,a p2,a p3){
       SlidePlayViewModel tg;
       a uoa;
       SlidePlayViewModel obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, SlidePlayViewModel.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 == null) {
          tg = this.g;
       }
       obj = this.g;
       if (obj != null && tg != obj) {
          obj.w0();
       }
       this.g = tg;
       if (SlidePlayViewModel.m.get().booleanValue()) {
          Objects.requireNonNull(p3);
          uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, p3, uoa, "5")) {
             uoa = p3.a;
             if (uoa != null) {
                uoa.e = true;
             }
          }
       }
       a uoa1 = new a(p0, this.g, this.f, p2, p3);
       this.h = PatchProxy.applyVoidOneRefs(Boolean.TRUE, p3, uoa, "5");
       Iterator iterator = this.i.iterator();
       while (iterator.hasNext()) {
          this.h.l(iterator.next());
       }
       return this.h;
    }
    public boolean x1(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, SlidePlayViewModel.class, "126");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.Q0("kwai_data_source_service");
       if (obj == null) {
          return false;
       }
       Object obj1 = PatchProxy.apply(objArray, obj, b.class, "18");
       b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.a.f().hasMore();
       return b;
    }
    public void y(Fragment p0,a p1){
       String str = "17";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayViewModel.class, str)) {
          return;
       }
       t ot = this.t1();
       Objects.requireNonNull(ot);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, ot, t.class, str)) {
          int i = p0.hashCode();
          if (ot.d == null) {
             ot.d = new HashMap();
          }
          if (ot.d.containsKey(Integer.valueOf(i))) {
             ot.d.get(Integer.valueOf(i)).remove(p1);
          }
       }
       return;
    }
    public void y0(){
       if (PatchProxy.applyVoid(null, this, SlidePlayViewModel.class, "155")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && uob.i() != null) {
          uob.i().E();
       }
       return;
    }
    public void y1(SlidePlayConfig p0,String p1,int p2){
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, SlidePlayViewModel.class, "27")) {
          return;
       }
       this.z1(p0, p1, p2, false);
       return;
    }
    public int z(){
       f obj = PatchProxy.apply(null, this, SlidePlayViewModel.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.Q0("view_item_service");
       if (obj == null) {
          return 0;
       }
       int i = obj.b.f0();
       a.b("ViewItemService", "getLastShowItemEnterType: "+i);
       return i;
    }
    public void z0(User p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayViewModel.class, "166")) {
          return;
       }
       b uob = this.Q0("kwai_data_source_service");
       if (uob != null && uob.i() != null) {
          uob.i().B(p0);
       }
       return;
    }
    public void z1(SlidePlayConfig p0,String p1,int p2,boolean p3){
       if (PatchProxy.isSupport(SlidePlayViewModel.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, SlidePlayViewModel.class, "28")) {
          return;
       }
       if (p0 == null || (!p0.enablePositionReferFragment() || (!TextUtils.isEmpty(p1) && (this.k != this.j() || p3)))) {
          this.k = this.j();
          a.d().k(new c(f.c(p1), false, this.getCurrentPhoto(), p2));
       }
    label_0052 :
       return;
    }
}
