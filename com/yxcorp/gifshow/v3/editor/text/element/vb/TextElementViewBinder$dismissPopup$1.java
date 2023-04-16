package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$dismissPopup$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import faa.a;
import q87.c;
import wuc.c;
import t36.f$a;
import t36.f;

public final class TextElementViewBinder$dismissPopup$1 extends Lambda implements a	// class@001402
{
    public final boolean $directRelease;
    public final TextElementViewBinder this$0;

    public void TextElementViewBinder$dismissPopup$1(TextElementViewBinder p0,boolean p1){
       this.this$0 = p0;
       this.$directRelease = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextElementViewBinder$dismissPopup$1.class, "1")) {
          return;
       }
       if (this.$directRelease != null) {
          this.this$0.T();
       }else {
          TextElementViewBinder$dismissPopup$1 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          if (!PatchProxy.applyVoid(objArray, tthis$0, TextElementViewBinder.class, "15")) {
             Object[] objArray1 = new Object[0];
             a.D().s("TextElementViewBinder", "dismissTextPanelPopup", objArray1);
             tthis$0.D();
             tthis$0.T();
             if (tthis$0.r != null) {
                TextElementViewBinder b = tthis$0.B;
                if (b != null) {
                   b.s0(new c(tthis$0));
                }
             }
          }
       }
       return;
    }
}
