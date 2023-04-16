package end.b;
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
import end.b$a;
import end.b$g;
import end.b$h;
import end.b$c;
import end.b$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import end.b$d;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.EditorManager;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import zmd.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import wnd.k;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import wnd.l;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import xnd.c;
import wba.r;
import nsd.u;
import u2.f;
import xld.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import wnd.h;
import mod.a;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import wnd.b;
import java.lang.CharSequence;
import end.b$e;
import android.widget.AbsoluteLayout;
import end.b$f;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import end.c;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import end.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import voc.o;
import bvc.b;

public final class b extends a implements a	// class@000da4
{
    public final f B;
    public final b$a C;
    public final b$g D;
    public final b$h E;
    public final b$c F;
    public final b$b G;

    public void b(Fragment p0,View p1,EditorDelegate p2){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "editorDelegate");
       super(p1, p0, p2);
       this.B = b.a(p0);
       this.C = new b$a(this, p0);
       this.D = new b$g(this, p2);
       this.E = new b$h(this);
       this.F = new b$c(this, p2);
       this.G = new b$b(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       super.B();
       k1.r(new b$d(this), 5);
       return;
    }
    public void C(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "11")) {
          return;
       }
       super.C();
       if (!PatchProxy.applyVoid(objArray, this, uob, "13")) {
          BaseFragment uBaseFragmen = this.Q().q();
          if (!uBaseFragmen instanceof BaseEditorFragment) {
             uBaseFragmen = objArray;
          }
          if (uBaseFragmen != null) {
             objArray = uBaseFragmen.B;
          }
          if (objArray != null) {
             objArray.F(this.G);
          }
       }
       return;
    }
    public DecorationContainerView$d N(){
       return this.C;
    }
    public void O7(a p0,a p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "1")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       List list = (p0.B())? p0.i(): CollectionsKt__CollectionsKt.E();
       List list1 = (p1.B())? p1.i(): CollectionsKt__CollectionsKt.E();
       List list2 = list1;
       if (p0.B() && (a.g(list, list2) ^ 1)) {
          l ol = new l(this.S(), list, list2, this.F, null, 16, null);
          h.b(new k(list, list2)).e(v12);
       }
       this.d0(p0.o(), p1.o());
       NewTextBaseElementData newTextBaseE = h.l(list, p0.o());
       b = false;
       if (!p0.C().f() && p1.C().f()) {
          b.d(this.S(), this.s0(), 1, this.s0().o0().w());
          this.F();
          if (newTextBaseE != null) {
             String str = newTextBaseE.F0();
             if (str != null) {
                EditDecorationContainerViewV2 uEditDecorat = (!str.length())? 1: null;
                if (uEditDecorat == 1) {
                   this.S().post(new b$e(this));
                }
             }
          }
          if (!this.h0()) {
             this.S().post(new b$f(this));
          }
       }else if(p0.C().f() && !p1.C().f()){
          this.S().setDelegate(this.a0());
       }
       this.c0(p0.C(), p1.C());
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "4")) {
          if (!p0.E() && p1.E()) {
             this.S().setMEnableHideDecorationView(1);
             this.k0();
             this.S().post(new c(this));
          }else if(p0.E() && !p1.E()){
             this.S().setMEnableHideDecorationView(b);
             this.j0();
          }
       }
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "5") || (!this.T() && this.W() != null)) {
          if (p0.q() && this.t0(p0)) {
             EditDecorationBaseDrawer uEditDecorat1 = this.S().I0();
             if (uEditDecorat1 == null) {
                this.o0(b);
             }
             if (uEditDecorat1 != null) {
                long l = (this.U())? 300: 0;
                this.W().postDelayed(new d(this, uEditDecorat1), l);
             }
          }else if(!this.W().getVisibility() && (!this.t0(p0) || p0.o() >= 0)){
             this.W().setVisibility(8);
          }
          if (p0.E()) {
             this.o0(1);
          }
       }
    label_01b3 :
       return;
    }
    public a P(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
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
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.s0().o0().C().f() && this.s0().u0().C().f())? true: false;
       return b;
    }
    public boolean h0(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s0().o0().E();
    }
    public void r0(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       EditDecorationBaseDrawer selectDrawer = this.S().getSelectDrawer();
       if (selectDrawer != null) {
          if (this.D.d(selectDrawer)) {
             super.r0();
          }else {
             Object[] objArray = new Object[0];
             a.D().w("SubtitlePreviewViewBinder", "selected Drawer has inVisible when start edit.", objArray);
          }
       }
       return;
    }
    public f s0(){
       return this.B;
    }
    public final boolean t0(a p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
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
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.s0().o0().C().f();
    }
}
