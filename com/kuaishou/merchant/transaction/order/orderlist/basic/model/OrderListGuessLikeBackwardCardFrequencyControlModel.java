package com.kuaishou.merchant.transaction.order.orderlist.basic.model.OrderListGuessLikeBackwardCardFrequencyControlModel;
import java.io.Serializable;
import java.lang.Object;

public class OrderListGuessLikeBackwardCardFrequencyControlModel implements Serializable	// class@00085b
{
    public float mExpiration;
    public int mMinClickNum;
    public static final long serialVersionUID = 0xf90bb38f0995120c;

    public void OrderListGuessLikeBackwardCardFrequencyControlModel(){
       super();
       this.mExpiration = 0xbf800000;
       this.mMinClickNum = -1;
    }
}
