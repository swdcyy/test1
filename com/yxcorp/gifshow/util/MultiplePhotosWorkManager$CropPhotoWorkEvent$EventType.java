package com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType extends Enum	// class@001f00
{
    public static final MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType[] $VALUES;
    public static final MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType Canceled;
    public static final MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType Changed;
    public static final MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType Completed;
    public static final MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType Failed;
    public static final MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType Prepared;

    static {
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType uCropPhotoWo = new MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType("Prepared", 0);
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Prepared = uCropPhotoWo;
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType uCropPhotoWo1 = new MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType("Changed", 1);
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Changed = uCropPhotoWo1;
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType uCropPhotoWo2 = new MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType("Canceled", 2);
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Canceled = uCropPhotoWo2;
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType uCropPhotoWo3 = new MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType("Failed", 3);
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Failed = uCropPhotoWo3;
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType uCropPhotoWo4 = new MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType("Completed", 4);
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.Completed = uCropPhotoWo4;
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType[] uCropPhotoWo5 = new MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType[]{uCropPhotoWo,uCropPhotoWo1,uCropPhotoWo2,uCropPhotoWo3,uCropPhotoWo4};
       MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.$VALUES = uCropPhotoWo5;
    }
    public void MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType(String p0,int p1){
       super(p0, p1);
    }
    public static MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType valueOf(String p0){
       return Enum.valueOf(MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.class, p0);
    }
    public static MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType[] values(){
       return MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType.$VALUES.clone();
    }
}
