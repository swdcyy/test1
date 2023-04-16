package com.yxcorp.login.logger.AccountLoggerInterceptor$ApiDetail;
import java.io.Serializable;
import com.yxcorp.login.logger.AccountLoggerInterceptor;
import java.lang.String;
import java.lang.Object;

public class AccountLoggerInterceptor$ApiDetail implements Serializable	// class@001ae2
{
    public String host;
    public String parameters;
    public String path;
    public final AccountLoggerInterceptor this$0;
    public static final long serialVersionUID = 0xa9297299bcfde82;

    public void AccountLoggerInterceptor$ApiDetail(AccountLoggerInterceptor p0,String p1,String p2,String p3){
       this.this$0 = p0;
       super();
       this.host = p2;
       this.path = p1;
       this.parameters = p3;
    }
}
