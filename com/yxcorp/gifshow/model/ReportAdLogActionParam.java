package com.yxcorp.gifshow.model.ReportAdLogActionParam;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.ReportAdLogActionParam$AdLogClientParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class ReportAdLogActionParam implements Serializable, a	// class@001e86
{
    public int mAdActionType;
    public String mAdInstanceId;
    public int mAdLiveItemImpressionType;
    public int mAdLiveShopClickType;
    public int mAdLiveShopLinkJumpType;
    public ReportAdLogActionParam$AdLogClientParams mAdLogClientParams;
    public int mBusinessAccessType;
    public int mBusinessSceneType;
    public int mButtonStyle;
    public int mCardCloseType;
    public HashMap mClientExtData;
    public int mDisplayIndex;
    public int mElementType;
    public int mItemClickAction;
    public int mItemClickType;
    public int mItemCloseType;
    public String mItemId;
    public String mItemIdList;
    public int mLiveRoomPattern;
    public int mNegativeSource;
    public int mNegativeType;
    public int mSimplifiedLiveRoomType;
    public static final long serialVersionUID = 0x1a9b81fb2679d93;

    public void ReportAdLogActionParam(){
       super();
       this.mItemId = "";
       this.mItemIdList = "";
       this.mAdInstanceId = "";
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, ReportAdLogActionParam.class, "1")) {
          return;
       }
       ReportAdLogActionParam tmAdLogClien = this.mAdLogClientParams;
       if (tmAdLogClien != null) {
          if (this.mAdLiveItemImpressionType == null) {
             this.mAdLiveItemImpressionType = tmAdLogClien.mAdLiveItemImpressionType;
          }
          if (this.mAdLiveShopLinkJumpType == null) {
             this.mAdLiveShopLinkJumpType = tmAdLogClien.mAdLiveShopLinkJumpType;
          }
          if (TextUtils.x(this.mItemId)) {
             this.mItemId = this.mAdLogClientParams.mItemId;
          }
       }
       return;
    }
}
