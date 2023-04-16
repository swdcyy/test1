package com.oplus.ocs.base.common.api.Api;
import java.lang.String;
import com.oplus.ocs.base.common.api.Api$AbstractClientBuilder;
import com.oplus.ocs.base.common.api.Api$ClientKey;
import java.lang.Object;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.common.api.Api$BaseClientBuilder;
import java.lang.IllegalStateException;

public class Api	// class@000ac8
{
    public Api$AbstractClientBuilder mClientBuilder;
    public Api$ClientKey mClientKey;
    public boolean mIsAuth;
    public String mName;

    public void Api(String p0,Api$AbstractClientBuilder p1,Api$ClientKey p2){
       super(p0, p1, p2, true);
    }
    public void Api(String p0,Api$AbstractClientBuilder p1,Api$ClientKey p2,boolean p3){
       super();
       d.a(p1, "can not construct whit the null AbstractClientBuilder");
       d.a(p2, "can not construct with the null ClientKey");
       this.mName = p0;
       this.mClientBuilder = p1;
       this.mClientKey = p2;
       this.mIsAuth = p3;
    }
    public Api$BaseClientBuilder getBaseClientBuilder(){
       return this.mClientBuilder;
    }
    public Api$AbstractClientBuilder getClientBuilder(){
       boolean b = (this.mClientBuilder != null)? true: false;
       d.a(b, "The ClientBuilder is null");
       return this.mClientBuilder;
    }
    public Api$ClientKey getClientKey(){
       Api tmClientKey = this.mClientKey;
       if (tmClientKey != null) {
          return tmClientKey;
       }
       throw new IllegalStateException("This API was constructed with null clientKey.");
    }
    public String getName(){
       return this.mName;
    }
    public boolean isAuth(){
       return this.mIsAuth;
    }
}
