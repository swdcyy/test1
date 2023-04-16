package com.RNFetchBlob.RNFetchBlobReq$RequestType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RNFetchBlobReq$RequestType extends Enum	// class@000d5b
{
    public static final RNFetchBlobReq$RequestType[] $VALUES;
    public static final RNFetchBlobReq$RequestType AsIs;
    public static final RNFetchBlobReq$RequestType Form;
    public static final RNFetchBlobReq$RequestType Others;
    public static final RNFetchBlobReq$RequestType SingleFile;
    public static final RNFetchBlobReq$RequestType WithoutBody;

    static {
       RNFetchBlobReq$RequestType requestType = new RNFetchBlobReq$RequestType("Form", 0);
       RNFetchBlobReq$RequestType.Form = requestType;
       RNFetchBlobReq$RequestType requestType1 = new RNFetchBlobReq$RequestType("SingleFile", 1);
       RNFetchBlobReq$RequestType.SingleFile = requestType1;
       RNFetchBlobReq$RequestType requestType2 = new RNFetchBlobReq$RequestType("AsIs", 2);
       RNFetchBlobReq$RequestType.AsIs = requestType2;
       RNFetchBlobReq$RequestType requestType3 = new RNFetchBlobReq$RequestType("WithoutBody", 3);
       RNFetchBlobReq$RequestType.WithoutBody = requestType3;
       RNFetchBlobReq$RequestType requestType4 = new RNFetchBlobReq$RequestType("Others", 4);
       RNFetchBlobReq$RequestType.Others = requestType4;
       RNFetchBlobReq$RequestType[] requestTypeA = new RNFetchBlobReq$RequestType[]{requestType,requestType1,requestType2,requestType3,requestType4};
       RNFetchBlobReq$RequestType.$VALUES = requestTypeA;
    }
    public void RNFetchBlobReq$RequestType(String p0,int p1){
       super(p0, p1);
    }
    public static RNFetchBlobReq$RequestType valueOf(String p0){
       return Enum.valueOf(RNFetchBlobReq$RequestType.class, p0);
    }
    public static RNFetchBlobReq$RequestType[] values(){
       return RNFetchBlobReq$RequestType.$VALUES.clone();
    }
}
