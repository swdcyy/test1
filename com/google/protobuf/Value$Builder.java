package com.google.protobuf.Value$Builder;
import com.google.protobuf.ValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Value;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Value$1;
import com.google.protobuf.Value$KindCase;
import com.google.protobuf.ListValue;
import com.google.protobuf.NullValue;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Struct;
import com.google.protobuf.ListValue$Builder;
import com.google.protobuf.Struct$Builder;

public final class Value$Builder extends GeneratedMessageLite$Builder implements ValueOrBuilder	// class@0004f1
{

    public void Value$Builder(){
       super(Value.DEFAULT_INSTANCE);
    }
    public void Value$Builder(Value$1 p0){
       super();
    }
    public Value$Builder clearBoolValue(){
       this.copyOnWrite();
       this.instance.clearBoolValue();
       return this;
    }
    public Value$Builder clearKind(){
       this.copyOnWrite();
       this.instance.clearKind();
       return this;
    }
    public Value$Builder clearListValue(){
       this.copyOnWrite();
       this.instance.clearListValue();
       return this;
    }
    public Value$Builder clearNullValue(){
       this.copyOnWrite();
       this.instance.clearNullValue();
       return this;
    }
    public Value$Builder clearNumberValue(){
       this.copyOnWrite();
       this.instance.clearNumberValue();
       return this;
    }
    public Value$Builder clearStringValue(){
       this.copyOnWrite();
       this.instance.clearStringValue();
       return this;
    }
    public Value$Builder clearStructValue(){
       this.copyOnWrite();
       this.instance.clearStructValue();
       return this;
    }
    public boolean getBoolValue(){
       return this.instance.getBoolValue();
    }
    public Value$KindCase getKindCase(){
       return this.instance.getKindCase();
    }
    public ListValue getListValue(){
       return this.instance.getListValue();
    }
    public NullValue getNullValue(){
       return this.instance.getNullValue();
    }
    public int getNullValueValue(){
       return this.instance.getNullValueValue();
    }
    public double getNumberValue(){
       return this.instance.getNumberValue();
    }
    public String getStringValue(){
       return this.instance.getStringValue();
    }
    public ByteString getStringValueBytes(){
       return this.instance.getStringValueBytes();
    }
    public Struct getStructValue(){
       return this.instance.getStructValue();
    }
    public boolean hasListValue(){
       return this.instance.hasListValue();
    }
    public boolean hasStructValue(){
       return this.instance.hasStructValue();
    }
    public Value$Builder mergeListValue(ListValue p0){
       this.copyOnWrite();
       this.instance.mergeListValue(p0);
       return this;
    }
    public Value$Builder mergeStructValue(Struct p0){
       this.copyOnWrite();
       this.instance.mergeStructValue(p0);
       return this;
    }
    public Value$Builder setBoolValue(boolean p0){
       this.copyOnWrite();
       this.instance.setBoolValue(p0);
       return this;
    }
    public Value$Builder setListValue(ListValue$Builder p0){
       this.copyOnWrite();
       this.instance.setListValue(p0.build());
       return this;
    }
    public Value$Builder setListValue(ListValue p0){
       this.copyOnWrite();
       this.instance.setListValue(p0);
       return this;
    }
    public Value$Builder setNullValue(NullValue p0){
       this.copyOnWrite();
       this.instance.setNullValue(p0);
       return this;
    }
    public Value$Builder setNullValueValue(int p0){
       this.copyOnWrite();
       this.instance.setNullValueValue(p0);
       return this;
    }
    public Value$Builder setNumberValue(double p0){
       this.copyOnWrite();
       this.instance.setNumberValue(p0);
       return this;
    }
    public Value$Builder setStringValue(String p0){
       this.copyOnWrite();
       this.instance.setStringValue(p0);
       return this;
    }
    public Value$Builder setStringValueBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setStringValueBytes(p0);
       return this;
    }
    public Value$Builder setStructValue(Struct$Builder p0){
       this.copyOnWrite();
       this.instance.setStructValue(p0.build());
       return this;
    }
    public Value$Builder setStructValue(Struct p0){
       this.copyOnWrite();
       this.instance.setStructValue(p0);
       return this;
    }
}
