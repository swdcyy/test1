package com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import java.lang.Object;
import com.kwai.library.widget.popup.common.PopupInterface$Excluded;
import com.kwai.library.widget.popup.common.config.PopupOrientation;
import com.kwai.library.widget.popup.common.f;
import android.view.ViewGroup;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.lang.String;
import com.kwai.library.widget.popup.common.c;
import o07.l;
import java.lang.StringBuilder;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class c$b	// class@00098f
{
    public PopupInterface$e A;
    public View$OnClickListener B;
    public PopupOrientation C;
    public int D;
    public int E;
    public int F;
    public final Activity a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public ViewGroup f;
    public long g;
    public int h;
    public int i;
    public int j;
    public int k;
    public Drawable l;
    public Bundle m;
    public Object n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public String t;
    public PopupInterface$Excluded u;
    public PopupInterface$f v;
    public PopupInterface$h w;
    public PopupInterface$d x;
    public PopupInterface$c y;
    public PopupInterface$c z;

    public void c$b(Activity p0){
       super();
       this.b = true;
       this.c = true;
       this.g = -1;
       this.h = Integer.MAX_VALUE;
       this.i = Integer.MAX_VALUE;
       this.p = true;
       this.t = "popup_type_popup";
       this.u = PopupInterface$Excluded.NOT_AGAINST;
       this.C = PopupOrientation.ORIENTATION_UNDEFINED;
       this.D = 0;
       this.E = 0;
       this.F = -1;
       this.a = p0;
       this.j = f.k(p0);
       if (!f.A()) {
          this.k = f.h(p0);
       }
       return;
    }
    public c$b A(boolean p0){
       this.c = p0;
       return this;
    }
    public c$b B(boolean p0){
       int i = (p0)? 1: -1;
       this.D = i;
       return this;
    }
    public c$b C(ViewGroup p0){
       this.f = p0;
       return this;
    }
    public c$b D(PopupInterface$Excluded p0){
       this.u = p0;
       return this;
    }
    public c$b E(boolean p0){
       this.p = p0;
       return this;
    }
    public c$b F(PopupInterface$c p0){
       this.y = p0;
       return this;
    }
    public c$b G(PopupInterface$b p0){
       this.F(this.l(p0));
       return this;
    }
    public c$b H(int p0){
       this.h = p0;
       return this;
    }
    public c$b I(int p0){
       this.i = p0;
       return this;
    }
    public c$b J(PopupInterface$d p0){
       this.x = p0;
       return this;
    }
    public c$b K(View$OnClickListener p0){
       this.B = p0;
       return this;
    }
    public c$b L(PopupInterface$f p0){
       this.v = p0;
       return this;
    }
    public c$b M(PopupInterface$h p0){
       this.w = p0;
       return this;
    }
    public c$b N(PopupInterface$c p0){
       this.z = p0;
       return this;
    }
    public c$b O(PopupInterface$b p0){
       this.N(this.l(p0));
       return this;
    }
    public c$b P(boolean p0){
       this.d = p0;
       return this;
    }
    public c$b Q(int p0){
       this.F = p0;
       return this;
    }
    public c$b R(String p0){
       this.t = p0;
       return this;
    }
    public c$b S(){
       this.o = true;
       return this;
    }
    public c$b T(long p0){
       this.g = p0;
       return this;
    }
    public c$b U(PopupOrientation p0){
       this.C = p0;
       return this;
    }
    public c$b V(Object p0){
       this.n = p0;
       return this;
    }
    public c$b W(int p0){
       this.j = p0;
       return this;
    }
    public c X(){
       c uoc = this.k();
       uoc.Z();
       return uoc;
    }
    public final c Y(PopupInterface$h p0){
       this.w = p0;
       c uoc = this.k();
       uoc.Z();
       return uoc;
    }
    public final c Z(PopupInterface$h p0){
       this.q = true;
       return this.Y(p0);
    }
    public c k(){
       return new c(this);
    }
    public final PopupInterface$c l(PopupInterface$b p0){
       if (p0 == null) {
          return null;
       }
       return new l(p0);
    }
    public c$b m(){
       this.r = true;
       return this;
    }
    public c$b n(){
       this.s = true;
       return this;
    }
    public c$b o(){
       this.E = 2;
       return this;
    }
    public c$b p(){
       this.E = 1;
       return this;
    }
    public Activity q(){
       return this.a;
    }
    public int r(){
       return this.E;
    }
    public PopupInterface$f s(){
       return this.v;
    }
    public PopupInterface$h t(){
       return this.w;
    }
    public String toString(){
       return "Builder{mActivity="+this.a+", mCancelable="+this.b+", mCanceledOnTouchOutside="+this.c+", mPenetrateOutsideTouchEvent="+this.d+", mIsAddToWindow="+this.e+", mContainerView="+this.f+", mShowDuration="+this.g+", mMaxHeight="+this.h+", mMaxWidth="+this.i+", mTopPadding="+this.j+", mBottomPadding="+this.k+", mBackground="+this.l+", mBundle="+this.m+", mTag="+this.n+", mIsQueueFirst="+this.o+", mPopupType=\'"+this.t+'''+", mExcluded="+this.u+", mOnViewStateCallback="+this.v+", mOnVisibilityListener="+this.w+", mOnCancelListener="+this.x+", mInAnimatorCallback="+this.y+", mOutAnimatorCallback="+this.z+", mOnCheckStateCallback="+this.A+", mClickListener="+this.B+", mCheckConflict="+this.D+", mDayNightMode="+this.E+", mPopupAnimViewId="+this.F+'}';
    }
    public boolean u(){
       return this.p;
    }
    public c$b v(boolean p0){
       this.e = p0;
       return this;
    }
    public c$b w(Drawable p0){
       this.l = p0;
       return this;
    }
    public c$b x(int p0){
       this.k = p0;
       return this;
    }
    public c$b y(Bundle p0){
       this.m = p0;
       return this;
    }
    public c$b z(boolean p0){
       this.b = p0;
       return this;
    }
}
