package com.google.protobuf.Int32Value$Builder;
import com.google.protobuf.Int32ValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Int32Value;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value$1;

public final class Int32Value$Builder extends GeneratedMessageLite$Builder implements Int32ValueOrBuilder	// class@00043e
{

    public void Int32Value$Builder(){
       super(Int32Value.DEFAULT_INSTANCE);
    }
    public void Int32Value$Builder(Int32Value$1 p0){
       super();
    }
    public Int32Value$Builder clearValue(){
       this.copyOnWrite();
       this.instance.clearValue();
       return this;
    }
    public int getValue(){
       return this.instance.getValue();
    }
    public Int32Value$Builder setValue(int p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
}
