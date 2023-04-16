package com.kuaishou.merchant.transaction.purchase.presenter.p0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import um4.b2;
import com.kuaishou.merchant.transaction.purchase.presenter.o0;
import java.lang.Object;
import com.kuaishou.merchant.transaction.purchase.presenter.o0$d;

public class p0 extends Accessor	// class@000997
{
    public final o0 c;
    public final b2 d;

    public void p0(b2 p0,o0 p1){
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
