package com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateFoldViewBinder$initTemplateFoldView$2;
import gvc.a$a;
import gvc.h;
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
import gvc.c;
import gvc.a;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import gvc.b;
import com.yxcorp.gifshow.v3.editor.text.textpanel.template.TextTemplateFoldViewBinder$initTemplateFoldView$2$onClick$$inlined$run$lambda$1;
import msd.l;

public final class TextTemplateFoldViewBinder$initTemplateFoldView$2 implements a$a	// class@0014e7
{
    public final h a;

    public void TextTemplateFoldViewBinder$initTemplateFoldView$2(h p0){
       this.a = p0;
       super();
    }
    public void a(View p0,a p1,int p2){
       if (PatchProxy.isSupport(TextTemplateFoldViewBinder$initTemplateFoldView$2.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, TextTemplateFoldViewBinder$initTemplateFoldView$2.class, "1")) {
          return;
       }
       a.p(p0, "view");
       a.p(p1, "textBubbleModel");
       Object[] objArray = new Object[0];
       a.D().s("TextTemplateViewBinder", "click "+p2, objArray);
       h.H(this.a).N0(p2);
       this.a.I(p2);
       TextElementViewModel textElementV = this.a.D();
       textElementV.a1(1, new TextTemplateFoldViewBinder$initTemplateFoldView$2$onClick$$inlined$run$lambda$1(textElementV, this, p1));
       return;
    }
}
