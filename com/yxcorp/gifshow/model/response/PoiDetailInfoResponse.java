package com.yxcorp.gifshow.model.response.PoiDetailInfoResponse;
import java.io.Serializable;
import java.lang.Object;

public class PoiDetailInfoResponse implements Serializable	// class@001f52
{
    public PoiDetailInfoResponse$PoiDetail mPoiDetail;
    public RankInfo mRankInfo;
    public List mRecommendPois;
    public int result;
    public static final long serialVersionUID = 0x65b5753dff341ad5;

    public void PoiDetailInfoResponse(){
       super();
    }
}
