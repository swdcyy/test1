package com.google.protobuf.Api$Builder;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Api;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Api$1;
import java.lang.Iterable;
import com.google.protobuf.Method$Builder;
import com.google.protobuf.Method;
import com.google.protobuf.Mixin$Builder;
import com.google.protobuf.Mixin;
import com.google.protobuf.Option$Builder;
import com.google.protobuf.Option;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import com.google.protobuf.SourceContext$Builder;

public final class Api$Builder extends GeneratedMessageLite$Builder implements ApiOrBuilder	// class@0003b1
{

    public void Api$Builder(){
       super(Api.DEFAULT_INSTANCE);
    }
    public void Api$Builder(Api$1 p0){
       super();
    }
    public Api$Builder addAllMethods(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllMethods(p0);
       return this;
    }
    public Api$Builder addAllMixins(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllMixins(p0);
       return this;
    }
    public Api$Builder addAllOptions(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllOptions(p0);
       return this;
    }
    public Api$Builder addMethods(int p0,Method$Builder p1){
       this.copyOnWrite();
       this.instance.addMethods(p0, p1.build());
       return this;
    }
    public Api$Builder addMethods(int p0,Method p1){
       this.copyOnWrite();
       this.instance.addMethods(p0, p1);
       return this;
    }
    public Api$Builder addMethods(Method$Builder p0){
       this.copyOnWrite();
       this.instance.addMethods(p0.build());
       return this;
    }
    public Api$Builder addMethods(Method p0){
       this.copyOnWrite();
       this.instance.addMethods(p0);
       return this;
    }
    public Api$Builder addMixins(int p0,Mixin$Builder p1){
       this.copyOnWrite();
       this.instance.addMixins(p0, p1.build());
       return this;
    }
    public Api$Builder addMixins(int p0,Mixin p1){
       this.copyOnWrite();
       this.instance.addMixins(p0, p1);
       return this;
    }
    public Api$Builder addMixins(Mixin$Builder p0){
       this.copyOnWrite();
       this.instance.addMixins(p0.build());
       return this;
    }
    public Api$Builder addMixins(Mixin p0){
       this.copyOnWrite();
       this.instance.addMixins(p0);
       return this;
    }
    public Api$Builder addOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1.build());
       return this;
    }
    public Api$Builder addOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1);
       return this;
    }
    public Api$Builder addOptions(Option$Builder p0){
       this.copyOnWrite();
       this.instance.addOptions(p0.build());
       return this;
    }
    public Api$Builder addOptions(Option p0){
       this.copyOnWrite();
       this.instance.addOptions(p0);
       return this;
    }
    public Api$Builder clearMethods(){
       this.copyOnWrite();
       this.instance.clearMethods();
       return this;
    }
    public Api$Builder clearMixins(){
       this.copyOnWrite();
       this.instance.clearMixins();
       return this;
    }
    public Api$Builder clearName(){
       this.copyOnWrite();
       this.instance.clearName();
       return this;
    }
    public Api$Builder clearOptions(){
       this.copyOnWrite();
       this.instance.clearOptions();
       return this;
    }
    public Api$Builder clearSourceContext(){
       this.copyOnWrite();
       this.instance.clearSourceContext();
       return this;
    }
    public Api$Builder clearSyntax(){
       this.copyOnWrite();
       this.instance.clearSyntax();
       return this;
    }
    public Api$Builder clearVersion(){
       this.copyOnWrite();
       this.instance.clearVersion();
       return this;
    }
    public Method getMethods(int p0){
       return this.instance.getMethods(p0);
    }
    public int getMethodsCount(){
       return this.instance.getMethodsCount();
    }
    public List getMethodsList(){
       return Collections.unmodifiableList(this.instance.getMethodsList());
    }
    public Mixin getMixins(int p0){
       return this.instance.getMixins(p0);
    }
    public int getMixinsCount(){
       return this.instance.getMixinsCount();
    }
    public List getMixinsList(){
       return Collections.unmodifiableList(this.instance.getMixinsList());
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
    public SourceContext getSourceContext(){
       return this.instance.getSourceContext();
    }
    public Syntax getSyntax(){
       return this.instance.getSyntax();
    }
    public int getSyntaxValue(){
       return this.instance.getSyntaxValue();
    }
    public String getVersion(){
       return this.instance.getVersion();
    }
    public ByteString getVersionBytes(){
       return this.instance.getVersionBytes();
    }
    public boolean hasSourceContext(){
       return this.instance.hasSourceContext();
    }
    public Api$Builder mergeSourceContext(SourceContext p0){
       this.copyOnWrite();
       this.instance.mergeSourceContext(p0);
       return this;
    }
    public Api$Builder removeMethods(int p0){
       this.copyOnWrite();
       this.instance.removeMethods(p0);
       return this;
    }
    public Api$Builder removeMixins(int p0){
       this.copyOnWrite();
       this.instance.removeMixins(p0);
       return this;
    }
    public Api$Builder removeOptions(int p0){
       this.copyOnWrite();
       this.instance.removeOptions(p0);
       return this;
    }
    public Api$Builder setMethods(int p0,Method$Builder p1){
       this.copyOnWrite();
       this.instance.setMethods(p0, p1.build());
       return this;
    }
    public Api$Builder setMethods(int p0,Method p1){
       this.copyOnWrite();
       this.instance.setMethods(p0, p1);
       return this;
    }
    public Api$Builder setMixins(int p0,Mixin$Builder p1){
       this.copyOnWrite();
       this.instance.setMixins(p0, p1.build());
       return this;
    }
    public Api$Builder setMixins(int p0,Mixin p1){
       this.copyOnWrite();
       this.instance.setMixins(p0, p1);
       return this;
    }
    public Api$Builder setName(String p0){
       this.copyOnWrite();
       this.instance.setName(p0);
       return this;
    }
    public Api$Builder setNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setNameBytes(p0);
       return this;
    }
    public Api$Builder setOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1.build());
       return this;
    }
    public Api$Builder setOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1);
       return this;
    }
    public Api$Builder setSourceContext(SourceContext$Builder p0){
       this.copyOnWrite();
       this.instance.setSourceContext(p0.build());
       return this;
    }
    public Api$Builder setSourceContext(SourceContext p0){
       this.copyOnWrite();
       this.instance.setSourceContext(p0);
       return this;
    }
    public Api$Builder setSyntax(Syntax p0){
       this.copyOnWrite();
       this.instance.setSyntax(p0);
       return this;
    }
    public Api$Builder setSyntaxValue(int p0){
       this.copyOnWrite();
       this.instance.setSyntaxValue(p0);
       return this;
    }
    public Api$Builder setVersion(String p0){
       this.copyOnWrite();
       this.instance.setVersion(p0);
       return this;
    }
    public Api$Builder setVersionBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setVersionBytes(p0);
       return this;
    }
}
