package com.kuaishou.merchant.container.mixhalf.bean.LiveMerchantHalfMixContainerTabParams$PageInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveMerchantHalfMixContainerTabParams$PageInfo implements Serializable	// class@00164a
{
    public String mActivityTitle;
    public int mActivityType;
    public int mComponentType;
    public String mSelectedBackgroundColor;
    public String mSelectedTitleColor;
    public String mUrl;
    public static final long serialVersionUID = 0x596e1ca54d3bcd37;

    public void LiveMerchantHalfMixContainerTabParams$PageInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantHalfMixContainerTabParams$PageInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PageInfo{mActivityType="+this.mActivityType+", mActivityTitle=\'"+this.mActivityTitle+'''+", mComponentType="+this.mComponentType+", mUrl=\'"+this.mUrl+'''+", mSelectedTitleColor=\'"+this.mSelectedTitleColor+'''+", mSelectedBackgroundColor=\'"+this.mSelectedBackgroundColor+'''+'}';
    }
}
