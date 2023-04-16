package com.kuaishou.merchant.customerservice.notification.CustomerServiceLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CustomerServiceLogBiz extends Enum implements a	// class@001684
{
    public final String mBiz;
    public static final CustomerServiceLogBiz[] $VALUES;
    public static final CustomerServiceLogBiz NOTIFICATION;

    static {
       CustomerServiceLogBiz uCustomerSer = new CustomerServiceLogBiz("NOTIFICATION", 0, "Notification");
       CustomerServiceLogBiz.NOTIFICATION = uCustomerSer;
       CustomerServiceLogBiz[] uCustomerSer1 = new CustomerServiceLogBiz[]{uCustomerSer};
       CustomerServiceLogBiz.$VALUES = uCustomerSer1;
    }
    public void CustomerServiceLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = "CustomerService"+p2;
    }
    public static CustomerServiceLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CustomerServiceLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CustomerServiceLogBiz.class, p0);
    }
    public static CustomerServiceLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, CustomerServiceLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CustomerServiceLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
