package com.yxcorp.gifshow.model.response.HotChannelColumn;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Iterable;
import qk.y;

public class HotChannelColumn implements Serializable	// class@001f3a
{
    public String mBannerUrl;
    public List mColumnItems;
    public ChannelContentListInfo mContentListInfo;
    public long mFullColumnId;
    public String mFullColumnType;
    public boolean mHasLogMoreBtnShow;
    public boolean mIsUseDarkButton;
    public String mMainTitle;
    public String mPcursor;
    public List mRecommendUsers;
    public String mRepositionPCursor;
    public String mSubTitle;
    public String mSubTitleUrl;
    public String mTopListSubitle;
    public String mTopListSubtitleColor;
    public String mTopListTitle;
    public String mTopListTitleColor;
    public int mTotalNum;
    public static final long serialVersionUID = 0x55f44fbab051c402;

    public void HotChannelColumn(){
       super();
    }
    public boolean equals(Object p0){
       HotChannelColumn obj = PatchProxy.applyOneRefs(p0, this, HotChannelColumn.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof HotChannelColumn) {
          return b;
       }
       if (!this.mFullColumnId - p0.mFullColumnId && (TextUtils.n(this.mFullColumnType, p0.mFullColumnType) && (TextUtils.n(this.mTopListTitle, p0.mTopListTitle) && (TextUtils.n(this.mTopListSubitle, p0.mTopListSubitle) && (TextUtils.n(this.mTopListTitleColor, p0.mTopListTitleColor) && TextUtils.n(this.mTopListSubtitleColor, p0.mTopListSubtitleColor)))))) {
          obj = this.mColumnItems;
          if (obj != null) {
             p0 = p0.mColumnItems;
             if (p0 != null && y.g(obj, p0)) {
                b = true;
             }
          }
       }
    label_0064 :
       return b;
    }
    public boolean isColumnPhoto(){
       Object obj = PatchProxy.apply(null, this, HotChannelColumn.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("photoFullColumn").equals(this.mFullColumnType);
    }
}
