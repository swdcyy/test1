package androidx.appcompat.widget.AppCompatSpinner$e;
import androidx.appcompat.widget.AppCompatSpinner$f;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.AppCompatSpinner;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner$e$a;
import android.widget.AdapterView$OnItemClickListener;
import android.graphics.drawable.Drawable;
import w0.b0;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Math;
import a2.i0;
import java.lang.CharSequence;
import android.widget.ListView;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner$e$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.appcompat.widget.AppCompatSpinner$e$c;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.ListAdapter;

public class AppCompatSpinner$e extends ListPopupWindow implements AppCompatSpinner$f	// class@0005f5
{
    public CharSequence K;
    public ListAdapter L;
    public final Rect M;
    public int N;
    public final AppCompatSpinner O;

    public void AppCompatSpinner$e(AppCompatSpinner p0,Context p1,AttributeSet p2,int p3){
       this.O = p0;
       super(p1, p2, p3);
       this.M = new Rect();
       this.z(p0);
       this.F(true);
       this.K(0);
       this.H(new AppCompatSpinner$e$a(this, p0));
    }
    public static void N(AppCompatSpinner$e p0){
       p0.show();
    }
    public void O(){
       Drawable uDrawable = this.f();
       AppCompatSpinner$e uoe = null;
       if (uDrawable != null) {
          uDrawable.getPadding(this.O.i);
          Rect right = (b0.b(this.O))? this.O.i.right: - this.O.i.left;
          uoe = right;
       }else {
          AppCompatSpinner i4 = this.O.i;
          i4.right = uoe;
          i4.left = uoe;
       }
       int paddingLeft = this.O.getPaddingLeft();
       int paddingRight = this.O.getPaddingRight();
       int width = this.O.getWidth();
       AppCompatSpinner$e tO = this.O;
       AppCompatSpinner h = tO.h;
       if (h == -2) {
          int i = tO.a(this.L, this.f());
          AppCompatSpinner i1 = this.O.i;
          int i2 = (c.c(this.O.getContext().getResources()).widthPixels - i1.left) - i1.right;
          if (i > i2) {
             i = i2;
          }
          this.B(Math.max(i, ((width - paddingLeft) - paddingRight)));
       }else if(h == -1){
          this.B(((width - paddingLeft) - paddingRight));
       }else {
          this.B(h);
       }
       int i3 = (b0.b(this.O))? uoe + (((width - paddingRight) - this.v()) - this.p()): uoe + (paddingLeft + this.p());
       this.n(i3);
       return;
    }
    public boolean P(View p0){
       boolean b = (i0.X(p0) && p0.getGlobalVisibleRect(this.M))? true: false;
       return b;
    }
    public CharSequence g(){
       return this.K;
    }
    public void h(int p0,int p1){
       this.O();
       this.E(2);
       this.show();
       ListView listView = this.i();
       listView.setChoiceMode(1);
       listView.setTextDirection(p0);
       listView.setTextAlignment(p1);
       this.L(this.O.getSelectedItemPosition());
       if (this.d()) {
          return;
       }
       ViewTreeObserver viewTreeObse = this.O.getViewTreeObserver();
       if (viewTreeObse != null) {
          AppCompatSpinner$e$b uoe$b = new AppCompatSpinner$e$b(this);
          viewTreeObse.addOnGlobalLayoutListener(uoe$b);
          this.G(new AppCompatSpinner$e$c(this, uoe$b));
       }
       return;
    }
    public void k(int p0){
       this.N = p0;
    }
    public void o(CharSequence p0){
       this.K = p0;
    }
    public int p(){
       return this.N;
    }
    public void q(ListAdapter p0){
       super.q(p0);
       this.L = p0;
    }
}
