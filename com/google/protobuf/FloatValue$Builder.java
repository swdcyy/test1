package com.google.protobuf.FloatValue$Builder;
import com.google.protobuf.FloatValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.FloatValue$1;

public final class FloatValue$Builder extends GeneratedMessageLite$Builder implements FloatValueOrBuilder	// class@00042d
{

    public void FloatValue$Builder(){
       super(FloatValue.DEFAULT_INSTANCE);
    }
    public void FloatValue$Builder(FloatValue$1 p0){
       super();
    }
    public FloatValue$Builder clearValue(){
       this.copyOnWrite();
       this.instance.clearValue();
       return this;
    }
    public float getValue(){
       return this.instance.getValue();
    }
    public FloatValue$Builder setValue(float p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
}
