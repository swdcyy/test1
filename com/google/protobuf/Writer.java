package com.google.protobuf.Writer;
import com.google.protobuf.Writer$FieldOrder;
import java.util.List;
import com.google.protobuf.ByteString;
import java.lang.Object;
import com.google.protobuf.Schema;
import com.google.protobuf.MapEntryLite$Metadata;
import java.util.Map;
import java.lang.String;

public interface abstract Writer	// class@000503
{

    Writer$FieldOrder fieldOrder();
    void writeBool(int p0,boolean p1);
    void writeBoolList(int p0,List p1,boolean p2);
    void writeBytes(int p0,ByteString p1);
    void writeBytesList(int p0,List p1);
    void writeDouble(int p0,double p1);
    void writeDoubleList(int p0,List p1,boolean p2);
    void writeEndGroup(int p0);
    void writeEnum(int p0,int p1);
    void writeEnumList(int p0,List p1,boolean p2);
    void writeFixed32(int p0,int p1);
    void writeFixed32List(int p0,List p1,boolean p2);
    void writeFixed64(int p0,long p1);
    void writeFixed64List(int p0,List p1,boolean p2);
    void writeFloat(int p0,float p1);
    void writeFloatList(int p0,List p1,boolean p2);
    void writeGroup(int p0,Object p1);
    void writeGroup(int p0,Object p1,Schema p2);
    void writeGroupList(int p0,List p1);
    void writeGroupList(int p0,List p1,Schema p2);
    void writeInt32(int p0,int p1);
    void writeInt32List(int p0,List p1,boolean p2);
    void writeInt64(int p0,long p1);
    void writeInt64List(int p0,List p1,boolean p2);
    void writeMap(int p0,MapEntryLite$Metadata p1,Map p2);
    void writeMessage(int p0,Object p1);
    void writeMessage(int p0,Object p1,Schema p2);
    void writeMessageList(int p0,List p1);
    void writeMessageList(int p0,List p1,Schema p2);
    void writeMessageSetItem(int p0,Object p1);
    void writeSFixed32(int p0,int p1);
    void writeSFixed32List(int p0,List p1,boolean p2);
    void writeSFixed64(int p0,long p1);
    void writeSFixed64List(int p0,List p1,boolean p2);
    void writeSInt32(int p0,int p1);
    void writeSInt32List(int p0,List p1,boolean p2);
    void writeSInt64(int p0,long p1);
    void writeSInt64List(int p0,List p1,boolean p2);
    void writeStartGroup(int p0);
    void writeString(int p0,String p1);
    void writeStringList(int p0,List p1);
    void writeUInt32(int p0,int p1);
    void writeUInt32List(int p0,List p1,boolean p2);
    void writeUInt64(int p0,long p1);
    void writeUInt64List(int p0,List p1,boolean p2);
}
