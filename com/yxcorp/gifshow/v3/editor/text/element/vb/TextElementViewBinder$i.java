package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$i;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.a;

public final class TextElementViewBinder$i implements Observer	// class@001407
{
    public final TextElementViewBinder b;

    public void TextElementViewBinder$i(TextElementViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$i.class, "1")) {
       }else if(p0.intValue() > 0){
          if (this.b.I().isResumed()) {
             TextElementViewBinder$i tb = this.b;
             a.o(p0, "offSet");
             tb.U((tb.i / 2), p0.intValue());
          }
       }else {
          this.b.S();
       }
       return;
    }
}
