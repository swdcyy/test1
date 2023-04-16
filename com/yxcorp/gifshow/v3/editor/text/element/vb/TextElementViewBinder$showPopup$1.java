package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$showPopup$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import faa.a;
import q87.c;
import wuc.i;
import t36.f$a;
import t36.f;
import com.yxcorp.gifshow.v3.editor.text.textpanel.TextPanelDialogFragment;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import fvc.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.text.widget.TextDrawerLayout;
import android.widget.RelativeLayout;
import android.widget.AbsoluteLayout;
import java.lang.StringBuilder;
import lnc.a1;

public final class TextElementViewBinder$showPopup$1 extends Lambda implements a	// class@001415
{
    public final int $offsetY;
    public final int $x;
    public final TextElementViewBinder this$0;

    public void TextElementViewBinder$showPopup$1(TextElementViewBinder p0,int p1,int p2){
       this.this$0 = p0;
       this.$x = p1;
       this.$offsetY = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       String textFontName;
       Rect obj;
       boolean b1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextElementViewBinder$showPopup$1.class, "1")) {
          return;
       }
       TextElementViewBinder$showPopup$1 tthis$0 = this.this$0;
       TextElementViewBinder$showPopup$1 t$x = this.$x;
       TextElementViewBinder$showPopup$1 t$offsetY = this.$offsetY;
       Objects.requireNonNull(tthis$0);
       TextElementViewBinder textElementV = TextElementViewBinder.class;
       if (!PatchProxy.isSupport(textElementV) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(t$x), Integer.valueOf(t$offsetY), tthis$0, textElementV, "12")) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          a.D().s("TextElementViewBinder", "showTextPanelPopup", objArray1);
          TextElementViewBinder b = tthis$0.B;
          if (b != null) {
             b.s0(i.a);
          }
          tthis$0.r = true;
          tthis$0.d = new TextPanelDialogFragment();
          EditTextBaseElement uEditTextBas = tthis$0.H();
          String str = "";
          if (uEditTextBas != null) {
             textFontName = uEditTextBas.getTextFontName();
             if (textFontName != null) {
             label_0060 :
                EditTextBaseElement uEditTextBas1 = tthis$0.H();
                if (uEditTextBas1 != null) {
                   String decorName = uEditTextBas1.getDecorName();
                   if (decorName != null) {
                      str = decorName;
                   }
                }
                Bundle uBundle = new Bundle();
                EditTextBaseElement topElement = tthis$0.k.getTopElement();
                int fromWhere = (topElement != null)? topElement.getFromWhere(): 16;
                uBundle.putInt("panelFrom", fromWhere);
                uBundle.putString("currentFont", textFontName);
                uBundle.putString("currentTextId", str);
                uEditTextBas = tthis$0.H();
                TextStyleValue textStyleVal = (uEditTextBas != null)? uEditTextBas.getTextStyleValue(): objArray;
                uBundle.putParcelable("draftCustomStyleData", textStyleVal);
                uEditTextBas = tthis$0.H();
                if (uEditTextBas != null) {
                   objArray = uEditTextBas.getTextStyleAttrs();
                }
                uBundle.putParcelable("selectedStyleAttr", objArray);
                TextElementViewBinder d = tthis$0.d;
                if (d != null) {
                   d.setArguments(uBundle);
                }
                d = tthis$0.d;
                if (d != null) {
                   d.r = t$offsetY;
                }
                if (d) {
                   d.p = tthis$0.g;
                }
                if (d) {
                   d.show(tthis$0.y.getChildFragmentManager(), "TextPanel");
                }
                int i1 = t$offsetY - c.a();
                if (PatchProxy.isSupport(textElementV)) {
                   obj = PatchProxy.applyOneRefs(Integer.valueOf(i1), tthis$0, textElementV, "13");
                   if (obj != PatchProxyResult.class) {
                      b1 = obj.booleanValue();
                   label_0168 :
                      tthis$0.o = b1;
                   }
                }
                tthis$0.n = tthis$0.m.getTranslationY();
                obj = new Rect();
                EditTextBaseElement uEditTextBas2 = tthis$0.H();
                if (uEditTextBas2 != null) {
                   TextDrawerLayout textDrawerLa = uEditTextBas2.getTextDrawerLayout();
                   if (textDrawerLa != null) {
                      textDrawerLa.getGlobalVisibleRect(obj);
                   }
                }
                Rect rect = new Rect();
                tthis$0.k.getGlobalVisibleRect(rect);
                int i2 = obj.bottom - i1;
                int i3 = rect.bottom - i1;
                if (i2 > i3) {
                   i2 = i3;
                }
                if (i2 > 0) {
                   Object[] objArray2 = new Object[i];
                   a.D().s("TextElementViewBinder", "movePreviewViewIfNeeded offset = "+i2+" textDrawerLayoutOutRect = "+obj+" containerViewOutRect = "+rect, objArray2);
                   tthis$0.R(tthis$0.m.getTranslationY(), (tthis$0.m.getTranslationY() - (float)(i2 + a1.e(20.00f))));
                   i = 1;
                }
                b1 = i;
                goto label_0168 ;
             }
          }
          textFontName = str;
          goto label_0060 ;
       }
       return;
    }
}
