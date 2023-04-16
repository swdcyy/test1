package com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2;
import voc.n;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2$a;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.n1;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2$c;
import erd.g;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorV2$picTemplateViewModelProvider$2;
import msd.a;
import qrd.p;
import qrd.s;
import voc.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.j;
import uwc.b;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import ytc.h;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateReleaseAction;
import xvc.b;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorFragmentV2;
import itc.l0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.Map;
import qsc.e;
import t36.f;
import buc.c;
import t36.f$a;
import aw9.c0;
import q16.c$a;
import android.content.Intent;
import q16.c$a$a;
import q16.c;
import java.util.ArrayList;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartWithPlcAction;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.template.v2.action.PicTemplateStartEditAction;
import com.yxcorp.gifshow.widget.adv.model.f;
import itc.v;
import androidx.lifecycle.ViewModelProvider;
import buc.i;
import androidx.lifecycle.ViewModel;
import java.lang.Integer;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;
import java.lang.Number;
import fuc.a;

public final class PicTemplateEditorV2 extends n	// class@001342
{
    public final n1 u;
    public final p v;
    public EditDecorationContainerView w;
    public static final PicTemplateEditorV2$a x;

    static {
       PicTemplateEditorV2.x = new PicTemplateEditorV2$a(null);
    }
    public void PicTemplateEditorV2(EditDecorationContainerView p0){
       a.p(p0, "mStickerDecorationContainerView");
       super();
       this.w = p0;
       this.u = new n1(new PicTemplateEditorV2$c(this), 1000);
       this.v = s.c(new PicTemplateEditorV2$picTemplateViewModelProvider$2(this));
    }
    public void C(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplateEditorV2.class, "12")) {
          return;
       }
       a.p(p0, "newContext");
       if (this.f != null) {
          this.Y();
       }
       return;
    }
    public void D(boolean p0){
       PicTemplateEditorV2 picTemplateE = PicTemplateEditorV2.class;
       if (PatchProxy.isSupport(picTemplateE) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, picTemplateE, "8")) {
          return;
       }
       j ts = this.s;
       a.o(ts, "mEditorHelperContract");
       ts.b().F0(true);
       this.u.a(Boolean.valueOf(p0));
       return;
    }
    public boolean F(EditorDelegate p0,View p1){
       h obj = PatchProxy.applyTwoRefs(p0, p1, this, PicTemplateEditorV2.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = h.a;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoid(null, obj, h.class, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "TEMPLATE_BUTTON";
          u1.u0(1, uElementPack, null);
       }
       return super.F(p0, p1);
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, PicTemplateEditorV2.class, "11")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("Pic_Template", "release", objArray);
       this.T().t0(new PicTemplateReleaseAction());
       h1.b();
       return;
    }
    public void H(){
       Object[] objArray1;
       PicTemplateEditorV2 picTemplateE = PicTemplateEditorV2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, picTemplateE, "7")) {
          return;
       }
       j ts = this.s;
       a.o(ts, "mEditorHelperContract");
       boolean b = false;
       ts.b().F0(b);
       BaseEditorFragment uBaseEditorF = this.W();
       this.f = uBaseEditorF;
       uBaseEditorF.uh(this.d, this.i);
       EditorDelegate uEditorDeleg = this.i();
       String str = "delegate";
       a.o(uEditorDeleg, str);
       BaseFragment uBaseFragmen = uEditorDeleg.q();
       a.o(uBaseFragmen, "delegate.previewFragment");
       e uoe = uBaseFragmen.getChildFragmentManager().beginTransaction();
       a.o(uoe, "delegate.previewFragment¡­anager.beginTransaction\(\)");
       uoe.y(R.anim.arg_RES_7f010105, 0x7f01010d);
       this.a("PhotoTemplateEditorFragment2", uoe);
       BaseEditor tf = this.f;
       Objects.requireNonNull(tf, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorFragmentV2");
       tf.I.t = this.w;
       tf = this.d;
       String str1 = "mDelegate";
       a.o(tf, str1);
       if (!PatchProxy.applyVoidOneRefs(tf, this, picTemplateE, "15")) {
          c uoc1 = tf.N();
          a.o(uoc1, "delegate.workspaceDraft");
          if (uoc1.a1() == Workspace$Type.SINGLE_PICTURE) {
             f.p0(tf.u(), e.class).s0(c.a);
          }
       }
       BaseEditor td = this.d;
       a.o(td, str1);
       tf = this.d;
       a.o(tf, str1);
       this.S(td.x(), tf.O());
       this.Y();
       h1.o();
       this.c(this.q(), true);
       c$a$a d = c$a.d;
       uEditorDeleg = this.i();
       a.o(uEditorDeleg, str);
       c$a uoa = d.a(uEditorDeleg.getIntent());
       c uoc = (uoa != null)? uoa.a(): objArray;
       c b1 = (uoc != null)? uoc.b: objArray;
       uoc = (uoc != null)? uoc.a: objArray;
       if (b1 != null && uoc != null) {
          EditorDelegate uEditorDeleg1 = this.i();
          a.o(uEditorDeleg1, str);
          Intent intent = uEditorDeleg1.getIntent();
          Objects.requireNonNull(d);
          if (!PatchProxy.applyVoidOneRefs(intent, d, c$a$a.class, "2")) {
             if (intent != null) {
                intent.removeExtra("pic_template_exist");
             }
             if (intent != null) {
                intent.removeExtra("pic_template_resources");
             }
             if (intent != null) {
                intent.removeExtra("pic_template_ids");
             }
             if (intent != null) {
                intent.removeExtra("pic_template_type");
             }
          }
          EditReduxViewModel uEditReduxVi = this.T();
          ArrayList uArrayList = new ArrayList(b1.length);
          int len = b1.length;
          for (int i = 0; i < len; i = i + 1) {
             uArrayList.add(b1[i]);
          }
          ArrayList uArrayList1 = new ArrayList();
          len = uoc.length;
          while (b < len) {
             object oobject = uoc[b];
             if (!oobject instanceof PicTemplate) {
                oobject = objArray;
             }
             if (oobject != null) {
                uArrayList1.add(oobject);
             }
             b = b + 1;
          }
          uEditReduxVi.t0(new PicTemplateStartWithPlcAction(uArrayList, uArrayList1));
       }else {
          this.T().t0(new PicTemplateStartEditAction());
       }
       return;
    }
    public void Q(o p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PicTemplateEditorV2.class, "16")) {
          return;
       }
       super.Q(p0, p1);
       BaseEditor td = this.d;
       a.o(td, "mDelegate");
       if (td.getType() != Workspace$Type.SINGLE_PICTURE) {
          v.b(this.w, this.q);
       }
       return;
    }
    public EditReduxViewModel U(){
       ViewModel obj = PatchProxy.apply(null, this, PicTemplateEditorV2.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.X().get(i.class);
       a.o(obj, "picTemplateViewModelProv¡­oreViewModel::class.java\)");
       return obj;
    }
    public BaseEditorFragment W(){
       BaseEditorFragment uBaseEditorF;
       BaseEditor obj = PatchProxy.apply(null, this, PicTemplateEditorV2.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       if (obj == null) {
          obj = this.d;
          a.o(obj, "mDelegate");
          BaseFragment uBaseFragmen = obj.q();
          a.o(uBaseFragmen, "mDelegate.previewFragment");
          uBaseEditorF = this.f(uBaseFragmen.getChildFragmentManager(), "PhotoTemplateEditorFragment2", PicTemplateEditorFragmentV2.class);
          this.f = uBaseEditorF;
       }
       if (uBaseEditorF == null) {
          uBaseEditorF = new PicTemplateEditorFragmentV2();
          this.f = uBaseEditorF;
       }
       return uBaseEditorF;
    }
    public final ViewModelProvider X(){
       Object obj = PatchProxy.apply(null, this, PicTemplateEditorV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public final void Y(){
       if (PatchProxy.applyVoid(null, this, PicTemplateEditorV2.class, "14")) {
          return;
       }
       BaseEditor tf = this.f;
       Objects.requireNonNull(tf, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.template.v2.PicTemplateEditorFragmentV2");
       j ts = this.s;
       a.o(ts, "mEditorHelperContract");
       if (!PatchProxy.applyVoidOneRefs(ts, tf, PicTemplateEditorFragmentV2.class, "9")) {
          a.p(ts, "editorHelperContract");
          tf.I.e = ts;
       }
       return;
    }
    public void c(int p0,boolean p1){
       PicTemplateEditorV2 picTemplateE = PicTemplateEditorV2.class;
       if (PatchProxy.isSupport(picTemplateE) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, picTemplateE, "10")) {
          return;
       }
       this.d.G(p0, a1.d(R.dimen.arg_RES_7f0703a1), a1.d(R.dimen.arg_RES_7f0703a1), p1, true);
       return;
    }
    public BaseEditor$a d(){
       Object obj = PatchProxy.apply(null, this, PicTemplateEditorV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseEditor$a(this, 26, this.i);
    }
    public int q(){
       int i1;
       EditorDelegate obj = PatchProxy.apply(null, this, PicTemplateEditorV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.i();
       String str = "delegate";
       a.o(obj, str);
       int i = 0x7f07039a;
       if (obj.getType() == Workspace$Type.SINGLE_PICTURE) {
          i1 = a1.d(i);
       }else {
          EditorDelegate uEditorDeleg = this.i();
          a.o(uEditorDeleg, str);
          View view = uEditorDeleg.z();
          a.o(view, "delegate.previewView");
          i1 = ((a1.d(i) + a1.d(0x7f070c71)) + a.a.a(view)) + a1.d(0x7f070c70);
       }
       return i1;
    }
    public boolean y(){
       return false;
    }
}
