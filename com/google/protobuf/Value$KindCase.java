package com.google.protobuf.Value$KindCase;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Value$KindCase extends Enum	// class@0004f2
{
    public final int value;
    public static final Value$KindCase[] $VALUES;
    public static final Value$KindCase BOOL_VALUE;
    public static final Value$KindCase KIND_NOT_SET;
    public static final Value$KindCase LIST_VALUE;
    public static final Value$KindCase NULL_VALUE;
    public static final Value$KindCase NUMBER_VALUE;
    public static final Value$KindCase STRING_VALUE;
    public static final Value$KindCase STRUCT_VALUE;

    static {
       Value$KindCase kindCase = new Value$KindCase("NULL_VALUE", 0, 1);
       Value$KindCase.NULL_VALUE = kindCase;
       Value$KindCase kindCase1 = new Value$KindCase("NUMBER_VALUE", 1, 2);
       Value$KindCase.NUMBER_VALUE = kindCase1;
       Value$KindCase kindCase2 = new Value$KindCase("STRING_VALUE", 2, 3);
       Value$KindCase.STRING_VALUE = kindCase2;
       Value$KindCase kindCase3 = new Value$KindCase("BOOL_VALUE", 3, 4);
       Value$KindCase.BOOL_VALUE = kindCase3;
       Value$KindCase kindCase4 = new Value$KindCase("STRUCT_VALUE", 4, 5);
       Value$KindCase.STRUCT_VALUE = kindCase4;
       Value$KindCase kindCase5 = new Value$KindCase("LIST_VALUE", 5, 6);
       Value$KindCase.LIST_VALUE = kindCase5;
       Value$KindCase kindCase6 = new Value$KindCase("KIND_NOT_SET", 6, 0);
       Value$KindCase.KIND_NOT_SET = kindCase6;
       Value$KindCase[] kindCaseArra = new Value$KindCase[]{kindCase,kindCase1,kindCase2,kindCase3,kindCase4,kindCase5,kindCase6};
       Value$KindCase.$VALUES = kindCaseArra;
    }
    public void Value$KindCase(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static Value$KindCase forNumber(int p0){
       switch (p0){
           case 0:
             return Value$KindCase.KIND_NOT_SET;
           case 1:
             return Value$KindCase.NULL_VALUE;
           case 2:
             return Value$KindCase.NUMBER_VALUE;
           case 3:
             return Value$KindCase.STRING_VALUE;
           case 4:
             return Value$KindCase.BOOL_VALUE;
           case 5:
             return Value$KindCase.STRUCT_VALUE;
           case 6:
             return Value$KindCase.LIST_VALUE;
           default:
             return null;
       }
    }
    public static Value$KindCase valueOf(int p0){
       return Value$KindCase.forNumber(p0);
    }
    public static Value$KindCase valueOf(String p0){
       return Enum.valueOf(Value$KindCase.class, p0);
    }
    public static Value$KindCase[] values(){
       return Value$KindCase.$VALUES.clone();
    }
    public int getNumber(){
       return this.value;
    }
}
