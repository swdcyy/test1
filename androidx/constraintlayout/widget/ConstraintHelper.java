package androidx.constraintlayout.widget.ConstraintHelper;
import android.view.View;
import android.content.Context;
import java.util.HashMap;
import android.util.AttributeSet;
import java.lang.String;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.Integer;
import java.lang.Object;
import java.util.Arrays;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.content.res.Resources;
import j1.c;
import java.lang.reflect.Field;
import java.lang.Class;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import androidx.constraintlayout.widget.a$a;
import h1.b;
import android.util.SparseArray;
import androidx.constraintlayout.widget.a$b;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.d;
import h1.a;

public abstract class ConstraintHelper extends View	// class@0006b2
{
    public int[] b;
    public int c;
    public Context d;
    public a e;
    public boolean f;
    public String g;
    public String h;
    public View[] i;
    public HashMap j;

    public void ConstraintHelper(Context p0){
       super(p0);
       int[] ointArray = new int[32];
       this.b = ointArray;
       this.f = false;
       this.i = null;
       this.j = new HashMap();
       this.d = p0;
       this.o(null);
    }
    public void ConstraintHelper(Context p0,AttributeSet p1){
       super(p0, p1);
       int[] ointArray = new int[32];
       this.b = ointArray;
       this.f = false;
       this.i = null;
       this.j = new HashMap();
       this.d = p0;
       this.o(p1);
    }
    public void ConstraintHelper(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[32];
       this.b = ointArray;
       this.f = false;
       this.i = null;
       this.j = new HashMap();
       this.d = p0;
       this.o(p1);
    }
    public final void e(String p0){
       if (p0 != null && p0.length()) {
          if (this.d == null) {
             return;
          }else {
             p0 = p0.trim();
             if (this.getParent() instanceof ConstraintLayout) {
                ConstraintLayout parent = this.getParent();
             }
             int i = this.m(p0);
             if (i) {
                this.j.put(Integer.valueOf(i), p0);
                this.f(i);
             }
          }
       }
       return;
    }
    public final void f(int p0){
       if (p0 == this.getId()) {
          return;
       }
       ConstraintHelper tb = this.b;
       if ((this.c + 1) > tb.length) {
          this.b = Arrays.copyOf(tb, (tb.length * 2));
       }
       tb = this.c;
       this.b[tb] = p0;
       this.c = tb + 1;
       return;
    }
    public final void g(String p0){
       if (p0 != null && p0.length()) {
          if (this.d == null) {
             return;
          }else {
             p0 = p0.trim();
             ConstraintLayout uConstraintL = null;
             if (this.getParent() instanceof ConstraintLayout) {
                uConstraintL = this.getParent();
             }
             if (uConstraintL == null) {
                return;
             }else {
                int childCount = uConstraintL.getChildCount();
                int i = 0;
                while (i < childCount) {
                   View childAt = uConstraintL.getChildAt(i);
                   ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                   if (!layoutParams instanceof ConstraintLayout$LayoutParams || (p0.equals(layoutParams.V) && childAt.getId() != -1)) {
                      this.f(childAt.getId());
                   }
                label_0050 :
                   i = i + 1;
                }
             }
          }
       }
       return;
    }
    public int[] getReferencedIds(){
       return Arrays.copyOf(this.b, this.c);
    }
    public void h(View p0){
       if (p0 == this) {
          return;
       }
       if (p0.getId() == -1) {
          return;
       }
       if (p0.getParent() == null) {
          return;
       }
       this.g = null;
       this.f(p0.getId());
       this.requestLayout();
       return;
    }
    public void i(){
       ViewParent parent = this.getParent();
       if (parent != null && parent instanceof ConstraintLayout) {
          this.j(parent);
       }
       return;
    }
    public void j(ConstraintLayout p0){
       int visibility = this.getVisibility();
       float elevation = this.getElevation();
       int i = 0;
       while (i < this.c) {
          View viewById = p0.getViewById(this.b[i]);
          if (viewById != null) {
             viewById.setVisibility(visibility);
             if (elevation > 0) {
                float f = viewById.getTranslationZ() + elevation;
                viewById.setTranslationZ(f);
             }
          }
          i = i + 1;
       }
       return;
    }
    public final int[] k(View p0,String p1){
       String[] stringArray = p1.split(",");
       p0.getContext();
       int[] ointArray = new int[stringArray.length];
       int i = 0;
       int i1 = 0;
       while (i < stringArray.length) {
          int i2 = this.m((stringArray[i]).trim());
          if (i2) {
             int i3 = i1 + 1;
             ointArray[i1] = i2;
             i1 = i3;
          }
          i = i + 1;
       }
       if (i1 != stringArray.length) {
          ointArray = Arrays.copyOf(ointArray, i1);
       }
       return ointArray;
    }
    public final int l(ConstraintLayout p0,String p1){
       if (p1 != null) {
          Resources resources = this.d.getResources();
          if (resources == null) {
             return 0;
          }else {
             int childCount = p0.getChildCount();
             int i = 0;
             while (i < childCount) {
                View childAt = p0.getChildAt(i);
                if (childAt.getId() != -1) {
                   String str = null;
                   try{
                      str = resources.getResourceEntryName(childAt.getId());
                   }catch(android.content.res.Resources$NotFoundException e0){
                   }
                   if (p1.equals(str)) {
                      return childAt.getId();
                   }
                }
                i = i + 1;
             }
          }
       }
       return 0;
    }
    public final int m(String p0){
       Object obj = null;
       ConstraintLayout parent = (this.getParent() instanceof ConstraintLayout)? this.getParent(): obj;
       int i = 0;
       if (this.isInEditMode() && parent != null) {
          Object designInform = parent.getDesignInformation(i, p0);
          if (designInform instanceof Integer) {
             i = designInform.intValue();
          }
       }
       if (!i && parent != null) {
          i = this.l(parent, p0);
       }
       if (!i) {
          try{
             i = c.class.getField(p0).getInt(obj);
          }catch(java.lang.Exception e0){
          }
       }
    }
    public View[] n(ConstraintLayout p0){
       ConstraintHelper ti = this.i;
       if (ti == null || ti.length != this.c) {
          View[] viewArray = new View[this.c];
          this.i = viewArray;
       }
       for (int i = 0; i < this.c; i = i + 1) {
          this.i[i] = p0.getViewById(this.b[i]);
       }
       return this.i;
    }
    public void o(AttributeSet p0){
       String str;
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.a0);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          while (i < indexCount) {
             int index = typedArray.getIndex(i);
             if (index == 19) {
                str = typedArray.getString(index);
                this.g = str;
                this.setIds(str);
             }else if(index == 20){
                str = typedArray.getString(index);
                this.h = str;
                this.setReferenceTags(str);
             }
             i = i + 1;
          }
          typedArray.recycle();
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       ConstraintHelper tg = this.g;
       if (tg != null) {
          this.setIds(tg);
       }
       tg = this.h;
       if (tg != null) {
          this.setReferenceTags(tg);
       }
       return;
    }
    public void onDraw(Canvas p0){
    }
    public void onMeasure(int p0,int p1){
       if (this.f != null) {
          super.onMeasure(p0, p1);
       }else {
          this.setMeasuredDimension(0, 0);
       }
       return;
    }
    public void p(a$a p0,b p1,ConstraintLayout$LayoutParams p2,SparseArray p3){
       a$a d = p0.d;
       a$b e0 = d.e0;
       if (e0 != null) {
          this.setReferencedIds(e0);
       }else {
          a$b uob = d.f0;
          if (uob != null && uob.length() > 0) {
             d = p0.d;
             d.e0 = this.k(this, d.f0);
          }
       }
       p1.a();
       if (p0.d.e0 != null) {
          int i = 0;
          e0 = p0.d.e0;
          while (i < e0.length) {
             ConstraintWidget uConstraintW = p3.get(e0[i]);
             if (uConstraintW != null) {
                p1.c(uConstraintW);
             }
             i++;
          }
       }
       return;
    }
    public void q(View p0){
       int id = p0.getId();
       int i = -1;
       if (id == i) {
          return;
       }
       this.g = null;
       int i1 = 0;
       while (i1 < this.c) {
          if (this.b[i1] == id) {
             id = this.c + i;
             while (i1 < id) {
                ConstraintHelper tb = this.b;
                int i2 = i1 + 1;
                tb[i1] = tb[i2];
                i1 = i2;
             }
             this.b[id] = 0;
             this.c = id;
          }else {
             i1 = i1 + 1;
          }
       }
       this.requestLayout();
       return;
    }
    public void r(ConstraintWidget p0,boolean p1){
    }
    public void s(ConstraintLayout p0){
    }
    public void setIds(String p0){
       this.g = p0;
       if (p0 == null) {
          return;
       }
       int i = 0;
       this.c = i;
       int i1 = p0.indexOf(44, i);
       while (i1 != -1) {
          this.e(p0.substring(i, i1));
          i = i1 + 1;
       }
       this.e(p0.substring(i));
       return;
    }
    public void setReferenceTags(String p0){
       this.h = p0;
       if (p0 == null) {
          return;
       }
       int i = 0;
       this.c = i;
       int i1 = p0.indexOf(44, i);
       while (i1 != -1) {
          this.g(p0.substring(i, i1));
          i = i1 + 1;
       }
       this.g(p0.substring(i));
       return;
    }
    public void setReferencedIds(int[] p0){
       this.g = null;
       int i = 0;
       this.c = i;
       for (; i < p0.length; i = i + 1) {
          this.f(p0[i]);
       }
       return;
    }
    public void setTag(int p0,Object p1){
       super.setTag(p0, p1);
       if (p1 == null && this.g == null) {
          this.f(p0);
       }
       return;
    }
    public void t(ConstraintLayout p0){
    }
    public void u(d p0,a p1,SparseArray p2){
       p1.a();
       for (int i = 0; i < this.c; i++) {
          p1.c(p2.get(this.b[i]));
       }
       return;
    }
    public void v(ConstraintLayout p0){
       if (this.isInEditMode()) {
          this.setIds(this.g);
       }
       ConstraintHelper te = this.e;
       if (te == null) {
          return;
       }else {
          te.a();
          int i = 0;
          while (i < this.c) {
             int i1 = this.b[i];
             View viewById = p0.getViewById(i1);
             if (viewById == null) {
                String str = this.j.get(Integer.valueOf(i1));
                int i2 = this.l(p0, str);
                if (i2) {
                   this.b[i] = i2;
                   this.j.put(Integer.valueOf(i2), str);
                   viewById = p0.getViewById(i2);
                }
             }
             if (viewById != null) {
                this.e.c(p0.getViewWidget(viewById));
             }
             i = i + 1;
          }
          this.e.b(p0.d);
          return;
       }
    }
    public void w(){
       if (this.e == null) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       if (layoutParams instanceof ConstraintLayout$LayoutParams) {
          layoutParams.n0 = this.e;
       }
       return;
    }
}
