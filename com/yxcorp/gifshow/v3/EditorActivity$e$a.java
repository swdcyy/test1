package com.yxcorp.gifshow.v3.EditorActivity$e$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.EditorActivity$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.AbsEditorActivityViewBinder;
import com.yxcorp.gifshow.v3.EditorActivity;
import android.view.ViewTreeObserver;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.v3.EditorActivity$PreviewTabInfo;
import android.widget.RadioButton;
import com.yxcorp.gifshow.v3.EditorActivity$e$a$a;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.Integer;
import android.graphics.Paint;
import java.lang.Math;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import cw9.c;

public class EditorActivity$e$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000d16
{
    public final EditorActivity$e b;

    public void EditorActivity$e$a(EditorActivity$e p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       EditorActivity$e c;
       EditorActivity p;
       String str3;
       String str4;
       Paint paint;
       int i5;
       int i6;
       ViewGroup$LayoutParams layoutParams;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, EditorActivity$e$a.class, "1")) {
          return;
       }
       obj.b.c.N3().i.getViewTreeObserver().removeOnGlobalLayoutListener(obj);
       if (!obj.b.c.N3().m.getVisibility()) {
          c = obj.b.c;
          p = c.P;
          if (p != null && p.length > 0) {
             p[c.K3(EditorActivity$PreviewTabInfo.VIDEO)].getViewTreeObserver().addOnGlobalLayoutListener(new EditorActivity$e$a$a(obj));
          }
       }
       c = obj.b.c;
       Objects.requireNonNull(c);
       p = EditorActivity.class;
       if (!PatchProxy.applyVoid(objArray, c, p, "58")) {
          int i = 0;
          RadioButton radioButton = c.L3(i);
          if (radioButton != null) {
             int i1 = 1;
             RadioButton radioButton1 = c.L3(i1);
             if (radioButton1 != null) {
                RadioButton radioButton2 = c.L3(2);
                if (radioButton2 != null) {
                   String str = radioButton1.getText().toString();
                   int i2 = 3;
                   String str1 = "%s%s%s";
                   String str2 = "";
                   if (!TextUtils.x(radioButton.getText())) {
                      str3 = radioButton.getText().toString();
                      Object[] objArray1 = new Object[i2];
                      objArray1[i] = str3;
                      objArray1[i1] = str3;
                      objArray1[2] = str;
                      str4 = String.format(str1, objArray1);
                   }else {
                      str4 = str2;
                   }
                   if (!TextUtils.x(radioButton2.getText())) {
                      str3 = radioButton2.getText().toString();
                      Object[] objArray2 = new Object[i2];
                      objArray2[i] = str3;
                      objArray2[i1] = str3;
                      objArray2[2] = str;
                      str2 = String.format(str1, objArray2);
                   }
                   int i3 = n.k(c);
                   if (TextUtils.x(str4) && TextUtils.x(str2)) {
                      radioButton1.setMaxWidth(i3);
                      c.G3(str4, str2, str, i3);
                   }else {
                      radioButton1.setMaxWidth((int)((float)i3 * 0x3f000000));
                      int i4 = c.G3(str4, str2, str, (i3 - (a1.e(12.00f) * 2)));
                      if (PatchProxy.isSupport(p)) {
                         i1 = i4;
                         if (!PatchProxy.applyVoidFourRefs(str4, str2, str, Integer.valueOf(i4), c, EditorActivity.class, "55")) {
                         }
                      }else {
                         i1 = i4;
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
