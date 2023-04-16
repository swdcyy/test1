package com.kwai.library.dynamic_prefetcher.data.config.SpecialVolumeConfig;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;

public class SpecialVolumeConfig	// class@00081e
{
    public int mMaxVolume;
    public int[] mPhotoType;

    public void SpecialVolumeConfig(){
       super();
    }
    public String toString(){
       return "SpecialVolumeConfig{photoType="+Arrays.toString(this.mPhotoType)+", maxVolume="+this.mMaxVolume+'}';
    }
}
