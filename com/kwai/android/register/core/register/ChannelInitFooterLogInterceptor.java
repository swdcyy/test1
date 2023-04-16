package com.kwai.android.register.core.register.ChannelInitFooterLogInterceptor;
import com.kwai.android.register.core.register.BaseChannelInitLogInterceptor;
import com.kwai.android.common.intercept.Chain;
import com.kwai.android.register.core.register.RegisterChain;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Boolean;
import java.lang.NullPointerException;
import java.lang.Long;

public final class ChannelInitFooterLogInterceptor extends BaseChannelInitLogInterceptor	// class@0009f5
{

    public void ChannelInitFooterLogInterceptor(){
       super();
    }
    public void intercept(Chain p0){
       this.intercept(p0);
    }
    public void intercept(RegisterChain p0){
       Object obj;
       boolean b;
       long l;
       String str = "chain";
       try{
          a.p(p0, str);
          obj = p0.getInternalParam$lib_register_release().get("isAbort");
          if (obj != null) {
             b = obj.booleanValue();
          }else {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
          }
       }catch(java.lang.Exception e0){
          b = false;
       }
       if (b) {
          try{
             obj = p0.getInternalParam$lib_register_release().get("initTimeStamp");
             if (obj != null) {
                l = obj.longValue();
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
             }
          }catch(java.lang.Exception e0){
             l = 0;
          }
          this.logNotification(p0, l);
       }
       p0.proceed();
       return;
    }
}
