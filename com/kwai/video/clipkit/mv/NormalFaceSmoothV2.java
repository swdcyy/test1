package com.kwai.video.clipkit.mv.NormalFaceSmoothV2;
import com.kwai.video.clipkit.mv.FaceSmoothV2;
import java.lang.Object;
import android.util.LongSparseArray;
import com.kwai.video.clipkit.mv.ClipAssetManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.FaceMagic.AE2.AE2Asset;
import com.kwai.FaceMagic.AE2.AE2AssetExtraRequirement;
import com.kwai.kscnnrenderlib.YCNNModelInfo$YCNNModelConfig;
import com.kwai.video.minecraft.model.nano.Minecraft$ResourcePathConfig;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import java.lang.StringBuilder;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.kscnnrenderlib.KSRenderObj;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSLandmarksParam;
import java.util.Map;
import java.util.List;
import com.kwai.video.editorsdk2.ExternalAnimatedSubAssetData;
import com.kwai.FaceMagic.AE2.AE2AssetExtraData;
import com.kwai.video.clipkit.mv.MutablePair;
import java.lang.Long;
import java.nio.ByteBuffer;
import android.opengl.GLES20;
import java.nio.Buffer;
import com.kwai.kscnnrenderlib.YCNNModelInfo$YCNNModelIn;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSFaceDetectOut;
import com.kwai.FaceMagic.AE2.AE2FaceData;
import java.util.LinkedList;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSFaceInfo;
import com.kwai.kscnnrenderlib.YCNNComm$KSPtInfo;
import java.nio.FloatBuffer;

public class NormalFaceSmoothV2 implements FaceSmoothV2	// class@001ad0
{
    public LongSparseArray mFaceData;
    public LongSparseArray mLruFaceData;
    public long mLruTimestampMax;
    public KSRenderObj mYcnnModel;

    public void NormalFaceSmoothV2(){
       super();
       this.mYcnnModel = null;
       this.mLruFaceData = new LongSparseArray();
       this.mFaceData = new LongSparseArray();
       this.mLruTimestampMax = 0;
    }
    public boolean init(ClipAssetManager p0){
       String obj = PatchProxy.applyOneRefs(p0, this, NormalFaceSmoothV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Iterator iterator = p0.assets().iterator();
       String str = 1;
       while (iterator.hasNext()) {
          if (!iterator.next().getExtraRequirement().getRequireFace()) {
             continue ;
          }else {
             YCNNModelInfo$YCNNModelConfig yCNNModelCon = new YCNNModelInfo$YCNNModelConfig();
             yCNNModelCon.model_type = 5;
             obj = EditorSdk2Utils.getResourcePathConfig().ylabLandmarkModelDir();
             if (TextUtils.isEmpty(obj)) {
                obj = EditorSdk2Utils.getResourcePathConfig().ylabModelDir();
             }
             File uFile = new File(obj);
             if (!uFile.exists()) {
                EditorSdkLogger.e("NormalFaceSmooth", "Ycnn model directory not exists. path: "+obj);
                return false;
             }else if(!uFile.isDirectory()){
                EditorSdkLogger.e("NormalFaceSmooth", "Ycnn model directory is not directory. path: "+obj);
                return false;
             }else {
                KSRenderObj kSRenderObj = KSRenderObj.createRender(yCNNModelCon);
                this.mYcnnModel = kSRenderObj;
                if (kSRenderObj == null) {
                   EditorSdkLogger.e("NormalFaceSmooth", "Fail to create YCNNModel.");
                   return false;
                }else {
                   kSRenderObj.YCNNGetConfig2Model(obj);
                   YCNNModelInfo$KSLandmarksParam landmarksPar = this.mYcnnModel.getLandmarksParam();
                   landmarksPar.detectMode = 2;
                   landmarksPar.detectIntervals = 30;
                   this.mYcnnModel.setLandmarksParam(landmarksPar);
                   if (!this.mYcnnModel.createCPUModel()) {
                      EditorSdkLogger.e("NormalFaceSmooth", "Fail to create YCNN CPU Model.");
                      return false;
                   }else {
                      break ;
                   }
                }
             }
          }
       }
       return str;
    }
    public boolean init(ClipAssetManager p0,Map p1){
       return false;
    }
    public void process(ClipAssetManager p0,List p1){
       int i8;
       long l = this;
       Object obj = p0;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, l, NormalFaceSmoothV2.class, "2")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          ExternalAnimatedSubAssetData uExternalAni = iterator.next();
          AE2AssetExtraData uAE2AssetExt = l.mFaceData.get(uExternalAni.getAssetId());
          if (uAE2AssetExt != null) {
             obj.replaceTextureWithId(uExternalAni.getExternalAssetId(), uExternalAni.getTexture(), uAE2AssetExt);
          }else {
             obj.replaceTextureWithId(uExternalAni.getExternalAssetId(), uExternalAni.getTexture());
             AE2Asset assetsWithId = obj.getAssetsWithId(uExternalAni.getExternalAssetId());
             if (assetsWithId != null && (assetsWithId.getExtraRequirement() == null || !assetsWithId.getExtraRequirement().getRequireFace())) {
                continue ;
             }else {
                MutablePair mutablePair = l.mLruFaceData.get(uExternalAni.getAssetId());
                long l1 = 1;
                if (mutablePair != null) {
                   obj.replaceTextureWithId(uExternalAni.getExternalAssetId(), uExternalAni.getTexture(), mutablePair.getFirst());
                   NormalFaceSmoothV2 mLruTimestam = l.mLruTimestampMax;
                   l1 = l1 + mLruTimestam;
                   l.mLruTimestampMax = l1;
                   mutablePair.setSecond(Long.valueOf(mLruTimestam));
                }else if(l.mYcnnModel == null){
                   break ;
                }else {
                   int textureWidth = uExternalAni.getTextureWidth();
                   int textureHeigh = uExternalAni.getTextureHeight();
                   int i = textureWidth * textureHeigh;
                   i = i * 4;
                   ByteBuffer uByteBuffer = ByteBuffer.allocate(i);
                   int[] ointArray = new int[1];
                   GLES20.glGenFramebuffers(1, ointArray, 0);
                   GLES20.glBindFramebuffer(0x8d40, ointArray[0]);
                   GLES20.glFramebufferTexture2D(0x8d40, 0x8ce0, 3553, uExternalAni.getTexture(), 0);
                   int i1 = 0;
                   int[] ointArray1 = ointArray;
                   GLES20.glReadPixels(0, 0, textureWidth, textureHeigh, 6408, 5121, uByteBuffer);
                   GLES20.glBindFramebuffer(0x8d40, i1);
                   GLES20.glDeleteFramebuffers(1, ointArray1, i1);
                   ointArray1[i1] = i1;
                   ByteBuffer uByteBuffer1 = uByteBuffer;
                   uByteBuffer1.position(i1);
                   YCNNModelInfo$YCNNModelIn yCNNModelIn = new YCNNModelInfo$YCNNModelIn();
                   yCNNModelIn.data_0 = uByteBuffer1.array();
                   yCNNModelIn.width = textureWidth;
                   yCNNModelIn.height = textureHeigh;
                   yCNNModelIn.colorType = 1;
                   yCNNModelIn.single_image = true;
                   l.mYcnnModel.runModelBuffer(yCNNModelIn);
                   YCNNModelInfo$KSFaceDetectOut kSFaceDetect = new YCNNModelInfo$KSFaceDetectOut();
                   l.mYcnnModel.getLandmarks(kSFaceDetect);
                   AE2FaceData uAE2FaceData = new AE2FaceData();
                   int i2 = kSFaceDetect.faces.size();
                   uAE2FaceData.faceCount = i2;
                   int i3 = 0;
                   while (i3 < i2 && i3 < 4) {
                      YCNNModelInfo$KSFaceInfo kSFaceInfo = kSFaceDetect.faces.get(i3);
                      int i4 = i3 * 205;
                      EditorSdkLogger.i("NormalFaceSmooth", "face index:"+i4+"faceData size:"+kSFaceInfo.pos.size());
                      int i5 = 0;
                      int i6 = 0;
                      while (i5 < 101 && i5 < kSFaceInfo.pos.size()) {
                         YCNNComm$KSPtInfo kSPtInfo = kSFaceInfo.pos.get(i5);
                         int i7 = i6 + 1;
                         i6 = i6 + i4;
                         float f = kSPtInfo.xPos / (float)textureWidth;
                         uAE2FaceData.pointsAndPose.put(i6, f);
                         i6 = i7 + 1;
                         i8 = i4 + i7;
                         float f1 = kSPtInfo.yPos / (float)textureHeigh;
                         uAE2FaceData.pointsAndPose.put(i8, f1);
                         i5 = i5 + 1;
                         iterator = iterator;
                         kSFaceDetect = kSFaceDetect;
                         AE2FaceData uAE2FaceData1 = 4;
                      }
                      i4 = i4 + 202;
                      i8 = i4 + 2;
                      uAE2FaceData.pointsAndPose.put(i8, kSFaceInfo.yaw);
                      i8 = i4 + 1;
                      uAE2FaceData.pointsAndPose.put(i8, kSFaceInfo.pitch);
                      uAE2FaceData.pointsAndPose.put(i4, kSFaceInfo.roll);
                      i3 = i3 + 1;
                      iterator = iterator;
                      kSFaceDetect = kSFaceDetect;
                      YCNNModelInfo$KSFaceInfo kSFaceInfo1 = null;
                   }
                   Iterator iterator1 = iterator;
                   int i9 = l.mLruFaceData.size();
                   if (i9 >= 10) {
                      NormalFaceSmoothV2 mLruTimestam1 = l.mLruTimestampMax;
                      long l2 = 0;
                      i3 = 0;
                      while (i3 < i9) {
                         long l3 = l.mLruFaceData.valueAt(i3).getSecond().longValue();
                         if (mLruTimestam1 - l3 > 0) {
                            l2 = l.mLruFaceData.keyAt(i3);
                            mLruTimestam1 = l3;
                         }
                         i3 = i3 + 1;
                      }
                      l.mLruFaceData.remove(l2);
                   }
                   AE2AssetExtraData uAE2AssetExt1 = new AE2AssetExtraData();
                   uAE2AssetExt1.copyFromData(uAE2FaceData);
                   NormalFaceSmoothV2 mLruTimestam2 = l.mLruTimestampMax;
                   long l4 = 1 + mLruTimestam2;
                   l.mLruTimestampMax = l4;
                   l.mLruFaceData.put(uExternalAni.getAssetId(), new MutablePair(uAE2AssetExt1, Long.valueOf(mLruTimestam2)));
                   obj.replaceTextureWithId(uExternalAni.getExternalAssetId(), uExternalAni.getTexture(), uAE2AssetExt1);
                   iterator = iterator1;
                }
             }
          }
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, NormalFaceSmoothV2.class, "3")) {
          return;
       }
       NormalFaceSmoothV2 tmYcnnModel = this.mYcnnModel;
       if (tmYcnnModel != null) {
          tmYcnnModel.releaseCPU();
          this.mYcnnModel.release();
          this.mYcnnModel = null;
       }
       this.mLruFaceData.clear();
       this.mLruTimestampMax = 0;
       return;
    }
}
