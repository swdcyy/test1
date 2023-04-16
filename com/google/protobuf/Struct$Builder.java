package com.google.protobuf.Struct$Builder;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Struct;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Struct$1;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.util.Collections;
import com.google.protobuf.Value;
import java.lang.IllegalArgumentException;

public final class Struct$Builder extends GeneratedMessageLite$Builder implements StructOrBuilder	// class@0004bd
{

    public void Struct$Builder(){
       super(Struct.DEFAULT_INSTANCE);
    }
    public void Struct$Builder(Struct$1 p0){
       super();
    }
    public Struct$Builder clearFields(){
       this.copyOnWrite();
       this.instance.getMutableFieldsMap().clear();
       return this;
    }
    public boolean containsFields(String p0){
       Objects.requireNonNull(p0);
       return this.instance.getFieldsMap().containsKey(p0);
    }
    public Map getFields(){
       return this.getFieldsMap();
    }
    public int getFieldsCount(){
       return this.instance.getFieldsMap().size();
    }
    public Map getFieldsMap(){
       return Collections.unmodifiableMap(this.instance.getFieldsMap());
    }
    public Value getFieldsOrDefault(String p0,Value p1){
       Objects.requireNonNull(p0);
       Map fieldsMap = this.instance.getFieldsMap();
       if (fieldsMap.containsKey(p0)) {
          p1 = fieldsMap.get(p0);
       }
       return p1;
    }
    public Value getFieldsOrThrow(String p0){
       Objects.requireNonNull(p0);
       Map fieldsMap = this.instance.getFieldsMap();
       if (fieldsMap.containsKey(p0)) {
          return fieldsMap.get(p0);
       }
       throw new IllegalArgumentException();
    }
    public Struct$Builder putAllFields(Map p0){
       this.copyOnWrite();
       this.instance.getMutableFieldsMap().putAll(p0);
       return this;
    }
    public Struct$Builder putFields(String p0,Value p1){
       Objects.requireNonNull(p0);
       Objects.requireNonNull(p1);
       this.copyOnWrite();
       this.instance.getMutableFieldsMap().put(p0, p1);
       return this;
    }
    public Struct$Builder removeFields(String p0){
       Objects.requireNonNull(p0);
       this.copyOnWrite();
       this.instance.getMutableFieldsMap().remove(p0);
       return this;
    }
}
