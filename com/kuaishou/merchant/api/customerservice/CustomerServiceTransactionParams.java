package com.kuaishou.merchant.api.customerservice.CustomerServiceTransactionParams;
import java.io.Serializable;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.x0;
import java.lang.Integer;

public class CustomerServiceTransactionParams implements Serializable	// class@00155f
{
    public int mCategory;
    public String mLogParams;
    public String mSubbizId;
    public String mTargetId;
    public static final long serialVersionUID = 0x7e05c24d5f16680a;

    public void CustomerServiceTransactionParams(){
       super();
    }
    public static CustomerServiceTransactionParams parseUri(Uri p0){
       CustomerServiceTransactionParams obj = PatchProxy.applyOneRefs(p0, null, CustomerServiceTransactionParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CustomerServiceTransactionParams();
       if (p0 != null && p0.isHierarchical()) {
          try{
             obj.mCategory = Integer.valueOf(x0.a(p0, "category")).intValue();
          }catch(java.lang.NumberFormatException e0){
             e0.mCategory = 0;
          }
          e0.mTargetId = x0.a(p0, "targetId");
          e0.mSubbizId = x0.a(p0, "subbiz");
          e0.mLogParams = x0.a(p0, "logParams");
       }
       return obj;
    }
}
