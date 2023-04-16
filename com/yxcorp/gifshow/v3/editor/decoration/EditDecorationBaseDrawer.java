package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.String;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Rect;
import android.widget.EditText;
import java.util.List;
import java.util.ArrayList;
import android.graphics.Point;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.ViewParent;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;
import java.lang.Double;

public abstract class EditDecorationBaseDrawer extends DecorationDrawer	// class@000ef4
{
    public boolean mGuideLineEnabled;
    public int[] mTextStickerAirWallLimits;
    public static final int[] TEXT_STICKER_LIMIT_LARGE;
    public static final int[] TEXT_STICKER_LIMIT_NONE;
    public static final int[] TEXT_STICKER_LIMIT_SMALL;

    static {
       EditDecorationBaseDrawer.TEXT_STICKER_LIMIT_NONE = new int[4]{0,0,0,0};
       int[] ointArray = new int[]{a1.e(28.00f),a1.e(0x42f80000),a1.e(63.00f),a1.e(218.00f)};
       EditDecorationBaseDrawer.TEXT_STICKER_LIMIT_SMALL = ointArray;
       int[] ointArray1 = new int[]{a1.e(50.00f),a1.e(0x42f80000),a1.e(84.00f),a1.e(218.00f)};
       EditDecorationBaseDrawer.TEXT_STICKER_LIMIT_LARGE = ointArray1;
    }
    public void EditDecorationBaseDrawer(EditBaseDrawerData p0){
       super(p0);
       this.mTextStickerAirWallLimits = EditDecorationBaseDrawer.TEXT_STICKER_LIMIT_NONE;
       this.mGuideLineEnabled = true;
    }
    public void EditDecorationBaseDrawer(EditBaseDrawerData p0,String p1,double p2,double p3,int p4){
       super(p0);
       this.mTextStickerAirWallLimits = EditDecorationBaseDrawer.TEXT_STICKER_LIMIT_NONE;
       this.mGuideLineEnabled = true;
       this.mBaseDrawerData.S(p1);
       this.mBaseDrawerData.v0(p4);
       this.mBaseDrawerData.x0(p2);
       this.mBaseDrawerData.q0(p3);
    }
    public void clearFocusEditText(){
    }
    public void generateDecorationBitmap(){
    }
    public int getAdditionOffsetY(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBaseDrawerData.B;
    }
    public int[] getAirWallLimits(){
       return this.mTextStickerAirWallLimits;
    }
    public int getAirWallType(){
       BaseDrawer obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mBaseDrawerData;
       if (obj instanceof EditBaseDrawerData) {
          return obj.f0();
       }
       return 0;
    }
    public float getAssetProportion(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.mBaseDrawerData.h0();
    }
    public Rect getContainerViewRect(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Rect();
    }
    public int getContentLeftRightDistanceWithOutBox(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBaseDrawerData.g();
    }
    public int getContentTopBottomDistanceWithOutBox(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBaseDrawerData.h();
    }
    public String getDecorationId(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.i0();
    }
    public double getDuration(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.mBaseDrawerData.j0();
    }
    public EditText getFocusEditText(){
       return null;
    }
    public List getIdentifyList(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ArrayList();
    }
    public int getLayerIndex(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mBaseDrawerData.l0();
    }
    public Rect getOutBoxRect(){
       Rect obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getOutBoxRect();
       obj.set(obj.left, obj.top, (obj.right + this.mBaseDrawerData.A), obj.bottom);
       return obj;
    }
    public String getOutputFilePath(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.k();
    }
    public double getStartTime(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.mBaseDrawerData.m0();
    }
    public int[] getTextStickerAirWallLimits(){
       return this.mTextStickerAirWallLimits;
    }
    public Point getTipLocationBottomCenter(){
       return null;
    }
    public View getView(){
       return null;
    }
    public void insert(EditDecorationContainerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationBaseDrawer.class, "1")) {
          return;
       }
       this.mIsNeedReGenerateFile = true;
       p0.removeView(this.mDecorationShowingView);
       View view = this.initView(p0);
       this.mDecorationShowingView = view;
       p0.addView(view);
       this.mBaseDrawerData.X((p0.getScaleX() * p0.getParent().getScaleX()));
       return;
    }
    public boolean interceptTouchEvent(){
       return false;
    }
    public boolean isFromPicTemplate(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.n0();
    }
    public boolean isInitFromDraft(){
       Object obj = PatchProxy.apply(null, this, EditDecorationBaseDrawer.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mBaseDrawerData.k0();
    }
    public boolean isInteractSticker(){
       return false;
    }
    public boolean isNewText(){
       return false;
    }
    public boolean isNewTextType(){
       return false;
    }
    public boolean isNewVoteSticker(){
       return false;
    }
    public boolean isSticker(){
       return false;
    }
    public boolean isSubtitle(){
       return false;
    }
    public boolean needDeleteOldDecorationFile(){
       return false;
    }
    public void select(){
       if (PatchProxy.applyVoid(null, this, EditDecorationBaseDrawer.class, "6")) {
          return;
       }
       this.mBaseDrawerData.L(0x3f800000);
       super.select();
       return;
    }
    public void sendCancelEvent(){
    }
    public void setAcceptTouchEvent(boolean p0){
    }
    public void setAdditionOffsetY(int p0){
       if (PatchProxy.isSupport(EditDecorationBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditDecorationBaseDrawer.class, "17")) {
          return;
       }
       this.mBaseDrawerData.B = p0;
       return;
    }
    public void setAssetProportion(float p0){
       if (PatchProxy.isSupport(EditDecorationBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, EditDecorationBaseDrawer.class, "19")) {
          return;
       }
       this.mBaseDrawerData.o0(p0);
       return;
    }
    public void setDecorationId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationBaseDrawer.class, "11")) {
          return;
       }
       this.mBaseDrawerData.p0(p0);
       return;
    }
    public void setDuration(double p0){
       if (PatchProxy.isSupport(EditDecorationBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, EditDecorationBaseDrawer.class, "13")) {
          return;
       }
       this.mBaseDrawerData.q0(p0);
       return;
    }
    public void setFromPicTemplate(boolean p0){
       if (PatchProxy.isSupport(EditDecorationBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditDecorationBaseDrawer.class, "23")) {
          return;
       }
       this.mBaseDrawerData.t0(p0);
       return;
    }
    public void setInitFromDraft(boolean p0){
       if (PatchProxy.isSupport(EditDecorationBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditDecorationBaseDrawer.class, "21")) {
          return;
       }
       this.mBaseDrawerData.u0(p0);
       return;
    }
    public void setLayerIndex(int p0){
       if (PatchProxy.isSupport(EditDecorationBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditDecorationBaseDrawer.class, "14")) {
          return;
       }
       this.mBaseDrawerData.v0(p0);
       return;
    }
    public void setMoveX(float p0){
       if (PatchProxy.isSupport(EditDecorationBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, EditDecorationBaseDrawer.class, "27")) {
          return;
       }
       this.mBaseDrawerData.Y(p0);
       return;
    }
    public void setMoveY(float p0){
       if (PatchProxy.isSupport(EditDecorationBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, EditDecorationBaseDrawer.class, "26")) {
          return;
       }
       this.mBaseDrawerData.Z(p0);
       return;
    }
    public void setOutBoxAdditionalWidth(int p0){
       if (PatchProxy.isSupport(EditDecorationBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditDecorationBaseDrawer.class, "3")) {
          return;
       }
       this.mBaseDrawerData.A = p0;
       return;
    }
    public void setStartTime(double p0){
       if (PatchProxy.isSupport(EditDecorationBaseDrawer.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, EditDecorationBaseDrawer.class, "12")) {
          return;
       }
       this.mBaseDrawerData.x0(p0);
       return;
    }
    public void updateAirWallLimits(int[] p0){
       if (p0 != null && p0.length == 4) {
          this.mTextStickerAirWallLimits = p0;
       }
       return;
    }
}
