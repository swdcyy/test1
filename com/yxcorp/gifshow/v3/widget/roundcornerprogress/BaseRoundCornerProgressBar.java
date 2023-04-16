package com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.drawable.GradientDrawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.GradientDrawable$Orientation;
import java.lang.Float;
import java.lang.Number;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.graphics.drawable.Drawable;
import java.lang.Math;
import android.view.View;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar$SavedState;
import androidx.customview.view.AbsSavedState;
import com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar$a;
import java.lang.Runnable;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar$b;
import java.lang.Boolean;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import ll8.c$b;
import android.content.res.TypedArray;

public abstract class BaseRoundCornerProgressBar extends LinearLayout	// class@00167a
{
    public int backgroundColor;
    public boolean isReverse;
    public LinearLayout layoutBackground;
    public LinearLayout layoutProgress;
    public LinearLayout layoutSecondaryProgress;
    public float max;
    public int padding;
    public float progress;
    public BaseRoundCornerProgressBar$b progressChangedListener;
    public int progressColor;
    public int[] progressColors;
    public GradientDrawable progressDrawable;
    public int radius;
    public float secondaryProgress;
    public int secondaryProgressColor;
    public int[] secondaryProgressColors;
    public GradientDrawable secondaryProgressDrawable;
    public int totalWidth;
    public static final int DEFAULT_BACKGROUND_PADDING = 0;
    public static final int DEFAULT_MAX_PROGRESS = 100;
    public static final int DEFAULT_PROGRESS = 0;
    public static final int DEFAULT_PROGRESS_RADIUS = 30;
    public static final int DEFAULT_SECONDARY_PROGRESS;

    public void BaseRoundCornerProgressBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setup(p0, p1);
    }
    public void BaseRoundCornerProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setup(p0, p1);
    }
    public void BaseRoundCornerProgressBar(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.setup(p0, p1);
    }
    public GradientDrawable createGradientDrawable(int p0){
       GradientDrawable obj;
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, BaseRoundCornerProgressBar.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new GradientDrawable();
       obj.setShape(0);
       obj.setColor(p0);
       return obj;
    }
    public GradientDrawable createGradientDrawable(int[] p0){
       GradientDrawable obj = PatchProxy.applyOneRefs(p0, this, BaseRoundCornerProgressBar.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GradientDrawable();
       obj.setShape(0);
       GradientDrawable$Orientation lEFT_RIGHT = (!this.isReverse())? GradientDrawable$Orientation.LEFT_RIGHT: GradientDrawable$Orientation.RIGHT_LEFT;
       obj.setOrientation(lEFT_RIGHT);
       obj.setColors(p0);
       return obj;
    }
    public float dp2px(float p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, BaseRoundCornerProgressBar.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return TypedValue.applyDimension(1, p0, c.c(this.getContext().getResources()));
    }
    public void drawAll(){
       if (PatchProxy.applyVoid(null, this, BaseRoundCornerProgressBar.class, "4")) {
          return;
       }
       this.drawBackgroundProgress();
       this.drawPadding();
       this.drawProgressReverse();
       this.drawPrimaryProgress();
       this.drawSecondaryProgress();
       this.onViewDraw();
       return;
    }
    public final void drawBackgroundProgress(){
       float f;
       if (PatchProxy.applyVoid(null, this, BaseRoundCornerProgressBar.class, "5")) {
          return;
       }
       GradientDrawable gradientDraw = this.createGradientDrawable(this.backgroundColor);
       float[] uofloatArray = new float[]{f,f,f,f,f,f,f,f};
       f = (float)(this.radius - (this.padding / 2));
       gradientDraw.setCornerRadii(uofloatArray);
       this.layoutBackground.setBackground(gradientDraw);
       return;
    }
    public final void drawPadding(){
       if (PatchProxy.applyVoid(null, this, BaseRoundCornerProgressBar.class, "14")) {
          return;
       }
       this.layoutBackground.setPadding(this.padding, this.padding, this.padding, this.padding);
       return;
    }
    public void drawPrimaryProgress(){
       if (PatchProxy.applyVoid(null, this, BaseRoundCornerProgressBar.class, "10")) {
          return;
       }
       this.drawProgress(this.layoutProgress, this.progressDrawable, this.max, this.progress, (float)this.totalWidth, Math.min(this.radius, (this.layoutBackground.getMeasuredHeight() / 2)), this.padding, this.isReverse);
       return;
    }
    public abstract void drawProgress(LinearLayout p0,GradientDrawable p1,float p2,float p3,float p4,int p5,int p6,boolean p7);
    public final void drawProgressReverse(){
       if (PatchProxy.applyVoid(null, this, BaseRoundCornerProgressBar.class, "12")) {
          return;
       }
       this.setupProgressReversing(this.layoutProgress, this.isReverse);
       this.setupProgressReversing(this.layoutSecondaryProgress, this.isReverse);
       return;
    }
    public void drawSecondaryProgress(){
       if (PatchProxy.applyVoid(null, this, BaseRoundCornerProgressBar.class, "11")) {
          return;
       }
       this.drawProgress(this.layoutSecondaryProgress, this.secondaryProgressDrawable, this.max, this.secondaryProgress, (float)this.totalWidth, Math.min(this.radius, (this.layoutBackground.getMeasuredHeight() / 2)), this.padding, this.isReverse);
       return;
    }
    public float getLayoutWidth(){
       return (float)this.totalWidth;
    }
    public float getMax(){
       return this.max;
    }
    public int getPadding(){
       return this.padding;
    }
    public float getProgress(){
       return this.progress;
    }
    public int getProgressBackgroundColor(){
       return this.backgroundColor;
    }
    public int getProgressColor(){
       return this.progressColor;
    }
    public int[] getProgressColors(){
       return this.progressColors;
    }
    public int getRadius(){
       return this.radius;
    }
    public float getSecondaryProgress(){
       return this.secondaryProgress;
    }
    public int getSecondaryProgressColor(){
       return this.secondaryProgressColor;
    }
    public int[] getSecondaryProgressColors(){
       return this.secondaryProgressColors;
    }
    public float getSecondaryProgressWidth(){
       BaseRoundCornerProgressBar obj = PatchProxy.apply(null, this, BaseRoundCornerProgressBar.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.layoutSecondaryProgress;
       if (obj != null) {
          return (float)obj.getWidth();
       }
       return 0;
    }
    public abstract int initLayout();
    public abstract void initStyleable(Context p0,AttributeSet p1);
    public abstract void initView();
    public void invalidate(){
       if (PatchProxy.applyVoid(null, this, BaseRoundCornerProgressBar.class, "31")) {
          return;
       }
       super.invalidate();
       this.drawAll();
       return;
    }
    public boolean isReverse(){
       return this.isReverse;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRoundCornerProgressBar.class, "33")) {
          return;
       }
       if (!p0 instanceof BaseRoundCornerProgressBar$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          this.max = p0.d;
          this.progress = p0.e;
          this.secondaryProgress = p0.f;
          this.radius = p0.g;
          this.padding = p0.h;
          this.backgroundColor = p0.i;
          this.progressColor = p0.j;
          this.secondaryProgressColor = p0.k;
          this.progressColors = p0.l;
          this.secondaryProgressColors = p0.m;
          this.isReverse = p0.n;
          this.updateProgressDrawable();
          this.updateSecondaryProgressDrawable();
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       Object obj = PatchProxy.apply(null, this, BaseRoundCornerProgressBar.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       BaseRoundCornerProgressBar$SavedState savedState = new BaseRoundCornerProgressBar$SavedState(super.onSaveInstanceState());
       savedState.d = this.max;
       savedState.e = this.progress;
       savedState.f = this.secondaryProgress;
       savedState.g = this.radius;
       savedState.h = this.padding;
       savedState.i = this.backgroundColor;
       savedState.j = this.progressColor;
       savedState.k = this.secondaryProgressColor;
       savedState.l = this.progressColors;
       savedState.m = this.secondaryProgressColors;
       savedState.n = this.isReverse;
       return savedState;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, BaseRoundCornerProgressBar.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.totalWidth = p0;
       this.drawBackgroundProgress();
       this.drawPadding();
       this.drawProgressReverse();
       this.post(new BaseRoundCornerProgressBar$a(this));
       this.onViewDraw();
       return;
    }
    public abstract void onViewDraw();
    public final void removeLayoutParamsRule(RelativeLayout$LayoutParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRoundCornerProgressBar.class, "15")) {
          return;
       }
       p0.removeRule(11);
       p0.removeRule(21);
       p0.removeRule(9);
       p0.removeRule(20);
       return;
    }
    public void setMax(float p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseRoundCornerProgressBar.class, "20")) {
          return;
       }
       if (p0 >= 0) {
          this.max = p0;
       }
       if (this.progress - p0 > 0) {
          this.progress = p0;
       }
       this.drawPrimaryProgress();
       this.drawSecondaryProgress();
       return;
    }
    public void setOnProgressChangedListener(BaseRoundCornerProgressBar$b p0){
       this.progressChangedListener = p0;
    }
    public void setPadding(int p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseRoundCornerProgressBar.class, "19")) {
          return;
       }
       if (p0 >= 0) {
          this.padding = p0;
       }
       this.drawPadding();
       this.drawPrimaryProgress();
       this.drawSecondaryProgress();
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseRoundCornerProgressBar.class, "22")) {
          return;
       }
       float f = 0;
       this.progress = (p0 - f < 0)? f: Math.min(p0, this.max);
       this.drawPrimaryProgress();
       BaseRoundCornerProgressBar tprogressCha = this.progressChangedListener;
       if (tprogressCha != null) {
          tprogressCha.a(this, this.progress, true, false);
       }
       return;
    }
    public void setProgress(int p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseRoundCornerProgressBar.class, "21")) {
          return;
       }
       this.setProgress((float)p0);
       return;
    }
    public void setProgressBackgroundColor(int p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseRoundCornerProgressBar.class, "26")) {
          return;
       }
       this.backgroundColor = p0;
       this.drawBackgroundProgress();
       return;
    }
    public void setProgressColor(int p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseRoundCornerProgressBar.class, "27")) {
          return;
       }
       this.progressColor = p0;
       this.progressColors = null;
       this.updateProgressDrawable();
       this.drawPrimaryProgress();
       return;
    }
    public void setProgressColors(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRoundCornerProgressBar.class, "28")) {
          return;
       }
       this.progressColor = -1;
       this.progressColors = p0;
       this.updateProgressDrawable();
       this.drawPrimaryProgress();
       return;
    }
    public void setRadius(int p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseRoundCornerProgressBar.class, "18")) {
          return;
       }
       if (p0 >= 0) {
          this.radius = p0;
       }
       this.drawBackgroundProgress();
       this.drawPrimaryProgress();
       this.drawSecondaryProgress();
       return;
    }
    public void setReverse(boolean p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseRoundCornerProgressBar.class, "17")) {
          return;
       }
       this.isReverse = p0;
       this.drawProgressReverse();
       this.drawPrimaryProgress();
       this.drawSecondaryProgress();
       return;
    }
    public void setSecondaryProgress(float p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseRoundCornerProgressBar.class, "25")) {
          return;
       }
       float f = 0;
       this.secondaryProgress = (p0 - f < 0)? f: Math.min(p0, this.max);
       this.drawSecondaryProgress();
       BaseRoundCornerProgressBar tprogressCha = this.progressChangedListener;
       if (tprogressCha != null) {
          tprogressCha.a(this, this.secondaryProgress, false, true);
       }
       return;
    }
    public void setSecondaryProgress(int p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseRoundCornerProgressBar.class, "24")) {
          return;
       }
       this.setSecondaryProgress((float)p0);
       return;
    }
    public void setSecondaryProgressColor(int p0){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseRoundCornerProgressBar.class, "29")) {
          return;
       }
       this.secondaryProgressColor = p0;
       this.secondaryProgressColors = null;
       this.updateSecondaryProgressDrawable();
       this.drawSecondaryProgress();
       return;
    }
    public void setSecondaryProgressColors(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRoundCornerProgressBar.class, "30")) {
          return;
       }
       this.secondaryProgressColor = -1;
       this.secondaryProgressColors = p0;
       this.updateSecondaryProgressDrawable();
       this.drawSecondaryProgress();
       return;
    }
    public void setup(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseRoundCornerProgressBar.class, "1")) {
          return;
       }
       this.setupStyleable(p0, p1);
       this.removeAllViews();
       LayoutInflater.from(p0).inflate(this.initLayout(), this);
       this.layoutBackground = this.findViewById(0x7f0a16cd);
       this.layoutProgress = this.findViewById(0x7f0a16e8);
       this.layoutSecondaryProgress = this.findViewById(0x7f0a16f2);
       this.initView();
       return;
    }
    public final void setupProgressReversing(LinearLayout p0,boolean p1){
       if (PatchProxy.isSupport(BaseRoundCornerProgressBar.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, BaseRoundCornerProgressBar.class, "13")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = p0.getLayoutParams();
       this.removeLayoutParamsRule(layoutParams);
       if (p1) {
          layoutParams.addRule(11);
          layoutParams.addRule(21);
       }else {
          layoutParams.addRule(9);
          layoutParams.addRule(20);
       }
       p0.setLayoutParams(layoutParams);
       return;
    }
    public void setupStyleable(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseRoundCornerProgressBar.class, "2")) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.y);
       this.radius = (int)typedArray.getDimension(6, this.dp2px(0x41f00000));
       this.padding = (int)typedArray.getDimension(1, this.dp2px(0));
       this.isReverse = typedArray.getBoolean(7, false);
       this.max = typedArray.getFloat(2, 100.00f);
       this.progress = typedArray.getFloat(3, 0);
       this.secondaryProgress = typedArray.getFloat(8, 0);
       this.backgroundColor = typedArray.getColor(false, p0.getResources().getColor(0x7f0600a6));
       int i = -1;
       this.progressColor = typedArray.getColor(4, i);
       int resourceId = typedArray.getResourceId(5, false);
       this.progressColors = (resourceId)? this.getResources().getIntArray(resourceId): null;
       this.secondaryProgressColor = typedArray.getColor(9, i);
       resourceId = typedArray.getResourceId(10, false);
       this.secondaryProgressColors = (resourceId)? this.getResources().getIntArray(resourceId): null;
       typedArray.recycle();
       this.updateProgressDrawable();
       this.updateSecondaryProgressDrawable();
       this.initStyleable(p0, p1);
       return;
    }
    public final void updateProgressDrawable(){
       if (PatchProxy.applyVoid(null, this, BaseRoundCornerProgressBar.class, "8")) {
          return;
       }
       BaseRoundCornerProgressBar tprogressCol = this.progressColor;
       if (tprogressCol != -1) {
          this.progressDrawable = this.createGradientDrawable(tprogressCol);
       }else {
          tprogressCol = this.progressColors;
          this.progressDrawable = (tprogressCol != null && tprogressCol.length > 0)? this.createGradientDrawable(tprogressCol): this.createGradientDrawable(this.getResources().getColor(0x7f0606da));
       }
       return;
    }
    public final void updateSecondaryProgressDrawable(){
       if (PatchProxy.applyVoid(null, this, BaseRoundCornerProgressBar.class, "9")) {
          return;
       }
       BaseRoundCornerProgressBar tsecondaryPr = this.secondaryProgressColor;
       if (tsecondaryPr != -1) {
          this.secondaryProgressDrawable = this.createGradientDrawable(tsecondaryPr);
       }else {
          tsecondaryPr = this.secondaryProgressColors;
          this.secondaryProgressDrawable = (tsecondaryPr != null && tsecondaryPr.length > 0)? this.createGradientDrawable(tsecondaryPr): this.createGradientDrawable(this.getResources().getColor(0x7f06008c));
       }
       return;
    }
}
