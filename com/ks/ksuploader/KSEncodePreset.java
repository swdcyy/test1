package com.ks.ksuploader.KSEncodePreset;
import java.lang.Object;

public class KSEncodePreset	// class@00074c
{
    public long fileSize;
    public int transcodeTimeCostMs;
    public int type;
    public int videoDurationMs;
    public int videoFragmentDurationMs;

    public void KSEncodePreset(int p0,long p1,int p2,int p3,int p4){
       super();
       this.type = p0;
       this.fileSize = p1;
       this.transcodeTimeCostMs = p2;
       this.videoDurationMs = p3;
       this.videoFragmentDurationMs = p4;
    }
}
