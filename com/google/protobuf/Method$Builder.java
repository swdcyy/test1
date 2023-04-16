package com.google.protobuf.Method$Builder;
import com.google.protobuf.MethodOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Method;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Method$1;
import java.lang.Iterable;
import com.google.protobuf.Option$Builder;
import com.google.protobuf.Option;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;
import com.google.protobuf.Syntax;

public final class Method$Builder extends GeneratedMessageLite$Builder implements MethodOrBuilder	// class@000482
{

    public void Method$Builder(){
       super(Method.DEFAULT_INSTANCE);
    }
    public void Method$Builder(Method$1 p0){
       super();
    }
    public Method$Builder addAllOptions(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllOptions(p0);
       return this;
    }
    public Method$Builder addOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1.build());
       return this;
    }
    public Method$Builder addOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1);
       return this;
    }
    public Method$Builder addOptions(Option$Builder p0){
       this.copyOnWrite();
       this.instance.addOptions(p0.build());
       return this;
    }
    public Method$Builder addOptions(Option p0){
       this.copyOnWrite();
       this.instance.addOptions(p0);
       return this;
    }
    public Method$Builder clearName(){
       this.copyOnWrite();
       this.instance.clearName();
       return this;
    }
    public Method$Builder clearOptions(){
       this.copyOnWrite();
       this.instance.clearOptions();
       return this;
    }
    public Method$Builder clearRequestStreaming(){
       this.copyOnWrite();
       this.instance.clearRequestStreaming();
       return this;
    }
    public Method$Builder clearRequestTypeUrl(){
       this.copyOnWrite();
       this.instance.clearRequestTypeUrl();
       return this;
    }
    public Method$Builder clearResponseStreaming(){
       this.copyOnWrite();
       this.instance.clearResponseStreaming();
       return this;
    }
    public Method$Builder clearResponseTypeUrl(){
       this.copyOnWrite();
       this.instance.clearResponseTypeUrl();
       return this;
    }
    public Method$Builder clearSyntax(){
       this.copyOnWrite();
       this.instance.clearSyntax();
       return this;
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
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
    public boolean getRequestStreaming(){
       return this.instance.getRequestStreaming();
    }
    public String getRequestTypeUrl(){
       return this.instance.getRequestTypeUrl();
    }
    public ByteString getRequestTypeUrlBytes(){
       return this.instance.getRequestTypeUrlBytes();
    }
    public boolean getResponseStreaming(){
       return this.instance.getResponseStreaming();
    }
    public String getResponseTypeUrl(){
       return this.instance.getResponseTypeUrl();
    }
    public ByteString getResponseTypeUrlBytes(){
       return this.instance.getResponseTypeUrlBytes();
    }
    public Syntax getSyntax(){
       return this.instance.getSyntax();
    }
    public int getSyntaxValue(){
       return this.instance.getSyntaxValue();
    }
    public Method$Builder removeOptions(int p0){
       this.copyOnWrite();
       this.instance.removeOptions(p0);
       return this;
    }
    public Method$Builder setName(String p0){
       this.copyOnWrite();
       this.instance.setName(p0);
       return this;
    }
    public Method$Builder setNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setNameBytes(p0);
       return this;
    }
    public Method$Builder setOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1.build());
       return this;
    }
    public Method$Builder setOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1);
       return this;
    }
    public Method$Builder setRequestStreaming(boolean p0){
       this.copyOnWrite();
       this.instance.setRequestStreaming(p0);
       return this;
    }
    public Method$Builder setRequestTypeUrl(String p0){
       this.copyOnWrite();
       this.instance.setRequestTypeUrl(p0);
       return this;
    }
    public Method$Builder setRequestTypeUrlBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setRequestTypeUrlBytes(p0);
       return this;
    }
    public Method$Builder setResponseStreaming(boolean p0){
       this.copyOnWrite();
       this.instance.setResponseStreaming(p0);
       return this;
    }
    public Method$Builder setResponseTypeUrl(String p0){
       this.copyOnWrite();
       this.instance.setResponseTypeUrl(p0);
       return this;
    }
    public Method$Builder setResponseTypeUrlBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setResponseTypeUrlBytes(p0);
       return this;
    }
    public Method$Builder setSyntax(Syntax p0){
       this.copyOnWrite();
       this.instance.setSyntax(p0);
       return this;
    }
    public Method$Builder setSyntaxValue(int p0){
       this.copyOnWrite();
       this.instance.setSyntaxValue(p0);
       return this;
    }
}
