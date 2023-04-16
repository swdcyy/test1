package com.kuaishou.merchant.container.mixhalf.bean.LiveMerchantHalfMixContainerTabParams$TabStyles;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveMerchantHalfMixContainerTabParams$TabStyles implements Serializable	// class@00164b
{
    public String mDividerColor;
    public String mUnselectedBackgroundColor;
    public String mUnselectedTitleColor;
    public static final long serialVersionUID = 0xbf08f0cb586cf313;

    public void LiveMerchantHalfMixContainerTabParams$TabStyles(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveMerchantHalfMixContainerTabParams$TabStyles.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TabStyles{mUnselectedTitleColor=\'"+this.mUnselectedTitleColor+'''+", mUnselectedBackgroundColor=\'"+this.mUnselectedBackgroundColor+'''+", mDividerColor=\'"+this.mDividerColor+'''+'}';
    }
}
