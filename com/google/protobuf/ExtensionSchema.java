package com.google.protobuf.ExtensionSchema;
import java.lang.Object;
import java.util.Map$Entry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.FieldSet;
import com.google.protobuf.Reader;
import com.google.protobuf.UnknownFieldSchema;
import com.google.protobuf.ByteString;
import com.google.protobuf.Writer;

public abstract class ExtensionSchema	// class@00040e
{

    public void ExtensionSchema(){
       super();
    }
    public abstract int extensionNumber(Map$Entry p0);
    public abstract Object findExtensionByNumber(ExtensionRegistryLite p0,MessageLite p1,int p2);
    public abstract FieldSet getExtensions(Object p0);
    public abstract FieldSet getMutableExtensions(Object p0);
    public abstract boolean hasExtensions(MessageLite p0);
    public abstract void makeImmutable(Object p0);
    public abstract Object parseExtension(Reader p0,Object p1,ExtensionRegistryLite p2,FieldSet p3,Object p4,UnknownFieldSchema p5);
    public abstract void parseLengthPrefixedMessageSetItem(Reader p0,Object p1,ExtensionRegistryLite p2,FieldSet p3);
    public abstract void parseMessageSetItem(ByteString p0,Object p1,ExtensionRegistryLite p2,FieldSet p3);
    public abstract void serializeExtension(Writer p0,Map$Entry p1);
    public abstract void setExtensions(Object p0,FieldSet p1);
}
