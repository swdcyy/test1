package com.alipay.android.phone.mrpc.core.a.d;
import com.alipay.android.phone.mrpc.core.a.a;
import java.lang.reflect.Type;
import java.lang.Object;
import java.lang.String;
import java.lang.Thread;
import org.json.JSONObject;
import d6.e;
import com.alipay.android.phone.mrpc.core.RpcException;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Exception;

public final class d extends a	// class@000e3d
{

    public void d(Type p0,byte[] p1){
       super(p0, p1);
    }
    public final Object a(){
       String str;
       try{
          Thread.currentThread().getId();
          JSONObject jSONObject = new JSONObject(new String(this.b));
          int intx = jSONObject.getInt("resultStatus");
          if (intx != 1000) {
             throw new RpcException(Integer.valueOf(intx), jSONObject.optString("tips"));
          }
          str = (this.a == String.class)? jSONObject.optString("result"): e.b(jSONObject.optString("result"), this.a);
          return str;
       }catch(java.lang.Exception e0){
          Integer integer = Integer.valueOf(10);
          str = ("response  ="+new String(this.b)+":"+e0 == null)? "": e0.getMessage();
          throw new RpcException(integer, str);
       }
    }
}
