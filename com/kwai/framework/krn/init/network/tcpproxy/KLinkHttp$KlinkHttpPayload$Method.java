package com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$Method;
import com.google.protobuf.Internal$EnumLite;
import java.lang.Enum;
import java.lang.String;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$Method$a;
import com.google.protobuf.Internal$EnumLiteMap;
import com.google.protobuf.Internal$EnumVerifier;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$Method$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalArgumentException;

public final class KLinkHttp$KlinkHttpPayload$Method extends Enum implements Internal$EnumLite	// class@0015f2
{
    public final int value;
    public static final KLinkHttp$KlinkHttpPayload$Method[] $VALUES;
    public static final KLinkHttp$KlinkHttpPayload$Method UNRECOGNIZED;
    public static final Internal$EnumLiteMap internalValueMap;
    public static final KLinkHttp$KlinkHttpPayload$Method kDel;
    public static final KLinkHttp$KlinkHttpPayload$Method kGet;
    public static final KLinkHttp$KlinkHttpPayload$Method kHead;
    public static final KLinkHttp$KlinkHttpPayload$Method kOptions;
    public static final KLinkHttp$KlinkHttpPayload$Method kPatch;
    public static final KLinkHttp$KlinkHttpPayload$Method kPost;
    public static final KLinkHttp$KlinkHttpPayload$Method kPut;
    public static final KLinkHttp$KlinkHttpPayload$Method kUnknown;

    static {
       KLinkHttp$KlinkHttpPayload$Method klinkHttpPay = new KLinkHttp$KlinkHttpPayload$Method("kUnknown", 0, 0);
       KLinkHttp$KlinkHttpPayload$Method.kUnknown = klinkHttpPay;
       KLinkHttp$KlinkHttpPayload$Method klinkHttpPay1 = new KLinkHttp$KlinkHttpPayload$Method("kGet", 1, 1);
       KLinkHttp$KlinkHttpPayload$Method.kGet = klinkHttpPay1;
       KLinkHttp$KlinkHttpPayload$Method klinkHttpPay2 = new KLinkHttp$KlinkHttpPayload$Method("kPost", 2, 2);
       KLinkHttp$KlinkHttpPayload$Method.kPost = klinkHttpPay2;
       KLinkHttp$KlinkHttpPayload$Method klinkHttpPay3 = new KLinkHttp$KlinkHttpPayload$Method("kPut", 3, 3);
       KLinkHttp$KlinkHttpPayload$Method.kPut = klinkHttpPay3;
       KLinkHttp$KlinkHttpPayload$Method klinkHttpPay4 = new KLinkHttp$KlinkHttpPayload$Method("kPatch", 4, 4);
       KLinkHttp$KlinkHttpPayload$Method.kPatch = klinkHttpPay4;
       KLinkHttp$KlinkHttpPayload$Method klinkHttpPay5 = new KLinkHttp$KlinkHttpPayload$Method("kDel", 5, 5);
       KLinkHttp$KlinkHttpPayload$Method.kDel = klinkHttpPay5;
       KLinkHttp$KlinkHttpPayload$Method klinkHttpPay6 = new KLinkHttp$KlinkHttpPayload$Method("kHead", 6, 6);
       KLinkHttp$KlinkHttpPayload$Method.kHead = klinkHttpPay6;
       KLinkHttp$KlinkHttpPayload$Method klinkHttpPay7 = new KLinkHttp$KlinkHttpPayload$Method("kOptions", 7, 7);
       KLinkHttp$KlinkHttpPayload$Method.kOptions = klinkHttpPay7;
       KLinkHttp$KlinkHttpPayload$Method klinkHttpPay8 = new KLinkHttp$KlinkHttpPayload$Method("UNRECOGNIZED", 8, -1);
       KLinkHttp$KlinkHttpPayload$Method.UNRECOGNIZED = klinkHttpPay8;
       KLinkHttp$KlinkHttpPayload$Method[] klinkHttpPay9 = new KLinkHttp$KlinkHttpPayload$Method[9];
       klinkHttpPay9[0] = klinkHttpPay;
       klinkHttpPay9[1] = klinkHttpPay1;
       klinkHttpPay9[2] = klinkHttpPay2;
       klinkHttpPay9[3] = klinkHttpPay3;
       klinkHttpPay9[4] = klinkHttpPay4;
       klinkHttpPay9[5] = klinkHttpPay5;
       klinkHttpPay9[6] = klinkHttpPay6;
       klinkHttpPay9[7] = klinkHttpPay7;
       klinkHttpPay9[8] = klinkHttpPay8;
       KLinkHttp$KlinkHttpPayload$Method.$VALUES = klinkHttpPay9;
       KLinkHttp$KlinkHttpPayload$Method.internalValueMap = new KLinkHttp$KlinkHttpPayload$Method$a();
    }
    public void KLinkHttp$KlinkHttpPayload$Method(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static KLinkHttp$KlinkHttpPayload$Method forNumber(int p0){
       switch (p0){
           case 0:
             return KLinkHttp$KlinkHttpPayload$Method.kUnknown;
           case 1:
             return KLinkHttp$KlinkHttpPayload$Method.kGet;
           case 2:
             return KLinkHttp$KlinkHttpPayload$Method.kPost;
           case 3:
             return KLinkHttp$KlinkHttpPayload$Method.kPut;
           case 4:
             return KLinkHttp$KlinkHttpPayload$Method.kPatch;
           case 5:
             return KLinkHttp$KlinkHttpPayload$Method.kDel;
           case 6:
             return KLinkHttp$KlinkHttpPayload$Method.kHead;
           case 7:
             return KLinkHttp$KlinkHttpPayload$Method.kOptions;
           default:
             return null;
       }
    }
    public static Internal$EnumLiteMap internalGetValueMap(){
       return KLinkHttp$KlinkHttpPayload$Method.internalValueMap;
    }
    public static Internal$EnumVerifier internalGetVerifier(){
       return KLinkHttp$KlinkHttpPayload$Method$b.a;
    }
    public static KLinkHttp$KlinkHttpPayload$Method valueOf(int p0){
       return KLinkHttp$KlinkHttpPayload$Method.forNumber(p0);
    }
    public static KLinkHttp$KlinkHttpPayload$Method valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KLinkHttp$KlinkHttpPayload$Method.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KLinkHttp$KlinkHttpPayload$Method.class, p0);
    }
    public static KLinkHttp$KlinkHttpPayload$Method[] values(){
       Object obj = PatchProxy.apply(null, null, KLinkHttp$KlinkHttpPayload$Method.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KLinkHttp$KlinkHttpPayload$Method.$VALUES.clone();
    }
    public final int getNumber(){
       Object obj = PatchProxy.apply(null, this, KLinkHttp$KlinkHttpPayload$Method.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this != KLinkHttp$KlinkHttpPayload$Method.UNRECOGNIZED) {
          return this.value;
       }
       throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }
}
