package com.yxcorp.gifshow.v3.editor.text.element.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h80.c;
import h80.k;
import h80.l;
import com.yxcorp.gifshow.v3.editor.text.element.c$a;
import com.yxcorp.gifshow.v3.editor.text.element.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$g;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import java.util.Set;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.v3.editor.text.element.a;
import com.yxcorp.gifshow.v3.editor.text.element.b;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.view.View;
import suc.c;
import android.view.View$OnClickListener;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import qaa.a;
import hba.a;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Text;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import im8.f;
import java.lang.Integer;
import aw9.z;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;

public class c extends PresenterV2	// class@0013fc
{
    public View A;
    public TextElementViewModel B;
    public h C;
    public final boolean D;
    public final ExpandFoldHelperView$g E;
    public y F;
    public c p;
    public EditorDelegate q;
    public Set r;
    public EditDecorationContainerView$b s;
    public f t;
    public f u;
    public z v;
    public Boolean w;
    public PublishSubject x;
    public EditDecorationContainerView y;
    public ExpandFoldHelperView z;

    public void c(){
       super();
       this.D = k.a().c().a();
       this.E = new c$a(this);
       this.F = new c$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       if (!this.w.booleanValue()) {
          this.z.setPreActionListener(this.E);
       }
       this.r.add(this.F);
       this.y.setDelegate(this.s);
       this.B = k1.c(this.q, this.w.booleanValue());
       this.C = f.l(this.q.q());
       if (this.S8()) {
          c tx = this.x;
          if (tx != null) {
             this.X7(tx.subscribe(new a(this), b.b));
          label_0061 :
             if (this.S8() && (this.A != null && this.p.a1() != Workspace$Type.SINGLE_PICTURE)) {
                this.A.setVisibility(0);
                this.A.setOnClickListener(new c(this));
             }
          label_0085 :
             return;
          }
       }
       this.y.e0();
       goto label_0061 ;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       this.z.setPreActionListener(null);
       this.y.setDelegate(null);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       if (this.w.booleanValue() && (!this.y.getVisibility() && (this.y.getTopElement() != null && this.p.s0().f0() != null))) {
          EditTextBaseElement topElement = this.y.getTopElement();
          topElement.initPainterMaxDimension(this.y);
          Text text = this.p.s0().f0().v();
          if (text != null && !(topElement.getText()).equals(text.getText())) {
             this.B.z1(topElement.getLayerIndex(), text.getText(), 24);
          }else {
             this.B.z1(topElement.getLayerIndex(), topElement.getText(), 6);
          }
       }
       this.y.e0();
       return;
    }
    public int R8(){
       int i;
       c obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = null;
       if (this.w.booleanValue()) {
          if (f.E(this.p.a1()) && this.t != null) {
             obj = this.u;
             i = (obj != null && obj.get().booleanValue())? -10: this.t.get().intValue();
          }
       }else if(f.E(this.p.a1())){
          c tv = this.v;
          if (tv != null) {
             i = (int)tv.g();
          }
       }
       return i;
    }
    public boolean S8(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.E(this.p.a1());
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a2eff);
       this.A = m1.f(p0, 0x7f0a309c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("WORKSPACE");
       this.q = this.r8("EDITOR_DELEGATE");
       this.r = this.r8("EDITOR_VIEW_LISTENERS");
       this.s = this.r8("SHOWING_DELEGATE");
       this.t = this.w8("CURRENT_POSITION");
       this.u = this.w8("COMBINED_SWITCHER_ON");
       this.v = this.t8("DECORATION_PLAYER");
       this.w = this.r8("IS_COVER_PANEL");
       this.x = this.t8("ADJUST_DECORATION_VIEW_SIZE_PUBLISHER");
       this.y = this.r8("DECORATION_CONTAINER_VIEW");
       return;
    }
}
