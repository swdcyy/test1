package com.kuaishou.merchant.transaction.purchase.i0;
import ekd.q$b;
import java.lang.Object;
import com.kuaishou.merchant.transaction.purchase.model.ProductInfo$ServiceRule;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class i0 implements q$b	// class@000933
{
    public static final i0 a;

    static {
       i0.a = new i0();
    }
    public void i0(){
       super();
    }
    public final boolean a(Object p0){
       ProductInfo$ServiceRule mCode = p0.mCode;
       boolean b = (mCode != 100 && (mCode != 200 && (mCode != 300 && !TextUtils.x(p0.mMsg))))? true: false;
       return b;
    }
}
