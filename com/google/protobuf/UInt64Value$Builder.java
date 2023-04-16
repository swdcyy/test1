package com.google.protobuf.UInt64Value$Builder;
import com.google.protobuf.UInt64ValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.UInt64Value;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.UInt64Value$1;

public final class UInt64Value$Builder extends GeneratedMessageLite$Builder implements UInt64ValueOrBuilder	// class@0004da
{

    public void UInt64Value$Builder(){
       super(UInt64Value.DEFAULT_INSTANCE);
    }
    public void UInt64Value$Builder(UInt64Value$1 p0){
       super();
    }
    public UInt64Value$Builder clearValue(){
       this.copyOnWrite();
       this.instance.clearValue();
       return this;
    }
    public long getValue(){
       return this.instance.getValue();
    }
    public UInt64Value$Builder setValue(long p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
}
