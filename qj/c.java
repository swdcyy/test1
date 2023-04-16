package qj.c;
import androidx.recyclerview.widget.RecyclerView$n;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.List;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import java.lang.Object;
import qj.b;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class c extends RecyclerView$n	// class@0029ec
{
    public Drawable a;
    public int b;
    public static final int[] c;

    static {
       int[] ointArray = new int[]{0x1010214};
       c.c = ointArray;
    }
    public void c(Context p0){
       super();
       TypedArray typedArray = p0.obtainStyledAttributes(c.c);
       this.a = typedArray.getDrawable(0);
       typedArray.recycle();
       this.n(3);
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       int childAdapter = p2.getChildAdapterPosition(p1);
       if (!childAdapter) {
          return;
       }
       if (!this.i() && !this.j()) {
          p0.set(0, 0, 0, 0);
          return;
       }else {
          FlexboxLayoutManager layoutManage = p2.getLayoutManager();
          List flexLines = layoutManage.getFlexLines();
          this.m(p0, childAdapter, layoutManage, flexLines, layoutManage.getFlexDirection());
          this.l(p0, childAdapter, layoutManage, flexLines);
          return;
       }
    }
    public void d(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       this.f(p0, p1);
       this.g(p0, p1);
    }
    public final void f(Canvas p0,RecyclerView p1){
       int i3;
       int i4;
       int i5;
       int i6;
       ViewGroup$MarginLayoutParams rightMargin;
       if (!this.i()) {
          return;
       }
       FlexboxLayoutManager layoutManage = p1.getLayoutManager();
       int flexDirectio = layoutManage.getFlexDirection();
       int i = p1.getLeft() - p1.getPaddingLeft();
       int i1 = p1.getRight() + p1.getPaddingRight();
       int childCount = p1.getChildCount();
       for (int i2 = 0; i2 < childCount; i2 = i2 + 1) {
          View childAt = p1.getChildAt(i2);
          RecyclerView$LayoutParams layoutParams = childAt.getLayoutParams();
          if (flexDirectio == 3) {
             i3 = childAt.getBottom() + layoutParams.bottomMargin;
             i4 = this.a.getIntrinsicHeight() + i3;
          }else {
             i4 = childAt.getTop() - layoutParams.topMargin;
             i3 = i4 - this.a.getIntrinsicHeight();
          }
          if (layoutManage.M()) {
             if (layoutManage.E0()) {
                i5 = childAt.getRight() + layoutParams.rightMargin;
                i5 = i5 + this.a.getIntrinsicWidth();
                i5 = Math.min(i5, i1);
                i6 = childAt.getLeft() - layoutParams.leftMargin;
             label_00a6 :
                this.a.setBounds(i6, i3, i5, i4);
                this.a.draw(p0);
             }else {
                i5 = childAt.getLeft() - layoutParams.leftMargin;
                i5 = i5 - this.a.getIntrinsicWidth();
                i5 = Math.max(i5, i);
                i6 = childAt.getRight();
                rightMargin = layoutParams.rightMargin;
             }
          }else {
             i5 = childAt.getLeft() - layoutParams.leftMargin;
             i6 = childAt.getRight();
             rightMargin = layoutParams.rightMargin;
          }
          i6 = i6 + rightMargin;
          i5 = i6;
          i6 = i5;
          goto label_00a6 ;
       }
       return;
    }
    public final void g(Canvas p0,RecyclerView p1){
       int i3;
       int i4;
       int i5;
       int bottom;
       ViewGroup$MarginLayoutParams bottomMargin;
       if (!this.j()) {
          return;
       }
       FlexboxLayoutManager layoutManage = p1.getLayoutManager();
       int i = p1.getTop() - p1.getPaddingTop();
       int i1 = p1.getBottom() + p1.getPaddingBottom();
       int childCount = p1.getChildCount();
       int flexDirectio = layoutManage.getFlexDirection();
       for (int i2 = 0; i2 < childCount; i2 = i2 + 1) {
          View childAt = p1.getChildAt(i2);
          RecyclerView$LayoutParams layoutParams = childAt.getLayoutParams();
          if (layoutManage.E0()) {
             i3 = childAt.getRight() + layoutParams.rightMargin;
             i4 = this.a.getIntrinsicWidth() + i3;
          }else {
             i4 = childAt.getLeft() - layoutParams.leftMargin;
             i3 = i4 - this.a.getIntrinsicWidth();
          }
          if (layoutManage.M()) {
             i5 = childAt.getTop() - layoutParams.topMargin;
             bottom = childAt.getBottom();
             bottomMargin = layoutParams.bottomMargin;
          }else if(flexDirectio == 3){
             i5 = childAt.getBottom() + layoutParams.bottomMargin;
             i5 = i5 + this.a.getIntrinsicHeight();
             bottom = childAt.getTop() - layoutParams.topMargin;
             i5 = bottom;
             bottom = Math.min(i5, i1);
          label_00a7 :
             this.a.setBounds(i3, i5, i4, bottom);
             this.a.draw(p0);
          }else {
             i5 = childAt.getTop() - layoutParams.topMargin;
             i5 = i5 - this.a.getIntrinsicHeight();
             i5 = Math.max(i5, i);
             bottom = childAt.getBottom();
             bottomMargin = layoutParams.bottomMargin;
          }
          bottom = bottom + bottomMargin;
          goto label_00a7 ;
       }
       return;
    }
    public final boolean h(int p0,List p1,FlexboxLayoutManager p2){
       int i = p2.f0(p0);
       boolean b = true;
       if (i != -1 && (i < p2.getFlexLinesInternal().size() && p2.getFlexLinesInternal().get(i).o == p0)) {
          return b;
       }
       if (!p0) {
          return b;
       }
       if (!p1.size()) {
          return false;
       }
       if (p1.get((p1.size() - b)).p != (p0 - b)) {
          b = false;
       }
       return b;
    }
    public final boolean i(){
       int i = 1;
       if ((this.b & i) > 0) {
       }else {
          i = false;
       }
       return i;
    }
    public final boolean j(){
       boolean b = ((this.b & 0x02) > 0)? true: false;
       return b;
    }
    public void k(Drawable p0){
       if (p0 == null) {
          throw new IllegalArgumentException("Drawable cannot be null.");
       }
       this.a = p0;
       return;
    }
    public final void l(Rect p0,int p1,FlexboxLayoutManager p2,List p3){
       if (!p3.size()) {
          return;
       }
       if (!p2.f0(p1)) {
          return;
       }
       if (p2.M()) {
          if (!this.i()) {
             p0.top = 0;
             p0.bottom = 0;
             return;
          }else {
             p0.top = this.a.getIntrinsicHeight();
             p0.bottom = 0;
          }
       }else if(!this.j()){
          return;
       }else if(p2.E0()){
          p0.right = this.a.getIntrinsicWidth();
          p0.left = 0;
       }else {
          p0.left = this.a.getIntrinsicWidth();
          p0.right = 0;
       }
       return;
    }
    public final void m(Rect p0,int p1,FlexboxLayoutManager p2,List p3,int p4){
       if (this.h(p1, p3, p2)) {
          return;
       }
       if (p2.M()) {
          if (!this.j()) {
             p0.left = 0;
             p0.right = 0;
             return;
          }else if(p2.E0()){
             p0.right = this.a.getIntrinsicWidth();
             p0.left = 0;
          }else {
             p0.left = this.a.getIntrinsicWidth();
             p0.right = 0;
          }
       }else if(!this.i()){
          p0.top = 0;
          p0.bottom = 0;
          return;
       }else if(p4 == 3){
          p0.bottom = this.a.getIntrinsicHeight();
          p0.top = 0;
       }else {
          p0.top = this.a.getIntrinsicHeight();
          p0.bottom = 0;
       }
       return;
    }
    public void n(int p0){
       this.b = p0;
    }
}
