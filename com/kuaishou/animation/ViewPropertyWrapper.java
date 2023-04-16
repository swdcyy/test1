package com.kuaishou.animation.ViewPropertyWrapper;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import android.widget.TextView;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Float;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;

public class ViewPropertyWrapper	// class@000f8c
{
    public View mTarget;

    public void ViewPropertyWrapper(View p0){
       super();
       this.mTarget = p0;
       p0.setTag(R.id.anim_view_tag, this);
    }
    public float getAlpha(){
       Object obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTarget.getAlpha();
    }
    public int getBackgroundColor(){
       Drawable obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTarget.getBackground();
       if (obj instanceof ColorDrawable) {
          return obj.getColor();
       }
       return Color.parseColor("#00000000");
    }
    public float getHeight(){
       Object obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.mTarget.getHeight();
    }
    public float getRotateX(){
       Object obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTarget.getRotationX();
    }
    public float getRotateZ(){
       Object obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTarget.getRotation();
    }
    public float getRotationY(){
       Object obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTarget.getRotationY();
    }
    public float getScaleX(){
       Object obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTarget.getScaleX();
    }
    public float getScaleY(){
       Object obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTarget.getScaleY();
    }
    public int getTextColor(){
       ViewPropertyWrapper obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTarget;
       if (obj instanceof TextView) {
          return obj.getCurrentTextColor();
       }
       return 0;
    }
    public float getTextSize(){
       ViewPropertyWrapper obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.mTarget;
       if (obj instanceof TextView) {
          return ((obj.getTextSize() / c.c(this.mTarget.getResources()).density) + 0x3f000000);
       }
       return 0;
    }
    public float getTranslationX(){
       Object obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTarget.getTranslationX();
    }
    public float getTranslationY(){
       Object obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mTarget.getTranslationY();
    }
    public float getWidth(){
       Object obj = PatchProxy.apply(null, this, ViewPropertyWrapper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.mTarget.getWidth();
    }
    public void setAlpha(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "19")) {
          return;
       }
       this.mTarget.setAlpha(p0);
       return;
    }
    public void setBackgroundColor(int p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, viewProperty, "22")) {
          return;
       }
       if (this.mTarget.getBackground() instanceof ColorDrawable) {
          this.mTarget.setBackgroundColor(p0);
       }
       return;
    }
    public void setHeight(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "3")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.mTarget.getLayoutParams();
       layoutParams.height = (int)p0;
       this.mTarget.setLayoutParams(layoutParams);
       return;
    }
    public void setPivotX(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "24")) {
          return;
       }
       this.mTarget.setPivotX(p0);
       return;
    }
    public void setPivotY(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "25")) {
          return;
       }
       this.mTarget.setPivotY(p0);
       return;
    }
    public void setRotateX(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "13")) {
          return;
       }
       this.mTarget.setRotationX(p0);
       return;
    }
    public void setRotateY(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "15")) {
          return;
       }
       this.mTarget.setRotationY(p0);
       return;
    }
    public void setRotateZ(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "17")) {
          return;
       }
       this.mTarget.setRotation(p0);
       return;
    }
    public void setScaleX(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "9")) {
          return;
       }
       this.mTarget.setScaleX(p0);
       return;
    }
    public void setScaleY(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "11")) {
          return;
       }
       this.mTarget.setScaleY(p0);
       return;
    }
    public void setTextColor(int p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, viewProperty, "26")) {
          return;
       }
       viewProperty = this.mTarget;
       if (viewProperty instanceof TextView) {
          viewProperty.setTextColor(p0);
       }
       return;
    }
    public void setTextSize(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "28")) {
          return;
       }
       viewProperty = this.mTarget;
       if (viewProperty instanceof TextView) {
          viewProperty.setTextSize(1, p0);
       }
       return;
    }
    public void setTranslationX(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "5")) {
          return;
       }
       this.mTarget.setTranslationX(p0);
       return;
    }
    public void setTranslationY(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "7")) {
          return;
       }
       this.mTarget.setTranslationY(p0);
       return;
    }
    public void setVisibility(int p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, viewProperty, "21")) {
          return;
       }
       this.mTarget.setVisibility(p0);
       return;
    }
    public void setWidth(float p0){
       ViewPropertyWrapper viewProperty = ViewPropertyWrapper.class;
       if (PatchProxy.isSupport(viewProperty) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, viewProperty, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.mTarget.getLayoutParams();
       layoutParams.width = (int)p0;
       this.mTarget.setLayoutParams(layoutParams);
       return;
    }
}
