package com.kwaishou.merchant.daccore.pendant.ERenderType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ERenderType extends Enum	// class@00132a
{
    public String type;
    public static final ERenderType[] $VALUES;
    public static final ERenderType NATIVE;
    public static final ERenderType RN;
    public static final ERenderType TK;

    static {
       ERenderType uERenderType1;
       ERenderType[] uERenderType = new ERenderType[]{uERenderType1,uERenderType1,uERenderType1};
       uERenderType1 = new ERenderType("RN", 0, "RN");
       ERenderType.RN = uERenderType1;
       uERenderType1 = new ERenderType("TK", 1, "TK");
       ERenderType.TK = uERenderType1;
       uERenderType1 = new ERenderType("NATIVE", 2, "Native");
       ERenderType.NATIVE = uERenderType1;
       ERenderType.$VALUES = uERenderType;
    }
    public void ERenderType(String p0,int p1,String p2){
       super(p0, p1);
       this.type = p2;
    }
    public static ERenderType valueOf(String p0){
       return Enum.valueOf(ERenderType.class, p0);
    }
    public static ERenderType[] values(){
       return ERenderType.$VALUES.clone();
    }
}
