package com.google.protobuf.Syntax;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.google.protobuf.Syntax$1;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.google.protobuf.Syntax$SyntaxVerifier;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class Syntax extends Enum implements Internal$EnumLite	// class@0004c6
{
    public final int value;
    public static final Syntax[] $VALUES;
    public static final Syntax SYNTAX_PROTO2;
    public static final Syntax SYNTAX_PROTO3;
    public static final Syntax UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       Syntax syntax = new Syntax("SYNTAX_PROTO2", 0, 0);
       Syntax.SYNTAX_PROTO2 = syntax;
       Syntax syntax1 = new Syntax("SYNTAX_PROTO3", 1, 1);
       Syntax.SYNTAX_PROTO3 = syntax1;
       Syntax syntax2 = new Syntax("UNRECOGNIZED", 2, -1);
       Syntax.UNRECOGNIZED = syntax2;
       Syntax[] syntaxArray = new Syntax[]{syntax,syntax1,syntax2};
       Syntax.$VALUES = syntaxArray;
       Syntax.internalValueMap = new Syntax$1();
    }
    public void Syntax(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Syntax forNumber(int p0){
       if (!p0) {
          return Syntax.SYNTAX_PROTO2;
       }
       if (p0 != 1) {
          return null;
       }
       return Syntax.SYNTAX_PROTO3;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return Syntax.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return Syntax$SyntaxVerifier.INSTANCE;
    }
    public static Syntax valueOf(int p0){
       return Syntax.forNumber(p0);
    }
    public static Syntax valueOf(String p0){
       return Enum.valueOf(Syntax.class, p0);
    }
    public static Syntax[] values(){
       return Syntax.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != Syntax.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
