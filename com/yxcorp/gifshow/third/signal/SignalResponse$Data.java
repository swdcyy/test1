package com.yxcorp.gifshow.third.signal.SignalResponse$Data;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class SignalResponse$Data implements Serializable	// class@001d9b
{
    public long coldIntervalInMs;
    public long triggerIntervalInMs;
    public static final long serialVersionUID = 0x5b9756c217167a5e;

    public void SignalResponse$Data(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SignalResponse$Data.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Data{coldIntervalInMs="+this.coldIntervalInMs+", triggerIntervalInMs="+this.triggerIntervalInMs+'}';
    }
}
