package com.kwai.video.clipkit.config.EditorPreviewConfig;
import java.io.Serializable;
import java.lang.Object;
import com.kwai.video.clipkit.config.EditorPreviewConfig$PreviewSizeLimitation;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;

public class EditorPreviewConfig implements Serializable	// class@001a79
{
    public EditorPreviewConfig$PreviewSizeLimitation[] mPreviewSizeLimitations;

    public void EditorPreviewConfig(){
       super();
    }
    public final int defaultPreviewSizeShortEdge(){
       EditorPreviewConfig tmPreviewSiz = this.mPreviewSizeLimitations;
       int i = -1;
       if (tmPreviewSiz == null) {
          return i;
       }
       int len = tmPreviewSiz.length;
       int i1 = 0;
       while (i1 < len) {
          object oobject = tmPreviewSiz[i1];
          EditorPreviewConfig$PreviewSizeLimitation mVideoType = oobject.mVideoType;
          if (mVideoType != null) {
             int len1 = mVideoType.length;
             int i2 = 0;
             while (i2 < len1) {
                if (!mVideoType[i2]) {
                   i = oobject.mShortEdge;
                   break ;
                }
                i2 = i2 + 1;
             }
          }
          i1 = i1 + 1;
       }
       return i;
    }
    public int getPreviewSizeShortEdge(int p0){
       EditorPreviewConfig$PreviewSizeLimitation mShortEdge;
       if (PatchProxy.isSupport(EditorPreviewConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, EditorPreviewConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!this.isPreviewSizeLimitationsAvaliable()) {
          return -1;
       }else {
          int i = this.defaultPreviewSizeShortEdge();
          EditorPreviewConfig tmPreviewSiz = this.mPreviewSizeLimitations;
          int len = tmPreviewSiz.length;
          int i1 = 0;
          while (true) {
             if (i1 < len) {
                object oobject = tmPreviewSiz[i1];
                EditorPreviewConfig$PreviewSizeLimitation mVideoType = oobject.mVideoType;
                if (mVideoType != null) {
                   int len1 = mVideoType.length;
                   int i2 = 0;
                   while (true) {
                      if (i2 < len1) {
                         if (mVideoType[i2] == p0) {
                            mShortEdge = oobject.mShortEdge;
                            if (mShortEdge > null) {
                            }
                         }
                         i2 = i2 + 1;
                      }
                   }
                   return i;
                }
                i1 = i1 + 1;
             }else {
                goto label_004c ;
             }
          }
          return mShortEdge;
       }
    }
    public boolean isPreviewSizeLimitationsAvaliable(){
       Object obj = PatchProxy.apply(null, this, EditorPreviewConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.defaultPreviewSizeShortEdge() > 0)? true: false;
       return b;
    }
}
