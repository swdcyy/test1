package com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import ptc.a;
import java.lang.String;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileRenderViewDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditOriginFileImageViewDrawer;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Float;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;

public abstract class EditOriginFileDrawer extends EditStickerBaseDrawer	// class@001221
{
    public a mRenderViewDrawerDataProvider;

    public void EditOriginFileDrawer(){
       super(new EditStickerBaseDrawerData());
    }
    public void EditOriginFileDrawer(double p0,double p1,int p2,a p3,float p4,float p5,float p6){
       BaseDrawer uBaseDrawer = this;
       super(new EditStickerBaseDrawerData(), p3.getEditStickerType(), p3.getDecorationName(), p0, p1, p2);
       float f = p6 / 2.00f;
       uBaseDrawer.mBaseDrawerData.P(f);
       uBaseDrawer.mBaseDrawerData.M(f);
       this.constructionInit(p3, p4, p5);
    }
    public static EditOriginFileDrawer createOriginFileDrawer(boolean p0){
       if (PatchProxy.isSupport(EditOriginFileDrawer.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, EditOriginFileDrawer.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          return new EditOriginFileRenderViewDrawer();
       }else {
          return new EditOriginFileImageViewDrawer();
       }
    }
    public static EditOriginFileDrawer createOriginFileDrawer(boolean p0,double p1,double p2,int p3,a p4,float p5,float p6,float p7){
       Object obj;
       if (PatchProxy.isSupport(EditOriginFileDrawer.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Double.valueOf(p1),Double.valueOf(p2),Integer.valueOf(p3),p4,Float.valueOf(p5),Float.valueOf(p6),Float.valueOf(p7)};
          obj = PatchProxy.apply(objArray, null, EditOriginFileDrawer.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0) {
          EditOriginFileRenderViewDrawer uEditOriginF = new EditOriginFileRenderViewDrawer(p1, p2, p3, p4, p5, p6, p7);
          return obj;
       }else {
          EditOriginFileImageViewDrawer uEditOriginF1 = new EditOriginFileImageViewDrawer(p1, p2, p3, p4, p5, p6, p7);
          return obj;
       }
    }
    public static boolean isEditOriginFileDrawer(EditStickerBaseDrawer p0){
       return p0 instanceof EditOriginFileDrawer;
    }
    public void add(DecorationContainerView p0,boolean p1){
       if (PatchProxy.isSupport(EditOriginFileDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, EditOriginFileDrawer.class, "9")) {
          return;
       }
       super.add(p0, p1);
       this.mIsNeedReGenerateFile = false;
       return;
    }
    public boolean canReplace(StickerDetailInfo p0){
       p0 = p0.mStickerType;
       boolean b = (p0 == null || p0 == 2)? true: false;
       return b;
    }
    public boolean canRestore(EditStickerBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditOriginFileDrawer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (super.canRestore(p0) && (p0.getDecorationFilePath()).equals(this.getDecorationFilePath())) {
          return true;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditOriginFileDrawer", "canRestore mDecorationFilePat not the same", objArray);
       return 0;
    }
    public void constructionInit(a p0,float p1,float p2){
       if (PatchProxy.isSupport(EditOriginFileDrawer.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Float.valueOf(p2), this, EditOriginFileDrawer.class, "1")) {
          return;
       }
       this.mRenderViewDrawerDataProvider = p0;
       this.mBaseDrawerData.R(p0.getOutputFilePath());
       this.mBaseDrawerData.D0(p1);
       this.mBaseDrawerData.C0(p2);
       return;
    }
    public void generateDecorationBitmap(DecorationContainerView p0,VideoSDKPlayerView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditOriginFileDrawer.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditOriginFileDrawer", "generateDecorationBitmap do not need to generate decoration bitmap origin file exist", objArray);
       return;
    }
    public String generateDecorationOutputFilePath(){
       Object obj = PatchProxy.apply(null, this, EditOriginFileDrawer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.k();
    }
    public void generateFile(String p0,int p1){
       if (PatchProxy.isSupport(EditOriginFileDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, EditOriginFileDrawer.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditOriginFileDrawer", "generateFile do not need to generate file origin file exist", objArray);
       return;
    }
    public File getOutputFileDir(){
       Object obj = PatchProxy.apply(null, this, EditOriginFileDrawer.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.mBaseDrawerData.k()).getParentFile();
    }
    public void insert(EditDecorationContainerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditOriginFileDrawer.class, "10")) {
          return;
       }
       super.insert(p0);
       this.mIsNeedReGenerateFile = false;
       return;
    }
    public boolean isGenerateFileNeedScaleToVideo(){
       return true;
    }
    public void onDoubleFingerScaleAndRotateStart(){
       if (PatchProxy.applyVoid(null, this, EditOriginFileDrawer.class, "12")) {
          return;
       }
       super.onDoubleFingerScaleAndRotateStart();
       this.mIsNeedReGenerateFile = false;
       return;
    }
    public void onSingleFingerScaleAndRotateStart(float p0,float p1){
       if (PatchProxy.isSupport(EditOriginFileDrawer.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, EditOriginFileDrawer.class, "11")) {
          return;
       }
       super.onSingleFingerScaleAndRotateStart(p0, p1);
       this.mIsNeedReGenerateFile = false;
       return;
    }
    public void replace(DecorationContainerView p0,a p1,StickerDetailInfo p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, EditOriginFileDrawer.class, "4")) {
          return;
       }
       boolean b = (p1.getEditStickerType() == 4)? true: false;
       this.constructionInit(p1, (float)p2.getResourceWidth(b), (float)p2.getResourceHeight(b));
       this.mBaseDrawerData.B0(p1.getEditStickerType());
       this.mBaseDrawerData.S(p1.getDecorationName());
       return;
    }
    public void restore(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditOriginFileDrawer.class, "3")) {
          return;
       }
       super.restore(p0);
       if (p0 instanceof EditOriginFileDrawer) {
          this.mRenderViewDrawerDataProvider = p0.mRenderViewDrawerDataProvider.clone();
       }
       return;
    }
}
