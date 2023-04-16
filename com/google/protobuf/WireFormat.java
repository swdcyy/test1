package com.google.protobuf.WireFormat;
import java.lang.Object;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.WireFormat$Utf8Validation;
import com.google.protobuf.WireFormat$1;
import java.lang.Enum;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Long;
import java.lang.Integer;
import com.google.protobuf.ByteString;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Double;

public final class WireFormat	// class@000500
{
    public static final int MESSAGE_SET_ITEM_END_TAG;
    public static final int MESSAGE_SET_ITEM_TAG;
    public static final int MESSAGE_SET_MESSAGE_TAG;
    public static final int MESSAGE_SET_TYPE_ID_TAG;

    static {
       WireFormat.MESSAGE_SET_ITEM_TAG = WireFormat.makeTag(1, 3);
       WireFormat.MESSAGE_SET_ITEM_END_TAG = WireFormat.makeTag(1, 4);
       WireFormat.MESSAGE_SET_TYPE_ID_TAG = WireFormat.makeTag(2, 0);
       WireFormat.MESSAGE_SET_MESSAGE_TAG = WireFormat.makeTag(3, 2);
    }
    public void WireFormat(){
       super();
    }
    public static int getTagFieldNumber(int p0){
       return (p0 >> 3);
    }
    public static int getTagWireType(int p0){
       return (p0 & 0x07);
    }
    public static int makeTag(int p0,int p1){
       return ((p0 << 3) | p1);
    }
    public static Object readPrimitiveField(CodedInputStream p0,WireFormat$FieldType p1,WireFormat$Utf8Validation p2){
       switch (WireFormat$1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[p1.ordinal()]){
           case 1:
             return Double.valueOf(p0.readDouble());
           case 2:
             return Float.valueOf(p0.readFloat());
           case 3:
             return Long.valueOf(p0.readInt64());
           case 4:
             return Long.valueOf(p0.readUInt64());
           case 5:
             return Integer.valueOf(p0.readInt32());
           case 6:
             return Long.valueOf(p0.readFixed64());
           case 7:
             return Integer.valueOf(p0.readFixed32());
           case 8:
             return Boolean.valueOf(p0.readBool());
           case 9:
             return p0.readBytes();
           case 10:
             return Integer.valueOf(p0.readUInt32());
           case 11:
             return Integer.valueOf(p0.readSFixed32());
           case 12:
             return Long.valueOf(p0.readSFixed64());
           case 13:
             return Integer.valueOf(p0.readSInt32());
           case 14:
             return Long.valueOf(p0.readSInt64());
           case 15:
             return p2.readString(p0);
           case 16:
             throw new IllegalArgumentException("readPrimitiveField\(\) cannot handle nested groups.");
           case 17:
             throw new IllegalArgumentException("readPrimitiveField\(\) cannot handle embedded messages.");
           case 18:
             throw new IllegalArgumentException("readPrimitiveField\(\) cannot handle enums.");
           default:
             throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
       }
    }
}
