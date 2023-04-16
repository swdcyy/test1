package com.kuaishou.merchant.live.marketing.truthordare.model.TruthOrDareInfo$BubbleInfo;
import java.io.Serializable;
import com.kuaishou.merchant.live.marketing.truthordare.model.TruthOrDareInfo$BubbleInfo$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class TruthOrDareInfo$BubbleInfo implements Serializable	// class@001aa0
{
    public String mDesc;
    public long mDuration;
    public static final TruthOrDareInfo$BubbleInfo$a Companion;
    public static final long serialVersionUID;

    static {
       TruthOrDareInfo$BubbleInfo.Companion = new TruthOrDareInfo$BubbleInfo$a(null);
    }
    public void TruthOrDareInfo$BubbleInfo(){
       super();
       this.mDesc = "";
       this.mDuration = 5000;
    }
    public final String getMDesc(){
       return this.mDesc;
    }
    public final long getMDuration(){
       return this.mDuration;
    }
    public final void setMDesc(String p0){
       this.mDesc = p0;
    }
    public final void setMDuration(long p0){
       this.mDuration = p0;
    }
}
