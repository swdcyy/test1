package com.kwai.video.clipkit.cape.CapeExportParams;
import java.lang.Object;

public class CapeExportParams	// class@001a58
{
    public int capeModelIndex;
    public long minHwBitrate;
    public long minSwBitrate;
    public int useUploadDecision;

    public void CapeExportParams(){
       super();
       this.capeModelIndex = -1;
       this.minSwBitrate = 0;
       this.minHwBitrate = 0;
       this.useUploadDecision = 0;
    }
}
