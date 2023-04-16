package com.kwai.video.ksuploaderkit.uploader.IUploader$1;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;
import java.lang.Enum;

public class IUploader$1	// class@0009ce
{
    public static final int[] $SwitchMap$com$kwai$video$ksuploaderkit$uploader$IUploader$UploadStatus;

    static {
       int[] ointArray = new int[IUploader$UploadStatus.values().length];
       try{
          IUploader$1.$SwitchMap$com$kwai$video$ksuploaderkit$uploader$IUploader$UploadStatus = ointArray;
          ointArray[IUploader$UploadStatus.Resume.ordinal()] = 1;
          try{
             IUploader$1.$SwitchMap$com$kwai$video$ksuploaderkit$uploader$IUploader$UploadStatus[IUploader$UploadStatus.Pause.ordinal()] = 2;
             try{
                IUploader$1.$SwitchMap$com$kwai$video$ksuploaderkit$uploader$IUploader$UploadStatus[IUploader$UploadStatus.Cancel.ordinal()] = 3;
                try{
                   IUploader$1.$SwitchMap$com$kwai$video$ksuploaderkit$uploader$IUploader$UploadStatus[IUploader$UploadStatus.Uploading.ordinal()] = 4;
                   try{
                      IUploader$1.$SwitchMap$com$kwai$video$ksuploaderkit$uploader$IUploader$UploadStatus[IUploader$UploadStatus.Finish.ordinal()] = 5;
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
