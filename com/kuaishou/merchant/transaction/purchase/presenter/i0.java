package com.kuaishou.merchant.transaction.purchase.presenter.i0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import um4.q1;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter;
import java.lang.Object;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$d;

public class i0 extends Accessor	// class@00097f
{
    public final PaymentMethodPanelPresenter c;
    public final q1 d;

    public void i0(q1 p0,PaymentMethodPanelPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.q;
    }
    public void set(Object p0){
       this.c.q = p0;
    }
}
