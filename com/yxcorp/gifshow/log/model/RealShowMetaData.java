package com.yxcorp.gifshow.log.model.RealShowMetaData;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowPage;

public class RealShowMetaData implements Serializable	// class@001b18
{
    public RealShowLogs$RealShowPage realShowPage;
    public static final long serialVersionUID = 0x7a36b4e2c79e8792;

    public void RealShowMetaData(){
       super();
    }
    public void RealShowMetaData(RealShowLogs$RealShowPage p0){
       super();
       this.realShowPage = p0;
    }
}
