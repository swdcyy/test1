package com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.InteractStickerWrapperView;
import jn6.b;
import android.widget.FrameLayout;
import android.content.Context;
import hmd.d;
import android.view.ViewGroup$LayoutParams;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import nn6.a;
import java.lang.Math;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import mn6.a;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import java.lang.Boolean;

public class InteractStickerWrapperView extends FrameLayout implements b	// class@000a8a
{
    public a b;
    public d c;
    public boolean d;
    public int e;
    public int f;

    public void InteractStickerWrapperView(Context p0,d p1){
       super(p0);
       this.d = true;
       this.e = 0;
       this.f = 0;
       this.c = p1;
       this.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
    }
    public float a(RectF p0,int p1,int p2,int p3,int p4,float p5,float p6){
       float f7;
       Object obj = this;
       int i = p1;
       int i1 = p2;
       int i2 = p3;
       int i3 = p4;
       int i4 = 1;
       int i5 = 0;
       if (PatchProxy.isSupport(InteractStickerWrapperView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Float.valueOf(p5),Float.valueOf(p6)};
          Object obj1 = PatchProxy.apply(objArray, obj, InteractStickerWrapperView.class, "3");
          if (obj1 != PatchProxyResult.class) {
             return obj1.floatValue();
          }
       }
       if (p0 != null && (i <= 0 || i1 <= 0)) {
          return 0x3f800000;
       }else {
          int i6 = 0;
          float f = (p5 - i6 <= 0 || Float.isNaN(p5))? 0x3f800000: p5;
          float f1 = (float)i;
          float f2 = (float)i1;
          float f3 = f1 / f2;
          float f4 = p0.centerX();
          float f5 = p0.centerY();
          float f6 = 2.00f;
          if (p6 - i6 > 0 && f3 - p6 < 0) {
             f5 = f5 + ((((p6 / f3) * f5) - f5) / f6);
          }
          f4 = f4 * f1;
          int i7 = (int)((f4 - (((float)this.getMeasuredWidth() * f) / f6)) + ((float)obj.e / f6));
          int i8 = (int)((f4 + (((float)this.getMeasuredWidth() * f) / f6)) + ((float)obj.e / f6));
          f5 = f5 * f2;
          int i9 = (int)((f5 - (((float)this.getMeasuredHeight() * f) / f6)) + ((float)obj.f / f6));
          int i10 = (int)((f5 + (((float)this.getMeasuredHeight() * f) / f6)) + ((float)obj.f / f6));
          int i11 = i8 - i7;
          int i12 = i10 - i9;
          if (i11 > 0 && (i12 > 0 && (this.getMeasuredWidth() <= 0 || this.getMeasuredHeight() <= 0))) {
             Object[] objArray1 = new Object[0];
             a.D().A("ShowVoteView", "translateAndScale param error... parentWidth:"+i+" , parentHeight:"+i1+" , realWidth:"+i11+" , realHeight:"+i12+" , getMeasuredWidth:"+this.getMeasuredWidth()+" , getMeasuredHeight:"+this.getMeasuredHeight(), objArray1);
             return 0x3f800000;
          }else if(i11 > i){
             i12 = (i12 * i) / i11;
             i11 = i;
          }
          if (i12 > i1) {
             i11 = (i11 * i1) / i12;
             i12 = i1;
          }
          InteractStickerWrapperView b = obj.b;
          if (b != null) {
             b.g();
          }
          b = obj.b;
          if (b != null && b.a()) {
             if (i7 < 0) {
                i7 = 0;
             }else {
                f7 = (float)(i10 + i3);
                if (f7 - obj.b.d() > 0 && (float)(i8 + i2) - obj.b.b() > 0) {
                   i7 = ((int)obj.b.b() - i11) - i2;
                }else if(f7 - obj.b.d() < 0 && i8 > i){
                   i7 = i - i11;
                }
             }
             i4 = (int)obj.b.e();
             if (i9 < 0 || (i9 + i3) < i4) {
                i4 = Math.max((i4 - i3), 0);
             }else if((float)(i10 + i3) - obj.b.c() > 0){
                i4 = ((int)obj.b.c() - i12) - i3;
             }
             i9 = i4;
          }else if(i7 < 0){
             i7 = 0;
          }else if(i8 > i){
             i7 = i - i11;
          }
          if (i9 < 0) {
             f7 = 0;
             i9 = 0;
          label_0177 :
             obj.setTranslationX(f7);
             obj.setTranslationY(f7);
             float f8 = (float)Math.max((i7 + i2), 0);
             f7 = (float)Math.max((i9 + i3), 0);
             if (!PatchProxy.isSupport(InteractStickerWrapperView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f8), Float.valueOf(f7), obj, InteractStickerWrapperView.class, "4")) {
                obj.setTranslationX((this.getTranslationX() + f8));
                obj.setTranslationY((this.getTranslationY() + f7));
             }
             if (!PatchProxy.isSupport(InteractStickerWrapperView.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), obj, InteractStickerWrapperView.class, "5")) {
                f7 = 0;
                obj.setPivotX(f7);
                obj.setPivotY(f7);
                obj.setScaleX(f);
                obj.setScaleY(f);
             }
             Object[] objArray2 = new Object[]{"position:"+p0.toString()+" , parent width:"+i+" , parent height:"+i1+" , offsetX:"+i2+" , offsetY:"+i3+" , scale:"+f};
             a.D().s("ShowVoteView", "translateAndScale VoteView", objArray2);
             return f;
          }else if(i10 > i1){
             i9 = i1 - i12;
          }
          f7 = 0;
          goto label_0177 ;
       }
    }
    public void b(InteractStickerInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InteractStickerWrapperView.class, "2")) {
          return;
       }
       InteractStickerWrapperView tc = this.c;
       if (tc != null) {
          tc.c(null, this.getContext(), p0);
       }
       return;
    }
    public ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return this.generateDefaultLayoutParams();
    }
    public FrameLayout$LayoutParams generateDefaultLayoutParams(){
       Object obj = PatchProxy.apply(null, this, InteractStickerWrapperView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FrameLayout$LayoutParams(-2, -2);
    }
    public boolean getOptionViewHasResetLayout(){
       return this.d;
    }
    public View getView(){
       return this;
    }
    public void setInteractStickerContainerBorder(a p0){
       this.b = p0;
    }
    public void setRenderComplete(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InteractStickerWrapperView.class, "6")) {
          return;
       }
       this.d = p0.booleanValue();
       this.requestLayout();
       return;
    }
    public void setStickerExtraHeight(int p0){
       this.f = p0;
    }
    public void setStickerExtraWidth(int p0){
       this.e = p0;
    }
}
