package com.RNFetchBlob.RNFetchBlobReq$ResponseType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RNFetchBlobReq$ResponseType extends Enum	// class@000d5d
{
    public static final RNFetchBlobReq$ResponseType[] $VALUES;
    public static final RNFetchBlobReq$ResponseType FileStorage;
    public static final RNFetchBlobReq$ResponseType KeepInMemory;

    static {
       RNFetchBlobReq$ResponseType responseType = new RNFetchBlobReq$ResponseType("KeepInMemory", 0);
       RNFetchBlobReq$ResponseType.KeepInMemory = responseType;
       RNFetchBlobReq$ResponseType responseType1 = new RNFetchBlobReq$ResponseType("FileStorage", 1);
       RNFetchBlobReq$ResponseType.FileStorage = responseType1;
       RNFetchBlobReq$ResponseType[] responseType2 = new RNFetchBlobReq$ResponseType[]{responseType,responseType1};
       RNFetchBlobReq$ResponseType.$VALUES = responseType2;
    }
    public void RNFetchBlobReq$ResponseType(String p0,int p1){
       super(p0, p1);
    }
    public static RNFetchBlobReq$ResponseType valueOf(String p0){
       return Enum.valueOf(RNFetchBlobReq$ResponseType.class, p0);
    }
    public static RNFetchBlobReq$ResponseType[] values(){
       return RNFetchBlobReq$ResponseType.$VALUES.clone();
    }
}
