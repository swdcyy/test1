package com.kwai.video.ksuploaderkit.uploader.RickonUploader$2;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;
import java.lang.Enum;

public class RickonUploader$2	// class@0009d4
{
    public static final int[] $SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType;

    static {
       int[] ointArray = new int[KSUploaderKitCommon$UploadChannelType.values().length];
       try{
          RickonUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType = ointArray;
          ointArray[KSUploaderKitCommon$UploadChannelType.Single.ordinal()] = 1;
          try{
             RickonUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[KSUploaderKitCommon$UploadChannelType.MultiSerial.ordinal()] = 2;
             try{
                RickonUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[KSUploaderKitCommon$UploadChannelType.MultiConcurrent.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
