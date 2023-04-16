package androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.k$a;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.ActionMenuView$a;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import ll8.c$b;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import cw9.c;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.h;
import java.lang.CharSequence;
import androidx.appcompat.view.menu.ActionMenuItemView$a;
import android.view.View;
import androidx.appcompat.view.menu.e$b;
import android.content.res.Configuration;
import android.view.View$MeasureSpec;
import java.lang.Math;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import w0.m;
import android.text.TextUtils;
import w0.y;
import androidx.appcompat.view.menu.ActionMenuItemView$b;

public class ActionMenuItemView extends AppCompatTextView implements k$a, View$OnClickListener, ActionMenuView$a	// class@000597
{
    public h f;
    public CharSequence g;
    public Drawable h;
    public e$b i;
    public m j;
    public ActionMenuItemView$b k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;

    public void ActionMenuItemView(Context p0){
       super(p0, null);
    }
    public void ActionMenuItemView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ActionMenuItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.l = this.q();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.e, p2, 0);
       this.n = typedArray.getDimensionPixelSize(0, 0);
       typedArray.recycle();
       this.p = (int)((c.c(p0.getResources()).density * 32.00f) + 0x3f000000);
       this.setOnClickListener(this);
       this.o = -1;
       this.setSaveEnabled(0);
    }
    public boolean b(){
       boolean b = (this.p() && this.f.getIcon() == null)? true: false;
       return b;
    }
    public boolean e(){
       return true;
    }
    public boolean g(){
       return this.p();
    }
    public h getItemData(){
       return this.f;
    }
    public boolean i(){
       return true;
    }
    public void j(boolean p0,char p1){
    }
    public void k(h p0,int p1){
       this.f = p0;
       this.setIcon(p0.getIcon());
       this.setTitle(p0.k(this));
       this.setId(p0.getItemId());
       p1 = (p0.isVisible())? 0: 8;
       this.setVisibility(p1);
       this.setEnabled(p0.isEnabled());
       if (p0.hasSubMenu() && this.j == null) {
          this.j = new ActionMenuItemView$a(this);
       }
       return;
    }
    public void onClick(View p0){
       ActionMenuItemView ti = this.i;
       if (ti != null) {
          ti.g(this.f);
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       super.onConfigurationChanged(p0);
       this.l = this.q();
       this.r();
    }
    public void onMeasure(int p0,int p1){
       ActionMenuItemView tn;
       boolean b = this.p();
       if (b) {
          ActionMenuItemView to = this.o;
          if (to >= null) {
             super.setPadding(to, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
          }
       }
       super.onMeasure(p0, p1);
       int mode = View$MeasureSpec.getMode(p0);
       p0 = View$MeasureSpec.getSize(p0);
       int measuredWidt = this.getMeasuredWidth();
       p0 = (mode == Integer.MIN_VALUE)? Math.min(p0, this.n): this.n;
       if (mode != 0x40000000 && (this.n > null && measuredWidt < p0)) {
          super.onMeasure(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), p1);
       }
    label_0046 :
       if (!b && this.h != null) {
          super.setPadding(((this.getMeasuredWidth() - this.h.getBounds().width()) / 2), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
       }
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       super.onRestoreInstanceState(null);
    }
    public boolean onTouchEvent(MotionEvent p0){
       if (this.f.hasSubMenu()) {
          ActionMenuItemView tj = this.j;
          if (tj != null && tj.onTouch(this, p0)) {
             return true;
          }
       }
       return super.onTouchEvent(p0);
    }
    public boolean p(){
       return (TextUtils.isEmpty(this.getText()) ^ 0x01);
    }
    public final boolean q(){
       Configuration configuratio = this.getContext().getResources().getConfiguration();
       Configuration screenWidthD = configuratio.screenWidthDp;
       Configuration screenHeight = configuratio.screenHeightDp;
       boolean b = (screenWidthD >= 480 || (screenWidthD < 640 || (screenHeight >= 480 || configuratio.orientation == 2)))? true: false;
       return b;
    }
    public final void r(){
       int i = 1;
       int i1 = TextUtils.isEmpty(this.g) ^ i;
       if (this.h != null && (!this.f.C() || (this.l == null && this.m == null))) {
          i = 0;
       }
    label_001e :
       i1 = i1 & i;
       CharSequence uCharSequenc = null;
       ActionMenuItemView tg = (i1)? this.g: uCharSequenc;
       this.setText(tg);
       CharSequence contentDescr = this.f.getContentDescription();
       if (TextUtils.isEmpty(contentDescr)) {
          contentDescr = (i1)? uCharSequenc: this.f.getTitle();
          this.setContentDescription(contentDescr);
       }else {
          this.setContentDescription(contentDescr);
       }
       contentDescr = this.f.getTooltipText();
       if (TextUtils.isEmpty(contentDescr)) {
          if (!i1) {
             uCharSequenc = this.f.getTitle();
          }
          y.a(this, uCharSequenc);
       }else {
          y.a(this, contentDescr);
       }
       return;
    }
    public void setCheckable(boolean p0){
    }
    public void setChecked(boolean p0){
    }
    public void setExpandedFormat(boolean p0){
       if (this.m != p0) {
          this.m = p0;
          ActionMenuItemView tf = this.f;
          if (tf != null) {
             tf.e();
          }
       }
       return;
    }
    public void setIcon(Drawable p0){
       this.h = p0;
       if (p0 != null) {
          int intrinsicWid = p0.getIntrinsicWidth();
          int intrinsicHei = p0.getIntrinsicHeight();
          ActionMenuItemView tp = this.p;
          if (intrinsicWid > tp) {
             intrinsicHei = (int)((float)intrinsicHei * ((float)tp / (float)intrinsicWid));
             intrinsicWid = tp;
          }
          if (intrinsicHei > tp) {
             intrinsicWid = (int)((float)intrinsicWid * ((float)tp / (float)intrinsicHei));
          }else {
             tp = intrinsicHei;
          }
          p0.setBounds(0, 0, intrinsicWid, tp);
       }
       this.setCompoundDrawables(p0, null, null, null);
       this.r();
       return;
    }
    public void setItemInvoker(e$b p0){
       this.i = p0;
    }
    public void setPadding(int p0,int p1,int p2,int p3){
       this.o = p0;
       super.setPadding(p0, p1, p2, p3);
    }
    public void setPopupCallback(ActionMenuItemView$b p0){
       this.k = p0;
    }
    public void setTitle(CharSequence p0){
       this.g = p0;
       this.r();
    }
}
