package com.kuaishou.merchant.transaction.purchase.presenter.b0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import um4.t0;
import com.kuaishou.merchant.transaction.purchase.presenter.a0;
import java.lang.Object;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$f;

public class b0 extends Accessor	// class@000966
{
    public final a0 c;
    public final t0 d;

    public void b0(t0 p0,a0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.p;
    }
    public void set(Object p0){
       this.c.p = p0;
    }
}
