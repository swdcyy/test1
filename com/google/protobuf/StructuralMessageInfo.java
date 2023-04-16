package com.google.protobuf.StructuralMessageInfo;
import com.google.protobuf.MessageInfo;
import com.google.protobuf.ProtoSyntax;
import com.google.protobuf.FieldInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.StructuralMessageInfo$Builder;

public final class StructuralMessageInfo implements MessageInfo	// class@0004c3
{
    public final int[] checkInitialized;
    public final MessageLite defaultInstance;
    public final FieldInfo[] fields;
    public final boolean messageSetWireFormat;
    public final ProtoSyntax syntax;

    public void StructuralMessageInfo(ProtoSyntax p0,boolean p1,int[] p2,FieldInfo[] p3,Object p4){
       super();
       this.syntax = p0;
       this.messageSetWireFormat = p1;
       this.checkInitialized = p2;
       this.fields = p3;
       this.defaultInstance = Internal.checkNotNull(p4, "defaultInstance");
    }
    public static StructuralMessageInfo$Builder newBuilder(){
       return new StructuralMessageInfo$Builder();
    }
    public static StructuralMessageInfo$Builder newBuilder(int p0){
       return new StructuralMessageInfo$Builder(p0);
    }
    public int[] getCheckInitialized(){
       return this.checkInitialized;
    }
    public MessageLite getDefaultInstance(){
       return this.defaultInstance;
    }
    public FieldInfo[] getFields(){
       return this.fields;
    }
    public ProtoSyntax getSyntax(){
       return this.syntax;
    }
    public boolean isMessageSetWireFormat(){
       return this.messageSetWireFormat;
    }
}
