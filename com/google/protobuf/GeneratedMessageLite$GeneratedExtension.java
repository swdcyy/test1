package com.google.protobuf.GeneratedMessageLite$GeneratedExtension;
import com.google.protobuf.ExtensionLite;
import com.google.protobuf.MessageLite;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import java.lang.Class;
import com.google.protobuf.WireFormat$FieldType;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.google.protobuf.WireFormat$JavaType;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.Integer;
import com.google.protobuf.Internal$EnumLite;
import com.google.protobuf.Internal$EnumLiteMap;

public class GeneratedMessageLite$GeneratedExtension extends ExtensionLite	// class@000439
{
    public final MessageLite containingTypeDefaultInstance;
    public final Object defaultValue;
    public final GeneratedMessageLite$ExtensionDescriptor descriptor;
    public final MessageLite messageDefaultInstance;

    public void GeneratedMessageLite$GeneratedExtension(MessageLite p0,Object p1,MessageLite p2,GeneratedMessageLite$ExtensionDescriptor p3,Class p4){
       super();
       if (p0 == null) {
          throw new IllegalArgumentException("Null containingTypeDefaultInstance");
       }
       if (p3.getLiteType() == WireFormat$FieldType.MESSAGE && p2 == null) {
          throw new IllegalArgumentException("Null messageDefaultInstance");
       }
       this.containingTypeDefaultInstance = p0;
       this.defaultValue = p1;
       this.messageDefaultInstance = p2;
       this.descriptor = p3;
       return;
    }
    public Object fromFieldSetType(Object p0){
       if (!this.descriptor.isRepeated()) {
          return this.singularFromFieldSetType(p0);
       }
       if (this.descriptor.getLiteJavaType() != WireFormat$JavaType.ENUM) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       p0 = p0.iterator();
       while (p0.hasNext()) {
          uArrayList.add(this.singularFromFieldSetType(p0.next()));
       }
       return uArrayList;
    }
    public MessageLite getContainingTypeDefaultInstance(){
       return this.containingTypeDefaultInstance;
    }
    public Object getDefaultValue(){
       return this.defaultValue;
    }
    public WireFormat$FieldType getLiteType(){
       return this.descriptor.getLiteType();
    }
    public MessageLite getMessageDefaultInstance(){
       return this.messageDefaultInstance;
    }
    public int getNumber(){
       return this.descriptor.getNumber();
    }
    public boolean isRepeated(){
       return this.descriptor.isRepeated;
    }
    public Object singularFromFieldSetType(Object p0){
       if (this.descriptor.getLiteJavaType() == WireFormat$JavaType.ENUM) {
          p0 = this.descriptor.enumTypeMap.findValueByNumber(p0.intValue());
       }
       return p0;
    }
    public Object singularToFieldSetType(Object p0){
       if (this.descriptor.getLiteJavaType() == WireFormat$JavaType.ENUM) {
          p0 = Integer.valueOf(p0.getNumber());
       }
       return p0;
    }
    public Object toFieldSetType(Object p0){
       if (!this.descriptor.isRepeated()) {
          return this.singularToFieldSetType(p0);
       }
       if (this.descriptor.getLiteJavaType() != WireFormat$JavaType.ENUM) {
          return p0;
       }
       ArrayList uArrayList = new ArrayList();
       p0 = p0.iterator();
       while (p0.hasNext()) {
          uArrayList.add(this.singularToFieldSetType(p0.next()));
       }
       return uArrayList;
    }
}
