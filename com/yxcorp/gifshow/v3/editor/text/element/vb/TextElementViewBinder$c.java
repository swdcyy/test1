package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import com.yxcorp.gifshow.v3.editor.text.element.vb.b;
import android.view.View$OnClickListener;
import android.view.View;

public final class TextElementViewBinder$c implements Observer	// class@001400
{
    public final TextElementViewBinder b;

    public void TextElementViewBinder$c(TextElementViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$c.class, "1")) {
       }else {
          a.o(p0, "bindPanel");
          if (p0.booleanValue()) {
             this.b.J().d(this.b.u);
             this.b.M().setOnClickListener(new b(this));
          }else {
             this.b.J().M(this.b.u);
             this.b.M().setOnClickListener(null);
          }
       }
       return;
    }
}
