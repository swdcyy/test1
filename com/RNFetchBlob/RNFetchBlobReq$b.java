package com.RNFetchBlob.RNFetchBlobReq$b;
import com.RNFetchBlob.RNFetchBlobReq$ResponseType;
import java.lang.Enum;
import com.RNFetchBlob.RNFetchBlobReq$RequestType;

public class RNFetchBlobReq$b	// class@000d5f
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[RNFetchBlobReq$ResponseType.values().length];
       RNFetchBlobReq$b.b = ointArray;
       try{
          int i = 1;
          ointArray[RNFetchBlobReq$ResponseType.KeepInMemory.ordinal()] = i;
          int i1 = 2;
          try{
             RNFetchBlobReq$b.b[RNFetchBlobReq$ResponseType.FileStorage.ordinal()] = i1;
             int[] ointArray1 = new int[RNFetchBlobReq$RequestType.values().length];
             try{
                RNFetchBlobReq$b.a = ointArray1;
                ointArray1[RNFetchBlobReq$RequestType.SingleFile.ordinal()] = i;
                try{
                   RNFetchBlobReq$b.a[RNFetchBlobReq$RequestType.AsIs.ordinal()] = e0;
                   try{
                      RNFetchBlobReq$b.a[RNFetchBlobReq$RequestType.Form.ordinal()] = 3;
                      try{
                         RNFetchBlobReq$b.a[RNFetchBlobReq$RequestType.WithoutBody.ordinal()] = 4;
                      }catch(java.lang.NoSuchFieldError e0){
                      }
                   }catch(java.lang.NoSuchFieldError e0){
                   }
                }catch(java.lang.NoSuchFieldError e0){
                }
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
