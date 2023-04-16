package com.yxcorp.gifshow.log.model.StatMetaData;
import com.yxcorp.gifshow.log.model.BaseMetaData;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import k2b.e0;

public class StatMetaData extends BaseMetaData	// class@001b1a
{
    public CommonParams commonParams;
    public ClientStat$StatPackage statPackage;
    public static final long serialVersionUID = 0x12443b3bb118c522;

    public void StatMetaData(){
       super();
    }
    public CommonParams getCommonParams(){
       return this.commonParams;
    }
    public ClientStat$StatPackage getStatPackage(){
       return this.statPackage;
    }
    public StatMetaData setCommonParams(CommonParams p0){
       this.commonParams = p0;
       return this;
    }
    public StatMetaData setFeedLogCtx(FeedLogCtx p0){
       this.feedLogCtx = p0;
       return this;
    }
    public StatMetaData setInterStidContainer(StidContainerProto$StidContainer p0){
       this.interStidContainer = p0;
       return this;
    }
    public StatMetaData setIsRealTime(boolean p0){
       this.isRealTime = p0;
       return this;
    }
    public StatMetaData setLogPage(e0 p0){
       this.logPage = p0;
       return this;
    }
    public StatMetaData setStatPackage(ClientStat$StatPackage p0){
       this.statPackage = p0;
       return this;
    }
}
