package com.kwai.video.clipkit.utils.FaceUtils;
import java.lang.Object;
import android.graphics.Bitmap;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSFaceDetectOut;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import com.kwai.video.minecraft.model.nano.Minecraft$ResourcePathConfig;
import com.kwai.video.editorsdk2.EditorSdk2Utils;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import com.kwai.kscnnrenderlib.YCNNModelInfo$YCNNModelConfig;
import com.kwai.kscnnrenderlib.KSRenderObj;
import java.lang.StringBuilder;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSLandmarksParam;
import com.kwai.kscnnrenderlib.YCNNModelInfo$YCNNModelIn;
import com.kwai.video.westeros.models.MmuResourceConfig;
import com.kwai.video.westeros.models.MmuResourceConfig$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.RuntimeException;
import com.kwai.kscnnrenderlib.YCNNModelInfo$KSFaceInfo;
import com.kwai.video.westeros.models.MmuFace;
import com.kwai.video.westeros.models.MmuFace$Builder;
import com.kwai.video.westeros.models.MmuRect$Builder;
import com.kwai.video.westeros.models.MmuRect;
import java.util.LinkedList;
import com.kwai.video.westeros.models.MmuPoint$Builder;
import com.kwai.video.westeros.models.MmuPoint;
import com.kwai.kscnnrenderlib.YCNNComm$KSPtInfo;

public class FaceUtils	// class@001af6
{

    public void FaceUtils(){
       super();
    }
    public static YCNNModelInfo$KSFaceDetectOut getFaceDetect(Bitmap p0){
       YCNNModelInfo$YCNNModelConfig obj = null;
       ByteBuffer obj1 = PatchProxy.applyOneRefs(p0, obj, FaceUtils.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       p0.getWidth();
       p0.getHeight();
       obj1 = ByteBuffer.allocate(p0.getByteCount());
       p0.copyPixelsToBuffer(obj1);
       String str = (TextUtils.isEmpty(EditorSdk2Utils.getResourcePathConfig().ylabLandmarkModelDir()))? EditorSdk2Utils.getResourcePathConfig().ylabModelDir(): EditorSdk2Utils.getResourcePathConfig().ylabLandmarkModelDir();
       if (!new File(str).exists()) {
          return obj;
       }else {
          obj = new YCNNModelInfo$YCNNModelConfig();
          obj.model_type = 5;
          KSRenderObj kSRenderObj = KSRenderObj.createRender(obj);
          kSRenderObj.YCNNGetConfig2Model(str+"/");
          kSRenderObj.createCPUModel();
          YCNNModelInfo$KSLandmarksParam kSLandmarksP = new YCNNModelInfo$KSLandmarksParam();
          kSLandmarksP.detectMode = 2;
          kSLandmarksP.useRobust3D = 1;
          kSRenderObj.setLandmarksParam(kSLandmarksP);
          YCNNModelInfo$YCNNModelIn yCNNModelIn = new YCNNModelInfo$YCNNModelIn();
          yCNNModelIn.colorType = 1;
          yCNNModelIn.width = p0.getWidth();
          yCNNModelIn.height = p0.getHeight();
          yCNNModelIn.data_0 = obj1.array();
          yCNNModelIn.single_image = true;
          kSRenderObj.runModelBuffer(yCNNModelIn);
          YCNNModelInfo$KSFaceDetectOut kSFaceDetect = new YCNNModelInfo$KSFaceDetectOut();
          kSRenderObj.getLandmarks(kSFaceDetect);
          kSRenderObj.release();
          return kSFaceDetect;
       }
    }
    public static MmuResourceConfig getMmuResourceConfig(String p0,String p1){
       MmuResourceConfig$Builder obj = PatchProxy.applyTwoRefs(p0, p1, null, FaceUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          throw new RuntimeException("wrong arg resourcePath is empty");
       }
       obj = MmuResourceConfig.newBuilder();
       String str = (TextUtils.isEmpty(EditorSdk2Utils.getResourcePathConfig().ylabLandmarkModelDir()))? EditorSdk2Utils.getResourcePathConfig().ylabModelDir(): EditorSdk2Utils.getResourcePathConfig().ylabLandmarkModelDir();
       if (!new File(str).exists()) {
          return null;
       }else {
          obj.setYcnnModelPath(str);
          if (!new File(p1).exists()) {
             return null;
          }else {
             obj.addMmuModelPath(p1);
             p1 = EditorSdk2Utils.getResourcePathConfig().mmuBasewhiteModelDir();
             if (!new File(p1).exists()) {
                return null;
             }else {
                obj.addMmuModelPath(p1);
                if (!new File(p0).exists()) {
                   return null;
                }else {
                   obj.setResourcePath(p0);
                   return obj.build();
                }
             }
          }
       }
    }
    public static MmuFace mmuFaceFromYCNNFace(YCNNModelInfo$KSFaceInfo p0){
       MmuFace$Builder obj = PatchProxy.applyOneRefs(p0, null, FaceUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MmuFace.newBuilder();
       obj.setYaw(p0.yaw);
       obj.setPitch(p0.pitch);
       obj.setRoll(p0.roll);
       MmuRect$Builder uBuilder = MmuRect.newBuilder();
       uBuilder.setTop(p0.top);
       uBuilder.setLeft(p0.left);
       uBuilder.setBottom((p0.top + p0.height));
       uBuilder.setRight((p0.left + p0.width));
       obj.setRect(uBuilder);
       for (int i = 0; i < p0.pos.size(); i = i + 1) {
          MmuPoint$Builder uBuilder1 = MmuPoint.newBuilder();
          uBuilder1.setX(p0.pos.get(i).xPos);
          uBuilder1.setY(p0.pos.get(i).yPos);
          obj.addPoints(uBuilder1);
       }
       return obj.build();
    }
}
