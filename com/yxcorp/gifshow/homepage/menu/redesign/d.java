package com.yxcorp.gifshow.homepage.menu.redesign.d;
import fo5.b;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import nc5.t;
import ok.x;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import rx5.c;
import tta.q;
import java.lang.Runnable;
import t45.c;
import java.util.List;
import com.yxcorp.gifshow.homepage.menu.redesign.HomeMenuRedesignConfig;
import java.lang.reflect.Type;
import tra.a;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.homepage.experiment.HomeExperimentManager;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import fo5.c;
import java.util.Objects;
import tta.p;
import ekd.k1;
import com.kwai.framework.model.user.QCurrentUser;
import androidx.lifecycle.LifecycleOwner;
import com.kwai.feature.api.feed.home.menu.SidebarMenuItem;

public class d implements b	// class@001783
{
    public boolean a;
    public boolean b;
    public boolean c;
    public LifecycleOwner d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public String k;
    public String l;
    public int m;
    public long n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public final boolean v;

    public void d(){
       super();
       this.e = new CopyOnWriteArrayList();
       this.f = new CopyOnWriteArrayList();
       this.g = new CopyOnWriteArrayList();
       this.h = new CopyOnWriteArrayList();
       this.i = new CopyOnWriteArrayList();
       this.j = new CopyOnWriteArrayList();
       this.v = t.b.get().booleanValue();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.c = d.a(0x77cfa10c).Ih();
       if (this.v == null && this.a != null) {
          return;
       }
       this.a = true;
       c.a(new q(this));
       return;
    }
    public final void b(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "5")) {
          return;
       }
       this.e.clear();
       this.f.clear();
       this.g.clear();
       this.h.clear();
       this.i.clear();
       HomeMenuRedesignConfig homeMenuRede = a.d(HomeMenuRedesignConfig.class);
       if (homeMenuRede == null) {
          return;
       }
       if (!q.f(homeMenuRede.mTopList)) {
          Boolean uBoolean = PatchProxy.apply(objArray, objArray, HomeExperimentManager.class, "13");
          if (uBoolean == PatchProxyResult.class) {
             uBoolean = HomeExperimentManager.m.getValue();
          }
          uBoolean.booleanValue();
          this.e.addAll(homeMenuRede.mTopList);
          this.y(this.e);
       }
       if (!q.f(homeMenuRede.mCommonlyUsedList)) {
          this.f.addAll(homeMenuRede.mCommonlyUsedList);
          this.y(this.f);
       }
       if (!q.f(homeMenuRede.mMoreList)) {
          this.g.addAll(homeMenuRede.mMoreList);
          this.y(this.g);
       }
       if (!q.f(homeMenuRede.mTeenageModeList)) {
          this.h.addAll(homeMenuRede.mTeenageModeList);
          this.y(this.h);
       }
       if (!q.f(homeMenuRede.mBannerItems)) {
          this.i.addAll(homeMenuRede.mBannerItems);
       }
       this.n = homeMenuRede.mBannerDuration;
       if (!TextUtils.x(homeMenuRede.mCommonLyUsedTitle)) {
          this.k = homeMenuRede.mCommonLyUsedTitle;
       }
       if (!TextUtils.x(homeMenuRede.mMoreListTitle)) {
          this.l = homeMenuRede.mMoreListTitle;
       }
       this.m = homeMenuRede.mMoreOuterCount;
       if (!PatchProxy.applyVoid(objArray, this, uod, "12")) {
          Iterator iterator = this.j.iterator();
          while (iterator.hasNext()) {
             c uoc = iterator.next();
             Objects.requireNonNull(uoc);
             k1.o(new p(uoc));
          }
       }
       if (!TextUtils.x(homeMenuRede.mOverrideNewsIconUrl)) {
          this.o = homeMenuRede.mOverrideNewsIconUrl;
       }
       if (!TextUtils.x(homeMenuRede.mOverrideNotifyIconUrl)) {
          this.p = homeMenuRede.mOverrideNotifyIconUrl;
       }
       if (!TextUtils.x(homeMenuRede.mOverrideMessageIconUrl)) {
          this.q = homeMenuRede.mOverrideMessageIconUrl;
       }
       if (!TextUtils.x(homeMenuRede.mOverrideNewsIconText)) {
          this.r = homeMenuRede.mOverrideNewsIconText;
       }
       if (!TextUtils.x(homeMenuRede.mOverrideNotifyIconText)) {
          this.s = homeMenuRede.mOverrideNotifyIconText;
       }
       if (!TextUtils.x(homeMenuRede.mOverrideMessageIconText)) {
          this.t = homeMenuRede.mOverrideMessageIconText;
       }
       if (!TextUtils.x(homeMenuRede.mOverrideTopPicUrl)) {
          this.u = homeMenuRede.mOverrideTopPicUrl;
       }
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!QCurrentUser.ME.isLogined()) {
          return false;
       }
       this.a();
       return true;
    }
    public List d(){
       return this.e;
    }
    public void e(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.d = p0;
       this.a();
       return;
    }
    public String f(){
       return this.o;
    }
    public String g(){
       return this.t;
    }
    public void h(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       if (this.d == p0) {
          this.x();
          this.d = null;
       }
       return;
    }
    public String i(){
       return this.r;
    }
    public void j(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "10")) {
          return;
       }
       this.j.add(p0);
       return;
    }
    public long k(){
       return this.n;
    }
    public List l(){
       return this.f;
    }
    public void logout(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       this.x();
       return;
    }
    public int m(){
       return this.m;
    }
    public String n(){
       return this.s;
    }
    public String o(){
       return this.l;
    }
    public void p(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "11")) {
          return;
       }
       this.j.remove(p0);
       return;
    }
    public List q(){
       return this.g;
    }
    public String r(){
       return this.p;
    }
    public void reload(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       if (a.d(HomeMenuRedesignConfig.class) == null) {
          return;
       }
       this.b = false;
       this.c = d.a(0x77cfa10c).Ih();
       this.b();
       return;
    }
    public String s(){
       return this.q;
    }
    public String t(){
       return this.k;
    }
    public List u(){
       return this.h;
    }
    public List v(){
       return this.i;
    }
    public String w(){
       return this.u;
    }
    public final void x(){
       if (PatchProxy.applyVoid(null, this, d.class, "13")) {
          return;
       }
       this.a = false;
       this.b = false;
       this.e.clear();
       this.f.clear();
       this.g.clear();
       this.h.clear();
       return;
    }
    public final void y(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          iterator.next().mOvert = true;
       }
       return;
    }
}
