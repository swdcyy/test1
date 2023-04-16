package com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewOriginFileDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import faa.a;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Integer;
import java.io.File;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Float;

public abstract class NewOriginFileDrawer extends NewEditStickerBaseDrawer	// class@000a68
{

    public void NewOriginFileDrawer(NewStickerElementData p0){
       a.p(p0, "elementData");
       super(p0);
    }
    public void add(DecorationContainerView p0,boolean p1){
       if (PatchProxy.isSupport(NewOriginFileDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, NewOriginFileDrawer.class, "5")) {
          return;
       }
       a.p(p0, "decorationContainerView");
       super.add(p0, p1);
       this.mIsNeedReGenerateFile = false;
       return;
    }
    public void generateDecorationBitmap(DecorationContainerView p0,VideoSDKPlayerView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NewOriginFileDrawer.class, "1")) {
          return;
       }
       a.p(p0, "decorationContainerView");
       a.p(p1, "playerView");
       Object[] objArray = new Object[0];
       a.D().w("EditOriginFileDrawer", "generateDecorationBitmap do not need to generate decoration bitmap origin file exist", objArray);
       return;
    }
    public String generateDecorationOutputFilePath(){
       Object obj = PatchProxy.apply(null, this, NewOriginFileDrawer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.k();
    }
    public void generateFile(String p0,int p1){
       if (PatchProxy.isSupport(NewOriginFileDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NewOriginFileDrawer.class, "2")) {
          return;
       }
       a.p(p0, "path");
       Object[] objArray = new Object[0];
       a.D().w("EditOriginFileDrawer", "generateFile do not need to generate file origin file exist", objArray);
       return;
    }
    public File getOutputFileDir(){
       File obj = PatchProxy.apply(null, this, NewOriginFileDrawer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(this.mBaseDrawerData.k()).getParentFile();
       a.o(obj, "File\(mBaseDrawerData.dec¡­ationFilePath\).parentFile");
       return obj;
    }
    public void insert(EditDecorationContainerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewOriginFileDrawer.class, "6")) {
          return;
       }
       a.p(p0, "decorationContainerView");
       super.insert(p0);
       this.mIsNeedReGenerateFile = false;
       return;
    }
    public boolean isGenerateFileNeedScaleToVideo(){
       return true;
    }
    public boolean limitDrawerAreaLeftRight(float p0){
       return true;
    }
    public boolean limitDrawerAreaTopBottom(float p0){
       return true;
    }
    public void onDoubleFingerScaleAndRotateStart(){
       if (PatchProxy.applyVoid(null, this, NewOriginFileDrawer.class, "8")) {
          return;
       }
       super.onDoubleFingerScaleAndRotateStart();
       this.mIsNeedReGenerateFile = false;
       return;
    }
    public void onSingleFingerScaleAndRotateStart(float p0,float p1){
       if (PatchProxy.isSupport(NewOriginFileDrawer.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, NewOriginFileDrawer.class, "7")) {
          return;
       }
       super.onSingleFingerScaleAndRotateStart(p0, p1);
       this.mIsNeedReGenerateFile = false;
       return;
    }
}
