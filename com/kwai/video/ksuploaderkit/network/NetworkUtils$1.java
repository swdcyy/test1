package com.kwai.video.ksuploaderkit.network.NetworkUtils$1;
import com.kwai.video.ksuploaderkit.network.NetworkUtils$NetErrorCode;
import java.lang.Enum;

public class NetworkUtils$1	// class@0009b3
{
    public static final int[] $SwitchMap$com$kwai$video$ksuploaderkit$network$NetworkUtils$NetErrorCode;

    static {
       int[] ointArray = new int[NetworkUtils$NetErrorCode.values().length];
       try{
          NetworkUtils$1.$SwitchMap$com$kwai$video$ksuploaderkit$network$NetworkUtils$NetErrorCode = ointArray;
          ointArray[NetworkUtils$NetErrorCode.NO_ERROR.ordinal()] = 1;
          try{
             NetworkUtils$1.$SwitchMap$com$kwai$video$ksuploaderkit$network$NetworkUtils$NetErrorCode[NetworkUtils$NetErrorCode.CONNECT_SERVER_FAILED.ordinal()] = 2;
             try{
                NetworkUtils$1.$SwitchMap$com$kwai$video$ksuploaderkit$network$NetworkUtils$NetErrorCode[NetworkUtils$NetErrorCode.NOT2XX_HTTP_CODE.ordinal()] = 3;
                try{
                   NetworkUtils$1.$SwitchMap$com$kwai$video$ksuploaderkit$network$NetworkUtils$NetErrorCode[NetworkUtils$NetErrorCode.RESPONSE_ERROR.ordinal()] = 4;
                   try{
                      NetworkUtils$1.$SwitchMap$com$kwai$video$ksuploaderkit$network$NetworkUtils$NetErrorCode[NetworkUtils$NetErrorCode.HTTP_CODE_3XX.ordinal()] = 5;
                      try{
                         NetworkUtils$1.$SwitchMap$com$kwai$video$ksuploaderkit$network$NetworkUtils$NetErrorCode[NetworkUtils$NetErrorCode.HTTP_CODE_4XX.ordinal()] = 6;
                         try{
                            NetworkUtils$1.$SwitchMap$com$kwai$video$ksuploaderkit$network$NetworkUtils$NetErrorCode[NetworkUtils$NetErrorCode.HTTP_CODE_5XX.ordinal()] = 7;
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
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
