package com.google.protobuf.Any$Builder;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Any;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Any$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class Any$Builder extends GeneratedMessageLite$Builder implements AnyOrBuilder	// class@0003ac
{

    public void Any$Builder(){
       super(Any.DEFAULT_INSTANCE);
    }
    public void Any$Builder(Any$1 p0){
       super();
    }
    public Any$Builder clearTypeUrl(){
       this.copyOnWrite();
       this.instance.clearTypeUrl();
       return this;
    }
    public Any$Builder clearValue(){
       this.copyOnWrite();
       this.instance.clearValue();
       return this;
    }
    public String getTypeUrl(){
       return this.instance.getTypeUrl();
    }
    public ByteString getTypeUrlBytes(){
       return this.instance.getTypeUrlBytes();
    }
    public ByteString getValue(){
       return this.instance.getValue();
    }
    public Any$Builder setTypeUrl(String p0){
       this.copyOnWrite();
       this.instance.setTypeUrl(p0);
       return this;
    }
    public Any$Builder setTypeUrlBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTypeUrlBytes(p0);
       return this;
    }
    public Any$Builder setValue(ByteString p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
}
