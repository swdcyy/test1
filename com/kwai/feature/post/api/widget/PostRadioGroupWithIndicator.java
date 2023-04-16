package com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import android.widget.RadioGroup$OnCheckedChangeListener;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import android.content.Context;
import android.util.AttributeSet;
import java.util.LinkedHashMap;
import com.google.common.collect.Maps;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import com.yxcorp.utility.Log;
import android.widget.RadioGroup;
import android.view.View;
import android.widget.RadioButton;
import java.util.Map;
import java.lang.Integer;
import java.lang.Float;
import android.graphics.Rect;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import android.graphics.Typeface;
import t46.o;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator$a;
import android.view.View$OnLayoutChangeListener;
import java.lang.IllegalStateException;
import u26.a;
import java.lang.System;

public class PostRadioGroupWithIndicator extends PostGroupWithIndicator implements RadioGroup$OnCheckedChangeListener	// class@001474
{
    public RadioGroup m;
    public RadioGroup$OnCheckedChangeListener n;
    public a o;
    public View p;
    public View q;
    public long r;
    public Map s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public static final int x;

    public void PostRadioGroupWithIndicator(Context p0){
       super(p0, null);
    }
    public void PostRadioGroupWithIndicator(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void PostRadioGroupWithIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.p = null;
       this.q = null;
       this.r = 0;
       this.s = Maps.u();
       this.t = 0;
       this.u = 1;
       this.v = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.e4, p2, 0);
       this.u = typedArray.getInt(0, this.u);
       this.v = typedArray.getInt(1, this.v);
       typedArray.recycle();
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostRadioGroupWithIndicator.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isEnabled()) {
          return false;
       }
       return super.dispatchTouchEvent(p0);
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, PostRadioGroupWithIndicator.class, "12")) {
          return;
       }
       Log.b("PostRadioGroupWithIndicator", "disableButtons\(\) called");
       for (int i = 0; i < this.m.getChildCount(); i = i + 1) {
          this.m.getChildAt(i).setClickable(false);
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, PostRadioGroupWithIndicator.class, "11")) {
          return;
       }
       Log.b("PostRadioGroupWithIndicator", "enableButtons\(\) called");
       for (int i = 0; i < this.m.getChildCount(); i = i + 1) {
          this.m.getChildAt(i).setClickable(true);
       }
       return;
    }
    public View getParentView(){
       return this.m;
    }
    public Map getRadioBtns(){
       return this.s;
    }
    public void l(int p0){
       if (PatchProxy.isSupport(PostRadioGroupWithIndicator.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PostRadioGroupWithIndicator.class, "7")) {
          return;
       }
       this.m.check(p0);
       return;
    }
    public final View m(float p0,float p1){
       View obj;
       if (PatchProxy.isSupport(PostRadioGroupWithIndicator.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, PostRadioGroupWithIndicator.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       int i = 0;
       while (i < this.m.getChildCount()) {
          View childAt = this.m.getChildAt(i);
          Rect rect = new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
          int i1 = this.m.getLeft() + rect.left;
          int i2 = this.m.getTop() + rect.top;
          int i3 = this.m.getLeft() + rect.right;
          int i4 = this.m.getTop() + rect.bottom;
          Rect rect1 = new Rect(i1, i2, i3, i4);
          StringBuilder str = "findViewByXY rect = "+rect1+" childRect = "+rect;
          Object[] objArray = new Object[0];
          p3.D().w("PostRadioGroupWithIndicator", str+" mRadioGroup.getLeft = "+this.m.getLeft()+" mRadioGroup.getTop\(\) = "+this.m.getTop(), objArray);
          if (!rect1.contains((int)p0, (int)p1)) {
             i = i + 1;
          }else {
             obj = childAt;
             break ;
          }
       }
       return obj;
    }
    public final Typeface n(int p0){
       if (!p0) {
          return Typeface.DEFAULT;
       }
       if (p0 != 1) {
          return Typeface.DEFAULT;
       }
       return Typeface.DEFAULT_BOLD;
    }
    public void o(int p0,boolean p1){
       if (PatchProxy.isSupport(PostRadioGroupWithIndicator.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, PostRadioGroupWithIndicator.class, "3")) {
          return;
       }
       Log.b("PostRadioGroupWithIndicator", "scrollIndicatorTo\(\) called with: resId = ["+p0+"], isUseAnim = ["+p1+"]");
       this.p(this.m.findViewById(p0), p1);
       return;
    }
    public void onCheckedChanged(RadioGroup p0,int p1){
       if (PatchProxy.isSupport(PostRadioGroupWithIndicator.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PostRadioGroupWithIndicator.class, "6")) {
          return;
       }
       RadioButton radioButton = this.s.get(Integer.valueOf(p1));
       boolean b = true;
       this.p(radioButton, b);
       if (radioButton == null || !radioButton.isChecked()) {
          b = false;
       }
       if (b) {
          PostRadioGroupWithIndicator tn = this.n;
          if (tn != null) {
             tn.onCheckedChanged(p0, p1);
          }
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, PostRadioGroupWithIndicator.class, "1")) {
          return;
       }
       super.onFinishInflate();
       Log.b("PostRadioGroupWithIndicator", "onFinishInflate\(\) called");
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < this.getChildCount()) {
             View childAt = this.getChildAt(i1);
             if (childAt instanceof RadioGroup) {
                this.m = childAt;
                for (; i < this.m.getChildCount(); i = i + 1) {
                   RadioButton childAt1 = this.m.getChildAt(i);
                   this.q(childAt1, childAt1.isChecked());
                   childAt1.setOnCheckedChangeListener(new o(this, childAt1));
                   this.s.put(Integer.valueOf(childAt1.getId()), childAt1);
                }
                PostRadioGroupWithIndicator tm = this.m;
                if (tm != null) {
                   tm.addOnLayoutChangeListener(new PostRadioGroupWithIndicator$a(this));
                   this.m.setOnCheckedChangeListener(this);
                   return;
                }else {
                }
             }else {
                i1 = i1 + 1;
             }
          }else {
             goto label_005c ;
          }
       }
       throw new IllegalStateException("PostRadioGroupWithIndicator must has a RadioGroup child!");
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b;
       PostRadioGroupWithIndicator obj = PatchProxy.applyOneRefs(p0, this, PostRadioGroupWithIndicator.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.o == null) {
          b = super.onInterceptTouchEvent(p0);
          this.w = b;
          return b;
       }else if(!p0.getAction()){
          this.p = this.m(p0.getX(), p0.getY());
          Object[] objArray = new Object[0];
          p3.D().w("PostRadioGroupWithIndicator", "onInterceptTouchEvent ACTION_DOWN mActionDownView = "+this.p, objArray);
          obj = this.p;
          if (obj != null && (obj instanceof RadioButton && this.o.b())) {
             this.w = true;
             return true;
          }
       }
       b = super.onInterceptTouchEvent(p0);
       this.w = b;
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       PostRadioGroupWithIndicator obj = PatchProxy.applyOneRefs(p0, this, PostRadioGroupWithIndicator.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.o == null) {
          return super.onTouchEvent(p0);
       }
       int action = p0.getAction();
       if (action) {
          boolean b = true;
          if (action != b) {
             if (action != 2) {
                return super.onTouchEvent(p0);
             }else {
                return super.onTouchEvent(p0);
             }
          }else {
             long l = System.currentTimeMillis() - this.r;
             this.q = this.m(p0.getX(), p0.getY());
             Object[] objArray = new Object[0];
             p3.D().w("PostRadioGroupWithIndicator", "onTouchEvent ACTION_UP mActionDownView = "+this.p+" mActionUpView = "+this.q+" timeGap = "+l, objArray);
             obj = this.p;
             if (obj == null || (obj != this.q || l - 200 > 0)) {
                return super.onTouchEvent(p0);
             }
             PostRadioGroupWithIndicator to = this.o;
             if (to != null && obj instanceof RadioButton) {
                to.a(this.m.getCheckedRadioButtonId(), this.p.getId());
             }
             return b;
          }
       }else {
          this.r = System.currentTimeMillis();
          return this.w;
       }
    }
    public final void p(RadioButton p0,boolean p1){
       if (PatchProxy.isSupport(PostRadioGroupWithIndicator.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, PostRadioGroupWithIndicator.class, "4")) {
          return;
       }
       Log.b("PostRadioGroupWithIndicator", "scrollIndicatorTo\(\) called with: button = ["+p0+"], isUseAnim = ["+p1+"]");
       if (this.j(p0, p1)) {
          this.t = p0.getId();
       }
       return;
    }
    public final void q(RadioButton p0,boolean p1){
       if (PatchProxy.isSupport(PostRadioGroupWithIndicator.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, PostRadioGroupWithIndicator.class, "5")) {
          return;
       }
       PostRadioGroupWithIndicator tu = (p1)? this.u: this.v;
       p0.setTypeface(this.n(tu));
       return;
    }
    public void setPostRadioGroupCheckChangedListener(RadioGroup$OnCheckedChangeListener p0){
       this.n = p0;
    }
    public void setTouchActionListener(a p0){
       this.o = p0;
    }
}
