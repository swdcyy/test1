package com.alipay.android.phone.mrpc.core.a.e;
import com.alipay.android.phone.mrpc.core.a.b;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;
import d6.f;
import java.lang.StringBuilder;
import java.util.Objects;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import com.alipay.android.phone.mrpc.core.RpcException;
import java.lang.Integer;
import java.lang.Exception;
import java.lang.Throwable;

public final class e extends b	// class@000e3e
{
    public int c;
    public Object d;

    public void e(int p0,String p1,Object p2){
       this.c = p0;
    }
    public final void a(Object p0){
       this.d = p0;
    }
    public final byte[] a(){
       String str;
       try{
          ArrayList uArrayList = new ArrayList();
          if (this.d != null) {
             uArrayList.add(new BasicNameValuePair("extParam", f.a(this.d)));
          }
          uArrayList.add(new BasicNameValuePair("operationType", this.a));
          try{
             String str1 = "id";
             uArrayList.add(new BasicNameValuePair(str1, this.c));
             Objects.toString(this.b);
             b tb = this.b;
             str = (tb == null)? "[]": f.a(tb);
             uArrayList.add(new BasicNameValuePair("requestData", str));
             return (URLEncodedUtils.format(uArrayList, "utf-8")).getBytes();
          }catch(java.lang.Exception e0){
             Integer integer = Integer.valueOf(9);
             str = ("request  ="+this.b+":"+e0 == null)? "": e0.getMessage();
             throw new RpcException(integer, str, e0);
          }
       }catch(java.lang.Exception e0){
       }
    }
}
