package com.yxcorp.gifshow.prettify.filter.repo.a;
import d1c.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.prettify.v4.magic.filter.k;
import o1c.w0;
import com.kwai.robust.PatchProxyResult;
import o1c.u;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import java.util.ArrayList;
import e1c.m;
import java.lang.Iterable;
import ok.o;
import qk.y;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import e1c.n;
import e1c.h;
import e1c.l;
import e1c.i;
import kotlin.Pair;
import e1c.j;
import e1c.k;
import p1c.a;
import p1c.d;
import java.lang.Long;
import java.util.Collections;
import brd.t;
import t45.d;
import brd.z;
import e1c.e;
import e1c.f;
import erd.g;
import crd.b;
import im8.f;
import com.yxcorp.gifshow.prettify.filter.repo.a$a;
import e1c.o;
import e1c.d;
import e1c.p;
import e1c.g;
import com.google.common.base.Optional;
import n0c.c;
import java.util.Objects;
import skd.a$a;
import skd.a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import d1c.b;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup$a;
import java.lang.Boolean;
import n0c.c$a;
import e1c.c;

public abstract class a implements c	// class@001153
{
    public k a;
    public boolean b;
    public List c;
    public List d;
    public int e;
    public boolean f;

    public void a(){
       super();
       this.e = -1;
    }
    public void a(boolean p0){
       super();
       this.e = -1;
       this.b = p0;
    }
    public static void B(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "26")) {
          return;
       }
       if (p1 != null) {
          int i = 0;
          while (i < p1.size()) {
             FilterConfig uFilterConfi = p1.get(i);
             if (uFilterConfi != null) {
                p0.add(uFilterConfi.clone());
             }
             i = i + 1;
          }
       }
       return;
    }
    public static void F(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "25")) {
          return;
       }
       if (!q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().mSourceType != null) {
                iterator.remove();
             }
          }
       }
       return;
    }
    public static void G(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "24")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       boolean b = true;
       while (iterator.hasNext()) {
          FilterConfig uFilterConfi = iterator.next();
          if (uFilterConfi.isDivider() && b) {
             iterator.remove();
          }else {
             b = uFilterConfi.isDivider();
          }
       }
       return;
    }
    public synchronized void A(){
       if (PatchProxy.applyVoid(null, this, a.class, "17")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.d();
       }
       return;
    }
    public final w0 C(FilterConfig p0){
       w0 obj = PatchProxy.applyOneRefs(p0, this, a.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new w0(p0);
       obj.l(true);
       obj.c = -111;
       obj.b = u.e;
       return obj;
    }
    public synchronized final void D(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "22")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       List collectedFil = Filters.getCollectedFilterIdList(this.r());
       List list = this.a.b();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = list.iterator();
       boolean b = false;
       while (iterator.hasNext()) {
          w0 ow0 = new w0(iterator.next());
          if (this.b != null && y.i(collectedFil, new m(ow0), objArray) != null) {
             b = true;
          }
          ow0.l(b);
          uArrayList.add(ow0);
       }
       Object[] objArray1 = new Object[b];
       a.D().w("FilterDataManager", "makeFilterListWithCollect size : "+uArrayList.size(), objArray1);
       if (q.f(uArrayList)) {
          Object[] objArray2 = new Object[b];
          a.D().A("FilterDataManager", "originItemList is empty", objArray2);
          return;
       }else {
          this.c = uArrayList;
          uArrayList = new ArrayList();
          if (this.b != null && !collectedFil.isEmpty()) {
             Iterator iterator1 = collectedFil.iterator();
             while (iterator1.hasNext()) {
                FilterConfig uFilterConfi = y.i(list, new n(iterator1.next()), objArray);
                if (uFilterConfi != null) {
                   uArrayList.add(b, this.C(uFilterConfi));
                }
             }
          }
          this.d = uArrayList;
          this.E();
          return;
       }
    }
    public final void E(){
       if (PatchProxy.applyVoid(null, this, a.class, "21")) {
          return;
       }
       int i = 0;
       for (int i1 = 0; i1 < this.g().size(); i1 = i1 + 1) {
          this.g().get(i1).m(i1);
       }
       for (; i < this.l().size(); i = i + 1) {
          this.l().get(i).m(i);
       }
       return;
    }
    public w0 a(){
       FilterConfig obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f();
       if (obj == null) {
          return null;
       }
       List list = (this.f != null && this.b != null)? 1: null;
       w0 ow0 = (list)? y.i(this.l(), new h(obj), null): null;
       if (ow0 == null && obj.isReco()) {
          ow0 = y.i(this.g(), new l(obj), null);
       }
       if (ow0 == null) {
          ow0 = y.i(this.g(), new i(obj), null);
       }
       return ow0;
    }
    public synchronized Pair c(FilterConfig p0){
       w0 obj = PatchProxy.applyOneRefs(p0, this, a.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Filters.removeCollectedFilterId(this.r(), Integer.valueOf(p0.mFilterId));
       Object obj1 = null;
       obj = y.i(this.l(), new j(p0), obj1);
       int i = -1;
       int i1 = (obj != null)? obj.e(): -1;
       boolean b = false;
       if (obj != null) {
          obj.l(b);
          this.l().remove(obj);
       }
       obj = y.i(this.g(), new k(p0), obj1);
       if (obj != null) {
          i = obj.e();
       }
       if (obj != null) {
          obj.l(b);
       }
       this.E();
       d.a().b(this.r().mValue, Collections.singletonList(Long.valueOf((long)p0.mFilterId))).subscribeOn(d.c).subscribe(new e(p0), new f(p0));
       return new Pair(Integer.valueOf(i1), Integer.valueOf(i));
    }
    public f d(){
       Object obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$a(this);
    }
    public synchronized void e(FilterConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "19")) {
          return;
       }
       Filters.addCollectedFilterId(this.r(), p0.mFilterId);
       this.l().add(0, this.C(p0));
       Iterator iterator = this.g().iterator();
       while (iterator.hasNext()) {
          w0 ow0 = iterator.next();
          if (ow0.a().mFilterId == p0.mFilterId) {
             ow0.l(true);
          }
       }
       this.E();
       d.a().e(this.r().mValue, Collections.singletonList(Long.valueOf((long)p0.mFilterId))).subscribeOn(d.c).subscribe(new o(p0), new d(p0));
       return;
    }
    public FilterConfig f(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.g;
    }
    public List g(){
       List list;
       a obj = PatchProxy.apply(null, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null || obj.isEmpty()) {
          this.D();
       }
       obj = this.c;
       if (obj == null) {
          list = Collections.emptyList();
       }
       return list;
    }
    public List getFilters(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.u(false);
    }
    public List h(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.addAll(this.l());
       obj.addAll(this.g());
       return obj;
    }
    public void i(){
    }
    public synchronized void init(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       int i = 0;
       if (this.w()) {
          objArray = new Object[i];
          a.D().w("FilterDataManager", "init: has already init", objArray);
          return;
       }else {
          objArray = new Object[i];
          a.D().w("FilterDataManager", "initConfigs", objArray);
          if (!Filters.hasInit(this.r())) {
             Filters.init(this.r());
          }
          this.a = new k(this.getDataType(), this.r(), this.b());
          return;
       }
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "18")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.c();
       }
       return;
    }
    public boolean k(){
       return false;
    }
    public List l(){
       List list;
       a obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.D();
       }
       obj = this.d;
       if (obj == null) {
          list = Collections.emptyList();
       }
       return list;
    }
    public FilterConfig m(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return y.y(this.getFilters(), new g(p0)).orNull();
    }
    public void n(c p0){
    }
    public void o(FilterConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, k.class, "6")) {
          if (p0 == null) {
             p0 = FilterConfig.getEmpty();
          }
          ta.g = p0;
          if (!(ta.b.a).equals("EMPTY_KEY")) {
             p0 = p0.mFilterId;
             int i = 0;
             if (!ta.a(p0).canSaveAsLast()) {
                Object[] objArray = new Object[i];
                a.D().w("FilterConfigModels", "skip magic as last: "+p0, objArray);
             }else {
                Object[] objArray1 = new Object[i];
                a.D().w("FilterConfigModels", "setLastFilterConfigId: "+p0, objArray1);
                a$a uoa = ta.d.a();
                uoa.putInt(ta.b.c, p0);
                g.a(uoa);
             }
          }
       }
       return;
    }
    public void onActivityDestroy(){
    }
    public FilterConfig p(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       FilterConfig uFilterConfi = PatchProxy.apply(objArray, obj, k.class, "5");
       if (uFilterConfi != patchProxyRe) {
       }else {
          uFilterConfi = obj.a(obj.d.getInt(obj.b.c, -1));
       }
       return uFilterConfi;
    }
    public void q(boolean p0){
       this.f = p0;
    }
    public boolean s(){
       return b.a(this);
    }
    public List t(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList(this.a.e);
       if (this.b != null) {
          FilterGroup$a uoa = new FilterGroup$a();
          uoa.a = -111;
          uoa.b = u.e;
          obj.add(0, uoa);
       }
       return obj;
    }
    public List u(boolean p0){
       ArrayList obj;
       Iterator iterator;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       if (p0) {
          iterator = this.l().iterator();
          while (iterator.hasNext()) {
             obj.add(iterator.next().a());
          }
       }
       iterator = this.g().iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().a());
       }
       return obj;
    }
    public FilterConfig v(int p0){
       return null;
    }
    public boolean w(){
       a obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = (obj != null && !q.f(obj.b()))? true: false;
       return b;
    }
    public t x(){
       Object obj = PatchProxy.apply(null, this, a.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(new c$a(new ArrayList()));
    }
    public boolean y(){
       boolean b = (this.f != null && this.b != null)? true: false;
       return b;
    }
    public FilterConfig z(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "15");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       k ok = PatchProxy.apply(null, this, uoa, "3");
       if (ok != patchProxyRe) {
       }else {
          ok = this.a.a;
       }
       return y.y(ok, new c(p0)).orNull();
    }
}
