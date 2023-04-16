package com.kwai.library.widget.popup.dialog.callback.CenterSimpleStyleViewState;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.dialog.callback.CenterSimpleStyleViewState$ButtonType;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import android.content.Context;
import ll8.c$b;
import android.content.res.TypedArray;
import j17.a;
import android.graphics.drawable.GradientDrawable;
import lnc.a1;
import qrd.l1;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import j17.b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout;
import java.util.Objects;
import o07.n;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.ColorStateList;
import x07.a;
import java.lang.Enum;
import android.graphics.drawable.StateListDrawable;

public final class CenterSimpleStyleViewState implements PopupInterface$f	// class@00099d
{
    public int b;
    public final int c;
    public final int d;
    public final CenterSimpleStyleViewState$ButtonType e;

    public void CenterSimpleStyleViewState(int p0,int p1,CenterSimpleStyleViewState$ButtonType p2){
       a.p(p2, "buttonType");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
    }
    public View a(c p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       Context context3;
       a.p(p0, "popup");
       a.p(p1, "inflater");
       a.p(p2, "container");
       int b = false;
       View view = a.c(p1, this.d, p2, b);
       a.o(view, "it");
       Context context = view.getContext();
       a.o(context, "it.context");
       int[] a1 = c$b.A1;
       a.o(a1, "R.styleable.KsDialogStyle");
       TypedArray typedArray = context.obtainStyledAttributes(this.c, a1);
       Context context1 = view.getContext();
       a.o(context1, "dialogView.context");
       this.b = typedArray.getDimensionPixelSize(7, a.d(context1, 0x7f070227));
       GradientDrawable gradientDraw = new GradientDrawable();
       Context context2 = view.getContext();
       a.o(context2, "dialogView.context");
       int i = a.a(context2, R.color.arg_RES_7f06097d);
       gradientDraw.setColor(typedArray.getColor(5, i));
       gradientDraw.setCornerRadius((float)a1.d(R.dimen.arg_RES_7f070551));
       view.setBackground(gradientDraw);
       TextView textView = view.findViewById(R.id.title);
       ViewGroup$LayoutParams layoutParams = null;
       String str = "context";
       int i1 = -1;
       if (textView != null) {
          textView.setMovementMethod(LinkMovementMethod.getInstance());
          context3 = textView.getContext();
          a.o(context3, str);
          textView.setTextColor(typedArray.getColor(22, a.a(context3, R.color.arg_RES_7f062100)));
          b.a(typedArray.getResourceId(23, i1), textView);
          textView.setPadding(this.b, b, this.b, b);
          int dimensionPix = typedArray.getDimensionPixelSize(25, b);
          ViewGroup$LayoutParams layoutParams1 = textView.getLayoutParams();
          if (!layoutParams1 instanceof ViewGroup$MarginLayoutParams) {
             layoutParams1 = layoutParams;
          }
          if (layoutParams1 != null) {
             layoutParams1.topMargin = dimensionPix;
             textView.setLayoutParams(layoutParams1);
          }
       }
       textView = view.findViewById(R.id.content);
       if (textView != null) {
          context3 = textView.getContext();
          a.o(context3, str);
          textView.setTextColor(typedArray.getColor(9, a.a(context3, R.color.arg_RES_7f060988)));
          b.a(typedArray.getResourceId(10, i1), textView);
          textView.setPadding(this.b, b, this.b, b);
       }
       View view1 = view.findViewById(R.id.body);
       if (view1 != null) {
          int dimensionPix1 = typedArray.getDimensionPixelSize(12, b);
          ViewGroup$LayoutParams layoutParams2 = view1.getLayoutParams();
          if (layoutParams2 instanceof ViewGroup$MarginLayoutParams) {
             layoutParams = layoutParams2;
          }
          if (layoutParams != null) {
             layoutParams.topMargin = dimensionPix1;
             view1.setLayoutParams(layoutParams);
          }
       }
       LinearLayout linearLayout = view.findViewById(R.id.button);
       if (linearLayout != null && linearLayout.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
          ViewGroup$LayoutParams layoutParams3 = linearLayout.getLayoutParams();
          Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams3.topMargin = typedArray.getDimensionPixelSize(4, b);
       }
       int resourceId = typedArray.getResourceId(20, i1);
       b = typedArray.getResourceId(16, i1);
       TextView textView1 = view.findViewById(R.id.negative);
       if (textView1 != null) {
          CenterSimpleStyleViewState te = this.e;
          if (te == CenterSimpleStyleViewState$ButtonType.UNEXACT) {
             te = CenterSimpleStyleViewState$ButtonType.NEGATIVE;
          }
          this.c(b, textView1, te);
       }
       TextView textView2 = view.findViewById(R.id.positive);
       if (textView2 != null) {
          CenterSimpleStyleViewState te1 = this.e;
          if (te1 == CenterSimpleStyleViewState$ButtonType.UNEXACT) {
             te1 = CenterSimpleStyleViewState$ButtonType.POSITIVE;
          }
          this.c(resourceId, textView2, te1);
       }
       resourceId = typedArray.getColor(21, a1.a(0x106000d));
       View view2 = view.findViewById(R.id.horizontal_divider);
       if (view2 != null) {
          view2.setBackgroundColor(resourceId);
       }
       view2 = view.findViewById(R.id.vertical_divider);
       if (view2 != null) {
          view2.setBackgroundColor(resourceId);
       }
       typedArray.recycle();
       a.o(view, "rootView");
       return view;
    }
    public void b(c p0){
       n.a(this, p0);
    }
    public final void c(int p0,TextView p1,CenterSimpleStyleViewState$ButtonType p2){
       float f1;
       TextView textView = p1;
       Context context = p1.getContext();
       a.o(context, "button.context");
       int[] n1 = c$b.N1;
       a.o(n1, "R.styleable.KwaiFlatButton");
       TypedArray typedArray = context.obtainStyledAttributes(p0, n1);
       int i = 0;
       textView.setGravity(typedArray.getInt(i, 17));
       int i1 = 2;
       int layoutDimens = typedArray.getLayoutDimension(i1, a1.e(48.00f));
       ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
       if (!layoutParams instanceof LinearLayout$LayoutParams) {
          layoutParams = null;
       }
       if (layoutParams != null) {
          layoutParams.width = i;
          layoutParams.height = layoutDimens;
       }
       b.a(typedArray.getResourceId(10, -1), textView);
       layoutDimens = typedArray.getColor(9, a1.a(0x106000d));
       float floatx = typedArray.getFloat(7, 0x3f000000);
       int[][] ointArray = new int[][i1];
       int[] ointArray1 = new int[]{0x10100a7};
       ointArray[i] = ointArray1;
       ointArray1 = new int[i];
       ointArray[1] = ointArray1;
       ointArray1 = new int[i1];
       ointArray1[i] = a.b(floatx, layoutDimens);
       ointArray1[1] = layoutDimens;
       textView.setTextColor(new ColorStateList(ointArray, ointArray1));
       int i2 = 3;
       layoutDimens = typedArray.getColor(i2, a1.a(0x106000d));
       float f = (float)typedArray.getDimensionPixelSize(6, i);
       int i3 = a.a[p2.ordinal()];
       if (i3 != 1) {
          if (i3 != i1) {
             if (i3 != i2) {
                f = 0;
             }
             i3 = 0;
          }else {
             f1 = f;
             f = 0;
          }
       }else {
          f1 = f;
       }
       GradientDrawable gradientDraw = new GradientDrawable();
       gradientDraw.setColor(layoutDimens);
       float[] uofloatArray = new float[]{0,0,0,0,f,f,i3,i3};
       gradientDraw.setCornerRadii(uofloatArray);
       GradientDrawable gradientDraw1 = new GradientDrawable();
       gradientDraw1.setColor(typedArray.getColor(8, a.b(floatx, layoutDimens)));
       float[] uofloatArray1 = new float[]{0,0,0,0,f,f,i3,i3};
       gradientDraw1.setCornerRadii(uofloatArray1);
       StateListDrawable stateListDra = new StateListDrawable();
       int[] ointArray2 = new int[]{0x10100a7};
       stateListDra.addState(ointArray2, gradientDraw1);
       n1 = new int[i];
       stateListDra.addState(n1, gradientDraw);
       textView.setBackground(stateListDra);
       typedArray.recycle();
       return;
    }
}
