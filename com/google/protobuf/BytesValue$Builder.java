package com.google.protobuf.BytesValue$Builder;
import com.google.protobuf.BytesValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.BytesValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.BytesValue$1;
import com.google.protobuf.ByteString;

public final class BytesValue$Builder extends GeneratedMessageLite$Builder implements BytesValueOrBuilder	// class@0003d8
{

    public void BytesValue$Builder(){
       super(BytesValue.DEFAULT_INSTANCE);
    }
    public void BytesValue$Builder(BytesValue$1 p0){
       super();
    }
    public BytesValue$Builder clearValue(){
       this.copyOnWrite();
       this.instance.clearValue();
       return this;
    }
    public ByteString getValue(){
       return this.instance.getValue();
    }
    public BytesValue$Builder setValue(ByteString p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
}
