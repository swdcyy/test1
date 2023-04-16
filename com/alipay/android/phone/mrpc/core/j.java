package com.alipay.android.phone.mrpc.core.j;
import com.alipay.android.phone.mrpc.core.a;
import com.alipay.android.phone.mrpc.core.g;
import java.lang.reflect.Method;
import java.lang.String;
import java.lang.Object;
import com.alipay.android.phone.mrpc.core.o;
import org.apache.http.message.BasicHeader;
import java.util.UUID;
import org.apache.http.Header;
import com.alipay.android.phone.mrpc.core.aa;
import java.util.List;
import java.util.Iterator;
import java.lang.Thread;
import com.alipay.android.phone.mrpc.core.ab;
import com.alipay.android.phone.mrpc.core.t;
import java.util.concurrent.Future;
import com.alipay.android.phone.mrpc.core.u;
import com.alipay.android.phone.mrpc.core.RpcException;
import java.lang.Integer;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import com.alipay.android.phone.mrpc.core.HttpException;

public final class j extends a	// class@000e4f
{
    public g g;

    public void j(g p0,Method p1,int p2,String p3,byte[] p4,boolean p5){
       super(p1, p2, p3, p4, "application/x-www-form-urlencoded", p5);
       this.g = p0;
    }
    public final Object a(){
       int i;
       String str = "";
       o oo = new o(this.g.a());
       oo.a(this.b);
       oo.a(this.e);
       oo.a(this.f);
       oo.a("id", String.valueOf(this.d));
       oo.a("operationType", this.c);
       oo.a("gzip", String.valueOf(this.g.d()));
       oo.a(new BasicHeader("uuid", UUID.randomUUID().toString()));
       List list = this.g.c().b();
       if (list != null && !list.isEmpty()) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             oo.a(iterator.next());
          }
       }
       Thread.currentThread().getId();
       oo.toString();
       try{
          i = 13;
          u ou = this.g.b().a(oo).get();
          if (ou != null) {
             return ou.b();
          }else {
             throw new RpcException(Integer.valueOf(9), "response is null");
          }
       }catch(java.lang.InterruptedException e1){
          throw new RpcException(Integer.valueOf(i), str, e1);
       }catch(java.util.concurrent.ExecutionException e1){
          Throwable cause = e1.getCause();
          if (cause != null && cause instanceof HttpException) {
             int code = cause.getCode();
             switch (code){
                 case 1:
                   code = 2;
                   break;
                 case 2:
                   code = 3;
                   break;
                 case 3:
                   code = 4;
                   break;
                 case 4:
                   code = 5;
                   break;
                 case 5:
                   code = 6;
                   break;
                 case 6:
                   code = 7;
                   break;
                 case 7:
                   code = 8;
                   break;
                 case 8:
                   code = 15;
                   break;
                 case 9:
                   code = 16;
                   break;
                 default:
             }
             throw new RpcException(Integer.valueOf(code), cause.getMsg());
          }else {
             throw new RpcException(Integer.valueOf(9), str, e1);
          }
       }catch(java.util.concurrent.CancellationException e1){
          throw new RpcException(Integer.valueOf(i), str, e1);
       }
    }
}
