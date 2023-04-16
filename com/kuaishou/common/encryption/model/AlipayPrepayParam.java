package com.kuaishou.common.encryption.model.AlipayPrepayParam;
import com.kuaishou.common.encryption.model.GiftPrepayParam;
import com.kuaishou.common.encryption.model.AlipayPrepayParam$a;
import java.lang.String;

public class AlipayPrepayParam extends GiftPrepayParam	// class@0016ac
{
    public String returnUrl;

    public void AlipayPrepayParam(){
       super();
    }
    public static AlipayPrepayParam$a newBuilder(){
       return new AlipayPrepayParam$a();
    }
    public String getReturnUrl(){
       return this.returnUrl;
    }
}
