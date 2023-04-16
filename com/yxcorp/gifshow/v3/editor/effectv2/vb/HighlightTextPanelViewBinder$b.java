package com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTextPanelViewBinder$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.effectv2.vb.HighlightTextPanelViewBinder;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import kqc.c;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import cq.a;
import q87.c;
import com.yxcorp.gifshow.v3.widget.TextBasePanelFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import androidx.fragment.app.FragmentActivity;
import fvc.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.graphics.Rect;
import java.lang.StringBuilder;
import lnc.a1;
import kqc.g;
import com.yxcorp.gifshow.v3.editor.effectv2.action.HighlightTextPanelCloseAction;
import xvc.b;

public final class HighlightTextPanelViewBinder$b implements Observer	// class@000f61
{
    public final HighlightTextPanelViewBinder b;

    public void HighlightTextPanelViewBinder$b(HighlightTextPanelViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       Rect obj;
       HighlightTextPanelViewBinder highlightTex = HighlightTextPanelViewBinder.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, HighlightTextPanelViewBinder$b.class, "1")) {
       }else if(this.b.o.o0().c() != EffectGroupType.HIGHLIGHT_TIME_EFFECT){
          HighlightTextPanelViewBinder k = this.b.k;
          if (p0 == null || k != p0.intValue()) {
             a.o(p0, "keyboardOffset");
             this.b.k = p0.intValue();
             if (p0.intValue() > 0) {
                if (this.b.p.isResumed()) {
                   HighlightTextPanelViewBinder$b tb = this.b;
                   int i = p0.intValue();
                   Objects.requireNonNull(tb);
                   int i1 = 0;
                   if (!PatchProxy.isSupport(highlightTex) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, highlightTex, "4")) {
                      Object[] objArray1 = new Object[i1];
                      a.D().w("KeyBoardPanelBaseViewBinder", "showTextPanelPopup", objArray1);
                      if (i > 0) {
                         HighlightTextPanelViewBinder h = tb.h;
                         if (h != null) {
                            if (!PatchProxy.isSupport(TextBasePanelFragment.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), h, TextBasePanelFragment.class, "15") && h.u != i)) {
                               h.u = i;
                               Dialog dialog = h.getDialog();
                               if (dialog != null) {
                                  Window window = dialog.getWindow();
                                  if (window != null) {
                                     WindowManager$LayoutParams attributes = window.getAttributes();
                                     a.o(attributes, "attr");
                                     h.Ah(attributes);
                                     window.setAttributes(attributes);
                                  }
                               }
                            }
                         }else {
                            tb.p.getActivity();
                         }
                      }
                   }
                   tb = this.b;
                   int i2 = p0.intValue() - c.a();
                   Objects.requireNonNull(tb);
                   if (PatchProxy.isSupport(highlightTex)) {
                      obj = PatchProxy.applyOneRefs(Integer.valueOf(i2), tb, highlightTex, "7");
                      if (obj != PatchProxyResult.class) {
                         i2 = obj.booleanValue();
                      label_014a :
                         tb.j = i2;
                      }
                   }
                   tb.i = tb.l.getTranslationY();
                   obj = new Rect();
                   Rect rect = new Rect();
                   int i3 = obj.bottom - i2;
                   int i4 = rect.bottom - i2;
                   if (i3 > i4) {
                      i3 = i4;
                   }
                   if (i3 > 0) {
                      Object[] objArray = new Object[i1];
                      a.D().w("KeyBoardPanelBaseViewBinder", "movePreviewViewIfNeeded offset = "+i3+" textDrawerLayoutOutRect = "+obj+" containerViewOutRect = "+rect, objArray);
                      tb.F(tb.l.getTranslationY(), (tb.l.getTranslationY() - (float)(i3 + a1.e(20.00f))));
                      i1 = 1;
                   }
                   i2 = i1;
                   goto label_014a ;
                }
             }else if(this.b.o.o0().j().g()){
                this.b.o.t0(new HighlightTextPanelCloseAction());
             }
          }
       }
       return;
    }
}
