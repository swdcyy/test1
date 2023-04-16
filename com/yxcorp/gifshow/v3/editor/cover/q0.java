package com.yxcorp.gifshow.v3.editor.cover.q0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import com.smile.gifmaker.mvps.utils.observable.BehaviorObservableSet;
import t45.e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ArrayBlockingQueue;
import hkd.b;
import java.lang.String;
import ppc.g0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.RejectedExecutionHandler;
import androidx.collection.LruCache;
import com.yxcorp.gifshow.v3.editor.cover.q0$j;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.cover.q0$a;
import vba.h;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.cover.q0$b;
import com.yxcorp.gifshow.v3.editor.cover.q0$c;
import com.yxcorp.gifshow.v3.editor.cover.q0$d;
import android.os.Looper;
import kwc.u;
import com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter;
import com.yxcorp.gifshow.v3.editor.cover.s;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.ViewPagerRecyclerView;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.EditorActivity;
import x59.g;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import wba.z;
import ppc.h0;
import com.yxcorp.gifshow.v3.editor.cover.v0$a;
import com.yxcorp.gifshow.v3.editor.cover.v0;
import java.util.Collection;
import java.util.Iterator;
import android.util.Pair;
import sxb.a;
import com.facebook.cache.common.CacheKey;
import com.yxcorp.gifshow.v3.editor.cover.p0;
import ekd.q$a;
import ekd.q;
import com.yxcorp.gifshow.v3.widget.PictureSelectView;
import com.yxcorp.gifshow.v3.editor.cover.n0;
import laa.f;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Cover$b;
import com.kuaishou.edit.draft.Cover$Type;
import com.kuaishou.edit.draft.Cover$ParameterCase;
import com.kuaishou.edit.draft.PictureCoverParam;
import im8.f;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.v3.editor.cover.m0;
import crd.b;
import ok.h;
import lnc.b9;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.kuaishou.sk2c.LuaGraphic;
import com.yxcorp.gifshow.util.rx.RxBus;
import voc.z;
import brd.t;
import eoc.e;
import brd.z;
import ppc.j0;
import com.yxcorp.gifshow.v3.editor.cover.j0;
import erd.g;
import voc.i0;
import ppc.k0;
import com.yxcorp.gifshow.v3.editor.cover.k0;
import hba.a;
import qaa.a;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import tyc.f2;
import android.app.Activity;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.editor.cover.s0;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$g;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import ppc.i0;
import com.yxcorp.gifshow.v3.editor.cover.l0;
import com.yxcorp.gifshow.v3.editor.cover.q0$h;
import com.yxcorp.gifshow.v3.widget.g$b;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$d;
import ppc.x0;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import java.util.concurrent.ThreadPoolExecutor;
import android.os.Handler;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.StringBuilder;
import com.kuaishou.edit.draft.AssetSegment;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.v3.editor.cover.o0;
import faa.a;
import q87.c;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Math;
import com.yxcorp.gifshow.v3.editor.cover.q0$i;
import com.smile.gifmaker.mvps.utils.observable.ObservableSet;
import java.lang.Runnable;
import ekd.m1;
import ppc.f0;
import android.view.View$OnClickListener;
import ppc.w0;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.cover.PhotosCoverEditorV3Fragment;
import io.reactivex.subjects.PublishSubject;
import maa.a;
import saa.a;
import naa.a;
import saa.c;

public class q0 extends PresenterV2 implements g	// class@000ec5
{
    public String A;
    public String B;
    public String C;
    public Set D;
    public Set E;
    public PublishSubject F;
    public PublishSubject G;
    public a H;
    public a I;
    public c J;
    public a K;
    public a L;
    public c M;
    public PublishSubject N;
    public EditorDelegate O;
    public PublishSubject P;
    public q0$f Q;
    public Integer R;
    public Boolean S;
    public Boolean T;
    public FontViewModel U;
    public h U0;
    public f V;
    public h V0;
    public PictureSelectView$e W;
    public boolean W0;
    public f X;
    public int X0;
    public EditDecorationContainerView Y;
    public boolean Y0;
    public TextElementViewModel Z;
    public String Z0;
    public q0$e a1;
    public q0$g b1;
    public b c1;
    public a d1;
    public x0 e1;
    public g f1;
    public List g1;
    public List h1;
    public PictureSelectView$d i1;
    public f2 j1;
    public y k1;
    public Handler l1;
    public final ObservableSet p;
    public final ThreadPoolExecutor q;
    public final LruCache r;
    public ExpandFoldHelperView s;
    public ImageView t;
    public ViewPagerRecyclerView u;
    public ImageView v;
    public PictureSelectView w;
    public q0$j x;
    public PhotosCoverEditorV3Fragment y;
    public int z;

    public void q0(){
       super();
       this.p = new BehaviorObservableSet(Collections.synchronizedSet(new HashSet()));
       e uoe = new e(0, 1, 10, TimeUnit.SECONDS, new ArrayBlockingQueue(20), new b("preview-frame-v3-pool"), new g0(this));
       this.q = v0;
       this.r = new LruCache(4);
       this.x = new q0$j(this);
       this.E = new HashSet();
       this.R = Integer.valueOf(0);
       Boolean fALSE = Boolean.FALSE;
       this.S = fALSE;
       this.T = fALSE;
       this.W = new q0$a(this);
       this.U0 = new h();
       this.V0 = new h();
       this.W0 = true;
       this.X0 = 1;
       this.Y0 = true;
       this.g1 = new ArrayList();
       this.h1 = new ArrayList();
       this.i1 = new q0$b(this);
       this.k1 = new q0$c(this);
       this.l1 = new q0$d(this, Looper.getMainLooper());
       this.U7(new u());
       this.U7(new ReEditCoverPresenter());
       this.U7(new s());
    }
    public void E8(){
       z c;
       q0 tt;
       q0 oq0 = q0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oq0, "4")) {
          return;
       }
       this.t = this.O.z().findViewById(0x7f0a301a);
       this.u = this.O.z().findViewById(0x7f0a3096);
       boolean b = true;
       this.Z = k1.c(this.O, b);
       if (this.y.getContext() instanceof EditorActivity) {
          this.f1 = this.O.d();
       }
       this.D.add(this.k1);
       this.H.c0();
       boolean b1 = false;
       if (!PatchProxy.applyVoid(objArray, this, oq0, "10")) {
          Workspace$Type type = PatchProxy.apply(objArray, this, oq0, "22");
          if (type != PatchProxyResult.class) {
          }else {
             type = this.O.getType();
          }
          boolean b2 = (type == Workspace$Type.ATLAS)? true: false;
          this.Y0 = b2;
          tt = this.U0;
          tt.g(this.J);
          tt.b(b).e(b).c(b).d(b);
          tt = this.V0;
          tt.g(this.J);
          tt.c(b);
          _monitor_enter(this);
          if (PatchProxy.applyVoid(objArray, this, oq0, "11")) {
             _monitor_exit(this);
          }else {
             this.h1.clear();
             q0 tJ = this.J;
             this.h1.addAll(oq0.g(tJ, b1, z.B(tJ), this.f1, new h0(this)));
             this.g1.clear();
             Iterator iterator = this.h1.iterator();
             while (iterator.hasNext()) {
                Pair second = iterator.next().second;
                if (second != null) {
                   this.g1.add(second.a().toString());
                }else {
                   this.g1.add("");
                }
             }
             _monitor_exit(this);
          }
          this.w.Z(q.g(this.h1, p0.a));
          if (this.h1.size()) {
             Cover$b uob = this.H.l(n0.a);
             if (uob.getType() != Cover$Type.PICTURE || (uob.getParameterCase() == Cover$ParameterCase.PICTURE_COVER_PARAM && uob.getPictureCoverParam().getIndexesCount() > 0)) {
                List indexesList = uob.getPictureCoverParam().getIndexesList();
                if (indexesList.size() > 0) {
                   int b3 = (this.Y0 != null && indexesList.size() > b)? true: false;
                   Boolean uBoolean = Boolean.valueOf(b3);
                   this.S = uBoolean;
                   b3 = (uBoolean.booleanValue())? indexesList.size(): 1;
                   this.X0 = b3;
                   Integer integer = indexesList.get(b1);
                   this.R = integer;
                   this.w.V(integer.intValue());
                }
             }
          }
       }
    label_0172 :
       this.X8(b1, b);
       if (this.X.get().booleanValue()) {
          this.X.set(Boolean.FALSE);
          if (!PatchProxy.applyVoid(objArray, this, oq0, "5")) {
             tt = this.t;
             if (tt != null) {
                tt.setImageDrawable(objArray);
             }
          }
       }
       this.W8(this.R.intValue());
       if (!PatchProxy.applyVoid(objArray, this, oq0, "9") && this.W0 != null) {
          this.W0 = b1;
          this.E.add(this.x);
          this.c1 = b9.c(this.c1, new m0(this));
          LuaGraphic.init(c.c(a.b().getResources()).density);
          RxBus f = RxBus.f;
          c = e.c;
          this.X7(f.f(z.class).observeOn(c).subscribe(new j0(this), j0.b));
          t ot = f.f(i0.class).observeOn(c);
          this.X7(ot.subscribe(new k0(this), k0.b));
       }
       a uoa = this.H.f0();
       this.d1 = uoa;
       uoa.c0();
       this.Z.X0(this.d1, b1);
       this.U.D0();
       if (this.j1 == null) {
          this.j1 = new f2(this.O.getContext(), this.Z.I0());
       }
       this.j1.d();
       if (!PatchProxy.applyVoid(objArray, this, oq0, "6")) {
          this.s.setPreActionListener(new s0(this));
       }
       this.X7(this.G.subscribe(new i0(this), l0.b));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "3")) {
          return;
       }
       this.w.R(new q0$h(this));
       this.w.N(this.i1);
       this.e1 = new x0(this.getContext());
       return;
    }
    public void H8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q0.class, "13")) {
          return;
       }
       q0 tw = this.w;
       Objects.requireNonNull(tw);
       if (!PatchProxy.applyVoid(objArray, tw, PictureSelectView.class, "18")) {
          tw.B.setAdapter(objArray);
          tw.D.Z0();
          tw.P();
       }
       this.a1 = objArray;
       this.r.evictAll();
       this.E.remove(this.x);
       b9.a(this.c1);
       this.q.shutdownNow();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "12")) {
          return;
       }
       this.l1.removeMessages(17);
       q0 tj1 = this.j1;
       if (tj1 != null) {
          tj1.b();
          this.j1 = null;
       }
       this.s.setPreActionListener(null);
       this.w.reset();
       return;
    }
    public float P8(Size p0,Size p1){
       float f = (float)p0.c;
       float f1 = (float)p0.b;
       float f2 = (float)p1.c * 0x3f800000;
       float f3 = (float)p1.b;
       if (((f * 0x3f800000) / f1) - (f2 / f3) >= 0) {
          return (f1 * (f2 / f));
       }
       return f3;
    }
    public String R8(int[] p0,int p1){
       StringBuilder obj;
       int i1;
       q0 oq0 = q0.class;
       if (PatchProxy.isSupport(oq0)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oq0, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       for (int i = 0; i < p0.length; i = i + 1) {
          i1 = p1 + i;
          p0[i] = i1;
          obj = obj+z.f(this.h1.get(p0[i]).first);
       }
       obj = obj+"_"+this.Y0+"_"+this.S+"_";
       i1 = p1;
       int i2 = p0.length + p1;
       while (i1 < i2) {
          obj = obj+this.g1.get(i1)+"_";
          i1 = i1 + 1;
       }
       return obj;
    }
    public EditTextBaseElementData S8(){
       EditTextBaseElement obj = PatchProxy.apply(null, this, q0.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.Y.getTopElement();
       if (obj == null) {
          return null;
       }
       return obj.getEditTextBaseElementData();
    }
    public final void V8(String p0,Workspace$Type p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, q0.class, "23")) {
          return;
       }
       if (this.J.a1() == p1 && !TextUtils.isEmpty(p0)) {
          int i = q.g(this.h1, o0.a).indexOf(p0);
          if (i >= 0) {
             this.w.U(i);
          }
       }
       return;
    }
    public void W8(int p0){
       q0 oq0 = q0.class;
       if (PatchProxy.isSupport(oq0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oq0, "16")) {
          return;
       }
       String str = ",mMaxAllowCount:";
       Object[] objArray = new Object[0];
       a.D().w("PhotosCoverEditorPresenter", "seekPreviewImage position: "+p0+str+this.X0+",coverSize:"+this.h1.size(), objArray);
       if (p0 > (this.h1.size() - this.X0)) {
          ExceptionHandler.handleCaughtException(new RuntimeException("PhotosCoverEditorPresenter error out of boundaryseekPreviewImage position: "+p0+str+this.X0+",coverSize:"+this.h1.size()));
       }
       p0 = Math.min(p0, (this.h1.size() - this.X0));
       this.R = Integer.valueOf(p0);
       q0$i oi = new q0$i(this, p0, this.X0);
       this.Z0 = oi.b;
       if (!this.p.contains(oi.b)) {
          this.p.add(oi.b);
          this.q.execute(oi);
       }
       return;
    }
    public final void X8(boolean p0,boolean p1){
       int i1;
       q0 oq0 = q0.class;
       if (PatchProxy.isSupport(oq0) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oq0, "15")) {
          return;
       }
       if (this.Y0 == null) {
          oq0 = this.v;
          if (oq0 != null) {
             oq0.setVisibility(8);
          }
       }
       oq0 = this.v;
       if (oq0 != null) {
          int i = (this.S.booleanValue())? 0x7f081abe: 0x7f081abf;
          oq0.setImageResource(i);
       }
       oq0 = this.X0;
       if (!p1) {
          i1 = (this.S.booleanValue())? Math.min(4, this.h1.size()): 1;
       }
    label_0055 :
       this.X0 = i1;
       oq0 = this.w;
       if (oq0 != null) {
          oq0.a0(this.X0);
          this.w.V(this.R.intValue());
       }
       int i2 = (p1)? this.R.intValue(): Math.min(this.w.getProgress(), (this.h1.size() - this.X0));
       this.W8(i2);
       if (p0) {
          q0 tw = this.w;
          if (tw != null) {
             tw.T();
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a09ec);
       this.s = m1.f(p0, 0x7f0a2eff);
       this.w = m1.f(p0, 0x7f0a3823);
       m1.a(p0, new f0(this), R.id.cover_mode_switch);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q0.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new w0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, q0.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(q0.class, new w0());
       }else {
          obj.put(q0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q0.class, "1")) {
          return;
       }
       this.y = this.r8("FRAGMENT");
       this.z = this.r8("VIDEO_EDIT_OPERATION_PACKAGE").intValue();
       this.A = this.r8("SUB_TYPE");
       this.B = this.r8("PAGE_TAG");
       this.C = this.r8("TITLE");
       this.D = this.r8("EDITOR_VIEW_LISTENERS");
       this.E = this.r8("COVER_INFO_PROVIDERS");
       this.F = this.r8("COVER_FILTER_EVENT");
       this.H = this.r8("COVER");
       this.I = this.r8("ASSET");
       this.J = this.r8("WORKSPACE");
       this.K = this.r8("COLOR_FILTER");
       this.L = this.r8("EDIT_BEAUTY");
       this.M = this.r8("ENHANCE_COLOR_FILTER");
       this.N = this.r8("COVER_OUTFILE_EVENT");
       this.O = this.r8("EDITOR_DELEGATE");
       this.P = this.r8("ADJUST_DECORATION_VIEW_SIZE_PUBLISHER");
       this.U = this.r8("FONT_VIEW_MODEL");
       this.V = this.x8("PhotoCoverSeekChangeListener");
       this.X = this.x8("COVER_CROP_EDIT_VERSION");
       this.Y = this.r8("DECORATION_CONTAINER_VIEW");
       this.G = this.r8("HIDE_PHOTO_COVER_MODE_SWITCH");
       return;
    }
}
