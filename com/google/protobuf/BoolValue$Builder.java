package com.google.protobuf.BoolValue$Builder;
import com.google.protobuf.BoolValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.BoolValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.BoolValue$1;

public final class BoolValue$Builder extends GeneratedMessageLite$Builder implements BoolValueOrBuilder	// class@0003c2
{

    public void BoolValue$Builder(){
       super(BoolValue.DEFAULT_INSTANCE);
    }
    public void BoolValue$Builder(BoolValue$1 p0){
       super();
    }
    public BoolValue$Builder clearValue(){
       this.copyOnWrite();
       this.instance.clearValue();
       return this;
    }
    public boolean getValue(){
       return this.instance.getValue();
    }
    public BoolValue$Builder setValue(boolean p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
}
