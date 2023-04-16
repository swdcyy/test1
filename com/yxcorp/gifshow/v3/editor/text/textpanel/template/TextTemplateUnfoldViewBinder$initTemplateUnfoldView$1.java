package com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1;
import gvc.a$a;
import gvc.j;
import java.lang.Object;
import android.view.View;
import ypc.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import gvc.i;
import gvc.a;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import gvc.b;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1$onClick$$inlined$run$lambda$1;
import msd.l;

public final class TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1 implements a$a	// class@0014ea
{
    public final j a;

    public void TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1(j p0){
       this.a = p0;
       super();
    }
    public void a(View p0,a p1,int p2){
       if (PatchProxy.isSupport(TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "textBubbleModel");
       Object[] objArray = new Object[0];
       a.D().w("TextTemplateUnfoldViewBinder", "click "+p2, objArray);
       j.H(this.a).N0(p2);
       TextElementViewModel textElementV = this.a.D();
       textElementV.a1(1, new TextTemplateUnfoldViewBinder$initTemplateUnfoldView$1$onClick$$inlined$run$lambda$1(textElementV, this, p1));
       return;
    }
}
