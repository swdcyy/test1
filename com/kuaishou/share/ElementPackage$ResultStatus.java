package com.kuaishou.share.ElementPackage$ResultStatus;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.share.ElementPackage$ResultStatus$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.share.ElementPackage$ResultStatus$b;
import java.lang.Class;
import java.lang.Object;
import java.lang.IllegalArgumentException;

public final class ElementPackage$ResultStatus extends Enum implements Internal$EnumLite	// class@000f1d
{
    public final int value;
    public static final ElementPackage$ResultStatus[] $VALUES;
    public static final ElementPackage$ResultStatus CANCEL;
    public static final ElementPackage$ResultStatus FAILED;
    public static final ElementPackage$ResultStatus START;
    public static final ElementPackage$ResultStatus SUCCEED;
    public static final ElementPackage$ResultStatus UNKNOW;
    public static final ElementPackage$ResultStatus UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       ElementPackage$ResultStatus resultStatus = new ElementPackage$ResultStatus("UNKNOW", 0, 0);
       ElementPackage$ResultStatus.UNKNOW = resultStatus;
       ElementPackage$ResultStatus resultStatus1 = new ElementPackage$ResultStatus("START", 1, 1);
       ElementPackage$ResultStatus.START = resultStatus1;
       ElementPackage$ResultStatus resultStatus2 = new ElementPackage$ResultStatus("SUCCEED", 2, 2);
       ElementPackage$ResultStatus.SUCCEED = resultStatus2;
       ElementPackage$ResultStatus resultStatus3 = new ElementPackage$ResultStatus("FAILED", 3, 3);
       ElementPackage$ResultStatus.FAILED = resultStatus3;
       ElementPackage$ResultStatus resultStatus4 = new ElementPackage$ResultStatus("CANCEL", 4, 4);
       ElementPackage$ResultStatus.CANCEL = resultStatus4;
       ElementPackage$ResultStatus resultStatus5 = new ElementPackage$ResultStatus("UNRECOGNIZED", 5, -1);
       ElementPackage$ResultStatus.UNRECOGNIZED = resultStatus5;
       ElementPackage$ResultStatus[] resultStatus6 = new ElementPackage$ResultStatus[]{resultStatus,resultStatus1,resultStatus2,resultStatus3,resultStatus4,resultStatus5};
       ElementPackage$ResultStatus.$VALUES = resultStatus6;
       ElementPackage$ResultStatus.internalValueMap = new ElementPackage$ResultStatus$a();
    }
    public void ElementPackage$ResultStatus(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ElementPackage$ResultStatus forNumber(int p0){
       if (!p0) {
          return ElementPackage$ResultStatus.UNKNOW;
       }
       if (p0 == 1) {
          return ElementPackage$ResultStatus.START;
       }
       if (p0 == 2) {
          return ElementPackage$ResultStatus.SUCCEED;
       }
       if (p0 == 3) {
          return ElementPackage$ResultStatus.FAILED;
       }
       if (p0 != 4) {
          return null;
       }
       return ElementPackage$ResultStatus.CANCEL;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return ElementPackage$ResultStatus.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return ElementPackage$ResultStatus$b.a;
    }
    public static ElementPackage$ResultStatus valueOf(int p0){
       return ElementPackage$ResultStatus.forNumber(p0);
    }
    public static ElementPackage$ResultStatus valueOf(String p0){
       return Enum.valueOf(ElementPackage$ResultStatus.class, p0);
    }
    public static ElementPackage$ResultStatus[] values(){
       return ElementPackage$ResultStatus.$VALUES.clone();
    }
    public final int getNumber(){
       if (this != ElementPackage$ResultStatus.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
