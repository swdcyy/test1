package com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import java.lang.String;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import faa.a;
import q87.c;
import android.graphics.Rect;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import wba.h0;
import java.lang.Float;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import w46.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import android.view.View;
import android.graphics.Bitmap;
import zv9.a;
import java.lang.Number;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.kwai.video.minecraft.model.nano.Minecraft$AssetTransform;
import android.os.Parcel;

public abstract class EditStickerBaseDrawer extends EditDecorationBaseDrawer	// class@001224
{
    public static final float DEFAULT_STICKER_SIZE;

    static {
       EditStickerBaseDrawer.DEFAULT_STICKER_SIZE = (float)a1.e(0x42f00000);
    }
    public void EditStickerBaseDrawer(EditStickerBaseDrawerData p0){
       super(p0);
    }
    public void EditStickerBaseDrawer(EditStickerBaseDrawerData p0,int p1,String p2,double p3,double p4,int p5){
       BaseDrawer uBaseDrawer = this;
       super(p0, p2, p3, p4, p5);
       uBaseDrawer.mBaseDrawerData.B0(p1);
       uBaseDrawer.mBaseDrawerData.T(0);
       float dEFAULT_STIC = EditStickerBaseDrawer.DEFAULT_STICKER_SIZE;
       uBaseDrawer.mBaseDrawerData.P(dEFAULT_STIC);
       uBaseDrawer.mBaseDrawerData.M(dEFAULT_STIC);
    }
    public static boolean isCommonInteractiveSticker(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditStickerBaseDrawer.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (!p0.getDecorationType() && p0.mBaseDrawerData.y0() == 6))? true: false;
       return b;
    }
    public static boolean isInteractiveSticker(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditStickerBaseDrawer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (EditStickerBaseDrawer.isCommonInteractiveSticker(p0) || EditStickerBaseDrawer.isVoteSticker(p0))? true: false;
       return b;
    }
    public static boolean isTagSticker(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditStickerBaseDrawer.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (!p0.getDecorationType() && p0.mBaseDrawerData.y0() == 5))? true: false;
       return b;
    }
    public static boolean isVoteSticker(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EditStickerBaseDrawer.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (!p0.getDecorationType() && p0.mBaseDrawerData.y0() == 3))? true: false;
       return b;
    }
    public boolean canReplace(StickerDetailInfo p0){
       return false;
    }
    public boolean canRestore(EditStickerBaseDrawer p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, EditStickerBaseDrawer.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (p0.mBaseDrawerData.y0() != this.mBaseDrawerData.y0()) {
          obj = new Object[i];
          a.D().w("EditStickerBaseDrawer", "canRestore mEditStickerType not the same", obj);
          return i;
       }else {
          obj = new Object[i];
          a.D().w("EditStickerBaseDrawer", "canRestore mEditStickerType the same", obj);
          return true;
       }
    }
    public int describeContents(){
       return 0;
    }
    public h0 generateAnimatedSubAssetCommonData(Rect p0,Size p1,float p2,boolean p3){
       Size obj;
       double d;
       double d1;
       double normalizedSc;
       float f1;
       BaseDrawer uBaseDrawer = this;
       Size size = p1;
       if (PatchProxy.isSupport(EditStickerBaseDrawer.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Boolean.valueOf(p3), this, EditStickerBaseDrawer.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = size.b;
       Size c = size.c;
       BaseDrawer uBaseDrawer1 = null;
       float f = 0x3f800000;
       if (uBaseDrawer.mBaseDrawerData.A0() - uBaseDrawer1 > 0 && uBaseDrawer.mBaseDrawerData.z0() - uBaseDrawer1 > 0) {
          if (p3) {
             d = (double)f;
             d1 = (double)((uBaseDrawer.mBaseDrawerData.i() * f) / uBaseDrawer.mBaseDrawerData.A0());
             normalizedSc = this.getNormalizedScale();
          }else {
             d = (double)f;
             d1 = (double)(((((float)obj * f) / uBaseDrawer.mBaseDrawerData.A0()) * f) * (uBaseDrawer.mBaseDrawerData.i() / (float)p0.width()));
             normalizedSc = this.getNormalizedScale();
          }
          f1 = (float)(d * (d1 * normalizedSc));
       }else {
          Object[] objArray1 = new Object[0];
          a.D().t("EditStickerBaseDrawer", "generateAnimatedSubAssetCommonData error sticker origin width or height can not small than 0", objArray1);
          f1 = 0x3f800000;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditStickerBaseDrawer", "generateAnimatedSubAssetCommonData assetTransformScale:"+f1+",videoHeight:"+c+",videoWidth:"+obj+",editRect:"+p0, objArray);
       h0 oh0 = new h0((float)this.getNormalizedX(), (float)this.getNormalizedY(), f1, (float)this.getNormalizedRotate(), StickerTextValueType.AnimatedSubAsset, p2, uBaseDrawer.mBaseDrawerData.d(), this.getDecorationId());
       return obj;
    }
    public void generateDecorationBitmap(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(EditStickerBaseDrawer.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, EditStickerBaseDrawer.class, "7")) {
          return;
       }
       this.mDecorationBitmap = (p2)? a.a(this.mDecorationShowingView, p1): a.a(this.mDecorationShowingView, 0x3f800000);
       return;
    }
    public int getEditStickerType(){
       Object obj = PatchProxy.apply(null, this, EditStickerBaseDrawer.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBaseDrawerData.y0();
    }
    public EditStickerBaseDrawerData getStickerBaseElementData(){
       EditStickerBaseDrawerData obj = PatchProxy.apply(null, this, EditStickerBaseDrawer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new EditStickerBaseDrawerData();
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       if (tmBaseDrawer instanceof EditStickerBaseDrawerData) {
          obj.a(tmBaseDrawer);
       }
       return obj;
    }
    public float getStickerOriginHeight(){
       Object obj = PatchProxy.apply(null, this, EditStickerBaseDrawer.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.z0();
    }
    public float getStickerOriginWidth(){
       Object obj = PatchProxy.apply(null, this, EditStickerBaseDrawer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.A0();
    }
    public boolean isInWholeDecoration(float p0,float p1){
       if (PatchProxy.isSupport(EditStickerBaseDrawer.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, EditStickerBaseDrawer.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (!this.isPointInTheRect(p0, p1, this.getOutBoxRect()) && (this.isPointInTheRect(p0, p1, this.getRemoveButtonRect()) || this.isPointInTheRect(p0, p1, this.getScaleOrRotateButtonRect())))? true: false;
       return b;
    }
    public void replace(DecorationContainerView p0,StickerDetailInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditStickerBaseDrawer.class, "6")) {
          return;
       }
       this.mEditRect = p0.getEditorRect();
       return;
    }
    public void replaceToSameSize(EditStickerBaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditStickerBaseDrawer.class, "14")) {
          return;
       }
       this.mBaseDrawerData.b0(((p0.mBaseDrawerData.A() * p0.mBaseDrawerData.i()) / p0.mBaseDrawerData.f()));
       return;
    }
    public void restoreTransformWithAssetTransform(Minecraft$AssetTransform p0,Rect p1,Size p2,float p3,boolean p4){
       if (PatchProxy.isSupport(EditStickerBaseDrawer.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, EditStickerBaseDrawer.class, "2")) {
             return;
          }
       }
       this.mBaseDrawerData.Y(((float)p0.positionX() / 100.00f));
       this.mBaseDrawerData.Z(((float)p0.positionY() / 100.00f));
       this.mBaseDrawerData.a0(((float)p0.rotate() - this.mBaseDrawerData.q()));
       Size b = p2.b;
       p2 = p2.c;
       int i = 0;
       if (this.mBaseDrawerData.A0() - i > 0 && this.mBaseDrawerData.z0() - i > 0) {
          double d = 100.00f;
          float f = 0x3f800000;
          if (p4) {
             this.mBaseDrawerData.b0((float)(((p0.scaleX() / d) * (double)((this.mBaseDrawerData.A0() * f) / this.mBaseDrawerData.i())) / (double)p3));
          }else {
             this.mBaseDrawerData.b0((((float)(((p0.scaleX() / d) * (double)(((this.mBaseDrawerData.A0() * f) / (float)b) * f)) * (double)p1.width()) / this.mBaseDrawerData.i()) / p3));
          }
       }else {
          Object[] objArray2 = new Object[0];
          a.D().t("EditStickerBaseDrawer", "restoreTransformWithAssetTransform error sticker origin width can not small than 0", objArray2);
       }
       Object[] objArray1 = new Object[0];
       a.D().w("EditStickerBaseDrawer", "restoreTransformWithAssetTransform assetTransform:"+p0+",videoWidth:"+b+"videoHeight:"+p2+",editRect:"+p1, objArray1);
       return;
    }
    public void select(){
       if (PatchProxy.applyVoid(null, this, EditStickerBaseDrawer.class, "1")) {
          return;
       }
       super.select();
       this.changeDrawerVisible(true);
       return;
    }
    public void setStickerOriginHeight(float p0){
       if (PatchProxy.isSupport(EditStickerBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, EditStickerBaseDrawer.class, "11")) {
          return;
       }
       this.mBaseDrawerData.C0(p0);
       return;
    }
    public void setStickerOriginWidth(float p0){
       if (PatchProxy.isSupport(EditStickerBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, EditStickerBaseDrawer.class, "9")) {
          return;
       }
       this.mBaseDrawerData.D0(p0);
       return;
    }
    public void updateWithEditStickerBaseDrawData(EditStickerBaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditStickerBaseDrawer.class, "3")) {
          return;
       }
       this.mBaseDrawerData.Y(p0.w());
       this.mBaseDrawerData.Z(p0.x());
       this.mBaseDrawerData.b0(p0.A());
       this.mBaseDrawerData.a0(p0.z());
       this.mBaseDrawerData.U(p0.m());
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
    }
}
