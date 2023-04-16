package com.google.protobuf.UInt32Value$Builder;
import com.google.protobuf.UInt32ValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.UInt32Value$1;

public final class UInt32Value$Builder extends GeneratedMessageLite$Builder implements UInt32ValueOrBuilder	// class@0004d6
{

    public void UInt32Value$Builder(){
       super(UInt32Value.DEFAULT_INSTANCE);
    }
    public void UInt32Value$Builder(UInt32Value$1 p0){
       super();
    }
    public UInt32Value$Builder clearValue(){
       this.copyOnWrite();
       this.instance.clearValue();
       return this;
    }
    public int getValue(){
       return this.instance.getValue();
    }
    public UInt32Value$Builder setValue(int p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
}
