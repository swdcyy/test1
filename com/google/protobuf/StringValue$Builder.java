package com.google.protobuf.StringValue$Builder;
import com.google.protobuf.StringValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.StringValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.StringValue$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class StringValue$Builder extends GeneratedMessageLite$Builder implements StringValueOrBuilder	// class@0004b9
{

    public void StringValue$Builder(){
       super(StringValue.DEFAULT_INSTANCE);
    }
    public void StringValue$Builder(StringValue$1 p0){
       super();
    }
    public StringValue$Builder clearValue(){
       this.copyOnWrite();
       this.instance.clearValue();
       return this;
    }
    public String getValue(){
       return this.instance.getValue();
    }
    public ByteString getValueBytes(){
       return this.instance.getValueBytes();
    }
    public StringValue$Builder setValue(String p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
    public StringValue$Builder setValueBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setValueBytes(p0);
       return this;
    }
}
