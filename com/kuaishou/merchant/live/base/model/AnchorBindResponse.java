package com.kuaishou.merchant.live.base.model.AnchorBindResponse;
import java.io.Serializable;
import com.kuaishou.merchant.live.base.model.AnchorBindResponse$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;

public final class AnchorBindResponse implements Serializable	// class@001878
{
    public List mErrorMsgList;
    public boolean mHasChooseCommodities;
    public String mOpenedSwitch;
    public static final AnchorBindResponse$a Companion;
    public static final long serialVersionUID;

    static {
       AnchorBindResponse.Companion = new AnchorBindResponse$a(null);
    }
    public void AnchorBindResponse(String p0,boolean p1,List p2){
       super();
       this.mOpenedSwitch = p0;
       this.mHasChooseCommodities = p1;
       this.mErrorMsgList = p2;
    }
    public final List getMErrorMsgList(){
       return this.mErrorMsgList;
    }
    public final boolean getMHasChooseCommodities(){
       return this.mHasChooseCommodities;
    }
    public final String getMOpenedSwitch(){
       return this.mOpenedSwitch;
    }
    public final void setMErrorMsgList(List p0){
       this.mErrorMsgList = p0;
    }
    public final void setMHasChooseCommodities(boolean p0){
       this.mHasChooseCommodities = p0;
    }
    public final void setMOpenedSwitch(String p0){
       this.mOpenedSwitch = p0;
    }
}
