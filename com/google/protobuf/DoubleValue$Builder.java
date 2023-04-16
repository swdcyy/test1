package com.google.protobuf.DoubleValue$Builder;
import com.google.protobuf.DoubleValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.DoubleValue$1;

public final class DoubleValue$Builder extends GeneratedMessageLite$Builder implements DoubleValueOrBuilder	// class@0003f3
{

    public void DoubleValue$Builder(){
       super(DoubleValue.DEFAULT_INSTANCE);
    }
    public void DoubleValue$Builder(DoubleValue$1 p0){
       super();
    }
    public DoubleValue$Builder clearValue(){
       this.copyOnWrite();
       this.instance.clearValue();
       return this;
    }
    public double getValue(){
       return this.instance.getValue();
    }
    public DoubleValue$Builder setValue(double p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
}
