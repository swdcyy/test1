package com.kwai.video.ksuploaderkit.apicenter.MediaCloudApiRequest$2;
import com.kwai.video.ksuploaderkit.apicenter.ApiManager$TokenType;
import java.lang.Enum;

public class MediaCloudApiRequest$2	// class@000998
{
    public static final int[] $SwitchMap$com$kwai$video$ksuploaderkit$apicenter$ApiManager$TokenType;

    static {
       int[] ointArray = new int[ApiManager$TokenType.values().length];
       try{
          MediaCloudApiRequest$2.$SwitchMap$com$kwai$video$ksuploaderkit$apicenter$ApiManager$TokenType = ointArray;
          ointArray[ApiManager$TokenType.Image.ordinal()] = 1;
          try{
             MediaCloudApiRequest$2.$SwitchMap$com$kwai$video$ksuploaderkit$apicenter$ApiManager$TokenType[ApiManager$TokenType.Cover.ordinal()] = 2;
             try{
                MediaCloudApiRequest$2.$SwitchMap$com$kwai$video$ksuploaderkit$apicenter$ApiManager$TokenType[ApiManager$TokenType.Video.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
