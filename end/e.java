package end.e;
import and.a;
import kod.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hnd.f;
import gnd.b;
import end.e$a;
import end.e$h;
import end.e$c;
import end.e$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import end.e$d;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.EditorManager;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextPanelCloseActionV3;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import zmd.a;
import xld.a;
import xvc.b;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import wnd.k;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import wnd.l;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import end.e$e;
import xnd.c;
import wba.r;
import u2.f;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import wnd.h;
import mod.a;
import java.lang.CharSequence;
import end.e$f;
import android.widget.AbsoluteLayout;
import end.e$g;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import end.f;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import end.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcrop.gifshow.v3.editor.text_v3.action.TextPanelOpenActionV3;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import voc.o;
import bvc.b;

public final class e extends a implements a	// class@000daf
{
    public final f B;
    public final e$a C;
    public final e$h D;
    public final e$c E;
    public final e$b F;

    public void e(Fragment p0,View p1,EditorDelegate p2){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "editorDelegate");
       super(p1, p0, p2);
       this.B = b.a(p0);
       this.C = new e$a(this);
       this.D = new e$h(this, p2);
       this.E = new e$c();
       this.F = new e$b(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       super.B();
       k1.r(new e$d(this), 5);
       return;
    }
    public void C(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "12")) {
          return;
       }
       super.C();
       if (!PatchProxy.applyVoid(objArray, this, uoe, "14")) {
          BaseFragment uBaseFragmen = this.Q().q();
          if (!uBaseFragmen instanceof BaseEditorFragment) {
             uBaseFragmen = objArray;
          }
          if (uBaseFragmen != null) {
             objArray = uBaseFragmen.B;
          }
          if (objArray != null) {
             objArray.F(this.F);
          }
       }
       return;
    }
    public void M(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.i0(false);
       this.s0().t0(new TextPanelCloseActionV3(this.s0().o0().o()));
       return;
    }
    public DecorationContainerView$d N(){
       return this.C;
    }
    public void O7(a p0,a p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "1")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       List list = (p0.B())? p0.i(): CollectionsKt__CollectionsKt.E();
       List list1 = (p1.B())? p1.i(): CollectionsKt__CollectionsKt.E();
       List list2 = list1;
       if (p0.B() && (a.g(list, list2) ^ 1)) {
          l ol = new l(this.S(), list, list2, this.E, new e$e(this));
          h.b(new k(list, list2)).e(v10);
       }
       this.d0(p0.o(), p1.o());
       NewTextBaseElementData newTextBaseE = h.l(list, p0.o());
       boolean b = false;
       if (!p0.C().f() && p1.C().f()) {
          this.F();
          if (newTextBaseE != null) {
             String str = newTextBaseE.F0();
             if (str != null) {
                EditDecorationContainerViewV2 uEditDecorat = (!str.length())? 1: null;
                if (uEditDecorat == 1) {
                   this.S().post(new e$f(this));
                }
             }
          }
          if (!this.h0()) {
             this.S().post(new e$g(this));
          }
       }else if(p0.C().f() && !p1.C().f()){
          this.S().setDelegate(this.a0());
       }
       this.c0(p0.C(), p1.C());
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uoe, "5")) {
          if (!p0.E() && p1.E()) {
             this.S().setMEnableHideDecorationView(1);
             this.k0();
             this.S().post(new f(this));
          }else if(p0.E() && !p1.E()){
             this.S().setMEnableHideDecorationView(b);
             this.j0();
          }
       }
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "6") || (!this.T() && this.W() != null)) {
          if (p0.q() && this.t0(p0)) {
             EditDecorationBaseDrawer uEditDecorat1 = this.S().I0();
             if (uEditDecorat1 == null) {
                this.o0(b);
             }
             if (uEditDecorat1 != null) {
                long l = (this.U())? 300: 0;
                this.W().postDelayed(new g(this, uEditDecorat1), l);
             }
          }else if(!this.W().getVisibility() && (!this.t0(p0) || p0.o() >= 0)){
             this.W().setVisibility(8);
          }
          if (p0.E()) {
             this.o0(1);
          }
       }
    label_019b :
       return;
    }
    public a P(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s0().o0().C();
    }
    public EditReduxViewModel Z(){
       return this.s0();
    }
    public EditDecorationContainerView$b a0(){
       return this.D;
    }
    public boolean g0(){
       Object obj = PatchProxy.apply(null, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.s0().o0().C().f() && this.s0().u0().C().f())? true: false;
       return b;
    }
    public boolean h0(){
       Object obj = PatchProxy.apply(null, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s0().o0().E();
    }
    public void r0(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       EditDecorationBaseDrawer selectDrawer = this.S().getSelectDrawer();
       if (selectDrawer != null) {
          if (this.D.d(selectDrawer)) {
             this.i0(true);
             a.o(selectDrawer, "it");
             this.s0().t0(new TextPanelOpenActionV3(selectDrawer.getLayerIndex()));
          }else {
             Object[] objArray = new Object[0];
             a.D().w("SubtitlePreviewViewBinderV3", "selected Drawer has inVisible when start edit.", objArray);
          }
       }
       return;
    }
    public f s0(){
       return this.B;
    }
    public final boolean t0(a p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.h0() && (!p0.C().f() && this.Q().H() == null)) {
          o oo = this.Q().x();
          a.o(oo, "editorDelegate.editorContext");
          if (!oo.b().d()) {
             b = true;
          label_0047 :
             return b;
          }
       }
       b = false;
       goto label_0047 ;
    }
    public final boolean u0(){
       Object obj = PatchProxy.apply(null, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s0().o0().C().f();
    }
}
