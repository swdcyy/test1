package com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper$a;
import f4a.b0;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import java.lang.Object;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import j4a.b;
import com.yxcorp.gifshow.detail.plc.mix.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import mxb.j0;
import h4a.e;
import erd.g;
import h4a.d;
import java.lang.Integer;
import j4a.a;
import tkd.b;
import tkd.d;
import nl9.u;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;
import i4a.e;
import androidx.collection.ArrayMap;
import java.util.Map;
import mxb.j;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.plc.helper.PlcStyleChangeType;
import f4a.a0;
import h4a.c;
import h4a.a;
import ok.x;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import android.os.SystemClock;

public class PLCLogHelper$a implements b0	// class@001682
{
    public boolean a;
    public boolean b;
    public PlcEntryStyleInfo$PageType c;
    public final PLCLogHelper d;

    public void PLCLogHelper$a(PLCLogHelper p0){
       this.d = p0;
       super();
       this.a = true;
       this.b = false;
       this.c = PlcEntryStyleInfo$PageType.UNKNOWN;
    }
    public void A(long p0,long p1){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa, "29")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null && j.g() != null) {
          this.d.j.g().c(3);
       }
       j = this.d.j;
       if (j != null) {
          j.r(1);
       }
       if (this.a != null) {
          uoa = this.d;
          uoa.s.j(31, uoa.a.mEntity, uoa.r).d(new e(p0, p1)).a();
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper$a.class, "30")) {
          return;
       }
       if (this.b != null) {
          PLCLogHelper$a td = this.d;
          td.s.j(37, td.a.mEntity, td.r).a();
       }
       return;
    }
    public void C(long p0,long p1){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa, "28")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null && j.g() != null) {
          this.d.j.g().c(1);
       }
       if (this.a != null) {
          uoa = this.d;
          uoa.s.j(34, uoa.a.mEntity, uoa.r).d(new d(p0, p1)).a();
       }
       return;
    }
    public void D(int p0,int p1){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "13")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.p(1, p0, p1);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          k.j();
       }
       return;
    }
    public void E(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PLCLogHelper$a.class, "33")) {
          return;
       }
       PLCLogHelper$a td = this.d;
       d.a(-1694791652).Kh(td.a.mEntity, td.r, p0);
       return;
    }
    public void F(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "14")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.q(4, p0);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          k.c();
       }
       return;
    }
    public void G(int p0,PlcEntryStyleInfo$TagPackage p1){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "19")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.s(p0, p1);
       }
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper$a.class, "2")) {
          return;
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          Objects.requireNonNull(k);
       }
       return;
    }
    public void I(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper$a.class, "24")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.o(1);
       }
       j = this.d.k;
       if (j != null) {
          j.k();
       }
       PLCLogHelper$a td = this.d;
       td.f = 0;
       k1.m(td.u);
       return;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper$a.class, "4")) {
          return;
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          Objects.requireNonNull(k);
       }
       return;
    }
    public void K(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper$a.class, "34")) {
          return;
       }
       PLCLogHelper$a td = this.d;
       td.f = 0;
       k1.m(td.u);
       return;
    }
    public void L(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "25")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null && j.g() != null) {
          this.d.j.g().c(p0);
       }
       return;
    }
    public void M(){
       this.d.A = false;
    }
    public void N(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "12")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.m(1, p0);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          Objects.requireNonNull(k);
       }
       return;
    }
    public void O(PlcEntryStyleInfo$PageType p0){
       this.c = p0;
    }
    public void P(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "17")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.q(5, p0);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          Objects.requireNonNull(k);
       }
       return;
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper$a.class, "23")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.o(2);
       }
       j = this.d.k;
       if (j != null) {
          j.h();
       }
       PLCLogHelper$a td = this.d;
       td.f = 0;
       k1.m(td.u);
       return;
    }
    public void a(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "11")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.n(1, p0);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          k.j();
       }
       return;
    }
    public void b(int p0,int p1){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "22")) {
          return;
       }
       k1.m(this.d.u);
       if (p0 == 2 && (this.d.l() || this.d.m())) {
          return;
       }
       PLCLogHelper k = this.d.k;
       if (k != null && k instanceof e) {
          Objects.requireNonNull(k);
          e uoe = e.class;
          if (PatchProxy.isSupport(uoe) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), k, uoe, "13") && k.p())) {
             ArrayMap uArrayMap = new ArrayMap();
             uArrayMap.put("photoPlayCount", Integer.valueOf((k.e + true)));
             j oj = k.n();
             oj.o(uArrayMap);
             k.f.y(oj, 170, p1);
          }
       }
       p0.g = true;
       return;
    }
    public void c(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "18")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.n(5, p0);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          k.d();
       }
       return;
    }
    public void d(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "10")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.n(6, p0);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          Objects.requireNonNull(k);
       }
       return;
    }
    public void e(boolean p0){
       this.b = p0;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PLCLogHelper$a.class, "26")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null && j.g() != null) {
          this.d.j.g().c(1);
       }
       if (this.a != null) {
          PLCLogHelper$a td = this.d;
          PLCLogHelper s = td.s;
          Objects.requireNonNull(td);
          j oj = PatchProxy.apply(objArray, td, PLCLogHelper.class, "12");
          if (oj != PatchProxyResult.class) {
          }else {
             oj = td.s.x(td.a.mEntity, td.r);
          }
          s.b(oj, 30);
       }
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PLCLogHelper$a.class, "32")) {
          return;
       }
       PLCLogHelper$a td = this.d;
       d.a(-1694791652).uB(td.a.mEntity, td.r, p0);
       return;
    }
    public void h(boolean p0){
       this.a = p0;
    }
    public void i(PlcStyleChangeType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PLCLogHelper$a.class, "35")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.w(p0);
       }
       return;
    }
    public void j(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.v(p0);
       }
       j = this.d.k;
       if (j != null) {
          j.m(p0);
       }
       return;
    }
    public void k(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "5")) {
          return;
       }
       uoa = this.d;
       if (uoa.B == null) {
          uoa.B = true;
          PLCLogHelper j = uoa.j;
          if (j != null) {
             j.q(2, p0);
          }
          PLCLogHelper k = this.d.k;
          if (k != null) {
             k.i();
          }
       }
       return;
    }
    public void l(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "9")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.n(3, p0);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          Objects.requireNonNull(k);
       }
       return;
    }
    public void m(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "6")) {
          return;
       }
       uoa = this.d;
       if (uoa.A == null) {
          uoa.A = true;
          PLCLogHelper j = uoa.j;
          if (j != null) {
             j.q(true, p0);
          }
          PLCLogHelper k = this.d.k;
          if (k != null) {
             k.l();
          }
       }
       return;
    }
    public void n(int p0,int p1){
       a0.c(this, p0, p1);
    }
    public void o(int p0,int p1){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "21")) {
          return;
       }
       k1.m(this.d.u);
       if (p0 == 2 && (this.d.l() || this.d.m())) {
          return;
       }
       PLCLogHelper k = this.d.k;
       if (k != null && k instanceof e) {
          k.r(p0, p1);
       }
       p0.g = true;
       return;
    }
    public void p(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "16")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.q(3, p0);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          k.e();
       }
       return;
    }
    public void q(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "15")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.q(6, p0);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          Objects.requireNonNull(k);
       }
       return;
    }
    public void r(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "8")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.n(4, p0);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          k.b();
       }
       return;
    }
    public void s(long p0,long p1){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa, "27")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null && j.g() != null) {
          this.d.j.g().c(2);
       }
       if (this.a != null) {
          uoa = this.d;
          uoa.s.j(33, uoa.a.mEntity, uoa.r).d(new c(p0, p1)).a();
       }
       return;
    }
    public void t(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "7")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null) {
          j.n(2, p0);
       }
       PLCLogHelper k = this.d.k;
       if (k != null) {
          k.g();
       }
       return;
    }
    public void u(int p0){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "31")) {
          return;
       }
       PLCLogHelper j = this.d.j;
       if (j != null && j.g() != null) {
          this.d.j.g().c(4);
       }
       j = this.d.j;
       if (j != null) {
          j.l(p0);
       }
       if (this.a != null) {
          PLCLogHelper$a td = this.d;
          td.s.j(32, td.a.mEntity, td.r).a();
       }
       return;
    }
    public void v(){
       this.d.B = false;
    }
    public void w(int p0,int p1){
       a0.f(this, p0, p1);
    }
    public void x(int p0,int p1){
       PLCLogHelper$a uoa = PLCLogHelper$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "20")) {
          return;
       }
       k1.m(this.d.u);
       if (p0 == 2 && (this.d.l() || this.d.m())) {
          return;
       }
       uoa = this.d;
       uoa.g = true;
       PLCLogHelper k = uoa.k;
       if (k instanceof e) {
          k.q(p0, p1);
       }
       return;
    }
    public void y(PlcEntryStyleInfo p0){
       boolean b;
       PLCLogHelper pLCLogHelper = PLCLogHelper.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, PLCLogHelper$a.class, "3")) {
          return;
       }
       PLCLogHelper$a td = this.d;
       td.r = p0;
       PLCLogHelper l = td.l;
       if (l != null) {
          td.k = l.M7(td.a, td.d());
          this.d.k.f(p0);
       }
       PLCLogHelper c = this.d.c;
       if (c != null) {
          c.get().setPlcEntryStyleInfo(p0);
       }
       c = this.d.j;
       if (c != null) {
          c.t(p0);
       }
       PLCLogHelper$a td1 = this.d;
       Objects.requireNonNull(td1);
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, td1, pLCLogHelper, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          td1 = td1.i();
          b = (td1 != null && td1.needReportAdLogByPlcData())? true: false;
       }
       if (b) {
          td1 = this.d;
          Objects.requireNonNull(td1);
          if (!PatchProxy.applyVoid(objArray, td1, pLCLogHelper, "9")) {
             PlcEntryStyleInfo plcEntryStyl = td1.i();
             if (plcEntryStyl != null) {
                plcEntryStyl = plcEntryStyl.mEventTrackData;
                if (plcEntryStyl != null) {
                   PlcEntryStyleInfo$EventTrackData mAdEventTrac = plcEntryStyl.mAdEventTrackData;
                   if (mAdEventTrac != null) {
                      PlcEntryStyleInfo$AdEventTrackData mReportTrack = mAdEventTrac.mReportTrackInfoTime;
                      if (mReportTrack - null >= 0) {
                         k1.r(td1.u, (mReportTrack * 1000));
                         td1.e = SystemClock.uptimeMillis();
                         td1.f = mAdEventTrac.mReportTrackInfoTime * 1000;
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public String z(){
       return this.d.n;
    }
}
