package com.yxcorp.gifshow.media.model.CameraPageConfig;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CloneNotSupportedException;

public class CameraPageConfig implements Serializable, Cloneable	// class@001d04
{
    public int mCameraStreamTypeForBackCamera;
    public int mCameraStreamTypeForFrontCamera;
    public int mCaptureStabilizationModeForBackCamera;
    public int mCaptureStabilizationModeForFrontCamera;
    public int mPreviewHeight;
    public int mPreviewMaxEdgeSize;
    public int mPreviewWidth;
    public static final long serialVersionUID = 0xcfe190be6ca89d41;

    public void CameraPageConfig(){
       super();
       this.mPreviewWidth = 540;
       this.mPreviewHeight = 960;
       this.mPreviewMaxEdgeSize = 960;
    }
    public void CameraPageConfig(int p0,int p1,int p2){
       super();
       this.mPreviewWidth = 540;
       this.mPreviewHeight = 960;
       this.mPreviewMaxEdgeSize = 960;
       this.mPreviewWidth = p0;
       this.mPreviewHeight = p1;
       this.mPreviewMaxEdgeSize = p2;
    }
    public CameraPageConfig clone(){
       Object obj = PatchProxy.apply(null, this, CameraPageConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          e0.printStackTrace();
          return v1;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public boolean isSameResolutionConfig(CameraPageConfig p0){
       boolean b = (this.mPreviewWidth == p0.mPreviewWidth && (this.mPreviewHeight == p0.mPreviewHeight && this.mPreviewMaxEdgeSize == p0.mPreviewMaxEdgeSize))? true: false;
       return b;
    }
}
