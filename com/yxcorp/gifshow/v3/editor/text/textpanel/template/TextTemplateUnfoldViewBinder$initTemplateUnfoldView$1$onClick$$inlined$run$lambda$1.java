package com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1$onClick$$inlined$run$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1;
import ypc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import gvc.j;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1$onClick$$inlined$run$lambda$1$a;
import java.lang.Runnable;
import t45.c;
import gvc.b;
import qrd.l1;

public final class TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1$onClick$$inlined$run$lambda$1 extends Lambda implements l	// class@0014e9
{
    public final a $textBubbleModel$inlined;
    public final TextElementViewModel $this_run;
    public final TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1 this$0;

    public void TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1$onClick$$inlined$run$lambda$1(TextElementViewModel p0,TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1 p1,a p2){
       this.$this_run = p0;
       this.this$0 = p1;
       this.$textBubbleModel$inlined = p2;
       super(1);
    }
    public final Object invoke(Object p0){
       DecorationContainerView obj = PatchProxy.applyOneRefsWithListener(p0, this, TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1$onClick$$inlined$run$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1$onClick$$inlined$run$lambda$1 oinitTemplat = null;
       obj = (!p0 instanceof EditDecorationContainerView)? oinitTemplat: p0;
       if (obj) {
          EditDecorationBaseDrawer selectDrawer = obj.getSelectDrawer();
          if (selectDrawer != null) {
             TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1 a = this.this$0.a;
             if (a.f != 256) {
                TextConfigParam textConfigPa = this.$textBubbleModel$inlined.p();
                a.m(textConfigPa);
                a.o(textConfigPa, "textBubbleModel.textConfigParam!!");
                this.$this_run.g1(selectDrawer.getEditTextBaseElementData(), textConfigPa);
                c.a(new TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1$onClick$$inlined$run$lambda$1$a(this, p0));
             }else {
                a.E(p0, this.$textBubbleModel$inlined);
             }
             oinitTemplat = l1.a;
          }
       }
       PatchProxy.onMethodExit(TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1$onClick$$inlined$run$lambda$1.class, "1");
       return oinitTemplat;
    }
}
