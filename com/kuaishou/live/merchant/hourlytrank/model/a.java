package com.kuaishou.live.merchant.hourlytrank.model.a;
import erd.r;
import java.lang.Object;
import com.kuaishou.live.merchant.hourlytrank.model.LiveMerchantHourlyRankResponse$RankTag;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class a implements r	// class@000cd7
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean test(Object p0){
       return (TextUtils.isEmpty(p0.mTagName) ^ 0x01);
    }
}
