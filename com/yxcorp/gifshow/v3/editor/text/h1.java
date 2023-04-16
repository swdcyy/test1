package com.yxcorp.gifshow.v3.editor.text.h1;
import uxb.u;
import java.lang.Object;
import r1c.h;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.text.v0$a;
import com.yxcorp.gifshow.v3.editor.text.v0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Number;
import kuc.a;
import kotlin.jvm.internal.a;
import evc.c;
import voc.o;
import crd.b;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.e$h;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.v3.editor.text.g1;
import erd.o;
import com.yxcorp.gifshow.v3.editor.text.e1;
import com.yxcorp.gifshow.v3.editor.text.f1;
import erd.g;
import com.yxcorp.gifshow.v3.editor.i;
import aw9.z;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import lwc.h;
import com.yxcorp.gifshow.v3.editor.j;
import huc.l1;
import hba.a;
import java.lang.Float;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Text$b;
import com.kuaishou.edit.draft.FeatureId;
import huc.d;
import com.kuaishou.edit.draft.StickerResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.StickerResult$b;
import htc.c;
import juc.c;
import android.graphics.Bitmap;
import voc.l;
import huc.c;
import luc.a;
import nuc.a;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import d0c.d;
import java.lang.Boolean;
import cvc.a;
import cvc.a$a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextFixedContainerWidthElement;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;

public class h1 implements u	// class@001457
{

    public void h1(){
       super();
    }
    public List AV(h p0,c p1,EditorSdk2V2$VideoEditorProject p2,Object p3){
       p0 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, h1.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(new v0(new v0$a(p1)));
       return uArrayList;
    }
    public void Fn(BaseFragment p0){
    }
    public int Gk(String p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, h1.class, "6");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          a.p(p0, "textId");
          i = (p0.hashCode() == -1972576896 && p0.equals("shadow_01"))? 0x7f082390: 0;
       }
       return i;
    }
    public float Qq(){
       return 0x3f333333;
    }
    public String R10(){
       return "°¡";
    }
    public b VN(c p0,o p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, h1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p1.e().F().d.u = p0.a();
       p1.v = (long)p0.c;
       return t.just(p0).observeOn(d.c).flatMap(g1.b).subscribe(e1.b, f1.b);
    }
    public void Yx(i p0,z p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h1.class, "4")) {
          return;
       }
       k1.c(p0.f(), false).q1((int)p1.g(), p0.l());
       return;
    }
    public boolean bo(j p0){
       return p0 instanceof l1;
    }
    public void fF(a p0,String p1,String p2,String p3,float p4){
       h1 oh1 = h1.class;
       if (PatchProxy.isSupport(oh1)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Float.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, oh1, "1")) {
             return;
          }
       }
       p0.c0();
       Text$b uob = p0.k();
       uob.h(d.e(p3));
       StickerResult$b uob1 = uob.getResult().toBuilder();
       uob1.f(0x3f000000);
       uob1.g(0x3f000000);
       uob1.t(0x3f800000);
       uob1.v(0x3f800000);
       uob1.s(0);
       uob1.w(0);
       Bitmap uBitmap = l.b(c.G(p1, p2, p3), p4);
       if (uBitmap != null) {
          uob1.l(p0.N(uBitmap, ".png"));
       }
       uob.j(uob1);
       uob.m(p1);
       uob.o(p2);
       uob.e("SourceHanSansCN-Bold.otf");
       uob.h(d.e(p3));
       p0.f();
       return;
    }
    public c i70(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.apply(null, this, h1.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(null, null, a.class, "5");
       if (obj != patchProxyRe) {
       }else {
          obj = new a(a.a("shadow_01"), a.b("shadow_01"), null);
       }
       return obj;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean ov(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, h1.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "textId");
          int i = p0.hashCode();
          if (i != -1661203175) {
             if (i != 0x3d9dbeba) {
                if (i != 0x3ec3fae4 || !p0.equals("20201230_white")) {
                label_005a :
                   b = false;
                }
             }else if(p0.equals("20201230_black")){
             }
          }else if(p0.equals("20201230_yellow")){
          }
          b = true;
       }
       return b;
    }
    public void w1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h1.class, "5")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "4")) {
          a.d.a(p0);
       }
       return;
    }
    public EditDecorationBaseDrawer zv(EditDecorationBaseDrawer p0){
       EditTextFixedContainerWidthElement obj = PatchProxy.applyOneRefs(p0, this, h1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 instanceof EditTextFixedContainerWidthElement) {
          obj = new EditTextFixedContainerWidthElement(p0.getEditTextBaseElementData(), "", false);
          p0.cloneBaseParam(obj);
       }else if(p0 instanceof EditTextBaseElement){
          EditTextBaseElement uEditTextBas = new EditTextBaseElement(p0.getEditTextBaseElementData(), "", false);
          p0.cloneBaseParam(uEditTextBas);
       }
       return obj;
    }
}
