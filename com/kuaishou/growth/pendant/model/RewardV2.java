package com.kuaishou.growth.pendant.model.RewardV2;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.RewardV2$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import nsd.r0;
import java.lang.Integer;
import java.util.Arrays;

public final class RewardV2 implements Serializable	// class@000688
{
    public int mCoinType;
    public double mRewardCount;
    public String mRewardCountStr;
    public String mRewardLinkUrl;
    public String mRewardType;
    public HashMap mRewardTypeText;
    public static final RewardV2$a Companion;
    public static final long serialVersionUID;

    static {
       RewardV2.Companion = new RewardV2$a(null);
    }
    public void RewardV2(){
       super();
    }
    public final int getMCoinType(){
       return this.mCoinType;
    }
    public final double getMRewardCount(){
       return this.mRewardCount;
    }
    public final String getMRewardCountStr(){
       return this.mRewardCountStr;
    }
    public final String getMRewardLinkUrl(){
       return this.mRewardLinkUrl;
    }
    public final String getMRewardType(){
       return this.mRewardType;
    }
    public final HashMap getMRewardTypeText(){
       return this.mRewardTypeText;
    }
    public final double getRewardAmount(){
       Object obj = PatchProxy.apply(null, this, RewardV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = (a.g(this.mRewardType, "2"))? this.mRewardCount / (double)100: this.mRewardCount;
       return d;
    }
    public final String getRewardAmountText(){
       String str;
       RewardV2 obj = PatchProxy.apply(null, this, RewardV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mRewardCountStr;
       int i = 0;
       RewardV2 rewardV2 = (obj == null || !obj.length())? 1: null;
       if (rewardV2) {
          Object[] objArray = new Object[]{Integer.valueOf((int)this.mRewardCount)};
          str = String.format("+%d", Arrays.copyOf(objArray, 1));
          a.o(str, "java.lang.String.format\(format, *args\)");
       }
       return str;
    }
    public final void setMCoinType(int p0){
       this.mCoinType = p0;
    }
    public final void setMRewardCount(double p0){
       this.mRewardCount = p0;
    }
    public final void setMRewardCountStr(String p0){
       this.mRewardCountStr = p0;
    }
    public final void setMRewardLinkUrl(String p0){
       this.mRewardLinkUrl = p0;
    }
    public final void setMRewardType(String p0){
       this.mRewardType = p0;
    }
    public final void setMRewardTypeText(HashMap p0){
       this.mRewardTypeText = p0;
    }
}
