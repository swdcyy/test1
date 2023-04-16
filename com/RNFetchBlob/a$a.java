package com.RNFetchBlob.a$a;
import com.RNFetchBlob.RNFetchBlobReq$RequestType;
import java.lang.Enum;

public class a$a	// class@000d62
{
    public static final int[] a;

    static {
       int[] ointArray = new int[RNFetchBlobReq$RequestType.values().length];
       try{
          a$a.a = ointArray;
          ointArray[RNFetchBlobReq$RequestType.SingleFile.ordinal()] = 1;
          try{
             a$a.a[RNFetchBlobReq$RequestType.AsIs.ordinal()] = 2;
             try{
                a$a.a[RNFetchBlobReq$RequestType.Others.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
