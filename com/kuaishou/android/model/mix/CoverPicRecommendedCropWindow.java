package com.kuaishou.android.model.mix.CoverPicRecommendedCropWindow;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;

public class CoverPicRecommendedCropWindow implements Serializable, a	// class@000c53
{
    public int mBeginX;
    public int mBeginY;
    public int mCropHeight;
    public int mCropWidth;
    public boolean mIsCropValid;
    public int mPhotoHeight;
    public int mPhotoWidth;

    public void CoverPicRecommendedCropWindow(){
       super();
    }
    public void afterDeserialize(){
    }
    public boolean isValid(){
       boolean b;
       CoverPicRecommendedCropWindow tmBeginX = this.mBeginX;
       if (tmBeginX >= null) {
          CoverPicRecommendedCropWindow tmBeginY = this.mBeginY;
          if (tmBeginY >= null) {
             CoverPicRecommendedCropWindow tmCropWidth = this.mCropWidth;
             if (tmCropWidth > null) {
                CoverPicRecommendedCropWindow tmCropHeight = this.mCropHeight;
                if (tmCropHeight > null && ((tmBeginX + tmCropWidth) <= this.mPhotoWidth && (tmBeginY + tmCropHeight) <= this.mPhotoHeight)) {
                   b = true;
                label_001d :
                   return b;
                }
             }
          }
       }
       b = false;
       goto label_001d ;
    }
}
