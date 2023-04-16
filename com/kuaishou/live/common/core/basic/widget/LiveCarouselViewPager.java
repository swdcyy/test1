package com.kuaishou.live.common.core.basic.widget.LiveCarouselViewPager;
import com.kuaishou.live.core.basic.widget.LiveSafeViewPager;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashSet;
import com.kuaishou.live.common.core.basic.widget.LiveCarouselViewPager$a;
import ya1.h;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import lv1.f;
import java.util.Collections;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import a61.a;
import android.os.Looper;
import java.lang.Runnable;
import qq5.a;
import java.lang.Integer;
import java.lang.Boolean;
import androidx.viewpager.widget.ViewPager;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import va1.l0;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.viewpager.widget.ViewPager$i;
import ekd.k1;
import java.util.Iterator;
import java.util.Set;
import ya1.k;
import h3.a;
import ya1.i;
import com.kuaishou.live.common.core.basic.widget.LiveCarouselViewPager$b;
import java.lang.Long;

public abstract class LiveCarouselViewPager extends LiveSafeViewPager	// class@000f14
{
    public k c;
    public List d;
    public Set e;
    public List f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ViewPager$l j;
    public int k;
    public a l;
    public long m;
    public a n;
    public LiveCarouselViewPager$b o;
    public Runnable p;
    public Runnable q;

    public void LiveCarouselViewPager(Context p0){
       super(p0, null);
    }
    public void LiveCarouselViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = new ArrayList();
       this.e = new HashSet();
       this.f = new ArrayList();
       this.h = true;
       this.i = false;
       this.k = -1;
       this.l = null;
       this.m = 4000;
       this.p = new LiveCarouselViewPager$a(this);
       this.q = new h(this);
    }
    public List getItemList(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveCarouselViewPager obj = PatchProxy.apply(objArray, this, LiveCarouselViewPager.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          Objects.requireNonNull(obj);
          objArray = PatchProxy.apply(objArray, obj, f.class, "1");
          if (objArray != patchProxyRe) {
          }else {
             f d = obj.d;
             if (d == null) {
                d = Collections.emptyList();
             }
             objArray = d;
          }
       }
       return objArray;
    }
    public int getItemListSize(){
       Object obj = PatchProxy.apply(null, this, LiveCarouselViewPager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (q.f(this.d))? 0: this.d.size();
       return i;
    }
    public a getLoopHandler(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveCarouselViewPager obj = PatchProxy.apply(objArray, this, LiveCarouselViewPager.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.n;
       if (obj != null) {
          return obj;
       }
       a uoa = PatchProxy.apply(objArray, this, LiveCarouselViewPager.class, "10");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a(Looper.getMainLooper(), this.m, this.q);
       }
       this.n = uoa;
       return uoa;
    }
    public long getLoopIntervalMs(){
       return this.m;
    }
    public int getRealCount(){
       Object obj = PatchProxy.apply(null, this, LiveCarouselViewPager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.g != null)? 2: this.getItemListSize();
       return i;
    }
    public abstract a i(a p0);
    public a j(int p0){
       if (PatchProxy.isSupport(LiveCarouselViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveCarouselViewPager.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return f.A(this.d, p0);
    }
    public boolean k(int p0){
       if (PatchProxy.isSupport(LiveCarouselViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveCarouselViewPager.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (!(p0 % this.getRealCount()))? true: false;
       return b;
    }
    public final void l(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCarouselViewPager.class, "19")) {
          return;
       }
       b.e0(LiveLogTag.LIVE_ACTIVITY_WIDGET_V2, "LiveCarouselViewPager "+p0, "currentItemIndex", Integer.valueOf(this.getCurrentItem()), "currentItem", l0.e(this.j(this.getCurrentItem())), "nextItem", l0.e(this.j((this.getCurrentItem() + 1))));
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, LiveCarouselViewPager.class, "18")) {
          return;
       }
       this.removeOnPageChangeListener(this.j);
       this.o();
       k1.m(this.p);
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, LiveCarouselViewPager.class, "14")) {
          return;
       }
       if (this.d.size() < 2) {
          this.o();
          return;
       }else if(this.getLoopHandler().c()){
          return;
       }else {
          this.l("startLoopIfNecessary");
          this.getLoopHandler().a(this.m);
          return;
       }
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, LiveCarouselViewPager.class, "15")) {
          return;
       }
       if (!this.getLoopHandler().c()) {
          return;
       }
       this.l("stopLoop");
       this.getLoopHandler().d();
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveCarouselViewPager.class, "17")) {
          return;
       }
       super.onAttachedToWindow();
       this.n();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveCarouselViewPager.class, "16")) {
          return;
       }
       super.onDetachedFromWindow();
       this.o();
       k1.m(this.p);
       return;
    }
    public void setItemListAndResetLoop(List p0){
       a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveCarouselViewPager.class, "1")) {
          return;
       }
       if (this.f.equals(p0) && this.i == null) {
          b.d0(LiveLogTag.LIVE_ACTIVITY_WIDGET_V2, "LiveCarouselViewPager setItemListAndResetLoop not needed cause data not changed", "OriginItemList", this.f, "ItemList", this.d);
          return;
       }else {
          this.d.clear();
          this.f.clear();
          if (!q.f(p0)) {
             this.d.addAll(p0);
             this.f.addAll(p0);
          }
          if (this.h != null) {
             if (this.d.size() == 2) {
                this.g = true;
                uoa = this.i(this.d.get(0));
                a uoa1 = this.i(this.d.get(true));
                Iterator iterator = this.e.iterator();
                while (iterator.hasNext()) {
                   a uoa2 = iterator.next();
                }
                this.e.clear();
                this.e.add(uoa);
                this.e.add(uoa1);
                this.d.add(uoa);
                this.d.add(uoa1);
             }else {
                this.g = false;
                Iterator iterator1 = this.e.iterator();
                while (iterator1.hasNext()) {
                   uoa = iterator1.next();
                }
             }
          }
          b.c0(LiveLogTag.LIVE_ACTIVITY_WIDGET_V2, "LiveCarouselViewPager setItemListAndResetLoop ", "ItemList", this.d);
          LiveCarouselViewPager tc = this.c;
          if (tc == null) {
             if (!PatchProxy.applyVoid(null, this, LiveCarouselViewPager.class, "3")) {
                k ok = new k(this.d);
                this.c = ok;
                this.setAdapter(ok);
                this.setupViewPagerScrollDuration(400);
                i oi = new i(this);
                this.j = oi;
                this.addOnPageChangeListener(oi);
             }
          }else {
             tc.q();
          }
          this.o();
          if (!this.d.isEmpty()) {
             if (this.d.size() == 2 || this.k(this.getCurrentItem())) {
                k1.m(this.p);
                k1.r(this.p, 0);
             }
             this.n();
          }
          this.i = false;
          return;
       }
    }
    public void setLiveCarouseViewPagerListener(LiveCarouselViewPager$b p0){
       this.o = p0;
    }
    public void setLoopIntervalMs(long p0){
       this.m = p0;
    }
    public void setLoopIntervalMsAndForceStart(long p0){
       if (PatchProxy.isSupport(LiveCarouselViewPager.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, LiveCarouselViewPager.class, "2")) {
          return;
       }
       this.m = p0;
       a loopHandler = this.getLoopHandler();
       Objects.requireNonNull(loopHandler);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p0), loopHandler, a.class, "1")) {
          loopHandler.c = p0;
          if (!PatchProxy.applyVoid(null, loopHandler, a.class, "5")) {
             loopHandler.b = false;
             loopHandler.b(loopHandler.c);
          }
       }
       return;
    }
    public void setShouldMockPendant(boolean p0){
       if (this.h != p0) {
          this.i = true;
       }
       this.h = p0;
       return;
    }
}
