package com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import androidx.appcompat.view.menu.k;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import z1.g;
import android.content.res.Resources;
import cw9.c;
import android.content.res.ColorStateList;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import l2.b;
import android.animation.TimeInterpolator;
import ck.j;
import androidx.transition.Transition;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView$a;
import java.lang.Object;
import z1.f;
import androidx.appcompat.view.menu.e;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import java.util.ArrayList;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter;
import android.view.MenuItem;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.h;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import android.view.View;
import java.lang.Math;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import r0.a;
import androidx.transition.e;
import a2.i0;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;

public class BottomNavigationMenuView extends ViewGroup implements k	// class@001647
{
    public final TransitionSet b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final View$OnClickListener h;
    public final f i;
    public boolean j;
    public int k;
    public BottomNavigationItemView[] l;
    public int m;
    public int n;
    public ColorStateList o;
    public int p;
    public ColorStateList q;
    public final ColorStateList r;
    public int s;
    public int t;
    public Drawable u;
    public int v;
    public int[] w;
    public BottomNavigationPresenter x;
    public e y;
    public static final int[] A;
    public static final int[] z;

    static {
       int[] ointArray = new int[]{0x10100a0};
       BottomNavigationMenuView.z = ointArray;
       int[] ointArray1 = new int[]{-16842910};
       BottomNavigationMenuView.A = ointArray1;
    }
    public void BottomNavigationMenuView(Context p0){
       super(p0, null);
    }
    public void BottomNavigationMenuView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = new g(5);
       this.m = 0;
       this.n = 0;
       Resources resources = this.getResources();
       this.c = c.b(resources, 0x7f0701a3);
       this.d = c.b(resources, 0x7f0701a4);
       this.e = c.b(resources, 0x7f07019d);
       this.f = c.b(resources, 0x7f07019e);
       this.g = c.b(resources, 0x7f0701a1);
       this.r = this.b(0x1010038);
       AutoTransition uAutoTransit = new AutoTransition();
       this.b = uAutoTransit;
       uAutoTransit.t0(0);
       uAutoTransit.r0(115);
       uAutoTransit.s0(new b());
       uAutoTransit.l0(new j());
       this.h = new BottomNavigationMenuView$a(this);
       int[] ointArray = new int[5];
       this.w = ointArray;
    }
    public void a(){
       int len;
       this.removeAllViews();
       BottomNavigationMenuView tl = this.l;
       int i = 0;
       if (tl != null) {
          len = tl.length;
          int i1 = 0;
          while (i1 < len) {
             object oobject = tl[i1];
             if (oobject != null) {
                this.i.a(oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!this.y.size()) {
          this.m = i;
          this.n = i;
          this.l = null;
          return;
       }else {
          BottomNavigationItemView[] uBottomNavig = new BottomNavigationItemView[this.y.size()];
          this.l = uBottomNavig;
          int b = this.e(this.k, this.y.G().size());
          len = 0;
          boolean b1 = true;
          while (len < this.y.size()) {
             this.x.n(b1);
             this.y.getItem(len).setCheckable(b1);
             this.x.n(i);
             BottomNavigationItemView newItem = this.getNewItem();
             this.l[len] = newItem;
             newItem.setIconTintList(this.o);
             newItem.setIconSize(this.p);
             newItem.setTextColor(this.r);
             newItem.setTextAppearanceInactive(this.s);
             newItem.setTextAppearanceActive(this.t);
             newItem.setTextColor(this.q);
             BottomNavigationMenuView tu = this.u;
             if (tu != null) {
                newItem.setItemBackground(tu);
             }else {
                newItem.setItemBackground(this.v);
             }
             newItem.setShifting(b);
             newItem.setLabelVisibilityMode(this.k);
             newItem.k(this.y.getItem(len), i);
             newItem.setItemPosition(len);
             newItem.setOnClickListener(this.h);
             this.addView(newItem);
             len = len + 1;
          }
          b = Math.min((this.y.size() - b1), this.n);
          this.n = b;
          this.y.getItem(b).setChecked(b1);
          return;
       }
    }
    public ColorStateList b(int p0){
       int[] a;
       TypedValue typedValue = new TypedValue();
       ColorStateList uColorStateL = null;
       if (!this.getContext().getTheme().resolveAttribute(p0, typedValue, true)) {
          return uColorStateL;
       }
       ColorStateList uColorStateL1 = a.c(this.getContext(), typedValue.resourceId);
       if (!this.getContext().getTheme().resolveAttribute(0x7f04021c, typedValue, true)) {
          return uColorStateL;
       }
       int defaultColor = uColorStateL1.getDefaultColor();
       int[][] ointArray = new int[][3]{a,BottomNavigationMenuView.z,ViewGroup.EMPTY_STATE_SET};
       a = BottomNavigationMenuView.A;
       int[] ointArray1 = new int[]{uColorStateL1.getColorForState(a, defaultColor),typedValue.data,defaultColor};
       return new ColorStateList(ointArray, ointArray1);
    }
    public boolean c(){
       return this.j;
    }
    public void d(e p0){
       this.y = p0;
    }
    public final boolean e(int p0,int p1){
       boolean b = true;
       if (p0 == -1) {
          if (p1 <= 3) {
          label_000c :
             b = false;
          }
       }else if(!p0){
       }
       return b;
    }
    public void f(int p0){
       int i = this.y.size();
       int i1 = 0;
       while (i1 < i) {
          MenuItem item = this.y.getItem(i1);
          if (p0 == item.getItemId()) {
             this.m = p0;
             this.n = i1;
             item.setChecked(true);
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return;
    }
    public void g(){
       BottomNavigationMenuView ty = this.y;
       if (ty != null && this.l != null) {
          int i = ty.size();
          if (i != this.l.length) {
             this.a();
             return;
          }else {
             BottomNavigationMenuView tm = this.m;
             int i1 = 0;
             while (i1 < i) {
                MenuItem item = this.y.getItem(i1);
                if (item.isChecked()) {
                   this.m = item.getItemId();
                   this.n = i1;
                }
                i1 = i1 + 1;
             }
             if (tm != this.m) {
                e.b(this, this.b);
             }
             boolean b = this.e(this.k, this.y.G().size());
             for (i1 = 0; i1 < i; i1 = i1 + 1) {
                this.x.n(true);
                this.l[i1].setLabelVisibilityMode(this.k);
                this.l[i1].setShifting(b);
                this.l[i1].k(this.y.getItem(i1), 0);
                this.x.n(0);
             }
          }
       }
       return;
    }
    public ColorStateList getIconTintList(){
       return this.o;
    }
    public Drawable getItemBackground(){
       BottomNavigationMenuView tl = this.l;
       if (tl != null && tl.length > 0) {
          return tl[0].getBackground();
       }
       return this.u;
    }
    public int getItemBackgroundRes(){
       return this.v;
    }
    public int getItemIconSize(){
       return this.p;
    }
    public int getItemTextAppearanceActive(){
       return this.t;
    }
    public int getItemTextAppearanceInactive(){
       return this.s;
    }
    public ColorStateList getItemTextColor(){
       return this.q;
    }
    public int getLabelVisibilityMode(){
       return this.k;
    }
    public final BottomNavigationItemView getNewItem(){
       BottomNavigationItemView uBottomNavig = this.i.q();
       if (uBottomNavig == null) {
          uBottomNavig = new BottomNavigationItemView(this.getContext());
       }
       return uBottomNavig;
    }
    public int getSelectedItemId(){
       return this.m;
    }
    public int getWindowAnimations(){
       return 0;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i1;
       int childCount = this.getChildCount();
       p3 = p3 - p1;
       p4 = p4 - p2;
       p2 = 0;
       int i = 0;
       while (p2 < childCount) {
          View childAt = this.getChildAt(p2);
          if (childAt.getVisibility() != 8) {
             if (i0.B(this) == 1) {
                i1 = p3 - i;
                int i2 = i1 - childAt.getMeasuredWidth();
                childAt.layout(i2, 0, i1, p4);
             }else {
                i1 = childAt.getMeasuredWidth() + i;
                childAt.layout(i, 0, i1, p4);
             }
             i = i + childAt.getMeasuredWidth();
          }
          p2++;
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       View childAt;
       BottomNavigationMenuView tf;
       int i2;
       p0 = View$MeasureSpec.getSize(p0);
       p1 = this.y.G().size();
       int childCount = this.getChildCount();
       int i = View$MeasureSpec.makeMeasureSpec(this.g, 0x40000000);
       int i1 = 1;
       if (this.e(this.k, p1) && this.j != null) {
          childAt = this.getChildAt(this.n);
          tf = this.f;
          if (childAt.getVisibility() != 8) {
             childAt.measure(View$MeasureSpec.makeMeasureSpec(this.e, Integer.MIN_VALUE), i);
             tf = Math.max(tf, childAt.getMeasuredWidth());
          }
          i2 = (childAt.getVisibility() != 8)? 1: 0;
          p1 = p1 - i2;
          i2 = Math.min((p0 - (this.d * p1)), Math.min(tf, this.e));
          p0 = p0 - i2;
          int i3 = (!p1)? 1: p1;
          i3 = Math.min((p0 / i3), this.c);
          p0 = p0 - (p1 * i3);
          p1 = 0;
          while (p1 < childCount) {
             if (this.getChildAt(p1).getVisibility() != 8) {
                BottomNavigationMenuView tw = this.w;
                int i4 = (p1 == this.n)? i2: i3;
                tw[p1] = i4;
                if (p0 > 0) {
                   i4 = tw[p1] + i1;
                   tw[p1] = i4;
                   p0--;
                }
             }else {
                this.w[p1] = 0;
             }
             p1++;
          }
       }else if(!p1){
          i2 = 1;
       }else {
          i2 = p1;
       }
       i2 = Math.min((p0 / i2), this.e);
       p0 = p0 - (p1 * i2);
       p1 = 0;
       while (p1 < childCount) {
          if (this.getChildAt(p1).getVisibility() != 8) {
             tf = this.w;
             tf[p1] = i2;
             if (p0 > 0) {
                int i5 = tf[p1] + i1;
                tf[p1] = i5;
                p0--;
             }
          }else {
             this.w[p1] = 0;
          }
          p1++;
       }
       p0 = 0;
       p1 = 0;
       while (p0 < childCount) {
          childAt = this.getChildAt(p0);
          if (childAt.getVisibility() != 8) {
             childAt.measure(View$MeasureSpec.makeMeasureSpec(this.w[p0], 0x40000000), i);
             childAt.getLayoutParams().width = childAt.getMeasuredWidth();
             p1 = p1 + childAt.getMeasuredWidth();
          }
          p0++;
       }
       this.setMeasuredDimension(View.resolveSizeAndState(p1, View$MeasureSpec.makeMeasureSpec(p1, 0x40000000), 0), View.resolveSizeAndState(this.g, i, 0));
       return;
    }
    public void setIconTintList(ColorStateList p0){
       this.o = p0;
       BottomNavigationMenuView tl = this.l;
       if (tl != null) {
          int len = tl.length;
          for (int i = 0; i < len; i = i + 1) {
             tl[i].setIconTintList(p0);
          }
       }
       return;
    }
    public void setItemBackground(Drawable p0){
       this.u = p0;
       BottomNavigationMenuView tl = this.l;
       if (tl != null) {
          int len = tl.length;
          for (int i = 0; i < len; i = i + 1) {
             tl[i].setItemBackground(p0);
          }
       }
       return;
    }
    public void setItemBackgroundRes(int p0){
       this.v = p0;
       BottomNavigationMenuView tl = this.l;
       if (tl != null) {
          int len = tl.length;
          for (int i = 0; i < len; i = i + 1) {
             tl[i].setItemBackground(p0);
          }
       }
       return;
    }
    public void setItemHorizontalTranslationEnabled(boolean p0){
       this.j = p0;
    }
    public void setItemIconSize(int p0){
       this.p = p0;
       BottomNavigationMenuView tl = this.l;
       if (tl != null) {
          int len = tl.length;
          for (int i = 0; i < len; i = i + 1) {
             tl[i].setIconSize(p0);
          }
       }
       return;
    }
    public void setItemTextAppearanceActive(int p0){
       this.t = p0;
       BottomNavigationMenuView tl = this.l;
       if (tl != null) {
          int len = tl.length;
          int i = 0;
          while (i < len) {
             object oobject = tl[i];
             oobject.setTextAppearanceActive(p0);
             BottomNavigationMenuView tq = this.q;
             if (tq != null) {
                oobject.setTextColor(tq);
             }
             i = i + 1;
          }
       }
       return;
    }
    public void setItemTextAppearanceInactive(int p0){
       this.s = p0;
       BottomNavigationMenuView tl = this.l;
       if (tl != null) {
          int len = tl.length;
          int i = 0;
          while (i < len) {
             object oobject = tl[i];
             oobject.setTextAppearanceInactive(p0);
             BottomNavigationMenuView tq = this.q;
             if (tq != null) {
                oobject.setTextColor(tq);
             }
             i = i + 1;
          }
       }
       return;
    }
    public void setItemTextColor(ColorStateList p0){
       this.q = p0;
       BottomNavigationMenuView tl = this.l;
       if (tl != null) {
          int len = tl.length;
          for (int i = 0; i < len; i = i + 1) {
             tl[i].setTextColor(p0);
          }
       }
       return;
    }
    public void setLabelVisibilityMode(int p0){
       this.k = p0;
    }
    public void setPresenter(BottomNavigationPresenter p0){
       this.x = p0;
    }
}
