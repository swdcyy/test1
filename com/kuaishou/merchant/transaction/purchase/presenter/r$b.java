package com.kuaishou.merchant.transaction.purchase.presenter.r$b;
import com.kuaishou.merchant.transaction.purchase.presenter.r$g;
import com.kuaishou.merchant.transaction.purchase.presenter.r;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;

public class r$b implements r$g	// class@00099e
{
    public final r a;

    public void r$b(r p0){
       this.a = p0;
       super();
    }
    public String a(){
       String str = (this.a.R != null)? "frontCashier": "defaultCashier";
       return str;
    }
    public int b(){
       return this.a.S;
    }
    public String c(){
       return "fullScreenSubmitOrderPage";
    }
    public String d(){
       r r = this.a.R;
       PaymentMethodInfo mProviderCha = (r != null)? r.mProviderChannelType: "";
       return mProviderCha;
    }
    public long e(){
       return this.a.U;
    }
    public long f(){
       return this.a.T;
    }
    public String g(){
       r r = this.a.R;
       PaymentMethodInfo mPaymentMeth = (r != null)? r.mPaymentMethod: "";
       return mPaymentMeth;
    }
    public String getProvider(){
       r r = this.a.R;
       PaymentMethodInfo mProvider = (r != null)? r.mProvider: "";
       return mProvider;
    }
}
