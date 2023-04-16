package com.gifshow.tuna.player.poi.PoiFoodFeedListModel;
import java.io.Serializable;
import oj.a;
import java.lang.Object;
import java.lang.String;
import com.gifshow.tuna.player.poi.PoiFoodFeedListModel$Data;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;

public class PoiFoodFeedListModel implements Serializable, a	// class@0015ec
{
    public PoiFoodFeedListModel$Data mData;
    public String mPoiId;
    public static final long serialVersionUID = 0xf086d91a2322f35e;

    public void PoiFoodFeedListModel(){
       super();
    }
    public String getPoiAddress(){
       PoiFoodFeedListModel tmData = this.mData;
       if (tmData != null) {
          return tmData.mAddress;
       }
       return null;
    }
    public String getPoiIconUrl(){
       PoiFoodFeedListModel tmData = this.mData;
       if (tmData != null) {
          return tmData.mHeadImageUrl;
       }
       return null;
    }
    public String getPoiId(){
       return this.mPoiId;
    }
    public String getPoiName(){
       PoiFoodFeedListModel tmData = this.mData;
       if (tmData != null) {
          return tmData.mPoiName;
       }
       return null;
    }
    public int getVideoListSize(){
       PoiFoodFeedListModel obj = PatchProxy.apply(null, this, PoiFoodFeedListModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mData;
       if (obj != null) {
          PoiFoodFeedListModel$Data mPoiDishVOLi = obj.mPoiDishVOList;
          if (mPoiDishVOLi != null) {
             return mPoiDishVOLi.size();
          }
       }
       return 0;
    }
    public boolean isPoiCollected(){
       PoiFoodFeedListModel tmData = this.mData;
       boolean b = false;
       if (tmData != null && tmData.mPoiCollectStatus == 1) {
          b = true;
       }
       return b;
    }
    public void setPoiCollected(boolean p0){
       PoiFoodFeedListModel tmData = this.mData;
       if (tmData != null) {
          tmData.mPoiCollectStatus = p0;
       }
       return;
    }
}
