package com.kwai.video.ksuploaderkit.uploader.HttpUploader$2;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadChannelType;
import java.lang.Enum;

public class HttpUploader$2	// class@0009cc
{
    public static final int[] $SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType;

    static {
       int[] ointArray = new int[KSUploaderKitCommon$UploadChannelType.values().length];
       try{
          HttpUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType = ointArray;
          ointArray[KSUploaderKitCommon$UploadChannelType.Single.ordinal()] = 1;
          try{
             HttpUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[KSUploaderKitCommon$UploadChannelType.MultiSerial.ordinal()] = 2;
             try{
                HttpUploader$2.$SwitchMap$com$kwai$video$ksuploaderkit$KSUploaderKitCommon$UploadChannelType[KSUploaderKitCommon$UploadChannelType.MultiConcurrent.ordinal()] = 3;
             }catch(java.lang.NoSuchFieldError e0){
             }
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
