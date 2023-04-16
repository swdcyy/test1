package com.yxcorp.gifshow.v3.previewer.z;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.lang.Object;
import pwc.b;
import uwc.b;
import com.yxcorp.gifshow.widget.l;
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
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager;
import tyc.b2;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.previewer.z$a;
import lwc.y0;
import android.animation.AnimatorListenerAdapter;
import t36.f$a;
import t36.f;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout;
import voc.v;
import mrd.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import aw9.c0;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import ooc.g;
import lwc.x0;
import com.yxcorp.gifshow.v3.editor.EditorDelegate$ShowLoggerType;
import k2b.s$b;
import java.util.Map;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment$d;
import java.lang.Enum;
import k2b.s;
import com.yxcorp.gifshow.v3.previewer.w;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import x59.g;
import xvc.f;
import evc.c;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import android.content.Intent;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.Objects;
import com.kuaishou.android.model.music.Music;
import lwc.w0;
import yvc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import uv8.o;
import ooc.j0;
import lwc.u;
import z1.a;
import androidx.lifecycle.ViewModel;
import android.widget.RelativeLayout;
import voc.o;
import com.yxcorp.gifshow.v3.EditorActivity;
import com.yxcorp.gifshow.v3.previewer.x;
import com.yxcorp.gifshow.v3.previewer.y;

public class z implements EditorDelegate	// class@00161b
{
    public c0 a;
    public final PhotosEditPreviewV3Fragment b;

    public void z(PhotosEditPreviewV3Fragment p0){
       this.b = p0;
       super();
       this.a = new b(p0.p1, p0.H);
    }
    public int A(){
       Object obj = PatchProxy.apply(null, this, z.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int assetsCount = (this.b.Y.v() != null)? this.b.Y.v().getAssetsCount(): 0;
       return assetsCount;
    }
    public boolean B(){
       return p.j(this);
    }
    public View C(){
       Object obj = PatchProxy.apply(null, this, z.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Ih().t;
    }
    public Object D(){
       Object obj = PatchProxy.apply(null, this, z.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Object();
    }
    public boolean E(){
       BaseEditorFragment obj = PatchProxy.apply(null, this, z.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.B;
       boolean b = (obj != null && obj.x())? true: false;
       return b;
    }
    public b2 F(){
       return p.f(this);
    }
    public void G(int p0,int p1,int p2,boolean p3,boolean p4){
       z oz = z.class;
       if (PatchProxy.isSupport(oz)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, oz, "14")) {
             return;
          }
       }
       z$a uoa = null;
       if (p4) {
          uoa = new z$a(this, p3);
       }
       y0 oy0 = new y0(this, p3, p0, p4, uoa);
       this.b.f1.s0(Boolean.valueOf(p4));
       return;
    }
    public EditorItemFunc H(){
       BaseEditorFragment obj = PatchProxy.apply(null, this, z.class, "1");
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
       EditorPreviewContainerLayout uEditorPrevi = PatchProxy.apply(null, this, z.class, "10");
       if (uEditorPrevi != PatchProxyResult.class) {
       }else {
          uEditorPrevi = this.b.Ih().h0();
       }
       return uEditorPrevi;
    }
    public v K(EditorItemFunc p0){
       return null;
    }
    public a L(){
       return this.b.c1;
    }
    public void M(int p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(z.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, z.class, "13")) {
          return;
       }
       this.G(p0, p1, p2, p3, true);
       return;
    }
    public c N(){
       return this.b.Y;
    }
    public c0 O(){
       return this.a;
    }
    public BaseEditor P(EditorItemFunc p0){
       BaseEditorFragment obj = PatchProxy.applyOneRefs(p0, this, z.class, "25");
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
       if (PatchProxy.isSupport(z.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, z.class, "15")) {
             return;
          }
       }
       this.b.f1.s0(new x0(this, p4, p1));
       return;
    }
    public s$b a(EditorDelegate$ShowLoggerType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, z.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.O.get(p0) == null) {
          int i = PhotosEditPreviewV3Fragment$d.a[p0.ordinal()];
          z oz = -1;
          if (i != 1 && i != 2) {
             if (i != 3) {
                i = (i != 4)? -1: 410;
             }else {
                i = 1382;
             }
          }else {
             i = 407;
          }
          if (i != oz) {
             this.b.O.put(p0, s.a(i, true));
          }
       }
       return this.b.O.get(p0);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, z.class, "2")) {
          return;
       }
       this.b.d1.s0(w.a);
       return;
    }
    public Bundle c(){
       Object obj = PatchProxy.apply(null, this, z.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getArguments();
    }
    public g d(){
       return this.b.T;
    }
    public void e(){
       p.m(this);
    }
    public f f(){
       return this.b.z1;
    }
    public void g(c p0){
    }
    public Activity getContext(){
       Object obj = PatchProxy.apply(null, this, z.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getActivity();
    }
    public Intent getIntent(){
       Object obj = PatchProxy.apply(null, this, z.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getActivity().getIntent();
    }
    public String getTaskId(){
       return this.b.P;
    }
    public Workspace$Type getType(){
       Object obj = PatchProxy.apply(null, this, z.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Gh();
    }
    public boolean h(){
       BaseEditorFragment obj = PatchProxy.apply(null, this, z.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.B;
       boolean b = (obj != null && obj.i())? true: false;
       return b;
    }
    public void i(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "5")) {
          return;
       }
       z tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, PhotosEditPreviewV3Fragment.class, "68")) {
          BaseEditorFragment b = tb.B;
          if (b != null) {
             b.B(p0);
          }
       }
       return;
    }
    public f j(){
       return this.b.Z0;
    }
    public void k(Music p0,int p1,String p2){
       if (PatchProxy.isSupport(z.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, z.class, "22")) {
          return;
       }
       this.b.Z0.s0(new w0(p0, p1, p2));
       return;
    }
    public void l(){
       p.i(this);
    }
    public int m(){
       return 0x7f0a0936;
    }
    public boolean n(){
       return true;
    }
    public void o(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, z.class, "4")) {
          return;
       }
       z tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, PhotosEditPreviewV3Fragment.class, "67")) {
          BaseEditorFragment b = tb.B;
          if (b != null) {
             b.C(p0);
          }
       }
       return;
    }
    public boolean p(){
       Object obj = PatchProxy.apply(null, this, z.class, "23");
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
       if (PatchProxy.applyVoid(objArray, this, z.class, "24")) {
          return;
       }
       z tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(objArray, tb, PhotosEditPreviewV3Fragment.class, "41")) {
          tb.Y.d1();
          tb.t1.p0().c(new u(tb));
       }
       return;
    }
    public ViewModel s(Class p0){
       return p.h(this, p0);
    }
    public void t(double p0){
    }
    public Map u(){
       return this.b.X0;
    }
    public RelativeLayout v(){
       return null;
    }
    public void w(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, z.class, "3")) {
          return;
       }
       z tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, PhotosEditPreviewV3Fragment.class, "66")) {
          BaseEditorFragment b = tb.B;
          if (b != null) {
             b.D();
          }
       }
       return;
    }
    public o x(){
       return this.b.N;
    }
    public void y(boolean p0){
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oz, "16")) {
          return;
       }
       if (p0) {
          this.b.getActivity().Z3();
          this.b.U0.s0(x.a);
       }else {
          this.b.getActivity().P3();
          this.b.U0.s0(y.a);
       }
       return;
    }
    public View z(){
       Object obj = PatchProxy.apply(null, this, z.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.Ih().r;
    }
}
