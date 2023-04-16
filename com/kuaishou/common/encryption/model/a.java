package com.kuaishou.common.encryption.model.a;
import java.lang.Object;
import java.lang.String;
import com.google.gson.Gson;

public abstract class a	// class@0016c9
{
    public long clientTimestamp;
    public long seqId;
    public long visitorId;

    public void a(){
       super();
    }
    public long getClientTimestamp(){
       return this.clientTimestamp;
    }
    public long getSeqId(){
       return this.seqId;
    }
    public long getVisitorId(){
       return this.visitorId;
    }
    public String toJson(){
       return new Gson().q(this);
    }
}
