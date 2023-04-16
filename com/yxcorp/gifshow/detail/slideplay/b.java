package com.yxcorp.gifshow.detail.slideplay.b;
import d6a.g;
import java.util.HashMap;
import d6a.i;
import java.lang.Object;
import java.util.ArrayList;
import d6a.o;
import qvb.i;
import g3a.a;
import qvb.q;
import qvb.j;
import d6a.n;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zy6.f;
import androidx.fragment.app.Fragment;
import d6a.f;
import d6a.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import wy6.d;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.library.slide.base.pagelist.a;
import java.lang.Throwable;
import k2b.k0;
import q87.c;
import java.lang.Number;
import java.lang.Iterable;
import brd.t;
import com.yxcorp.gifshow.detail.slideplay.a;
import erd.o;
import brd.a0;
import org.greenrobot.eventbus.a;
import e6a.b;
import e6a.c;
import zva.a;
import java.util.Objects;
import wvb.e;
import wvb.a;
import qvb.f;
import qvb.n0;
import com.yxcorp.gifshow.detail.slideplay.c;
import java.util.Collection;
import ekd.q;
import java.lang.NullPointerException;
import android.util.Log;
import java.util.Iterator;
import qvb.p;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.lang.StringBuilder;
import tkd.b;
import tkd.d;
import hv5.a;
import d6a.l;
import java.lang.Runnable;
import ekd.k1;

public class b implements g	// class@00171f
{
    public i b;
    public i c;
    public List d;
    public q e;
    public o f;
    public o g;
    public d h;
    public a i;
    public static Map j;

    static {
       b.j = new HashMap();
    }
    public void b(i p0){
       super();
       this.d = new ArrayList();
       this.f = new o();
       this.g = new o();
       this.b = p0;
       p0 = p0.q();
       if (!p0 instanceof a) {
          a uoa = new a(p0);
          this.c = uoa;
          uoa.g = true;
       }else {
          this.c = p0;
       }
       this.c.h(this);
       if (p0 instanceof n) {
          p0.u(this.b.G1());
       }
       this.qg(this.c.getItems());
       return;
    }
    public static b b(QPhoto p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       return b.g(j.e(new f(p0, true), f.b(obj), SlideMediaType.ALL));
    }
    public static b c(QPhoto p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       return b.g(j.e(new f(p0), f.b(obj), SlideMediaType.ALL));
    }
    public static b e(String p0){
       b uob = (TextUtils.x(p0))? null: b.j.get(p0);
       return uob;
    }
    public static b g(i p0){
       b obj = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b(p0);
       b.j.put(p0.getId(), obj);
       return obj;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, b.class, "23")) {
          return;
       }
       b th = this.h;
       if (th != null) {
          th.C();
       }
       return;
    }
    public BaseFeed Fa(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       BaseFeed uBaseFeed = (p0 < 0 || this.d.size() <= p0)? null: this.d.get(p0).mEntity;
       return uBaseFeed;
    }
    public SlideMediaType G1(){
       Object obj = PatchProxy.apply(null, this, b.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.G1();
    }
    public void Ka(q p0){
       this.e = p0;
    }
    public boolean Kg(){
       Object obj = PatchProxy.apply(null, this, b.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.q() instanceof a;
    }
    public void Le(BaseFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "17")) {
          return;
       }
       QPhoto qPhoto = new QPhoto(p0);
       if (!PatchProxy.applyVoidOneRefs(qPhoto, this, b.class, "18")) {
          this.d.remove(qPhoto);
          this.c.remove(qPhoto);
       }
       return;
    }
    public void M1(boolean p0,Throwable p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uob, "34")) {
          return;
       }
       uob = this.e;
       if (uob != null) {
          uob.M1(p0, p1);
       }
       k0.C().e("SlidePlayDataFetcherImpl", "fetch data error", p1);
       return;
    }
    public void M6(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "18")) {
          return;
       }
       this.d.remove(p0);
       this.c.remove(p0);
       return;
    }
    public i M7(){
       Object obj = PatchProxy.apply(null, this, b.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.q();
    }
    public int N9(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return -1;
       }
       return this.d.indexOf(new QPhoto(p0));
    }
    public List Og(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromIterable(this.d).map(a.b).toList().e();
    }
    public void P9(String p0,int p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b.class, "41")) {
          return;
       }
       a.d().k(new b(f.c(p0), this.w2(p1), p2));
       return;
    }
    public boolean T(){
       b obj = PatchProxy.apply(null, this, b.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       if (obj != null) {
          return obj.T();
       }
       return false;
    }
    public void U8(String p0,boolean p1,int p2,int p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, b.class, "42")) {
          return;
       }
       a.d().k(new c(f.c(p0), p1, this.w2(p2), p3));
       return;
    }
    public void X6(a p0){
       this.i = p0;
    }
    public boolean Ye(i p0){
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       if (p0 == obj) {
          return false;
       }
       obj.f(this);
       this.c = p0;
       p0.h(this);
       this.qg(this.c.getItems());
       return true;
    }
    public void Z1(boolean p0,boolean p1){
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "26")) {
          return;
       }
       this.c.a();
       return;
    }
    public boolean ac(){
       Object obj = PatchProxy.apply(null, this, b.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.q() instanceof a) {
          return true;
       }
       return this.q().l2();
    }
    public void b4(int p0,QPhoto p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "19")) {
          return;
       }
       if (p0 >= 0 && p0 < this.c.d1().size()) {
          uob = this.c;
          uob.remove(uob.getItem(p0));
          this.c.add(p0, p1);
          this.qg(this.c.getItems());
       }
       return;
    }
    public boolean c8(){
       Object obj = PatchProxy.apply(null, this, b.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.M7() instanceof f;
    }
    public void d(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "31")) {
          return;
       }
       this.c.f(this);
       if (this.b.q() instanceof n) {
          this.b.q().C();
       }
       this.e = null;
       b tc = this.c;
       if (tc instanceof a) {
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(null, tc, a.class, "1")) {
             tc.m().f(tc.j);
          }
       }
       this.d.clear();
       if (!PatchProxy.applyVoid(null, this, uob, "32")) {
          i oi = this.b.q();
          while (oi instanceof e) {
             if (oi instanceof a) {
                Objects.requireNonNull(oi);
                if (!PatchProxy.applyVoid(null, oi, a.class, "1")) {
                   oi.m().f(oi.g);
                   break ;
                }
             }
             oi = oi.m();
          }
       }
       this.b.q().f(this);
       if (!TextUtils.x(this.b.getId())) {
          b.j.remove(this.b.getId());
       }
       this.i = null;
       return;
    }
    public boolean d2(){
       b obj = PatchProxy.apply(null, this, b.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       if (obj != null) {
          return obj.d2();
       }
       return false;
    }
    public List e0(){
       return this.d;
    }
    public void e4(int p0,QPhoto p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "20")) {
          return;
       }
       if (!this.c.getItems().contains(p1) && (p0 >= 0 && p0 <= this.c.d1().size())) {
          if (PatchProxy.isSupport(uob)) {
             Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "21");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
             label_004a :
                uob = this.c;
                b = (!uob instanceof a || p0 <= uob.m().getItems().size())? true: false;
             }
          }else {
             goto label_004a ;
          }
          if (b) {
             this.c.add(p0, p1);
             this.qg(this.c.getItems());
          }
       }
    label_0075 :
       return;
    }
    public int f(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null || p0.mEntity == null) {
          return -1;
       }
       return this.d.indexOf(p0);
    }
    public void fd(int p0,BaseFeed p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "40")) {
          return;
       }
       uob = this.f;
       QPhoto qPhoto = new QPhoto(p1);
       Objects.requireNonNull(uob);
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), qPhoto, uob, oo, "2") && (p0 >= 0 && uob.a.size() > p0))) {
          uob.a.remove(p0);
          uob.a.add(p0, qPhoto);
       }
    label_0048 :
       return;
    }
    public boolean g9(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.apply(null, this, uob, "36");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!TextUtils.x(this.id())) {
          Object obj1 = PatchProxy.apply(null, this, uob, "37");
          b = (obj1 != patchProxyRe)? obj1.booleanValue(): this.M7() instanceof f;
          if (!b) {
             b = true;
          label_0038 :
             return b;
          }
       }
       b = false;
       goto label_0038 ;
    }
    public boolean hasMore(){
       b obj = PatchProxy.apply(null, this, b.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       if (obj != null) {
          return obj.hasMore();
       }
       if (this.b.q() instanceof n) {
          return this.b.q().i1(this.c.hasMore());
       }
       return this.c.hasMore();
    }
    public String id(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getId();
    }
    public boolean isLoading(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.b.q() instanceof f && this.b.q().isLoading())? true: false;
       return b;
    }
    public void l4(d p0){
       this.h = p0;
    }
    public void n(){
       boolean b;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "22")) {
          return;
       }
       b th = this.h;
       if (th != null) {
          th.n();
       }else {
          Object obj = PatchProxy.apply(objArray, this, uob, "27");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             uob = this.h;
             if (uob != null) {
                b = uob.hasMore();
             }else if(this.b.q() instanceof n){
                b = this.b.q().i1(this.c.hasMore());
             }else {
                b = this.c.hasMore();
             }
          }
          if (b) {
             this.c.load();
          }
       }
       return;
    }
    public int ng(int p0,i p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = -1;
       if (p1 == null || p0 == i) {
          return i;
       }else {
          List items = p1.getItems();
          i = 0;
          int i1 = 0;
          while (i < items.size()) {
             if (this.b.a(items.get(i), c.l())) {
                if (i == p0) {
                   break ;
                }else {
                   i1 = i1 + 1;
                }
             }
             i = i + 1;
          }
          return i1;
       }
    }
    public i q(){
       return this.c;
    }
    public void qg(List p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "7")) {
          return;
       }
       this.d.clear();
       if (!PatchProxy.applyVoidOneRefs(p0, this, uob, "8") && !q.f(p0)) {
          int i = 0;
          if (p0.get(i) == null) {
             Object[] objArray = new Object[i];
             k0.C().t("slide_play_photo_null", Log.getStackTraceString(new NullPointerException()), objArray);
          }else {
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                QPhoto qPhoto = iterator.next();
                if (qPhoto == null) {
                   continue ;
                }else {
                   b tb = this.b;
                   if (tb == null || !tb.a(qPhoto, c.l())) {
                      continue ;
                   }
                }
                this.d.add(qPhoto);
             }
          }
       }
       if (this.c instanceof a) {
          this.g.a(this.d);
       }else {
          this.f.a(this.d);
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public boolean sb(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       QPhoto obj = PatchProxy.apply(objArray, this, uob, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int i = 1;
       if (this.q() != null) {
          obj = this.q().getItem(0);
          Object obj1 = PatchProxy.applyOneRefs(obj, objArray, uob, "15");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(obj == null){
             PhotoAdvertisement photoAdverti = k.B(obj);
             if (photoAdverti != null) {
                photoAdverti = photoAdverti.mAdData;
                if (photoAdverti != null && photoAdverti.mSplashInfo != null) {
                   b = true;
                }
             }
          }
          b = false;
          if (b) {
             b = true;
          label_004e :
             Object[] objArray1 = new Object[0];
             k0.C().w("SlidePlayDataFetcherImpl", "hasPreInsertFeed :"+b, objArray1);
             if (this.q() == null || !d.a(0x6c2883df).m00(this.q())) {
                i = 0;
             }
             return (b | i);
          }
       }
       b = false;
       goto label_004e ;
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "33")) {
          return;
       }
       uob = null;
       this.qg(this.c.getItems());
       if (this.b.q() instanceof n) {
          b = this.b.q().D();
       }
       if (b) {
          k1.r(new l(this), 0);
       }else {
          uob = this.e;
          if (uob != null) {
             uob.v2(p0, p1);
          }
       }
       return;
    }
    public QPhoto w2(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       QPhoto qPhoto = (p0 < 0 || this.d.size() <= p0)? null: this.d.get(p0);
       return qPhoto;
    }
}
