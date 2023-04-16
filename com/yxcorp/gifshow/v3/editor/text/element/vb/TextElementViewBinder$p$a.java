package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$p$a;
import erd.r;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$p;
import com.kuaishou.edit.draft.AssetSegment;
import java.lang.Object;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import faa.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import q87.c;
import uuc.e;
import java.lang.Integer;
import com.kuaishou.edit.draft.Text;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.StickerResult;

public final class TextElementViewBinder$p$a implements r	// class@001410
{
    public final TextElementViewBinder$p b;
    public final AssetSegment c;

    public void TextElementViewBinder$p$a(TextElementViewBinder$p p0,AssetSegment p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TextElementViewBinder obj = PatchProxy.applyOneRefs(p0, this, TextElementViewBinder$p$a.class, "1");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          if (p0 instanceof EditTextBaseElement) {
             obj = this.b.a.A;
             TextElementViewBinder$p$a tc = this.c;
             Objects.requireNonNull(obj);
             e obj1 = PatchProxy.applyTwoRefs(tc, p0, obj, TextElementViewModel.class, "44");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else {
                a.p(tc, "assetSegment");
                a.p(p0, "editTextBaseElement");
                Object[] objArray = new Object[0];
                a.D().w("TextElementViewModel", "isTextElementInAssetSegment layerIndex:"+p0.getLayerIndex()+", "+"identifier:"+tc.getIdentifier(), objArray);
                TextElementViewModel f = obj.F;
                b = p0.getLayerIndex();
                Objects.requireNonNull(f);
                obj1 = e.class;
                if (PatchProxy.isSupport(obj1)) {
                   obj2 = PatchProxy.applyOneRefs(Integer.valueOf(b), f, obj1, "27");
                   if (obj2 != patchProxyRe) {
                   label_00b7 :
                      b = obj2.getResult();
                      a.o(b, "textElementRepo.layerInd¡­lement.layerIndex\).result");
                      b = b.getAssetIdentifierList().contains(tc.getIdentifier());
                   }
                }
                e c = f.c;
                if (c == null) {
                   a.S("mTextDraft");
                }
                b = c.z().get(f.m(b));
                a.o(b, "mTextDraft.messages[laye¡­raftPosition\(layerIndex\)]");
                obj2 = b;
                goto label_00b7 ;
             }
             if (b) {
                b = true;
             }
          }
          b = false;
       }
       return b;
    }
}
