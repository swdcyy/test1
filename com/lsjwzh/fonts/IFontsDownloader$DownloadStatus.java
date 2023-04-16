package com.lsjwzh.fonts.IFontsDownloader$DownloadStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class IFontsDownloader$DownloadStatus extends Enum	// class@001476
{
    public static final IFontsDownloader$DownloadStatus[] $VALUES;
    public static final IFontsDownloader$DownloadStatus DOWNLOADED;
    public static final IFontsDownloader$DownloadStatus DOWNLOADING;
    public static final IFontsDownloader$DownloadStatus ERROR;
    public static final IFontsDownloader$DownloadStatus IDLE;

    static {
       IFontsDownloader$DownloadStatus uDownloadSta = new IFontsDownloader$DownloadStatus("IDLE", 0);
       IFontsDownloader$DownloadStatus.IDLE = uDownloadSta;
       IFontsDownloader$DownloadStatus uDownloadSta1 = new IFontsDownloader$DownloadStatus("DOWNLOADING", 1);
       IFontsDownloader$DownloadStatus.DOWNLOADING = uDownloadSta1;
       IFontsDownloader$DownloadStatus uDownloadSta2 = new IFontsDownloader$DownloadStatus("DOWNLOADED", 2);
       IFontsDownloader$DownloadStatus.DOWNLOADED = uDownloadSta2;
       IFontsDownloader$DownloadStatus uDownloadSta3 = new IFontsDownloader$DownloadStatus("ERROR", 3);
       IFontsDownloader$DownloadStatus.ERROR = uDownloadSta3;
       IFontsDownloader$DownloadStatus[] uDownloadSta4 = new IFontsDownloader$DownloadStatus[]{uDownloadSta,uDownloadSta1,uDownloadSta2,uDownloadSta3};
       IFontsDownloader$DownloadStatus.$VALUES = uDownloadSta4;
    }
    public void IFontsDownloader$DownloadStatus(String p0,int p1){
       super(p0, p1);
    }
    public static IFontsDownloader$DownloadStatus valueOf(String p0){
       return Enum.valueOf(IFontsDownloader$DownloadStatus.class, p0);
    }
    public static IFontsDownloader$DownloadStatus[] values(){
       return IFontsDownloader$DownloadStatus.$VALUES.clone();
    }
}
