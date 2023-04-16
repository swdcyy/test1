package com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.lang.Object;

public class GeneratedMessageLite$DefaultInstanceBasedParser extends AbstractParser	// class@000433
{
    public final GeneratedMessageLite defaultInstance;

    public void GeneratedMessageLite$DefaultInstanceBasedParser(GeneratedMessageLite p0){
       super();
       this.defaultInstance = p0;
    }
    public GeneratedMessageLite parsePartialFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return GeneratedMessageLite.parsePartialFrom(this.defaultInstance, p0, p1);
    }
    public GeneratedMessageLite parsePartialFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       return GeneratedMessageLite.parsePartialFrom(this.defaultInstance, p0, p1, p2, p3);
    }
    public MessageLite parsePartialFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       return this.parsePartialFrom(p0, p1, p2, p3);
    }
    public Object parsePartialFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return this.parsePartialFrom(p0, p1);
    }
    public Object parsePartialFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       return this.parsePartialFrom(p0, p1, p2, p3);
    }
}
