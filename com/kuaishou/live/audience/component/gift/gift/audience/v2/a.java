package com.kuaishou.live.audience.component.gift.gift.audience.v2.a;
import mk1.f;
import t02.a0;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import ez0.h;
import cm1.a;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.util.List;
import rm1.f;
import java.util.Set;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Integer;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import em1.b;
import ez0.e;
import erd.g;
import ez0.d;
import java.util.Map;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import p91.m;
import wkd.b;
import kka.h;
import com.google.common.base.Optional;
import ez0.a;
import ok.h;
import ez0.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.a$a;
import ez0.f;
import erd.o;
import ez0.c;

public class a implements f	// class@000afb
{
    public final a0 a;
    public a b;
    public GiftPanelListResponse c;
    public GiftPanelListResponse d;
    public GiftPanelListResponse e;
    public List f;
    public HashMap g;
    public HashMap h;
    public List i;
    public Set j;
    public Set k;
    public boolean l;
    public final Map m;
    public final h n;

    public void a(a0 p0){
       super();
       this.c = null;
       this.d = null;
       this.e = null;
       this.f = new ArrayList();
       this.g = new HashMap();
       this.h = new HashMap();
       this.i = new ArrayList();
       this.j = new HashSet();
       this.k = new HashSet();
       this.m = new HashMap();
       this.n = new h();
       this.b = new a();
       this.a = p0;
    }
    public static void u(a p0,GiftPanelListResponse p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, a.class, "14")) {
       }else {
          LiveLogTag gIFT = LiveLogTag.GIFT;
          b.Z(gIFT, "[GiftBoxDataSource][handleGiftPanelListResponse]response:"+p1);
          p0.l = p1.mShouldHideGiftEntrance;
          if (q.f(p1.mGiftPanelItems)) {
             b.Z(gIFT, "[GiftBoxDataSource][handleGiftPanelListResponse]giftPanelListResponse.mGiftPanelItems is null");
          }else {
             int i = 0;
             p0.v(i, p1.mGiftToken);
             p0.n.a(GiftTab.NormalGift, p1.mRecoGiftLlsid, true);
             p0.d = p0.e;
             p0.e = p1;
             p1 = p1.mGiftPanelItems;
             p0.i = p1;
             List list = f.c(p1, i);
             if (!q.f(list)) {
                p0.f = list;
                p0.j.clear();
                int i1 = list.size();
                for (; i < i1; i = i + 1) {
                   p0.j.add(Integer.valueOf(list.get(i).mId));
                }
             }
          }
       }
       return;
    }
    public List O3(){
       return this.i;
    }
    public t a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyOneRefs(p0, obj, a.class, "14");
       if (ot != patchProxyRe) {
       }else {
          ot = a.a.a(p0);
       }
       return ot.doOnNext(new e(this));
    }
    public t b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyOneRefs(p0, obj, a.class, "15");
       if (ot != patchProxyRe) {
       }else {
          ot = a.a.b(p0);
       }
       return ot;
    }
    public t c(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyOneRefs(p0, obj, a.class, "13");
       if (ot != patchProxyRe) {
       }else {
          ot = a.a.c(p0);
       }
       return ot.doOnNext(new d(this));
    }
    public void clear(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "11")) {
          return;
       }
       this.f.clear();
       this.g.clear();
       this.c = objArray;
       this.i.clear();
       this.j.clear();
       this.k.clear();
       this.m.clear();
       a tn = this.n;
       Objects.requireNonNull(tn);
       if (!PatchProxy.applyVoid(objArray, tn, h.class, "3")) {
          tn.a.clear();
          tn.b.clear();
       }
       this.h.clear();
       return;
    }
    public GiftPanelListResponse d(){
       return this.e;
    }
    public a e(){
       return this.b;
    }
    public boolean f(){
       return this.l;
    }
    public List g(){
       return this.f;
    }
    public Set h(){
       return this.j;
    }
    public String i(GiftTab p0,boolean p1){
       Object obj1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uoa = this.n;
       Objects.requireNonNull(uoa);
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), uoa, oh, "2");
          if (obj1 != PatchProxyResult.class) {
          }else if(p1){
             obj1 = uoa.a.get(p0);
          }else {
             obj1 = uoa.b.get(p0);
          }
       }else {
          goto label_0035 ;
       }
       return obj1;
    }
    public List j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       List list = this.g.get(TextUtils.E(p0));
       if (list == null) {
          list = new ArrayList();
       }
       return list;
    }
    public t k(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       String liveStreamId = this.a.Z2.getLiveStreamId();
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyTwoRefs(liveStreamId, p0, obj, a.class, "18");
       if (ot != patchProxyRe) {
       }else {
          ot = a.a.r(liveStreamId, p0);
       }
       return ot;
    }
    public boolean l(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.c == null && !q.f(this.f))? true: false;
       return b;
    }
    public t m(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Optional.fromNullable(this.c).transform(new a(this)).or(this.b.g(this.a.Z2.getLiveStreamId(), b.a(-1592356291).s())).doOnNext(new b(this));
    }
    public t n(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       String liveStreamId = this.a.Z2.getLiveStreamId();
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyTwoRefs(liveStreamId, p0, obj, a.class, "17");
       if (ot != patchProxyRe) {
       }else {
          ot = a.a.l(liveStreamId, p0);
       }
       return ot.doOnNext(new a$a(this, p0));
    }
    public t o(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.g(this.a.Z2.getLiveStreamId(), b.a(-1592356291).s()).doOnNext(new b(this));
    }
    public Set p(){
       return this.k;
    }
    public GiftPanelListResponse q(){
       return this.d;
    }
    public t r(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.just(Integer.valueOf(b.a(-1592356291).s())).flatMap(new f(this)).doOnNext(new c(this));
    }
    public String s(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return TextUtils.k(this.m.get(Integer.valueOf(p0)));
    }
    public GiftPanelListResponse t(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.get(TextUtils.E(p0));
    }
    public final void v(int p0,String p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "17")) {
          return;
       }
       this.m.put(Integer.valueOf(p0), p1);
       return;
    }
}
