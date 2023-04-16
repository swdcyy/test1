package com.kwai.feature.api.live.merchant.top.config.a;
import ok.h;
import java.lang.Object;
import com.kwai.feature.api.live.merchant.top.config.LiveTopPendantItemConfig;
import java.util.Objects;
import java.lang.Integer;

public final class a implements h	// class@000fe5
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       Objects.requireNonNull(p0);
       return Integer.valueOf(p0.mBizId);
    }
}
