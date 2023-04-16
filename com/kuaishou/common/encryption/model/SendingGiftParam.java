package com.kuaishou.common.encryption.model.SendingGiftParam;
import java.io.Serializable;
import com.kuaishou.common.encryption.model.a;
import com.kuaishou.common.encryption.model.SendingGiftParam$a;
import com.kuaishou.common.encryption.model.SendingGiftParam$b;
import java.lang.String;
import com.google.gson.Gson;
import java.lang.Object;

public class SendingGiftParam extends a implements Serializable	// class@0016c3
{
    public String comboKey;
    public int count;
    public int giftId;
    public String giftToken;
    public String liveStreamId;
    public String logExtraInfo;
    public int userSource;

    public void SendingGiftParam(){
       super();
    }
    public void SendingGiftParam(SendingGiftParam$a p0){
       super();
    }
    public static SendingGiftParam$b newBuilder(){
       return new SendingGiftParam$b();
    }
    public String getComboKey(){
       return this.comboKey;
    }
    public int getCount(){
       return this.count;
    }
    public int getGiftId(){
       return this.giftId;
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
    public int getUserSource(){
       return this.userSource;
    }
    public String toJson(){
       return new Gson().q(this);
    }
}
