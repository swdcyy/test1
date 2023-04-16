package com.alipay.android.phone.mrpc.core.h;
import com.alipay.android.phone.mrpc.core.w;
import android.content.Context;
import java.lang.Class;
import com.alipay.android.phone.mrpc.core.aa;
import java.lang.Object;
import com.alipay.android.phone.mrpc.core.x;
import com.alipay.android.phone.mrpc.core.i;
import com.alipay.android.phone.mrpc.core.g;

public final class h extends w	// class@000e4d
{
    public Context a;

    public void h(Context p0){
       this.a = p0;
    }
    public static Context a(h p0){
       return p0.a;
    }
    public final Object a(Class p0,aa p1){
       return new x(new i(this, p1)).a(p0);
    }
}
