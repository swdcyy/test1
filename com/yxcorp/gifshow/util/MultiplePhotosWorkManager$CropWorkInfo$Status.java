package com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MultiplePhotosWorkManager$CropWorkInfo$Status extends Enum	// class@001f02
{
    public static final MultiplePhotosWorkManager$CropWorkInfo$Status[] $VALUES;
    public static final MultiplePhotosWorkManager$CropWorkInfo$Status CANCELED;
    public static final MultiplePhotosWorkManager$CropWorkInfo$Status COMPLETE;
    public static final MultiplePhotosWorkManager$CropWorkInfo$Status FAILED;
    public static final MultiplePhotosWorkManager$CropWorkInfo$Status PENDING;
    public static final MultiplePhotosWorkManager$CropWorkInfo$Status PREPARED;

    static {
       MultiplePhotosWorkManager$CropWorkInfo$Status uCropWorkInf = new MultiplePhotosWorkManager$CropWorkInfo$Status("PENDING", 0);
       MultiplePhotosWorkManager$CropWorkInfo$Status.PENDING = uCropWorkInf;
       MultiplePhotosWorkManager$CropWorkInfo$Status uCropWorkInf1 = new MultiplePhotosWorkManager$CropWorkInfo$Status("PREPARED", 1);
       MultiplePhotosWorkManager$CropWorkInfo$Status.PREPARED = uCropWorkInf1;
       MultiplePhotosWorkManager$CropWorkInfo$Status uCropWorkInf2 = new MultiplePhotosWorkManager$CropWorkInfo$Status("COMPLETE", 2);
       MultiplePhotosWorkManager$CropWorkInfo$Status.COMPLETE = uCropWorkInf2;
       MultiplePhotosWorkManager$CropWorkInfo$Status uCropWorkInf3 = new MultiplePhotosWorkManager$CropWorkInfo$Status("FAILED", 3);
       MultiplePhotosWorkManager$CropWorkInfo$Status.FAILED = uCropWorkInf3;
       MultiplePhotosWorkManager$CropWorkInfo$Status uCropWorkInf4 = new MultiplePhotosWorkManager$CropWorkInfo$Status("CANCELED", 4);
       MultiplePhotosWorkManager$CropWorkInfo$Status.CANCELED = uCropWorkInf4;
       MultiplePhotosWorkManager$CropWorkInfo$Status[] uCropWorkInf5 = new MultiplePhotosWorkManager$CropWorkInfo$Status[]{uCropWorkInf,uCropWorkInf1,uCropWorkInf2,uCropWorkInf3,uCropWorkInf4};
       MultiplePhotosWorkManager$CropWorkInfo$Status.$VALUES = uCropWorkInf5;
    }
    public void MultiplePhotosWorkManager$CropWorkInfo$Status(String p0,int p1){
       super(p0, p1);
    }
    public static MultiplePhotosWorkManager$CropWorkInfo$Status valueOf(String p0){
       return Enum.valueOf(MultiplePhotosWorkManager$CropWorkInfo$Status.class, p0);
    }
    public static MultiplePhotosWorkManager$CropWorkInfo$Status[] values(){
       return MultiplePhotosWorkManager$CropWorkInfo$Status.$VALUES.clone();
    }
}
