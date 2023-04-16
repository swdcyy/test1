package com.google.protobuf.Timestamp$Builder;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp$1;

public final class Timestamp$Builder extends GeneratedMessageLite$Builder implements TimestampOrBuilder	// class@0004cc
{

    public void Timestamp$Builder(){
       super(Timestamp.DEFAULT_INSTANCE);
    }
    public void Timestamp$Builder(Timestamp$1 p0){
       super();
    }
    public Timestamp$Builder clearNanos(){
       this.copyOnWrite();
       this.instance.clearNanos();
       return this;
    }
    public Timestamp$Builder clearSeconds(){
       this.copyOnWrite();
       this.instance.clearSeconds();
       return this;
    }
    public int getNanos(){
       return this.instance.getNanos();
    }
    public long getSeconds(){
       return this.instance.getSeconds();
    }
    public Timestamp$Builder setNanos(int p0){
       this.copyOnWrite();
       this.instance.setNanos(p0);
       return this;
    }
    public Timestamp$Builder setSeconds(long p0){
       this.copyOnWrite();
       this.instance.setSeconds(p0);
       return this;
    }
}
