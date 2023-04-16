package androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.a$a;
import android.view.ViewGroup;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.ActivityChooserView$a;
import androidx.appcompat.widget.ActivityChooserView$b;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.View;
import a2.i0;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import ag6.a;
import androidx.appcompat.widget.ActivityChooserView$g;
import android.widget.FrameLayout;
import android.view.View$OnClickListener;
import android.view.View$OnLongClickListener;
import android.widget.ImageView;
import androidx.appcompat.widget.ActivityChooserView$c;
import android.view.View$AccessibilityDelegate;
import androidx.appcompat.widget.ActivityChooserView$d;
import android.view.View$OnTouchListener;
import androidx.appcompat.widget.ActivityChooserView$f;
import androidx.appcompat.widget.ActivityChooserView$e;
import android.database.DataSetObserver;
import android.widget.BaseAdapter;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Math;
import androidx.appcompat.widget.ListPopupWindow;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.appcompat.widget.a;
import a2.b;
import android.widget.ListView;
import java.lang.String;
import java.lang.CharSequence;
import android.graphics.drawable.ColorDrawable;
import java.lang.IllegalStateException;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager;
import java.lang.Object;
import android.widget.ListAdapter;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.PopupWindow$OnDismissListener;
import android.database.DataSetObservable;
import android.view.View$MeasureSpec;

public class ActivityChooserView extends ViewGroup implements a$a	// class@0005de
{
    public final ActivityChooserView$f b;
    public final ActivityChooserView$g c;
    public final View d;
    public final Drawable e;
    public final FrameLayout f;
    public final ImageView g;
    public final FrameLayout h;
    public final ImageView i;
    public final int j;
    public b k;
    public final DataSetObserver l;
    public final ViewTreeObserver$OnGlobalLayoutListener m;
    public ListPopupWindow n;
    public PopupWindow$OnDismissListener o;
    public boolean p;
    public int q;
    public boolean r;
    public int s;

    public void ActivityChooserView(Context p0){
       super(p0, null);
    }
    public void ActivityChooserView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ActivityChooserView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.l = new ActivityChooserView$a(this);
       this.m = new ActivityChooserView$b(this);
       this.q = 4;
       int[] g = c$b.g;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, g, p2, 0);
       i0.q0(this, p0, g, p1, typedArray, p2, 0);
       this.q = typedArray.getInt(1, 4);
       typedArray.recycle();
       a.c(LayoutInflater.from(this.getContext()), R.layout.arg_RES_7f0d0006, this, 1);
       ActivityChooserView$g og = new ActivityChooserView$g(this);
       this.c = og;
       View view = this.findViewById(R.id.activity_chooser_view_content);
       this.d = view;
       this.e = view.getBackground();
       FrameLayout uFrameLayout = this.findViewById(R.id.default_activity_button);
       this.h = uFrameLayout;
       uFrameLayout.setOnClickListener(og);
       uFrameLayout.setOnLongClickListener(og);
       this.i = uFrameLayout.findViewById(0x7f0a134d);
       uFrameLayout = this.findViewById(R.id.expand_activities_button);
       uFrameLayout.setOnClickListener(og);
       uFrameLayout.setAccessibilityDelegate(new ActivityChooserView$c(this));
       uFrameLayout.setOnTouchListener(new ActivityChooserView$d(this, uFrameLayout));
       this.f = uFrameLayout;
       ImageView imageView = uFrameLayout.findViewById(R.id.image);
       this.g = imageView;
       imageView.setImageDrawable(typedArray.getDrawable(0));
       ActivityChooserView$f uof = new ActivityChooserView$f(this);
       this.b = uof;
       uof.registerDataSetObserver(new ActivityChooserView$e(this));
       Resources resources = p0.getResources();
       this.j = Math.max((c.c(resources).widthPixels / 2), c.b(resources, 0x7f07001d));
    }
    public boolean a(){
       if (this.b()) {
          this.getListPopupWindow().dismiss();
          ViewTreeObserver viewTreeObse = this.getViewTreeObserver();
          if (viewTreeObse.isAlive()) {
             viewTreeObse.removeGlobalOnLayoutListener(this.m);
          }
       }
       return true;
    }
    public boolean b(){
       return this.getListPopupWindow().d();
    }
    public boolean c(){
       if (this.b() || this.r == null) {
          return false;
       }
       this.p = false;
       this.d(this.q);
       return true;
    }
    public void d(int p0){
       if (this.b.b() == null) {
          throw new IllegalStateException("No data model. Did you call #setDataModel?");
       }
       this.getViewTreeObserver().addOnGlobalLayoutListener(this.m);
       boolean b = true;
       int i = (!this.h.getVisibility())? 1: 0;
       int i1 = this.b.a();
       if (p0 != Integer.MAX_VALUE && i1 > (p0 + i)) {
          this.b.j(b);
          this.b.h((p0 - b));
       }else {
          this.b.j(0);
          this.b.h(p0);
       }
       ListPopupWindow listPopupWin = this.getListPopupWindow();
       if (!listPopupWin.d()) {
          if (this.p != null || !i) {
             this.b.i(b, i);
          }else {
             this.b.i(0, 0);
          }
          listPopupWin.B(Math.min(this.b.f(), this.j));
          listPopupWin.show();
          ActivityChooserView tk = this.k;
          if (tk != null) {
             tk.k(b);
          }
          listPopupWin.i().setContentDescription(this.getContext().getString(R.string.arg_RES_7f100013));
          listPopupWin.i().setSelector(new ColorDrawable(0));
       }
       return;
    }
    public void e(){
       int i = 0;
       boolean b = true;
       if (this.b.getCount() > 0) {
          this.f.setEnabled(b);
       }else {
          this.f.setEnabled(i);
       }
       int i1 = this.b.a();
       int i2 = this.b.d();
       if (i1 == b || (i1 > b && i2 > 0)) {
          this.h.setVisibility(i);
          ResolveInfo resolveInfo = this.b.c();
          PackageManager packageManag = this.getContext().getPackageManager();
          this.i.setImageDrawable(resolveInfo.loadIcon(packageManag));
          if (this.s != null) {
             Object[] objArray = new Object[b];
             objArray[i] = resolveInfo.loadLabel(packageManag);
             this.h.setContentDescription(this.getContext().getString(this.s, objArray));
          }
       }else {
          this.h.setVisibility(8);
       }
       if (!this.h.getVisibility()) {
          this.d.setBackgroundDrawable(this.e);
       }else {
          this.d.setBackgroundDrawable(null);
       }
       return;
    }
    public a getDataModel(){
       return this.b.b();
    }
    public ListPopupWindow getListPopupWindow(){
       if (this.n == null) {
          ListPopupWindow listPopupWin = new ListPopupWindow(this.getContext());
          this.n = listPopupWin;
          listPopupWin.q(this.b);
          this.n.z(this);
          this.n.F(true);
          this.n.H(this.c);
          this.n.G(this.c);
       }
       return this.n;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       a uoa = this.b.b();
       if (uoa != null) {
          uoa.registerObserver(this.l);
       }
       this.r = true;
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       a uoa = this.b.b();
       if (uoa != null) {
          uoa.unregisterObserver(this.l);
       }
       ViewTreeObserver viewTreeObse = this.getViewTreeObserver();
       if (viewTreeObse.isAlive()) {
          viewTreeObse.removeGlobalOnLayoutListener(this.m);
       }
       if (this.b()) {
          this.a();
       }
       this.r = false;
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       this.d.layout(0, 0, (p3 - p1), (p4 - p2));
       if (!this.b()) {
          this.a();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       ActivityChooserView td = this.d;
       if (this.h.getVisibility()) {
          p1 = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(p1), 0x40000000);
       }
       this.measureChild(td, p0, p1);
       this.setMeasuredDimension(td.getMeasuredWidth(), td.getMeasuredHeight());
       return;
    }
    public void setActivityChooserModel(a p0){
       this.b.g(p0);
       if (this.b()) {
          this.a();
          this.c();
       }
       return;
    }
    public void setDefaultActionButtonContentDescription(int p0){
       this.s = p0;
    }
    public void setExpandActivityOverflowButtonContentDescription(int p0){
       this.g.setContentDescription(this.getContext().getString(p0));
    }
    public void setExpandActivityOverflowButtonDrawable(Drawable p0){
       this.g.setImageDrawable(p0);
    }
    public void setInitialActivityCount(int p0){
       this.q = p0;
    }
    public void setOnDismissListener(PopupWindow$OnDismissListener p0){
       this.o = p0;
    }
    public void setProvider(b p0){
       this.k = p0;
    }
}
