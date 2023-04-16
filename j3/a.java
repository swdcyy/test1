package j3.a;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;
import android.animation.LayoutTransition;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Class;
import java.lang.reflect.Array;
import android.view.ViewGroup$LayoutParams;
import java.lang.IllegalStateException;
import java.lang.String;
import j3.a$a;
import java.util.Comparator;
import java.util.Arrays;

public final class a	// class@002221
{
    public LinearLayoutManager a;
    public static final ViewGroup$MarginLayoutParams b;

    static {
       ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-1, -1);
       a.b = marginLayout;
       marginLayout.setMargins(0, 0, 0, 0);
    }
    public void a(LinearLayoutManager p0){
       super();
       this.a = p0;
    }
    public static boolean c(View p0){
       if (p0 instanceof ViewGroup) {
          LayoutTransition layoutTransi = p0.getLayoutTransition();
          if (layoutTransi != null && layoutTransi.isChangingLayout()) {
             return true;
          }else {
             int childCount = p0.getChildCount();
             int i = 0;
             while (i < childCount) {
                if (a.c(p0.getChildAt(i))) {
                   return true;
                }
                i = i + 1;
             }
          }
       }
       return false;
    }
    public final boolean a(){
       int left;
       ViewGroup$MarginLayoutParams leftMargin;
       int right;
       ViewGroup$MarginLayoutParams rightMargin;
       int childCount = this.a.getChildCount();
       boolean b = true;
       if (!childCount) {
          return b;
       }
       a$a uoa = (!this.a.getOrientation())? 1: null;
       int[] ointArray = new int[]{childCount,2};
       int[][] ointArray1 = Array.newInstance(int.class, ointArray);
       int i = 0;
       while (true) {
          if (i < childCount) {
             View childAt = this.a.getChildAt(i);
             if (childAt != null) {
                ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                }else {
                   rightMargin = a.b;
                }
                object oobject = ointArray1[i];
                if (uoa) {
                   left = childAt.getLeft();
                   leftMargin = layoutParams.leftMargin;
                }else {
                   left = childAt.getTop();
                   leftMargin = layoutParams.topMargin;
                }
                left = left - leftMargin;
                oobject[0] = left;
                oobject = ointArray1[i];
                if (uoa) {
                   right = childAt.getRight();
                   rightMargin = layoutParams.rightMargin;
                }else {
                   right = childAt.getBottom();
                   rightMargin = layoutParams.bottomMargin;
                }
                right = right + rightMargin;
                oobject[b] = right;
                i = i + 1;
             }else {
                break ;
             }
          }else {
             Arrays.sort(ointArray1, new a$a(this));
             int i1 = 1;
             while (true) {
                if (i1 < childCount) {
                   i = i1 - 1;
                   if (ointArray1[i][b] != ointArray1[i1][0]) {
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i1 = ointArray1[0][b] - ointArray1[0][0];
                   if (ointArray1[0][0] > 0 || ointArray1[(childCount - b)][b] < i1) {
                      return 0;
                   }else {
                      return b;
                   }
                }
             }
             return 0;
          }
       }
       throw new IllegalStateException("null view contained in the view hierarchy");
    }
    public final boolean b(){
       int childCount = this.a.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return false;
          }
          if (a.c(this.a.getChildAt(i))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public boolean d(){
       boolean b = true;
       if (this.a() && (this.a.getChildCount() > b || !this.b())) {
          b = false;
       }
       return b;
    }
}
