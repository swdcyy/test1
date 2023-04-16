package androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.k$a;
import android.widget.AbsListView$SelectionBoundsAdjuster;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import w0.x;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;
import android.view.View;
import android.graphics.Rect;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import android.widget.CheckBox;
import android.widget.RadioButton;
import androidx.appcompat.view.menu.h;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;
import a2.i0;
import android.widget.CompoundButton;

public class ListMenuItemView extends LinearLayout implements k$a, AbsListView$SelectionBoundsAdjuster	// class@000599
{
    public h b;
    public ImageView c;
    public RadioButton d;
    public TextView e;
    public CheckBox f;
    public TextView g;
    public ImageView h;
    public ImageView i;
    public LinearLayout j;
    public Drawable k;
    public int l;
    public Context m;
    public boolean n;
    public Drawable o;
    public boolean p;
    public LayoutInflater q;
    public boolean r;

    public void ListMenuItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0405ae);
    }
    public void ListMenuItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1);
       x ox = x.v(this.getContext(), p1, c$b.m3, p2, 0);
       this.k = ox.g(5);
       this.l = ox.n(1, -1);
       this.n = ox.a(7, 0);
       this.m = p0;
       this.o = ox.g(8);
       int[] ointArray = new int[]{0x1010129};
       TypedArray typedArray = p0.getTheme().obtainStyledAttributes(null, ointArray, R.attr.arg_RES_7f040313, 0);
       this.p = typedArray.hasValue(0);
       ox.w();
       typedArray.recycle();
    }
    public final void a(View p0){
       this.b(p0, -1);
    }
    public void adjustListItemSelectionBounds(Rect p0){
       ListMenuItemView ti = this.i;
       if (ti != null && !ti.getVisibility()) {
          LinearLayout$LayoutParams layoutParams = this.i.getLayoutParams();
          p0.top = p0.top + ((this.i.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin);
       }
       return;
    }
    public final void b(View p0,int p1){
       ListMenuItemView tj = this.j;
       if (tj != null) {
          tj.addView(p0, p1);
       }else {
          this.addView(p0, p1);
       }
       return;
    }
    public final void c(){
       CheckBox uCheckBox = a.c(this.getInflater(), R.layout.arg_RES_7f0d000e, this, false);
       this.f = uCheckBox;
       this.a(uCheckBox);
    }
    public final void d(){
       ImageView imageView = a.c(this.getInflater(), R.layout.arg_RES_7f0d000f, this, false);
       this.c = imageView;
       this.b(imageView, false);
    }
    public boolean e(){
       return this.r;
    }
    public final void f(){
       RadioButton radioButton = a.c(this.getInflater(), R.layout.arg_RES_7f0d0011, this, false);
       this.d = radioButton;
       this.a(radioButton);
    }
    public final LayoutInflater getInflater(){
       if (this.q == null) {
          this.q = LayoutInflater.from(this.getContext());
       }
       return this.q;
    }
    public h getItemData(){
       return this.b;
    }
    public boolean i(){
       return false;
    }
    public void j(boolean p0,char p1){
       int i = (p0 && this.b.B())? 0: 8;
       if (!i) {
          this.g.setText(this.b.j());
       }
       if (this.g.getVisibility() != i) {
          this.g.setVisibility(i);
       }
       return;
    }
    public void k(h p0,int p1){
       this.b = p0;
       p1 = (p0.isVisible())? 0: 8;
       this.setVisibility(p1);
       this.setTitle(p0.k(this));
       this.setCheckable(p0.isCheckable());
       this.j(p0.B(), p0.i());
       this.setIcon(p0.getIcon());
       this.setEnabled(p0.isEnabled());
       this.setSubMenuArrowVisible(p0.hasSubMenu());
       this.setContentDescription(p0.getContentDescription());
       return;
    }
    public void onFinishInflate(){
       super.onFinishInflate();
       i0.v0(this, this.k);
       TextView textView = this.findViewById(R.id.title);
       this.e = textView;
       ListMenuItemView tl = this.l;
       if (tl != -1) {
          textView.setTextAppearance(this.m, tl);
       }
       this.g = this.findViewById(0x7f0a3950);
       ImageView imageView = this.findViewById(R.id.submenuarrow);
       this.h = imageView;
       if (imageView != null) {
          imageView.setImageDrawable(this.o);
       }
       this.i = this.findViewById(0x7f0a1121);
       this.j = this.findViewById(0x7f0a0945);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (this.c != null && this.n != null) {
          LinearLayout$LayoutParams layoutParams = this.c.getLayoutParams();
          ViewGroup$LayoutParams height = this.getLayoutParams().height;
          if (height > null && layoutParams.width <= null) {
             layoutParams.width = height;
          }
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void setCheckable(boolean p0){
       ListMenuItemView td;
       ListMenuItemView tf;
       if (!p0 && (this.d == null && this.f == null)) {
          return;
       }
       if (this.b.o()) {
          if (this.d == null) {
             this.f();
          }
          td = this.d;
          tf = this.f;
       }else if(this.f == null){
          this.c();
       }
       td = this.f;
       tf = this.d;
       if (p0) {
          td.setChecked(this.b.isChecked());
          if (td.getVisibility()) {
             td.setVisibility(0);
          }
          if (tf != null && tf.getVisibility() != 8) {
             tf.setVisibility(8);
          }
       }else {
          ListMenuItemView tf1 = this.f;
          if (tf1 != null) {
             tf1.setVisibility(8);
          }
          tf1 = this.d;
          if (tf1 != null) {
             tf1.setVisibility(8);
          }
       }
    label_005b :
       return;
    }
    public void setChecked(boolean p0){
       ListMenuItemView td;
       if (this.b.o()) {
          if (this.d == null) {
             this.f();
          }
          td = this.d;
       }else if(this.f == null){
          this.c();
       }
       td = this.f;
       td.setChecked(p0);
       return;
    }
    public void setForceShowIcon(boolean p0){
       this.r = p0;
       this.n = p0;
    }
    public void setGroupDividerEnabled(boolean p0){
       ListMenuItemView ti = this.i;
       if (ti != null) {
          int i = (this.p == null && p0)? 0: 8;
          ti.setVisibility(i);
       }
       return;
    }
    public void setIcon(Drawable p0){
       int i = (this.b.A() || this.r != null)? 1: 0;
       if (!i && this.n == null) {
          return;
       }else {
          ListMenuItemView tc = this.c;
          if (tc == null && (p0 == null && this.n == null)) {
             return;
          }else if(tc == null){
             this.d();
          }
          if (p0 != null || this.n != null) {
             tc = this.c;
             if (!i) {
                p0 = null;
             }
             tc.setImageDrawable(p0);
             if (this.c.getVisibility()) {
                this.c.setVisibility(0);
             }
          }else {
             this.c.setVisibility(8);
          }
          return;
       }
    }
    public final void setSubMenuArrowVisible(boolean p0){
       ListMenuItemView th = this.h;
       if (th != null) {
          int i = (p0)? 0: 8;
          th.setVisibility(i);
       }
       return;
    }
    public void setTitle(CharSequence p0){
       if (p0 != null) {
          this.e.setText(p0);
          if (this.e.getVisibility()) {
             this.e.setVisibility(0);
          }
       }else if(this.e.getVisibility() != 8){
          this.e.setVisibility(8);
       }
       return;
    }
}
