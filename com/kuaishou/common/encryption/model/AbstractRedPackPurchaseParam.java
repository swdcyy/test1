package com.kuaishou.common.encryption.model.AbstractRedPackPurchaseParam;
import java.io.Serializable;
import com.kuaishou.common.encryption.model.a;
import java.lang.String;

public abstract class AbstractRedPackPurchaseParam extends a implements Serializable	// class@0016a8
{
    public long ksCoin;
    public String liveStreamId;

    public void AbstractRedPackPurchaseParam(){
       super();
    }
    public long getKsCoin(){
       return this.ksCoin;
    }
    public String getLiveStreamId(){
       return this.liveStreamId;
    }
    public void setKsCoin(long p0){
       this.ksCoin = p0;
    }
    public void setLiveStreamId(String p0){
       this.liveStreamId = p0;
    }
}
