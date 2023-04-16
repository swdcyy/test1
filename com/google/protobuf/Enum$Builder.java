package com.google.protobuf.Enum$Builder;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Enum;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Enum$1;
import java.lang.Iterable;
import com.google.protobuf.EnumValue$Builder;
import com.google.protobuf.EnumValue;
import com.google.protobuf.Option$Builder;
import com.google.protobuf.Option;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.SourceContext;
import com.google.protobuf.Syntax;
import com.google.protobuf.SourceContext$Builder;

public final class Enum$Builder extends GeneratedMessageLite$Builder implements EnumOrBuilder	// class@000401
{

    public void Enum$Builder(){
       super(Enum.DEFAULT_INSTANCE);
    }
    public void Enum$Builder(Enum$1 p0){
       super();
    }
    public Enum$Builder addAllEnumvalue(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllEnumvalue(p0);
       return this;
    }
    public Enum$Builder addAllOptions(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllOptions(p0);
       return this;
    }
    public Enum$Builder addEnumvalue(int p0,EnumValue$Builder p1){
       this.copyOnWrite();
       this.instance.addEnumvalue(p0, p1.build());
       return this;
    }
    public Enum$Builder addEnumvalue(int p0,EnumValue p1){
       this.copyOnWrite();
       this.instance.addEnumvalue(p0, p1);
       return this;
    }
    public Enum$Builder addEnumvalue(EnumValue$Builder p0){
       this.copyOnWrite();
       this.instance.addEnumvalue(p0.build());
       return this;
    }
    public Enum$Builder addEnumvalue(EnumValue p0){
       this.copyOnWrite();
       this.instance.addEnumvalue(p0);
       return this;
    }
    public Enum$Builder addOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1.build());
       return this;
    }
    public Enum$Builder addOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1);
       return this;
    }
    public Enum$Builder addOptions(Option$Builder p0){
       this.copyOnWrite();
       this.instance.addOptions(p0.build());
       return this;
    }
    public Enum$Builder addOptions(Option p0){
       this.copyOnWrite();
       this.instance.addOptions(p0);
       return this;
    }
    public Enum$Builder clearEnumvalue(){
       this.copyOnWrite();
       this.instance.clearEnumvalue();
       return this;
    }
    public Enum$Builder clearName(){
       this.copyOnWrite();
       this.instance.clearName();
       return this;
    }
    public Enum$Builder clearOptions(){
       this.copyOnWrite();
       this.instance.clearOptions();
       return this;
    }
    public Enum$Builder clearSourceContext(){
       this.copyOnWrite();
       this.instance.clearSourceContext();
       return this;
    }
    public Enum$Builder clearSyntax(){
       this.copyOnWrite();
       this.instance.clearSyntax();
       return this;
    }
    public EnumValue getEnumvalue(int p0){
       return this.instance.getEnumvalue(p0);
    }
    public int getEnumvalueCount(){
       return this.instance.getEnumvalueCount();
    }
    public List getEnumvalueList(){
       return Collections.unmodifiableList(this.instance.getEnumvalueList());
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
    public boolean hasSourceContext(){
       return this.instance.hasSourceContext();
    }
    public Enum$Builder mergeSourceContext(SourceContext p0){
       this.copyOnWrite();
       this.instance.mergeSourceContext(p0);
       return this;
    }
    public Enum$Builder removeEnumvalue(int p0){
       this.copyOnWrite();
       this.instance.removeEnumvalue(p0);
       return this;
    }
    public Enum$Builder removeOptions(int p0){
       this.copyOnWrite();
       this.instance.removeOptions(p0);
       return this;
    }
    public Enum$Builder setEnumvalue(int p0,EnumValue$Builder p1){
       this.copyOnWrite();
       this.instance.setEnumvalue(p0, p1.build());
       return this;
    }
    public Enum$Builder setEnumvalue(int p0,EnumValue p1){
       this.copyOnWrite();
       this.instance.setEnumvalue(p0, p1);
       return this;
    }
    public Enum$Builder setName(String p0){
       this.copyOnWrite();
       this.instance.setName(p0);
       return this;
    }
    public Enum$Builder setNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setNameBytes(p0);
       return this;
    }
    public Enum$Builder setOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1.build());
       return this;
    }
    public Enum$Builder setOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1);
       return this;
    }
    public Enum$Builder setSourceContext(SourceContext$Builder p0){
       this.copyOnWrite();
       this.instance.setSourceContext(p0.build());
       return this;
    }
    public Enum$Builder setSourceContext(SourceContext p0){
       this.copyOnWrite();
       this.instance.setSourceContext(p0);
       return this;
    }
    public Enum$Builder setSyntax(Syntax p0){
       this.copyOnWrite();
       this.instance.setSyntax(p0);
       return this;
    }
    public Enum$Builder setSyntaxValue(int p0){
       this.copyOnWrite();
       this.instance.setSyntaxValue(p0);
       return this;
    }
}
