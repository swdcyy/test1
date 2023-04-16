package com.kuaishou.common.encryption.model.a$a;
import com.kuaishou.common.encryption.model.a;
import java.lang.Object;
import com.kuaishou.common.encryption.model.stats.LeaveAppStats$a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public abstract class a$a	// class@0016c8
{
    public final a a;

    public void a$a(a p0){
       super();
       this.a = p0;
    }
    public a a(){
       a$a ta = this.a;
       if (ta.seqId <= 0) {
          throw new IllegalArgumentException("need set seqId: "+this.a.seqId);
       }
       if (!this instanceof LeaveAppStats$a && ta.visitorId <= 0) {
          throw new IllegalArgumentException("invalid visitorId: "+this.a.visitorId);
       }
       if (ta.clientTimestamp > 0) {
          return ta;
       }
       throw new IllegalArgumentException("invalid clientTimestamp: "+this.a.clientTimestamp);
    }
}
