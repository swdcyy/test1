package com.kuaishou.merchant.basic.MerchantWebViewEvent;
import com.kuaishou.merchant.basic.MerchantWebViewEvent$EventType;
import java.lang.String;
import java.lang.Object;

public class MerchantWebViewEvent	// class@00159c
{
    public String a;
    public MerchantWebViewEvent$EventType b;

    public void MerchantWebViewEvent(MerchantWebViewEvent$EventType p0,String p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public MerchantWebViewEvent$EventType a(){
       return this.b;
    }
    public String b(){
       return this.a;
    }
}
