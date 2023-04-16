package com.kuaishou.merchant.live.basic.model.GeneralCouponInfo$Button;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class GeneralCouponInfo$Button implements Serializable	// class@001893
{
    public String mIconUrl;
    public String mTitle;
    public static final long serialVersionUID = 0xd4208f03197b7dee;

    public void GeneralCouponInfo$Button(){
       super();
    }
    public boolean isButtonEmpty(){
       Object obj = PatchProxy.apply(null, this, GeneralCouponInfo$Button.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.isEmpty(this.mTitle) || TextUtils.isEmpty(this.mIconUrl))? true: false;
       return b;
    }
}
