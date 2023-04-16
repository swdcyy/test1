package com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment;
import com.yxcorp.gifshow.fragment.PopupWindowFragment;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import tyc.y;
import java.lang.Runnable;
import androidx.fragment.app.FragmentActivity;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.content.ContextWrapper;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment$BackgroundColorType;
import java.lang.Boolean;
import java.lang.Integer;
import androidx.fragment.app.c;
import a2.i0;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.widget.i;
import android.content.DialogInterface$OnShowListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment$b;
import android.widget.FrameLayout;
import com.kwai.library.widget.layout.ShadowLayout;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import android.widget.TextView;
import android.text.method.MovementMethod;
import com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment$a;
import tyc.x;
import android.view.View$OnTouchListener;
import tyc.w;
import android.view.View$OnClickListener;
import zf6.k;
import com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment$c;
import java.lang.Enum;

public class BubbleHintNewStyleFragment extends PopupWindowFragment	// class@0017fb
{
    public boolean G;
    public CharSequence H;
    public boolean I;
    public int J;
    public BubbleHintNewStyleFragment$BackgroundColorType K;
    public int L;
    public int M;
    public int N;
    public TextView O;
    public MovementMethod P;
    public int Q;
    public BubbleHintNewStyleFragment$d R;
    public static final int S;

    public void BubbleHintNewStyleFragment(){
       super();
       this.M = 17;
       this.Q = 0;
    }
    public static void Hh(BubbleHintNewStyleFragment p0,long p1,View p2){
       if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, null, BubbleHintNewStyleFragment.class, "27")) {
          return;
       }
       if (p1 - null > 0) {
          p2.postDelayed(new y(p0), p1);
       }
       return;
    }
    public static FragmentActivity Jh(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, BubbleHintNewStyleFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context context = p0.getContext();
       while (true) {
          if (!context instanceof ContextWrapper) {
             return null;
          }
          if (context instanceof FragmentActivity) {
             break ;
          }else {
             context = context.getBaseContext();
          }
       }
       return context;
    }
    public static BubbleHintNewStyleFragment Kh(CharSequence p0,boolean p1,int p2,int p3,int p4,BubbleHintNewStyleFragment$BackgroundColorType p5){
       BubbleHintNewStyleFragment obj;
       if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          obj = PatchProxy.apply(objArray, null, BubbleHintNewStyleFragment.class, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new BubbleHintNewStyleFragment();
       obj.H = p0;
       obj.G = p1;
       obj.I = true;
       obj.J = p4;
       obj.K = p5;
       PopupWindowFragment popupWindowF = obj.Ah(1);
       popupWindowF.Bh(p2);
       popupWindowF.v = p3;
       return obj;
    }
    public static BubbleHintNewStyleFragment Lh(CharSequence p0,boolean p1,int p2,int p3,BubbleHintNewStyleFragment$BackgroundColorType p4){
       if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, null, BubbleHintNewStyleFragment.class, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return BubbleHintNewStyleFragment.Kh(p0, p1, p2, p3, 0, p4);
    }
    public static BubbleHintNewStyleFragment Nh(View p0,String p1,boolean p2,int p3,int p4,String p5,BubbleHintNewStyleFragment$BackgroundColorType p6,long p7){
       Object[] objArray;
       Object obj1;
       object oobject = p0;
       object oobject1 = p5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 8;
       int i1 = 7;
       int i2 = 6;
       int i3 = 5;
       int i4 = 4;
       int i5 = 3;
       int i6 = 2;
       int i7 = 1;
       Object obj = null;
       Integer integer = Integer.valueOf(0);
       if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class)) {
          objArray = new Object[i];
          objArray[0] = oobject;
          objArray[i7] = p1;
          objArray[i6] = Boolean.valueOf(p2);
          objArray[i5] = Integer.valueOf(p3);
          objArray[i4] = Integer.valueOf(p4);
          objArray[i3] = oobject1;
          objArray[i2] = p6;
          objArray[i1] = Long.valueOf(p7);
          obj1 = PatchProxy.apply(objArray, obj, BubbleHintNewStyleFragment.class, "8");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class)) {
          objArray = new Object[11];
          objArray[0] = oobject;
          objArray[i7] = p1;
          objArray[i6] = Boolean.valueOf(p2);
          objArray[i5] = Integer.valueOf(p3);
          objArray[i4] = Integer.valueOf(p4);
          objArray[i3] = integer;
          objArray[i2] = oobject1;
          objArray[i1] = p6;
          objArray[8] = Long.valueOf(p7);
          objArray[9] = integer;
          objArray[10] = obj;
          obj1 = PatchProxy.apply(objArray, obj, BubbleHintNewStyleFragment.class, "9");
          if (obj1 != patchProxyRe) {
             obj = obj1;
          }else {
          label_0092 :
             FragmentActivity uFragmentAct = BubbleHintNewStyleFragment.Jh(p0);
             if (uFragmentAct != null) {
                c supportFragm = uFragmentAct.getSupportFragmentManager();
                BubbleHintNewStyleFragment uBubbleHintN = BubbleHintNewStyleFragment.Kh(p1, p2, p3, p4, 0, p6);
                if (!i0.Y(p0)) {
                   i oi = new i(p0, uBubbleHintN, 0, supportFragm, p5, null, p7);
                   p0.getViewTreeObserver().addOnGlobalLayoutListener(obj);
                }else {
                   uBubbleHintN.qh(0);
                   uBubbleHintN.Eh(supportFragm, oobject1, oobject, obj);
                   BubbleHintNewStyleFragment.Hh(uBubbleHintN, p7, oobject);
                }
                obj = uBubbleHintN;
             }
          }
       }else {
          goto label_0092 ;
       }
       return obj;
    }
    public static BubbleHintNewStyleFragment Oh(View p0,CharSequence p1,boolean p2,int p3,int p4,String p5,BubbleHintNewStyleFragment$BackgroundColorType p6,long p7){
       FragmentActivity obj;
       if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5,p6,Long.valueOf(p7)};
          obj = PatchProxy.apply(objArray, null, BubbleHintNewStyleFragment.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = BubbleHintNewStyleFragment.Jh(p0);
       if (obj == null) {
          return null;
       }else {
          BubbleHintNewStyleFragment uBubbleHintN = BubbleHintNewStyleFragment.Lh(p1, p2, p3, p4, p6);
          uBubbleHintN.Eh(obj.getSupportFragmentManager(), p5, p0, null);
          BubbleHintNewStyleFragment.Hh(uBubbleHintN, p7, p0);
          return uBubbleHintN;
       }
    }
    public static BubbleHintNewStyleFragment Ph(View p0,String p1,boolean p2,int p3,int p4,String p5,BubbleHintNewStyleFragment$BackgroundColorType p6,long p7){
       FragmentActivity obj1;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p5;
       object oobject3 = p6;
       Object obj = null;
       if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),oobject2,oobject3,Long.valueOf(p7)};
          obj1 = PatchProxy.apply(objArray, obj, BubbleHintNewStyleFragment.class, "21");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = BubbleHintNewStyleFragment.Jh(p0);
       if (obj1 == null) {
          return obj;
       }else {
          c supportFragm = obj1.getSupportFragmentManager();
          BubbleHintNewStyleFragment uBubbleHintN = BubbleHintNewStyleFragment.Lh(p1, p2, p3, p4, oobject3);
          if (!i0.Y(p0)) {
             BubbleHintNewStyleFragment$b uob = new BubbleHintNewStyleFragment$b(p0, uBubbleHintN, supportFragm, p5, p7);
             p0.getViewTreeObserver().addOnGlobalLayoutListener(v9);
          }else {
             uBubbleHintN.Fh(supportFragm, p5, p0);
             BubbleHintNewStyleFragment.Hh(uBubbleHintN, p7, p0);
          }
          return uBubbleHintN;
       }
    }
    public View Ih(View p0){
       View obj = PatchProxy.applyOneRefs(p0, this, BubbleHintNewStyleFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 != null) {
          if (this.th()) {
             obj = p0.findViewById(R.id.bubble_arrow_bottom);
          }else if(this.uh()){
             obj = p0.findViewById(R.id.bubble_arrow_top);
          }else if(this.vh()){
             obj = p0.findViewById(R.id.bubble_arrow_right);
          }else if(this.wh()){
             obj = p0.findViewById(R.id.bubble_arrow_left);
          }
       }
       return obj;
    }
    public final void Mh(int p0,int p1){
       if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BubbleHintNewStyleFragment.class, "4")) {
          return;
       }
       ShadowLayout shadowLayout = this.u.findViewById(R.id.shadow);
       if (shadowLayout != null) {
          BubbleHintNewStyleFragment tK = this.K;
          if (tK != null && tK == BubbleHintNewStyleFragment$BackgroundColorType.WHITE) {
             float f = 3.00f;
             int i = a1.e(f);
             float f1 = 10.50f;
             if (this.wh()) {
                i = a1.e(f1);
             }
             int i1 = a1.e(f);
             if (this.vh()) {
                i1 = a1.e(f1);
             }
             int i2 = a1.e(f);
             if (this.th()) {
                i2 = a1.e(8.50f);
             }
             FrameLayout$LayoutParams layoutParams = shadowLayout.getLayoutParams();
             layoutParams.width = p0 + a1.e(4.00f);
             layoutParams.height = p1 + a1.e(4.00f);
             layoutParams.leftMargin = i;
             layoutParams.rightMargin = i1;
             layoutParams.bottomMargin = i2;
             shadowLayout.setLayoutParams(layoutParams);
             shadowLayout.c(this.getResources().getColor(R.color.arg_RES_7f062038));
             shadowLayout.setVisibility(0);
          }
       }
       return;
    }
    public boolean sh(){
       return this.G;
    }
    public View xh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, BubbleHintNewStyleFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0135, p1, false);
       TextView textView = view.findViewById(R.id.bubble_hint);
       this.O = textView;
       textView.setIncludeFontPadding(false);
       this.O.setGravity(this.M);
       BubbleHintNewStyleFragment tP = this.P;
       if (tP != null) {
          this.O.setMovementMethod(tP);
       }
       this.O.setHighlightColor(this.Q);
       this.O.setText(this.H);
       tP = this.N;
       if (tP > null) {
          this.O.setMaxWidth(tP);
       }
       if (this.L > null) {
          this.O.getViewTreeObserver().addOnGlobalLayoutListener(new BubbleHintNewStyleFragment$a(this));
       }
       this.u.setOnTouchListener(new x(this));
       view.setOnClickListener(new w(this, view));
       View view1 = this.Ih(view);
       if (view1 != null) {
          view1.setVisibility(false);
       }
       return view;
    }
    public void yh(int p0,int p1){
       if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BubbleHintNewStyleFragment.class, "3")) {
          return;
       }
       View view = this.Ih(this.u);
       TextView textView = this.u.findViewById(R.id.bubble_hint);
       if (this.I != null && view != null) {
          view.setY((float)(((p0 - p1) - (view.getHeight() / 2)) + this.J));
       }
       if (this.K != null) {
          BubbleHintNewStyleFragment$BackgroundColorType wHITE = (k.d())? BubbleHintNewStyleFragment$BackgroundColorType.WHITE: this.K;
          this.K = wHITE;
          if (BubbleHintNewStyleFragment$c.a[wHITE.ordinal()] != 1) {
             if (view != null && this.vh()) {
                view.setBackgroundResource(R.drawable.bubble_hint_new_style_triangle_right_black);
             }else if(view != null && this.wh()){
                view.setBackgroundResource(R.drawable.bubble_hint_new_style_triangle_left_black);
             }
             textView.setTextColor(this.getResources().getColor(R.color.arg_RES_7f061fda));
             textView.setBackgroundResource(R.drawable.bubble_hint_new_style_black);
          }else if(view != null && this.vh()){
             view.setBackgroundResource(R.drawable.bubble_hint_new_style_triangle_right_white_light);
          }else if(view != null && this.wh()){
             view.setBackgroundResource(R.drawable.bubble_hint_new_style_triangle_left_white_light);
          }
          textView.setTextColor(this.getResources().getColor(R.color.arg_RES_7f061d77));
          textView.setBackgroundResource(R.drawable.bubble_hint_new_style_white);
       }
       this.Mh(textView.getWidth(), textView.getHeight());
       return;
    }
    public void zh(int p0,int p1){
       if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, BubbleHintNewStyleFragment.class, "2")) {
          return;
       }
       View view = this.Ih(this.u);
       TextView textView = this.u.findViewById(R.id.bubble_hint);
       if (this.I != null && view != null) {
          view.setX((float)(((p0 - p1) - (view.getWidth() / 2)) + this.J));
       }
       if (this.K != null) {
          BubbleHintNewStyleFragment$BackgroundColorType wHITE = (k.d())? BubbleHintNewStyleFragment$BackgroundColorType.WHITE: this.K;
          this.K = wHITE;
          if (BubbleHintNewStyleFragment$c.a[wHITE.ordinal()] != 1) {
             if (view != null && this.th()) {
                view.setBackgroundResource(R.drawable.bubble_hint_new_style_triangle_down_black);
             }else if(view != null && this.uh()){
                view.setBackgroundResource(R.drawable.bubble_hint_new_style_triangle_up_black);
             }
             textView.setTextColor(this.getResources().getColor(R.color.arg_RES_7f061fda));
             textView.setBackgroundResource(R.drawable.bubble_hint_new_style_black);
          }else if(view != null && this.th()){
             view.setBackgroundResource(R.drawable.bubble_hint_new_style_triangle_down_white_light);
          }else if(view != null && this.uh()){
             view.setBackgroundResource(R.drawable.bubble_triangle_white_bottom);
          }
          textView.setTextColor(this.getResources().getColor(R.color.arg_RES_7f061d77));
          textView.setBackgroundResource(R.drawable.bubble_hint_new_style_white);
       }
       this.Mh(textView.getWidth(), textView.getHeight());
       return;
    }
}
