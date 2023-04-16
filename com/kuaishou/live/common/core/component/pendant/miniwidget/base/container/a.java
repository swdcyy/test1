package com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a;
import cs5.a;
import lv1.d;
import android.content.Context;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.LiveMiniWidgetContainerView;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a$d;
import mv1.a;
import p91.m;
import androidx.viewpager.widget.ViewPager;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import android.view.View;
import java.util.HashSet;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a$a;
import cs5.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.StringBuilder;
import z51.h;
import z51.j;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import cs5.h;
import nv1.d;
import h3.a;
import lv1.f;
import java.lang.reflect.Field;
import nv1.f;
import android.view.animation.Interpolator;
import java.lang.IllegalAccessException;
import java.lang.NoSuchFieldException;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.b;
import androidx.viewpager.widget.ViewPager$i;
import nv1.b;
import java.lang.Runnable;
import android.view.ViewGroup;
import nv1.e;
import cs5.e;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetItemType;
import java.lang.Iterable;
import qk.m;
import nv1.a;
import ok.o;
import java.lang.Number;
import java.util.Set;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import com.google.gson.JsonElement;
import fg6.a;
import com.google.gson.Gson;
import nv1.c;
import java.util.Collections;
import java.util.Objects;
import java.lang.Boolean;
import cs5.g;
import ekd.k1;
import com.kuaishou.live.common.core.component.pendant.miniwidget.base.container.a$b;

public class a extends d implements a	// class@0016f2
{
    public List g;
    public Set h;
    public f i;
    public ViewPager$l j;
    public a$d k;
    public m l;
    public boolean m;
    public a n;
    public LiveMiniWidgetContainerView o;
    public HashMap p;
    public boolean q;
    public boolean r;
    public boolean s;
    public Runnable t;
    public final Set u;

    public void a(Context p0,LiveMiniWidgetContainerView p1,a$d p2,a p3,m p4,boolean p5){
       super(p0, p1.getViewPager(), p1.getIndicatorLayout(), new ArrayList(), p1);
       this.g = new ArrayList();
       this.h = new HashSet();
       this.p = new HashMap();
       this.r = false;
       this.s = true;
       this.t = new a$a(this);
       this.u = new HashSet();
       this.o = p1;
       this.k = p2;
       this.n = p3;
       this.l = p4;
       this.m = p5;
    }
    public void J1(f p0){
       LiveLogTag liveLogTag;
       String str2;
       a tl;
       b uob;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
          return;
       }
       List list = this.K1(p0.z());
       String str = "";
       String str1 = "LiveMiniWidgetContainer";
       if (!q.f(list)) {
          LiveLogTag lIVE_MINI_WI = LiveLogTag.LIVE_MINI_WIDGET;
          lIVE_MINI_WI.appendTag(str1);
          liveLogTag = lIVE_MINI_WI;
          str2 = j.a(p0.x(), h.i)+"innerUpdateWidgetItem";
          tl = this.l;
          if (tl != null) {
             str = tl.getLiveStreamId();
          }
          b.T(liveLogTag, str2, "liveStreamId", str, "widgetId", p0.z());
          if (!PatchProxy.applyVoidTwoRefs(list, p0, this, uoa, "7")) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                f uof = iterator.next();
                uof.u0(p0, this.k());
                uof.r0(p0.s());
             }
             f uof1 = this.j();
             if (uof1 != null && (uof1.z()).equals(p0.z())) {
                this.e(uof1);
                uof1.C();
             }
          }
       }else {
          LiveLogTag lIVE_MINI_WI1 = LiveLogTag.LIVE_MINI_WIDGET;
          lIVE_MINI_WI1.appendTag(str1);
          liveLogTag = lIVE_MINI_WI1;
          str2 = j.a(p0.x(), h.e)+"innerAddWidgetItem";
          a tl1 = this.l;
          if (tl1 != null) {
             str = tl1.getLiveStreamId();
          }
          b.T(liveLogTag, str2, "liveStreamId", str, "widgetId", p0.z());
          if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "9")) {
             p0.d = new d(this, p0);
             this.g.add(p0);
             p0.i0();
             this.o();
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, this, uoa, "21")) {
                tl = this.i;
                if (tl != null) {
                   tl.q();
                }else {
                   f uof2 = new f(this.d);
                   this.i = uof2;
                   this.c.setAdapter(uof2);
                   if (!PatchProxy.applyVoid(objArray, this, uoa, "23")) {
                      try{
                         Field declaredFiel = ViewPager.class.getDeclaredField("mScroller");
                         declaredFiel.setAccessible(true);
                         Field declaredFiel1 = ViewPager.class.getDeclaredField("sInterpolator");
                         declaredFiel1.setAccessible(true);
                         declaredFiel.set(this.c, new f(this, this.a, declaredFiel1.get(objArray)));
                      }catch(java.lang.NoSuchFieldException e0){
                         e0.printStackTrace();
                      }catch(java.lang.IllegalAccessException e0){
                         e0.printStackTrace();
                      }
                   }
                }
             }
             this.c.setAdapter(this.i);
             this.c.post(new b(this));
             this.v();
             p0.q0(new e(this));
          }
       }
    label_016c :
       return;
    }
    public List K1(String p0){
       List obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i(p0);
       if (obj.isEmpty()) {
          f uof = this.h(p0);
          if (uof != null) {
             obj.add(uof);
          }
       }
       return obj;
    }
    public void L1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       f uof = this.h(p0);
       if (uof == null) {
          return;
       }
       this.g.remove(uof);
       List list = this.i(p0);
       if (!list.isEmpty()) {
          this.l(list);
       }else {
          this.p(uof);
       }
       this.u();
       return;
    }
    public void M1(boolean p0){
    }
    public void N1(LiveMiniWidgetItemType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       m.s(this.g).p(new a(p0)).n(uArrayList);
       if (!uArrayList.isEmpty()) {
          this.g.removeAll(uArrayList);
          this.l(uArrayList);
          this.u();
       }
       return;
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.q != null)? 2: super.a();
       return i;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.t();
       this.g(this.d);
       this.g(this.g);
       this.g.clear();
       this.h.clear();
       super.b();
       return;
    }
    public void e(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "24")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       Set set = this.p.get(p0.z());
       if (set == null || set.isEmpty()) {
          set = new HashSet();
          p0.j();
       }else if(!set.contains(p0.v())){
          p0.j();
       }
       set.add(p0.v());
       this.p.put(p0.z(), set);
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "17")) {
          return;
       }
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          iterator.next().j0();
       }
       this.h.clear();
       this.q = false;
       return;
    }
    public final void g(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.p(iterator.next());
       }
       return;
    }
    public final f h(String p0){
       f uof;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, a.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uof = obj.next();
          if (TextUtils.equals(uof.z(), p0)) {
             break ;
          }
       }
       return uof;
    }
    public final List i(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, a.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int i = 0;
       while (i < this.d.size()) {
          if (TextUtils.equals(this.d.get(i).z(), p0)) {
             obj.add(this.d.get(i));
          }
          i = i + 1;
       }
       return obj;
    }
    public f j(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, a.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d.size() > 0) {
          return this.d.get((this.c.getCurrentItem() % this.d.size()));
       }
       return objArray;
    }
    public String k(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       JsonObject obj = PatchProxy.apply(null, this, uoa, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.m == null || this.l == null) {
          return "";
       }
       obj = new JsonObject();
       obj.c0("userId", QCurrentUser.ME.getId());
       obj.c0("anchorId", TextUtils.k(this.l.d()));
       obj.c0("liveStreamId", TextUtils.k(this.l.getLiveStreamId()));
       Object obj1 = PatchProxy.apply(null, this, uoa, "10");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): this.d.size() - this.h.size();
       obj.a0("showingWidgetCount", Integer.valueOf(i));
       JsonObject jsonObject = new JsonObject();
       jsonObject.G("nativeCommonParams", obj);
       return a.a.p(jsonObject);
    }
    public final void l(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       this.t();
       this.o();
       this.i.q();
       this.c.setAdapter(this.i);
       this.c.post(new c(this));
       this.g(p0);
       if (this.d.isEmpty()) {
          this.t();
          a tk = this.k;
          if (tk != null) {
             tk.a();
          }
       }else {
          this.v();
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "19")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_MINI_WIDGET, "container hide");
       this.r = false;
       this.t();
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, a.class, "18")) {
          return;
       }
       LiveLogTag lIVE_MINI_WI = LiveLogTag.LIVE_MINI_WIDGET;
       String str = "container show";
       b.Z(lIVE_MINI_WI, str);
       this.r = true;
       this.v();
       f uof = this.j();
       if (uof != null) {
          b.Z(lIVE_MINI_WI, j.a(uof.x(), h.g)+str);
          this.e(uof);
       }
       return;
    }
    public final void o(){
       boolean b;
       a uoa = a.class;
       Object[] objArray = null;
       String str = "15";
       if (PatchProxy.applyVoid(objArray, this, uoa, str)) {
          return;
       }
       this.d.clear();
       if (this.g.isEmpty()) {
          this.f();
          return;
       }else {
          Collections.sort(this.g);
          int i = 0;
          f uof = this.g.get(i);
          if (uof.g0()) {
             b.Z(LiveLogTag.LIVE_MINI_WIDGET, j.a(uof.x(), h.e)+" add failed : current item is exclusive type");
             this.d.add(uof);
          }else {
             int i1 = this.n.a();
             int i2 = this.n.c();
             Iterator iterator1 = this.g.iterator();
             int i3 = 0;
             int i4 = 0;
             while (iterator1.hasNext()) {
                f uof4 = iterator1.next();
                if (i3 >= i1) {
                   b.Z(LiveLogTag.LIVE_MINI_WIDGET, j.a(uof4.x(), h.e)+" add failed : widgetItemCount >= maxWidgetItemCount, low priority is abandon");
                   break ;
                }else {
                   Objects.requireNonNull(uof4);
                   Object obj = PatchProxy.apply(objArray, uof4, f.class, str);
                   b = (obj != PatchProxyResult.class)? obj.booleanValue(): uof4.m.j;
                   if (b != null) {
                      if (i4 < i2) {
                         i4 = i4 + 1;
                      }
                   }
                   this.d.add(uof4);
                   i3 = i3 + 1;
                }
             }
          }
          if (this.d.size() == 2) {
             if (!PatchProxy.applyVoid(objArray, this, uoa, "16")) {
                f uof1 = this.g.get(i).h();
                f uof2 = this.g.get(1).h();
                Iterator iterator = this.h.iterator();
                while (iterator.hasNext()) {
                   f uof3 = iterator.next();
                   if (uof3 != uof1 && uof3 != uof2) {
                      uof3.j0();
                   }
                }
                this.h.clear();
                this.h.add(uof1);
                this.h.add(uof2);
                this.d.add(uof1);
                uof1.i0();
                this.d.add(uof2);
                uof2.i0();
                this.q = true;
             }
          }else {
             this.f();
          }
          return;
       }
    }
    public final void p(f p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "14")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "25")) {
          this.p.remove(p0.z());
       }
       p0.j0();
       return;
    }
    public void q(){
       long l;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "28")) {
          return;
       }
       if (this.d.size() > 1) {
          f obj = PatchProxy.apply(objArray, this, uoa, "29");
          int i = 0;
          if (obj != PatchProxyResult.class) {
             l = obj.longValue();
          }else {
             obj = this.j();
             l = (obj != null && obj.n() - i > 0)? obj.n(): this.n.b();
          }
          if (l - i > 0) {
             a uoa1 = 1000;
             if (l - uoa1 <= 0) {
                l = uoa1;
             }
             k1.r(this.t, l);
          }
       }
       return;
    }
    public void r(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "35")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_MINI_WIDGET, "setEnableAutoScroll: "+p0);
       if (p0) {
          if (this.u.isEmpty()) {
             this.s = true;
          }
       }else {
          this.s = false;
       }
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, a.class, "26")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_MINI_WIDGET, "startAutoScroll");
       k1.m(this.t);
       if (this.r == null) {
          return;
       }
       this.q();
       return;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, a.class, "27")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_MINI_WIDGET, "stopAutoScroll");
       k1.m(this.t);
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().u0(iterator.next(), this.k());
       }
       iterator = this.h.iterator();
       while (iterator.hasNext()) {
          f uof = iterator.next();
          uof.q0(new a$b(this, uof));
       }
       return;
    }
    public final void v(){
       if (PatchProxy.applyVoid(null, this, a.class, "20")) {
          return;
       }
       if (q.f(this.d)) {
          return;
       }
       this.c();
       this.s();
       return;
    }
}
