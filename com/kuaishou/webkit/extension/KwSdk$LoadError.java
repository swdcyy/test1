package com.kuaishou.webkit.extension.KwSdk$LoadError;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KwSdk$LoadError extends Enum	// class@0012f2
{
    public int value;
    public static final KwSdk$LoadError[] $VALUES;
    public static final KwSdk$LoadError KWLE_CORE_NOT_SUPPORTED;
    public static final KwSdk$LoadError KWLE_DISABLED;
    public static final KwSdk$LoadError KWLE_EXCEPTION_FIND_CLASS;
    public static final KwSdk$LoadError KWLE_EXCEPTION_GET_METHOD;
    public static final KwSdk$LoadError KWLE_EXCEPTION_INVOKE;
    public static final KwSdk$LoadError KWLE_EXCEPTION_UNKNOW;
    public static final KwSdk$LoadError KWLE_JUMP_OLD_VERSION;
    public static final KwSdk$LoadError KWLE_MULTI_FAILED;
    public static final KwSdk$LoadError KWLE_NO;
    public static final KwSdk$LoadError KWLE_NOT_INSTALL_2TO5;
    public static final KwSdk$LoadError KWLE_NOT_INSTALL_6TON;
    public static final KwSdk$LoadError KWLE_NOT_INSTALL_HASLOAD;
    public static final KwSdk$LoadError KWLE_NOT_INSTALL_HASLOAD_ABI;
    public static final KwSdk$LoadError KWLE_NOT_INSTALL_ONCE;
    public static final KwSdk$LoadError KWLE_NOT_SUPPORTED;

    static {
       KwSdk$LoadError loadError = new KwSdk$LoadError("KWLE_NO", 0, 1000);
       KwSdk$LoadError.KWLE_NO = loadError;
       KwSdk$LoadError loadError1 = new KwSdk$LoadError("KWLE_DISABLED", 1, 1001);
       KwSdk$LoadError.KWLE_DISABLED = loadError1;
       KwSdk$LoadError loadError2 = new KwSdk$LoadError("KWLE_MULTI_FAILED", 2, 1002);
       KwSdk$LoadError.KWLE_MULTI_FAILED = loadError2;
       KwSdk$LoadError loadError3 = new KwSdk$LoadError("KWLE_NOT_INSTALL_ONCE", 3, 1003);
       KwSdk$LoadError.KWLE_NOT_INSTALL_ONCE = loadError3;
       KwSdk$LoadError loadError4 = new KwSdk$LoadError("KWLE_NOT_SUPPORTED", 4, 1004);
       KwSdk$LoadError.KWLE_NOT_SUPPORTED = loadError4;
       KwSdk$LoadError loadError5 = new KwSdk$LoadError("KWLE_CORE_NOT_SUPPORTED", 5, 1005);
       KwSdk$LoadError.KWLE_CORE_NOT_SUPPORTED = loadError5;
       KwSdk$LoadError loadError6 = new KwSdk$LoadError("KWLE_EXCEPTION_FIND_CLASS", 6, 1006);
       KwSdk$LoadError.KWLE_EXCEPTION_FIND_CLASS = loadError6;
       KwSdk$LoadError loadError7 = new KwSdk$LoadError("KWLE_EXCEPTION_GET_METHOD", 7, 1007);
       KwSdk$LoadError.KWLE_EXCEPTION_GET_METHOD = loadError7;
       KwSdk$LoadError loadError8 = new KwSdk$LoadError("KWLE_EXCEPTION_INVOKE", 8, 1008);
       KwSdk$LoadError.KWLE_EXCEPTION_INVOKE = loadError8;
       KwSdk$LoadError loadError9 = new KwSdk$LoadError("KWLE_EXCEPTION_UNKNOW", 9, 1009);
       KwSdk$LoadError.KWLE_EXCEPTION_UNKNOW = loadError9;
       KwSdk$LoadError loadError10 = new KwSdk$LoadError("KWLE_NOT_INSTALL_HASLOAD", 10, 1010);
       KwSdk$LoadError.KWLE_NOT_INSTALL_HASLOAD = loadError10;
       KwSdk$LoadError loadError11 = new KwSdk$LoadError("KWLE_JUMP_OLD_VERSION", 11, 1011);
       KwSdk$LoadError.KWLE_JUMP_OLD_VERSION = loadError11;
       KwSdk$LoadError loadError12 = new KwSdk$LoadError("KWLE_NOT_INSTALL_HASLOAD_ABI", 12, 1012);
       KwSdk$LoadError.KWLE_NOT_INSTALL_HASLOAD_ABI = loadError12;
       KwSdk$LoadError loadError13 = loadError12;
       KwSdk$LoadError loadError14 = new KwSdk$LoadError("KWLE_NOT_INSTALL_2TO5", 13, 1013);
       KwSdk$LoadError.KWLE_NOT_INSTALL_2TO5 = loadError14;
       KwSdk$LoadError loadError15 = loadError14;
       loadError12 = new KwSdk$LoadError("KWLE_NOT_INSTALL_6TON", 14, 1014);
       KwSdk$LoadError.KWLE_NOT_INSTALL_6TON = loadError12;
       KwSdk$LoadError[] loadErrorArr = new KwSdk$LoadError[15];
       loadErrorArr[0] = loadError;
       loadErrorArr[1] = loadError1;
       loadErrorArr[2] = loadError2;
       loadErrorArr[3] = loadError3;
       loadErrorArr[4] = loadError4;
       loadErrorArr[5] = loadError5;
       loadErrorArr[6] = loadError6;
       loadErrorArr[7] = loadError7;
       loadErrorArr[8] = loadError8;
       loadErrorArr[9] = loadError9;
       loadErrorArr[10] = loadError10;
       loadErrorArr[11] = loadError11;
       loadErrorArr[12] = loadError13;
       loadErrorArr[13] = loadError15;
       loadErrorArr[14] = loadError12;
       KwSdk$LoadError.$VALUES = loadErrorArr;
    }
    public void KwSdk$LoadError(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static KwSdk$LoadError valueOf(String p0){
       return Enum.valueOf(KwSdk$LoadError.class, p0);
    }
    public static KwSdk$LoadError[] values(){
       return KwSdk$LoadError.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
