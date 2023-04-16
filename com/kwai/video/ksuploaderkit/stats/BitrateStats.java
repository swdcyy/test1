package com.kwai.video.ksuploaderkit.stats.BitrateStats;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.System;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BitrateType;

public class BitrateStats	// class@0009be
{
    public int mAverageBitrate;
    public long mAverageUploadSizeStart;
    public long mAverageUploadTimeStart;
    public int mInstantBitrate;
    public long mInstantUploadSizeStart;
    public long mInstantUploadTimeStart;
    public long mSentDuration;
    public long mSentFileSize;
    public static int INSTANT_INVERVAL = 500;

    public void BitrateStats(){
       super();
    }
    public static void setInstantInverval(int p0){
       BitrateStats.INSTANT_INVERVAL = p0;
    }
    public void finish(long p0){
       BitrateStats uBitrateStat = BitrateStats.class;
       if (PatchProxy.isSupport(uBitrateStat) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uBitrateStat, "2")) {
          return;
       }
       if (this.mAverageUploadTimeStart) {
          long l = this.mSentDuration + (System.currentTimeMillis() - this.mAverageUploadTimeStart);
          this.mSentDuration = l;
          long l1 = this.mSentFileSize + (p0 - this.mAverageUploadSizeStart);
          this.mSentFileSize = l1;
          double d = (double)l1;
          this.mAverageBitrate = (int)((d * 8.00f) / (double)l);
       }
       this.mInstantUploadTimeStart = 0;
       this.mAverageUploadTimeStart = 0;
       return;
    }
    public int getBitrate(KSUploaderKitCommon$BitrateType p0){
       if (p0 != null) {
          if (KSUploaderKitCommon$BitrateType.Instant == p0) {
             return this.mInstantBitrate;
          }else if(KSUploaderKitCommon$BitrateType.Average == p0){
             return this.mAverageBitrate;
          }
       }
       return 0;
    }
    public void setSentSize(long p0){
       BitrateStats uBitrateStat = BitrateStats.class;
       if (PatchProxy.isSupport(uBitrateStat) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uBitrateStat, "3")) {
          return;
       }
       long l = System.currentTimeMillis();
       BitrateStats tmInstantUpl = this.mInstantUploadTimeStart;
       if ((l - tmInstantUpl) - (long)BitrateStats.INSTANT_INVERVAL >= 0 && tmInstantUpl > 0) {
          long l1 = l - tmInstantUpl;
          long l2 = p0 - this.mInstantUploadSizeStart;
          if (l1 > 0 && l2 >= 0) {
             this.mInstantBitrate = (int)(((double)l2 * 8.00f) / (double)l1);
          }
          this.mInstantUploadTimeStart = l;
          this.mInstantUploadSizeStart = p0;
          l1 = this.mSentDuration + (l - this.mAverageUploadTimeStart);
          l = this.mSentFileSize + (p0 - this.mAverageUploadSizeStart);
          if (l1 > 0 && l >= 0) {
             this.mAverageBitrate = (int)(((double)l * 8.00f) / (double)l1);
          }
       }
    label_0062 :
       return;
    }
    public void start(long p0){
       BitrateStats uBitrateStat = BitrateStats.class;
       if (PatchProxy.isSupport(uBitrateStat) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uBitrateStat, "1")) {
          return;
       }
       long l = System.currentTimeMillis();
       this.mAverageUploadTimeStart = l;
       this.mAverageUploadSizeStart = p0;
       this.mInstantUploadTimeStart = l;
       this.mInstantUploadSizeStart = p0;
       return;
    }
}
