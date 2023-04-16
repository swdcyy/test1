package com.kuaishou.common.encryption.model.BatchSendingGiftParam$SendInfo;
import java.io.Serializable;
import java.lang.Object;

public class BatchSendingGiftParam$SendInfo implements Serializable	// class@0016b3
{
    public int count;
    public int giftId;
    public long toUserId;

    public void BatchSendingGiftParam$SendInfo(){
       super();
    }
    public void BatchSendingGiftParam$SendInfo(int p0,long p1,int p2){
       super();
       this.giftId = p0;
       this.toUserId = p1;
       this.count = p2;
    }
    public int getCount(){
       return this.count;
    }
    public int getGiftId(){
       return this.giftId;
    }
    public long getToUserId(){
       return this.toUserId;
    }
    public void setCount(int p0){
       this.count = p0;
    }
    public void setGiftId(int p0){
       this.giftId = p0;
    }
    public void setToUserId(long p0){
       this.toUserId = p0;
    }
}
