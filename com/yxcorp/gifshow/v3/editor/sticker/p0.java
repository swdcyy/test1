package com.yxcorp.gifshow.v3.editor.sticker.p0;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mrd.a;
import java.util.HashSet;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.sticker.p0$a;
import itc.i2;
import com.yxcorp.gifshow.v3.editor.sticker.p0$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import android.view.View;
import itc.h2;
import android.view.View$OnClickListener;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.sticker.l0;
import com.yxcorp.gifshow.v3.editor.sticker.m0;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import itc.d2;
import ekd.m1;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.widget.adv.Action;
import aw9.z;
import itc.k3;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import wba.h0;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import nsd.u;
import java.lang.Boolean;
import java.util.Iterator;
import gka.g;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.v3.editor.sticker.n0;
import erd.o;
import t45.d;
import brd.z;
import itc.l2;
import itc.k2;
import itc.p2;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.lang.Integer;

public class p0 extends PresenterV2 implements g	// class@00127e
{
    public String A;
    public Set B;
    public z C;
    public i D;
    public StickerElementViewModel E;
    public f F;
    public Set G;
    public EditDecorationContainerView H;
    public View I;
    public c J;
    public b K;
    public StickerLibraryFragment L;
    public boolean M;
    public boolean N;
    public y O;
    public final e$c P;
    public DecorationContainerView$e Q;
    public View p;
    public View q;
    public boolean r;
    public a s;
    public BaseEditorFragment t;
    public List u;
    public Set v;
    public PublishSubject w;
    public a x;
    public EditorDelegate y;
    public int z;

    public void p0(){
       super();
       this.r = false;
       this.s = a.g();
       this.v = new HashSet();
       this.J = PublishSubject.g();
       this.K = null;
       this.M = false;
       this.N = false;
       this.O = new p0$a(this);
       this.P = new i2(this);
       this.Q = new p0$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "3")) {
          return;
       }
       DisplayMetrics uDisplayMetr = c.c(this.getActivity().getResources());
       this.F = this.D.i();
       this.E = ViewModelProviders.of(this.y.q()).get(StickerElementViewModel.class);
       boolean b = true;
       if (((float)uDisplayMetr.widthPixels / uDisplayMetr.xdpi) - 0x40200000 <= 0) {
          this.N = b;
       }
       if (this.H.getSelectDrawer() != null && !this.H.getSelectDrawer() instanceof EditStickerBaseDrawer) {
          this.H.R();
       }
       this.y.C().setOnClickListener(new h2(this));
       this.v.add(this.P);
       this.E.v0(b);
       this.X7(this.w.subscribe(new l0(this), m0.b));
       this.B.add(this.O);
       this.H.d(this.Q);
       this.S8();
       this.I.setOnClickListener(new d2(this));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, p0.class, "4")) {
          return;
       }
       p0 tp = this.p;
       if (tp != null) {
          m1.a(tp, objArray, R.id.sticker_library);
       }
       this.y.C().setOnClickListener(objArray);
       this.B.remove(this.O);
       this.v.remove(this.P);
       this.H.M(this.Q);
       this.E.v0(false);
       return;
    }
    public final void P8(StickerDetailInfo p0){
       double d;
       Object obj = this;
       Object obj1 = p0;
       p0 op0 = p0.class;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, op0, "10")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, op0, "11")) {
          Object obj2 = PatchProxy.applyOneRefs(obj1, obj, op0, "12");
          p0 op01 = null;
          if (obj2 != PatchProxyResult.class) {
             d = obj2.doubleValue();
          }else if(StickerDetailInfo.isInteractiveSticker(p0)){
             d = op01;
          }else {
             d = k3.h(null, obj.C, obj.F);
          }
          if (StickerDetailInfo.isInteractiveSticker(p0)) {
             op01 = obj.C.q();
          }
          p0 e = obj.E;
          TimeRange$b uob = TimeRange.newBuilder();
          uob.b(d);
          uob.a(op01);
          GeneratedMessageLite generatedMes = uob.build();
          List list = obj.C.d();
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoidThreeRefs(p0, generatedMes, list, e, StickerElementViewModel.class, "4")) {
             a.p(obj1, "stickerDetailInfo");
             a.p(generatedMes, "timeRange");
             a.p(list, "assetIdentifier");
             Object[] objArray = new Object[0];
             a.D().w("StickerElementViewModel", "addSticker", objArray);
             h0 oh0 = new h0(0, 0, 0, 0, null, 0, 0, null, 255, null);
             e.o0(obj1, generatedMes, list, d);
          }
       }
       this.R8();
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "6")) {
          return;
       }
       this.w.onNext(Boolean.TRUE);
       Iterator iterator = this.G.iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "7")) {
          return;
       }
       b uob = this.J.debounce(50, TimeUnit.MILLISECONDS).flatMap(n0.b).observeOn(d.a).subscribe(new l2(this), new k2(this));
       this.K = uob;
       if (uob != null) {
          this.X7(uob);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p0.class, "2")) {
          return;
       }
       this.p = p0;
       this.q = m1.f(p0, 0x7f0a3b67);
       this.I = m1.f(p0, 0x7f0a4030);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p0.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p2();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, p0.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(p0.class, new p2());
       }else {
          obj.put(p0.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p0.class, "1")) {
          return;
       }
       this.t = this.r8("FRAGMENT");
       this.u = this.t8("STICKER_GROUP_INFO");
       this.v = this.r8("STICKER_LISTENERS");
       this.w = this.r8("HIDE_STICKER_LIBRARY_EVENT");
       this.z = this.r8("VIDEO_EDIT_OPERATION_PACKAGE").intValue();
       this.A = this.r8("SUB_TYPE");
       this.B = this.r8("EDITOR_VIEW_LISTENERS");
       this.x = this.r8("STICKER_REQUEST_EVENT");
       this.y = this.r8("EDITOR_DELEGATE");
       this.C = this.r8("DECORATION_PLAYER");
       this.D = this.r8("EDITOR_HELPER_CONTRACT");
       this.H = this.r8("DECORATION_CONTAINER_VIEW");
       this.G = this.r8("EDITOR_CONTROL_LISTENER");
       return;
    }
}
