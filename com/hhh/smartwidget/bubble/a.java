package com.hhh.smartwidget.bubble.a;
import com.hhh.smartwidget.popup.c;
import com.hhh.smartwidget.bubble.a$d;
import com.hhh.smartwidget.popup.c$a;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import im.a;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import a2.i0;
import android.view.ViewTreeObserver;
import com.hhh.smartwidget.bubble.a$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.hhh.smartwidget.a;
import android.view.Window;
import android.widget.FrameLayout;
import com.hhh.smartwidget.bubble.a$c;
import java.lang.Enum;
import com.hhh.smartwidget.bubble.BubbleInterface$Position;
import java.lang.Math;
import com.hhh.smartwidget.bubble.a$b;

public class a extends c	// class@00057c
{

    public void a(a$d p0){
       super(p0);
    }
    public void n(Bundle p0){
       a$d uod = this.r();
       TextView textView = this.e(R.id.text);
       if (textView != null) {
          textView.setText(uod.A);
       }
       if (uod.C != null) {
          this.g.setOnClickListener(new a(this, uod));
       }
       RecyclerView recyclerView = this.e(R.id.recycler_view);
       if (recyclerView != null) {
          a$d uod1 = this.r();
          a$d g = uod1.G;
          if (g != null) {
             recyclerView.setLayoutManager(g);
          }else {
             LinearLayoutManager linearLayout = new LinearLayoutManager(this.f());
             uod1.G = linearLayout;
             recyclerView.setLayoutManager(linearLayout);
          }
          recyclerView.setAdapter(uod1.F);
       }
       uod = this.r();
       if (i0.Y(uod.z)) {
          this.t();
       }else {
          uod.z.getViewTreeObserver().addOnGlobalLayoutListener(new a$a(this, uod));
       }
       return;
    }
    public final a$d r(){
       return this.b;
    }
    public void s(){
       int i4;
       View view = this.e(R.id.arrow);
       a$d uod = this.r();
       int i = 2;
       int[] ointArray = new int[i];
       uod.z.getLocationInWindow(ointArray);
       int width = uod.z.getWidth();
       int height = uod.z.getHeight();
       int width1 = this.g.getWidth();
       int height1 = this.g.getHeight();
       int i1 = (this.f().getWindow().getDecorView().getHeight() - height1) - uod.K;
       int i2 = (this.f().getWindow().getDecorView().getWidth() - width1) - uod.J;
       int paddingTop = this.d.getPaddingTop();
       int i3 = a$c.a[uod.B.ordinal()];
       if (i3 != 1 && i3 != i) {
          if (i3 == 3 || i3 == 4) {
             i = (uod.B == BubbleInterface$Position.TOP)? ointArray[1] - height1: ointArray[1] + height;
             width = ((width - width1) >> 1) + ointArray[0];
             i4 = Math.min(Math.max(width, uod.J), i2);
             this.g.setTranslationX((float)i4);
             this.g.setTranslationY((float)(i - paddingTop));
             if (view != null && i4 != width) {
                view.setTranslationX((float)((width - i4) + uod.L));
             }
          }
       }else if(uod.B == BubbleInterface$Position.LEFT){
          i = ointArray[0] - width1;
       }else {
          i = ointArray[0] + width;
       }
       width = (((height - height1) >> 1) + ointArray[1]) - paddingTop;
       i4 = Math.min(Math.max(width, uod.K), i1);
       this.g.setTranslationX((float)i);
       this.g.setTranslationY((float)i4);
       if (view != null && i4 != width) {
          view.setTranslationY((float)((width - i4) + uod.L));
       }
    label_00de :
       return;
    }
    public void t(){
       if (i0.Y(this.g)) {
          this.s();
       }else {
          this.g.getViewTreeObserver().addOnGlobalLayoutListener(new a$b(this));
       }
       return;
    }
}
