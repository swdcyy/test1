package com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.System;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo$Status;
import java.lang.StringBuilder;

public class MultiplePhotosWorkManager$CropWorkInfo	// class@001f03
{
    public final long a;
    public final String[] b;
    public final File c;
    public final List d;
    public MultiplePhotosWorkManager$CropWorkInfo$Status e;

    public void MultiplePhotosWorkManager$CropWorkInfo(File p0,String[] p1){
       super();
       this.d = new ArrayList();
       this.a = System.currentTimeMillis();
       this.b = p1;
       this.c = p0;
       this.e = MultiplePhotosWorkManager$CropWorkInfo$Status.PENDING;
    }
    public long a(){
       return this.a;
    }
    public MultiplePhotosWorkManager$CropWorkInfo$Status b(){
       MultiplePhotosWorkManager$CropWorkInfo te = this.e;
       _monitor_enter(te);
       _monitor_exit(te);
       return this.e;
    }
    public void c(MultiplePhotosWorkManager$CropWorkInfo$Status p0){
       MultiplePhotosWorkManager$CropWorkInfo te = this.e;
       _monitor_enter(te);
       this.e = p0;
       _monitor_exit(te);
    }
    public String toString(){
       return "CropWorkInfo{mWorkId="+this.a+", mOutFolder="+this.c+", mWorkStatus="+this.e+'}';
    }
}
