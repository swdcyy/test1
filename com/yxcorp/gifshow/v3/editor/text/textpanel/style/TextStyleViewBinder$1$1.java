package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
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
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import java.util.List;
import java.util.Collection;
import java.lang.Number;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleDataManager$a;
import qrd.l1;

public final class TextStyleViewBinder$1$1 extends Lambda implements l	// class@0014d0
{
    public final TextStyleViewBinder$1 this$0;

    public void TextStyleViewBinder$1$1(TextStyleViewBinder$1 p0){
       this.this$0 = p0;
       super(1);
    }
    public final Object invoke(Object p0){
       TextStyleViewBinder obj = PatchProxy.applyOneRefs(p0, this, TextStyleViewBinder$1$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       l1 ol1 = null;
       if (!p0 instanceof EditDecorationContainerView) {
          p0 = ol1;
       }
       if (p0 != null) {
          p0 = p0.getTopElement();
          if (p0 != null) {
             obj = this.this$0.b.m;
             a.o(p0, "topElement");
             int layerIndex = p0.getLayerIndex();
             TextStyleViewBinder i = this.this$0.b.i;
             TextStyleAttrs obj1 = null;
             Objects.requireNonNull(obj);
             if (!PatchProxy.isSupport(TextElementViewModel.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(layerIndex), obj1, Boolean.valueOf(i), obj, TextElementViewModel.class, "26")) {
                Pair value = obj.U0(i).getValue();
                if (value != null) {
                   Object obj2 = value.getFirst();
                   if (obj2 != null) {
                      int i1 = obj2.i();
                      obj1 = obj.E.getValue();
                      List list = (obj1 != null)? obj1.a(): ol1;
                      int i2 = 1;
                      int i3 = (list == null || list.isEmpty())? 1: 0;
                      if (!i3) {
                         i1 = list.get(((i1 + 1) % list.size())).intValue();
                      }
                      obj2.j();
                      obj2.l(i1);
                      TextStyleValue.c(obj2, ol1, i2, ol1);
                      if (i != null) {
                         obj.t1(layerIndex, obj2, i2);
                      }else {
                         TextElementViewModel.B1(obj, layerIndex, obj2, 0, 1, false, 4, null);
                      }
                   }
                }
             }
             ol1 = l1.a;
          }
       }
       return ol1;
    }
}
