package com.kwai.video.ksuploaderkit.uploader.IUploader;
import java.lang.String;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$BitrateType;
import com.kwai.video.ksuploaderkit.uploader.IUploader$UploadStatus;
import com.kwai.video.ksuploaderkit.uploader.IUploader$TaskEventListener;
import com.kwai.video.ksuploaderkit.config.PublishConfig;
import com.kwai.video.ksuploaderkit.uploader.IUploader$EventListener;
import com.kwai.video.ksuploaderkit.logreporter.LogReporter;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$UploadMode;
import com.kwai.video.ksuploaderkit.uploader.UploadData;
import com.kwai.video.ksuploaderkit.KSUploaderKitSegmentInfo;

public interface abstract IUploader	// class@0009d2
{

    void cancel();
    void cancel(String p0);
    void finishUploadSegment();
    int getBitrate(KSUploaderKitCommon$BitrateType p0);
    int getFailedCount();
    IUploader$UploadStatus getStatus();
    boolean pause();
    boolean pause(String p0);
    void putTaskEventListener(String p0,IUploader$TaskEventListener p1);
    void release();
    boolean resume();
    boolean resume(String p0);
    void setConfig(PublishConfig p0);
    void setEventListener(IUploader$EventListener p0);
    void setLogReporter(LogReporter p0);
    void startCoverUpload(String p0);
    void startUpload(KSUploaderKitCommon$UploadMode p0,String p1,long p2,String p3,boolean p4);
    void startUpload(KSUploaderKitCommon$UploadMode p0,UploadData[] p1);
    void uploadSegment(KSUploaderKitSegmentInfo p0);
}
