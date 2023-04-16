package com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import com.yxcorp.gifshow.album.widget.ExtraSpaceFrameLayout$a;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tyc.g5;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.CharSequence;
import java.lang.Float;
import android.widget.TextView$BufferType;

public class SizeAdjustableTextView extends TextView implements ExtraSpaceFrameLayout$a	// class@001b10
{
    public g5 b;
    public int c;

    public void SizeAdjustableTextView(Context p0){
       super(p0);
       this.a(p0, null);
    }
    public void SizeAdjustableTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a(p0, p1);
    }
    public void SizeAdjustableTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SizeAdjustableTextView.class, "1")) {
          return;
       }
       g5 og5 = new g5(this, p0, p1);
       this.b = og5;
       SizeAdjustableTextView tc = this.c;
       if (tc > null) {
          og5.i(tc);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SizeAdjustableTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SizeAdjustableTextView.class, "8")) {
             return;
          }
       }
       SizeAdjustableTextView tc = this.c;
       if (tc > null && (p3 - p1) > tc) {
          p3 = p1 + tc;
       }
       tc = this.b;
       if (tc != null) {
          tc.a(p0, p1, p2, p3, p4);
       }
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SizeAdjustableTextView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SizeAdjustableTextView.class, "4")) {
          return;
       }
       SizeAdjustableTextView tb = this.b;
       if (tb != null) {
          tb.c(p0, p1, p2, p3);
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SizeAdjustableTextView.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SizeAdjustableTextView.class, "2")) {
          return;
       }
       SizeAdjustableTextView tb = this.b;
       if (tb != null) {
          tb.d(p0, p1, p2, p3);
       }
       return;
    }
    public void setInitTextSize(float p0){
       if (PatchProxy.isSupport(SizeAdjustableTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SizeAdjustableTextView.class, "7")) {
          return;
       }
       this.b.f(p0);
       return;
    }
    public void setLineSpacing(float p0,float p1){
       if (PatchProxy.isSupport(SizeAdjustableTextView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, SizeAdjustableTextView.class, "5")) {
          return;
       }
       super.setLineSpacing(p0, p1);
       SizeAdjustableTextView tb = this.b;
       if (tb != null) {
          tb.g(p0, p1);
       }
       return;
    }
    public void setMaxHeight(int p0){
       if (PatchProxy.isSupport(SizeAdjustableTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SizeAdjustableTextView.class, "9")) {
          return;
       }
       super.setMaxHeight(p0);
       SizeAdjustableTextView tb = this.b;
       if (tb != null) {
          tb.h(p0);
       }
       return;
    }
    public void setMaxWidth(int p0){
       if (PatchProxy.isSupport(SizeAdjustableTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SizeAdjustableTextView.class, "10")) {
          return;
       }
       this.c = p0;
       super.setMaxWidth(p0);
       SizeAdjustableTextView tb = this.b;
       if (tb != null) {
          tb.i(p0);
       }
       return;
    }
    public void setText(CharSequence p0,TextView$BufferType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SizeAdjustableTextView.class, "3")) {
          return;
       }
       super.setText(p0, p1);
       SizeAdjustableTextView tb = this.b;
       if (tb != null) {
          tb.b();
       }
       return;
    }
    public void setTextSizeAdjustable(boolean p0){
       if (PatchProxy.isSupport(SizeAdjustableTextView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SizeAdjustableTextView.class, "6")) {
          return;
       }
       this.b.j(p0);
       return;
    }
}
