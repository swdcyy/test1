package com.google.protobuf.ProtoSyntax;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ProtoSyntax extends Enum	// class@00049a
{
    public static final ProtoSyntax[] $VALUES;
    public static final ProtoSyntax PROTO2;
    public static final ProtoSyntax PROTO3;

    static {
       ProtoSyntax protoSyntax = new ProtoSyntax("PROTO2", 0);
       ProtoSyntax.PROTO2 = protoSyntax;
       ProtoSyntax protoSyntax1 = new ProtoSyntax("PROTO3", 1);
       ProtoSyntax.PROTO3 = protoSyntax1;
       ProtoSyntax[] protoSyntaxA = new ProtoSyntax[]{protoSyntax,protoSyntax1};
       ProtoSyntax.$VALUES = protoSyntaxA;
    }
    public void ProtoSyntax(String p0,int p1){
       super(p0, p1);
    }
    public static ProtoSyntax valueOf(String p0){
       return Enum.valueOf(ProtoSyntax.class, p0);
    }
    public static ProtoSyntax[] values(){
       return ProtoSyntax.$VALUES.clone();
    }
}
