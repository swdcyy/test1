package com.kuaishou.merchant.live.basic.model.CartStatusLoopResponse;
import java.io.Serializable;
import com.kuaishou.merchant.live.basic.model.CartStatusLoopResponse$RetryConfig;
import java.lang.Object;

public class CartStatusLoopResponse implements Serializable	// class@001891
{
    public CartStatusLoopResponse$RetryConfig mRetryConfig;
    public boolean mShowYellowCart;
    public static final CartStatusLoopResponse$RetryConfig DEFAULT_CONFIG;
    public static final long serialVersionUID;

    static {
       CartStatusLoopResponse.DEFAULT_CONFIG = new CartStatusLoopResponse$RetryConfig();
    }
    public void CartStatusLoopResponse(){
       super();
    }
}
