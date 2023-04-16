package com.kwai.live.gzone.api.model.LiveGzoneFeatureEntranceResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.live.gzone.pendant.service.LiveGzoneFeatureEntrances;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class LiveGzoneFeatureEntranceResponse implements Serializable, a	// class@000c5a
{
    public List mActivityEntrances;
    public List mEnterRoomPlayFeatureWidgets;
    public List mGzoneActivityOvertIconUrl;
    public List mLiveGzoneWidgetRankInfoList;
    public static final long serialVersionUID = 0x99c075956a7d86f8;

    public void LiveGzoneFeatureEntranceResponse(){
       super();
    }
    public void afterDeserialize(){
       LiveGzoneFeatureEntrances liveGzoneFea;
       Iterator iterator1;
       LiveGzoneFeatureEntrances liveGzoneFea1;
       if (PatchProxy.applyVoid(null, this, LiveGzoneFeatureEntranceResponse.class, "1")) {
          return;
       }
       int i = 0;
       if (this.mActivityEntrances != null) {
          for (int i1 = 0; i1 < this.mActivityEntrances.size(); i1 = i1 + 1) {
             int i2 = i1 + 10;
             this.mActivityEntrances.get(i1).mPriority = i2;
          }
       }
       if (this.mLiveGzoneWidgetRankInfoList != null) {
          for (; i < this.mLiveGzoneWidgetRankInfoList.size(); i = i + 1) {
             this.mLiveGzoneWidgetRankInfoList.get(i).mPriority = i;
          }
       }
       LiveGzoneFeatureEntranceResponse tmEnterRoomP = this.mEnterRoomPlayFeatureWidgets;
       if (tmEnterRoomP != null && this.mLiveGzoneWidgetRankInfoList != null) {
          Iterator iterator = tmEnterRoomP.iterator();
       }
    label_007b :
       return;
    }
}
