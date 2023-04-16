package com.yxcorp.gifshow.v3.editor.prettify.filter.i;
import o0c.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.prettify.filter.i$e;
import com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.prettify.filter.i$a;
import com.yxcorp.gifshow.v3.editor.prettify.filter.i$b;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import com.yxcorp.gifshow.v3.editor.prettify.filter.e;
import java.lang.Runnable;
import t45.c;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import p0c.c;
import p0c.h;
import d1c.e;
import com.yxcorp.gifshow.v3.editor.prettify.filter.a;
import com.yxcorp.gifshow.prettify.filter.repo.a;
import n0c.c;
import com.yxcorp.gifshow.v3.editor.prettify.filter.c;
import com.yxcorp.gifshow.v3.editor.prettify.filter.i$d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Source;
import java.lang.Enum;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import java.util.List;
import wba.z;
import com.yxcorp.gifshow.v3.editor.prettify.filter.g;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import d1c.c;
import com.yxcorp.gifshow.v3.editor.prettify.filter.k;
import com.yxcorp.gifshow.v3.editor.prettify.filter.n;
import usc.n;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import usc.k;
import pkd.a;
import com.yxcorp.gifshow.record.album.b;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.GestureDetector;
import usc.m;
import android.view.GestureDetector$OnGestureListener;
import usc.g;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import usc.h;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Theme;
import com.kuaishou.edit.draft.ColorFilter;
import usc.j;
import com.yxcorp.gifshow.v3.editor.prettify.filter.h;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import usc.l;
import com.yxcorp.gifshow.v3.editor.prettify.filter.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import uwc.a;
import java.util.Map;
import qsc.g;
import t36.f;
import lnc.b9;
import voc.o;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import k2b.s$b;
import androidx.recyclerview.widget.RecyclerView;
import o0c.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate$ShowLoggerType;
import java.lang.Boolean;
import com.yxcorp.gifshow.prettify.v4.magic.filter.InternalFilterInfo;
import usc.p;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.edit.draft.ColorFilter$b;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.yxcorp.gifshow.util.AdvEditUtil;
import com.google.protobuf.GeneratedMessageLite$Builder;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.yxcorp.gifshow.v3.editor.prettify.filter.i$c;
import android.animation.Animator$AnimatorListener;
import usc.i;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import lnc.a1;
import rsc.e;
import com.yxcorp.gifshow.prettify.v4.magic.filter.n;
import j16.b;
import com.yxcorp.utility.Log;
import java.util.Iterator;
import com.yxcorp.gifshow.log.EditFunnel;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.prettify.filter.f;
import laa.f;
import com.kuaishou.edit.draft.Theme$b;
import com.yxcorp.gifshow.v3.editor.prettify.EditPrettifyFragment;
import iba.a;
import saa.a;
import android.os.Bundle;
import usc.f;

public class i extends PresenterV2 implements d	// class@001176
{
    public RecyclerView A;
    public n B;
    public BaseFragment C;
    public GestureDetector D;
    public b E;
    public i$e F;
    public BaseEditor$EditorShowMode G;
    public FilterConfig H;
    public PublishSubject I;
    public FilterConfig[] J;
    public int K;
    public float L;
    public a M;
    public e N;
    public boolean O;
    public y P;
    public g Q;
    public EditPrettifyFragment p;
    public int q;
    public String r;
    public Set s;
    public i t;
    public c u;
    public a v;
    public a w;
    public h x;
    public PublishSubject y;
    public View z;

    public void i(){
       super();
       this.F = new i$e(this);
       this.G = BaseEditor$EditorShowMode.SHOW_BACKGROUND;
       this.I = PublishSubject.g();
       this.K = -3;
       this.L = 0xbf800000;
       this.P = new i$a(this);
       this.Q = new i$b(this);
    }
    public static FilterVideoPlugin$FilterEntranceType S8(){
       return FilterVideoPlugin$FilterEntranceType.EDIT;
    }
    public static int V8(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, oi, "25");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       FilterConfig filterInfoFr = Filters.getFilterInfoFromFilterId(p0, i.S8());
       filterInfoFr = (filterInfoFr == null)? 0: filterInfoFr.mFeatureId;
       return filterInfoFr;
    }
    public void E8(){
       int i;
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "2")) {
          return;
       }
       c.a(e.b);
       this.s.add(this.P);
       EditorDelegate uEditorDeleg = this.p.kh();
       if (!PatchProxy.applyVoid(objArray, this, oi, "7")) {
          boolean b1 = true;
          this.x.e().i(b1);
          this.x.e().m(R.layout.arg_RES_7f0d0350);
          this.x.e().q(b1);
          this.x.e().o(this.F);
          if (this.M == null) {
             a uoa = new a(b1);
             this.M = uoa;
             uoa.init();
          }
          i tM = this.M;
          Object[] objArray1 = PatchProxy.apply(objArray, this, oi, "8");
          if (objArray1 != PatchProxyResult.class) {
          }else if(this.M == null){
             objArray1 = objArray;
          }else {
             EditorDelegate uEditorDeleg1 = this.p.kh();
             c uoc = new c();
             uoc.a = this.x.c();
             uoc.d = uEditorDeleg1.getTaskId();
             switch (i$d.a[uEditorDeleg1.N().T0().ordinal()]){
                 case 1:
                 case 3:
                 case 4:
                 case 2:
                   uoc.b = 2;
                   break;
                 case 5:
                 case 7:
                 case 6:
                   uoc.b = 3;
                   break;
                 default:
                   uoc.b = 5;
             }
             if (f.E(uEditorDeleg1.getType())) {
                List list = q.g(z.x(uEditorDeleg1.getType(), uEditorDeleg1.N()), g.a);
                if (!PatchProxy.applyVoidOneRefs(list, uoc, c.class, "1") && list != null) {
                   uoc.g.clear();
                   uoc.g.addAll(list);
                }
             }else {
                uoc.f = this.t.e();
                if (this.t.j() != null) {
                   uoc.c = (double)(float)(this.t.j().getVideoLength() * 0x408f400000000000);
                }
             }
             objArray1 = uoc;
          }
          tM.n(objArray1);
          this.x.e().j(b1);
          this.x.e().n(this.M);
          this.x.e().p(this);
          this.x.e().k(b1);
       }
       if (!PatchProxy.applyVoidOneRefs(uEditorDeleg, this, oi, "9") && this.B == null) {
          this.B = (f.E(uEditorDeleg.getType()))? new k(): new n();
          this.B.f(uEditorDeleg);
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "11")) {
          t ot = this.p.m();
          k ok = new k(this);
          b b = (a.a)? b.b: h.b;
          this.E = ot.subscribe(ok, b);
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "10") && this.getContext() != null) {
          View view = this.p.getParentFragment().getView().findViewById(R.id.touch_view);
          View view1 = this.t.f().C();
          if (view != null) {
             this.D = new GestureDetector(this.getContext(), new m(this));
             view.setOnTouchListener(new g(this));
             view1.setOnClickListener(objArray);
             view1.setOnTouchListener(new h(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "20") && (this.C != null && this.w.v() == null)) {
          Theme theme = this.v.v();
          i = 0;
          if (theme != null && (theme.getUsingFilters() && theme.getFiltersCount() > 0)) {
             objArray = theme.getFilters(i);
          }
       label_0202 :
          FilterConfig uFilterConfi1 = this.a9(objArray);
          this.H = uFilterConfi1;
          if (uFilterConfi1 != null) {
             this.J[i] = uFilterConfi1;
             this.Y8(uFilterConfi1, i);
             this.M.o(this.H);
          }
       }
    label_0218 :
       this.P8();
       if (this.J == null) {
          FilterConfig[] uFilterConfi = new FilterConfig[4];
          this.J = uFilterConfi;
       }
       this.X7(this.y.subscribe(new j(this), h.b));
       this.X7(this.I.debounce(100, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new l(this), d.b));
       f.o0(this.Q, f.h(this.t.f().q()).t0(), g.class);
       return;
    }
    public void H8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "23")) {
          View view = this.t.f().C();
          if (view != null) {
             view.setOnTouchListener(objArray);
          }
       }
       this.M.i();
       f.p0(f.h(this.t.f().q()).t0(), g.class).c(this.Q);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       b9.a(this.E);
       this.B.b(this.p.kh().x().e());
       s$b uob = this.W8();
       if (uob != null) {
          i tA = this.A;
          if (tA != null) {
             uob.c(tA);
          }
       }
       return;
    }
    public void M3(){
       c.g(this);
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, i.class, "6")) {
          return;
       }
       s$b uob = this.W8();
       if (uob != null) {
          uob.b(this.A);
       }
       return;
    }
    public final View R8(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, i.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.p.getParentFragment() == null) {
          return objArray;
       }
       if (this.p.getParentFragment().getView() == null) {
          return objArray;
       }
       if (this.p.getParentFragment().getView().findViewById(0x7f0a31e4) == null) {
          return objArray;
       }
       return this.p.getParentFragment().getView().findViewById(0x7f0a31e4).findViewById(0x7f0a3806);
    }
    public void W5(){
       c.b(this);
    }
    public s$b W8(){
       Object obj = PatchProxy.apply(null, this, i.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.f().a(EditorDelegate$ShowLoggerType.FILTER);
    }
    public final Workspace$Type X8(){
       Object obj = PatchProxy.apply(null, this, i.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.f().getType();
    }
    public void Y8(FilterConfig p0,boolean p1){
       int i;
       String[] stringArray;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi, "14")) {
          return;
       }
       if (p0.mFilterId == InternalFilterInfo.filter_none.mId) {
          this.Z8(this.z, false);
          if (!p1) {
             this.B.a(null, null, false);
          }
       }else {
          boolean b = true;
          this.Z8(this.z, b);
          Object[] objArray = new Object[false];
          a.D().w("FilterEditorPresenterV2", "onUpdateFilter : "+p0.mFilterName, objArray);
          i = i.V8(p0.mFilterId);
          if (!i) {
             Object[] objArray1 = new Object[false];
             a.D().A("FilterEditorPresenterV2", "onUpdateFilter----------> unknown featureId! end!", objArray1);
             return;
          }else {
             ColorFilter$b uob = ColorFilter.newBuilder();
             FeatureId$b uob1 = FeatureId.newBuilder();
             uob1.c(i);
             uob.d(uob1);
             uob.f(p0.isReco());
             uob.e(((double)p0.mIntensity * (double)p0.mRatioIntensity));
             uob.h(p0.getColorFilterType(2));
             if (p0.mSourceType == b) {
                stringArray = new String[b];
                stringArray[0] = AdvEditUtil.d()+p0.getUnZipDir();
             }else {
                FilterConfig mFilterResou = p0.mFilterResources;
                if (mFilterResou != null) {
                   String[] stringArray1 = new String[false];
                   stringArray = mFilterResou.toArray(stringArray1);
                }else {
                   stringArray = new String[false];
                }
             }
             this.e9(p0, uob);
             this.B.a(uob.build(), stringArray, false);
          }
       }
       return;
    }
    public final void Z8(View p0,boolean p1){
       int i;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oi, "26")) {
          return;
       }
       i = 0x7f0a41fa;
       if (p0.getTag(i) instanceof ObjectAnimator) {
          p0.getTag(i).cancel();
       }
       i = 0;
       int i1 = (p1)? 0: 0x3f800000;
       if (p1) {
          i = 0x3f800000;
       }
       float[] uofloatArray = new float[]{i1,i};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, uofloatArray);
       long l = (p1)? 0: 250;
       objectAnimat.setDuration(l);
       objectAnimat.addListener(new i$c(this, p0, p1));
       p0.setTag(p0.getId(), objectAnimat);
       objectAnimat.start();
       return;
    }
    public final FilterConfig a9(ColorFilter p0){
       FilterConfig obj = PatchProxy.applyOneRefs(p0, this, i.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().s("FilterEditorPresenterV2", "restoreColorFilterToUI", objArray);
       obj = null;
       if (p0 == null || !p0.getFeatureId().getInternalValue()) {
          return obj;
       }
       FilterConfig uFilterConfi = y.y(this.M.getFilters(), new i(p0.getFeatureId().getInternalValue())).orNull();
       if (uFilterConfi == null) {
          return obj;
       }
       uFilterConfi.mIntensity = (float)p0.getIntensity() / uFilterConfi.mRatioIntensity;
       if (p0.getIsReco()) {
          uFilterConfi = uFilterConfi.clone();
          uFilterConfi.setIsReco(true);
       }
       return uFilterConfi;
    }
    public void b9(boolean p0){
       i oi1;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "21")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("FilterEditorPresenterV2", "restoreFilter", objArray);
       ColorFilter uColorFilter = this.w.v();
       if (uColorFilter == null) {
          Theme theme = this.v.v();
          if (theme != null && (theme.getUsingFilters() && theme.getFiltersCount() > 0)) {
             uColorFilter = theme.getFilters(0);
             oi1 = 1;
          label_004a :
             FilterConfig uFilterConfi = this.a9(uColorFilter);
             if (uFilterConfi != null && !oi1) {
                oi1 = this.N;
                if (oi1 != null) {
                   oi1.e(uFilterConfi.getDisplayName(), a1.p(R.string.arg_RES_7f103c1b));
                }
             }
             if (uFilterConfi != null && !n.l(uFilterConfi)) {
                n.e(uFilterConfi, null);
                Object[] objArray1 = new Object[0];
                a.D().w("FilterEditorPresenterV2", "restoreFilter filterConfig notExist id = "+uFilterConfi.mDisplayName, objArray1);
             }
             if (uFilterConfi != null) {
                p0[0] = uFilterConfi;
                i tH = this.H;
                if (tH != null && (tH.mFilterId == uFilterConfi.mFilterId || this.G == BaseEditor$EditorShowMode.SHOW_FOREGROUND)) {
                   this.Y8(uFilterConfi, 0);
                }
                this.M.o(uFilterConfi);
             }else {
                uFilterConfi = FilterConfig.getEmpty();
                this.Y8(uFilterConfi, p0);
                this.M.o(uFilterConfi);
             }
             return;
          }
       }
       oi1 = null;
       goto label_004a ;
    }
    public void c9(FilterConfig p0){
       int i;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "15")) {
          return;
       }
       FilterConfig mFilterId = p0.mFilterId;
       InternalFilterInfo filter_none = InternalFilterInfo.filter_none;
       if (mFilterId == filter_none.mId) {
          this.d9(mFilterId);
       }else if(PatchProxy.applyVoidOneRefs(p0, this, oi, "18")){
          this.d9(filter_none.mId);
          Object[] objArray = new Object[0];
          a.D().w("FilterEditorPresenterV2", p0.mIntensity+" mIntensity"+p0.mFilterName+" name", objArray);
          i = i.V8(p0.mFilterId);
          if (i) {
             ColorFilter$b uob = this.w.k();
             uob.e((double)(p0.mIntensity * p0.mRatioIntensity));
             uob.h(p0.getColorFilterType(2));
             FeatureId$b uob1 = FeatureId.newBuilder();
             uob1.c(i);
             uob.d(uob1);
             uob.f(p0.isReco());
             uob.b();
             if (p0.mSourceType == 1) {
                String str = this.w.Q(AdvEditUtil.d()+p0.getUnZipDir());
                uob.a(str);
                Log.b("FilterEditorPresenterV2", "saveColorFilter internalUnzipDir:"+str);
             }else {
                FilterConfig mFilterResou = p0.mFilterResources;
                if (mFilterResou != null) {
                   Iterator iterator = mFilterResou.iterator();
                   while (iterator.hasNext()) {
                      String str1 = this.w.Q(AdvEditUtil.d()+iterator.next());
                      uob.a(str1);
                      Log.b("FilterEditorPresenterV2", "saveColorFilter internalFileResource:"+str1);
                   }
                }
             }
             this.e9(p0, uob);
             if (this.X8() == Workspace$Type.PHOTO_MOVIE) {
                this.h9(0);
             }
          }
       }
       Objects.requireNonNull(EditFunnel.a);
       return;
    }
    public final void d9(int p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oi, "17")) {
          return;
       }
       if (p0 != InternalFilterInfo.filter_none.mId) {
          return;
       }
       if (!this.w.E()) {
          this.w.Y();
          Object[] objArray = new Object[0];
          a.D().w("FilterEditorPresenterV2", "saveFilterNone colorFilter remove!", objArray);
       }
       if (this.X8() == Workspace$Type.PHOTO_MOVIE) {
          this.h9(true);
       }
       return;
    }
    public final void e9(FilterConfig p0,ColorFilter$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "16")) {
          return;
       }
       p0 = p0.mSourceType;
       if (p0 == null) {
          p1.g(1);
       }else if(p0 == 1){
          p1.g(2);
       }else {
          p1.g(0);
       }
       return;
    }
    public void f5(){
       c.d(this);
    }
    public void f6(){
       c.a(this);
    }
    public final void h9(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "19")) {
          return;
       }
       this.v.l(f.a).b(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("VIDEO_EDIT_OPERATION_PACKAGE").intValue();
       this.r = this.r8("SUB_TYPE");
       this.s = this.r8("EDITOR_VIEW_LISTENERS");
       this.t = this.r8("EDITOR_HELPER_CONTRACT");
       this.u = this.r8("WORKSPACE");
       this.v = this.r8("THEME");
       this.w = this.r8("COLOR_FILTER");
       this.x = this.r8("GENERATE_FRAGMENT");
       this.y = this.r8("GENERATE_FILTER_FRAGMETN");
       this.N = this.t8("PRETTIFY_NAME_HELPER");
       return;
    }
    public void n4(){
       c.f(this);
    }
    public void q4(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "5")) {
          return;
       }
       View view = p0.findViewById(R.id.tv_origin_photo);
       this.z = view;
       view.setOnTouchListener(new f(this));
       this.z.setVisibility(8);
       this.A = p0.findViewById(0x7f0a0e7b);
       this.P8();
       this.b9(true);
       return;
    }
    public void u3(){
       c.i(this);
    }
    public void v6(boolean p0){
       c.e(this, p0);
    }
    public void x5(){
       c.c(this);
    }
    public void y6(){
       c.h(this);
    }
}
