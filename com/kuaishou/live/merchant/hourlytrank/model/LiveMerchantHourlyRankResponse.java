package com.kuaishou.live.merchant.hourlytrank.model.LiveMerchantHourlyRankResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;

public class LiveMerchantHourlyRankResponse implements CursorResponse, Serializable	// class@000cd4
{
    public long mCurrentServerTime;
    public int mCurrentTabId;
    public String mDescription;
    public long mEndTime;
    public boolean mIsShow;
    public String mName;
    public List mRankInfos;
    public int mResult;
    public String mRuleUrl;
    public List mTabInfos;
    public static LiveMerchantHourlyRankResponse EMPTY;
    public static final long serialVersionUID;

    static {
       LiveMerchantHourlyRankResponse.EMPTY = new LiveMerchantHourlyRankResponse();
    }
    public void LiveMerchantHourlyRankResponse(){
       super();
    }
    public String getCursor(){
       return "";
    }
    public List getItems(){
       return this.mRankInfos;
    }
    public boolean hasMore(){
       return false;
    }
    public boolean isValid(){
       boolean b = true;
       if (this.mResult != b || this.mIsShow == null) {
          b = false;
       }
       return b;
    }
}
