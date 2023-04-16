package com.kuaishou.live.core.show.anchorguide.model.LiveAnchorGuideNotice;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.core.show.anchorguide.model.LiveAnchorGuideNotice$LiveAnchorGuideShowTime;

public class LiveAnchorGuideNotice implements Serializable	// class@0009b7
{
    public String mButtonKwaiLink;
    public String mButtonText;
    public String mCommentNoticeBizId;
    public int mCommentNoticeBizType;
    public List mCommentNoticePicUrl;
    public int mCommentNoticeType;
    public String mDesc;
    public int mDisplayDurationMs;
    public int mGuideFeatureType;
    public int mGuideNoticeType;
    public List mGuideShowTimes;
    public String mGuideUniqueKey;
    public List mLiveRoomTypes;
    public boolean mNoticePicIsSquare;
    public int mNoticePriority;
    public int mTotalShowTimes;
    public static final long serialVersionUID = 0x2d93b2c4691b8321;

    public void LiveAnchorGuideNotice(){
       super();
    }
    public long getGuideNoticeConditionThreshold(int p0){
       Iterator obj;
       LiveAnchorGuideNotice$LiveAnchorGuideShowTime liveAnchorGu;
       if (PatchProxy.isSupport(LiveAnchorGuideNotice.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveAnchorGuideNotice.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (q.f(this.mGuideShowTimes)) {
          return -1;
       }else {
          obj = this.mGuideShowTimes.iterator();
          while (true) {
             if (!obj.hasNext()) {
                return -1;
             }
             liveAnchorGu = obj.next();
             if (liveAnchorGu.mGuideShowType == p0) {
                break ;
             }
          }
          return liveAnchorGu.mConditionThreshold;
       }
    }
}
