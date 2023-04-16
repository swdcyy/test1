package com.yxcorp.gifshow.v3.editor.prettify.beauty.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.d$a;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.d$b;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.b;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.beauty.data.BeautyDataHelper;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.e;
import rsc.a;
import p0c.a;
import p0c.h;
import java.util.Objects;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kwai.video.westeros.v2.faceless.FacelessPlugin;
import q0c.y1;
import l0c.c;
import lnc.s6;
import java.util.List;
import q0c.a;
import h16.n;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.d$c;
import s0c.d;
import faa.a;
import q87.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Beauty;
import h80.c;
import h80.k;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.kuaishou.edit.draft.FeatureId;
import wba.k;
import wba.i;
import ssc.h;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import ssc.g;
import com.yxcorp.gifshow.v3.editor.prettify.beauty.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import uwc.a;
import com.yxcorp.gifshow.v3.f;
import java.util.Map;
import qsc.g;
import t36.f;
import java.lang.StringBuilder;
import java.lang.NullPointerException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Beauty$b;
import com.kuaishou.edit.draft.FeatureId$b;
import java.lang.Iterable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.log.EditFunnel;
import android.view.View;
import ekd.m1;
import naa.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.prettify.base.PrettifyBaseFragment;

public class d extends PresenterV2	// class@001155
{
    public e A;
    public View B;
    public boolean C;
    public y D;
    public final g E;
    public PublishSubject p;
    public PublishSubject q;
    public int r;
    public h s;
    public i t;
    public Set u;
    public a v;
    public c w;
    public PrettifyBaseFragment x;
    public BeautifyConfig y;
    public b z;

    public void d(boolean p0){
       super();
       this.p = PublishSubject.g();
       this.q = PublishSubject.g();
       this.r = 16;
       this.C = false;
       this.D = new d$a(this);
       this.E = new d$b(this);
       if (p0) {
          this.U7(new b());
       }else {
          this.U7(new h());
       }
       return;
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       BeautyDataHelper.d.i("Edit");
       this.u.add(this.D);
       this.A = new e();
       boolean b = a.a();
       this.C = b;
       d tA = this.A;
       b = (b || this.s.a().n())? true: false;
       Objects.requireNonNull(tA);
       e uoe = e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tA, uoe, "13")) {
          tA.g = Boolean.valueOf(b);
       }
       FacelessPlugin.init(a.b());
       if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
          this.s.a().B(y1.h().f());
          this.s.a().K(R.layout.arg_RES_7f0d0a75);
          if (s6.f()) {
             this.s.a().A(a.f());
          }else {
             this.s.a().A(a.c());
          }
          this.s.a().E(R.layout.arg_RES_7f0d119a);
          this.s.a().C(R.layout.arg_RES_7f0d0a71);
          this.s.a().P(R.layout.arg_RES_7f0d0a73);
          this.s.a().X(true);
          this.s.a().I(true);
          this.s.a().H(true);
          this.s.a().M(this.A);
          this.s.a().N(new d$c(this));
          this.s.a().L(this.C);
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "6")) {
          objArray = new Object[0];
          String str = "EditBeautyPresenterV3";
          a.D().w(str, "restoreEditBeauty", objArray);
          Beauty uBeauty = this.v.v();
          if (this.y == null) {
             this.y = (k.a() != null)? k.a().l(): new BeautifyConfig();
             if (this.C != null) {
                this.y.mId = 100;
             }
          }
          if (uBeauty != null) {
             BeautifyConfig uBeautifyCon = i.a(uBeauty, k.c(uBeauty.getFeatureId().getInternalValue()));
             if (this.C == null) {
                this.y.mId = uBeautifyCon.mId;
             }
             this.y.copyFilterValue(uBeautifyCon);
             this.y.copyConfigInfo(uBeautifyCon);
          }else {
             objArray = new Object[0];
             a.D().w(str, "has no EditBeautyDraft", objArray);
          }
          this.A.t(this.y);
          this.s.a().R(this.y);
       }
       this.z = t.fromCallable(new h(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new g(this), c.b);
       f.o0(this.E, f.h(this.t.f().q()).t0(), g.class);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       f.p0(f.h(this.t.f().q()).t0(), g.class).c(this.E);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditBeautyPresenterV3", "onUnbind", objArray);
       this.u.remove(this.D);
       d tz = this.z;
       if (tz != null && !tz.isDisposed()) {
          this.z.dispose();
       }
       this.y = null;
       return;
    }
    public void P8(){
       BeautifyConfig uBeautifyCon;
       BeautifyConfig mId;
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       String str = "EditBeautyPresenterV3";
       a.D().w(str, "restoreEditBeauty", objArray);
       Beauty uBeauty = this.v.v();
       if (uBeauty != null) {
          int internalValu = uBeauty.getFeatureId().getInternalValue();
          if (this.A.r(internalValu) == null) {
             PostUtils.D(str, "featureId = "+internalValu, new NullPointerException("getCustomConfig == null"));
          }else {
             this.y = this.A.r(internalValu);
             d tA = this.A;
             int internalValu1 = uBeauty.getFeatureId().getInternalValue();
             Objects.requireNonNull(tA);
             e uoe = e.class;
             if (PatchProxy.isSupport(uoe)) {
                Object obj = PatchProxy.applyOneRefs(Integer.valueOf(internalValu1), tA, uoe, "11");
                if (obj != PatchProxyResult.class) {
                   internalValu = obj.intValue();
                }else {
                label_0083 :
                   uoe = tA.d;
                   internalValu = (uoe != null && uoe.containsValue(Integer.valueOf(internalValu1)))? tA.d.inverse().get(Integer.valueOf(internalValu1)).intValue(): -1;
                }
             }else {
                goto label_0083 ;
             }
             uBeautifyCon = i.a(uBeauty, internalValu);
             internalValu = (this.C != null)? 100: this.y.mId;
             uBeautifyCon.mId = internalValu;
             this.y.copyFilterValue(uBeautifyCon);
             this.A.t(this.y);
          }
       }else {
          uBeautifyCon = new BeautifyConfig();
          this.y = uBeautifyCon;
          this.A.t(uBeautifyCon);
       }
       return;
    }
    public void R8(BeautifyConfig p0){
       Beauty$b uob;
       FeatureId$b uob1;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditBeautyPresenterV3", "saveEditBeauty", objArray);
       if (p0 == null) {
          return;
       }
       int i = (this.C != null)? 0x697b: this.A.s(p0);
       if (i == 0x6979) {
          this.v.d();
       }else if(this.C != null){
          uob = this.v.k().clear();
          uob1 = FeatureId.newBuilder();
          uob1.c(i);
          uob.d(uob1);
          uob.a(i.c(p0, 100, this.A.M1(p0.mId)).getItemList());
       }else {
          BeautifyConfig mId = p0.mId;
          uob = this.v.k().clear();
          uob1 = FeatureId.newBuilder();
          uob1.c(this.A.s(p0));
          uob.d(uob1);
          uob.a(i.c(p0, mId, this.A.M1(mId)).getItemList());
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.B = m1.f(p0, 0x7f0a2f73);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("ATTACH_BEAUTY_PRESENTER_PUBLISHER");
       this.q = this.r8("BEAUTY_UPDATE_PUBLISHER");
       this.r = this.r8("VIDEO_EDIT_OPERATION_PACKAGE").intValue();
       this.s = this.r8("GENERATE_FRAGMENT");
       this.t = this.r8("EDITOR_HELPER_CONTRACT");
       this.u = this.r8("EDITOR_VIEW_LISTENERS");
       this.v = this.r8("EDIT_BEAUTY");
       this.w = this.r8("WORKSPACE");
       this.x = this.t8("PRETTIFY_FRAGMENT");
       return;
    }
}
