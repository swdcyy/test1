package com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PayButtonEnableCondition;
import java.io.Serializable;
import java.lang.Object;

public class PayButtonEnableCondition implements Serializable	// class@000805
{
    public boolean mEnable;
    public int mType;
    public static final long serialVersionUID = 0xa8ac50b2d7223388;

    public void PayButtonEnableCondition(int p0,boolean p1){
       super();
       this.mType = p0;
       this.mEnable = p1;
    }
}
