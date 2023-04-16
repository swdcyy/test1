package com.yxcorp.gateway.pay.logger.LogItem;
import java.io.Serializable;
import java.lang.Object;

public class LogItem implements Serializable	// class@00122d
{
    public String msg;
    public JsonObject paramJson;
    public String tag;
    public String ts;

    public void LogItem(){
       super();
    }
}
