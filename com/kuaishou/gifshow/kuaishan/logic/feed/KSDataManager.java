package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import y80.c;
import t36.f;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$Companion$sInstance$2;
import msd.a;
import qrd.p;
import qrd.s;
import crd.a;
import java.util.HashMap;
import java.util.HashSet;
import y80.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import brd.t;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.util.List;
import trd.t;
import y80.b;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$k0;
import erd.o;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d;
import j90.a;
import qvb.n0;
import qvb.a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$n0;
import t36.f$a;
import fg6.a;
import com.google.gson.Gson;
import t45.d;
import brd.z;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$o0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$p0;
import erd.g;
import crd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$g0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$h0;
import erd.a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$i0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$j0;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import java.lang.Throwable;
import java.lang.Boolean;
import w46.b;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$m0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$w;
import brd.w;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$x;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$s;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$t;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$u;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$v;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.util.ArrayList;
import java.lang.Long;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$k;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$l;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$m;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$c;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$f0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$c0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$e0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$n;
import cjd.a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$o;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$p;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$q;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$r;
import java.lang.Iterable;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$y;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$z;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$b0;
import k90.a;
import ekd.q;
import zsd.u;
import y80.j;
import y80.i;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$q0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$r0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$t0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$s0;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$e;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$f;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$g;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$i;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$j;
import trd.u;
import com.kuaishou.gifshow.kuaishan.model.UITemplatePreviewItem;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$h;
import java.util.concurrent.Callable;
import com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupInfo;
import t90.k;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$l0;
import nsd.s0;

public final class KSDataManager extends f implements c	// class@001a3e
{
    public String d;
    public KSFeedTemplateDetailInfo e;
    public int f;
    public a g;
    public final HashMap h;
    public final HashSet i;
    public final HashMap j;
    public b k;
    public final HashMap l;
    public String m;
    public KSTemplateDetailInfo n;
    public a o;
    public static final p p;
    public static final KSDataManager$a q;

    static {
       KSDataManager.q = new KSDataManager$a(null);
       KSDataManager.p = s.b(LazyThreadSafetyMode.SYNCHRONIZED, KSDataManager$Companion$sInstance$2.INSTANCE);
    }
    public void KSDataManager(){
       super();
       this.f = -1;
       this.g = new a();
       this.h = new HashMap();
       this.i = new HashSet(8);
       this.j = new HashMap();
       this.k = new a();
       this.l = new HashMap();
    }
    public void KSDataManager(u p0){
       super();
       this.f = -1;
       this.g = new a();
       this.h = new HashMap();
       this.i = new HashSet(8);
       this.j = new HashMap();
       this.k = new a();
       this.l = new HashMap();
    }
    public static final KSDataManager B0(){
       Object obj = PatchProxy.apply(null, null, KSDataManager.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSDataManager.q.a();
    }
    public final int A0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSDataManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "groupId");
       Integer integer = this.l.get(p0);
       int i = (integer != null)? integer.intValue(): -1;
       return i;
    }
    public final t C0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSDataManager.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tid");
       Object[] objArray = new Object[0];
       e.D().w("KSDataManager", "getTemplateDetail\(\) called with: tid = "+p0, objArray);
       t ot = this.k.g(t.k(p0)).map(new KSDataManager$k0(p0));
       a.o(ot, "mKSDataAPIProvider.creat¡­plateDetailInfo\(\)\n      }");
       return ot;
    }
    public void D(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager.class, "21")) {
          return;
       }
       a.p(p0, "groupId");
       Object[] objArray = new Object[0];
       e.D().w("KSDataManager", "invalidateGroupCache: "+p0, objArray);
       KSDataManager$d uod = this.h.get(p0);
       if (uod != null) {
          uod.i();
       }
       return;
    }
    public final void D0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager.class, "34")) {
          return;
       }
       p0.u1();
       p0.release();
       p0.clear();
       return;
    }
    public final void E0(List p0,List p1,int p2){
       if (PatchProxy.isSupport(KSDataManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, KSDataManager.class, "46")) {
          return;
       }
       a.p(p0, "infoList");
       a.p(p1, "params");
       this.s0(new KSDataManager$n0(p0));
       String str = a.a.q(p1);
       a.o(str, "jsonValue");
       this.g.c(this.k.a(str, p2).subscribeOn(d.c).observeOn(d.a).subscribe(new KSDataManager$o0(p2, p1), new KSDataManager$p0(p2, p1)));
       return;
    }
    public final void F0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager.class, "4")) {
          return;
       }
       a.p(p0, "groupId");
       this.m = p0;
       return;
    }
    public final void G0(String p0,int p1){
       KSDataManager kSDataManage = KSDataManager.class;
       if (PatchProxy.isSupport(kSDataManage) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, kSDataManage, "5")) {
          return;
       }
       a.p(p0, "groupId");
       if (p1 >= 0 && !TextUtils.x(p0)) {
          this.l.put(p0, Integer.valueOf(p1));
       }
       return;
    }
    public void K(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager.class, "11")) {
          return;
       }
       a.p(p0, "effectId");
       String str = "Fetch template ZT id "+p0;
       if (this.i.contains(str)) {
          Object[] objArray = new Object[0];
          e.D().w("KSDataManager", "Request is in porcess", objArray);
          return;
       }else {
          this.i.add(str);
          this.g.c(this.k.d(p0).doOnNext(new KSDataManager$g0(this)).observeOn(d.a).doFinally(new KSDataManager$h0(this, str)).subscribe(new KSDataManager$i0(this), new KSDataManager$j0(this, p0)));
          return;
       }
    }
    public int O(){
       return this.f;
    }
    public KSTemplateFeedListResponse P(String p0){
       Object[] objArray1;
       KSDataManager$d obj = PatchProxy.applyOneRefs(p0, this, KSDataManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "groupId");
       String str = "loadGroupTemplatesCache groupId: ";
       Object[] objArray = new Object[0];
       e.D().w("KSDataManager", str+p0, objArray);
       obj = this.h.get(p0);
       KSTemplateFeedListResponse kSTemplateFe = null;
       List list = (obj != null)? obj.h(): kSTemplateFe;
       if (obj != null && (list == null || list.isEmpty())) {
          objArray1 = new Object[0];
          e.D().w("KSDataManager", str+p0+", no cache available", objArray1);
          return kSTemplateFe;
       }else {
          kSTemplateFe = new KSTemplateFeedListResponse();
          kSTemplateFe.mTemplateList = list;
          kSTemplateFe.mCursor = obj.c();
          objArray1 = new Object[0];
          e.D().w("KSDataManager", str+p0+", cache available with cursor: "+kSTemplateFe.mCursor, objArray1);
          return kSTemplateFe;
       }
    }
    public void T(String p0,Throwable p1,boolean p2){
       if (PatchProxy.isSupport(KSDataManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, KSDataManager.class, "20")) {
          return;
       }
       a.p(p0, "groupId");
       a.p(p1, "error");
       e.D().e("KSDataManager", "onFeedRequestError: error fetching template list", p1);
       this.s0(new KSDataManager$m0(p0, p2));
       return;
    }
    public void W(String p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(KSDataManager.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, KSDataManager.class, "9")) {
          return;
       }
       a.p(p0, "groupId");
       String str = "Fetch Templates By "+p0+' '+this.y0(p0, p1);
       int i = 0;
       if (this.i.contains(str)) {
          Object[] objArray = new Object[i];
          e.D().w("KSDataManager", "Request is in process", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          e.D().w("KSDataManager", "fetchTemplatesByGroup groupId: "+p0+", isFirstPage: "+p1+", applyCache: "+p2, objArray1);
          this.i.add(str);
          t ot = (p1 && p2)? this.w0(p0).switchIfEmpty(this.v(p0, p1).flatMap(new KSDataManager$w(this))): this.v(p0, p1).flatMap(new KSDataManager$x(this));
          this.g.c(ot.observeOn(d.a).doOnNext(new KSDataManager$s(p0)).doFinally(new KSDataManager$t(this, str)).subscribe(new KSDataManager$u(this, p0, p1), new KSDataManager$v(this, p0, p1)));
          return;
       }
    }
    public void a(){
       KSDataManager kSDataManage = KSDataManager.class;
       if (PatchProxy.applyVoid(null, this, kSDataManage, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KSDataManager", "clearData\(\) invoked", objArray);
       if (!PatchProxy.applyVoid(null, this, kSDataManage, "23")) {
          Object[] objArray1 = new Object[0];
          e.D().w("KSDataManager", "disconnect\(\) invoked", objArray1);
          this.b();
          this.g.dispose();
          this.g = new a();
          Iterator iterator = this.j.values().iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             a.o(uoa, "pageList");
             this.D0(uoa);
          }
          this.j.clear();
       }
       this.i.clear();
       this.h.clear();
       this.l.clear();
       this.m = null;
       this.d = null;
       this.f = 0;
       this.e = null;
       this.n = null;
       this.u0();
       return;
    }
    public void disconnect(){
       if (PatchProxy.applyVoid(null, this, KSDataManager.class, "23")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().w("KSDataManager", "disconnect\(\) invoked", objArray);
       this.b();
       this.g.dispose();
       this.g = new a();
       Iterator iterator = this.j.values().iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          a.o(uoa, "pageList");
          this.D0(uoa);
       }
       this.j.clear();
       return;
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.k = p0;
       return;
    }
    public b f0(KSTemplateDetailInfo p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, KSDataManager.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "templateInfo");
       obj = new ArrayList();
       KSTemplateDetailInfo mTemplateId = p0.mTemplateId;
       a.o(mTemplateId, "templateInfo.mTemplateId");
       obj.add(Long.valueOf(Long.parseLong(mTemplateId)));
       this.s0(new KSDataManager$k(p0));
       return this.k.c(obj).observeOn(d.a).subscribe(new KSDataManager$l(p0), new KSDataManager$m(p0));
    }
    public void h0(String p0,String p1,boolean p2){
       Object[] this;
       t obj1;
       if (PatchProxy.isSupport(KSDataManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, KSDataManager.class, "12")) {
          return;
       }
       String str = "templateId";
       a.p(p0, str);
       int i = 0;
       this = new Object[i];
       e.D().w("KSDataManager", "fetchTemplatesForDeepLink templateId: "+p0+", groupId: "+p1, this);
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = null;
       int i1 = -1;
       if (p1 != null) {
          KSDataManager$d uod = this.h.get(p1);
          if (uod != null) {
             Object obj = PatchProxy.applyOneRefs(p0, uod, KSDataManager$d.class, "4");
             if (obj != PatchProxyResult.class) {
                i1 = obj.intValue();
             }else {
                a.p(p0, str);
                int i2 = uod.a.size();
                while (i < i2) {
                   if (TextUtils.n(p0, uod.a.get(i).mId)) {
                      i1 = i;
                      break ;
                   }
                   i = i + 1;
                }
             }
          }
       }
       Ref$ObjectRef objectRef1 = new Ref$ObjectRef();
       String str1 = (p1 != null)? p1: "";
       objectRef1.element = str1;
       if (i1 >= 0) {
          obj1 = this.h.get(str1);
          a.m(obj1);
          objectRef.element = obj1.f(i1);
          obj1 = t.just(new KSDataManager$c(this, this.P(objectRef1.element), true));
       }else {
          KSDataManager$f0 uof0 = new KSDataManager$f0(this, p1, p2, objectRef, objectRef1);
          obj1 = this.k.g(t.k(p0)).flatMap(str1);
       }
       this.g.c(obj1.observeOn(d.a).map(new KSDataManager$c0(this, objectRef, p0, objectRef1)).subscribe(new KSDataManager$d0(this, objectRef1), new KSDataManager$e0(this, p0, p1, objectRef1)));
       return;
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, KSDataManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.h.isEmpty() ^ 0x01);
    }
    public void j0(){
       if (PatchProxy.applyVoid(null, this, KSDataManager.class, "7")) {
          return;
       }
       String str = "Fetch Groups";
       int i = 0;
       if (this.i.contains(str)) {
          Object[] objArray = new Object[i];
          e.D().w("KSDataManager", "Request is in process", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          e.D().w("KSDataManager", "fetchGroups", objArray1);
          this.i.add(str);
          this.g.c(this.k.e().observeOn(d.c).doOnNext(a.a(new KSDataManager$n(this))).onErrorReturn(new KSDataManager$o(this)).observeOn(d.a).doFinally(new KSDataManager$p(this, str)).subscribe(new KSDataManager$q(this), new KSDataManager$r(this)));
          return;
       }
    }
    public KSTemplateDetailInfo l0(){
       String str;
       Object[] objArray = null;
       KSDataManager obj = PatchProxy.apply(objArray, this, KSDataManager.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n;
       if (obj != null) {
          return obj;
       }
       obj = this.e;
       if (obj != null) {
          objArray = obj.toKSTemplateDetailInfo();
          a.o(objArray, "it.toKSTemplateDetailInfo\(\)");
          KSDataManager$d uod = this.h.get(obj.mGroupId);
          if (uod != null) {
             str = uod.e();
             if (str != null) {
             label_0037 :
                objArray.updateGroupName(str);
             }
          }
          str = "";
          goto label_0037 ;
       }
       return objArray;
    }
    public List m(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, KSDataManager.class, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "groupId");
       obj = "cursor";
       a.p(p1, obj);
       KSDataManager$d uod = this.h.get(p0);
       List list = null;
       if (uod != null) {
          Iterator obj1 = PatchProxy.applyOneRefs(p1, uod, KSDataManager$d.class, "5");
          if (obj1 != patchProxyRe) {
             list = obj1;
          }else {
             a.p(p1, obj);
             int i = -1;
             int i1 = 0;
             obj1 = uod.a.iterator();
             while (obj1.hasNext()) {
                if (TextUtils.n(obj1.next().mCursor, p1)) {
                   i = i1;
                   break ;
                }
                i1 = i1 + 1;
             }
             if (i >= 0) {
                uod = uod.a;
                list = uod.subList((i + 1), uod.size());
             }
          }
       }
       return list;
    }
    public String p(){
       return this.d;
    }
    public void r(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager.class, "10")) {
          return;
       }
       a.p(p0, "templateIds");
       String str = "Fetch template ids "+p0;
       int i = 0;
       if (this.i.contains(str)) {
          Object[] objArray = new Object[i];
          e.D().w("KSDataManager", "Request is in process", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          e.D().w("KSDataManager", "fetchTemplatesByIds templateIds: "+p0, objArray1);
          this.i.add(str);
          this.g.c(this.k.g(p0).map(KSDataManager$y.b).observeOn(d.a).doFinally(new KSDataManager$z(this, str)).subscribe(new KSDataManager$a0(this), new KSDataManager$b0(this, p0)));
          return;
       }
    }
    public void t(String p0,int p1){
       Object[] objArray1;
       Object[] obj;
       Object[] objArray2;
       KSFeedTemplateDetailInfo kSFeedTempla1;
       KSTemplateDetailInfo kSTemplateDe;
       KSDataManager kSDataManage = KSDataManager.class;
       String str = "2";
       if (PatchProxy.isSupport(kSDataManage) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, kSDataManage, str)) {
          return;
       }
       a.p(p0, "groupId");
       Object[] objArray = new Object[0];
       e.D().w("KSDataManager", "setSelectedTemplateId\(\) called with: groupId = ["+p0+"], indexInGroup = ["+p1+"]", objArray);
       int i = 2;
       KSFeedTemplateDetailInfo kSFeedTempla = null;
       if (a.g(p0, str)) {
          if (!PatchProxy.isSupport(kSDataManage) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), this, kSDataManage, "3")) {
             KSDataManager to = this.o;
             ArrayList uArrayList = (to != null)? to.b(): kSFeedTempla;
             if (!q.f(uArrayList) && p1 >= 0) {
                a.m(uArrayList);
                if (p1 < uArrayList.size()) {
                   if (u.J1(this.d, str, 0, i, kSFeedTempla) && this.f == p1) {
                      obj = uArrayList.get(p1);
                      a.o(obj, "searchTemplates[indexInGroup]");
                      KSDataManager te = this.e;
                      if (te != null) {
                         a.m(te);
                         if (TextUtils.n(obj.mId, te.mId)) {
                            objArray2 = new Object[0];
                            e.D().w("KSDataManager", "setCurrentTemplate in search list: is same ignore", objArray2);
                         }
                      }
                   }
                   this.d = str;
                   this.f = p1;
                   kSFeedTempla1 = uArrayList.get(p1);
                   this.e = kSFeedTempla1;
                   if (kSFeedTempla1 == null) {
                      obj = new Object[0];
                      e.D().t("KSDataManager", "setSelectedTemplateId: cant find template at "+p1+" in "+"search list", obj);
                   }else {
                      this.G0(str, p1);
                      to = this.e;
                      a.m(to);
                      kSTemplateDe = to.toKSTemplateDetailInfo();
                      a.o(kSTemplateDe, "mSelectedTemplate!!.toKSTemplateDetailInfo\(\)");
                      this.s0(new j(kSTemplateDe, p1));
                   }
                }
             }
             objArray1 = new Object[0];
             e.D().t("KSDataManager", "wrong index: "+p1+" in search list", objArray1);
             this.s0(new i(p1));
          }
          return;
       }else if(a.g(p0, "default")){
          if (this.n != null) {
             this.s0(new KSDataManager$q0(this, p1));
          }
          return;
       }else if(!this.h.containsKey(p0)){
          objArray1 = new Object[0];
          e.D().t("KSDataManager", "wrong groupId: "+p0, objArray1);
          this.s0(new KSDataManager$r0(p0));
          return;
       }else {
          Object obj1 = this.h.get(p0);
          a.m(obj1);
          a.o(obj1, "mGroupCache[groupId]!!");
          if (p1 < 0 || p1 >= obj1.h().size()) {
             Object[] objArray3 = new Object[0];
             e.D().t("KSDataManager", "wrong index: "+p1, objArray3);
             this.s0(new KSDataManager$s0(p0, p1));
             return;
          }else if(u.J1(this.d, p0, 0, i, kSFeedTempla) && this.f == p1){
             KSFeedTemplateDetailInfo kSFeedTempla2 = obj1.f(p1);
             if (kSFeedTempla2 != null) {
                KSDataManager te1 = this.e;
                if (te1 != null) {
                   a.m(te1);
                   if (TextUtils.n(kSFeedTempla2.mId, te1.mId)) {
                      te1 = (kSFeedTempla2.mTemplateType == 12)? 1: null;
                      if (!te1) {
                         objArray2 = new Object[0];
                         e.D().w("KSDataManager", "setCurrentTemplate: normal kuaishan is same ignore", objArray2);
                         return;
                      }else {
                         kSFeedTempla2 = kSFeedTempla2.mName;
                         te1 = this.e;
                         if (te1 != null) {
                            kSFeedTempla = te1.mName;
                         }
                         if (TextUtils.n(kSFeedTempla2, kSFeedTempla)) {
                            objArray2 = new Object[0];
                            e.D().w("KSDataManager", "setCurrentTemplate: kuaiying is same ignore", objArray2);
                            return;
                         }
                      }
                   }
                }
             }
          }
          this.d = p0;
          this.f = p1;
          kSFeedTempla1 = obj1.f(p1);
          this.e = kSFeedTempla1;
          if (kSFeedTempla1 == null) {
             obj = new Object[0];
             e.D().t("KSDataManager", "setSelectedTemplateId: cant find template at "+p1, obj);
             return;
          }else {
             a.m(kSFeedTempla1);
             kSTemplateDe = kSFeedTempla1.toKSTemplateDetailInfo();
             a.o(kSTemplateDe, "mSelectedTemplate!!.toKSTemplateDetailInfo\(\)");
             kSTemplateDe.updateGroupName(obj1.e());
             this.s0(new KSDataManager$t0(kSTemplateDe, p1));
             return;
          }
       }
    }
    public b u(KSTemplateDetailInfo p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, KSDataManager.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "templateInfo");
       obj = new ArrayList();
       KSTemplateDetailInfo mTemplateId = p0.mTemplateId;
       a.o(mTemplateId, "templateInfo.mTemplateId");
       obj.add(Long.valueOf(Long.parseLong(mTemplateId)));
       this.s0(new KSDataManager$e(p0));
       return this.k.b(obj).observeOn(d.a).subscribe(new KSDataManager$f(obj), new KSDataManager$g(obj));
    }
    public final void u0(){
       if (PatchProxy.applyVoid(null, this, KSDataManager.class, "41")) {
          return;
       }
       KSDataManager to = this.o;
       if (to != null) {
          ArrayList uArrayList = to.b();
          if (uArrayList != null) {
             uArrayList.clear();
          }
       }
       this.o = null;
       return;
    }
    public t v(String p0,boolean p1){
       KSDataManager kSDataManage = KSDataManager.class;
       if (PatchProxy.isSupport(kSDataManage)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, kSDataManage, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "groupId");
       int i = 0;
       int i1 = -1;
       if (a.g("999", p0)) {
          int i2 = PostExperimentUtils.m0();
          if (i2 != 1) {
             if (i2 == 2) {
                i1 = 1;
             }
          }else {
             i1 = 0;
          }
       }
       Object[] objArray = new Object[i];
       e.D().w("KSDataManager", "createGroupTemplateFetchingRequest groupId: "+p0+", isFirstPage:"+' '+p1+", type: "+i1, objArray);
       t ot = this.k.f(p0, this.y0(p0, p1), i1).observeOn(d.c).doOnNext(a.a(new KSDataManager$i(this, p1, p0))).onErrorReturn(new KSDataManager$j(this, p1, p0));
       a.o(ot, "mKSDataAPIProvider.creat¡­          cache\n        }");
       return ot;
    }
    public final List v0(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, KSDataManager.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "templateInfoList");
       obj = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(UITemplatePreviewItem.buildFromKuaiShan(iterator.next()));
       }
       return obj;
    }
    public final t w0(String p0){
       t ot;
       Object obj = PatchProxy.applyOneRefs(p0, this, KSDataManager.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KSTemplateFeedListResponse kSTemplateFe = this.P(p0);
       if (kSTemplateFe != null) {
          ot = t.fromCallable(new KSDataManager$h(this, kSTemplateFe));
          a.o(ot, "Observable.fromCallable ¡­nseWrapper\(cache, true\) }");
          return ot;
       }else {
          ot = t.empty();
          a.o(ot, "Observable.empty\(\)");
          return ot;
       }
    }
    public void x(String p0,KSTemplateFeedListResponse p1,boolean p2,boolean p3,boolean p4){
       String str3;
       KSTemplateFeedListResponse mTemplateLis;
       k a;
       Iterator iterator;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       boolean b = p2;
       boolean b1 = p3;
       KSDataManager kSDataManage = KSDataManager.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(kSDataManage)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, kSDataManage, "17")) {
             return;
          }
       }
       a.p(oobject, "groupId");
       a.p(oobject1, "feedResponse");
       Object[] objArray1 = new Object[i1];
       String str = "KSDataManager";
       e.D().w(str, "onGroupFeedLoaded: template feed response for group: "+oobject+" fetched, "+"isFirstPageLoading: "+b+", isCacheDataHit: "+b1+", lastPage: "+p4+", size: "+oobject1.mTemplateList.size(), objArray1);
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       KSDataManager$d uod = obj.h.get(oobject);
       objectRef.element = uod;
       if (uod == null) {
          KSFeedGroupInfo kSFeedGroupI = new KSFeedGroupInfo();
          kSFeedGroupI.mId = oobject;
          KSDataManager$d uod1 = new KSDataManager$d(obj, kSFeedGroupI);
          objectRef.element = uod1;
          obj.h.put(oobject, uod1);
       }
       if (!b1) {
          KSTemplateFeedListResponse kSTemplateFe = 10;
          String str1 = "999";
          String str2 = "feedResponse.mCursor";
          if (b) {
             Ref$ObjectRef element = objectRef.element;
             if (!PatchProxy.applyVoidTwoRefs(element, oobject1, obj, kSDataManage, "18")) {
                str3 = element.d();
                if (str3.hashCode() == 0xdd19 && str3.equals(str1)) {
                   a = k.a;
                   a.c(element.h(), oobject1.mTemplateList);
                   KSTemplateFeedListResponse mTemplateLis1 = oobject1.mTemplateList;
                   List list = element.h();
                   ArrayList uArrayList = new ArrayList(u.Y(list, kSTemplateFe));
                   iterator = list.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(iterator.next().mId);
                   }
                   a.a(mTemplateLis1, uArrayList);
                   kSTemplateFe = oobject1.mCursor;
                   a.o(kSTemplateFe, str2);
                   mTemplateLis = oobject1.mTemplateList;
                   a.o(mTemplateLis, "feedResponse.mTemplateList");
                   element.a(kSTemplateFe, mTemplateLis);
                }else {
                   kSTemplateFe = oobject1.mCursor;
                   a.o(kSTemplateFe, str2);
                   mTemplateLis = oobject1.mTemplateList;
                   a.o(mTemplateLis, "feedResponse.mTemplateList");
                   if (!PatchProxy.applyVoidTwoRefs(kSTemplateFe, mTemplateLis, element, KSDataManager$d.class, "11")) {
                      a.p(kSTemplateFe, "cursor");
                      a.p(mTemplateLis, "templates");
                      String str4 = ", size=";
                      if (i ^ element.a.isEmpty()) {
                         Object[] objArray2 = new Object[0];
                         e.D().w(str, "appendIfEmpty: ABORT!! mTemplates is not empty. cursor="+kSTemplateFe+str4+mTemplateLis.size()+", group="+element.b, objArray2);
                      }else {
                         Object[] objArray3 = new Object[0];
                         e.D().w(str, "appendIfEmpty: cursor="+kSTemplateFe+str4+mTemplateLis.size(), objArray3);
                         element.a(kSTemplateFe, mTemplateLis);
                      }
                   }
                }
             }
          }else {
             Ref$ObjectRef element1 = objectRef.element;
             if (!PatchProxy.applyVoidTwoRefs(element1, oobject1, obj, kSDataManage, "19")) {
                str3 = element1.d();
                if (str3.hashCode() == 0xdd19 && str3.equals(str1)) {
                   a = k.a;
                   KSTemplateFeedListResponse mTemplateLis2 = oobject1.mTemplateList;
                   List list1 = element1.h();
                   ArrayList uArrayList1 = new ArrayList(u.Y(list1, kSTemplateFe));
                   iterator = list1.iterator();
                   while (iterator.hasNext()) {
                      uArrayList1.add(iterator.next().mId);
                   }
                   a.a(mTemplateLis2, uArrayList1);
                   kSTemplateFe = oobject1.mCursor;
                   a.o(kSTemplateFe, str2);
                   mTemplateLis = oobject1.mTemplateList;
                   a.o(mTemplateLis, "feedResponse.mTemplateList");
                   element1.a(kSTemplateFe, mTemplateLis);
                }else {
                   kSTemplateFe = oobject1.mCursor;
                   a.o(kSTemplateFe, str2);
                   mTemplateLis = oobject1.mTemplateList;
                   a.o(mTemplateLis, "feedResponse.mTemplateList");
                   element1.a(kSTemplateFe, mTemplateLis);
                }
             }
          }
       }
       KSDataManager$l0 ol0 = new KSDataManager$l0(p0, p1, objectRef, p2, p4);
       obj.s0(i);
       return;
    }
    public final void x0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager.class, "27")) {
          return;
       }
       boolean b = (p0.isEmpty())? true: false;
       if (b || (s0.F(p0) && !PostExperimentUtils.o())) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (a.g("999", iterator.next().mId)) {
                Object[] objArray = new Object[0];
                e.D().w("KSDataManager", "filter recent tab", objArray);
                iterator.remove();
             }
          }
       }
       return;
    }
    public void y(String p0,String p1){
       KSDataManager$d e;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSDataManager.class, "22")) {
          return;
       }
       a.p(p0, "groupId");
       String str = "templateId";
       a.p(p1, str);
       Object[] objArray = new Object[0];
       e.D().w("KSDataManager", "removeCachedTemplate: groupId "+p0+"£¬ templateId "+p1, objArray);
       KSDataManager$d uod = this.h.get(p0);
       if (uod != null && !PatchProxy.applyVoidOneRefs(p1, uod, KSDataManager$d.class, "12")) {
          a.p(p1, str);
          Object[] objArray1 = new Object[0];
          e.D().w("KSDataManager", "moveInsertedTemplateToOriginalPosition: templateId="+p1, objArray1);
          if (!uod.a.isEmpty() && TextUtils.n(uod.a.get(0).mId, p1)) {
             e = uod.e;
             Object[] objArray2 = -1;
             if (e == objArray2) {
                objArray2 = new Object[0];
                e.D().w("KSDataManager", "moveInsertedTemplateToOriginalPosition: no original pos, just remove first", objArray2);
                uod.a.remove(0);
                uod.b();
             }else if(e == (uod.a.size() + objArray2)){
                uod.a.add(uod.a.remove(0));
             }else if(uod.e < (uod.a.size() + objArray2)){
                uod.a.add(uod.e, uod.a.remove(0));
             }else {
                uod.a.remove(0);
             }
             uod.b();
             uod.e = objArray2;
          }
       }
       return;
    }
    public final String y0(String p0,boolean p1){
       String obj;
       KSDataManager kSDataManage = KSDataManager.class;
       if (PatchProxy.isSupport(kSDataManage)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, kSDataManage, "30");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "0";
       if (!p1) {
          KSDataManager$d uod = this.h.get(p0);
          if (uod != null) {
             uod = uod.c();
             if (uod != null) {
                obj = uod;
             }
          }
       }
       return obj;
    }
    public final HashMap z0(){
       return this.h;
    }
}
