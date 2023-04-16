package com.kuaishou.merchant.basic.widget.RoundConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import qt3.l;
import android.view.View;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.RectF;
import android.graphics.Paint;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import android.graphics.Region;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.widget.Checkable;
import java.lang.Integer;
import android.content.res.ColorStateList;
import java.util.Arrays;

public class RoundConstraintLayout extends ConstraintLayout	// class@0015fa
{
    public l B;

    public void RoundConstraintLayout(Context p0){
       super(p0, null);
    }
    public void RoundConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.B = new l(p0, p1, p2, this);
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundConstraintLayout.class, "2")) {
          return;
       }
       l a = this.B.a;
       int len = a.length;
       int i = 0;
       int i1 = 0;
       while (i1 < len) {
          if (a[i1]) {
             i = 1;
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       if (!i) {
          super.dispatchDraw(p0);
          return;
       }else {
          p0.saveLayer(this.B.f, null, 31);
          super.dispatchDraw(p0);
          this.B.a(p0);
          p0.restore();
          return;
       }
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "3";
       RoundConstraintLayout obj = PatchProxy.applyOneRefs(p0, this, RoundConstraintLayout.class, str);
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.B;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, l.class, str);
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          b = p0.getAction();
          if (!b && !obj.e.contains((int)p0.getX(), (int)p0.getY())) {
             b = false;
          }else if(!b || b == 1){
             obj.m.refreshDrawableState();
          }else if(b == 3){
             obj.m.setPressed(false);
             obj.m.refreshDrawableState();
          }
          b = true;
       }
       if (!b) {
          return false;
       }else {
          return super.dispatchTouchEvent(p0);
       }
    }
    public void drawableStateChanged(){
       Object[] objArray = null;
       String str = "4";
       if (PatchProxy.applyVoid(objArray, this, RoundConstraintLayout.class, str)) {
          return;
       }
       super.drawableStateChanged();
       RoundConstraintLayout tB = this.B;
       Objects.requireNonNull(tB);
       if (!PatchProxy.applyVoid(objArray, tB, l.class, str)) {
          ArrayList uArrayList = new ArrayList();
          if (tB instanceof Checkable) {
             uArrayList.add(Integer.valueOf(0x101009f));
             if (tB.isChecked()) {
                uArrayList.add(Integer.valueOf(0x10100a0));
             }
          }
          if (tB.m.isEnabled()) {
             uArrayList.add(Integer.valueOf(0x101009e));
          }
          if (tB.m.isFocused()) {
             uArrayList.add(Integer.valueOf(0x101009c));
          }
          if (tB.m.isPressed()) {
             uArrayList.add(Integer.valueOf(0x10100a7));
          }
          if (tB.m.isHovered()) {
             uArrayList.add(Integer.valueOf(0x1010367));
          }
          if (tB.m.isSelected()) {
             uArrayList.add(Integer.valueOf(0x10100a1));
          }
          if (tB.m.isActivated()) {
             uArrayList.add(Integer.valueOf(0x10102fe));
          }
          if (tB.m.hasWindowFocus()) {
             uArrayList.add(Integer.valueOf(0x101009d));
          }
          l j = tB.j;
          if (j != null && j.isStateful()) {
             int[] ointArray = new int[uArrayList.size()];
             for (int i = 0; i < uArrayList.size(); i = i + 1) {
                ointArray[i] = uArrayList.get(i).intValue();
             }
             tB.c(tB.j.getColorForState(ointArray, tB.i));
          }
       }
    label_00f3 :
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RoundConstraintLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RoundConstraintLayout.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.B.b(p0, p1, p2, p3);
       return;
    }
    public void setRadius(int p0){
       String str = "5";
       if (PatchProxy.isSupport(RoundConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundConstraintLayout.class, str)) {
          return;
       }
       RoundConstraintLayout tB = this.B;
       Objects.requireNonNull(tB);
       if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tB, l.class, str)) {
          Arrays.fill(tB.a, (float)p0);
          tB.m.invalidate();
       }
       return;
    }
    public void setStrokeColor(int p0){
       if (PatchProxy.isSupport(RoundConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundConstraintLayout.class, "8")) {
          return;
       }
       this.B.c(p0);
       return;
    }
    public void setStrokeWidth(int p0){
       if (PatchProxy.isSupport(RoundConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundConstraintLayout.class, "7")) {
          return;
       }
       RoundConstraintLayout tB = this.B;
       Objects.requireNonNull(tB);
       l ol = l.class;
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), tB, ol, "6")) {
          tB.k = p0;
          tB.m.invalidate();
       }
       return;
    }
}
