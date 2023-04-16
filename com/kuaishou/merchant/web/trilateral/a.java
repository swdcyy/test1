package com.kuaishou.merchant.web.trilateral.a;
import com.alipay.sdk.app.H5PayCallback;
import com.kuaishou.merchant.web.trilateral.b;
import java.lang.Object;
import d7.a;
import java.util.Objects;
import cn4.e;
import java.lang.Runnable;
import ekd.k1;

public final class a implements H5PayCallback	// class@0009df
{
    public final b a;

    public void a(b p0){
       this.a = p0;
    }
    public final void onPayResult(a p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       k1.o(new e(ta, p0));
    }
}
