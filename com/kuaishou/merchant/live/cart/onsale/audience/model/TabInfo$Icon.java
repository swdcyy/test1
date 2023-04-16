package com.kuaishou.merchant.live.cart.onsale.audience.model.TabInfo$Icon;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class TabInfo$Icon implements Serializable	// class@00195b
{
    public int mHeight;
    public String mNormalUrl;
    public String mSelectedUrl;
    public int mWidth;
    public static final long serialVersionUID = 0x82762d459afb0f62;

    public void TabInfo$Icon(){
       super();
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, TabInfo$Icon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.mNormalUrl) && (!TextUtils.x(this.mSelectedUrl) && (this.mHeight > null && this.mWidth > null)))? true: false;
       return b;
    }
}
