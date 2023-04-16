package com.gifshow.tuna.player.poi.PoiFoodFeedListModel$PoiFoodVideoModel;
import com.gifshow.tuna.player.poi.IPoiFoodVideoModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.gifshow.tuna.player.poi.PoiFoodFeedListModel$PoiFoodVideoModel$VideoInfo;

public class PoiFoodFeedListModel$PoiFoodVideoModel implements IPoiFoodVideoModel, Serializable	// class@0015eb
{
    public String mDishName;
    public PoiFoodFeedListModel$PoiFoodVideoModel$VideoInfo mDishPhotoVO;
    public String mPoiDishId;
    public String mPrice;
    public static final long serialVersionUID = 0x2cc6e8f2dad14a4c;

    public void PoiFoodFeedListModel$PoiFoodVideoModel(){
       super();
    }
    public String getCover(){
       PoiFoodFeedListModel$PoiFoodVideoModel tmDishPhotoV = this.mDishPhotoVO;
       if (tmDishPhotoV != null) {
          return tmDishPhotoV.mCoverUrl;
       }
       return null;
    }
    public int getHeight(){
       PoiFoodFeedListModel$PoiFoodVideoModel tmDishPhotoV = this.mDishPhotoVO;
       if (tmDishPhotoV != null) {
          return tmDishPhotoV.mHeight;
       }
       return 0;
    }
    public String getPhotoAuthorId(){
       PoiFoodFeedListModel$PoiFoodVideoModel tmDishPhotoV = this.mDishPhotoVO;
       if (tmDishPhotoV != null) {
          return tmDishPhotoV.mPhotoAuthorId;
       }
       return null;
    }
    public String getPhotoId(){
       PoiFoodFeedListModel$PoiFoodVideoModel tmDishPhotoV = this.mDishPhotoVO;
       if (tmDishPhotoV != null) {
          return tmDishPhotoV.mPhotoId;
       }
       return null;
    }
    public String getPoiDishId(){
       return this.mPoiDishId;
    }
    public String getUri(){
       PoiFoodFeedListModel$PoiFoodVideoModel tmDishPhotoV = this.mDishPhotoVO;
       if (tmDishPhotoV != null) {
          return tmDishPhotoV.mUrl;
       }
       return null;
    }
    public int getWidth(){
       PoiFoodFeedListModel$PoiFoodVideoModel tmDishPhotoV = this.mDishPhotoVO;
       if (tmDishPhotoV != null) {
          return tmDishPhotoV.mWidth;
       }
       return 0;
    }
}
