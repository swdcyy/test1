package com.kuaishou.protobuf.photo.funnel.EncodeStat$Status;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$Status$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kuaishou.protobuf.photo.funnel.EncodeStat$Status$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalArgumentException;

public final class EncodeStat$Status extends Enum implements Internal$EnumLite	// class@000e18
{
    public final int value;
    public static final EncodeStat$Status[] $VALUES;
    public static final EncodeStat$Status CANCEL;
    public static final EncodeStat$Status FAIL;
    public static final EncodeStat$Status SUCCESS;
    public static final EncodeStat$Status UNKNOWN;
    public static final EncodeStat$Status UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;

    static {
       EncodeStat$Status status = new EncodeStat$Status("UNKNOWN", 0, 0);
       EncodeStat$Status.UNKNOWN = status;
       EncodeStat$Status status1 = new EncodeStat$Status("FAIL", 1, 1);
       EncodeStat$Status.FAIL = status1;
       EncodeStat$Status status2 = new EncodeStat$Status("CANCEL", 2, 2);
       EncodeStat$Status.CANCEL = status2;
       EncodeStat$Status status3 = new EncodeStat$Status("SUCCESS", 3, 3);
       EncodeStat$Status.SUCCESS = status3;
       EncodeStat$Status status4 = new EncodeStat$Status("UNRECOGNIZED", 4, -1);
       EncodeStat$Status.UNRECOGNIZED = status4;
       EncodeStat$Status[] statusArray = new EncodeStat$Status[]{status,status1,status2,status3,status4};
       EncodeStat$Status.$VALUES = statusArray;
       EncodeStat$Status.internalValueMap = new EncodeStat$Status$a();
    }
    public void EncodeStat$Status(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static EncodeStat$Status forNumber(int p0){
       if (!p0) {
          return EncodeStat$Status.UNKNOWN;
       }
       if (p0 == 1) {
          return EncodeStat$Status.FAIL;
       }
       if (p0 == 2) {
          return EncodeStat$Status.CANCEL;
       }
       if (p0 != 3) {
          return null;
       }
       return EncodeStat$Status.SUCCESS;
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return EncodeStat$Status.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return EncodeStat$Status$b.a;
    }
    public static EncodeStat$Status valueOf(int p0){
       return EncodeStat$Status.forNumber(p0);
    }
    public static EncodeStat$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EncodeStat$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EncodeStat$Status.class, p0);
    }
    public static EncodeStat$Status[] values(){
       Object obj = PatchProxy.apply(null, null, EncodeStat$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EncodeStat$Status.$VALUES.clone();
    }
    public final int getNumber(){
       Object obj = PatchProxy.apply(null, this, EncodeStat$Status.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this != EncodeStat$Status.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
