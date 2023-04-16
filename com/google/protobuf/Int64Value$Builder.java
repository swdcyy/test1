package com.google.protobuf.Int64Value$Builder;
import com.google.protobuf.Int64ValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Int64Value;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int64Value$1;

public final class Int64Value$Builder extends GeneratedMessageLite$Builder implements Int64ValueOrBuilder	// class@000442
{

    public void Int64Value$Builder(){
       super(Int64Value.DEFAULT_INSTANCE);
    }
    public void Int64Value$Builder(Int64Value$1 p0){
       super();
    }
    public Int64Value$Builder clearValue(){
       this.copyOnWrite();
       this.instance.clearValue();
       return this;
    }
    public long getValue(){
       return this.instance.getValue();
    }
    public Int64Value$Builder setValue(long p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
}
