package com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sLandscapeOptConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$f;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$h;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$e;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$j;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$n;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$l;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$m;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$g;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$i;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sEnableCoronaDetailPresenterUp$2;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sEnableCoronaDetailPlayerUp$2;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$b;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$k;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$d;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$c;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sEnableShieldSearchApp$2;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sLandscapeFpsMonitorDuration$2;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$a;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$coronaWaitPreLoadRecoTime$2;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$enableRecoApiSplit$2;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$disablePlayTimeReport$2;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sLandscapeStageLoadTime$2;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sLandscapeUndispatchConfig$2;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sLandscapeScatterPostConfig$2;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt$sCoronaTvLiveBigCardPortraitClipCoordinateY$2;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.corona.CoronaApiExperimentUtil;
import pi5.e;
import ih5.z;
import rq9.b;
import com.yxcorp.gifshow.entity.QPhoto;
import gm5.b;
import xq9.a;
import xq9.a$a;
import uq9.f;
import uq9.m;
import android.os.Build$VERSION;
import pm9.b;
import android.app.Activity;
import fm5.a;
import bm5.g;
import bm5.g$b;
import com.kwai.framework.abtest.f;
import java.lang.Long;
import java.lang.Double;

public final class CoronaExperimentUtilKt	// class@0011e9
{
    public static final CoronaExperimentUtilKt A;
    public static final p a;
    public static final x b;
    public static final x c;
    public static final x d;
    public static final x e;
    public static final x f;
    public static final x g;
    public static final x h;
    public static final x i;
    public static final x j;
    public static final p k;
    public static final p l;
    public static final x m;
    public static final x n;
    public static final x o;
    public static final x p;
    public static final p q;
    public static final p r;
    public static final x s;
    public static final p t;
    public static final p u;
    public static final p v;
    public static final p w;
    public static final p x;
    public static final p y;
    public static final p z;

    static {
       CoronaExperimentUtilKt.A = new CoronaExperimentUtilKt();
       CoronaExperimentUtilKt.a = s.c(CoronaExperimentUtilKt$sLandscapeOptConfig$2.INSTANCE);
       CoronaExperimentUtilKt.b = Suppliers.a(CoronaExperimentUtilKt$f.b);
       CoronaExperimentUtilKt.c = Suppliers.a(CoronaExperimentUtilKt$h.b);
       CoronaExperimentUtilKt.d = Suppliers.a(CoronaExperimentUtilKt$e.b);
       CoronaExperimentUtilKt.e = Suppliers.a(CoronaExperimentUtilKt$j.b);
       CoronaExperimentUtilKt.f = Suppliers.a(CoronaExperimentUtilKt$n.b);
       CoronaExperimentUtilKt.g = Suppliers.a(CoronaExperimentUtilKt$l.b);
       CoronaExperimentUtilKt.h = Suppliers.a(CoronaExperimentUtilKt$m.b);
       CoronaExperimentUtilKt.i = Suppliers.a(CoronaExperimentUtilKt$g.b);
       CoronaExperimentUtilKt.j = Suppliers.a(CoronaExperimentUtilKt$i.b);
       CoronaExperimentUtilKt.k = s.c(CoronaExperimentUtilKt$sEnableCoronaDetailPresenterUp$2.INSTANCE);
       CoronaExperimentUtilKt.l = s.c(CoronaExperimentUtilKt$sEnableCoronaDetailPlayerUp$2.INSTANCE);
       CoronaExperimentUtilKt.m = Suppliers.a(CoronaExperimentUtilKt$b.b);
       CoronaExperimentUtilKt.n = Suppliers.a(CoronaExperimentUtilKt$k.b);
       CoronaExperimentUtilKt.o = Suppliers.a(CoronaExperimentUtilKt$d.b);
       CoronaExperimentUtilKt.p = Suppliers.a(CoronaExperimentUtilKt$c.b);
       CoronaExperimentUtilKt.q = s.c(CoronaExperimentUtilKt$sEnableShieldSearchApp$2.INSTANCE);
       CoronaExperimentUtilKt.r = s.c(CoronaExperimentUtilKt$sLandscapeFpsMonitorDuration$2.INSTANCE);
       CoronaExperimentUtilKt.s = Suppliers.a(CoronaExperimentUtilKt$a.b);
       CoronaExperimentUtilKt.t = s.c(CoronaExperimentUtilKt$coronaWaitPreLoadRecoTime$2.INSTANCE);
       CoronaExperimentUtilKt.u = s.c(CoronaExperimentUtilKt$enableRecoApiSplit$2.INSTANCE);
       CoronaExperimentUtilKt.v = s.c(CoronaExperimentUtilKt$disablePlayTimeReport$2.INSTANCE);
       CoronaExperimentUtilKt.w = s.c(CoronaExperimentUtilKt$sLandscapeStageLoadTime$2.INSTANCE);
       CoronaExperimentUtilKt.x = s.c(CoronaExperimentUtilKt$sLandscapeUndispatchConfig$2.INSTANCE);
       CoronaExperimentUtilKt.y = s.c(CoronaExperimentUtilKt$sLandscapeScatterPostConfig$2.INSTANCE);
       CoronaExperimentUtilKt.z = s.c(CoronaExperimentUtilKt$sCoronaTvLiveBigCardPortraitClipCoordinateY$2.INSTANCE);
    }
    public void CoronaExperimentUtilKt(){
       super();
    }
    public static final long E(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CoronaExperimentUtilKt uCoronaExper = CoronaExperimentUtilKt.class;
       Object[] objArray = null;
       CoronaExperimentUtilKt obj = PatchProxy.apply(objArray, objArray, uCoronaExper, "33");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       obj = CoronaExperimentUtilKt.A;
       Objects.requireNonNull(obj);
       Number number = PatchProxy.apply(objArray, obj, uCoronaExper, "32");
       if (number == patchProxyRe) {
          number = CoronaExperimentUtilKt.r.getValue();
       }
       return (number.longValue() * 1000);
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, CoronaExperimentUtilKt.class, "24");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.m.get();
          a.o(obj, "sCoronaTvDetailAsyncView.get\(\)");
       }
       return obj.booleanValue();
    }
    public static final boolean c(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CoronaExperimentUtilKt uCoronaExper = CoronaExperimentUtilKt.class;
       CoronaExperimentUtilKt obj = PatchProxy.apply(null, null, uCoronaExper, "23");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (CoronaExperimentUtilKt.d()) {
          obj = CoronaExperimentUtilKt.A;
          Objects.requireNonNull(obj);
          Boolean uBoolean = PatchProxy.apply(null, obj, uCoronaExper, "22");
          if (uBoolean == patchProxyRe) {
             uBoolean = CoronaExperimentUtilKt.l.getValue();
          }
          if (uBoolean.booleanValue()) {
             b = true;
          label_0039 :
             return b;
          }
       }
       b = false;
       goto label_0039 ;
    }
    public static final boolean d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CoronaExperimentUtilKt uCoronaExper = CoronaExperimentUtilKt.class;
       CoronaExperimentUtilKt obj = PatchProxy.apply(null, null, uCoronaExper, "21");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = CoronaExperimentUtilKt.A;
       Objects.requireNonNull(obj);
       Boolean uBoolean = PatchProxy.apply(null, obj, uCoronaExper, "20");
       if (uBoolean == patchProxyRe) {
          uBoolean = CoronaExperimentUtilKt.k.getValue();
       }
       return uBoolean.booleanValue();
    }
    public static final boolean i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CoronaApiExperimentUtil obj = PatchProxy.apply(objArray, objArray, CoronaExperimentUtilKt.class, "34");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = CoronaApiExperimentUtil.d;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, CoronaApiExperimentUtil.class, "5");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.c().mEnableLandscapeAsyncInflate;
       return b;
    }
    public static final boolean j(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CoronaApiExperimentUtil obj = PatchProxy.apply(objArray, objArray, CoronaExperimentUtilKt.class, "35");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = CoronaApiExperimentUtil.d;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, CoronaApiExperimentUtil.class, "6");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.c().mEnableLandscapeCostOpt;
       return b;
    }
    public static final boolean o(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CoronaApiExperimentUtil obj = PatchProxy.apply(objArray, objArray, CoronaExperimentUtilKt.class, "31");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = CoronaApiExperimentUtil.d;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, CoronaApiExperimentUtil.class, "7");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.c().mEnableLandscapeDispatch;
       return b;
    }
    public static final boolean q(){
       Object obj = PatchProxy.apply(null, null, CoronaExperimentUtilKt.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return CoronaExperimentUtilKt.A.I().mLandscapeRotateCaptureImage;
    }
    public final long A(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "28");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.p.get();
          a.o(obj, "sCoronaTvTabPreloadPageListValidTime.get\(\)");
       }
       return obj.longValue();
    }
    public final long B(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "38");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.t.getValue();
       }
       return obj.longValue();
    }
    public final boolean C(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "41");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.v.getValue();
       }
       return obj.booleanValue();
    }
    public final boolean D(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "40");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.u.getValue();
       }
       return obj.booleanValue();
    }
    public final z F(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CoronaExperimentUtilKt uCoronaExper = CoronaExperimentUtilKt.class;
       Object obj = PatchProxy.apply(null, this, uCoronaExper, "47");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uCoronaExper, "46");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = CoronaExperimentUtilKt.y.getValue();
       }
       return obj1;
    }
    public final long G(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CoronaExperimentUtilKt uCoronaExper = CoronaExperimentUtilKt.class;
       Object obj = PatchProxy.apply(null, this, uCoronaExper, "43");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       Number number = PatchProxy.apply(null, this, uCoronaExper, "42");
       if (number == patchProxyRe) {
          number = CoronaExperimentUtilKt.w.getValue();
       }
       return number.longValue();
    }
    public final b H(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CoronaExperimentUtilKt uCoronaExper = CoronaExperimentUtilKt.class;
       Object obj = PatchProxy.apply(null, this, uCoronaExper, "45");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, uCoronaExper, "44");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = CoronaExperimentUtilKt.x.getValue();
       }
       return obj1;
    }
    public final e I(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CoronaExperimentUtilKt.a.getValue();
    }
    public final boolean J(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CoronaExperimentUtilKt uCoronaExper = CoronaExperimentUtilKt.class;
       Object obj = PatchProxy.apply(null, this, uCoronaExper, "30");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Number number = PatchProxy.apply(null, this, uCoronaExper, "29");
       if (number == patchProxyRe) {
          number = CoronaExperimentUtilKt.q.getValue();
       }
       boolean b = true;
       if (number.intValue() != b) {
          b = false;
       }
       return b;
    }
    public final long K(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "17");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.h.get();
          a.o(obj, "sTvTabPageListPreloadInterval.get\(\)");
       }
       return obj.longValue();
    }
    public final int L(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "26");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.o.get();
          a.o(obj, "sCoronaTvTabPreloadSegCnt.get\(\)");
       }
       return obj.intValue();
    }
    public final boolean M(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaExperimentUtilKt.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "qPhoto");
       boolean b = false;
       if (this.g()) {
          return b;
       }
       if (b.t(p0) && !b.r()) {
          return b;
       }
       if (a.a.a(p0)) {
          return b;
       }
       if (f.v(p0) && !m.G(p0)) {
          return b;
       }
       if (!f.s(p0) || m.F(p0)) {
          b = true;
       }
       return b;
    }
    public final boolean N(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaExperimentUtilKt.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "qPhoto");
       if (this.g()) {
          return false;
       }
       return (this.M(p0) ^ 0x01);
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.I().mLandscapeUiDisableScatter;
    }
    public final boolean e(){
       boolean b = (Build$VERSION.SDK_INT > 21)? true: false;
       return b;
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "10");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.b.get();
          a.o(obj, "sEnableInstreamAd.get\(\)");
       }
       return obj.booleanValue();
    }
    public final boolean g(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.j();
    }
    public final boolean h(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "11");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.d.get();
          a.o(obj, "sEnableDetailEpisodePreload.get\(\)");
       }
       return obj.booleanValue();
    }
    public final boolean k(QPhoto p0,Activity p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CoronaExperimentUtilKt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "qPhoto");
       boolean b = false;
       if (this.n(p1)) {
          return b;
       }
       if (b.t(p0) && !b.r()) {
          return b;
       }
       if (a.A(p0) && !a.w(p0)) {
          return b;
       }
       if (f.v(p0) && !m.G(p0)) {
          return b;
       }
       if (!f.s(p0) || m.F(p0)) {
          b = true;
       }
       return b;
    }
    public final boolean l(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CoronaApiExperimentUtil obj = PatchProxy.apply(objArray, this, CoronaExperimentUtilKt.class, "36");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = CoronaApiExperimentUtil.d;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, CoronaApiExperimentUtil.class, "2");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.c().mEnableLandOrientationOpt;
       return b;
    }
    public final boolean m(QPhoto p0,Activity p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, CoronaExperimentUtilKt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "qPhoto");
       boolean b = (!this.n(p1) && !this.k(p0, p1))? true: false;
       return b;
    }
    public final boolean n(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CoronaExperimentUtilKt.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!g.R.c(p0).M())? true: b.j();
       return b;
    }
    public final boolean p(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CoronaApiExperimentUtil obj = PatchProxy.apply(objArray, this, CoronaExperimentUtilKt.class, "27");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = CoronaApiExperimentUtil.d;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, CoronaApiExperimentUtil.class, "3");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.c().mEnableLandPresenterStageLoad;
       return b;
    }
    public final boolean r(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (f.e("PanoramicSound") != b) {
          b = false;
       }
       return b;
    }
    public final boolean s(){
       Long obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = CoronaExperimentUtilKt.e.get();
       boolean b = (obj != null && !obj.longValue() - 1)? true: false;
       return b;
    }
    public final boolean t(){
       Long obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = CoronaExperimentUtilKt.e.get();
       boolean b = (obj != null && !obj.longValue() - 2)? true: false;
       return b;
    }
    public final boolean u(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "18");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.i.get();
          a.o(obj, "sEnableTvLandscapePreload.get\(\)");
       }
       return obj.booleanValue();
    }
    public final boolean v(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "19");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.j.get();
          a.o(obj, "sEnableTvResponseCache.get\(\)");
       }
       return obj.booleanValue();
    }
    public final boolean w(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "15");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.g.get();
          a.o(obj, "sTvTabEnablePreloadPageList.get\(\)");
       }
       return obj.booleanValue();
    }
    public final boolean x(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "14");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.f.get();
          a.o(obj, "sTvTabViewPreload.get\(\)");
       }
       return obj.booleanValue();
    }
    public final boolean y(){
       Object obj = PatchProxy.apply(null, this, CoronaExperimentUtilKt.class, "37");
       if (obj == PatchProxyResult.class) {
          obj = CoronaExperimentUtilKt.s.get();
          a.o(obj, "sCoronaBigCardPreLoadReco.get\(\)");
       }
       return obj.booleanValue();
    }
    public final double z(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CoronaExperimentUtilKt uCoronaExper = CoronaExperimentUtilKt.class;
       Object obj = PatchProxy.apply(null, this, uCoronaExper, "50");
       if (obj != patchProxyRe) {
          return obj.doubleValue();
       }
       Object obj1 = PatchProxy.apply(null, this, uCoronaExper, "49");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = CoronaExperimentUtilKt.z.getValue();
       }
       a.o(obj1, "sCoronaTvLiveBigCardPortraitClipCoordinateY");
       return obj1.doubleValue();
    }
}
