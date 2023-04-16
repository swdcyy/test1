package com.yxcorp.gifshow.v3.editor.text.n0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.text.vb.AbsTextEditorFragmentVB;
import java.util.ArrayList;
import jw8.r;
import huc.e0;
import com.yxcorp.gifshow.v3.editor.text.n0$a;
import com.yxcorp.gifshow.v3.editor.text.n0$b;
import com.yxcorp.gifshow.v3.editor.text.n0$e;
import com.yxcorp.gifshow.v3.editor.text.n0$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.f;
import huc.g0;
import com.yxcorp.gifshow.v3.editor.text.l0;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.v3.editor.text.n0$c;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.v3.editor.text.n0$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import huc.f0;
import com.yxcorp.gifshow.v3.editor.text.m0;
import com.yxcorp.gifshow.v3.editor.text.dynamic.vm.DynamicTextViewModel;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.i0;
import android.util.Pair;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import huc.u;
import ypc.a;
import java.util.Collection;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import z8c.e;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.v3.editor.text.k0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import huc.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View$OnLayoutChangeListener;
import xuc.b;
import java.lang.Boolean;
import aw9.z;
import voc.o;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.Map;
import wpc.a0;
import t36.f;
import com.yxcorp.gifshow.v3.editor.text.j0;
import t36.f$a;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.edit.draft.TimeRange$b;
import com.kuaishou.edit.draft.TimeRange;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.library.widget.popup.common.c;
import huc.n1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import java.lang.Math;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import im8.f;
import com.yxcorp.gifshow.widget.adv.model.a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import w46.b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import jba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Tts;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.edit.draft.TtsAudio;
import android.widget.TextView;
import ekd.m1;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import hba.a;
import java.lang.Integer;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment;
import rwc.j;

public class n0 extends PresenterV2	// class@00147a
{
    public TextEditorV3Fragment A;
    public f B;
    public j C;
    public PublishSubject D;
    public RecyclerView E;
    public LinearLayout F;
    public SelectShapeLinearLayout G;
    public a H;
    public SelectShapeLinearLayout I;
    public View J;
    public TextView K;
    public List L;
    public r M;
    public TextElementViewModel N;
    public List O;
    public List P;
    public boolean Q;
    public b R;
    public DecorationContainerView$e S;
    public y T;
    public View$OnLayoutChangeListener U;
    public final b V;
    public AbsTextEditorFragmentVB p;
    public a q;
    public c r;
    public int s;
    public String t;
    public EditorDelegate u;
    public z v;
    public PublishSubject w;
    public f x;
    public Set y;
    public EditDecorationContainerView z;

    public void n0(AbsTextEditorFragmentVB p0){
       super();
       this.s = 7;
       this.L = new ArrayList();
       this.M = new r();
       this.O = new ArrayList();
       this.P = new ArrayList();
       this.Q = true;
       this.R = new e0(this);
       this.S = new n0$a(this);
       this.T = new n0$b(this);
       this.U = new n0$e(this);
       this.V = new n0$f(this);
       this.p = p0;
    }
    public void E8(){
       n0 on0 = n0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on0, "3")) {
          return;
       }
       this.y.add(this.T);
       this.N = k1.c(this.u, false);
       this.y.add(this.T);
       if (!f.A(this.r.a1())) {
          this.X7(this.w.subscribe(new g0(this), l0.b));
          this.G.setOnClickListener(new n0$c(this));
          this.I.setOnClickListener(new n0$d(this));
          this.S8();
          this.z.d(this.S);
          this.X7(this.D.subscribe(new f0(this), m0.b));
       }
       DynamicTextViewModel uDynamicText = DynamicTextViewModel.class;
       if (!PatchProxy.applyVoid(objArray, this, on0, "9")) {
          if (this.Q != null) {
             int i = 8;
             if (!f.A(this.r.a1())) {
                this.F.setVisibility(false);
                this.G.setVisibility(false);
                this.E.setVisibility(i);
                if (f.E(this.r.a1()) || this.r.a1() == Workspace$Type.PHOTO_MOVIE) {
                   this.I.setVisibility(i);
                   this.J.setVisibility(i);
                }else {
                   this.J.setVisibility(4);
                   this.I.setVisibility(false);
                }
             }else {
                this.F.setVisibility(i);
                this.G.setVisibility(i);
                this.J.setVisibility(i);
                this.I.setVisibility(i);
                this.E.setVisibility(false);
             }
             if (!PatchProxy.applyVoid(objArray, this, on0, "10")) {
                Pair pair = i0.f(QCurrentUser.me().isLogined(), 16, i0.a());
                this.O = pair.second;
                Pair pair1 = i0.e(QCurrentUser.me().isLogined(), 16);
                this.P = pair1.second;
                if (f.A(this.r.a1())) {
                   pair = pair.first;
                   FontViewModel uFontViewMod = (!f.A(this.r.a1()))? this.N.G0(): objArray;
                   List list = a.q(pair, uFontViewMod);
                   this.L = list;
                   pair1 = pair1.first;
                   if (!f.A(this.r.a1())) {
                      objArray = this.N.G0();
                   }
                   list.addAll(a.q(pair1, objArray));
                   Object[] objArray1 = new Object[false];
                   a.D().s("NormalTextPresenter", "default text id: "+this.L.get(false).b(), objArray1);
                   this.N.j1(this.L.get(false).b());
                   this.E.addItemDecoration(new e(false, a1.d(R.dimen.arg_RES_7f070f5d), false));
                   this.E.setLayoutManager(new NpaLinearLayoutManager(this.getContext(), false, false));
                   this.M.h = new k0(this);
                   b uob = new b(this.A, ViewModelProviders.of(this.A.getActivity()).get(uDynamicText), this.M, this.L, 16);
                   n0 tM = this.M;
                   tM.j = list;
                   tM.i = this.L;
                   this.E.setAdapter(tM);
                   list.a();
                   this.E.addOnLayoutChangeListener(this.U);
                }else {
                   ArrayList uArrayList = new ArrayList();
                   uArrayList.addAll(pair.first);
                   uArrayList.addAll(pair1.first);
                   this.N.Z0(uArrayList, this.V, this.O, this.P);
                }
                objArray = new Object[false];
                a.D().w("NormalTextPresenter", "initTextList", objArray);
             }
             this.Q = false;
             ViewModelProviders.of(this.A.getActivity()).get(uDynamicText).w0();
          }
          objArray = new Object[false];
          a.D().w("NormalTextPresenter", "onFirstBind", objArray);
       }
       objArray = new Object[false];
       a.D().w("NormalTextPresenter", "onBind", objArray);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n0.class, "12")) {
          return;
       }
       this.y.remove(this.T);
       if (!f.A(this.r.a1())) {
          this.G.setOnClickListener(objArray);
          this.I.setOnClickListener(objArray);
          this.z.M(this.S);
       }else {
          this.E.removeOnLayoutChangeListener(this.U);
       }
       objArray = new Object[0];
       a.D().w("NormalTextPresenter", "onUnbind", objArray);
       return;
    }
    public void P8(boolean p0){
       double d1;
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, on0, "4")) {
          return;
       }
       double d = f.j(this.v.g(), this.u.x().f(), 2.00f, 1);
       f.p0(this.u.u(), a0.class).s0(j0.a);
       if (PatchProxy.isSupport(on0)) {
          TimeRange obj = PatchProxy.applyOneRefs(Double.valueOf(d), this, on0, "5");
          if (obj != PatchProxyResult.class) {
             d1 = obj.doubleValue();
          label_00a8 :
             TimeRange$b uob = TimeRange.newBuilder();
             uob.b(d1);
             uob.a(this.R8(d1));
             obj = uob.build();
             this.N.q0(obj, this.v.d(), this.v.c(), p0);
             n0 tH = this.H;
             if (tH != null && tH.K()) {
                this.H.o();
             }
             if (!PatchProxy.applyVoid(null, null, n1.class, "4")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "EDIT_ADD_TEXT";
                u1.u(1, uElementPack, null);
             }
             return;
          }
       }
       if (!f.E(this.r.a1())) {
          if (f.s(this.u.x().f())) {
             if (this.v.g() - 0x3fb999999999999a < 0) {
                this.v.o(0x3fb999999999999a);
             }
          }else if((this.v.q() - d) - 0x3fb999999999999a <= 0){
             d = this.v.q() - 0x3fb999999999999a;
             this.v.o(d);
          }else {
             this.v.o(d);
          }
       }
       d1 = d;
       goto label_00a8 ;
    }
    public double R8(double p0){
       ITimelineView$d obj;
       n0 on0 = n0.class;
       if (PatchProxy.isSupport(on0)) {
          obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, on0, "13");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       if (this.r.a1() == Workspace$Type.KTV_SONG) {
          int i = 0;
          if (this.v.getProject().trackAssets(i).clippedRange() != null) {
             return this.v.getProject().trackAssets(i).clippedRange().duration();
          }
       }
       double d = 2.00f;
       if (!f.E(this.r.a1()) && f.s(this.u.x().f())) {
          return Math.max(Math.min(d, this.v.g()), 0x3fb999999999999a);
       }else {
          obj = this.x.i.o;
          if (obj) {
             d = (double)obj;
          }
          return Math.max(Math.min(d, (this.v.q() - p0)), 0x3fb999999999999a);
       }
    }
    public final void S8(){
       Object[] objArray2;
       n0 on0 = n0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on0, "7")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "NormalTextPresenter";
       a.D().w(str, "updateTTSButtonStatus", objArray1);
       n0 on01 = (this.B.get() != null && this.B.get().s())? 1: null;
       BaseDrawer selectDecora = this.z.getSelectDecorationDrawer();
       if (selectDecora == null) {
          objArray2 = new Object[i];
          a.D().w(str, "updateTTSButtonStatus selectedDrawer is null", objArray2);
       }else if(!selectDecora instanceof EditTextBaseElement){
          objArray2 = new Object[i];
          a.D().t(str, "updateTTSButtonStatus selectedDrawer is not EditTextBaseElement", objArray2);
       }else {
          objArray = selectDecora;
          boolean b = (objArray.getText()).isEmpty();
       label_0064 :
          if (on01 && !str) {
             this.I.setSelected(i);
             String decorationId = objArray.getDecorationId();
             Tts obj = PatchProxy.applyOneRefs(decorationId, this, on0, "8");
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             }else if(this.r.Z0() == null){
                obj = this.r.Z0().v();
                if (obj != null && !q.f(obj.getTtsAudiosList())) {
                   Iterator iterator = obj.getTtsAudiosList().iterator();
                   while (iterator.hasNext()) {
                      if (decorationId.equals(iterator.next().getTextIdentifier())) {
                         i = true;
                         break ;
                      }
                   }
                }
             }
             if (i) {
                this.K.setText(R.string.arg_RES_7f100ca8);
             }else {
                this.K.setText(R.string.arg_RES_7f100ced);
             }
          }else {
             this.I.setSelected(true);
             this.K.setText(R.string.arg_RES_7f100ced);
          }
          return;
       }
       str = 1;
       goto label_0064 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0.class, "2")) {
          return;
       }
       this.E = (this.p.y() != null)? this.p.y(): m1.f(p0, 0x7f0a0a70);
       this.F = m1.f(p0, 0x7f0a28b3);
       this.G = m1.f(p0, 0x7f0a2890);
       this.J = m1.f(p0, 0x7f0a0d35);
       this.I = m1.f(p0, 0x7f0a28e6);
       this.K = m1.f(p0, 0x7f0a3e4e);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n0.class, "1")) {
          return;
       }
       this.q = this.r8("TEXT");
       this.r = this.r8("WORKSPACE");
       this.s = this.r8("VIDEO_EDIT_OPERATION_PACKAGE").intValue();
       this.t = this.r8("SUB_TYPE");
       this.u = this.r8("EDITOR_DELEGATE");
       this.v = this.r8("DECORATION_PLAYER");
       this.w = this.r8("DECORATION_TIMELINE_UPDATE");
       this.x = this.r8("TIME_LINE_SAVE_DATA");
       this.y = this.r8("EDITOR_VIEW_LISTENERS");
       this.z = this.r8("DECORATION_CONTAINER_VIEW");
       this.A = this.r8("FRAGMENT");
       this.B = this.x8("DECORATION_EDITING_ACTION");
       this.C = this.r8("STOP_SCROLL_LISTENER");
       this.D = this.r8("CLICK_ADD_TEXT_BUTTON");
       return;
    }
}
