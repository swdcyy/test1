package com.kwai.video.krtc.utils.RenderUtils;
import java.lang.Object;
import android.graphics.Matrix;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.opengl.Matrix;
import java.lang.Float;

public class RenderUtils	// class@0008bd
{

    public void RenderUtils(){
       super();
    }
    public static void adjustOrigin(float[] p0){
       p0[12] = p0[12] - ((p0[0] + p0[4]) * 0x3f000000);
       p0[13] = p0[13] - ((p0[1] + p0[5]) * 0x3f000000);
       p0[12] = p0[12] + 0x3f000000;
       p0[13] = p0[13] + 0x3f000000;
    }
    public static float[] adjustRespectRatio(int p0,int p1,int p2,int p3,float[] p4){
       float[] uofloatArray = new float[8];
       float f = ((float)(p0 * p3) * 0x3f800000) / (float)(p1 * p2);
       p2 = 5;
       if (f - 0x3f800000 < 0) {
          uofloatArray[0] = p4[0];
          uofloatArray[2] = p4[2];
          uofloatArray[4] = p4[4];
          uofloatArray[6] = p4[6];
          uofloatArray[1] = p4[1] / f;
          uofloatArray[3] = p4[3] / f;
          uofloatArray[p2] = p4[p2] / f;
          uofloatArray[7] = p4[7] / f;
       }else {
          uofloatArray[0] = p4[0] * f;
          uofloatArray[2] = p4[2] * f;
          uofloatArray[4] = p4[4] * f;
          uofloatArray[6] = p4[6] * f;
          uofloatArray[1] = p4[1];
          uofloatArray[3] = p4[3];
          uofloatArray[p2] = p4[p2];
          uofloatArray[7] = p4[7];
       }
       return uofloatArray;
    }
    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RenderUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float[] uofloatArray = new float[9];
       p0.getValues(uofloatArray);
       float[] uofloatArray1 = new float[]{uofloatArray[0],uofloatArray[3],0,uofloatArray[6],uofloatArray[1],uofloatArray[4],0,uofloatArray[7],0,0,0x3f800000,0,uofloatArray[2],uofloatArray[5],0,uofloatArray[8]};
       return uofloatArray1;
    }
    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] p0){
       float[] obj = PatchProxy.applyOneRefs(p0, null, RenderUtils.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new float[]{p0[0],p0[4],p0[12],p0[1],p0[5],p0[13],p0[3],p0[7],p0[15]};
       Matrix matrix = new Matrix();
       matrix.setValues(obj);
       return matrix;
    }
    public static final float[] horizontalFlipMatrix(){
       return new float[16]{0xbf800000,0,0,0,0,0x3f800000,0,0,0,0,0x3f800000,0,0x3f800000,0,0,0x3f800000};
    }
    public static final float[] identityMatrix(){
       return new float[16]{0x3f800000,0,0,0,0,0x3f800000,0,0,0,0,0x3f800000,0,0,0,0,0x3f800000};
    }
    public static float[] mirrorTextureMatrix(float[] p0){
       float[] obj = PatchProxy.applyOneRefs(p0, null, RenderUtils.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new float[16];
       Matrix.setIdentityM(obj, 0);
       Matrix.scaleM(obj, 0, 0xbf800000, 0x3f800000, 0x3f800000);
       RenderUtils.adjustOrigin(obj);
       return RenderUtils.multiplyMatrices(p0, obj);
    }
    public static float[] multiplyMatrices(float[] p0,float[] p1){
       float[] obj = PatchProxy.applyTwoRefs(p0, p1, null, RenderUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new float[16];
       Matrix.multiplyMM(obj, 0, p0, 0, p1, 0);
       return obj;
    }
    public static float[] rotateTextureMatrix(float[] p0,float p1){
       float[] obj;
       RenderUtils renderUtils = RenderUtils.class;
       if (PatchProxy.isSupport(renderUtils)) {
          obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, renderUtils, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new float[16];
       Matrix.setRotateM(obj, 0, p1, 0, 0, 0x3f800000);
       RenderUtils.adjustOrigin(obj);
       return RenderUtils.multiplyMatrices(p0, obj);
    }
    public static final float[] verticalFlipMatrix(){
       return new float[16]{0x3f800000,0,0,0,0,0xbf800000,0,0,0,0,0x3f800000,0,0,0x3f800000,0,0x3f800000};
    }
}