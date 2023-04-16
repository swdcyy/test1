package com.google.android.material.bottomsheet.DownloadBottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import android.view.MotionEvent;
import com.google.android.material.bottomsheet.DownloadBottomSheetBehavior$b;
import android.view.ViewGroup;
import usd.k;
import usd.q;
import java.util.Iterator;
import java.lang.Iterable;
import trd.l0;
import com.google.android.material.bottomsheet.DownloadBottomSheetBehavior$a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import ywb.e;
import java.lang.StringBuilder;
import q87.c;

public final class DownloadBottomSheetBehavior extends BottomSheetBehavior	// class@00165d
{
    public boolean a;
    public DownloadBottomSheetBehavior$a b;
    public int c;
    public int d;
    public final int[] e;

    public void DownloadBottomSheetBehavior(){
       super();
       this.a = true;
       this.c = -1;
       this.d = -1;
       int[] ointArray = new int[2];
       this.e = ointArray;
    }
    public void DownloadBottomSheetBehavior(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
       this.a = true;
       this.c = -1;
       this.d = -1;
       int[] ointArray = new int[2];
       this.e = ointArray;
    }
    public final boolean c(View p0,MotionEvent p1){
       p0.getLocationOnScreen(this.e);
       float rawX = p1.getRawX();
       float rawY = p1.getRawY();
       DownloadBottomSheetBehavior te = this.e;
       if (rawX - (float)te[0] >= 0 && rawX - (float)(te[0] + p0.getWidth()) <= 0) {
          DownloadBottomSheetBehavior te1 = this.e;
          if (rawY - (float)te1[1] >= 0 && rawY - (float)(te1[1] + p0.getHeight()) <= 0) {
             if (p0 instanceof DownloadBottomSheetBehavior$b && p0.s()) {
                return 1;
             }else if(p0 instanceof ViewGroup){
                Iterator iterator = q.n1(0, p0.getChildCount()).iterator();
                while (iterator.hasNext()) {
                   View childAt = p0.getChildAt(iterator.b());
                   a.o(childAt, "view.getChildAt\(index\)");
                   if (this.c(childAt, p1)) {
                      return 1;
                   }
                }
             }
          }
       }
       return 0;
    }
    public final void d(DownloadBottomSheetBehavior$a p0){
       a.p(p0, "hideInterceptor");
       this.b = p0;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       a.p(p0, "parent");
       a.p(p1, "child");
       a.p(p2, "event");
       boolean b = false;
       int i = (this.a != null && super.onInterceptTouchEvent(p0, p1, p2))? 1: 0;
       if (!p2.getActionMasked()) {
          this.c = (int)p2.getX();
          this.d = (int)p2.getY();
       }
       if (i && (p2.getActionMasked() == 2 && Math.abs((p2.getX() - (float)this.c)) - Math.abs((p2.getY() - (float)this.d)) >= 0)) {
          i = 0;
       }
    label_0057 :
       if (!i || !this.c(p0, p2)) {
          b = i;
       }
       return b;
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       a.p(p0, "parent");
       a.p(p1, "child");
       this.setPeekHeight(p1.getHeight());
       return super.onLayoutChild(p0, p1, p2);
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       a.p(p0, "coordinatorLayout");
       a.p(p1, "child");
       a.p(p2, "directTargetChild");
       a.p(p3, "target");
       boolean b = false;
       if (!(p4 & 0x02)) {
          this.touchingScrollingChild = b;
       }
       if (this.a != null && super.onStartNestedScroll(p0, p1, p2, p3, p4, p5)) {
          b = true;
       }
       return b;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       boolean i;
       a.p(p0, "parent");
       a.p(p1, "child");
       a.p(p2, "event");
       try{
          i = 0;
          if (this.a != null && super.onTouchEvent(p0, p1, p2)) {
             i = true;
          }
          return i;
       }catch(java.lang.IllegalArgumentException e3){
          e3.printStackTrace();
          Object[] objArray = new Object[i];
          e.C().t("download", "DownloadBottomSheetBehavior onTouchEvent:"+e3, objArray);
          return i;
       }
    }
    public boolean shouldHide(View p0,float p1){
       a.p(p0, "child");
       boolean b = false;
       DownloadBottomSheetBehavior uDownloadBot = (((float)p0.getTop() + (p1 * 0.20f)) - ((float)this.fitToContentsOffset + ((float)p0.getHeight() / 2.00f)) >= 0)? 1: null;
       if (uDownloadBot) {
          uDownloadBot = this.b;
          if (uDownloadBot == null || uDownloadBot.a() != true) {
             b = true;
          }
       }
       return b;
    }
}
