package com.RNFetchBlob.RNFetchBlobReq$ResponseFormat;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RNFetchBlobReq$ResponseFormat extends Enum	// class@000d5c
{
    public static final RNFetchBlobReq$ResponseFormat[] $VALUES;
    public static final RNFetchBlobReq$ResponseFormat Auto;
    public static final RNFetchBlobReq$ResponseFormat BASE64;
    public static final RNFetchBlobReq$ResponseFormat UTF8;

    static {
       RNFetchBlobReq$ResponseFormat responseForm = new RNFetchBlobReq$ResponseFormat("Auto", 0);
       RNFetchBlobReq$ResponseFormat.Auto = responseForm;
       RNFetchBlobReq$ResponseFormat responseForm1 = new RNFetchBlobReq$ResponseFormat("UTF8", 1);
       RNFetchBlobReq$ResponseFormat.UTF8 = responseForm1;
       RNFetchBlobReq$ResponseFormat responseForm2 = new RNFetchBlobReq$ResponseFormat("BASE64", 2);
       RNFetchBlobReq$ResponseFormat.BASE64 = responseForm2;
       RNFetchBlobReq$ResponseFormat[] responseForm3 = new RNFetchBlobReq$ResponseFormat[]{responseForm,responseForm1,responseForm2};
       RNFetchBlobReq$ResponseFormat.$VALUES = responseForm3;
    }
    public void RNFetchBlobReq$ResponseFormat(String p0,int p1){
       super(p0, p1);
    }
    public static RNFetchBlobReq$ResponseFormat valueOf(String p0){
       return Enum.valueOf(RNFetchBlobReq$ResponseFormat.class, p0);
    }
    public static RNFetchBlobReq$ResponseFormat[] values(){
       return RNFetchBlobReq$ResponseFormat.$VALUES.clone();
    }
}
