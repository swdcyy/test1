package com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Cloneable;
import android.os.Parcelable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import lnc.a1;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Boolean;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.View;
import android.widget.AbsoluteLayout;
import java.lang.Runnable;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer$b;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import java.lang.Integer;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import java.io.File;
import com.yxcorp.gifshow.util.AdvEditUtil;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import android.graphics.PointF;
import android.graphics.Matrix;
import aw9.b;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import aw9.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer$a;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import yl8.b;

public abstract class BaseDrawer extends DefaultObservableAndSyncable implements Cloneable, Parcelable	// class@0012ae
{
    public BaseDrawer$b b;
    public Runnable mAfterFileGeneratedRunnable;
    public BaseDrawerData mBaseDrawerData;
    public Bitmap mDecorationBitmap;
    public View mDecorationShowingView;
    public Rect mEditRect;
    public boolean mIsInSafeArea;
    public boolean mIsNeedReGenerateFile;
    public boolean mIsSelected;
    public ValueAnimator mSmoothUpdateAnimator;
    public static final int DECORATION_CUSTOM_ICON_WIDTH;
    public static final int DECORATION_OUT_BOX_DISTANCE_IN_BOX_WIDTH;
    public static final int DECORATION_REMOVE_ICON_WIDTH;
    public static final int DECORATION_SCALE_ROTATE_ICON_WIDTH;
    public static final float DRAWER_HEIGHT_TOP_BOTTOM_LIMIT;
    public static final float DRAWER_MOVE_LIMIT_AREA_WIDTH;
    public static final float DRAWER_WIDTH_LEFT_RIGHT_LIMIT;

    static {
       BaseDrawer.DECORATION_SCALE_ROTATE_ICON_WIDTH = a1.d(0x7f070189);
       BaseDrawer.DECORATION_OUT_BOX_DISTANCE_IN_BOX_WIDTH = a1.d(0x7f070186);
       BaseDrawer.DECORATION_REMOVE_ICON_WIDTH = a1.d(0x7f070188);
       BaseDrawer.DECORATION_CUSTOM_ICON_WIDTH = a1.d(0x7f070185);
       BaseDrawer.DRAWER_MOVE_LIMIT_AREA_WIDTH = (float)a1.d(0x7f070365);
       BaseDrawer.DRAWER_WIDTH_LEFT_RIGHT_LIMIT = (float)a1.d(0x7f070366);
       BaseDrawer.DRAWER_HEIGHT_TOP_BOTTOM_LIMIT = (float)a1.d(0x7f070364);
    }
    public void BaseDrawer(BaseDrawerData p0){
       super();
       this.mAfterFileGeneratedRunnable = null;
       this.mSmoothUpdateAnimator = null;
       this.mIsInSafeArea = false;
       this.mBaseDrawerData = p0;
    }
    public static float getCanonicalRotation(float p0){
       if (PatchProxy.isSupport(BaseDrawer.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, BaseDrawer.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       float f = 90.00f;
       if (Math.abs((p0 % f)) - 0x40400000 < 0) {
          return (float)(Math.round((p0 / f)) * 90);
       }else if(Math.abs((p0 % 45.00f)) - 0x40400000 < 0){
          p0 = (float)(Math.round((p0 / 45.00f)) * 45);
       }
       return p0;
    }
    public static boolean isSameDrawer(BaseDrawer p0,BaseDrawer p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, BaseDrawer.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p1 == null) {
          return false;
       }
       return p0.equals(p1);
    }
    public void add(DecorationContainerView p0,boolean p1){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, BaseDrawer.class, "3")) {
          return;
       }
       this.mIsNeedReGenerateFile = true;
       if (this.mDecorationShowingView == null) {
          View view = this.initView(p0);
          this.mDecorationShowingView = view;
          p0.addView(view);
       }else {
          this.update();
       }
       if (p1) {
          BaseDrawer tb = this.b;
          if (tb != null) {
             tb.a(this.mDecorationShowingView, null, 300, true);
          }
       }
       this.setGlobalScale(p0);
       return;
    }
    public void bringToFront(){
       if (PatchProxy.applyVoid(null, this, BaseDrawer.class, "71")) {
          return;
       }
       if (this.isAdded()) {
          this.mDecorationShowingView.bringToFront();
       }
       return;
    }
    public boolean changeDrawerVisible(boolean p0){
       BaseDrawer obj;
       if (PatchProxy.isSupport(BaseDrawer.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, BaseDrawer.class, "47");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.mBaseDrawerData.y() == p0) {
          return false;
       }else {
          obj = this.mBaseDrawerData;
          obj.u = p0;
          if (obj.y()) {
             this.mDecorationShowingView.setVisibility(false);
          }else {
             this.mDecorationShowingView.setVisibility(8);
          }
          return true;
       }
    }
    public void cloneBaseParam(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawer.class, "64")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.restore(this);
       return;
    }
    public float computeShowingHeightFitLimit(float p0){
       if (PatchProxy.isSupport(BaseDrawer.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, BaseDrawer.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if ((2.00f * p0) - (this.getTopLimitRemainPadding() + this.getBottomLimitRemainPadding()) > 0) {
          return 0xbf800000;
       }else {
          float f = 0;
          if (p0 - f <= 0) {
             return f;
          }else {
             boolean b = this.limitDrawerAreaTopBottom((- p0));
             boolean b1 = this.limitDrawerAreaTopBottom(p0);
             if (!b && !b1) {
                i1.c(new RuntimeException("computeShowingHeightFitLimit error top bottom touch limit"));
             }else if(!b){
                f = p0 - this.getTopLimitRemainPadding();
             }else if(!b1){
                f = this.getBottomLimitRemainPadding() - p0;
             }
             return f;
          }
       }
    }
    public float computeShowingWidthFitLimit(float p0,boolean p1){
       if (PatchProxy.isSupport(BaseDrawer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Boolean.valueOf(p1), this, BaseDrawer.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if ((2.00f * p0) - (this.getLeftLimitRemainPadding() + this.getRightLimitRemainPadding()) > 0 && !p1) {
          return 0xbf800000;
       }else {
          float f = 0;
          if (p0 - f <= 0) {
             return f;
          }else {
             boolean b = this.limitDrawerAreaLeftRight((- p0));
             boolean b1 = this.limitDrawerAreaLeftRight(p0);
             if (b || b1) {
                if (!b) {
                   f = p0 - this.getLeftLimitRemainPadding();
                }else if(!b1){
                   f = this.getRightLimitRemainPadding() - p0;
                }
             }
             return f;
          }
       }
    }
    public void disableAction(int p0){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseDrawer.class, "53")) {
          return;
       }
       this.mBaseDrawerData.b(p0);
       return;
    }
    public void drawDebug(Canvas p0,Paint p1){
    }
    public void enableAction(int p0){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseDrawer.class, "52")) {
          return;
       }
       this.mBaseDrawerData.c(p0);
       return;
    }
    public float fixTranslateWithLimits(int p0,int p1,float p2,boolean p3){
       return p2;
    }
    public float getAdditionalScale(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.d();
    }
    public int[] getAirWallLimits(){
       return new int[4]{0,0,0,0};
    }
    public float getAlpha(){
       BaseDrawer obj = PatchProxy.apply(null, this, BaseDrawer.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.mBaseDrawerData;
       if (obj != null) {
          return obj.e();
       }
       return 0x3f800000;
    }
    public float getBottomLimitRemainPadding(){
       Rect obj = PatchProxy.apply(null, this, BaseDrawer.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.getWholeRect();
       if (this.mBaseDrawerData.o().bottom - null >= 0) {
          return ((float)(this.mEditRect.height() - obj.bottom) - this.mBaseDrawerData.o().bottom);
       }
       return ((float)((this.mEditRect.height() - obj.bottom) + obj.height()) + this.mBaseDrawerData.o().bottom);
    }
    public Rect getContainerViwShowingRect(){
       return this.mEditRect;
    }
    public Rect getContentRect(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float f = (((this.mBaseDrawerData.i() * this.mBaseDrawerData.A()) * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()) / 2.00f;
       float f1 = (((this.mBaseDrawerData.f() * this.mBaseDrawerData.A()) * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()) / 2.00f;
       return new Rect((int)((this.mBaseDrawerData.w() * (float)this.mEditRect.width()) - f), (int)((this.mBaseDrawerData.x() * (float)this.mEditRect.height()) - f1), (int)((this.mBaseDrawerData.w() * (float)this.mEditRect.width()) + f), (int)((this.mBaseDrawerData.x() * (float)this.mEditRect.height()) + f1));
    }
    public final BaseDrawerData$CustomButtonMode getCustomButtonMode(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.j();
    }
    public Rect getCustomButtonRect(){
       Rect obj = PatchProxy.apply(null, this, BaseDrawer.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getOutBoxRect();
       int dECORATION_C = BaseDrawer.DECORATION_CUSTOM_ICON_WIDTH;
       return new Rect((int)((float)obj.right - (((float)dECORATION_C / this.mBaseDrawerData.t()) / 2.00f)), (int)((float)obj.top - (((float)dECORATION_C / this.mBaseDrawerData.t()) / 2.00f)), (int)((float)obj.right + (((float)dECORATION_C / this.mBaseDrawerData.t()) / 2.00f)), (int)((float)obj.top + (((float)dECORATION_C / this.mBaseDrawerData.t()) / 2.00f)));
    }
    public String getDecorationFilePath(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.k();
    }
    public String getDecorationName(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.l();
    }
    public int getDecorationType(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBaseDrawerData.n;
    }
    public float getFinalRotate(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "54");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (this.mBaseDrawerData.z() + this.mBaseDrawerData.q());
    }
    public float getGlobalScale(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "51");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.t();
    }
    public float getLeftLimitRemainPadding(){
       Rect obj = PatchProxy.apply(null, this, BaseDrawer.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.getWholeRect();
       if (this.mBaseDrawerData.o().left >= 0) {
          return ((float)obj.left - this.mBaseDrawerData.o().left);
       }
       return ((float)(obj.left + obj.width()) + this.mBaseDrawerData.o().left);
    }
    public float getMoveX(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "74");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.w();
    }
    public float getMoveY(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.x();
    }
    public Rect getOriginContentRect(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float f = this.mBaseDrawerData.i() / 2.00f;
       float f1 = this.mBaseDrawerData.f() / 2.00f;
       return new Rect((int)((this.mBaseDrawerData.w() * (float)this.mEditRect.width()) - f), (int)((this.mBaseDrawerData.x() * (float)this.mEditRect.height()) - f1), (int)((this.mBaseDrawerData.w() * (float)this.mEditRect.width()) + f), (int)((this.mBaseDrawerData.x() * (float)this.mEditRect.height()) + f1));
    }
    public Rect getOutBoxRect(){
       Rect obj = PatchProxy.apply(null, this, BaseDrawer.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getContentRect();
       return new Rect((obj.left - this.mBaseDrawerData.g()), (obj.top - this.mBaseDrawerData.h()), (obj.right + this.mBaseDrawerData.g()), (obj.bottom + this.mBaseDrawerData.h()));
    }
    public File getOutputFileDir(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdvEditUtil.e();
    }
    public Rect getRemoveButtonRect(){
       Rect obj = PatchProxy.apply(null, this, BaseDrawer.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getOutBoxRect();
       int dECORATION_R = BaseDrawer.DECORATION_REMOVE_ICON_WIDTH;
       return new Rect((int)((float)obj.left - (((float)dECORATION_R / this.mBaseDrawerData.t()) / 2.00f)), (int)((float)obj.top - (((float)dECORATION_R / this.mBaseDrawerData.t()) / 2.00f)), (int)((float)obj.left + (((float)dECORATION_R / this.mBaseDrawerData.t()) / 2.00f)), (int)((float)obj.top + (((float)dECORATION_R / this.mBaseDrawerData.t()) / 2.00f)));
    }
    public float getRightLimitRemainPadding(){
       Rect obj = PatchProxy.apply(null, this, BaseDrawer.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.getWholeRect();
       if (this.mBaseDrawerData.o().right - null >= 0) {
          return ((float)(this.mEditRect.width() - obj.right) - this.mBaseDrawerData.o().right);
       }
       return ((float)((this.mEditRect.width() - obj.right) + obj.width()) + this.mBaseDrawerData.o().right);
    }
    public float getScale(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "70");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.A();
    }
    public Rect getScaleContentRect(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float f = ((this.mBaseDrawerData.i() * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()) / 2.00f;
       float f1 = ((this.mBaseDrawerData.f() * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()) / 2.00f;
       return new Rect((int)((this.mBaseDrawerData.w() * (float)this.mEditRect.width()) - f), (int)((this.mBaseDrawerData.x() * (float)this.mEditRect.height()) - f1), (int)((this.mBaseDrawerData.w() * (float)this.mEditRect.width()) + f), (int)((this.mBaseDrawerData.x() * (float)this.mEditRect.height()) + f1));
    }
    public Rect getScaleOrRotateButtonRect(){
       Rect obj = PatchProxy.apply(null, this, BaseDrawer.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getOutBoxRect();
       int dECORATION_S = BaseDrawer.DECORATION_SCALE_ROTATE_ICON_WIDTH;
       return new Rect((int)((float)obj.right - (((float)dECORATION_S / this.mBaseDrawerData.t()) / 2.00f)), (int)((float)obj.bottom - (((float)dECORATION_S / this.mBaseDrawerData.t()) / 2.00f)), (int)((float)obj.right + (((float)dECORATION_S / this.mBaseDrawerData.t()) / 2.00f)), (int)((float)obj.bottom + (((float)dECORATION_S / this.mBaseDrawerData.t()) / 2.00f)));
    }
    public Rect getScaleOutBoxRect(){
       Rect obj = PatchProxy.apply(null, this, BaseDrawer.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getScaleContentRect();
       return new Rect((obj.left - this.mBaseDrawerData.g()), (obj.top - this.mBaseDrawerData.h()), (obj.right + this.mBaseDrawerData.g()), (obj.bottom + this.mBaseDrawerData.h()));
    }
    public float getTopLimitRemainPadding(){
       Rect obj = PatchProxy.apply(null, this, BaseDrawer.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = this.getWholeRect();
       if (this.mBaseDrawerData.o().top >= 0) {
          return ((float)obj.top - this.mBaseDrawerData.o().top);
       }
       return ((float)(obj.top + obj.height()) + this.mBaseDrawerData.o().top);
    }
    public Rect getWholeRect(){
       Rect obj = PatchProxy.apply(null, this, BaseDrawer.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getOutBoxRect();
       float f = 2.00f;
       int i = (this.isRotateEnable() || this.isScaleEnable())? (int)((float)obj.bottom + (((float)BaseDrawer.DECORATION_SCALE_ROTATE_ICON_WIDTH / this.mBaseDrawerData.t()) / f)): obj.bottom;
       int i1 = (this.isRotateEnable() || this.isScaleEnable())? (int)((float)obj.right + (((float)BaseDrawer.DECORATION_SCALE_ROTATE_ICON_WIDTH / this.mBaseDrawerData.t()) / f)): obj.right;
       int i2 = (this.isRemoveEnable())? (int)((float)obj.left - (((float)BaseDrawer.DECORATION_REMOVE_ICON_WIDTH / this.mBaseDrawerData.t()) / f)): obj.left;
       int i3 = (this.isRemoveEnable())? (int)((float)obj.top - (((float)BaseDrawer.DECORATION_REMOVE_ICON_WIDTH / this.mBaseDrawerData.t()) / f)): obj.top;
       return new Rect(i2, i3, i1, i);
    }
    public int getZIndex(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBaseDrawerData.B();
    }
    public abstract View initView(DecorationContainerView p0);
    public boolean isAdded(){
       boolean b = (this.mDecorationShowingView != null)? true: false;
       return b;
    }
    public final boolean isCustomButtonEnable(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "60");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.C();
    }
    public boolean isEnableSelectBox(){
       return true;
    }
    public final boolean isGestureEnable(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.D();
    }
    public boolean isHorizontalMoveEnable(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.E();
    }
    public boolean isInCustomButton(float p0,float p1){
       if (PatchProxy.isSupport(BaseDrawer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BaseDrawer.class, "30");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("BaseDrawer", "isInCustomButton |||||||||| motionEventX:"+p0+",motionEventY:"+p1, objArray);
       if (this.mBaseDrawerData.C() && this.isPointInTheRect(p0, p1, this.getCustomButtonRect())) {
          i = true;
       }
       return i;
    }
    public boolean isInRemoveButton(float p0,float p1){
       if (PatchProxy.isSupport(BaseDrawer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BaseDrawer.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.mBaseDrawerData.F() && this.isPointInTheRect(p0, p1, this.getRemoveButtonRect()))? true: false;
       return b;
    }
    public boolean isInSafeArea(){
       return this.mIsInSafeArea;
    }
    public boolean isInScaleAndRotateButton(float p0,float p1){
       if (PatchProxy.isSupport(BaseDrawer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BaseDrawer.class, "31");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().s("BaseDrawer", "isInScaleAndRotateButton |||||||||| motionEventX:"+p0+",motionEventY:"+p1, objArray);
       return this.isPointInTheRect(p0, p1, this.getScaleOrRotateButtonRect());
    }
    public boolean isInWholeDecoration(float p0,float p1){
       if (PatchProxy.isSupport(BaseDrawer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BaseDrawer.class, "29");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.isPointInTheRect(p0, p1, this.getWholeRect());
    }
    public boolean isNeedReGenerateFile(){
       return this.mIsNeedReGenerateFile;
    }
    public boolean isPointInTheRect(float p0,float p1,Rect p2){
       PointF obj;
       if (PatchProxy.isSupport(BaseDrawer.class)) {
          obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), p2, this, BaseDrawer.class, "33");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       a.D().s("BaseDrawer", "isPointInTheRect |||||||||| motionEventX:"+p0+",motionEventY:"+p1+", rect = "+p2, objArray);
       obj = new PointF(p0, p1);
       if (this.mBaseDrawerData.z() - null) {
          Matrix matrix = new Matrix();
          matrix.postRotate((- (this.mBaseDrawerData.z() + this.mBaseDrawerData.q())), (float)this.getContentRect().centerX(), (float)this.getContentRect().centerY());
          float[] uofloatArray = new float[]{p0,p1};
          matrix.mapPoints(uofloatArray);
          obj = new PointF(uofloatArray[0], uofloatArray[1]);
       }
       Object[] objArray1 = new Object[0];
       a.D().s("BaseDrawer", "isPointInTheRect rect:"+p2+",model:"+this, objArray1);
       return p2.contains((int)obj.x, (int)obj.y);
    }
    public final boolean isRemoveEnable(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.F();
    }
    public final boolean isRotateEnable(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.G();
    }
    public final boolean isScaleEnable(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.H();
    }
    public boolean isShowing(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "48");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.y();
    }
    public boolean isVerticalMoveEnable(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.J();
    }
    public boolean limitDrawerAreaLeftRight(float p0){
       Rect obj;
       if (PatchProxy.isSupport(BaseDrawer.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, BaseDrawer.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getWholeRect();
       int i = 0;
       boolean b = false;
       if (p0 - i > 0) {
          if (this.mBaseDrawerData.o().right - i >= 0) {
             if ((((float)obj.right + p0) + this.mBaseDrawerData.o().right) - (float)this.mEditRect.width() <= 0) {
                b = true;
             }
             return b;
          }else if(obj.left < (this.mEditRect.width() / 2)){
             return true;
          }else if((float)(this.mEditRect.width() - obj.left) - (- this.mBaseDrawerData.o().right) > 0){
             b = true;
          }
          return b;
       }else if(this.mBaseDrawerData.o().left - i >= 0){
          if (((float)obj.left + p0) - this.mBaseDrawerData.o().left >= 0) {
             b = true;
          }
          return b;
       }else if((float)obj.right - (- this.mBaseDrawerData.o().left) > 0){
          b = true;
       }
       return b;
    }
    public boolean limitDrawerAreaTopBottom(float p0){
       Rect obj;
       if (PatchProxy.isSupport(BaseDrawer.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, BaseDrawer.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getWholeRect();
       int i = 0;
       boolean b = false;
       if (p0 - i > 0) {
          if (this.mBaseDrawerData.o().bottom - i >= 0) {
             if ((((float)obj.bottom + p0) + this.mBaseDrawerData.o().bottom) - (float)this.mEditRect.height() <= 0) {
                b = true;
             }
             return b;
          }else if(obj.top < (this.mEditRect.height() / 2)){
             return true;
          }else if((float)(this.mEditRect.height() - obj.top) - (- this.mBaseDrawerData.o().bottom) > 0){
             b = true;
          }
          return b;
       }else if(this.mBaseDrawerData.o().top - i >= 0){
          if (((float)obj.top + p0) - this.mBaseDrawerData.o().top >= 0) {
             b = true;
          }
          return b;
       }else if((float)obj.bottom - (- this.mBaseDrawerData.o().top) > 0){
          b = true;
       }
       return b;
    }
    public void moveForSingleFinger(float p0,float p1){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BaseDrawer.class, "25")) {
          return;
       }
       if (this.mBaseDrawerData.E() && this.limitDrawerAreaLeftRight(p0)) {
          BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
          tmBaseDrawer.Y((tmBaseDrawer.w() + (p0 / (float)this.mEditRect.width())));
       }
       if (this.mBaseDrawerData.J() && this.limitDrawerAreaTopBottom(p1)) {
          BaseDrawer tmBaseDrawer1 = this.mBaseDrawerData;
          tmBaseDrawer1.Z((tmBaseDrawer1.x() + (p1 / (float)this.mEditRect.height())));
       }
       return;
    }
    public boolean needBlockedByAirWall(){
       return false;
    }
    public void onDecorationRemoved(){
    }
    public void onDecorationScaleAndRotate(){
    }
    public void onDoubleFingerScaleAndRotateEnd(){
    }
    public void onDoubleFingerScaleAndRotateProcess(){
    }
    public void onDoubleFingerScaleAndRotateStart(){
       this.mIsNeedReGenerateFile = true;
    }
    public void onSingleFingerMoveEnd(){
    }
    public void onSingleFingerMoveProcess(float p0,float p1){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BaseDrawer.class, "6")) {
          return;
       }
       this.moveForSingleFinger(p0, p1);
       return;
    }
    public void onSingleFingerMoveStart(){
    }
    public void onSingleFingerScaleAndRotateEnd(){
    }
    public void onSingleFingerScaleAndRotateProcess(float p0,float p1){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BaseDrawer.class, "8")) {
          return;
       }
       this.scaleAndRotateForSingleFinger(p0, p1);
       return;
    }
    public void onSingleFingerScaleAndRotateStart(float p0,float p1){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BaseDrawer.class, "7")) {
          return;
       }
       this.mIsNeedReGenerateFile = true;
       this.onDecorationScaleAndRotate();
       return;
    }
    public void onTranslationFixed(){
    }
    public void remove(DecorationContainerView p0,boolean p1){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, BaseDrawer.class, "5")) {
          return;
       }
       if (p1) {
          BaseDrawer tb = this.b;
          if (tb != null) {
             tb.a(this.mDecorationShowingView, new b(this, p0), 300, false);
          }
       }else {
          p0.removeView(this.mDecorationShowingView);
       }
       this.mDecorationShowingView = null;
       this.onDecorationRemoved();
       return;
    }
    public void restore(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawer.class, "65")) {
          return;
       }
       this.mBaseDrawerData.a(p0.mBaseDrawerData);
       return;
    }
    public void rotateForDoubleFinger(float p0){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseDrawer.class, "23")) {
          return;
       }
       if (!this.mBaseDrawerData.G()) {
          return;
       }
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       tmBaseDrawer.a0(((tmBaseDrawer.z() + p0) % 360.00f));
       return;
    }
    public void scaleAndRotateForSingleFinger(float p0,float p1){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, BaseDrawer.class, "15")) {
          return;
       }
       if (!this.mBaseDrawerData.H() && !this.mBaseDrawerData.G()) {
          return;
       }
       Rect scaleOutBoxR = this.getScaleOutBoxRect();
       float f = (float)scaleOutBoxR.width() / 2.00f;
       float f1 = (float)scaleOutBoxR.height() / 2.00f;
       float f2 = PointF.length((p0 - (float)scaleOutBoxR.centerX()), (p1 - (float)scaleOutBoxR.centerY()));
       float f3 = PointF.length(f, f1);
       Object[] objArray = new Object[0];
       a.D().w("BaseDrawer", "scaleAndRotateForSingleFinger motionEventX:"+p0+",motionEventY:"+p1+",outBoxRect:"+scaleOutBoxR+",halfHeight:"+f1+",halfWidth:"+f+",newRadius:"+f2+",oldRadius:"+f3, objArray);
       if (this.mBaseDrawerData.H()) {
          this.updateScaleWithLimit(Math.min(Math.max((f2 / f3), 0.30f), 4.00f));
       }
       if (this.mBaseDrawerData.G()) {
          BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
          tmBaseDrawer.a0((BaseDrawer.getCanonicalRotation((float)Math.toDegrees((Math.atan2((double)f, (double)f1) - Math.atan2((double)(p0 - (float)scaleOutBoxR.centerX()), (double)(p1 - (float)scaleOutBoxR.centerY()))))) - tmBaseDrawer.q()));
       }
       return;
    }
    public void scaleForDoubleFinger(float p0){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseDrawer.class, "24")) {
          return;
       }
       if (!this.mBaseDrawerData.H()) {
          return;
       }
       this.updateScaleWithLimit(Math.min(Math.max((this.mBaseDrawerData.A() * p0), 0.30f), 4.00f));
       return;
    }
    public void select(){
    }
    public void selectedTap(MotionEvent p0){
    }
    public void setAdditionalScale(float p0){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseDrawer.class, "68")) {
          return;
       }
       this.mBaseDrawerData.K(p0);
       return;
    }
    public void setAfterFileGeneratedRunnable(Runnable p0){
       this.mAfterFileGeneratedRunnable = p0;
    }
    public void setAlpha(float p0){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseDrawer.class, "45")) {
          return;
       }
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       if (tmBaseDrawer != null) {
          tmBaseDrawer.L(p0);
       }
       tmBaseDrawer = this.mDecorationShowingView;
       if (tmBaseDrawer != null) {
          tmBaseDrawer.setAlpha(p0);
       }
       return;
    }
    public void setAnimationListener(BaseDrawer$b p0){
       this.b = p0;
    }
    public final void setCustomButtonEnable(boolean p0){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseDrawer.class, "61")) {
          return;
       }
       this.mBaseDrawerData.Q(p0);
       return;
    }
    public void setDecorationFilePath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawer.class, "56")) {
          return;
       }
       this.mBaseDrawerData.R(p0);
       return;
    }
    public void setEditorScale(float p0){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseDrawer.class, "67")) {
          return;
       }
       this.mBaseDrawerData.U(p0);
       return;
    }
    public void setGlobalScale(float p0){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseDrawer.class, "66")) {
          return;
       }
       this.mBaseDrawerData.X(p0);
       return;
    }
    public void setGlobalScale(DecorationContainerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawer.class, "4")) {
          return;
       }
       if (p0 != null) {
          this.mBaseDrawerData.X((p0.getScaleX() * p0.getParent().getScaleX()));
       }else {
          this.mBaseDrawerData.X(0x3f800000);
       }
       return;
    }
    public void setInSafeArea(boolean p0){
       this.mIsInSafeArea = p0;
    }
    public void setNeedReGenerateFile(boolean p0){
       this.mIsNeedReGenerateFile = p0;
    }
    public void setZIndex(int p0){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BaseDrawer.class, "72")) {
          return;
       }
       this.mBaseDrawerData.c0(p0);
       return;
    }
    public String shallowToString(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "77");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "mEditRect: "+this.mEditRect+"\n"+this.mBaseDrawerData.d0();
    }
    public void smoothUpdate(int p0,int p1,Animator$AnimatorListener p2){
       BaseDrawer uBaseDrawer = this;
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, BaseDrawer.class, "11")) {
          return;
       }
       int i = 0;
       if (uBaseDrawer.mDecorationShowingView == null || uBaseDrawer.mBaseDrawerData == null) {
          Object[] objArray = new Object[i];
          a.D().w("BaseDrawer", "update mDecorationShowingView is null", objArray);
          return;
       }else {
          BaseDrawer mSmoothUpdat = uBaseDrawer.mSmoothUpdateAnimator;
          if (mSmoothUpdat != null && mSmoothUpdat.isRunning()) {
             uBaseDrawer.mSmoothUpdateAnimator.removeAllListeners();
             uBaseDrawer.mSmoothUpdateAnimator.cancel();
          }
          Rect originConten = this.getOriginContentRect();
          Rect contentRect = this.getContentRect();
          float f = uBaseDrawer.mDecorationShowingView.getTranslationX() - ((float)p0 / 2.00f);
          float f1 = uBaseDrawer.mDecorationShowingView.getTranslationY() - ((float)p1 / 2.00f);
          int i1 = originConten.height();
          float f2 = uBaseDrawer.fixTranslateWithLimits(i1, contentRect.height(), ((uBaseDrawer.mBaseDrawerData.x() * (float)uBaseDrawer.mEditRect.height()) - ((float)originConten.height() / 2.00f)), i);
          uBaseDrawer.mDecorationShowingView.setRotation((uBaseDrawer.mBaseDrawerData.z() + uBaseDrawer.mBaseDrawerData.q()));
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          valueAnimato.setDuration(200);
          a uoa = new a(this, uBaseDrawer.mDecorationShowingView.getScaleX(), ((uBaseDrawer.mBaseDrawerData.A() * uBaseDrawer.mBaseDrawerData.m()) * uBaseDrawer.mBaseDrawerData.d()), uBaseDrawer.mDecorationShowingView.getScaleY(), f, uBaseDrawer.fixTranslateWithLimits(originConten.width(), contentRect.width(), ((uBaseDrawer.mBaseDrawerData.w() * (float)uBaseDrawer.mEditRect.width()) - ((float)originConten.width() / 2.00f)), true), f1, f2, uBaseDrawer.mDecorationShowingView.getAlpha(), uBaseDrawer.mBaseDrawerData.e());
          valueAnimato.addUpdateListener(v15);
          valueAnimato.addListener(new BaseDrawer$a(uBaseDrawer, f, f1, p2));
          uBaseDrawer.mSmoothUpdateAnimator = valueAnimato;
          valueAnimato.start();
          return;
       }
    }
    public void stopSmoothUpdate(){
       if (PatchProxy.applyVoid(null, this, BaseDrawer.class, "12")) {
          return;
       }
       BaseDrawer tmSmoothUpda = this.mSmoothUpdateAnimator;
       if (tmSmoothUpda != null) {
          tmSmoothUpda.removeAllListeners();
          this.mSmoothUpdateAnimator.cancel();
       }
       return;
    }
    public void sync(){
       if (PatchProxy.applyVoid(null, this, BaseDrawer.class, "2")) {
          return;
       }
       this.notifyChanged();
       return;
    }
    public void sync(DecorationDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseDrawer.class, "1")) {
          return;
       }
       this.notifyChanged();
       return;
    }
    public void sync(b p0){
       this.sync(p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BaseDrawer.class, "76");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BaseDrawer{,mBaseDrawerData"+this.mBaseDrawerData+", mEditRect="+this.mEditRect+'}';
    }
    public void unSelect(){
    }
    public void update(){
       if (PatchProxy.applyVoid(null, this, BaseDrawer.class, "10")) {
          return;
       }
       int i = 0;
       if (this.mDecorationShowingView != null) {
          BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
          if (tmBaseDrawer != null) {
             if (tmBaseDrawer.y()) {
                this.mDecorationShowingView.setVisibility(i);
             }
             Rect originConten = this.getOriginContentRect();
             Rect contentRect = this.getContentRect();
             float f = (this.mBaseDrawerData.A() * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d();
             this.mDecorationShowingView.setScaleX(f);
             this.mDecorationShowingView.setScaleY(f);
             this.mDecorationShowingView.setRotation((this.mBaseDrawerData.z() + this.mBaseDrawerData.q()));
             f = (this.mBaseDrawerData.w() * (float)this.mEditRect.width()) - ((float)originConten.width() / 2.00f);
             float f1 = (this.mBaseDrawerData.x() * (float)this.mEditRect.height()) - ((float)originConten.height() / 2.00f);
             float f2 = this.fixTranslateWithLimits(originConten.width(), contentRect.width(), f, true);
             float f3 = this.fixTranslateWithLimits(originConten.height(), contentRect.height(), f1, i);
             this.mDecorationShowingView.setTranslationX(f2);
             this.mDecorationShowingView.setTranslationY(f3);
             this.mDecorationShowingView.setAlpha(this.mBaseDrawerData.e());
             if (f2 - f || (f3 - f1 && (this.mEditRect.width() > 0 && this.mEditRect.height() > 0))) {
                this.mBaseDrawerData.Y(((f2 + ((float)originConten.width() / 2.00f)) / (float)this.mEditRect.width()));
                this.mBaseDrawerData.Z(((f3 + ((float)originConten.height() / 2.00f)) / (float)this.mEditRect.height()));
                this.onTranslationFixed();
             }
          label_00fb :
             return;
          }
       }
       Object[] objArray = new Object[i];
       a.D().w("BaseDrawer", "update mDecorationShowingView is null", objArray);
       return;
    }
    public void update(BaseDrawerData p0,boolean p1){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, BaseDrawer.class, "9")) {
          return;
       }
       this.mBaseDrawerData = p0;
       if (p1) {
          this.update();
       }
       return;
    }
    public void updateScaleWithLimit(float p0){
       if (PatchProxy.isSupport(BaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, BaseDrawer.class, "16")) {
          return;
       }
       float f = this.mBaseDrawerData.A();
       if (p0 - f <= 0) {
          this.mBaseDrawerData.b0(p0);
       }else {
          f = p0 - f;
          boolean b = false;
          float f1 = this.computeShowingWidthFitLimit(((this.mBaseDrawerData.i() * f) / 2.00f), b);
          f = this.computeShowingHeightFitLimit(((f * this.mBaseDrawerData.f()) / 2.00f));
          StringBuilder str = 0xbf800000;
          if (f1 - str && f - str) {
             BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
             tmBaseDrawer.Y((tmBaseDrawer.w() + (f1 / (float)this.mEditRect.width())));
             BaseDrawer tmBaseDrawer1 = this.mBaseDrawerData;
             tmBaseDrawer1.Z((tmBaseDrawer1.x() + (f / (float)this.mEditRect.height())));
             this.mBaseDrawerData.b0(p0);
          }else {
             Object[] objArray = new Object[b];
             a.D().s("BaseDrawer", "updateScaleWithLimit scale to limit deltaX:"+f1+",deltaY:"+f, objArray);
          }
       }
       return;
    }
}
