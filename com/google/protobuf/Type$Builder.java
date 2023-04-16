package com.google.protobuf.Type$Builder;
import com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Type;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Type$1;
import java.lang.Iterable;
import com.google.protobuf.Field$Builder;
import com.google.protobuf.Field;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Option$Builder;
import com.google.protobuf.Option;
import java.util.List;
import java.util.Collections;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import com.google.protobuf.SourceContext$Builder;

public final class Type$Builder extends GeneratedMessageLite$Builder implements TypeOrBuilder	// class@0004d1
{

    public void Type$Builder(){
       super(Type.DEFAULT_INSTANCE);
    }
    public void Type$Builder(Type$1 p0){
       super();
    }
    public Type$Builder addAllFields(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllFields(p0);
       return this;
    }
    public Type$Builder addAllOneofs(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllOneofs(p0);
       return this;
    }
    public Type$Builder addAllOptions(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllOptions(p0);
       return this;
    }
    public Type$Builder addFields(int p0,Field$Builder p1){
       this.copyOnWrite();
       this.instance.addFields(p0, p1.build());
       return this;
    }
    public Type$Builder addFields(int p0,Field p1){
       this.copyOnWrite();
       this.instance.addFields(p0, p1);
       return this;
    }
    public Type$Builder addFields(Field$Builder p0){
       this.copyOnWrite();
       this.instance.addFields(p0.build());
       return this;
    }
    public Type$Builder addFields(Field p0){
       this.copyOnWrite();
       this.instance.addFields(p0);
       return this;
    }
    public Type$Builder addOneofs(String p0){
       this.copyOnWrite();
       this.instance.addOneofs(p0);
       return this;
    }
    public Type$Builder addOneofsBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.addOneofsBytes(p0);
       return this;
    }
    public Type$Builder addOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1.build());
       return this;
    }
    public Type$Builder addOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1);
       return this;
    }
    public Type$Builder addOptions(Option$Builder p0){
       this.copyOnWrite();
       this.instance.addOptions(p0.build());
       return this;
    }
    public Type$Builder addOptions(Option p0){
       this.copyOnWrite();
       this.instance.addOptions(p0);
       return this;
    }
    public Type$Builder clearFields(){
       this.copyOnWrite();
       this.instance.clearFields();
       return this;
    }
    public Type$Builder clearName(){
       this.copyOnWrite();
       this.instance.clearName();
       return this;
    }
    public Type$Builder clearOneofs(){
       this.copyOnWrite();
       this.instance.clearOneofs();
       return this;
    }
    public Type$Builder clearOptions(){
       this.copyOnWrite();
       this.instance.clearOptions();
       return this;
    }
    public Type$Builder clearSourceContext(){
       this.copyOnWrite();
       this.instance.clearSourceContext();
       return this;
    }
    public Type$Builder clearSyntax(){
       this.copyOnWrite();
       this.instance.clearSyntax();
       return this;
    }
    public Field getFields(int p0){
       return this.instance.getFields(p0);
    }
    public int getFieldsCount(){
       return this.instance.getFieldsCount();
    }
    public List getFieldsList(){
       return Collections.unmodifiableList(this.instance.getFieldsList());
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
    }
    public String getOneofs(int p0){
       return this.instance.getOneofs(p0);
    }
    public ByteString getOneofsBytes(int p0){
       return this.instance.getOneofsBytes(p0);
    }
    public int getOneofsCount(){
       return this.instance.getOneofsCount();
    }
    public List getOneofsList(){
       return Collections.unmodifiableList(this.instance.getOneofsList());
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
    public boolean hasSourceContext(){
       return this.instance.hasSourceContext();
    }
    public Type$Builder mergeSourceContext(SourceContext p0){
       this.copyOnWrite();
       this.instance.mergeSourceContext(p0);
       return this;
    }
    public Type$Builder removeFields(int p0){
       this.copyOnWrite();
       this.instance.removeFields(p0);
       return this;
    }
    public Type$Builder removeOptions(int p0){
       this.copyOnWrite();
       this.instance.removeOptions(p0);
       return this;
    }
    public Type$Builder setFields(int p0,Field$Builder p1){
       this.copyOnWrite();
       this.instance.setFields(p0, p1.build());
       return this;
    }
    public Type$Builder setFields(int p0,Field p1){
       this.copyOnWrite();
       this.instance.setFields(p0, p1);
       return this;
    }
    public Type$Builder setName(String p0){
       this.copyOnWrite();
       this.instance.setName(p0);
       return this;
    }
    public Type$Builder setNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setNameBytes(p0);
       return this;
    }
    public Type$Builder setOneofs(int p0,String p1){
       this.copyOnWrite();
       this.instance.setOneofs(p0, p1);
       return this;
    }
    public Type$Builder setOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1.build());
       return this;
    }
    public Type$Builder setOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1);
       return this;
    }
    public Type$Builder setSourceContext(SourceContext$Builder p0){
       this.copyOnWrite();
       this.instance.setSourceContext(p0.build());
       return this;
    }
    public Type$Builder setSourceContext(SourceContext p0){
       this.copyOnWrite();
       this.instance.setSourceContext(p0);
       return this;
    }
    public Type$Builder setSyntax(Syntax p0){
       this.copyOnWrite();
       this.instance.setSyntax(p0);
       return this;
    }
    public Type$Builder setSyntaxValue(int p0){
       this.copyOnWrite();
       this.instance.setSyntaxValue(p0);
       return this;
    }
}
