package com.google.protobuf.Field$Builder;
import com.google.protobuf.FieldOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Field;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Field$1;
import java.lang.Iterable;
import com.google.protobuf.Option$Builder;
import com.google.protobuf.Option;
import com.google.protobuf.Field$Cardinality;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.google.protobuf.Field$Kind;
import java.util.List;
import java.util.Collections;

public final class Field$Builder extends GeneratedMessageLite$Builder implements FieldOrBuilder	// class@000413
{

    public void Field$Builder(){
       super(Field.DEFAULT_INSTANCE);
    }
    public void Field$Builder(Field$1 p0){
       super();
    }
    public Field$Builder addAllOptions(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllOptions(p0);
       return this;
    }
    public Field$Builder addOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1.build());
       return this;
    }
    public Field$Builder addOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.addOptions(p0, p1);
       return this;
    }
    public Field$Builder addOptions(Option$Builder p0){
       this.copyOnWrite();
       this.instance.addOptions(p0.build());
       return this;
    }
    public Field$Builder addOptions(Option p0){
       this.copyOnWrite();
       this.instance.addOptions(p0);
       return this;
    }
    public Field$Builder clearCardinality(){
       this.copyOnWrite();
       this.instance.clearCardinality();
       return this;
    }
    public Field$Builder clearDefaultValue(){
       this.copyOnWrite();
       this.instance.clearDefaultValue();
       return this;
    }
    public Field$Builder clearJsonName(){
       this.copyOnWrite();
       this.instance.clearJsonName();
       return this;
    }
    public Field$Builder clearKind(){
       this.copyOnWrite();
       this.instance.clearKind();
       return this;
    }
    public Field$Builder clearName(){
       this.copyOnWrite();
       this.instance.clearName();
       return this;
    }
    public Field$Builder clearNumber(){
       this.copyOnWrite();
       this.instance.clearNumber();
       return this;
    }
    public Field$Builder clearOneofIndex(){
       this.copyOnWrite();
       this.instance.clearOneofIndex();
       return this;
    }
    public Field$Builder clearOptions(){
       this.copyOnWrite();
       this.instance.clearOptions();
       return this;
    }
    public Field$Builder clearPacked(){
       this.copyOnWrite();
       this.instance.clearPacked();
       return this;
    }
    public Field$Builder clearTypeUrl(){
       this.copyOnWrite();
       this.instance.clearTypeUrl();
       return this;
    }
    public Field$Cardinality getCardinality(){
       return this.instance.getCardinality();
    }
    public int getCardinalityValue(){
       return this.instance.getCardinalityValue();
    }
    public String getDefaultValue(){
       return this.instance.getDefaultValue();
    }
    public ByteString getDefaultValueBytes(){
       return this.instance.getDefaultValueBytes();
    }
    public String getJsonName(){
       return this.instance.getJsonName();
    }
    public ByteString getJsonNameBytes(){
       return this.instance.getJsonNameBytes();
    }
    public Field$Kind getKind(){
       return this.instance.getKind();
    }
    public int getKindValue(){
       return this.instance.getKindValue();
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
    public int getOneofIndex(){
       return this.instance.getOneofIndex();
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
    public boolean getPacked(){
       return this.instance.getPacked();
    }
    public String getTypeUrl(){
       return this.instance.getTypeUrl();
    }
    public ByteString getTypeUrlBytes(){
       return this.instance.getTypeUrlBytes();
    }
    public Field$Builder removeOptions(int p0){
       this.copyOnWrite();
       this.instance.removeOptions(p0);
       return this;
    }
    public Field$Builder setCardinality(Field$Cardinality p0){
       this.copyOnWrite();
       this.instance.setCardinality(p0);
       return this;
    }
    public Field$Builder setCardinalityValue(int p0){
       this.copyOnWrite();
       this.instance.setCardinalityValue(p0);
       return this;
    }
    public Field$Builder setDefaultValue(String p0){
       this.copyOnWrite();
       this.instance.setDefaultValue(p0);
       return this;
    }
    public Field$Builder setDefaultValueBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setDefaultValueBytes(p0);
       return this;
    }
    public Field$Builder setJsonName(String p0){
       this.copyOnWrite();
       this.instance.setJsonName(p0);
       return this;
    }
    public Field$Builder setJsonNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setJsonNameBytes(p0);
       return this;
    }
    public Field$Builder setKind(Field$Kind p0){
       this.copyOnWrite();
       this.instance.setKind(p0);
       return this;
    }
    public Field$Builder setKindValue(int p0){
       this.copyOnWrite();
       this.instance.setKindValue(p0);
       return this;
    }
    public Field$Builder setName(String p0){
       this.copyOnWrite();
       this.instance.setName(p0);
       return this;
    }
    public Field$Builder setNameBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setNameBytes(p0);
       return this;
    }
    public Field$Builder setNumber(int p0){
       this.copyOnWrite();
       this.instance.setNumber(p0);
       return this;
    }
    public Field$Builder setOneofIndex(int p0){
       this.copyOnWrite();
       this.instance.setOneofIndex(p0);
       return this;
    }
    public Field$Builder setOptions(int p0,Option$Builder p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1.build());
       return this;
    }
    public Field$Builder setOptions(int p0,Option p1){
       this.copyOnWrite();
       this.instance.setOptions(p0, p1);
       return this;
    }
    public Field$Builder setPacked(boolean p0){
       this.copyOnWrite();
       this.instance.setPacked(p0);
       return this;
    }
    public Field$Builder setTypeUrl(String p0){
       this.copyOnWrite();
       this.instance.setTypeUrl(p0);
       return this;
    }
    public Field$Builder setTypeUrlBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setTypeUrlBytes(p0);
       return this;
    }
}
