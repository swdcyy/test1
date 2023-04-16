package com.alipay.android.phone.mrpc.core.HttpException;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;

public class HttpException extends Exception	// class@000e37
{
    public int mCode;
    public String mMsg;
    public static final long serialVersionUID = 0xa848d3cb6c56eb34;

    public void HttpException(Integer p0,String p1){
       StringBuilder str = "Http Transport error";
       if (p0 != null) {
          str = str+"["+p0+"]";
       }
       str = str+" : ";
       if (p1 != null) {
          str = str+p1;
       }
       super(str);
       this.mCode = p0.intValue();
       this.mMsg = p1;
       return;
    }
    public void HttpException(String p0){
       super(p0);
       this.mCode = 0;
       this.mMsg = p0;
    }
    public int getCode(){
       return this.mCode;
    }
    public String getMsg(){
       return this.mMsg;
    }
}
