package com.kuaishou.common.encryption.model.BatchSendingGiftParam;
import java.io.Serializable;
import com.kuaishou.common.encryption.model.a;
import com.kuaishou.common.encryption.model.BatchSendingGiftParam$a;
import com.kuaishou.common.encryption.model.BatchSendingGiftParam$b;
import java.lang.String;
import java.util.List;

public class BatchSendingGiftParam extends a implements Serializable	// class@0016b6
{
    public String comboKey;
    public String giftToken;
    public String liveStreamId;
    public String logExtraInfo;
    public String scene;
    public List sendInfoList;
    public int userSource;

    public void BatchSendingGiftParam(){
       super();
    }
    public void BatchSendingGiftParam(BatchSendingGiftParam$a p0){
       super();
    }
    public static BatchSendingGiftParam$b newBuilder(){
       return new BatchSendingGiftParam$b();
    }
    public String getComboKey(){
       return this.comboKey;
    }
    public String getGiftToken(){
       return this.giftToken;
    }
    public String getLiveStreamId(){
       return this.liveStreamId;
    }
    public String getLogExtraInfo(){
       return this.logExtraInfo;
    }
    public String getScene(){
       return this.scene;
    }
    public List getSendInfoList(){
       return this.sendInfoList;
    }
    public int getUserSource(){
       return this.userSource;
    }
}
