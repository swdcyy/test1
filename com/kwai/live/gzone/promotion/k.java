package com.kwai.live.gzone.promotion.k;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import w77.b;
import lnc.a1;
import androidx.fragment.app.c;
import android.content.Context;
import s67.e;
import java.util.List;
import java.util.ArrayList;
import com.kwai.live.gzone.promotion.LiveGzoneColorTopView$b;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.util.Map;
import com.kwai.live.gzone.promotion.k$c;
import fq5.b;
import com.kwai.framework.model.feed.BaseFeed;
import s67.i1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Objects;
import com.kwai.live.gzone.promotion.LiveGzonePromotionGameRecyclerFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.kwai.live.gzone.promotion.k$a;
import java.util.Iterator;
import t67.a;
import java.util.Collection;
import f37.x;
import f37.x$a;
import com.kwai.live.gzone.promotion.LiveGzoneAudienceGamePromotionPopupPageAdapter$1;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import com.yxcorp.gifshow.widget.GzonePagerSlidingTabStrip$e;
import android.view.View;
import s67.k0;
import android.view.View$OnClickListener;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Boolean;
import android.view.ViewParent;
import com.kwai.live.gzone.promotion.LiveGzoneColorTopView;
import ekd.q;
import android.view.ViewGroup;
import tkd.b;
import tkd.d;
import oq3.a;
import lp3.e;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Intent;
import android.os.Bundle;
import s67.l0;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;

public class k extends b implements PagerSlidingTabStrip$d$b	// class@000dcb
{
    public final c j;
    public e k;
    public List l;
    public List m;
    public List n;
    public Context o;
    public LiveGzonePromotionGameRecyclerFragment p;
    public List q;
    public LiveGzoneColorTopView$b r;
    public List s;
    public Map t;
    public int u;
    public List v;
    public List w;
    public List x;
    public static final int y;
    public static final int z;

    static {
       k.y = a1.a(0x7f0619e8);
       k.z = a1.a(0x7f0604ba);
    }
    public void k(c p0,Context p1,e p2,List p3){
       super(p0, 1);
       this.m = new ArrayList();
       this.n = new ArrayList();
       this.q = new ArrayList();
       this.r = new LiveGzoneColorTopView$b();
       this.s = new ArrayList();
       this.t = new HashMap();
       this.u = -1;
       this.r.c(1);
       this.r.e(50);
       this.j = p0;
       this.o = p1;
       this.k = p2;
       this.l = p3;
       this.A();
       this.G();
    }
    public final void A(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       this.r.a(this.l.size());
       return;
    }
    public int B(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       ok = this.x;
       if (ok == null || ok.size() <= p0) {
          return k.z;
       }else {
          return this.x.get(p0).intValue();
       }
    }
    public int C(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       ok = this.w;
       if (ok == null || ok.size() <= p0) {
          return k.y;
       }else {
          return this.w.get(p0).intValue();
       }
    }
    public void D(LiveGzonePromotionGame p0,WebViewFragment p1,int p2){
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       ClientContent$ContentPackage uContentPack;
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, k.class, "12")) {
          return;
       }
       k$c uoc = this.t.get(p1);
       if (uoc != null && uoc.b == null) {
          if (this.u < null && !p2) {
             this.u = p2;
          }
          if (p2 == this.u) {
             boolean b = true;
             uoc.b = b;
             String str = this.k.e.d();
             String liveStreamId = this.k.e.getLiveStreamId();
             LiveGzonePromotionGame mActivityTab = p0.mActivityTabName;
             LiveGzonePromotionGame mGameId = p0.mGameId;
             p0 = p0.mActivityUrl;
             String str1 = i1.c(this.k.f);
             ClientContent$LiveStreamPackage liveStreamPa = this.k.e.a();
             i1 oi1 = i1.class;
             if (PatchProxy.isSupport(oi1)) {
                Object[] objArray = new Object[]{str,liveStreamId,mActivityTab,mGameId,p0,str1,liveStreamPa};
                if (!PatchProxy.applyVoid(objArray, null, oi1, "7")) {
                }
             }else {
             }
          }
       }
    label_00ce :
       return;
    }
    public void E(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "9")) {
          return;
       }
       int i = 1;
       if (p0 == (this.j() - i)) {
          ok = this.p;
          if (ok != null) {
             Objects.requireNonNull(ok);
             if (!PatchProxy.applyVoid(null, ok, LiveGzonePromotionGameRecyclerFragment.class, "8") && ok.J == null) {
                ok.J = i;
                ok.a();
             }
          }
       }
       this.u = p0;
       Fragment uFragment = this.z(p0);
       if (uFragment instanceof WebViewFragment && this.m.size() > p0) {
          this.D(this.m.get(p0), uFragment, p0);
       }
       return;
    }
    public final void F(int p0,WebViewFragment p1,LiveGzonePromotionGame p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, k.class, "11")) {
          return;
       }
       k$c uoc = this.t.get(p1);
       if (uoc != null) {
          p1.fh(uoc);
          p1.ch(uoc);
       }else {
          k$a uoa = new k$a(this, p0, p2, p1);
          p1.ch(uoa);
          this.t.put(p1, uoa);
       }
       return;
    }
    public final void G(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "4")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       k tl = this.l;
       if (tl != null) {
          Iterator iterator = tl.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa.a == null) {
                a c = uoa.c;
                if (c.mDisplayActivity != null) {
                   uArrayList.add(c);
                }
             }
             uArrayList1.add(uoa);
          }
       }
       this.m.clear();
       this.n.clear();
       this.m.addAll(uArrayList);
       this.n.addAll(uArrayList1);
       if (!PatchProxy.applyVoid(objArray, this, ok, "5")) {
          uArrayList = new ArrayList();
          this.w = new ArrayList();
          this.x = new ArrayList();
          Iterator iterator1 = this.m.iterator();
          int i2 = -1;
          while (iterator1.hasNext()) {
             int pageColor = iterator1.next().getPageColor();
             uArrayList.add(Integer.valueOf(pageColor));
             if (!pageColor) {
                this.w.add(Integer.valueOf(k.y));
             }else if(!x.a.c(pageColor)){
                this.w.add(Integer.valueOf(k.y));
                this.x.add(Integer.valueOf(k.z));
             }else {
                this.w.add(Integer.valueOf(i2));
                this.x.add(Integer.valueOf(i2));
             }
          }
          if (this.n.size() > 0) {
             uArrayList.add(Integer.valueOf(i2));
             this.w.add(Integer.valueOf(k.y));
             this.x.add(Integer.valueOf(k.z));
          }
          this.r.d(uArrayList);
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "2")) {
          this.s.clear();
          int i = this.j();
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             LiveGzoneAudienceGamePromotionPopupPageAdapter$1 u1 = new LiveGzoneAudienceGamePromotionPopupPageAdapter$1(this, this.o);
             u1.setText(this.l(i1));
             boolean b = true;
             u1.setFocusable(b);
             u1.setGravity(17);
             u1.setEllipsize(TextUtils$TruncateAt.MIDDLE);
             u1.setSingleLine();
             GzonePagerSlidingTabStrip$e uoe = new GzonePagerSlidingTabStrip$e(this.d(i1), u1);
             if (i == b) {
                u1.setMaxWidth(Integer.MAX_VALUE);
             }else {
                u1.setMaxEms(8);
             }
             if (i1 < this.m.size()) {
                uoe.i(new k0(this, i1));
             }
             this.s.add(uoe);
          }
       }
       return;
    }
    public void H(Fragment p0,boolean p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ok, "13")) {
          return;
       }
       if (p0.getView() != null && p0.getView().getParent() instanceof LiveGzoneColorTopView) {
          p0.getView().getParent().a(p1);
       }
       return;
    }
    public PagerSlidingTabStrip$d b(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.s.get(p0);
    }
    public int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Integer.parseInt(p0);
    }
    public String d(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return Integer.toString(p0);
    }
    public PagerSlidingTabStrip$d e(String p0){
       k ok = k.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, ok, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, this, ok, "22");
       int i = (obj1 != PatchProxyResult.class)? obj1.intValue(): Integer.parseInt(p0);
       return this.b(i);
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, k.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.m.size();
       int i1 = (this.n.size() > 0)? 1: 0;
       return (i + i1);
    }
    public int k(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.q.indexOf(p0);
       if (i < 0) {
          i = -2;
       }
       return i;
    }
    public CharSequence l(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (q.f(this.m)) {
          return a1.p(0x7f102429);
       }else if(p0 >= this.m.size()){
          return a1.p(0x7f102427);
       }else {
          return this.m.get(p0).mActivityTabName;
       }
    }
    public Object o(ViewGroup p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ok, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = super.o(this.r.b(p0, p1), p1);
       if (p0 instanceof WebViewFragment && p1 < this.m.size()) {
          this.F(p1, p0, this.m.get(p1));
       }
       return p0;
    }
    public boolean p(View p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, k.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p1 = p1.getView();
       boolean b = true;
       if (p1 != null && p1.getParent() instanceof LiveGzoneColorTopView) {
          if (p1.getParent() != p0) {
             b = false;
          }
          return b;
       }else if(p1 == p0){
          b = false;
       }
       return b;
    }
    public Fragment z(int p0){
       LiveGzonePromotionGame obj;
       KwaiYodaWebViewFragment kwaiYodaWebV;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "8");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       if (q.f(this.m) || p0 >= this.m.size()) {
          if (this.p == null) {
             LiveGzonePromotionGameRecyclerFragment liveGzonePro = new LiveGzonePromotionGameRecyclerFragment(this.o, this.k, this.n);
             this.p = liveGzonePro;
             this.q.add(liveGzonePro);
          }
          return this.p;
       }else if(p0 >= this.q.size()){
          obj = this.m.get(p0);
          if (PatchProxy.isSupport(ok)) {
             kwaiYodaWebV = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p0), this, ok, "10");
             if (kwaiYodaWebV != patchProxyRe) {
             label_0096 :
                this.q.add(kwaiYodaWebV);
                return kwaiYodaWebV;
             }
          }
          kwaiYodaWebV = d.a(0x7b1b2208).Tf(this.k.e.t5());
          KwaiYodaWebViewActivity$c uoc = KwaiYodaWebViewActivity.G3(this.o, obj.mActivityUrl).k("promotion");
          uoc.j("");
          kwaiYodaWebV.setArguments(uoc.e("KEY_THEME", "3").a().getExtras());
          kwaiYodaWebV.lh(new l0(this));
          this.F(p0, kwaiYodaWebV, obj);
          goto label_0096 ;
       }else {
          return this.q.get(p0);
       }
    }
}
