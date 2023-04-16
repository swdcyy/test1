package com.google.protobuf.WireFormat$Utf8Validation;
import java.lang.Enum;
import com.google.protobuf.WireFormat$Utf8Validation$1;
import java.lang.String;
import com.google.protobuf.WireFormat$Utf8Validation$2;
import com.google.protobuf.WireFormat$Utf8Validation$3;
import com.google.protobuf.WireFormat$1;
import java.lang.Class;
import java.lang.Object;
import com.google.protobuf.CodedInputStream;

public abstract class WireFormat$Utf8Validation extends Enum	// class@0004ff
{
    public static final WireFormat$Utf8Validation[] $VALUES;
    public static final WireFormat$Utf8Validation LAZY;
    public static final WireFormat$Utf8Validation LOOSE;
    public static final WireFormat$Utf8Validation STRICT;

    static {
       WireFormat$Utf8Validation$1 utf8Validati = new WireFormat$Utf8Validation$1("LOOSE", 0);
       WireFormat$Utf8Validation.LOOSE = utf8Validati;
       WireFormat$Utf8Validation$2 utf8Validati1 = new WireFormat$Utf8Validation$2("STRICT", 1);
       WireFormat$Utf8Validation.STRICT = utf8Validati1;
       WireFormat$Utf8Validation$3 utf8Validati2 = new WireFormat$Utf8Validation$3("LAZY", 2);
       WireFormat$Utf8Validation.LAZY = utf8Validati2;
       WireFormat$Utf8Validation[] utf8Validati3 = new WireFormat$Utf8Validation[]{utf8Validati,utf8Validati1,utf8Validati2};
       WireFormat$Utf8Validation.$VALUES = utf8Validati3;
    }
    public void WireFormat$Utf8Validation(String p0,int p1){
       super(p0, p1);
    }
    public void WireFormat$Utf8Validation(String p0,int p1,WireFormat$1 p2){
       super(p0, p1);
    }
    public static WireFormat$Utf8Validation valueOf(String p0){
       return Enum.valueOf(WireFormat$Utf8Validation.class, p0);
    }
    public static WireFormat$Utf8Validation[] values(){
       return WireFormat$Utf8Validation.$VALUES.clone();
    }
    public abstract Object readString(CodedInputStream p0);
}
