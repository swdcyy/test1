package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$f;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import msd.l;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment;
import java.util.Objects;
import wuc.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class TextElementViewBinder$f implements Observer	// class@001404
{
    public final TextElementViewBinder b;

    public void TextElementViewBinder$f(TextElementViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$f.class, "1")) {
       }else {
          int i = p0.getFirst().intValue();
          boolean b = true;
          if (i != b) {
             Object obj = null;
             if (i != 2) {
                if (i != 3) {
                   if (i == 4) {
                      p0 = p0.getSecond();
                      p0 = (p0 != null)? p0.invoke(obj): obj;
                      if (p0 instanceof String) {
                         obj = p0;
                      }
                      p0 = this.b.H();
                      if (p0 != null && obj != null) {
                         this.b.W(p0, obj);
                      }
                   }
                }else {
                   p0 = this.b.d;
                   if (p0 != null && !p0.Ch()) {
                      p0 = this.b.d;
                      if (p0 != null) {
                         p0.Dh();
                      }
                      this.b.V();
                   }
                }
             }else {
                p0 = this.b;
                Objects.requireNonNull(p0);
                if (!PatchProxy.applyVoid(obj, p0, TextElementViewBinder.class, "18")) {
                   p0.a = b;
                }
                p0 = this.b.d;
                if (p0 != null && p0.Ch() == b) {
                   n.C(this.b.I().getActivity());
                }
             }
          }else {
             p0 = p0.getSecond();
             if (p0 != null) {
                p0.invoke(this.b.J());
             }
          }
       }
       return;
    }
}
