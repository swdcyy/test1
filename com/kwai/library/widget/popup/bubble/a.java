package com.kwai.library.widget.popup.bubble.a;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.bubble.a$c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.bubble.b;
import com.kwai.library.widget.popup.bubble.b$a;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import m07.c;
import w07.l;
import k07.b;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.bubble.a$a;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.utility.n;
import android.graphics.drawable.Drawable;
import k07.a;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.List;
import java.util.Iterator;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import k07.c;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import androidx.core.content.ContextCompat;
import com.kwai.library.widget.popup.bubble.a$b;
import java.lang.Enum;
import com.kwai.library.widget.popup.bubble.a$d;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.WindowManager$LayoutParams;
import android.view.WindowManager;
import java.lang.Exception;
import k07.d;
import java.lang.Math;

public class a extends c	// class@000979
{
    public boolean p;
    public static final int q;

    public void a(a$c p0){
       super(p0);
    }
    public void a(a p0){
       super(p0.c0());
    }
    public static a b0(int p0,a$c p1){
       b uob = b.m.e(p1, p0);
       BubbleInterface$Position position = uob.c();
       p1.D0(position);
       c uoc = new c(uob);
       p1.a0(0, uoc);
       p1.L(new b(position));
       return p1.X();
    }
    public static a f0(a$c p0,int p1){
       p0.L(new a$a(p1));
       return p0.X();
    }
    public boolean L(){
       return false;
    }
    public void O(Bundle p0){
       a$c uoc1;
       a$c uoc = this.c0();
       TextView textView = this.t(R.id.text);
       if (textView != null) {
          textView.setText(uoc.L);
          textView.setGravity(uoc.M);
          textView.setIncludeFontPadding(false);
          textView.setLineSpacing((float)n.c(this.u(), 5.00f), 0x3f800000);
          uoc1 = uoc.f0;
          if (uoc1 != null) {
             textView.setMaxWidth(uoc1);
          }
       }
       if (uoc.g0 != null) {
          View view = this.t(R.id.arrow);
          if (view != null) {
             Drawable background = view.getBackground();
             if (background != null) {
                background.setAutoMirrored(true);
             }
          }
       }
       this.d0(textView, uoc.h0, uoc.i0, uoc.j0);
       if (uoc.O != null) {
          this.f.setOnClickListener(new a(this, uoc));
       }
       RecyclerView recyclerView = this.t(R.id.recycler_view);
       if (recyclerView != null) {
          a$c uoc2 = this.c0();
          if (uoc2.S == null) {
             LinearLayoutManager linearLayout = new LinearLayoutManager(this.u());
             linearLayout.setOrientation(uoc2.U);
             uoc2.S = linearLayout;
          }
          recyclerView.setLayoutManager(uoc2.S);
          uoc1 = uoc2.T;
          if (uoc1 != null && !uoc1.isEmpty()) {
             Iterator iterator1 = uoc2.T.iterator();
             while (iterator1.hasNext()) {
                recyclerView.addItemDecoration(iterator1.next());
             }
          }
          recyclerView.setAdapter(uoc2.R);
       }
       uoc = this.c0().I;
       if (uoc != null) {
          f.G(uoc, new c(this));
       }else {
          this.g0();
       }
       Iterator iterator = this.c0().H.iterator();
       while (iterator.hasNext()) {
          iterator.next().apply(this);
       }
       return;
    }
    public a$c c0(){
       return this.b;
    }
    public final void d0(TextView p0,int p1,Drawable p2,BubbleInterface$Position p3){
       if (p0 == null) {
          return;
       }
       Context context = p0.getContext();
       if (p2 == null) {
          p2 = (p1)? ContextCompat.getDrawable(context, p1): null;
       }
    label_0013 :
       if (p2 == null) {
          return;
       }else {
          p0.setTextSize(1, 15.00f);
          p0.setCompoundDrawablePadding(n.c(context, 12.00f));
          p1 = p0.getMeasuredHeight();
          if (!p1) {
             p0.measure(0, 0);
             p1 = p0.getMeasuredHeight();
          }
          p1 = ((p1 + n.c(context, 4.00f)) - p2.getIntrinsicHeight()) / 2;
          if (p1 > 0) {
             p0.setPadding(p0.getPaddingLeft(), p1, p0.getPaddingRight(), p1);
          }
          p1 = a$b.a[p3.ordinal()];
          if (p1 != 1) {
             if (p1 != 2) {
                if (p1 != 3) {
                   if (p1 == 4) {
                      p0.setCompoundDrawablesWithIntrinsicBounds(null, null, null, p2);
                   }
                }else {
                   p0.setCompoundDrawablesWithIntrinsicBounds(null, null, p2, null);
                }
             }else {
                p0.setCompoundDrawablesWithIntrinsicBounds(null, p2, null, null);
             }
          }else {
             p0.setCompoundDrawablesWithIntrinsicBounds(p2, null, null, null);
          }
          return;
       }
    }
    public void e0(int p0,int p1,a$d p2){
       if (this.p != null && (!p0 && (p1 && this.f != null))) {
          a$c uoc = this.c0();
          float translationX = this.f.getTranslationX();
          float translationY = this.f.getTranslationY();
          if (c.F(this)) {
             try{
                WindowManager$LayoutParams layoutParams = this.d.getLayoutParams();
                layoutParams.x = layoutParams.x + p0;
                layoutParams.y = layoutParams.y + p1;
                uoc.G.u().getWindowManager().updateViewLayout(this.d, layoutParams);
             }catch(java.lang.Exception e4){
                e4.printStackTrace();
                return;
             }
          }else {
             this.f.setTranslationX(((float)p0 + translationX));
             this.f.setTranslationY(((float)p1 + translationY));
             this.f.getX();
             this.f.getY();
             c$b j = uoc.j;
          }
       }
       return;
    }
    public final void g0(){
       f.G(this.f, new d(this));
    }
    public final int[] h0(Activity p0,int p1,int p2,int p3,int p4,BubbleInterface$Position p5){
       int[] ointArray;
       WindowManager$LayoutParams layoutParams = this.d.getLayoutParams();
       layoutParams.x = p1;
       layoutParams.y = p2;
       p0.getWindowManager().updateViewLayout(this.d, layoutParams);
       if (p5 == BubbleInterface$Position.LEFT || p5 == BubbleInterface$Position.TOP) {
          ointArray = new int[]{Math.min(p1, 0),Math.min(p2, 0)};
          return ointArray;
       }else if(p5 == BubbleInterface$Position.RIGHT || p5 == BubbleInterface$Position.BOTTOM){
          ointArray = new int[]{Math.max(((p1 + p3) - f.v(p0)), 0),Math.max(((p2 + p4) - f.r(p0)), 0)};
          return ointArray;
       }else {
          return new int[2]{0,0};
       }
    }
}
