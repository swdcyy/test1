package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$j;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$showPopup$1;
import java.util.Objects;
import wuc.j;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import msd.a;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import wuc.h;
import t36.f$a;
import t36.f;

public final class TextElementViewBinder$j implements Observer	// class@001408
{
    public final TextElementViewBinder b;

    public void TextElementViewBinder$j(TextElementViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       Object[] objArray1;
       Dialog dialog;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextElementViewBinder$j.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().s("TextElementViewBinder", "mLastKeyboardOffset = "+this.b.t+", keyboardOffset = "+p0, objArray);
          TextElementViewBinder t = this.b.t;
          if (p0 == null || t != p0.intValue()) {
             a.o(p0, "keyboardOffset");
             this.b.t = p0.intValue();
             TextElementViewBinder$j tb = this.b;
             if (tb.F == null || (tb.J().getSelectDrawer() instanceof EditTextBaseElement && this.b.H == null)) {
                boolean b = true;
                if (p0.intValue() > 0) {
                   if (this.b.I().isResumed()) {
                      tb = this.b;
                      int i1 = tb.i / 2;
                      int i2 = p0.intValue();
                      TextElementViewBinder textElementV = TextElementViewBinder.class;
                      if (!PatchProxy.isSupport(textElementV) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), Integer.valueOf(i2), tb, textElementV, "9")) {
                         if (tb.x == null && tb.E != null) {
                            textElementV = tb.e;
                            TextElementViewBinder d = tb.d;
                            TextElementViewBinder$showPopup$1 oshowPopup$1 = new TextElementViewBinder$showPopup$1(tb, i1, i2);
                            Objects.requireNonNull(textElementV);
                            if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(i1), Integer.valueOf(i2), d, oshowPopup$1, textElementV, j.class, "1")) {
                               a.p(oshowPopup$1, "showFun");
                               if (d == null || textElementV.b == null) {
                                  objArray1 = new Object[i];
                                  a.D().s("TextPanelDialogStateController", "real show dialog", objArray1);
                                  oshowPopup$1.invoke();
                                  textElementV.b = b;
                               }else if(!d.Ch()){
                                  objArray1 = new Object[i];
                                  a.D().s("TextPanelDialogStateController", "keyboardShow changPanelStateChange to fold", objArray1);
                                  d.vh(b);
                               }else if(PatchProxy.isSupport(TextPanelDialogFragment.class) && (PatchProxy.applyVoidTwoRefs(Integer.valueOf(i1), Integer.valueOf(i2), d, TextPanelDialogFragment.class, "12") || d.r == i2)){
                                  d.r = i2;
                                  dialog = d.getDialog();
                                  if (dialog != null) {
                                     Window window = dialog.getWindow();
                                     if (window != null) {
                                        WindowManager$LayoutParams attributes = window.getAttributes();
                                        a.o(attributes, "attr");
                                        d.Bh(attributes);
                                        window.setAttributes(attributes);
                                     }
                                  }
                               }
                               objArray1 = new Object[i];
                               a.D().s("TextPanelDialogStateController", "keyboardShow try to updateLocation x: "+i1+", y: "+i2, objArray1);
                            }
                         }else if(tb.h == null){
                            if (tb.x != null && (tb.A.H0() && tb.t != null)) {
                               TextElementViewBinder d1 = tb.D;
                               if (d1 != null) {
                                  d1.s0(h.a);
                               }
                            }
                            tb.U(i1, i2);
                         }
                      }
                   }
                }else {
                   this.b.E(b);
                }
             }
          }
       }
       return;
    }
}
