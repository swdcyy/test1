package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$ColorsViewHolder$bind$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$ColorsViewHolder$bind$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$b;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import java.lang.Integer;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import qrd.l1;

public final class TextStyleViewBinder$ColorsViewHolder$bind$1$1 extends Lambda implements l	// class@0014d4
{
    public final TextStyleViewBinder$ColorsViewHolder$bind$1 this$0;

    public void TextStyleViewBinder$ColorsViewHolder$bind$1$1(TextStyleViewBinder$ColorsViewHolder$bind$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public final Object invoke(Object p0){
       TextStyleViewBinder obj = PatchProxy.applyOneRefs(p0, this, TextStyleViewBinder$ColorsViewHolder$bind$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = null;
       if (!p0 instanceof EditDecorationContainerView) {
          p0 = str;
       }
       if (p0 != null) {
          p0 = p0.getTopElement();
          if (p0 != null) {
             obj = this.this$0.b.b.m;
             a.o(p0, "topElement");
             int layerIndex = p0.getLayerIndex();
             TextStyleViewBinder$ColorsViewHolder$bind$1$1 tthis$0 = this.this$0;
             TextStyleViewBinder$ColorsViewHolder$bind$1 c = tthis$0.c;
             TextStyleViewBinder i = tthis$0.b.b.i;
             Objects.requireNonNull(obj);
             if (!PatchProxy.isSupport(TextElementViewModel.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(layerIndex), c, Boolean.valueOf(i), obj, TextElementViewModel.class, "25")) {
                a.p(c, "colorData");
                Pair value = obj.U0(i).getValue();
                if (value != null) {
                   Object obj1 = value.getFirst();
                   if (obj1 != null) {
                      obj1.b(c);
                      if (i != null) {
                         obj.t1(layerIndex, obj1, 3);
                      }else {
                         TextElementViewModel.B1(obj, layerIndex, obj1, 0, 3, false, 4, null);
                      }
                   }
                }
             }
             str = l1.a;
          }
       }
       return str;
    }
}
