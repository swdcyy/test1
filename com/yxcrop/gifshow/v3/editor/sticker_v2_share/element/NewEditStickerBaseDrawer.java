package com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer$a;
import nsd.u;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import android.content.Context;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.graphics.Rect;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Math;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.widget.AbsoluteLayout;
import java.lang.StringBuilder;
import java.util.Collection;
import ekd.a0;
import java.util.ArrayList;
import android.graphics.Point;
import umd.a;
import com.yxcorp.gifshow.decoration.widget.c;
import java.lang.Runnable;
import ekd.k1;
import android.graphics.PointF;
import android.text.Editable;
import java.lang.CharSequence;
import android.text.TextUtils;
import faa.a;
import java.lang.Exception;
import w46.b;
import android.os.Parcel;

public abstract class NewEditStickerBaseDrawer extends EditDecorationBaseDrawer	// class@000ad3
{
    public DecorationContainerView containerView;
    public boolean isNeedGenerateBitmap;
    public static final NewEditStickerBaseDrawer$a Companion;

    static {
       NewEditStickerBaseDrawer.Companion = new NewEditStickerBaseDrawer$a(null);
    }
    public void NewEditStickerBaseDrawer(NewStickerElementData p0){
       a.p(p0, "elementData");
       super(p0);
    }
    public int describeContents(){
       return 0;
    }
    public void enterEditingMode(){
       if (PatchProxy.applyVoid(null, this, NewEditStickerBaseDrawer.class, "37")) {
          return;
       }
       EditText focusEditTex = this.getFocusEditText();
       if (focusEditTex != null) {
          focusEditTex.setCursorVisible(true);
          focusEditTex.setFocusable(true);
          focusEditTex.setFocusableInTouchMode(true);
          if (!focusEditTex.hasFocus()) {
             focusEditTex.requestFocus();
          }
          n.a0(focusEditTex.getContext(), focusEditTex, 0);
       }
       return;
    }
    public float fixTranslateWithLimits(int p0,int p1,float p2,boolean p3){
       int[] obj;
       BaseDrawer tmEditRect;
       Rect this;
       float f;
       float f1;
       float f2;
       float f3;
       float f4;
       if (PatchProxy.isSupport(NewEditStickerBaseDrawer.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Float.valueOf(p2), Boolean.valueOf(p3), this, NewEditStickerBaseDrawer.class, "32");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (!this.needBlockedByAirWall()) {
          return p2;
       }else {
          obj = this.getAirWallLimits();
          if (obj != null && obj.length == 4) {
             int i = p0 - p1;
             int i1 = 0;
             int i2 = 2;
             if (p3) {
                tmEditRect = this.mEditRect;
                this = tmEditRect.left;
                f = (float)(obj[i1] + this);
                f1 = (float)((this + tmEditRect.width()) - obj[i2]);
                f2 = (float)(i / i2);
                f3 = p2 + f2;
                f4 = (float)p1 + f3;
                if ((f4 - f3) - (f1 - f) >= 0) {
                   i1 = 1;
                }
                if (i1 || f3 - f <= 0) {
                   p2 = f - f2;
                }else if(f4 - f1 >= 0){
                   p2 = (f1 + f2) - (float)p0;
                }
                return p2;
             }else {
                tmEditRect = this.mEditRect;
                this = tmEditRect.top;
                f = (float)(obj[1] + this);
                f1 = (float)((this + tmEditRect.height()) - obj[3]);
                f2 = (float)(i / i2);
                f3 = p2 + f2;
                f4 = (float)p1 + f3;
                if ((f4 - f3) - (f1 - f) >= 0) {
                   i1 = 1;
                }
                if (i1 || f3 - f <= 0) {
                   p2 = f - f2;
                }else if(f4 - f1 >= 0){
                   p2 = (f1 + f2) - (float)p0;
                }
             }
          }
          return p2;
       }
    }
    public final void g(float p0){
       if (PatchProxy.isSupport(NewEditStickerBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NewEditStickerBaseDrawer.class, "35")) {
          return;
       }
       if (!this.mBaseDrawerData.H()) {
          return;
       }
       this.updateScaleWithLimit(Math.min(Math.max(p0, this.minScaleFactor()), this.maxScaleFactor()));
       return;
    }
    public final List getAttachIdentifierList(){
       Object obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.A0();
    }
    public final Rect getBaseDrawerContentRect(){
       Rect obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getContentRect();
       a.o(obj, "super.getContentRect\(\)");
       return obj;
    }
    public final DecorationContainerView getContainerView(){
       NewEditStickerBaseDrawer obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.containerView;
       if (obj == null) {
          a.S("containerView");
       }
       return obj;
    }
    public Rect getContainerViewRect(){
       NewEditStickerBaseDrawer obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.containerView;
       if (obj == null) {
          a.S("containerView");
       }
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2<com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData, com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer<out com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData>>");
       return new Rect(obj.getLeft(), obj.getTop(), obj.getRight(), obj.getBottom());
    }
    public Rect getContentRect(){
       Rect obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getContentRect();
       return new Rect(obj.left, (obj.top + this.getAdditionOffsetY()), obj.right, (obj.bottom + this.getAdditionOffsetY()));
    }
    public final int getEditStickerSubType(){
       Object obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBaseDrawerData.F0();
    }
    public final int getEditStickerType(){
       Object obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBaseDrawerData.E0();
    }
    public final NewStickerElementData getElementData(){
       BaseDrawer obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBaseDrawerData;
       a.o(obj, "mBaseDrawerData");
       return obj;
    }
    public String getElementOutputPath(){
       return "";
    }
    public String getElementPathIdentify(NewStickerElementData p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, NewEditStickerBaseDrawer.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "elementData");
       obj = "";
       List list = p0.A0();
       if (list != null && (list.isEmpty() ^ 0x01)) {
          obj = obj+list.get(0);
       }
       String str = a0.c(obj);
       a.o(str, "elementData.let {\n      бн5Hex\(sb.toString\(\)\)\n    }");
       return str;
    }
    public EditText getFocusEditText(){
       return null;
    }
    public List getIdentifyList(){
       List obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mBaseDrawerData.A0();
       if (obj == null) {
          ArrayList uArrayList = new ArrayList();
       }
       return obj;
    }
    public Rect getScaleContentRect(){
       Rect obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getScaleContentRect();
       return new Rect(obj.left, (obj.top + this.getAdditionOffsetY()), obj.right, (obj.bottom + this.getAdditionOffsetY()));
    }
    public final float getStickerContentHeight(){
       Object obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.f();
    }
    public final float getStickerContentWidth(){
       Object obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.i();
    }
    public final float getStickerOriginHeight(){
       Object obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.G0();
    }
    public final float getStickerOriginWidth(){
       Object obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.H0();
    }
    public Point getTipLocationBottomCenter(){
       Object[] objArray = null;
       BaseDrawer obj = PatchProxy.apply(objArray, this, NewEditStickerBaseDrawer.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mDecorationShowingView;
       if (obj == null) {
          return objArray;
       }
       int[] ointArray = new int[2];
       obj.getLocationOnScreen(ointArray);
       BaseDrawer tmDecoration = this.mDecorationShowingView;
       a.o(tmDecoration, "mDecorationShowingView");
       BaseDrawer tmDecoration1 = this.mDecorationShowingView;
       a.o(tmDecoration1, "mDecorationShowingView");
       float f = (float)2;
       tmDecoration = this.mDecorationShowingView;
       a.o(tmDecoration, "mDecorationShowingView");
       BaseDrawer tmDecoration2 = this.mDecorationShowingView;
       a.o(tmDecoration2, "mDecorationShowingView");
       return new Point((int)((float)ointArray[0] + (((float)tmDecoration.getWidth() * tmDecoration1.getScaleX()) / f)), (int)((((float)ointArray[1] + (((float)tmDecoration.getHeight() * tmDecoration2.getScaleY()) / f)) - (float)((this.getOutBoxRect().bottom - this.getOutBoxRect().top) / 2)) - (float)a.a));
    }
    public View getView(){
       return this.mDecorationShowingView;
    }
    public boolean isInWholeDecoration(float p0,float p1){
       if (PatchProxy.isSupport(NewEditStickerBaseDrawer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, NewEditStickerBaseDrawer.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (!this.isPointInTheRect(p0, p1, this.getOutBoxRect()) && (!this.isPointInTheRect(p0, p1, this.getRemoveButtonRect()) && (this.isPointInTheRect(p0, p1, this.getScaleOrRotateButtonRect()) || this.isPointInTheRect(p0, p1, this.getCustomButtonRect()))))? true: false;
       return b;
    }
    public final boolean isNeedGenerateBitmap(){
       return this.isNeedGenerateBitmap;
    }
    public final boolean isPicTemplateSticker(){
       Object obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.n0();
    }
    public boolean isSticker(){
       return true;
    }
    public float maxScaleFactor(){
       return 4.00f;
    }
    public float minScaleFactor(){
       return 0.30f;
    }
    public boolean needGenerateBitmap(NewStickerElementData p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewEditStickerBaseDrawer.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "elementData");
       int i = 1;
       if (this.mBaseDrawerData.H0() - p0.H0() || (this.mBaseDrawerData.G0() - p0.G0() || (this.mBaseDrawerData.i() - p0.i() || (this.mBaseDrawerData.f() - p0.f() || ((a.g(this.mBaseDrawerData.k(), p0.k()) ^ i) || (this.mBaseDrawerData.A() - p0.A() || (!this.mBaseDrawerData.d() - p0.d() && !this.mBaseDrawerData.z() - p0.z()))))))) {
          i = false;
       }
    label_009e :
       return i;
    }
    public void onTranslationFixed(){
       if (PatchProxy.applyVoid(null, this, NewEditStickerBaseDrawer.class, "36")) {
          return;
       }
       super.onTranslationFixed();
       NewEditStickerBaseDrawer tcontainerVi = this.containerView;
       if (tcontainerVi == null) {
          a.S("containerView");
       }
       Objects.requireNonNull(tcontainerVi, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2<com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData, com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer<out com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData>>");
       if (!PatchProxy.applyVoidOneRefs(this, tcontainerVi, DecorationContainerView.class, "11")) {
          k1.r(new c(tcontainerVi, this), 50);
       }
       return;
    }
    public void scaleAndRotateForSingleFinger(float p0,float p1){
       if (PatchProxy.isSupport(NewEditStickerBaseDrawer.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, NewEditStickerBaseDrawer.class, "33")) {
          return;
       }
       if (!this.mBaseDrawerData.I0() && !this.mBaseDrawerData.J0()) {
          super.scaleAndRotateForSingleFinger(p0, p1);
          return;
       }else {
          Rect scaleOutBoxR = this.getScaleOutBoxRect();
          this.g((PointF.length((p0 - (float)scaleOutBoxR.centerX()), (p1 - (float)scaleOutBoxR.centerY())) / PointF.length(((float)scaleOutBoxR.width() / 2.00f), ((float)scaleOutBoxR.height() / 2.00f))));
          return;
       }
    }
    public void scaleForDoubleFinger(float p0){
       if (PatchProxy.isSupport(NewEditStickerBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NewEditStickerBaseDrawer.class, "34")) {
          return;
       }
       if (!this.mBaseDrawerData.I0()) {
          super.scaleForDoubleFinger(p0);
          return;
       }else {
          this.g((this.mBaseDrawerData.A() * p0));
          return;
       }
    }
    public void select(){
       if (PatchProxy.applyVoid(null, this, NewEditStickerBaseDrawer.class, "1")) {
          return;
       }
       super.select();
       this.changeDrawerVisible(true);
       return;
    }
    public final void setContainerView(DecorationContainerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditStickerBaseDrawer.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.containerView = p0;
       return;
    }
    public final void setNeedGenerateBitmap(boolean p0){
       this.isNeedGenerateBitmap = p0;
    }
    public final void setStickerContentHeight(float p0){
       if (PatchProxy.isSupport(NewEditStickerBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NewEditStickerBaseDrawer.class, "11")) {
          return;
       }
       this.mBaseDrawerData.M(p0);
       return;
    }
    public final void setStickerContentWidth(float p0){
       if (PatchProxy.isSupport(NewEditStickerBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NewEditStickerBaseDrawer.class, "9")) {
          return;
       }
       this.mBaseDrawerData.P(p0);
       return;
    }
    public final void setStickerOriginHeight(float p0){
       if (PatchProxy.isSupport(NewEditStickerBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NewEditStickerBaseDrawer.class, "7")) {
          return;
       }
       this.mBaseDrawerData.P0(p0);
       return;
    }
    public final void setStickerOriginWidth(float p0){
       if (PatchProxy.isSupport(NewEditStickerBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NewEditStickerBaseDrawer.class, "5")) {
          return;
       }
       this.mBaseDrawerData.Q0(p0);
       return;
    }
    public final boolean stickerTextAvailable(){
       EditText obj = PatchProxy.apply(null, this, NewEditStickerBaseDrawer.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.getEditStickerType() == 3 || this.getEditStickerType() == 5) {
          if (this.getFocusEditText() != null) {
             obj = this.getFocusEditText();
             a.m(obj);
             if (!TextUtils.isEmpty(obj.getText())) {
             label_0045 :
                return b;
             }
          }
       }else if(!this.isPicTemplateSticker()){
          goto label_0045 ;
       }
       b = false;
       goto label_0045 ;
    }
    public void update(){
       if (PatchProxy.applyVoid(null, this, NewEditStickerBaseDrawer.class, "20")) {
          return;
       }
       try{
          super.update();
          BaseDrawer tmDecoration = this.mDecorationShowingView;
          if (tmDecoration != null) {
             tmDecoration.setTranslationY((tmDecoration.getTranslationY() + (float)this.getAdditionOffsetY()));
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.D().t("EditStickerBaseDrawer", "update error: "+e0.getMessage(), objArray);
       }
       return;
    }
    public final void updateEditRect(){
       if (PatchProxy.applyVoid(null, this, NewEditStickerBaseDrawer.class, "21")) {
          return;
       }
       try{
          super.update();
          BaseDrawer tmDecoration = this.mDecorationShowingView;
          if (tmDecoration != null) {
             tmDecoration.setTranslationY((tmDecoration.getTranslationY() + (float)this.getAdditionOffsetY()));
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          a.D().t("EditStickerBaseDrawer", "updateEditRect error: "+e0.getMessage(), objArray);
       }
       return;
    }
    public void updateElement(NewStickerElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditStickerBaseDrawer.class, "25")) {
          return;
       }
       a.p(p0, "elementData");
       this.isNeedGenerateBitmap = this.needGenerateBitmap(p0);
       this.mBaseDrawerData.R0(p0);
       this.update();
       NewEditStickerBaseDrawer tcontainerVi = this.containerView;
       if (tcontainerVi == null) {
          a.S("containerView");
       }
       tcontainerVi.U(this);
       return;
    }
    public void updateView(EditDecorationContainerViewV2 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewEditStickerBaseDrawer.class, "19")) {
          return;
       }
       a.p(p0, "decorationContainerView");
       this.mEditRect = p0.getEditorRect();
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(NewEditStickerBaseDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NewEditStickerBaseDrawer.class, "26")) {
          return;
       }
       a.p(p0, "dest");
       return;
    }
}
