package com.kuaishou.share.ResultPackageForSync$InternalCustomProtoEvent$a;
import com.kuaishou.share.ResultPackageForSync$c;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.share.ResultPackageForSync$InternalCustomProtoEvent;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.share.ResultPackageForSync$a;
import com.kuaishou.share.ResultPackage;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class ResultPackageForSync$InternalCustomProtoEvent$a extends GeneratedMessageLite$Builder implements ResultPackageForSync$c	// class@000f24
{

    public void ResultPackageForSync$InternalCustomProtoEvent$a(){
       super(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE);
    }
    public void ResultPackageForSync$InternalCustomProtoEvent$a(ResultPackageForSync$a p0){
       super(ResultPackageForSync$InternalCustomProtoEvent.DEFAULT_INSTANCE);
    }
    public ResultPackage getPayload(){
       return this.instance.getPayload();
    }
    public String getType(){
       return this.instance.getType();
    }
    public ByteString getTypeBytes(){
       return this.instance.getTypeBytes();
    }
    public boolean hasPayload(){
       return this.instance.hasPayload();
    }
}
