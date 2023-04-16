package com.yxcorp.gifshow.camera.record.album.RecordAlbumActivity;
import com.yxcorp.gifshow.camera.record.album.AlbumActivityV2;
import pi9.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d16.a;
import tkd.b;
import tkd.d;
import ra0.d;
import j8c.a;
import q87.c;
import w69.i$a;
import w69.i;
import java.lang.Boolean;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import com.kuaishou.android.post.PostArguments;
import lq.i;
import com.kuaishou.android.post.BoolArg;
import com.kuaishou.android.post.PostPageArg;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import ub9.k;
import java.util.Objects;
import lnc.g7;
import ub9.m;
import java.lang.Integer;
import brd.t;
import kotlin.jvm.internal.a;
import ub9.e;
import ub9.l;
import erd.o;
import ub9.g;
import ub9.h;
import ub9.i;
import erd.g;
import crd.b;
import ub9.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import w69.d$a;
import w69.d0;
import w69.d;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import o56.c;
import o56.a;
import xf6.g;
import com.kwai.framework.abtest.f;
import sb9.b0;
import oa0.a;
import android.content.SharedPreferences;
import oe6.n;
import java.lang.StringBuilder;
import w69.k$a;
import java.lang.Number;
import ga9.c;
import com.yxcorp.gifshow.camera.record.album.a0;
import java.lang.Runnable;
import ekd.k1;
import android.content.res.Resources;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.net.Uri;
import ekd.x0;
import xkd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import om6.r;
import qm6.b$a;
import android.content.Context;
import lnc.a1;
import qm6.b;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import qb9.u;
import android.os.Parcelable;
import lnc.c7;
import lnc.d7;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import elb.y;
import elb.z;
import t45.d;
import brd.z;
import cjd.e;
import com.yxcorp.gifshow.camera.record.album.z;
import com.yxcorp.gifshow.camera.record.album.y;
import g56.a;
import com.yxcorp.gifshow.model.h;
import java.util.concurrent.ConcurrentHashMap;
import lnc.b9;
import crd.a;
import com.yxcorp.gifshow.camera.record.album.o;
import com.yxcorp.gifshow.album.IAlbumMainFragment;
import com.kwai.framework.model.user.QCurrentUser;
import kzc.d;
import u07.t$a;
import u07.f;
import sb9.m0;
import u07.u;
import u07.t;
import com.kwai.library.widget.popup.common.c;
import android.content.SharedPreferences$Editor;

public class RecordAlbumActivity extends AlbumActivityV2	// class@001cab
{
    public a r1;
    public k s1;
    public b t1;
    public static final int u1;

    public void RecordAlbumActivity(){
       super();
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, objArray, q.class, "4");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(q.a()){
          obj = d.a(0x1bf6ff1d);
          if (obj.isAvailable()) {
             Object[] objArray1 = new Object[0];
             a.D().s("SmartAlbumUtils", "getBannerExtension", objArray1);
             objArray = obj.ww();
          }
       }
       this.r1 = objArray;
       return;
    }
    public i G3(i$a p0){
       int b1;
       int i;
       k a;
       t ot;
       k ok = this;
       Object obj = p0;
       RecordAlbumActivity recordAlbumA = RecordAlbumActivity.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj1 = PatchProxy.applyOneRefs(obj, ok, recordAlbumA, "12");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (ok.r1 != null) {
          Object[] objArray = null;
          Intent obj2 = PatchProxy.apply(objArray, ok, recordAlbumA, "5");
          boolean b = true;
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else {
             obj2 = this.getIntent();
             if (obj2 != null) {
                b1 = j0.b(obj2, "camera_page_source", 0);
                if (!i.g().getHideSmartAlbumEntrance().get(Boolean.FALSE).booleanValue() && (b1 == 16 || b1 == 3)) {
                   b1 = true;
                }
             }
             b1 = false;
          }
          if (!b1) {
             String str = "album_list_column_count";
             if (PostExperimentUtils.s1()) {
                this.getIntent().putExtra("SUPPORT_CLASSIFY", b);
                obj2 = this.getIntent();
                i = (PostExperimentUtils.N0())? 3: 4;
                obj2.putExtra(str, i);
             }
             if (PostExperimentUtils.D0() && this.getIntent() != null) {
                this.getIntent().putExtra(str, PostExperimentUtils.D0());
             }
             if (PostExperimentUtils.E0() || PostExperimentUtils.F0()) {
                ok.s1 = new k(ok.P);
                if (PostExperimentUtils.E0()) {
                   recordAlbumA = ok.s1;
                   Objects.requireNonNull(recordAlbumA);
                   if (!PatchProxy.applyVoid(objArray, recordAlbumA, k.class, "1")) {
                      a = recordAlbumA.a;
                      k g = recordAlbumA.g;
                      int i1 = g7.j();
                      int i2 = 17;
                      Objects.requireNonNull(a);
                      m om = m.class;
                      if (PatchProxy.isSupport(om)) {
                         objArray = new Object[]{Integer.valueOf(b)," ",g,Integer.valueOf(i1),Integer.valueOf(i2)};
                         ot = PatchProxy.apply(objArray, a, om, "1");
                         if (ot != patchProxyRe) {
                         label_0112 :
                            recordAlbumA.b = ot.map(new g(recordAlbumA)).subscribe(h.b, i.b);
                         }
                      }
                      a.p(g, "taskId");
                      ot = a.a.a(1, " ", g, i1, 17).map(l.b);
                      a.o(ot, "apiService.getVideoTempl¡­ }\n      }\n      it\n    }");
                      goto label_0112 ;
                   }
                }
             }
             recordAlbumA = ok.s1;
             a uoa = (recordAlbumA != null)? new a(ok, recordAlbumA, ok.P): null;
             d$a uoa1 = new d$a();
             uoa1.c = ok.r1.i();
             uoa1.f = uoa;
             d uod = uoa1.c();
             if (!PatchProxy.applyVoidOneRefs(uod, obj, i$a.class, "5")) {
                a.q(uod, "<set-?>");
                obj.e = uod;
             }
             return super.G3(p0);
          }
       }
       return super.G3(p0);
    }
    public void H3(AlbumLimitOption p0){
       int i;
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordAlbumActivity.class, "15")) {
          return;
       }
       String str = "multipeoplegroup_front";
       String str1 = 5;
       if (a.a().c()) {
          i = (g.R0() < str1)? g.R0(): f.e(str);
       }else {
          i = f.e(str);
       }
       boolean b = b0.e();
       this.n1 = b;
       if (b) {
          b = true;
          p0.A(b);
          int intx = a.a.getInt("single_multi_select_switch", 0);
          if (intx == str1 || intx == 6) {
             if (intx != str1) {
                b = false;
             }
             this.k1 = b;
             objArray = new Object[0];
             a.D().w("RecordAlbumActivity", "reuse mode, mSingleSelect = "+this.k1, objArray);
          }else if(i != b){
             if (i != 2) {
                if (i != 3) {
                   if (i == 4) {
                      this.k1 = n.b().getBoolean("isLowActiveUser", 0);
                   }
                }else {
                   this.k1 = false;
                }
             }else {
                this.k1 = b;
             }
          }else {
             this.k1 = n.b().getBoolean("isLastPhotoSingleSelectMode", 0);
          }
          if (this.k1 == null) {
             str1 = 6;
          }
          a.z1(str1);
       }else {
          this.k1 = false;
          Object[] objArray1 = new Object[0];
          a.D().w("RecordAlbumActivity", "disable singleSelect", objArray1);
       }
       objArray = new Object[0];
       a.D().w("RecordAlbumActivity", "mSingleSelect="+this.k1, objArray);
       p0.N(this.k1);
       return;
    }
    public void I3(k$a p0){
       boolean b1;
       int i1;
       boolean b2;
       RecordAlbumActivity recordAlbumA = RecordAlbumActivity.class;
       b0 uob0 = b0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, recordAlbumA, "13")) {
          return;
       }
       boolean b = false;
       if (PostExperimentUtils.e()) {
          p0.n(b);
       }
       p0.f0 = PostExperimentUtils.C0();
       p0.g0 = f.a("detailpagebubbleupdate");
       Object obj = PatchProxy.apply(null, null, uob0, "8");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(PostExperimentUtils.x0()){
          b1 = true;
       }else {
          b1 = false;
       }
       p0.b0 = b1;
       obj = PatchProxy.apply(null, null, uob0, "10");
       int i = 2;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(PostExperimentUtils.x0() != i && PostExperimentUtils.x0() != 3){
          b1 = true;
       }else {
          b1 = false;
       }
       p0.q(b1);
       Object obj1 = PatchProxy.apply(null, null, uob0, "9");
       if (obj1 != PatchProxyResult.class) {
          i1 = obj1.intValue();
       }else {
          i1 = PostExperimentUtils.x0();
          if (i1 != 1) {
             if (i1 != i) {
                i1 = 0;
             }
          }else {
             i = 1;
          }
          i1 = i;
       }
       p0.c0 = i1;
       Intent obj2 = PatchProxy.apply(null, this, recordAlbumA, "6");
       if (obj2 != PatchProxyResult.class) {
          b = obj2.booleanValue();
       }else {
          obj2 = this.getIntent();
          if (obj2 != null && j0.b(obj2, "camera_page_source", b) != 3) {
             if (a.a().c()) {
                if (!g.h()) {
                   b2 = f.a("videopublishfast");
                }else if(g.h() != 1){
                   b2 = true;
                }else {
                   b2 = false;
                }
             }else {
                b2 = f.a("videopublishfast");
             }
             if (b2) {
                b = true;
             }
          }
       }
       p0.i0 = b;
       return;
    }
    public void J3(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordAlbumActivity.class, "14")) {
          return;
       }
       super.J3(p0);
       b0.b(p0);
       return;
    }
    public a O3(){
       return this.r1;
    }
    public void Z(){
       if (PatchProxy.applyVoid(null, this, RecordAlbumActivity.class, "11")) {
          return;
       }
       super.Z();
       k1.r(a0.b, 1000);
       return;
    }
    public void finish(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecordAlbumActivity.class, "9")) {
          return;
       }
       RecordAlbumActivity tr1 = this.r1;
       if (!PatchProxy.applyVoidOneRefs(tr1, objArray, q.class, "7") && (q.a() && tr1 != null)) {
          Object[] objArray1 = new Object[0];
          a.D().s("SmartAlbumUtils", "finishAlbumExtension", objArray1);
          tr1.onFinish();
       }
    label_0032 :
       super.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, RecordAlbumActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       Intent intent1;
       RecordAlbumActivity recordAlbumA = RecordAlbumActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, recordAlbumA, "1")) {
          return;
       }
       boolean b = true;
       this.U0 = b;
       if (!PatchProxy.applyVoid(null, this, recordAlbumA, "3") && (this.getIntent() != null && this.getIntent().getData() != null)) {
          Uri data = this.getIntent().getData();
          if (data != null && (data.isHierarchical() && ("recordalbum").equals(data.getHost()))) {
             Intent intent = this.getIntent();
             Boolean.parseBoolean(x0.b(data, "enableMultiSelect", "true"));
             intent.putExtra("albumEnablePreviewNextStep", Boolean.parseBoolean(x0.b(data, "albumEnablePreviewNextStep", "true")));
             Uri uri = b.g(x0.b(data, "backAction", null));
             if (uri != null) {
                if (TextUtils.n(uri.getHost(), "post")) {
                   intent1 = PatchProxy.applyOneRefs(uri, this, recordAlbumA, "4");
                   if (intent1 != PatchProxyResult.class) {
                   }else {
                      intent1 = d.a(-831446984).NM(new b$a(a1.c(), 0).B(uri).x(b).b0(b).c0(b).m(b).f());
                      u.b(intent1);
                      intent1.setData(null);
                   }
                }else {
                   intent1 = new Intent("android.intent.action.VIEW", uri);
                }
                intent1.putExtra("start_enter_page_animation", 0);
                intent1.putExtra("start_exit_page_animation", 0);
                intent.putExtra("activityCloseEnterAnimation", R.anim.arg_RES_7f01010d);
             }
             c7.a.c(data, intent);
             d7.a.h(intent);
          }
       }
    label_00e4 :
       super.onCreate(p0);
       if (this.isFinishing()) {
          return;
       }else {
          PageMonitor.INSTANCE.registerPageInfo(this, this.o());
          if (!PatchProxy.applyVoid(null, this, recordAlbumA, "2")) {
             this.t1 = y.b.a().a().subscribeOn(d.c).observeOn(d.a).map(new e()).subscribe(z.b, y.b);
          }
          return;
       }
    }
    public void onDestroy(){
       q oq = q.class;
       if (PatchProxy.applyVoid(null, this, RecordAlbumActivity.class, "10")) {
          return;
       }
       super.onDestroy();
       String str = "3";
       int i = 0;
       if (!PatchProxy.applyVoid(null, null, oq, str) && (q.a() || PostExperimentUtils.s1())) {
          d.a(0x1bf6ff1d).P2();
          Object[] objArray1 = new Object[i];
          a.D().s("SmartAlbumUtils", "stopAlbumGeneration", objArray1);
       }
       RecordAlbumActivity tr1 = this.r1;
       if (!PatchProxy.applyVoidOneRefs(tr1, null, oq, "6") && (q.a() && tr1 != null)) {
          Object[] objArray = new Object[i];
          a.D().s("SmartAlbumUtils", "clearAlbumExtension", objArray);
          tr1.clear();
       }
    label_0061 :
       this.r1 = null;
       a.c().b();
       h oh = h.a();
       Objects.requireNonNull(oh);
       if (!PatchProxy.applyVoid(null, oh, h.class, str)) {
          oh.a.clear();
          b9.a(oh.c);
          oh.c = new a();
       }
       o.g2();
       b9.a(this.t1);
       return;
    }
    public void onResume(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecordAlbumActivity recordAlbumA = RecordAlbumActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, recordAlbumA, "7")) {
          return;
       }
       super.onResume();
       boolean b = true;
       if (!PostExperimentUtils.s1()) {
          Object obj = PatchProxy.apply(objArray, objArray, b0.class, "6");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(PostExperimentUtils.x0() == 2){
             b1 = true;
          }else {
             b1 = false;
          }
          if (!b1) {
             d.a(0x1bf6ff1d).Kq(this.O);
          }else if(PostExperimentUtils.s1()){
             this.O.R4((QCurrentUser.ME.isDisableSmartAlbumTabs() ^ b));
          }
       }else {
          goto label_0045 ;
       }
       String obj1 = PatchProxy.apply(objArray, this, recordAlbumA, "8");
       if (obj1 != patchProxyRe) {
          b2 = obj1.booleanValue();
       }else if(this.R3() && (this.m1 != null && (this.P3() && this.l1 == null))){
          obj1 = "backnotice";
          if (a.a().c()) {
             if (g.t0() == 2) {
                b2 = f.a(obj1);
             }else if(g.t0() == b){
                b2 = true;
             }else {
                b2 = false;
             }
          }else {
             b2 = f.a(obj1);
          }
          if (b2 && n.b().getBoolean("SINGLE_MULTI_DIALOG_BACK", b)) {
          label_00b1 :
             b2 = b;
          }
       }
    label_00b0 :
       b = 0;
       goto label_00b1 ;
       if (b2) {
          d uod = f.e(new d(this));
          uod.y0(R.string.arg_RES_7f1018a8);
          uod.S0(R.string.arg_RES_7f103ac5);
          uod.Q0(R.string.arg_RES_7f104b7d);
          uod.u0(new m0(this));
          uod.b0().Z();
          n.b().edit().putBoolean("SINGLE_MULTI_DIALOG_BACK", false);
       }
       return;
    }
}
