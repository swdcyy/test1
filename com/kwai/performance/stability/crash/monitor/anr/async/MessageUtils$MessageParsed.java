package com.kwai.performance.stability.crash.monitor.anr.async.MessageUtils$MessageParsed;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import android.os.IBinder;
import android.app.Service;
import com.kwai.performance.stability.crash.monitor.anr.async.MessageUtils;
import java.lang.StringBuilder;

public class MessageUtils$MessageParsed implements Serializable	// class@0011a3
{
    public String action;
    public String componentName;
    public long cost;
    public long costCpu;
    public long delay;
    public boolean fromQueue;
    public String intent;
    public boolean isOrdered;
    public boolean lockSched;
    public boolean mainThread;
    public long now;
    public String origin;
    public String receiver;
    public String service;
    public Object token;
    public int what;
    public long when;

    public void MessageUtils$MessageParsed(){
       super();
       this.what = -1;
       this.when = -1;
       this.delay = -1;
       this.now = -1;
       this.cost = -1;
       this.costCpu = -1;
    }
    public String getService(){
       MessageUtils$MessageParsed ttoken = this.token;
       Service service = (ttoken instanceof IBinder)? MessageUtils.g(ttoken): null;
       if (service != null) {
          this.service = service.toString();
       }
       return this.service;
    }
    public String toString(){
       return "MessageParsed{componentName=\'"+this.componentName+'''+", token=\'"+this.token+'''+", what="+this.what+", when="+this.when+", isOrdered="+this.isOrdered+", fromQueue="+this.fromQueue+'}';
    }
}
