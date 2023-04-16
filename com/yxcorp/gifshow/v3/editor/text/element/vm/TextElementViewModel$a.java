package com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel$a;
import z0.a;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Object;
import kotlin.Pair;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.Iterable;
import java.util.Iterator;
import com.kuaishou.edit.draft.Text;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Text$b;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.StickerResult;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Number;
import java.lang.Double;
import uuc.e;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class TextElementViewModel$a implements a	// class@00141b
{
    public final TextElementViewModel a;

    public void TextElementViewModel$a(TextElementViewModel p0){
       this.a = p0;
       super();
    }
    public Object apply(Object p0){
       double d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, TextElementViewModel$a.class, "1");
       if (obj != patchProxyRe) {
       }else if(!p0.getFirst().booleanValue() && (p0.getSecond().isEmpty() ^ 0x01)){
          obj = new ArrayList();
          Iterator iterator = p0.getSecond().iterator();
          while (iterator.hasNext()) {
             Text$b uob = iterator.next().toBuilder();
             a.o(uob, "oldTextBuilder");
             StickerResult result = uob.getResult();
             a.o(result, "oldTextBuilder.result");
             Integer integer = Integer.valueOf(result.getZIndex());
             TextElementViewModel$a ta = this.a;
             GeneratedMessageLite generatedMes = uob.build();
             a.o(generatedMes, "oldTextBuilder.build\(\)");
             Objects.requireNonNull(ta);
             StickerResult obj1 = PatchProxy.applyOneRefs(generatedMes, ta, TextElementViewModel.class, "9");
             if (obj1 != patchProxyRe) {
                d = obj1.doubleValue();
             }else {
                obj1 = generatedMes.getResult();
                String str = "text.result";
                a.o(obj1, str);
                StickerResult result1 = generatedMes.getResult();
                a.o(result1, str);
                double resourceWidt = result1.getResourceWidth();
                resourceWidt = resourceWidt / (double)ta.c;
                d = (double)obj1.getScale() * resourceWidt;
             }
             obj.add(new Pair(integer, Double.valueOf(d)));
          }
          this.a.F.h().clear();
          this.a.F.h().addAll(obj);
       }
       Object[] objArray = new Object[0];
       a.D().w("TextElementViewModel", "mShowOldSubAssetLoadLoading showLoading:"+p0.getFirst().booleanValue(), objArray);
       obj = p0.getFirst();
       return obj;
    }
}
