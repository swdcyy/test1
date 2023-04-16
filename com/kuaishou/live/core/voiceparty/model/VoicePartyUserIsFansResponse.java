package com.kuaishou.live.core.voiceparty.model.VoicePartyUserIsFansResponse;
import java.io.Serializable;
import java.lang.Object;

public final class VoicePartyUserIsFansResponse implements Serializable	// class@0017c0
{
    public boolean isFan;
    public int result;

    public void VoicePartyUserIsFansResponse(){
       super();
    }
    public final int getResult(){
       return this.result;
    }
    public final boolean isFan(){
       return this.isFan;
    }
    public final void setFan(boolean p0){
       this.isFan = p0;
    }
    public final void setResult(int p0){
       this.result = p0;
    }
}
