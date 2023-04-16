package com.yxcorp.gifshow.util.resource.ResourceDownloadProgressHelper$DownloadID;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ResourceDownloadProgressHelper$DownloadID extends Enum	// class@000cd7
{
    public static final ResourceDownloadProgressHelper$DownloadID[] $VALUES;
    public static final ResourceDownloadProgressHelper$DownloadID ASSISTANT_ID;
    public static final ResourceDownloadProgressHelper$DownloadID BEAUTY_DOWNLOAD_ID;
    public static final ResourceDownloadProgressHelper$DownloadID BODY_DOWNLOAD_ID;
    public static final ResourceDownloadProgressHelper$DownloadID MAKEUP_DOWNLOAD_ID;
    public static final ResourceDownloadProgressHelper$DownloadID RECORD_PRETTIFY_RECO;

    static {
       ResourceDownloadProgressHelper$DownloadID uDownloadID = new ResourceDownloadProgressHelper$DownloadID("ASSISTANT_ID", 0);
       ResourceDownloadProgressHelper$DownloadID.ASSISTANT_ID = uDownloadID;
       ResourceDownloadProgressHelper$DownloadID uDownloadID1 = new ResourceDownloadProgressHelper$DownloadID("BEAUTY_DOWNLOAD_ID", 1);
       ResourceDownloadProgressHelper$DownloadID.BEAUTY_DOWNLOAD_ID = uDownloadID1;
       ResourceDownloadProgressHelper$DownloadID uDownloadID2 = new ResourceDownloadProgressHelper$DownloadID("MAKEUP_DOWNLOAD_ID", 2);
       ResourceDownloadProgressHelper$DownloadID.MAKEUP_DOWNLOAD_ID = uDownloadID2;
       ResourceDownloadProgressHelper$DownloadID uDownloadID3 = new ResourceDownloadProgressHelper$DownloadID("BODY_DOWNLOAD_ID", 3);
       ResourceDownloadProgressHelper$DownloadID.BODY_DOWNLOAD_ID = uDownloadID3;
       ResourceDownloadProgressHelper$DownloadID uDownloadID4 = new ResourceDownloadProgressHelper$DownloadID("RECORD_PRETTIFY_RECO", 4);
       ResourceDownloadProgressHelper$DownloadID.RECORD_PRETTIFY_RECO = uDownloadID4;
       ResourceDownloadProgressHelper$DownloadID[] uDownloadIDA = new ResourceDownloadProgressHelper$DownloadID[]{uDownloadID,uDownloadID1,uDownloadID2,uDownloadID3,uDownloadID4};
       ResourceDownloadProgressHelper$DownloadID.$VALUES = uDownloadIDA;
    }
    public void ResourceDownloadProgressHelper$DownloadID(String p0,int p1){
       super(p0, p1);
    }
    public static ResourceDownloadProgressHelper$DownloadID valueOf(String p0){
       return Enum.valueOf(ResourceDownloadProgressHelper$DownloadID.class, p0);
    }
    public static ResourceDownloadProgressHelper$DownloadID[] values(){
       return ResourceDownloadProgressHelper$DownloadID.$VALUES.clone();
    }
}
