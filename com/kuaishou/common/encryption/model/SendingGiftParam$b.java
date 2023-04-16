package com.kuaishou.common.encryption.model.SendingGiftParam$b;
import com.kuaishou.common.encryption.model.a$a;
import com.kuaishou.common.encryption.model.SendingGiftParam;
import com.kuaishou.common.encryption.model.SendingGiftParam$a;
import com.kuaishou.common.encryption.model.a;
import java.lang.String;

public class SendingGiftParam$b extends a$a	// class@0016c2
{

    public void SendingGiftParam$b(){
       super(new SendingGiftParam(null));
    }
    public SendingGiftParam$b b(long p0){
       this.a.clientTimestamp = p0;
       return this;
    }
    public SendingGiftParam$b c(String p0){
       this.a.comboKey = p0;
       return this;
    }
    public SendingGiftParam$b d(int p0){
       this.a.count = p0;
       return this;
    }
    public SendingGiftParam$b e(int p0){
       this.a.giftId = p0;
       return this;
    }
    public SendingGiftParam$b f(String p0){
       this.a.giftToken = p0;
       return this;
    }
    public SendingGiftParam$b g(String p0){
       this.a.liveStreamId = p0;
       return this;
    }
    public SendingGiftParam$b h(String p0){
       this.a.logExtraInfo = p0;
       return this;
    }
    public SendingGiftParam$b i(long p0){
       this.a.seqId = p0;
       return this;
    }
    public SendingGiftParam$b j(int p0){
       this.a.userSource = p0;
       return this;
    }
    public SendingGiftParam$b k(long p0){
       this.a.visitorId = p0;
       return this;
    }
}
