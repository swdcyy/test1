package com.yxcorp.gifshow.follow.slide.detail.data.f;
import jb5.e;
import qvb.f;
import android.content.Intent;
import java.lang.String;
import gha.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import lnc.a1;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.a;
import com.yxcorp.gifshow.follow.common.data.FeedsResponse;
import brd.t;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import qvb.n0;
import wkd.b;
import com.yxcorp.gifshow.action.i;
import com.yxcorp.gifshow.action.RealActionBizType;
import yv8.c;
import yv8.a;
import nga.c;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.gifshow.follow.slide.detail.data.f$a;
import java.lang.Enum;
import xh5.a;
import tkd.b;
import tkd.d;
import mv5.b;
import lv5.c;
import lv5.b;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.follow.slide.detail.data.c;
import erd.g;
import cia.t;
import cia.r;
import com.yxcorp.gifshow.follow.slide.detail.data.e;
import com.yxcorp.gifshow.follow.slide.detail.data.d;
import com.yxcorp.gifshow.follow.slide.detail.data.b;
import cia.u;
import cia.s;
import cjd.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import tga.d;
import java.lang.Boolean;
import tga.c;
import la6.b;
import java.util.ArrayList;
import java.util.Iterator;
import xga.c;
import java.util.Collection;
import b06.d;
import kp.y1;
import qk.g0;

public class f extends f implements e	// class@00110b
{
    public List p;
    public QPhoto q;
    public final int r;
    public int s;
    public boolean t;
    public String u;
    public int v;
    public static final int w;

    public void f(Intent p0){
       int i1;
       super();
       int i = 0;
       this.r = i;
       this.t = true;
       this.u = s.c(p0, "feedId");
       if (PatchProxy.isSupport(s.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, "feedType", Integer.valueOf(i), null, s.class, "6");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          label_0049 :
             this.v = i1;
             this.s = (i1 == 2)? 3: 1;
             return;
          }
       }
       a.p("feedType", "parameter");
       if (s.c(p0, "feedType") != null) {
          i = a1.s(s.c(p0, "feedType"), i);
       }
       i1 = i;
       goto label_0049 ;
    }
    public void f(QPhoto p0,int p1,boolean p2,int p3){
       super();
       this.q = p0;
       this.r = p1;
       this.s = p3;
       this.add(0, p0);
    }
    public boolean B1(Object p0){
       return this.h2(p0);
    }
    public t I1(){
       boolean b;
       int i1;
       f obj5;
       String str2;
       Object[] objArray1;
       FeedsResponse uFeedsRespon;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       Object[] obj1 = PatchProxy.apply(objArray, obj, uof, "5");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       c.i(KsLogFollowTag.FOLLOW_NIRVANA.appendTag("NirvanaDetailPageList"), "onCreateRequest");
       obj1 = (this.K() || this.L0() == null)? objArray: this.L0();
       i oi = b.a(-129117978);
       b = false;
       String str = oi.g(RealActionBizType.FOLLOW, objArray, b);
       String cursor = (obj1 != null)? obj1.getCursor(): objArray;
       Object obj2 = b.a(0x5eeadcc5);
       f uof1 = PatchProxy.apply(objArray, obj, uof, "7");
       String str1 = "";
       if (uof1 != patchProxyRe) {
       }else if(obj.t != null){
          uof1 = obj.u;
       }else {
          uof1 = obj.q;
          uof1 = (uof1 != null)? r1.t1(uof1.mEntity): str1;
       }
       Object obj3 = uof1;
       QPhoto obj4 = PatchProxy.apply(objArray, obj, uof, "8");
       int i = 1;
       if (obj4 != patchProxyRe) {
          i1 = obj4.intValue();
       }else if(obj.t != null){
          obj5 = obj.v;
       }else {
          uof1 = obj.q;
          if (uof1 != null) {
             obj4 = uof1.mEntity;
             Object obj7 = PatchProxy.applyOneRefs(obj4, obj, uof, "10");
             if (obj7 != patchProxyRe) {
                i1 = obj7.intValue();
             }else {
                i1 = f$a.a[PhotoType.fromFeed(obj4).ordinal()];
                if (i1 != i && i1 != 2) {
                   if (i1 != 3) {
                      if (i1 == 4) {
                         i1 = PhotoType.REMINDER_FRIEND_PYMK_BIGCARD_FEED.toInt();
                      }
                   }else {
                      i1 = PhotoType.LIVESTREAM.toInt();
                   }
                }else {
                   b = 1;
                }
             }
             b = i1;
          }
       }
       i1 = obj5;
       obj5 = PatchProxy.apply(objArray, obj, uof, "9");
       if (obj5 != patchProxyRe) {
          str2 = obj5;
       }else if(obj.t != null){
          str1 = objArray;
       }else {
          obj5 = obj.q;
          if (obj5 != null) {
             str1 = r1.M0(obj5.mEntity);
          }
       }
       str2 = str1;
       f r = obj.r;
       Object obj6 = PatchProxy.apply(objArray, obj, uof, "6");
       if (obj6 != patchProxyRe) {
          objArray1 = obj6;
       }else if(a.a("follow")){
          objArray = "3";
       }
       objArray1 = objArray;
       f s = obj.s;
       f uof2 = (s != null)? s: 1;
       return obj2.l(cursor, obj3, i1, str2, r, str, objArray1, uof2, d.a(0x3ee97dc2).ox(), d.a(-242212848).c40(), obj.t).subscribeOn(d.b).observeOn(d.c).map(new e()).doOnNext(c.b).doOnNext(new t(obj)).doOnNext(new r(oi)).doOnNext(e.b).doOnNext(d.b).doOnError(b.b).doOnError(new u(cursor)).doOnNext(a.a(new s(obj))).observeOn(d.a);
    }
    public void M1(Object p0,List p1){
       this.j2(p0, p1);
    }
    public void N1(){
       if (PatchProxy.applyVoid(null, this, f.class, "13")) {
          return;
       }
       RxBus.f.c(new d());
       return;
    }
    public void O1(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "14")) {
          return;
       }
       RxBus.f.b(new c());
       return;
    }
    public boolean X1(b p0){
       return this.h2(p0);
    }
    public List Y1(List p0,List p1,List p2){
       ArrayList obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p2.iterator();
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          if (!p0.contains(qPhoto) && p1.contains(qPhoto)) {
             obj.add(qPhoto);
          }else {
             c.a("duplicate", "follow_slide_detail", qPhoto);
          }
       }
       return obj;
    }
    public void a2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       if (this.K()) {
          f tp = this.p;
          if (tp != null && tp.size()) {
             p0.addAll(0, this.p);
             this.p.clear();
          }else {
             tp = this.q;
             if (tp != null) {
                p0.add(0, tp);
             }
          }
       }
       d.c(p0);
       return;
    }
    public void d2(b p0,List p1){
       this.j2(p0, p1);
    }
    public boolean h2(FeedsResponse p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.hasMore())? true: false;
       return b;
    }
    public boolean i(){
       return false;
    }
    public boolean i2(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.q != null && this.getCount() > 0)? true: false;
       return b;
    }
    public void j2(FeedsResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "15")) {
          return;
       }
       if (this.t != null) {
          List list = this.W1(p0, p1);
          if (list == null) {
             return;
          }else {
             y1.d(list, p0.mLlsid);
             d.f(list);
             p1.addAll(list);
             this.V1(list);
          }
       }else {
          super.d2(p0, p1);
       }
       return;
    }
    public void k(List p0){
       this.p = p0;
    }
}
