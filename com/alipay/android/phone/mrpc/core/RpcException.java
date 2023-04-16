package com.alipay.android.phone.mrpc.core.RpcException;
import java.lang.RuntimeException;
import java.lang.Integer;
import java.lang.String;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.Object;

public class RpcException extends RuntimeException	// class@000e39
{
    public int mCode;
    public String mMsg;
    public String mOperationType;
    public static final long serialVersionUID = 0xd81864610beceaca;

    public void RpcException(Integer p0,String p1){
       super(RpcException.a(p0, p1));
       this.mCode = p0.intValue();
       this.mMsg = p1;
    }
    public void RpcException(Integer p0,String p1,Throwable p2){
       super(RpcException.a(p0, p1), p2);
       this.mCode = p0.intValue();
       this.mMsg = p1;
    }
    public void RpcException(Integer p0,Throwable p1){
       this.mCode = p0.intValue();
    }
    public void RpcException(String p0){
       super(p0);
       this.mCode = 0;
       this.mMsg = p0;
    }
    public static String a(Integer p0,String p1){
       StringBuilder str = "RPCException: ";
       if (p0 != null) {
          str = str+"["+p0+"]";
       }
       str = str+" : ";
       if (p1 != null) {
          str = str+p1;
       }
       return str;
    }
    public int getCode(){
       return this.mCode;
    }
    public String getMsg(){
       return this.mMsg;
    }
    public String getOperationType(){
       return this.mOperationType;
    }
    public void setOperationType(String p0){
       this.mOperationType = p0;
    }
}
