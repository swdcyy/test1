package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$p;
import wpc.a0;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import wpc.z;
import com.kuaishou.edit.draft.AssetSegment;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import vpc.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$p$a;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.LinkedList;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import erd.r;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import hba.a;
import uuc.e;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import huc.k1;
import com.yxcorp.gifshow.edit.previewer.utils.d;
import java.lang.Float;
import com.kuaishou.edit.draft.CropOptions;
import com.kuaishou.edit.draft.Transform;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;

public final class TextElementViewBinder$p implements a0	// class@001411
{
    public final TextElementViewBinder a;

    public void TextElementViewBinder$p(TextElementViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(){
       z.d(this);
    }
    public void b(){
       z.b(this);
    }
    public void c(AssetSegment p0,Size p1,Size p2,c p3){
       TextElementViewBinder a;
       Iterator iterator1;
       String str4;
       String str5;
       PatchProxyResult patchProxyRe1;
       String str6;
       String str7;
       DecorationDrawer uDecorationD4;
       String str9;
       String str10;
       Size second;
       CropOptions cropOptions;
       double d;
       double d7;
       double d8;
       int height;
       int i2;
       TextElementViewBinder$p op = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, TextElementViewBinder$p.class, "1")) {
          return;
       }
       String str = "assetSegment";
       a.p(oobject, str);
       String str1 = "outputSize";
       a.p(oobject1, str1);
       String str2 = "originSize";
       a.p(oobject2, str2);
       z.e(this, p0, p1, p2, p3);
       String str3 = ", cropOptions:";
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewBinder", "relayoutTextElement outputSize:"+oobject1+", originSize:"+oobject2+str3+oobject, objArray);
       EditDecorationContainerView uEditDecorat = op.a.J();
       TextElementViewBinder$p$a op$a = new TextElementViewBinder$p$a(op, oobject);
       Objects.requireNonNull(uEditDecorat);
       ArrayList uArrayList = PatchProxy.applyOneRefs(op$a, uEditDecorat, EditDecorationContainerView.class, "49");
       if (uArrayList != patchProxyRe) {
       }else {
          ArrayList uArrayList1 = new ArrayList();
          int i1 = 0;
          while (i1 < uEditDecorat.l.size()) {
             try{
                if (op$a.test(uEditDecorat.l.get(i1))) {
                   uArrayList1.add(uEditDecorat.l.get(i1));
                }
                i2 = uEditDecorat;
             }catch(java.lang.Exception e0){
                i2 = uEditDecorat;
                PostUtils.D("EditDecorationContainerView", "findDecorationList", e0);
             }
             i1 = i1 + 1;
             uEditDecorat = i2;
             a = null;
          }
          uArrayList = uArrayList1;
       }
       a.o(uArrayList, "mContainerView.findDecor¡­BaseElementData>\)\n      }");
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          DecorationDrawer uDecorationD = iterator.next();
          a = op.a.A;
          Objects.requireNonNull(uDecorationD, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement<out com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData>");
          DecorationDrawer uDecorationD1 = uDecorationD;
          Objects.requireNonNull(a);
          TextElementViewModel textElementV = TextElementViewModel.class;
          if (PatchProxy.isSupport(textElementV)) {
             objArray = new Object[]{uDecorationD1,oobject,oobject1,oobject2,oobject3};
             if (PatchProxy.applyVoid(objArray, a, textElementV, "43")) {
                iterator1 = iterator;
                str4 = str3;
                str5 = str2;
                patchProxyRe1 = patchProxyRe;
                str6 = str;
                str7 = str1;
                str1 = null;
             label_0322 :
                op = this;
                oobject = p0;
                oobject1 = p1;
                oobject2 = p2;
                oobject3 = p3;
                str = str6;
                str1 = str7;
                iterator = iterator1;
                str3 = str4;
                str2 = str5;
                patchProxyRe = patchProxyRe1;
             }
          }
          a.p(uDecorationD1, "editTextBaseElement");
          a.p(oobject, str);
          a.p(oobject1, str1);
          a.p(oobject2, str2);
          if (!a.F.i().D()) {
             a.F.i().c0();
          }
          EditTextBaseElementData editTextBase = uDecorationD1.getEditTextBaseElementData();
          TextElementViewBinder textElementV1 = a;
          iterator1 = iterator;
          DecorationDrawer uDecorationD2 = uDecorationD1;
          Object[] objArray1 = new Object[0];
          str4 = "relayoutTextElement elementData:";
          String double a1 = "TextElementViewModel";
          a.D().w(a1, "relayoutTextElement elementData:"+editTextBase+", outputSize:"+oobject1+", "+"originSize:"+oobject2+str3+oobject, objArray1);
          Minecraft$AssetTransform uAssetTransf = k1.b(editTextBase);
          if (oobject3 != null) {
             d.m(oobject3.a, uAssetTransf, oobject3.c, oobject3.b);
             k1.a(uAssetTransf, editTextBase);
          }
          uAssetTransf = k1.b(editTextBase);
          EditTextBaseElementData uEditTextBas = editTextBase;
          DecorationDrawer uDecorationD3 = uDecorationD2;
          str6 = str;
          TextElementViewBinder textElementV2 = textElementV1;
          String str8 = str4;
          str = a1;
          str7 = str1;
          int i = 0;
          str4 = str3;
          str5 = str2;
          Float uFloat = PatchProxy.applyFourRefs(p0, uAssetTransf, p1, p2, 0, d.class, "10");
          if (uFloat != patchProxyRe) {
             uDecorationD4 = uDecorationD3;
             str9 = str8;
             patchProxyRe1 = patchProxyRe;
             str10 = str;
          }else {
             cropOptions = p0.getCropOptions();
             Transform transform = cropOptions.getTransform();
             a1 = 100.00f;
             d = transform.getPositionX() * a1;
             double d1 = transform.getPositionY() * a1;
             second = (!cropOptions.getWidth())? oobject2.b: cropOptions.getWidth();
             a1 = (double)second;
             second = (!cropOptions.getHeight())? oobject2.c: cropOptions.getHeight();
             str10 = str;
             a1 = a1 * 0x3ff0000000000000;
             patchProxyRe1 = patchProxyRe;
             uDecorationD4 = uDecorationD3;
             a1 = a1 / (double)oobject2.b;
             a1 = a1 * 100.00f;
             double d2 = (double)second * 0x3ff0000000000000;
             str9 = str8;
             d2 = d2 / (double)oobject2.c;
             d2 = d2 * 100.00f;
             double d3 = uAssetTransf.positionX();
             double d4 = uAssetTransf.positionY();
             double d5 = 360.00f;
             double d6 = cropOptions.getTransform().getRotate() % d5;
             if (!d6) {
                d3 = d3 - d;
                d3 = d3 / a1;
                d7 = 100.00f;
                d3 = d3 * d7;
                uAssetTransf.setPositionX(d3);
                d4 = d4 - d1;
                d4 = d4 / d2;
                d4 = d4 * d7;
                uAssetTransf.setPositionY(d4);
             }else {
                d7 = 100.00f;
                d6 = cropOptions.getTransform().getRotate() % d5;
                if (!d6 - 0x4056800000000000) {
                   d4 = d4 - d1;
                   d4 = d4 / d2;
                   d4 = d4 * d7;
                   uAssetTransf.setPositionX(d4);
                   d3 = d7 - d3;
                   d8 = d7 - d;
                   d8 = d8 - a1;
                   d3 = d3 - d8;
                   d3 = d3 / a1;
                   d3 = d3 * d7;
                   uAssetTransf.setPositionY(d3);
                }else {
                   d6 = cropOptions.getTransform().getRotate() % d5;
                   if (!d6 - 0x4070e00000000000) {
                      d4 = d7 - d4;
                      d1 = d7 - d1;
                      d1 = d1 - d2;
                      d4 = d4 - d1;
                      d4 = d4 / d2;
                      d4 = d4 * d7;
                      uAssetTransf.setPositionX(d4);
                      d3 = d3 - d;
                      d3 = d3 / a1;
                      d3 = d3 * d7;
                      uAssetTransf.setPositionY(d3);
                   }else {
                      d6 = cropOptions.getTransform().getRotate() % d5;
                      if (!d6 - 180.00f) {
                         d3 = d7 - d3;
                         d8 = d7 - d;
                         d8 = d8 - a1;
                         d3 = d3 - d8;
                         d3 = d3 / a1;
                         d3 = d3 * d7;
                         uAssetTransf.setPositionX(d3);
                         a1 = d7 - d4;
                         d8 = d7 - d1;
                         d8 = d8 - d2;
                         a1 = a1 - d8;
                         a1 = a1 / d2;
                         a1 = a1 * d7;
                         uAssetTransf.setPositionY(a1);
                      }
                   }
                }
             }
             float f = (float)cropOptions.getTransform().getRotate() % 360.00f;
             f = - f;
             uFloat = Float.valueOf(f);
          }
          k1.a(uAssetTransf, uEditTextBas);
          a.o(uFloat, "extraRotate");
          uEditTextBas.W(uFloat.floatValue());
          Pair pair = textElementV2.z0(uDecorationD4);
          second = pair.getSecond();
          textElementV2.v1(uEditTextBas, second, pair.getFirst(), 23);
          textElementV2.F.i().f();
          objArray = new Object[i];
          a.D().w(str10, str9+uEditTextBas+", subAssetTransform:"+uAssetTransf, objArray);
          goto label_0322 ;
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, TextElementViewBinder$p.class, "2")) {
          return;
       }
       z.h(this);
       this.a.J().R();
       return;
    }
    public void e(EditTextBaseElement p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$p.class, "3")) {
          return;
       }
       z.a(this, p0);
       if (!this.a.P()) {
          return;
       }
       if (p0 != null) {
          p0.getTextDrawerLayout().setAcceptEvent(false);
          TextElementViewBinder.F(this.a, false, 1, null);
       }
       return;
    }
    public void f(){
       z.g(this);
    }
    public void g(EditTextBaseElement p0){
       z.c(this, p0);
    }
    public void h(boolean p0){
       z.f(this, p0);
    }
}
