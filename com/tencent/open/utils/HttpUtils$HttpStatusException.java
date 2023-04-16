package com.tencent.open.utils.HttpUtils$HttpStatusException;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.String;

public class HttpUtils$HttpStatusException extends Exception	// class@000f6e
{
    public final int statusCode;

    public void HttpUtils$HttpStatusException(int p0){
       super("http status code error:"+p0);
       this.statusCode = p0;
    }
    public void HttpUtils$HttpStatusException(String p0){
       super(p0);
       this.statusCode = -1;
    }
}
