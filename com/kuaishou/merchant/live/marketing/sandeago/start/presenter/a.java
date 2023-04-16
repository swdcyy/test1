package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.a;
import ym4.b;
import java.lang.Object;
import com.kuaishou.merchant.web.MerchantNotifyParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import js6.a;
import java.lang.String;

public final class a implements b	// class@001a70
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void callback(Object p0){
       if (!p0 instanceof MerchantNotifyParams) {
       }else if(!TextUtils.x(p0.mData) && p0.mType == 2){
          a.b.GO("KSLiveMerchantCategorySelectionNotification", p0);
       }
       return;
    }
}
