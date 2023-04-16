package em1.q;
import em1.b;
import java.lang.Object;
import android.util.SparseArray;
import java.util.HashSet;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftListResponse;
import java.lang.String;
import java.lang.reflect.Type;
import d61.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import rm1.h;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.models.Gift;
import brd.t;
import em1.w;
import em1.v;
import cjd.e;
import erd.o;
import em1.m;
import erd.g;
import em1.c0;
import em1.b0;
import em1.k;
import em1.j;
import em1.a;
import cm1.b;
import java.util.Set;
import java.util.Collection;
import ekd.q;
import em1.c;
import java.lang.Iterable;
import ok.o;
import qk.y;
import em1.t;
import em1.s;
import em1.q$a;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.graphics.Bitmap;
import em1.g;
import msd.a;
import k51.b;
import t45.d;
import brd.z;
import em1.d;
import em1.o;
import java.lang.Integer;
import em1.n;
import em1.f;
import java.lang.Runnable;
import t45.c;
import em1.h;
import io.reactivex.g;
import em1.p;
import em1.l;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import java.lang.Boolean;
import rm1.f;

public abstract class q implements b	// class@0021c3
{
    public GiftListResponse a;
    public final SparseArray b;
    public Set c;
    public final l0 d;
    public long e;
    public boolean f;

    public void q(){
       super();
       this.b = new SparseArray();
       this.c = new HashSet();
       this.d = l0.g("GiftListResponse", GiftListResponse.class);
       this.e = 0;
       this.f = false;
    }
    public void A(){
       q oq = q.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq, "3")) {
          return;
       }
       if (this.w()) {
          return;
       }
       long l = System.currentTimeMillis();
       long l1 = l - this.e;
       Object obj = PatchProxy.apply(objArray, this, oq, "23");
       long l2 = (obj != PatchProxyResult.class)? obj.longValue(): a.t().u("SOURCE_LIVE").b("getGiftAllRequestInterval", 0xea60);
       if (l1 - l2 > 0) {
          b.Z(LiveLogTag.GIFT_STORE, "tryUpdateAllGifts");
          this.e = l;
          this.f(RequestTiming.DEFAULT);
       }
       return;
    }
    public void B(GiftListResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "18")) {
          return;
       }
       this.a = p0;
       this.b.clear();
       if (h.b() && p0 != null) {
          p0 = p0.mGifts;
          if (p0 != null) {
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                Gift gift = iterator.next();
                if (gift != null) {
                   this.b.put(gift.mId, gift);
                }
             }
          }
       }
       return;
    }
    public t a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return v.b().a(p0).map(new e()).doOnNext(new m(this));
    }
    public t b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b0.a().c(p0).map(new e()).doOnNext(new k(this));
    }
    public t c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return v.b().b(p0).map(new e()).doOnNext(new j(this));
    }
    public void clear(){
       a.a(this);
    }
    public void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "21")) {
          return;
       }
       this.c.add(p0);
       return;
    }
    public void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "16")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       if (this.a == null) {
          this.a = new GiftListResponse();
       }
       if (h.b()) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Gift gift = iterator.next();
             if (!this.a.mGifts.contains(gift)) {
                this.a.mGifts.add(gift);
                this.b.put(gift.mId, gift);
             }
          }
       }else {
          y.a(this.a.mGifts, y.h(p0, new c(this)));
       }
       this.y("mergeIntoCachedGiftListResponse");
       return;
    }
    public void f(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "4")) {
          return;
       }
       b.Z(LiveLogTag.GIFT_STORE, "updateAllGifts");
       s.b().b(p0).map(new e()).subscribe(new q$a(this), Functions.d());
       return;
    }
    public Bitmap h(List p0,String p1){
       return a.c(this, p0, p1);
    }
    public void i(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "5")) {
          return;
       }
       b.b("LiveBaseGiftStoreProxy::loadGiftImages", new g(this, p0));
       return;
    }
    public Bitmap j(String p0,String p1){
       return a.b(this, p0, p1);
    }
    public void k(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "22")) {
          return;
       }
       this.c.remove(p0);
       return;
    }
    public t l(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, q.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s.b().c(p0, p1).map(new e()).observeOn(d.a).map(d.b).doOnNext(new o(this));
    }
    public void m(List p0,boolean p1,String p2){
       a.d(this, p0, p1, p2);
    }
    public void n(List p0,boolean p1,String p2){
       a.e(this, p0, p1, p2);
    }
    public t o(String p0,int p1){
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oq, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return s.b().a(p0, p1).map(new e()).doOnNext(new n(this));
    }
    public void p(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "6")) {
          return;
       }
       c.a(new f(this, p0));
       return;
    }
    public void q(List p0,int p1){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oq, "8")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       this.x(0, p0, p1);
       return;
    }
    public t r(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, q.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return s.b().d(p0, p1).map(new e()).observeOn(d.a);
    }
    public Gift s(int p0){
       Gift gift1;
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oq, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.a == null && (!PatchProxy.applyVoid(null, this, oq, "17") && this.a == null)) {
          t.create(new h(this)).doOnSubscribe(p.b).subscribeOn(d.c).observeOn(d.a).subscribe(new l(this));
       }
    label_004f :
       oq = this.a;
       if (oq == null || oq.mGifts == null) {
          this.A();
          h.c(-1, 1, p0);
          return null;
       }else if(h.b()){
          Gift gift = this.b.get(p0);
          if (gift == null) {
             this.A();
             h.c(-1, 2, p0);
          }else {
             h.c(1, 0, p0);
          }
          return gift;
       }else {
          Iterator iterator = this.a.mGifts.iterator();
          while (true) {
             if (iterator.hasNext()) {
                gift1 = iterator.next();
                if (gift1 != null && gift1.mId == p0) {
                   break ;
                }
             }else {
                this.A();
                h.c(-1, 2, p0);
                return null;
             }
          }
          h.c(1, 0, p0);
          return gift1;
       }
    }
    public long t(int p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oq, "2");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       Gift gift = this.s(p0);
       if (gift != null) {
          return gift.mMagicFaceId;
       }else {
          return 0;
       }
    }
    public final void v(GiftPanelListResponse p0,boolean p1){
       q oq = q.class;
       if (PatchProxy.isSupport(oq) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oq, "15")) {
          return;
       }
       if (p0 != null && !q.f(p0.mGiftPanelItems)) {
          List list = f.c(p0.mGiftPanelItems, p1);
          if (q.f(list)) {
             return;
          }else {
             this.e(list);
             this.i(list);
          }
       }
       return;
    }
    public boolean w(){
       Object obj = PatchProxy.apply(null, this, q.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (a.t().u("SOURCE_LIVE").d("enableGiftAllRequestOpt", false) ^ 0x01);
    }
    public abstract void x(int p0,List p1,int p2);
    public void y(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "19")) {
          return;
       }
       b.c0(LiveLogTag.GIFT_STORE, "[LiveBaseGiftStoreProxy][onGiftUpdate]", "source", p0);
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public final void z(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "7")) {
          return;
       }
       if (q.f(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Gift gift = iterator.next();
          if (gift != null) {
             this.q(gift.mImageUrl, gift.mId);
          }
       }
       return;
    }
}
