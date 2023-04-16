package com.kwai.component.payment.bridge.params.KsCoinHalfScreenRechargeParams;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class KsCoinHalfScreenRechargeParams implements Serializable	// class@0009fa
{
    public String mCallback;
    public String mExtraParams;
    public int mMaxHeight;
    public boolean mNewContainer;
    public String mPageType;
    public boolean mShowCloseBtn;
    public boolean mShowMask;
    public String mSource;
    public long mTargetCoin;
    public String mTraceId;
    public String mUrl;
    public static final long serialVersionUID = 0x23515e1042e55aac;

    public void KsCoinHalfScreenRechargeParams(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KsCoinHalfScreenRechargeParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "mUrl: "+this.mUrl+", mSource: "+this.mSource+", mTargetDou: "+this.mTargetCoin+", mNewContainer: "+this.mNewContainer+", mMaxHeight: "+this.mMaxHeight+", mShowMask: "+this.mShowMask+", mShowCloseBtn: "+this.mShowCloseBtn;
    }
}
