package com.kwai.library.widget.viewpager.tabstrip.SearchPagerSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.content.Context;
import java.util.HashSet;
import lnc.a1;
import android.util.AttributeSet;
import com.kwai.library.widget.textview.IconifyRadioButtonNew;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import nfd.t0;
import android.view.View;
import com.kwai.library.widget.textview.IconifyTextViewNew;
import java.lang.Number;
import ra6.a;
import com.yxcorp.plugin.search.utils.j0;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kwai.library.widget.viewpager.tabstrip.SearchPagerSlidingTabStrip$a;
import java.util.Set;
import android.widget.LinearLayout;
import android.text.TextPaint;
import java.lang.CharSequence;
import android.widget.HorizontalScrollView;
import java.util.Iterator;
import android.graphics.Typeface;
import android.view.MotionEvent;
import java.lang.Boolean;
import android.app.Activity;
import e3a.a;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import i27.a;
import android.view.View$OnLayoutChangeListener;

public class SearchPagerSlidingTabStrip extends PagerSlidingTabStrip	// class@000a93
{
    public int A1;
    public boolean B1;
    public Set w1;
    public ColorStateList x1;
    public ColorStateList y1;
    public int z1;
    public static int C1;

    public void SearchPagerSlidingTabStrip(Context p0){
       super(p0);
       this.w1 = new HashSet();
       this.z1 = a1.d(0x7f070f73);
       this.A1 = a1.d(0x7f070f72);
       this.B1 = false;
    }
    public void SearchPagerSlidingTabStrip(Context p0,AttributeSet p1){
       super(p0, p1);
       this.w1 = new HashSet();
       this.z1 = a1.d(0x7f070f73);
       this.A1 = a1.d(0x7f070f72);
       this.B1 = false;
    }
    public void SearchPagerSlidingTabStrip(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.w1 = new HashSet();
       this.z1 = a1.d(0x7f070f73);
       this.A1 = a1.d(0x7f070f72);
       this.B1 = false;
    }
    public static IconifyRadioButtonNew G(Context p0,float p1,int p2){
       IconifyRadioButtonNew obj;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(SearchPagerSlidingTabStrip.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), null, SearchPagerSlidingTabStrip.class, "16");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new IconifyRadioButtonNew(p0);
       int a0 = t0.a0;
       obj.setMinimumWidth(a0);
       obj.setTriangleRadius((float)t0.b);
       obj.setTriangleAlpha(0x3f800000);
       if (PatchProxy.isSupport(SearchPagerSlidingTabStrip.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), null, SearchPagerSlidingTabStrip.class, "17");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
          label_0059 :
             boolean b = a.e();
             if (b && p2 >= 5) {
                i = -2;
             }else {
                int c1 = SearchPagerSlidingTabStrip.C1;
                if (c1) {
                   i = c1;
                }else {
                   i = j0.p(p0);
                   if ((t0.Y * p2) < i && !b) {
                      SearchPagerSlidingTabStrip.C1 = (int)(((float)i * 0x3f800000) / (float)p2);
                   }else if(i > t0.A0){
                      SearchPagerSlidingTabStrip.C1 = a0;
                   }else {
                      SearchPagerSlidingTabStrip.C1 = (int)(((float)i * 0x3f800000) / p1);
                   }
                   i = SearchPagerSlidingTabStrip.C1;
                }
             }
          }
       }else {
          goto label_0059 ;
       }
       obj.setLayoutParams(new LinearLayout$LayoutParams(i, -1));
       return obj;
    }
    public void E(SearchPagerSlidingTabStrip$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchPagerSlidingTabStrip.class, "11")) {
          return;
       }
       if (p0 != null) {
          this.w1.add(p0);
       }
       return;
    }
    public final void F(){
       if (PatchProxy.applyVoid(null, this, SearchPagerSlidingTabStrip.class, "18")) {
          return;
       }
       IconifyRadioButtonNew childAt = this.g.getChildAt(0);
       if (childAt == null) {
          return;
       }
       float f = childAt.getTextPaint().measureText(childAt.getText().toString());
       int minimumWidth = childAt.getMinimumWidth();
       int c1 = SearchPagerSlidingTabStrip.C1;
       if (c1) {
          minimumWidth = c1;
       }
       minimumWidth = (int)((float)t0.t - (((float)minimumWidth - f) / 2.00f));
       if (minimumWidth > 0) {
          this.setPadding(minimumWidth, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
       }
       return;
    }
    public void H(int p0){
       if (PatchProxy.isSupport(SearchPagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchPagerSlidingTabStrip.class, "9")) {
          return;
       }
       SearchPagerSlidingTabStrip tw1 = this.w1;
       if (tw1 == null) {
          return;
       }
       Iterator iterator = tw1.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void I(SearchPagerSlidingTabStrip$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchPagerSlidingTabStrip.class, "12")) {
          return;
       }
       this.w1.remove(p0);
       return;
    }
    public final void J(){
       if (PatchProxy.applyVoid(null, this, SearchPagerSlidingTabStrip.class, "15")) {
          return;
       }
       int i = 0;
       while (i < this.g.getChildCount()) {
          View childAt = this.g.getChildAt(i);
          if (childAt instanceof IconifyRadioButtonNew) {
             Typeface dEFAULT_BOLD = (childAt.isSelected())? Typeface.DEFAULT_BOLD: Typeface.defaultFromStyle(0);
             childAt.setTypeface(dEFAULT_BOLD);
             SearchPagerSlidingTabStrip tz1 = (childAt.isSelected())? this.z1: this.A1;
             childAt.setTextSize((float)tz1);
          }
          i = i + 1;
       }
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Activity obj = PatchProxy.applyOneRefs(p0, this, SearchPagerSlidingTabStrip.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0.getAction() && this.B1 != null) {
          obj = a.b(this.getContext());
          if (obj != null) {
             n.C(obj);
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SearchPagerSlidingTabStrip.class, "13")) {
          return;
       }
       super.onDetachedFromWindow();
       this.w1.clear();
       return;
    }
    public void q(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SearchPagerSlidingTabStrip.class, "3")) {
          return;
       }
       int i = 0;
       SearchPagerSlidingTabStrip.C1 = i;
       super.q();
       this.H(i);
       if (!PatchProxy.applyVoid(objArray, this, SearchPagerSlidingTabStrip.class, "8")) {
          View childAt = this.getChildAt(i);
          if (childAt != null) {
             childAt.addOnLayoutChangeListener(new a(this, childAt));
          }
       }
       this.F();
       return;
    }
    public void setEnableHideSoft(boolean p0){
       this.B1 = p0;
    }
    public void t(int p0,int p1){
       if (PatchProxy.isSupport(SearchPagerSlidingTabStrip.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchPagerSlidingTabStrip.class, "4")) {
          return;
       }
       if (this.g.getChildAt(p0) == null) {
          return;
       }
       super.t(p0, p1);
       return;
    }
    public void u(int p0){
       if (PatchProxy.isSupport(SearchPagerSlidingTabStrip.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchPagerSlidingTabStrip.class, "14")) {
          return;
       }
       super.u(p0);
       this.J();
       return;
    }
}
