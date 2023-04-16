package com.yxcorp.gifshow.detail.common.information.interestadjust.InterestWeight;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;

public class InterestWeight implements Serializable	// class@001424
{
    public String interestId;
    public int weight;
    public static final long serialVersionUID = 0x2416d375729747b8;

    public void InterestWeight(String p0,int p1){
       super();
       this.interestId = p0;
       this.weight = p1;
    }
}
