package com.alipay.android.phone.mrpc.core.HttpUrlHeader;
import java.io.Serializable;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.util.Map;

public class HttpUrlHeader implements Serializable	// class@000e38
{
    public Map headers;
    public static final long serialVersionUID = 0xab5f1ad78bf8a382;

    public void HttpUrlHeader(){
       this.headers = new HashMap();
    }
    public String getHead(String p0){
       return this.headers.get(p0);
    }
    public Map getHeaders(){
       return this.headers;
    }
    public void setHead(String p0,String p1){
       this.headers.put(p0, p1);
    }
    public void setHeaders(Map p0){
       this.headers = p0;
    }
}
