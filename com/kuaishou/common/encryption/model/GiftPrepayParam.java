package com.kuaishou.common.encryption.model.GiftPrepayParam;
import com.kuaishou.common.encryption.model.AbstractPrepayParam;
import java.lang.String;

public abstract class GiftPrepayParam extends AbstractPrepayParam	// class@0016c0
{
    public long ksCoin;
    public String ksCouponId;

    public void GiftPrepayParam(){
       super();
    }
    public long getKsCoin(){
       return this.ksCoin;
    }
    public String getKsCouponId(){
       return this.ksCouponId;
    }
    public void setKsCoin(long p0){
       this.ksCoin = p0;
    }
    public void setKsCouponId(String p0){
       this.ksCouponId = p0;
    }
}
