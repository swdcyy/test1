package com.kuaishou.protobuf.kfs.feature.MetaInfo$b;
import er4.d;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.protobuf.kfs.feature.MetaInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.protobuf.kfs.feature.MetaInfo$a;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class MetaInfo$b extends GeneratedMessageLite$Builder implements d	// class@000bf8
{

    public void MetaInfo$b(){
       super(MetaInfo.DEFAULT_INSTANCE);
    }
    public void MetaInfo$b(MetaInfo$a p0){
       super(MetaInfo.DEFAULT_INSTANCE);
    }
    public int getDimension(){
       return this.instance.getDimension();
    }
    public long getFid(){
       return this.instance.getFid();
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
    }
}
