package com.yxcorp.utility.AbiUtil$Abi;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class AbiUtil$Abi extends Enum	// class@0013f4
{
    public static final AbiUtil$Abi[] $VALUES;
    public static final AbiUtil$Abi ARM64_V8A;
    public static final AbiUtil$Abi ARMEABI_V7A;
    public static final AbiUtil$Abi UNKNOWN;

    static {
       AbiUtil$Abi uAbi = new AbiUtil$Abi("UNKNOWN", 0);
       AbiUtil$Abi.UNKNOWN = uAbi;
       AbiUtil$Abi uAbi1 = new AbiUtil$Abi("ARMEABI_V7A", 1);
       AbiUtil$Abi.ARMEABI_V7A = uAbi1;
       AbiUtil$Abi uAbi2 = new AbiUtil$Abi("ARM64_V8A", 2);
       AbiUtil$Abi.ARM64_V8A = uAbi2;
       AbiUtil$Abi[] uAbiArray = new AbiUtil$Abi[]{uAbi,uAbi1,uAbi2};
       AbiUtil$Abi.$VALUES = uAbiArray;
    }
    public void AbiUtil$Abi(String p0,int p1){
       super(p0, p1);
    }
    public static AbiUtil$Abi valueOf(String p0){
       return Enum.valueOf(AbiUtil$Abi.class, p0);
    }
    public static AbiUtil$Abi[] values(){
       return AbiUtil$Abi.$VALUES.clone();
    }
}
