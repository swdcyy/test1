package com.kuaishou.merchant.api.core.model.Commodity$OrderInfo;
import java.io.Serializable;
import java.lang.Object;

public class Commodity$OrderInfo implements Serializable	// class@00151d
{
    public int mBeginTimeMills;
    public boolean mHaveDelayShowTimeOut;
    public int mIntervalMills;
    public boolean mIsFlipperEnd;
    public List mItems;
    public static final long serialVersionUID = 0x6ddf99ed55b389d3;

    public void Commodity$OrderInfo(){
       super();
       this.mHaveDelayShowTimeOut = false;
       this.mIsFlipperEnd = false;
    }
}
