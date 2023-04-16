package com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.textpanel.style.TextStyleViewBinder$2;
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
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import kotlin.Pair;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import qrd.l1;

public final class TextStyleViewBinder$2$1 extends Lambda implements l	// class@0014d2
{
    public final TextStyleViewBinder$2 this$0;

    public void TextStyleViewBinder$2$1(TextStyleViewBinder$2 p0){
       this.this$0 = p0;
       super(1);
    }
    public final Object invoke(Object p0){
       Integer integer1;
       ClientEvent$ElementPackage uElementPack;
       String str;
       Pair obj = PatchProxy.applyOneRefs(p0, this, TextStyleViewBinder$2$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Integer integer = null;
       if (!p0 instanceof EditDecorationContainerView) {
          p0 = integer;
       }
       if (p0 != null) {
          p0 = p0.getTopElement();
          if (p0 != null) {
             a.o(p0, "topElement");
             this.this$0.b.m.u1(p0.getLayerIndex(), integer, this.this$0.b.i);
             p0 = this.this$0.b;
             obj = p0.m.U0(p0.i).getValue();
             if (obj != null) {
                TextStyleValue first = obj.getFirst();
                if (first != null) {
                   integer1 = Integer.valueOf(first.h());
                label_005d :
                   Objects.requireNonNull(p0);
                   if (!PatchProxy.applyVoidOneRefs(integer1, p0, TextStyleViewBinder.class, "12")) {
                      if (integer1 != null && !integer1.intValue()) {
                         str = "left";
                      }else if(integer1 != null && integer1.intValue() == 1){
                         str = "center";
                      }else {
                         uElementPack = 2;
                         str = (integer1 != null && integer1.intValue() == uElementPack)? "right": "unknown";
                      }
                      uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "ALIGN_TEXT";
                      uElementPack.params = "align_type: "+str;
                      u1.u(1, uElementPack, integer);
                   }
                   integer = l1.a;
                }
             }
             integer1 = integer;
             goto label_005d ;
          }
       }
       return integer;
    }
}
