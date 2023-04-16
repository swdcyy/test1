package com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditTagStickerElementData;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerLayout;
import qvc.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.RectF;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import android.graphics.Rect;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import stc.b;
import stc.b$a;
import lnc.a1;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import usd.q;
import java.util.Objects;
import android.graphics.Bitmap;
import itc.k3;
import java.lang.Integer;
import android.widget.EditText;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.widget.AbsoluteLayout;
import ekd.k1;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerEditText$a;
import android.content.Context;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditTagStickerElement$a;
import android.widget.AbsoluteLayout$LayoutParams;

public final class EditTagStickerElement extends EditStickerBaseDrawer	// class@001227
{
    public final String TAG;
    public int mContainerWidth;
    public boolean mForceReGenerateFile;
    public String mPreviousText;
    public EditTagStickerLayout mStickerView;

    public void EditTagStickerElement(){
       super(new EditTagStickerElementData(""), 0, 0, -1);
    }
    public void EditTagStickerElement(EditTagStickerElementData p0,double p1,double p2,int p3){
       int i = this;
       a.p(p0, "editTagStickerElementData");
       super(p0, 5, "TAG_STICKER", p1, p2, p3);
       i.TAG = "EditTagStickerElement";
       i.mPreviousText = "";
    }
    public static final EditTagStickerLayout access$getMStickerView$p(EditTagStickerElement p0){
       p0 = p0.mStickerView;
       if (p0 == null) {
          a.S("mStickerView");
       }
       return p0;
    }
    public final void addOnTextChangeWatcher(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTagStickerElement.class, "7")) {
          return;
       }
       a.p(p0, "watcher");
       EditTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.a(p0);
       return;
    }
    public final void calculateAndUpdateDimen(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerElement.class, "4")) {
          return;
       }
       EditTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       RectF contentRect = tmStickerVie.getContentRect();
       float f = contentRect.width();
       float f1 = contentRect.height();
       float f2 = (float)2;
       float f3 = ((((((this.mBaseDrawerData.A() * f) * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()) + (float)this.getWholeRect().width()) - (float)this.getContentRect().width()) - (float)this.getWholeRect().width()) / f2;
       float f4 = ((((((this.mBaseDrawerData.A() * f1) * this.mBaseDrawerData.m()) * this.mBaseDrawerData.d()) + (float)this.getWholeRect().height()) - (float)this.getContentRect().height()) - (float)this.getWholeRect().height()) / f2;
       f3 = this.computeShowingWidthFitLimit(f3, true);
       f4 = this.computeShowingHeightFitLimit(f4);
       int i = 0xbf800000;
       if (!f3 - i) {
          f = this.mBaseDrawerData.i();
          f3 = 0;
       }
       if (!f4 - i) {
          f1 = this.mBaseDrawerData.f();
          f4 = 0;
       }
       if (!PatchProxy.isSupport(EditTagStickerElement.class) || !PatchProxy.applyVoidFourRefs(Float.valueOf(f), Float.valueOf(f1), Float.valueOf(f3), Float.valueOf(f4), this, EditTagStickerElement.class, "5")) {
          this.mBaseDrawerData.M(f1);
          this.mBaseDrawerData.P(f);
          BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
          tmBaseDrawer.Y((tmBaseDrawer.w() + (f3 / (float)this.mEditRect.width())));
          BaseDrawer tmBaseDrawer1 = this.mBaseDrawerData;
          tmBaseDrawer1.Z((tmBaseDrawer1.x() + (f4 / (float)this.mEditRect.height())));
          this.mBaseDrawerData.C0(f1);
          this.mBaseDrawerData.D0(f);
          tmBaseDrawer1 = this.mDecorationShowingView;
          if (tmBaseDrawer1 != null) {
             ViewGroup$LayoutParams layoutParams = tmBaseDrawer1.getLayoutParams();
             layoutParams.width = (int)f;
             layoutParams.height = (int)f1;
             tmBaseDrawer1.setLayoutParams(layoutParams);
             this.update();
          }
       }
       return;
    }
    public boolean canRestore(EditStickerBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditTagStickerElement.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "restoredDrawer");
       if (!super.canRestore(p0)) {
          return false;
       }
       if (!p0 instanceof EditTagStickerElement) {
          return false;
       }
       if (a.g(this.getContent(), p0.getContent()) ^ 1) {
          return false;
       }
       return 1;
    }
    public int describeContents(){
       return 0;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerElement.class, "9")) {
          return;
       }
       Rect rect = b.e.e();
       float f = (((float)(this.mContainerWidth - (a1.e(18.00f) * 2)) / this.mBaseDrawerData.A()) - (float)rect.left) - (float)rect.right;
       float f1 = ((((float)this.mContainerWidth - (this.mBaseDrawerData.o().left + this.mBaseDrawerData.o().right)) / this.mBaseDrawerData.A()) - (float)rect.left) - (float)rect.right;
       Object[] objArray = new Object[0];
       a.D().w(this.TAG, "updateMaxWidth, mContainerWidth = "+this.mContainerWidth+", scale = "+this.mBaseDrawerData.A()+", newMaxWidth = "+f+", newDrawMaxWidth = "+f1, objArray);
       this.mBaseDrawerData.K = q.t(f, f1);
       return;
    }
    public void generateDecorationBitmap(float p0,float p1,boolean p2){
       BaseDrawer tmDecoration;
       Bitmap uBitmap;
       if (PatchProxy.isSupport(EditTagStickerElement.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, EditTagStickerElement.class, "14")) {
          return;
       }
       String str = "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerLayout";
       if (p2) {
          tmDecoration = this.mDecorationShowingView;
          Objects.requireNonNull(tmDecoration, str);
          uBitmap = k3.c(tmDecoration, this.mBaseDrawerData.d());
       }else {
          tmDecoration = this.mDecorationShowingView;
          Objects.requireNonNull(tmDecoration, str);
          uBitmap = k3.c(tmDecoration, this.mBaseDrawerData.d());
       }
       this.mDecorationBitmap = uBitmap;
       a uoa = a.D();
       EditTagStickerElement tTAG = this.TAG;
       StringBuilder str1 = "generateDecorationBitmap, bitmapWidth = ";
       BaseDrawer tmDecoration1 = this.mDecorationBitmap;
       Integer integer = (tmDecoration1 != null)? Integer.valueOf(tmDecoration1.getWidth()): null;
       Object[] objArray = new Object[0];
       uoa.w(tTAG, str1+integer, objArray);
       return;
    }
    public final String getContent(){
       Object obj = PatchProxy.apply(null, this, EditTagStickerElement.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.E0();
    }
    public final EditText getEditText(){
       EditTagStickerElement obj = PatchProxy.apply(null, this, EditTagStickerElement.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mStickerView;
       if (obj == null) {
          a.S("mStickerView");
       }
       return obj.getMEditText();
    }
    public final void getGlobalVisibleRect(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTagStickerElement.class, "22")) {
          return;
       }
       a.p(p0, "rect");
       EditTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.getGlobalVisibleRect(p0);
       return;
    }
    public final boolean getMForceReGenerateFile(){
       return this.mForceReGenerateFile;
    }
    public Rect getOutBoxRect(){
       Rect obj = PatchProxy.apply(null, this, EditTagStickerElement.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getContentRect();
       a.o(obj, "contentRect");
       return obj;
    }
    public Rect getWholeRect(){
       Object obj = PatchProxy.apply(null, this, EditTagStickerElement.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getOutBoxRect();
    }
    public View initView(DecorationContainerView p0){
       EditTagStickerLayout obj = PatchProxy.applyOneRefs(p0, this, EditTagStickerElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "decorationContainerView");
       this.mContainerWidth = p0.getWidth();
       this.mBaseDrawerData.F0(p0.getWidth(), p0.getHeight());
       this.g();
       EditTagStickerEditText.l.a(k1.i());
       Context context = p0.getContext();
       a.o(context, "decorationContainerView.getContext\(\)");
       Context context1 = p0.getContext();
       a.o(context1, "decorationContainerView.getContext\(\)");
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       a.o(tmBaseDrawer, "mBaseDrawerData");
       obj = new EditTagStickerLayout(context, new EditTagStickerEditText(context1, tmBaseDrawer));
       this.mStickerView = obj;
       obj.setAcceptTouchEvent(false);
       EditTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.a(new EditTagStickerElement$a(this, p0));
       tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       int i = (int)tmStickerVie.getContentRect().width();
       EditTagStickerElement tmStickerVie1 = this.mStickerView;
       if (tmStickerVie1 == null) {
          a.S("mStickerView");
       }
       AbsoluteLayout$LayoutParams layoutParams = new AbsoluteLayout$LayoutParams(i, (int)tmStickerVie1.getContentRect().height(), false, false);
       tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.setLayoutParams(layoutParams);
       BaseDrawer tmBaseDrawer1 = this.mBaseDrawerData;
       tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmBaseDrawer1.P(tmStickerVie.getContentRect().width());
       tmBaseDrawer1 = this.mBaseDrawerData;
       tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmBaseDrawer1.M(tmStickerVie.getContentRect().height());
       tmBaseDrawer1 = this.mBaseDrawerData;
       tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmBaseDrawer1.D0(tmStickerVie.getContentRect().width());
       tmBaseDrawer1 = this.mBaseDrawerData;
       tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmBaseDrawer1.C0(tmStickerVie.getContentRect().height());
       this.mIsNeedReGenerateFile = true;
       this.mPreviousText = this.mBaseDrawerData.E0();
       EditTagStickerElement tmStickerVie2 = this.mStickerView;
       if (tmStickerVie2 == null) {
          a.S("mStickerView");
       }
       return tmStickerVie2;
    }
    public boolean interceptTouchEvent(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       EditTagStickerElement obj = PatchProxy.apply(objArray, this, EditTagStickerElement.class, "18");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.mStickerView;
       if (obj == null) {
          a.S("mStickerView");
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, EditTagStickerLayout.class, "9");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.d.isEnabled();
       return b;
    }
    public void onDoubleFingerScaleAndRotateEnd(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerElement.class, "10")) {
          return;
       }
       super.onDoubleFingerScaleAndRotateEnd();
       this.g();
       return;
    }
    public void onSingleFingerScaleAndRotateEnd(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerElement.class, "11")) {
          return;
       }
       super.onSingleFingerScaleAndRotateEnd();
       this.g();
       return;
    }
    public final void removeOnTextChangeWatcher(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTagStickerElement.class, "8")) {
          return;
       }
       a.p(p0, "watcher");
       EditTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.c(p0);
       return;
    }
    public final void resetToCenter(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerElement.class, "24")) {
          return;
       }
       this.mBaseDrawerData.Y(0x3f000000);
       this.mBaseDrawerData.Z(0x3f000000);
       this.mBaseDrawerData.b0(0x3f800000);
       return;
    }
    public void select(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerElement.class, "17")) {
          return;
       }
       super.select();
       this.mPreviousText = this.mBaseDrawerData.E0();
       return;
    }
    public void sendCancelEvent(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerElement.class, "20")) {
          return;
       }
       EditTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.d();
       return;
    }
    public void setAcceptTouchEvent(boolean p0){
       if (PatchProxy.isSupport(EditTagStickerElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditTagStickerElement.class, "19")) {
          return;
       }
       EditTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.setAcceptTouchEvent(p0);
       return;
    }
    public final void setMForceReGenerateFile(boolean p0){
       this.mForceReGenerateFile = p0;
    }
    public void unSelect(){
       if (PatchProxy.applyVoid(null, this, EditTagStickerElement.class, "16")) {
          return;
       }
       super.unSelect();
       int i = 1;
       if (!(a.g(this.mPreviousText, this.mBaseDrawerData.E0()) ^ i) && this.mForceReGenerateFile == null) {
          i = false;
       }
       this.mIsNeedReGenerateFile = i;
       this.mForceReGenerateFile = false;
       this.mPreviousText = this.mBaseDrawerData.E0();
       if (this.isAdded()) {
          EditTagStickerElement tmStickerVie = this.mStickerView;
          if (tmStickerVie == null) {
             a.S("mStickerView");
          }
          tmStickerVie.e();
       }
       return;
    }
    public final void updateContentDimension(float p0,float p1){
       if (PatchProxy.isSupport(EditTagStickerElement.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, EditTagStickerElement.class, "6")) {
          return;
       }
       this.mBaseDrawerData.M(p1);
       this.mBaseDrawerData.P(p0);
       this.mBaseDrawerData.C0(p1);
       this.mBaseDrawerData.D0(p0);
       return;
    }
    public final void updateLimit(int p0,int p1){
       if (PatchProxy.isSupport(EditTagStickerElement.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, EditTagStickerElement.class, "23")) {
          return;
       }
       this.mBaseDrawerData.F0(p0, p1);
       return;
    }
    public final void updateText(String p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTagStickerElement.class, str)) {
          return;
       }
       String str1 = "newText";
       a.p(p0, str1);
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       Objects.requireNonNull(tmBaseDrawer);
       if (!PatchProxy.applyVoidOneRefs(p0, tmBaseDrawer, EditTagStickerElementData.class, str)) {
          a.p(p0, str1);
          tmBaseDrawer.L = p0;
       }
       EditTagStickerElement tmStickerVie = this.mStickerView;
       if (tmStickerVie == null) {
          a.S("mStickerView");
       }
       tmStickerVie.f(p0);
       return;
    }
}
