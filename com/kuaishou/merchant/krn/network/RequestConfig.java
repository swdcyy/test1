package com.kuaishou.merchant.krn.network.RequestConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.Map;

public class RequestConfig implements Serializable	// class@00186b
{
    public String method;
    public Map params;
    public String url;
    public static final long serialVersionUID = 0xafb7cfa70d9b3ba5;

    public void RequestConfig(){
       super();
    }
    public String getMethod(){
       return this.method;
    }
    public Map getParams(){
       return this.params;
    }
    public String getUrl(){
       return this.url;
    }
    public void setMethod(String p0){
       this.method = p0;
    }
    public void setParams(Map p0){
       this.params = p0;
    }
    public void setUrl(String p0){
       this.url = p0;
    }
}
