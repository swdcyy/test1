package com.kuaishou.merchant.live.cart.salemanager.model.TabBarInfo$TabInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z1.d;
import java.lang.Number;
import java.lang.Integer;

public class TabBarInfo$TabInfo implements Serializable	// class@0019f2
{
    public boolean mAutoSelected;
    public int mCommodityGroupId;
    public String mTabTitle;
    public static final long serialVersionUID = 0xbb983db3a5bc92d4;

    public void TabBarInfo$TabInfo(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TabBarInfo$TabInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (this.mCommodityGroupId != p0.mCommodityGroupId || !d.a(this.mTabTitle, p0.mTabTitle)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, TabBarInfo$TabInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mTabTitle,Integer.valueOf(this.mCommodityGroupId)};
       return d.b(obj);
    }
}
