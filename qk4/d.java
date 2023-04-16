package qk4.d;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BuyButton;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;

public interface abstract d	// class@002ebc
{

    void a();
    void b();
    PageInfoReqParam c();
    void d(PageInfoReqParam p0,boolean p1);
    void e(int p0,boolean p1,BuyButton p2);
    void f();
    void g(SkuInfo p0);
    boolean h();
    void i();
    void j(boolean p0);
    void k(PaymentMethodInfo p0);
    void l(PageInfoReqParam p0,boolean p1,int p2);
    boolean m();
}
