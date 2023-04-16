package com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PhotoDisplayLocationInfo implements Serializable	// class@000d4e
{
    public float mDisplayHeight;
    public float mDisplayWidth;
    public float mHeightRatio;
    public float mLeftRatio;
    public float mPhotoHeight;
    public float mPhotoWidth;
    public float mTopRatio;
    public float mWidthRatio;
    public static final long serialVersionUID = 0xe99c3231e50481cd;

    public void PhotoDisplayLocationInfo(){
       super();
    }
    public boolean isLongVideoValid(){
       boolean b;
       PhotoDisplayLocationInfo tmPhotoWidth = this.mPhotoWidth;
       int i = 0;
       if (tmPhotoWidth - i) {
          tmPhotoWidth = this.mWidthRatio;
          if (!(this.mDisplayWidth / tmPhotoWidth) - tmPhotoWidth) {
             PhotoDisplayLocationInfo tmPhotoHeigh = this.mPhotoHeight;
             if (tmPhotoHeigh - i) {
                tmPhotoHeigh = this.mHeightRatio;
                if (!(this.mDisplayHeight / tmPhotoHeigh) - tmPhotoHeigh) {
                   PhotoDisplayLocationInfo tmLeftRatio = this.mLeftRatio;
                   if ((tmLeftRatio + tmPhotoWidth) - i > 0) {
                      tmPhotoWidth = 0x3f800000;
                      if ((tmLeftRatio + tmPhotoWidth) - tmPhotoWidth <= 0) {
                         tmLeftRatio = this.mTopRatio;
                         if ((tmLeftRatio + tmPhotoHeigh) - i > 0 && (tmLeftRatio + tmPhotoHeigh) - tmPhotoWidth <= 0) {
                            b = true;
                         label_003e :
                            return b;
                         }
                      }
                   }
                }
             }
          }
       }
       b = false;
       goto label_003e ;
    }
    public boolean isValid(){
       boolean b;
       int i = 0x3f800000;
       if (this.mLeftRatio - i <= 0 && this.mTopRatio - i <= 0) {
          PhotoDisplayLocationInfo tmWidthRatio = this.mWidthRatio;
          if (tmWidthRatio - i <= 0 && tmWidthRatio > 0) {
             tmWidthRatio = this.mHeightRatio;
             if (tmWidthRatio - i <= 0 && tmWidthRatio > 0) {
                b = true;
             label_0026 :
                return b;
             }
          }
       }
       b = false;
       goto label_0026 ;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PhotoDisplayLocationInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PhotoDisplayLocationInfo{mLeftRatio="+this.mLeftRatio+", mTopRatio="+this.mTopRatio+", mWidthRatio="+this.mWidthRatio+", mHeightRatio="+this.mHeightRatio+", mPhotoWidth="+this.mPhotoWidth+", mPhotoHeight="+this.mPhotoHeight+'}';
    }
}
