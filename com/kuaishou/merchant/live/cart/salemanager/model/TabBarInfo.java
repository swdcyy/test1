package com.kuaishou.merchant.live.cart.salemanager.model.TabBarInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class TabBarInfo implements Serializable	// class@0019f3
{
    public List mTabInfoList;
    public String mTabTitle;
    public static final long serialVersionUID = 0xc8c80e98143f8947;

    public void TabBarInfo(){
       super();
    }
    public boolean isDadaInvalid(){
       Object obj = PatchProxy.apply(null, this, TabBarInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (q.f(this.mTabInfoList) && TextUtils.x(this.mTabTitle))? true: false;
       return b;
    }
}
