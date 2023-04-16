package com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter$a;
import f4a.b0;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
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
import o4a.u;
import erd.g;
import o4a.t;
import java.lang.Integer;
import j4a.a;
import tkd.b;
import tkd.d;
import nl9.u;
import f4a.a0;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import mxb.j;
import com.yxcorp.gifshow.detail.plc.helper.PlcStyleChangeType;
import o4a.v;
import androidx.fragment.app.Fragment;
import k2b.n;
import o4a.w;
import i4a.e;
import o4a.s;
import h4a.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import android.os.SystemClock;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class PlcEntryLoggerImplPresenter$a implements b0	// class@001694
{
    public PlcEntryStyleInfo$PageType a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final PlcEntryLoggerImplPresenter f;

    public void PlcEntryLoggerImplPresenter$a(PlcEntryLoggerImplPresenter p0){
       this.f = p0;
       super();
       this.a = PlcEntryStyleInfo$PageType.UNKNOWN;
       this.d = true;
       this.e = false;
    }
    public void A(long p0,long p1){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa, "21")) {
          return;
       }
       if (this.f.z.g() != null) {
          this.f.z.g().c(3);
       }
       this.f.z.r(1);
       if (this.d != null) {
          uoa = this.f;
          uoa.D.j(31, uoa.p.mEntity, uoa.C).d(new u(p0, p1)).a();
       }
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter$a.class, "22")) {
          return;
       }
       if (this.e != null) {
          PlcEntryLoggerImplPresenter$a tf = this.f;
          tf.D.j(37, tf.p.mEntity, tf.C).a();
       }
       return;
    }
    public void C(long p0,long p1){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa, "20")) {
          return;
       }
       if (this.f.z.g() != null) {
          this.f.z.g().c(1);
       }
       if (this.d != null) {
          uoa = this.f;
          uoa.D.j(34, uoa.p.mEntity, uoa.C).d(new t(p0, p1)).a();
       }
       return;
    }
    public void D(int p0,int p1){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "12")) {
          return;
       }
       this.f.z.p(1, p0, p1);
       PlcEntryLoggerImplPresenter y = this.f.y;
       if (y != null) {
          y.j();
       }
       return;
    }
    public void E(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcEntryLoggerImplPresenter$a.class, "25")) {
          return;
       }
       PlcEntryLoggerImplPresenter$a tf = this.f;
       d.a(-1694791652).Kh(tf.p.mEntity, tf.C, p0);
       return;
    }
    public void F(int p0){
       a0.g(this, p0);
    }
    public void G(int p0,PlcEntryStyleInfo$TagPackage p1){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "13")) {
          return;
       }
       this.f.z.s(p0, p1);
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter$a.class, "3")) {
          return;
       }
       PlcEntryLoggerImplPresenter y = this.f.y;
       if (y != null) {
          Objects.requireNonNull(y);
       }
       return;
    }
    public void I(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter$a.class, "16")) {
          return;
       }
       this.f.z.o(1);
       PlcEntryLoggerImplPresenter y = this.f.y;
       if (y != null) {
          y.k();
       }
       PlcEntryLoggerImplPresenter$a tf = this.f;
       tf.w = 0;
       k1.m(tf.F);
       return;
    }
    public void J(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter$a.class, "5")) {
          return;
       }
       PlcEntryLoggerImplPresenter y = this.f.y;
       if (y != null) {
          Objects.requireNonNull(y);
       }
       return;
    }
    public void K(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter$a.class, "26")) {
          return;
       }
       PlcEntryLoggerImplPresenter$a tf = this.f;
       tf.w = 0;
       k1.m(tf.F);
       return;
    }
    public void L(int p0){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "17")) {
          return;
       }
       if (this.f.z.g() != null) {
          this.f.z.g().c(p0);
       }
       return;
    }
    public void M(){
       this.b = false;
    }
    public void N(int p0){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "11")) {
          return;
       }
       this.f.z.m(1, p0);
       PlcEntryLoggerImplPresenter y = this.f.y;
       if (y != null) {
          Objects.requireNonNull(y);
       }
       return;
    }
    public void O(PlcEntryStyleInfo$PageType p0){
       this.a = p0;
    }
    public void P(int p0){
       a0.i(this, p0);
    }
    public void Q(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter$a.class, "15")) {
          return;
       }
       this.f.z.o(2);
       PlcEntryLoggerImplPresenter y = this.f.y;
       if (y != null) {
          y.h();
       }
       PlcEntryLoggerImplPresenter$a tf = this.f;
       tf.w = 0;
       k1.m(tf.F);
       return;
    }
    public void a(int p0){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "10")) {
          return;
       }
       this.f.z.n(1, p0);
       PlcEntryLoggerImplPresenter y = this.f.y;
       if (y != null) {
          y.j();
       }
       return;
    }
    public void b(int p0,int p1){
       a0.k(this, p0, p1);
    }
    public void c(int p0){
       a0.h(this, p0);
    }
    public void d(int p0){
       a0.b(this, p0);
    }
    public void e(boolean p0){
       this.e = p0;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PlcEntryLoggerImplPresenter$a.class, "18")) {
          return;
       }
       if (this.f.z.g() != null) {
          this.f.z.g().c(1);
       }
       if (this.d != null) {
          PlcEntryLoggerImplPresenter$a tf = this.f;
          PlcEntryLoggerImplPresenter d = tf.D;
          Objects.requireNonNull(tf);
          j oj = PatchProxy.apply(objArray, tf, PlcEntryLoggerImplPresenter.class, "14");
          if (oj != PatchProxyResult.class) {
          }else {
             oj = tf.D.x(tf.p.mEntity, tf.C);
          }
          d.b(oj, 30);
       }
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcEntryLoggerImplPresenter$a.class, "24")) {
          return;
       }
       PlcEntryLoggerImplPresenter$a tf = this.f;
       d.a(-1694791652).uB(tf.p.mEntity, tf.C, p0);
       return;
    }
    public void h(boolean p0){
       this.d = p0;
    }
    public void i(PlcStyleChangeType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcEntryLoggerImplPresenter$a.class, "27")) {
          return;
       }
       this.f.z.w(p0);
       return;
    }
    public void j(int p0){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       PlcEntryLoggerImplPresenter z = this.f.z;
       if (z != null) {
          z.v(p0);
       }
       z = this.f.y;
       if (z != null) {
          z.m(p0);
       }
       return;
    }
    public void k(int p0){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "6")) {
          return;
       }
       if (this.c == null) {
          this.c = true;
          n.a(this.f.r, new v(this, p0));
          PlcEntryLoggerImplPresenter y = this.f.y;
          if (y != null) {
             y.i();
          }
       }
       return;
    }
    public void l(int p0){
       a0.j(this, p0);
    }
    public void m(int p0){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "7")) {
          return;
       }
       if (this.b == null) {
          this.b = true;
          n.a(this.f.r, new w(this, p0));
          PlcEntryLoggerImplPresenter y = this.f.y;
          if (y != null) {
             y.l();
          }
       }
       return;
    }
    public void n(int p0,int p1){
       a0.c(this, p0, p1);
    }
    public void o(int p0,int p1){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "14")) {
          return;
       }
       k1.m(this.f.F);
       if (p0 == 2 && (this.f.V8() || this.f.W8())) {
          return;
       }
       PlcEntryLoggerImplPresenter y = this.f.y;
       if (y != null && y instanceof e) {
          y.r(p0, p1);
       }
       p0.x = true;
       return;
    }
    public void p(int p0){
       a0.l(this, p0);
    }
    public void q(int p0){
       a0.d(this, p0);
    }
    public void r(int p0){
       a0.e(this, p0);
    }
    public void s(long p0,long p1){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa, "19")) {
          return;
       }
       if (this.f.z.g() != null) {
          this.f.z.g().c(2);
       }
       if (this.d != null) {
          uoa = this.f;
          uoa.D.j(33, uoa.p.mEntity, uoa.C).d(new s(p0, p1)).a();
       }
       return;
    }
    public void t(int p0){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "8")) {
          return;
       }
       this.f.z.n(2, p0);
       PlcEntryLoggerImplPresenter y = this.f.y;
       if (y != null) {
          y.g();
       }
       return;
    }
    public void u(int p0){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "23")) {
          return;
       }
       if (this.f.z.g() != null) {
          this.f.z.g().c(4);
       }
       this.f.z.l(p0);
       if (this.d != null) {
          PlcEntryLoggerImplPresenter$a tf = this.f;
          tf.D.j(32, tf.p.mEntity, tf.C).a();
       }
       return;
    }
    public void v(){
       this.c = false;
    }
    public void w(int p0,int p1){
       a0.f(this, p0, p1);
    }
    public void x(int p0,int p1){
       PlcEntryLoggerImplPresenter$a uoa = PlcEntryLoggerImplPresenter$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "9")) {
          return;
       }
       k1.m(this.f.F);
       if (p0 == 2 && (this.f.V8() || this.f.W8())) {
          return;
       }
       uoa = this.f;
       uoa.x = true;
       PlcEntryLoggerImplPresenter y = uoa.y;
       if (y != null && y instanceof e) {
          y.q(p0, p1);
       }
       return;
    }
    public void y(PlcEntryStyleInfo p0){
       boolean b;
       PlcEntryLoggerImplPresenter plcEntryLogg = PlcEntryLoggerImplPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcEntryLoggerImplPresenter$a.class, "4")) {
          return;
       }
       PlcEntryLoggerImplPresenter$a tf = this.f;
       tf.C = p0;
       PlcEntryLoggerImplPresenter$a tf1 = this.f;
       tf.y = d.a(0x10c9d447).M7(tf1.p, tf1.R8());
       this.f.y.f(p0);
       this.f.s.setPlcEntryStyleInfo(p0);
       this.f.z.t(p0);
       PlcEntryLoggerImplPresenter$a tf2 = this.f;
       Objects.requireNonNull(tf2);
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, tf2, plcEntryLogg, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          tf2 = tf2.S8();
          b = (tf2 != null && tf2.needReportAdLogByPlcData())? true: false;
       }
       if (b) {
          tf2 = this.f;
          Objects.requireNonNull(tf2);
          if (!PatchProxy.applyVoid(objArray, tf2, plcEntryLogg, "11")) {
             PlcEntryStyleInfo plcEntryStyl = tf2.S8();
             if (plcEntryStyl != null) {
                plcEntryStyl = plcEntryStyl.mEventTrackData;
                if (plcEntryStyl != null) {
                   PlcEntryStyleInfo$EventTrackData mAdEventTrac = plcEntryStyl.mAdEventTrackData;
                   if (mAdEventTrac != null) {
                      PlcEntryStyleInfo$AdEventTrackData mReportTrack = mAdEventTrac.mReportTrackInfoTime;
                      if (mReportTrack - null >= 0) {
                         k1.r(tf2.F, (mReportTrack * 1000));
                         tf2.v = SystemClock.uptimeMillis();
                         tf2.w = mAdEventTrac.mReportTrackInfoTime * 1000;
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public String z(){
       PlcEntryLoggerImplPresenter obj = PatchProxy.apply(null, this, PlcEntryLoggerImplPresenter$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f.r;
       if (obj != null) {
          return obj.o();
       }
       return a0.a(this);
    }
}
