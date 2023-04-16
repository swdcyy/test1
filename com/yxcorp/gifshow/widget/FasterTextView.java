package com.yxcorp.gifshow.widget.FasterTextView;
import com.lsjwzh.widget.text.FastTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.lsjwzh.widget.text.FastTextLayoutView;
import android.view.View;
import n0.c;
import android.text.TextPaint;
import java.lang.Float;
import com.yxcorp.gifshow.widget.FasterTextView$b;
import android.text.TextUtils$TruncateAt;
import com.yxcorp.gifshow.widget.FasterTextView$a;
import java.lang.Boolean;
import android.content.res.Resources;
import java.lang.CharSequence;

public class FasterTextView extends FastTextView	// class@001846
{
    public FasterTextView$b o;
    public float p;

    public void FasterTextView(Context p0){
       super(p0);
    }
    public void FasterTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void FasterTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public int a(int p0,int p1){
       if (PatchProxy.isSupport(FasterTextView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FasterTextView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = super.a(p0, p1);
       if (this.getMinimumHeight() > 0 && p0 < this.getMinimumHeight()) {
          p0 = this.getMinimumHeight();
       }
       return p0;
    }
    public int b(int p0,int p1){
       if (PatchProxy.isSupport(FasterTextView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FasterTextView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       p0 = super.b(p0, p1);
       if (this.getMinimumWidth() > 0 && p0 < this.getMinimumWidth()) {
          p0 = this.getMinimumWidth();
       }
       return p0;
    }
    public void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FasterTextView.class, "2")) {
          return;
       }
       if (this.p - null) {
          this.getPaint().setLetterSpacing(this.p);
       }
       return;
    }
    public void m(int p0,float p1){
       if (PatchProxy.isSupport(FasterTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, FasterTextView.class, "9")) {
          return;
       }
       this.j(p1, p0);
       return;
    }
    public void n(int p0,int p1){
       if (PatchProxy.isSupport(FasterTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FasterTextView.class, "10")) {
          return;
       }
       this.j((float)p1, p0);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(FasterTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FasterTextView.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       FasterTextView to = this.o;
       if (to != null) {
          to.a(this.getMeasuredWidth(), this.getMeasuredHeight());
       }
       return;
    }
    public void setEllipsize(TextUtils$TruncateAt p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, FasterTextView.class, "7")) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, FasterTextView.class, "12");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = FasterTextView$a.a[p0.ordinal()];
          if (i != 1) {
             if (i != 2) {
                i = (i != 3)? -1: 3;
             }else {
                i = 2;
             }
          }else {
             i = 1;
          }
       }
       this.setEllipsize(i);
       return;
    }
    public void setLetterSpacing(float p0){
       this.p = p0;
    }
    public void setOnMeasureListener(FasterTextView$b p0){
       this.o = p0;
    }
    public void setSingleLine(boolean p0){
       if (PatchProxy.isSupport(FasterTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FasterTextView.class, "8")) {
          return;
       }
       if (p0) {
          this.setMaxLines(1);
       }
       return;
    }
    public void setText(int p0){
       if (PatchProxy.isSupport(FasterTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FasterTextView.class, "6")) {
          return;
       }
       super.setText(this.getResources().getText(p0));
       return;
    }
}
