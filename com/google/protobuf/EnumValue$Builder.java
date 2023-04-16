package com.google.protobuf.EnumValue$Builder;
import com.google.protobuf.EnumValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.EnumValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.EnumValue$1;
import java.lang.Iterable;
import com.google.protobuf.Option$Builder;
import com.google.protobuf.Option;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class EnumValue$Builder extends GeneratedMessageLite$Builder implements EnumValueOrBuilder	// class@000405
{

    public void EnumValue$Builder(){
       super(EnumValue.DEFAULT_INSTANCE);
    }
    public void EnumValue$Builder(EnumValue$1 p0){
       super();
    }
    public EnumValue$Builder addAllOptions(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllOptions(p0);
       return this;
    }
    public EnumValue$Builder addOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1.build());
       return this;
    }
    public EnumValue$Builder addOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1);
       return this;
    }
    public EnumValue$Builder addOptions(Option$Builder p0){
       this.copyOnWrite();
       this.instance.addOptions(p0.build());
       return this;
    }
    public EnumValue$Builder addOptions(Option p0){
       this.copyOnWrite();
       this.instance.addOptions(p0);
       return this;
    }
    public EnumValue$Builder clearName(){
       this.copyOnWrite();
       this.instance.clearName();
       return this;
    }
    public EnumValue$Builder clearNumber(){
       this.copyOnWrite();
       this.instance.clearNumber();
       return this;
    }
    public EnumValue$Builder clearOptions(){
       this.copyOnWrite();
       this.instance.clearOptions();
       return this;
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
    }
    public int getNumber(){
       return this.instance.getNumber();
    }
    public Option getOptions(int p0){
       return this.instance.getOptions(p0);
    }
    public int getOptionsCount(){
       return this.instance.getOptionsCount();
    }
    public List getOptionsList(){
       return Collections.unmodifiableList(this.instance.getOptionsList());
    }
    public EnumValue$Builder removeOptions(int p0){
       this.copyOnWrite();
       this.instance.removeOptions(p0);
       return this;
    }
    public EnumValue$Builder setName(String p0){
       this.copyOnWrite();
       this.instance.setName(p0);
       return this;
    }
    public EnumValue$Builder setNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setNameBytes(p0);
       return this;
    }
    public EnumValue$Builder setNumber(int p0){
       this.copyOnWrite();
       this.instance.setNumber(p0);
       return this;
    }
    public EnumValue$Builder setOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1.build());
       return this;
    }
    public EnumValue$Builder setOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1);
       return this;
    }
}
