package com.kuaishou.growth.pendant.model.BalanceTipBubbleConfigV2;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.BalanceTipBubbleConfigV2$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class BalanceTipBubbleConfigV2 implements Serializable	// class@000661
{
    public String mBubbleText;
    public String mUserType;
    public static final BalanceTipBubbleConfigV2$a Companion;
    public static final long serialVersionUID;

    static {
       BalanceTipBubbleConfigV2.Companion = new BalanceTipBubbleConfigV2$a(null);
    }
    public void BalanceTipBubbleConfigV2(){
       super();
    }
    public final String getMBubbleText(){
       return this.mBubbleText;
    }
    public final String getMUserType(){
       return this.mUserType;
    }
    public final void setMBubbleText(String p0){
       this.mBubbleText = p0;
    }
    public final void setMUserType(String p0){
       this.mUserType = p0;
    }
}
