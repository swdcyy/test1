package com.google.protobuf.Duration$Builder;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Duration$1;

public final class Duration$Builder extends GeneratedMessageLite$Builder implements DurationOrBuilder	// class@0003f7
{

    public void Duration$Builder(){
       super(Duration.DEFAULT_INSTANCE);
    }
    public void Duration$Builder(Duration$1 p0){
       super();
    }
    public Duration$Builder clearNanos(){
       this.copyOnWrite();
       this.instance.clearNanos();
       return this;
    }
    public Duration$Builder clearSeconds(){
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
    public Duration$Builder setNanos(int p0){
       this.copyOnWrite();
       this.instance.setNanos(p0);
       return this;
    }
    public Duration$Builder setSeconds(long p0){
       this.copyOnWrite();
       this.instance.setSeconds(p0);
       return this;
    }
}
