package com.kwai.library.dynamic_prefetcher.data.config.ExpandOffsetConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;

public class ExpandOffsetConfig	// class@00081b
{
    public int[] mExpandVolume;
    public int mMaxDownloadCnt;
    public int[] mPhotoType;
    public int mStartOffset;

    public void ExpandOffsetConfig(){
       super();
    }
    public String toString(){
       return "ExpandOffsetConfig{mStartOffset="+this.mStartOffset+", mPhotoType="+Arrays.toString(this.mPhotoType)+", mMaxDownloadCnt="+this.mMaxDownloadCnt+", mExpandVolume = "+Arrays.toString(this.mExpandVolume)+'}';
    }
}
