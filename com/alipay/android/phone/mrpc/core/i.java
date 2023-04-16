package com.alipay.android.phone.mrpc.core.i;
import com.alipay.android.phone.mrpc.core.g;
import com.alipay.android.phone.mrpc.core.h;
import com.alipay.android.phone.mrpc.core.aa;
import java.lang.Object;
import java.lang.String;
import com.alipay.android.phone.mrpc.core.ab;
import android.content.Context;
import com.alipay.android.phone.mrpc.core.l;

public final class i implements g	// class@000e4e
{
    public final aa a;
    public final h b;

    public void i(h p0,aa p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final String a(){
       return this.a.a();
    }
    public final ab b(){
       return l.a(h.a(this.b).getApplicationContext());
    }
    public final aa c(){
       return this.a;
    }
    public final boolean d(){
       return this.a.c();
    }
}
