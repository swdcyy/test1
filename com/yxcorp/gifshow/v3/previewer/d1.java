package com.yxcorp.gifshow.v3.previewer.d1;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import java.lang.Object;
import pwc.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import voc.p;
import android.view.View;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsVideoFragmentV3ViewBinder;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager;
import tyc.b2;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import lwc.j3;
import lwc.k3;
import com.yxcorp.gifshow.v3.previewer.d1$a;
import java.lang.Runnable;
import lwc.h3;
import android.animation.AnimatorListenerAdapter;
import t36.f$a;
import t36.f;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import voc.v;
import mrd.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import aw9.c0;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import ooc.g;
import com.yxcorp.gifshow.v3.previewer.d1$b;
import lwc.i3;
import com.yxcorp.gifshow.v3.editor.EditorDelegate$ShowLoggerType;
import k2b.s$b;
import java.util.Map;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment$a;
import java.lang.Enum;
import k2b.s;
import com.yxcorp.gifshow.v3.previewer.a1;
import android.os.Bundle;
import x59.g;
import com.yxcorp.gifshow.v3.previewer.z0;
import xvc.f;
import evc.c;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.android.model.music.Music;
import lwc.g3;
import yvc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.Objects;
import uv8.o;
import ooc.j0;
import lwc.m2;
import z1.a;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PreviewPlayerStats;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import voc.o;
import java.lang.Throwable;
import w46.b;
import androidx.lifecycle.ViewModel;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.yxcorp.gifshow.v3.previewer.b1;
import com.yxcorp.gifshow.v3.previewer.c1;

public class d1 implements EditorDelegate	// class@001594
{
    public c0 a;
    public final VideoEditPreviewV3Fragment b;

    public void d1(VideoEditPreviewV3Fragment p0){
       this.b = p0;
       super();
       this.a = new c(p0.G);
    }
    public int A(){
       Workspace obj = PatchProxy.apply(null, this, d1.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.M.v();
       int assetsCount = (obj != null)? obj.getAssetsCount(): 1;
       return assetsCount;
    }
    public boolean B(){
       return p.j(this);
    }
    public View C(){
       Object obj = PatchProxy.apply(null, this, d1.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Uh().t;
    }
    public Object D(){
       Object obj = PatchProxy.apply(null, this, d1.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Ph();
    }
    public boolean E(){
       BaseEditorFragment obj = PatchProxy.apply(null, this, d1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.B;
       boolean b = (obj != null && obj.x())? true: false;
       return b;
    }
    public b2 F(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, d1.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.getView() != null) {
          return this.b.getView().findViewById(0x7f0a0c9d);
       }
       return objArray;
    }
    public void G(int p0,int p1,int p2,boolean p3,boolean p4){
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uod1, "16")) {
             return;
          }
       }
       h3 oh3 = new h3(this, new j3(this, p3), p3, p0, new d1$a(this, p3, new k3(this, p3)));
       this.b.S.s0(Boolean.valueOf(p4));
       return;
    }
    public EditorItemFunc H(){
       BaseEditorFragment obj = PatchProxy.apply(null, this, d1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.B;
       if (obj == null) {
          return null;
       }
       return obj.k();
    }
    public int I(){
       return p.e(this);
    }
    public BaseEditorPreviewContainerLayout J(){
       Object obj = PatchProxy.apply(null, this, d1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Uh().g0();
    }
    public v K(EditorItemFunc p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d1.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Oh(p0);
    }
    public a L(){
       return p.g(this);
    }
    public void M(int p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(d1.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, d1.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "movePlayerView pullUpHeight:"+p0+",marginTop:"+p1+",marginBottom:"+p2+",isPullUp:"+p3, objArray);
       this.G(p0, p1, p2, p3, true);
       return;
    }
    public c N(){
       return this.b.M;
    }
    public c0 O(){
       return this.a;
    }
    public BaseEditor P(EditorItemFunc p0){
       BaseEditorFragment obj = PatchProxy.applyOneRefs(p0, this, d1.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.B;
       if (obj == null) {
          return null;
       }
       return obj.n(p0);
    }
    public void Q(int p0,int p1,int p2,int p3,boolean p4){
       if (PatchProxy.isSupport(d1.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, d1.class, "17")) {
             return;
          }
       }
       this.b.S.s0(new i3(this, p4, p1, new d1$b(this, p4)));
       return;
    }
    public s$b a(EditorDelegate$ShowLoggerType p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, d1.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.h1.get(p0) == null) {
          boolean b = true;
          d1 uod1 = -1;
          switch (VideoEditPreviewV3Fragment$a.b[p0.ordinal()]){
              case 1:
              case 2:
                i = 407;
                break;
              case 3:
                i = 1382;
                break;
              case 4:
                i = 408;
                break;
              case 5:
                i = 409;
                break;
              case 6:
                i = 410;
                break;
              case 7:
                i = 1021;
                break;
              default:
                i = -1;
          }
          if (i != uod1) {
             this.b.h1.put(p0, s.a(i, b));
          }
       }
       return this.b.h1.get(p0);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d1.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "dismissBubble", objArray);
       this.b.Q.s0(a1.a);
       return;
    }
    public Bundle c(){
       Object obj = PatchProxy.apply(null, this, d1.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getArguments();
    }
    public g d(){
       return p.a(this);
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, d1.class, "27")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "updateMusic", objArray);
       this.b.J.s0(z0.a);
       return;
    }
    public f f(){
       return this.b.J1;
    }
    public void g(c p0){
       this.b.q1 = p0;
    }
    public Activity getContext(){
       Object obj = PatchProxy.apply(null, this, d1.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getActivity();
    }
    public Intent getIntent(){
       FragmentActivity obj = PatchProxy.apply(null, this, d1.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.getActivity();
       if (obj == null) {
          return new Intent();
       }
       return obj.getIntent();
    }
    public String getTaskId(){
       return this.b.V0;
    }
    public Workspace$Type getType(){
       Object obj = PatchProxy.apply(null, this, d1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Sh();
    }
    public boolean h(){
       BaseEditorFragment obj = PatchProxy.apply(null, this, d1.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.B;
       boolean b = (obj != null && (obj.i() && !DraftUtils.I(this.b.M)))? true: false;
       return b;
    }
    public void i(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "refreshEditor editorItemFunc:"+p0, objArray);
       BaseEditorFragment b = this.b.B;
       if (b != null) {
          b.B(p0);
       }
       return;
    }
    public f j(){
       return this.b.O;
    }
    public void k(Music p0,int p1,String p2){
       if (PatchProxy.isSupport(d1.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, d1.class, "23")) {
          return;
       }
       this.b.O.s0(new g3(p0, p1, p2));
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, d1.class, "26")) {
          return;
       }
       Object[] objArray = new Object[0];
       this.b.Qd(0);
       return;
    }
    public int m(){
       return 0x7f0a0936;
    }
    public boolean n(){
       Object obj = PatchProxy.apply(null, this, d1.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.ai();
    }
    public void o(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d1.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "refreshEditor editorItem:"+p0, objArray);
       BaseEditorFragment b = this.b.B;
       if (b != null) {
          b.C(p0);
       }
       return;
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, d1.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.B.u();
    }
    public BaseFragment q(){
       return this.b;
    }
    public void r(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d1.class, "25")) {
          return;
       }
       this.b.mi();
       d1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, VideoEditPreviewV3Fragment.class, "61")) {
          Object[] objArray1 = new Object[0];
          a.D().w("EditCostVideoEditPreviewV3Fragment", "updateVideoContextNextStep", objArray1);
          if (tb.G != null) {
             if (tb.B != null) {
                tb.F1.p0().c(new m2(tb));
             }
             VideoEditPreviewV3Fragment g = tb.G;
             if (g != null && g.getPreviewPlayerStats() != null) {
                tb.L.e().H0(tb.G.getPreviewPlayerStats().decoderType());
             }
          }
       }
    label_0070 :
       return;
    }
    public ViewModel s(Class p0){
       return p.h(this, p0);
    }
    public void t(double p0){
       this.b.r1 = p0;
    }
    public Map u(){
       return this.b.R;
    }
    public RelativeLayout v(){
       return this.b.H;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, d1.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "refreshEditors", objArray);
       this.b.gi();
       return;
    }
    public o x(){
       return this.b.L;
    }
    public void y(boolean p0){
       d1 uod1 = d1.class;
       if (PatchProxy.isSupport(uod1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod1, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditCostVideoEditPreviewV3Fragment", "showTitleView show:"+p0, objArray);
       if (p0) {
          this.b.getActivity().Z3();
          this.b.J.s0(b1.a);
       }else {
          this.b.getActivity().P3();
          this.b.J.s0(c1.a);
       }
       return;
    }
    public View z(){
       return this.b.G;
    }
}
