package com.frog.engine.network.xhr.FrogXHRTask;
import java.lang.Object;
import java.util.Map;
import android.util.Pair;
import com.frog.engine.network.xhr.FrogHttpMethod;
import java.lang.String;

public class FrogXHRTask	// class@001567
{
    public Map configs;
    public Pair dataAndType;
    public Map header;
    public FrogHttpMethod method;
    public long timeout;
    public String url;

    public void FrogXHRTask(){
       super();
    }
    public Map getConfigs(){
       return this.configs;
    }
    public Pair getDataAndType(){
       return this.dataAndType;
    }
    public Map getHeader(){
       return this.header;
    }
    public FrogHttpMethod getMethod(){
       return this.method;
    }
    public long getTimeout(){
       return this.timeout;
    }
    public String getUrl(){
       return this.url;
    }
    public void setConfigs(Map p0){
       this.configs = p0;
    }
    public void setDataAndType(Pair p0){
       this.dataAndType = p0;
    }
    public void setHeader(Map p0){
       this.header = p0;
    }
    public void setMethod(FrogHttpMethod p0){
       this.method = p0;
    }
    public void setTimeout(long p0){
       this.timeout = p0;
    }
    public void setUrl(String p0){
       this.url = p0;
    }
}
