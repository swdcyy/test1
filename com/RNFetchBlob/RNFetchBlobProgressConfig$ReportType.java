package com.RNFetchBlob.RNFetchBlobProgressConfig$ReportType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RNFetchBlobProgressConfig$ReportType extends Enum	// class@000d57
{
    public static final RNFetchBlobProgressConfig$ReportType[] $VALUES;
    public static final RNFetchBlobProgressConfig$ReportType Download;
    public static final RNFetchBlobProgressConfig$ReportType Upload;

    static {
       RNFetchBlobProgressConfig$ReportType reportType = new RNFetchBlobProgressConfig$ReportType("Upload", 0);
       RNFetchBlobProgressConfig$ReportType.Upload = reportType;
       RNFetchBlobProgressConfig$ReportType reportType1 = new RNFetchBlobProgressConfig$ReportType("Download", 1);
       RNFetchBlobProgressConfig$ReportType.Download = reportType1;
       RNFetchBlobProgressConfig$ReportType[] reportTypeAr = new RNFetchBlobProgressConfig$ReportType[]{reportType,reportType1};
       RNFetchBlobProgressConfig$ReportType.$VALUES = reportTypeAr;
    }
    public void RNFetchBlobProgressConfig$ReportType(String p0,int p1){
       super(p0, p1);
    }
    public static RNFetchBlobProgressConfig$ReportType valueOf(String p0){
       return Enum.valueOf(RNFetchBlobProgressConfig$ReportType.class, p0);
    }
    public static RNFetchBlobProgressConfig$ReportType[] values(){
       return RNFetchBlobProgressConfig$ReportType.$VALUES.clone();
    }
}
