package com.google.android.material.internal.NavigationMenuItemView;
import androidx.appcompat.view.menu.k$a;
import com.google.android.material.internal.ForegroundLinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.internal.NavigationMenuItemView$a;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.content.res.Resources;
import cw9.c;
import android.widget.CheckedTextView;
import a2.a;
import a2.i0;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import androidx.appcompat.view.menu.h;
import w0.y;
import android.view.ViewStub;
import android.graphics.drawable.Drawable$ConstantState;
import androidx.core.graphics.drawable.a;
import android.content.res.ColorStateList;
import o1.f;
import android.widget.TextView;
import androidx.core.widget.b;

public class NavigationMenuItemView extends ForegroundLinearLayout implements k$a	// class@00169e
{
    public FrameLayout A;
    public h B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final a F;
    public final int w;
    public boolean x;
    public boolean y;
    public final CheckedTextView z;
    public static final int[] G;

    static {
       int[] ointArray = new int[]{0x10100a0};
       NavigationMenuItemView.G = ointArray;
    }
    public void NavigationMenuItemView(Context p0){
       super(p0, null);
    }
    public void NavigationMenuItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void NavigationMenuItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       NavigationMenuItemView$a uoa = new NavigationMenuItemView$a(this);
       this.F = uoa;
       this.setOrientation(0);
       a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0263, this, true);
       this.w = c.b(p0.getResources(), 0x7f0701b3);
       CheckedTextView uCheckedText = this.findViewById(R.id.design_menu_item_text);
       this.z = uCheckedText;
       uCheckedText.setDuplicateParentStateEnabled(true);
       i0.s0(uCheckedText, uoa);
    }
    public final void B(){
       NavigationMenuItemView tA;
       LinearLayoutCompat$LayoutParams layoutParams;
       if (this.E()) {
          this.z.setVisibility(8);
          tA = this.A;
          if (tA != null) {
             layoutParams = tA.getLayoutParams();
             layoutParams.width = -1;
             this.A.setLayoutParams(layoutParams);
          }
       }else {
          this.z.setVisibility(0);
          tA = this.A;
          if (tA != null) {
             layoutParams = tA.getLayoutParams();
             layoutParams.width = -2;
             this.A.setLayoutParams(layoutParams);
          }
       }
       return;
    }
    public final StateListDrawable C(){
       TypedValue typedValue = new TypedValue();
       if (!this.getContext().getTheme().resolveAttribute(0x7f040217, typedValue, true)) {
          return null;
       }
       StateListDrawable stateListDra = new StateListDrawable();
       stateListDra.addState(NavigationMenuItemView.G, new ColorDrawable(typedValue.data));
       stateListDra.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
       return stateListDra;
    }
    public void D(){
       NavigationMenuItemView tA = this.A;
       if (tA != null) {
          tA.removeAllViews();
       }
       this.z.setCompoundDrawables(null, null, null, null);
       return;
    }
    public final boolean E(){
       boolean b = (this.B.getTitle() == null && (this.B.getIcon() == null && this.B.getActionView() != null))? true: false;
       return b;
    }
    public boolean e(){
       return true;
    }
    public h getItemData(){
       return this.B;
    }
    public boolean i(){
       return false;
    }
    public void j(boolean p0,char p1){
    }
    public void k(h p0,int p1){
       this.B = p0;
       p1 = (p0.isVisible())? 0: 8;
       this.setVisibility(p1);
       if (this.getBackground() == null) {
          i0.v0(this, this.C());
       }
       this.setCheckable(p0.isCheckable());
       this.setChecked(p0.isChecked());
       this.setEnabled(p0.isEnabled());
       this.setTitle(p0.getTitle());
       this.setIcon(p0.getIcon());
       this.setActionView(p0.getActionView());
       this.setContentDescription(p0.getContentDescription());
       y.a(this, p0.getTooltipText());
       this.B();
       return;
    }
    public int[] onCreateDrawableState(int p0){
       p0++;
       int[] ointArray = super.onCreateDrawableState(p0);
       NavigationMenuItemView tB = this.B;
       if (tB != null && (tB.isCheckable() && this.B.isChecked())) {
          ViewGroup.mergeDrawableStates(ointArray, NavigationMenuItemView.G);
       }
    label_001d :
       return ointArray;
    }
    public final void setActionView(View p0){
       if (p0 != null) {
          if (this.A == null) {
             this.A = this.findViewById(0x7f0a0a9f).inflate();
          }
          this.A.removeAllViews();
          this.A.addView(p0);
       }
       return;
    }
    public void setCheckable(boolean p0){
       this.refreshDrawableState();
       if (this.y != p0) {
          this.y = p0;
          this.F.j(this.z, 2048);
       }
       return;
    }
    public void setChecked(boolean p0){
       this.refreshDrawableState();
       this.z.setChecked(p0);
    }
    public void setHorizontalPadding(int p0){
       this.setPadding(p0, 0, p0, 0);
    }
    public void setIcon(Drawable p0){
       int i = 0;
       if (p0 != null) {
          if (this.D != null) {
             Drawable$ConstantState constantStat = p0.getConstantState();
             if (constantStat != null) {
                p0 = constantStat.newDrawable();
             }
             p0 = a.r(p0).mutate();
             a.o(p0, this.C);
          }
          p0.setBounds(i, i, this.w, this.w);
       }else if(this.x != null){
          if (this.E == null) {
             p0 = f.c(this.getResources(), R.drawable.arg_RES_7f0819ff, this.getContext().getTheme());
             this.E = p0;
             if (p0 != null) {
                p0.setBounds(i, i, this.w, this.w);
             }
          }
          NavigationMenuItemView tE = this.E;
       }
       b.l(this.z, p0, null, null, null);
       return;
    }
    public void setIconPadding(int p0){
       this.z.setCompoundDrawablePadding(p0);
    }
    public void setIconTintList(ColorStateList p0){
       this.C = p0;
       boolean b = (p0 != null)? true: false;
       this.D = b;
       NavigationMenuItemView tB = this.B;
       if (tB != null) {
          this.setIcon(tB.getIcon());
       }
       return;
    }
    public void setNeedsEmptyIcon(boolean p0){
       this.x = p0;
    }
    public void setTextAppearance(int p0){
       b.r(this.z, p0);
    }
    public void setTextColor(ColorStateList p0){
       this.z.setTextColor(p0);
    }
    public void setTitle(CharSequence p0){
       this.z.setText(p0);
    }
}
