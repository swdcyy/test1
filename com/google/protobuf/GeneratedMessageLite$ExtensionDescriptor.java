package com.google.protobuf.GeneratedMessageLite$ExtensionDescriptor;
import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.WireFormat$FieldType;
import java.lang.Object;
import com.google.protobuf.WireFormat$JavaType;
import com.google.protobuf.MessageLite$Builder;
import com.google.protobuf.MessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;

public final class GeneratedMessageLite$ExtensionDescriptor implements FieldSet$FieldDescriptorLite	// class@000438
{
    public final Internal$EnumLiteMap enumTypeMap;
    public final boolean isPacked;
    public final boolean isRepeated;
    public final int number;
    public final WireFormat$FieldType type;

    public void GeneratedMessageLite$ExtensionDescriptor(Internal$EnumLiteMap p0,int p1,WireFormat$FieldType p2,boolean p3,boolean p4){
       super();
       this.enumTypeMap = p0;
       this.number = p1;
       this.type = p2;
       this.isRepeated = p3;
       this.isPacked = p4;
    }
    public int compareTo(GeneratedMessageLite$ExtensionDescriptor p0){
       return (this.number - p0.number);
    }
    public int compareTo(Object p0){
       return this.compareTo(p0);
    }
    public Internal$EnumLiteMap getEnumType(){
       return this.enumTypeMap;
    }
    public WireFormat$JavaType getLiteJavaType(){
       return this.type.getJavaType();
    }
    public WireFormat$FieldType getLiteType(){
       return this.type;
    }
    public int getNumber(){
       return this.number;
    }
    public MessageLite$Builder internalMergeFrom(MessageLite$Builder p0,MessageLite p1){
       return p0.mergeFrom(p1);
    }
    public boolean isPacked(){
       return this.isPacked;
    }
    public boolean isRepeated(){
       return this.isRepeated;
    }
}
