package androidx.percentlayout.widget.a;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.content.Context;
import android.util.AttributeSet;
import androidx.percentlayout.widget.a$a;
import ll8.c$b;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import androidx.percentlayout.widget.a$b;

public class a	// class@000865
{
    public final ViewGroup a;

    public void a(ViewGroup p0){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("host must be non-null");
       }
       this.a = p0;
       return;
    }
    public static void b(ViewGroup$LayoutParams p0,TypedArray p1,int p2,int p3){
       p0.width = p1.getLayoutDimension(p2, 0);
       p0.height = p1.getLayoutDimension(p3, 0);
    }
    public static a$a c(Context p0,AttributeSet p1){
       a$a uoa;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.S3);
       int i = 1;
       float fraction = typedArray.getFraction(9, i, i, 0xbf800000);
       if (fraction - 0xbf800000) {
          uoa = new a$a();
          uoa.a = fraction;
       }else {
          uoa = 0;
       }
       fraction = typedArray.getFraction(i, i, i, 0xbf800000);
       if (fraction - 0xbf800000) {
          if (!uoa) {
             uoa = new a$a();
          }
          uoa.b = fraction;
       }
       fraction = typedArray.getFraction(5, i, i, 0xbf800000);
       if (fraction - 0xbf800000) {
          if (!uoa) {
             uoa = new a$a();
          }
          uoa.c = fraction;
          uoa.d = fraction;
          uoa.e = fraction;
          uoa.f = fraction;
       }
       fraction = typedArray.getFraction(4, i, i, 0xbf800000);
       if (fraction - 0xbf800000) {
          if (!uoa) {
             uoa = new a$a();
          }
          uoa.c = fraction;
       }
       fraction = typedArray.getFraction(8, i, i, 0xbf800000);
       if (fraction - 0xbf800000) {
          if (!uoa) {
             uoa = new a$a();
          }
          uoa.d = fraction;
       }
       fraction = typedArray.getFraction(6, i, i, 0xbf800000);
       if (fraction - 0xbf800000) {
          if (!uoa) {
             uoa = new a$a();
          }
          uoa.e = fraction;
       }
       fraction = typedArray.getFraction(2, i, i, 0xbf800000);
       if (fraction - 0xbf800000) {
          if (!uoa) {
             uoa = new a$a();
          }
          uoa.f = fraction;
       }
       fraction = typedArray.getFraction(7, i, i, 0xbf800000);
       if (fraction - 0xbf800000) {
          if (!uoa) {
             uoa = new a$a();
          }
          uoa.g = fraction;
       }
       fraction = typedArray.getFraction(3, i, i, 0xbf800000);
       if (fraction - 0xbf800000) {
          if (!uoa) {
             uoa = new a$a();
          }
          uoa.h = fraction;
       }
       fraction = typedArray.getFraction(0, i, i, 0xbf800000);
       if (fraction - 0xbf800000) {
          if (!uoa) {
             uoa = new a$a();
          }
          uoa.i = fraction;
       }
       typedArray.recycle();
       return uoa;
    }
    public static boolean f(View p0,a$a p1){
       boolean b = ((p0.getMeasuredHeightAndState() & 0xff000000) == 0x1000000 && (p1.b >= 0 && p1.j.height == -2))? true: false;
       return b;
    }
    public static boolean g(View p0,a$a p1){
       boolean b = ((p0.getMeasuredWidthAndState() & 0xff000000) == 0x1000000 && (p1.a >= 0 && p1.j.width == -2))? true: false;
       return b;
    }
    public void a(int p0,int p1){
       p0 = (View$MeasureSpec.getSize(p0) - this.a.getPaddingLeft()) - this.a.getPaddingRight();
       p1 = (View$MeasureSpec.getSize(p1) - this.a.getPaddingTop()) - this.a.getPaddingBottom();
       int childCount = this.a.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.a.getChildAt(i);
          ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
          if (layoutParams instanceof a$b) {
             a$a uoa = layoutParams.a();
             if (uoa != null) {
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                   uoa.b(childAt, layoutParams, p0, p1);
                }else {
                   uoa.a(layoutParams, p0, p1);
                }
             }
          }
          i = i + 1;
       }
       return;
    }
    public boolean d(){
       int childCount = this.a.getChildCount();
       int i = 0;
       boolean b = false;
       while (i < childCount) {
          View childAt = this.a.getChildAt(i);
          ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
          if (layoutParams instanceof a$b) {
             a$a uoa = layoutParams.a();
             if (uoa != null) {
                if (a.g(childAt, uoa)) {
                   layoutParams.width = -2;
                   b = true;
                }
                if (a.f(childAt, uoa)) {
                   layoutParams.height = -2;
                   b = true;
                }
             }
          }
          i = i + 1;
       }
       return b;
    }
    public void e(){
       int childCount = this.a.getChildCount();
       int i = 0;
       while (i < childCount) {
          ViewGroup$LayoutParams layoutParams = this.a.getChildAt(i).getLayoutParams();
          if (layoutParams instanceof a$b) {
             a$a uoa = layoutParams.a();
             if (uoa != null) {
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                   uoa.d(layoutParams);
                }else {
                   uoa.c(layoutParams);
                }
             }
          }
          i = i + 1;
       }
       return;
    }
}
