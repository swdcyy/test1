package com.google.protobuf.Option$Builder;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Option;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Option$1;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Any;
import com.google.protobuf.Any$Builder;

public final class Option$Builder extends GeneratedMessageLite$Builder implements OptionOrBuilder	// class@000495
{

    public void Option$Builder(){
       super(Option.DEFAULT_INSTANCE);
    }
    public void Option$Builder(Option$1 p0){
       super();
    }
    public Option$Builder clearName(){
       this.copyOnWrite();
       this.instance.clearName();
       return this;
    }
    public Option$Builder clearValue(){
       this.copyOnWrite();
       this.instance.clearValue();
       return this;
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
    }
    public Any getValue(){
       return this.instance.getValue();
    }
    public boolean hasValue(){
       return this.instance.hasValue();
    }
    public Option$Builder mergeValue(Any p0){
       this.copyOnWrite();
       this.instance.mergeValue(p0);
       return this;
    }
    public Option$Builder setName(String p0){
       this.copyOnWrite();
       this.instance.setName(p0);
       return this;
    }
    public Option$Builder setNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setNameBytes(p0);
       return this;
    }
    public Option$Builder setValue(Any$Builder p0){
       this.copyOnWrite();
       this.instance.setValue(p0.build());
       return this;
    }
    public Option$Builder setValue(Any p0){
       this.copyOnWrite();
       this.instance.setValue(p0);
       return this;
    }
}
