package com.kuaishou.share.ResultPackageForSync$b;
import com.kuaishou.share.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.share.ResultPackageForSync;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.share.ResultPackageForSync$a;
import com.kuaishou.share.ResultPackageForSync$InternalCustomProtoEvent;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class ResultPackageForSync$b extends GeneratedMessageLite$Builder implements b	// class@000f27
{

    public void ResultPackageForSync$b(){
       super(ResultPackageForSync.DEFAULT_INSTANCE);
    }
    public void ResultPackageForSync$b(ResultPackageForSync$a p0){
       super(ResultPackageForSync.DEFAULT_INSTANCE);
    }
    public long getClientIncrementId(){
       return this.instance.getClientIncrementId();
    }
    public long getClientTimestamp(){
       return this.instance.getClientTimestamp();
    }
    public ResultPackageForSync$InternalCustomProtoEvent getCustomProtoEvent(){
       return this.instance.getCustomProtoEvent();
    }
    public long getServerTimestamp(){
       return this.instance.getServerTimestamp();
    }
    public String getSessionId(){
       return this.instance.getSessionId();
    }
    public ByteString getSessionIdBytes(){
       return this.instance.getSessionIdBytes();
    }
    public boolean hasCustomProtoEvent(){
       return this.instance.hasCustomProtoEvent();
    }
}
