package com.hpplay.sdk.source.api.IRelevantInfoListener;
import com.hpplay.sdk.source.api.ProtocolListener;
import java.lang.Object;
import java.lang.String;

public abstract class IRelevantInfoListener implements ProtocolListener	// class@00063a
{
    public int mOption;

    public void IRelevantInfoListener(){
       super();
    }
    public void onResult(String p0){
       this.onSendRelevantInfoResult(this.mOption, p0);
    }
    public abstract void onSendRelevantInfoResult(int p0,String p1);
    public void setOption(int p0){
       this.mOption = p0;
    }
}
